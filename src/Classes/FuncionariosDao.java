package Classes;

import Modelo.Funcionarios;
import com.sun.org.apache.xml.internal.dtm.DTM;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FuncionariosDao {
    
    private Conexao conexao;

    public FuncionariosDao() throws SQLException {
        conexao = Conexao.getIntancia();
    }

    public Funcionarios inserir(Funcionarios funcionarios) throws SQLException {
        String sql = "INSERT INTO funcionarios (nome, cpf, sobrenome, telefone, login, senha, endereco_idendereco) "
                + " VALUES (?, ?, ?, ?, ?, ?, ?);";

        PreparedStatement pst = conexao.getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, funcionarios.getNome());
        pst.setString(2, funcionarios.getCpf());
        pst.setString(3, funcionarios.getSobrenome());
        pst.setString(4, funcionarios.getTelefone());
        pst.setString(5, funcionarios.getLogin());
        pst.setString(6, funcionarios.getSenha());
        pst.setInt(7, funcionarios.getIdEndereco());

        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        if (rs.next()) {
            funcionarios.setId(rs.getInt(1));
        }

        rs.close();
        pst.close();

        return funcionarios;
        
    }
    
    public List<Funcionarios> listar () throws SQLException{
       
       String SQL = "select idfuncionarios, nome, telefone from funcionarios";

       PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
       // pst.setString(1, "%" + cidade + "%");    
        ResultSet rs = pst.executeQuery();
        
        List<Funcionarios> lista = new ArrayList<>();
        
        while (rs.next()) {
            Funcionarios funcionario = new Funcionarios();
            funcionario.setId(rs.getInt("idfuncionarios"));
            funcionario.setNome(rs.getString("nome"));
            funcionario.setTelefone(rs.getString("telefone"));
            
            lista.add(funcionario);
        }
        
        rs.close();
        pst.close();
        
        return lista;        
    }
    
    public Funcionarios procurar(int id) throws SQLException {
        final String SQL = "SELECT idfuncionarios, nome, cpf, sobrenome,"
                + " telefone, login, senha, endereco_idendereco"
                + " FROM funcionarios WHERE idfuncionarios = ? "; 
       
        
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();
        
        Funcionarios funcionario = null;
        
        if (rs.next()) {
            funcionario = new Funcionarios();
            funcionario.setId(rs.getInt("idfuncionarios"));
            funcionario.setNome(rs.getString("nome"));
            funcionario.setCpf(rs.getString("cpf"));
            funcionario.setSobrenome(rs.getString("sobrenome"));
            funcionario.setTelefone(rs.getString("telefone"));
            funcionario.setLogin(rs.getString("login"));
            funcionario.setSenha(rs.getString("senha"));
            funcionario.setIdEndereco(rs.getInt("endereco_idendereco"));
        }
        
        rs.close();
        pst.close();
        
        return funcionario;
    }
    
    public boolean excluir(Funcionarios funcionarios) throws SQLException {
        final String SQL = "DELETE FROM funcionarios WHERE idfuncionarios = ?";
        
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setInt(1, funcionarios.getId());
        
        int n = pst.executeUpdate();
        
        pst.close();
        
        return n > 0;
    }    
    
    public Funcionarios alterar(Funcionarios funcionarios) throws SQLException {
        final String SQL = "UPDATE funcionarios set"
                + " nome = ?,"
                + " cpf = ?,"
                + " sobrenome = ?,"
                + " telefone = ?,"
                + " login = ?,"
                + " senha = ? "
                + " WHERE idfuncionarios = ?";
        
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setString(1, funcionarios.getNome());
        pst.setString(2, funcionarios.getCpf());
        pst.setString(3, funcionarios.getSobrenome());
        pst.setString(4, funcionarios.getTelefone());
        pst.setString(5, funcionarios.getLogin());
        pst.setString(6, funcionarios.getSenha());
        pst.setInt(7, funcionarios.getId());
        
        pst.executeUpdate();
        pst.close();
        
        return funcionarios;
    }
  
    public List<Funcionarios> listarTabela (String nome) throws SQLException{
       
       String SQL = "select idfuncionarios, nome, telefone from funcionarios where nome like ? ";

       PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setString(1, "%" + nome + "%");    
        ResultSet rs = pst.executeQuery();
        
        List<Funcionarios> lista = new ArrayList<>();
        
        while (rs.next()) {
            Funcionarios funcionario = new Funcionarios();
            funcionario.setId(rs.getInt("idfuncionarios"));
            funcionario.setNome(rs.getString("nome"));
            funcionario.setTelefone(rs.getString("telefone"));
            
            lista.add(funcionario);
        }
        
        rs.close();
        pst.close();
        
        return lista;        
    }   
       
}
