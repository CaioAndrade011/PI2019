package Classes;

import Modelo.Animais;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AnimaisDao {
    
    private Conexao conexao;

    public AnimaisDao() throws SQLException {
        conexao = Conexao.getIntancia();
    }

    public Animais inserir(Animais animais) throws SQLException {
        String sql = "INSERT INTO animais (nome, especie, raca, clientes_idclientes) "
                + " VALUES (?, ?, ?, ?);";

        PreparedStatement pst = conexao.getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, animais.getNome());
        pst.setString(2, animais.getEspecie());
        pst.setString(3, animais.getRaca());
        pst.setInt(4, animais.getIdCliente());

        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        if (rs.next()) {
            animais.setId(rs.getInt(1));
        }

        rs.close();
        pst.close();

        return animais;
    }
    
    public List<Animais> listar () throws SQLException{
       
       String SQL = "select * from animais";

       PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
       // pst.setString(1, "%" + cidade + "%");    
        ResultSet rs = pst.executeQuery();
        
        List<Animais> lista = new ArrayList<>();
        
        while (rs.next()) {
            Animais animal = new Animais();
            animal.setId(rs.getInt("idanimais"));
            animal.setNome(rs.getString("nome"));
            animal.setEspecie(rs.getString("especie"));
            animal.setRaca(rs.getString("raca"));
            animal.setIdCliente(rs.getInt("clientes_idclientes"));
            
            lista.add(animal);
        }
        
        rs.close();
        pst.close();
        
        return lista;        
    }
    
    public Animais procurar(int id) throws SQLException {
        final String SQL = "SELECT idanimais, nome, especie, raca, clientes_idclientes"
                + " FROM animais WHERE idanimais = ? "; 
       
        
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();
        
        Animais animal = null;
        
        if (rs.next()) {
            animal = new Animais();
            animal.setId(rs.getInt("idanimais"));
            animal.setNome(rs.getString("nome"));
            animal.setEspecie(rs.getString("especie"));
            animal.setRaca(rs.getString("raca"));
            animal.setIdCliente(rs.getInt("clientes_idclientes"));
        }
        
        rs.close();
        pst.close();
        
        return animal;
    }
    
    public Animais alterar(Animais animais) throws SQLException {
        final String SQL = "UPDATE animais set"
                + " nome = ?,"
                + " especie = ?,"
                + " raca = ?,"
                + " clientes_idclientes = ?"
                + " WHERE idanimais = ?";
        
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setString(1, animais.getNome());
        pst.setString(2, animais.getEspecie());
        pst.setString(3, animais.getRaca());
        pst.setInt(4, animais.getIdCliente());
        pst.setInt(5, animais.getId());
        
        pst.executeUpdate();
        pst.close();
        
        return animais;
    }
    
    public boolean excluir(Animais animais) throws SQLException {
        final String SQL = "DELETE FROM animais WHERE idanimais = ?";
        
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setInt(1, animais.getId());
        
        int n = pst.executeUpdate();
        
        pst.close();
        
        return n > 0;
    }  
    
    public List<Animais> listarTabela (String nome) throws SQLException{
       
       String SQL = "select * from animais where nome like ? ";

       PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setString(1, "%" + nome + "%");    
        ResultSet rs = pst.executeQuery();
        
        List<Animais> lista = new ArrayList<>();
        
        while (rs.next()) {
            Animais agendamento = new Animais();
            agendamento.setId(rs.getInt("idanimais"));
            agendamento.setNome(rs.getString("nome"));
            agendamento.setEspecie(rs.getString("especie"));
            agendamento.setRaca(rs.getString("raca"));
            
            lista.add(agendamento);
        }
        
        rs.close();
        pst.close();
        
        return lista;        
    }
}
