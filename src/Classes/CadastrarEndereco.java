package Classes;

import Modelo.Endereco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CadastrarEndereco {
    
    private Conexao conexao;

    public CadastrarEndereco() throws SQLException {
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
    
}
