package Classes;

import Modelo.Servicos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CadastrarServicos {
    
    private Conexao conexao;

    public CadastrarServicos() throws SQLException {
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
    
}
