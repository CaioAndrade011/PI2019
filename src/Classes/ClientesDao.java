package Classes;

import Modelo.Clientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClientesDao {

    private Conexao conexao;

    public ClientesDao() throws SQLException {
        conexao = Conexao.getIntancia();
    }

    public Clientes inserir(Clientes clientes) throws SQLException {
        String sql = "INSERT INTO clientes (nome, cpf, sobrenome, telefone, endereco_idendereco) "
                + " VALUES (?, ?, ?, ?, ?);";

        PreparedStatement pst = conexao.getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, clientes.getNome());
        pst.setString(2, clientes.getCpf());
        pst.setString(3, clientes.getSobrenome());
        pst.setString(4, clientes.getTelefone());
        pst.setInt(5, clientes.getIdEndereco());

        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        if (rs.next()) {
            clientes.setId(rs.getInt(1));
        }

        rs.close();
        pst.close();

        return clientes;
    }
    
    public List<Clientes> listar () throws SQLException{
       
       String SQL = "select idclientes, nome, telefone from clientes";

       PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
       // pst.setString(1, "%" + cidade + "%");    
        ResultSet rs = pst.executeQuery();
        
        List<Clientes> lista = new ArrayList<>();
        
        while (rs.next()) {
            Clientes cliente = new Clientes();
            cliente.setId(rs.getInt("idclientes"));
            cliente.setNome(rs.getString("nome"));
            cliente.setTelefone(rs.getString("telefone"));
            
            lista.add(cliente);
        }
        
        rs.close();
        pst.close();
        
        return lista;        
    }
    
    public Clientes procurar(int id) throws SQLException {
        final String SQL = "SELECT idclientes, nome, cpf, sobrenome,"
                + " telefone, endereco_idendereco"
                + " FROM clientes WHERE idclientes = ? "; 
       
        
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();
        
        Clientes cliente = null;
        
        if (rs.next()) {
            cliente = new Clientes();
            cliente.setId(rs.getInt("idclientes"));
            cliente.setNome(rs.getString("nome"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setSobrenome(rs.getString("sobrenome"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setIdEndereco(rs.getInt("endereco_idendereco"));
        }
        
        rs.close();
        pst.close();
        
        return cliente;
    }
    
    public Clientes alterar(Clientes clientes) throws SQLException {
        final String SQL = "UPDATE clientes set"
                + " nome = ?,"
                + " cpf = ?,"
                + " sobrenome = ?,"
                + " telefone = ?"
                + " WHERE idclientes = ?";
        
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setString(1, clientes.getNome());
        pst.setString(2, clientes.getCpf());
        pst.setString(3, clientes.getSobrenome());
        pst.setString(4, clientes.getTelefone());
        pst.setInt(5, clientes.getId());
        
        pst.executeUpdate();
        pst.close();
        
        return clientes;
    }
    
    public boolean excluir(Clientes clientes) throws SQLException {
        final String SQL = "DELETE FROM clientes WHERE idclientes = ?";
        
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setInt(1, clientes.getId());
        
        int n = pst.executeUpdate();
        
        pst.close();
        
        return n > 0;
    }  
    
    public List<Clientes> listarTabela (String nome) throws SQLException{
       
       String SQL = "select idclientes, nome, telefone from clientes where nome like ? ";

       PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setString(1, "%" + nome + "%");    
        ResultSet rs = pst.executeQuery();
        
        List<Clientes> lista = new ArrayList<>();
        
        while (rs.next()) {
            Clientes clientes = new Clientes();
            clientes.setId(rs.getInt("idclientes"));
            clientes.setNome(rs.getString("nome"));
            clientes.setTelefone(rs.getString("telefone"));
            
            lista.add(clientes);
        }
        
        rs.close();
        pst.close();
        
        return lista;        
    }
    
}