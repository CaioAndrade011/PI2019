package Classes;

import Modelo.Servicos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ServicosDao {
    
    private Conexao conexao;

    public ServicosDao() throws SQLException {
        conexao = Conexao.getIntancia();
    }

    public Servicos inserir(Servicos servico) throws SQLException {
        String sql = "INSERT INTO servicos (nome, valor, descricao) "
                + " VALUES (?, ?, ?);";

        PreparedStatement pst = conexao.getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, servico.getNome());
        pst.setDouble(2, servico.getValor());
        pst.setString(3, servico.getDescricao());
        

        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        if (rs.next()) {
            servico.setId(rs.getInt(1));
        }

        rs.close();
        pst.close();

        return servico;
    }
    
    public List<Servicos> listar () throws SQLException{
       
       String SQL = "select idservicos, nome, valor, descricao from servicos";

       PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
       // pst.setString(1, "%" + cidade + "%");    
        ResultSet rs = pst.executeQuery();
        
        List<Servicos> lista = new ArrayList<>();
        
        while (rs.next()) {
            Servicos servico = new Servicos();
            servico.setId(rs.getInt("idservicos"));
            servico.setNome(rs.getString("nome"));
            servico.setValor(rs.getDouble("valor"));
            servico.setDescricao(rs.getString("descricao"));
            
            lista.add(servico);
        }
        
        rs.close();
        pst.close();
        
        return lista;        
    }
    
    public Servicos alterar(Servicos servicos) throws SQLException {
        final String SQL = "UPDATE servicos set"
                + " nome = ?,"
                + " valor = ?,"
                + " descricao = ? "
                + " WHERE idservicos = ?";
        
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setString(1, servicos.getNome());
        pst.setDouble(2, servicos.getValor());
        pst.setString(3, servicos.getDescricao());
        pst.setInt(4, servicos.getId());
        
        pst.executeUpdate();
        pst.close();
        
        return servicos;
    }
    
    public Servicos procurar(int id) throws SQLException {
        final String SQL = "SELECT idservicos, nome, valor, descricao from servicos WHERE idservicos = ? "; 
               
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();
        
        Servicos servico = null;
        
        if (rs.next()) {
            servico = new Servicos();
            servico.setId(rs.getInt("idservicos"));
            servico.setNome(rs.getString("nome"));
            servico.setValor(rs.getDouble("valor"));
            servico.setDescricao(rs.getString("descricao"));
        }
        
        rs.close();
        pst.close();
        
        return servico;
    }
    
    public boolean excluir(Servicos servicos) throws SQLException {
        final String SQL = "DELETE FROM servicos WHERE idservicos = ?";
        
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setInt(1, servicos.getId());
        
        int n = pst.executeUpdate();
        
        pst.close();
        
        return n > 0;
    }  
    public List<Servicos> listarTabela (String nome) throws SQLException{
       
       String SQL = "select * from servicos where nome like ? ";

       PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setString(1, "%" + nome + "%");    
        ResultSet rs = pst.executeQuery();
        
        List<Servicos> lista = new ArrayList<>();
        
        while (rs.next()) {
            Servicos servicos = new Servicos();
            servicos.setId(rs.getInt("idservicos"));
            servicos.setNome(rs.getString("nome"));
            servicos.setValor(rs.getDouble("valor"));
            servicos.setDescricao(rs.getString("descricao"));
            
            lista.add(servicos);
        }
        
        rs.close();
        pst.close();
        
        return lista;        
    }   
}
