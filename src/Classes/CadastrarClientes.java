package Classes;

import Modelo.Clientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CadastrarClientes {

    private Conexao conexao;

    public CadastrarClientes() throws SQLException {
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
    
}