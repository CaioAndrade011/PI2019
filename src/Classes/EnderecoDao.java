package Classes;

import Modelo.Endereco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EnderecoDao {
    
    private Conexao conexao;

    public EnderecoDao() throws SQLException {
        conexao = Conexao.getIntancia();
    }

    public Endereco inserir(Endereco endereco) throws SQLException {
        String sql = "INSERT INTO endereco (rua, numero, bairro, cidade) "
                + " VALUES (?, ?, ?, ?);";

        PreparedStatement pst = conexao.getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, endereco.getRua());
        pst.setString(2, endereco.getNumero());
        pst.setString(3, endereco.getBairro());
        pst.setString(4, endereco.getCidade());
        

        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        if (rs.next()) {
            endereco.setId(rs.getInt(1));
        }

        rs.close();
        pst.close();

        return endereco;
    }
    
    public Endereco alterar(Endereco endereco) throws SQLException {
        final String SQL = "UPDATE endereco set"
                + " rua = ?,"
                + " numero = ?,"
                + " bairro = ?,"
                + " cidade = ? "
                + " WHERE idendereco = ?";
        
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setString(1, endereco.getRua());
        pst.setString(2, endereco.getNumero());
        pst.setString(3, endereco.getBairro());
        pst.setString(4, endereco.getCidade());
        pst.setInt(5, endereco.getId());
        
        pst.executeUpdate();
        pst.close();
        
        return endereco;
    }
    
    public Endereco procurar(int id) throws SQLException {
        final String SQL = "SELECT idendereco, rua, numero, bairro,"
                + " cidade"
                + " FROM endereco WHERE idendereco = ? ";
        
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();
        
        Endereco endereco = null;
        
        if (rs.next()) {
            endereco = new Endereco();
            endereco.setId(rs.getInt("idendereco"));
            endereco.setRua(rs.getString("rua"));
            endereco.setNumero(rs.getString("numero"));
            endereco.setBairro(rs.getString("bairro"));
            endereco.setCidade(rs.getString("cidade"));
        }
        
        rs.close();
        pst.close();
        
        return endereco;
    }    
}
