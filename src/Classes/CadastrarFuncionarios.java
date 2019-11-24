package Classes;

import Modelo.Funcionarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CadastrarFuncionarios {
    
    private Conexao conexao;

    public CadastrarFuncionarios() throws SQLException {
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
    
    
    
}
