package Classes;

import Modelo.Animais;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CadastrarAnimais {
    
    private Conexao conexao;

    public CadastrarAnimais() throws SQLException {
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
    
    
}
