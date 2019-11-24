package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static Conexao instancia;

    private String usuario = "root";
    private String senha = "root";
    private String url = "jdbc:mysql://localhost:3306/pet";

    private Connection conn;

    private Conexao() throws SQLException {
        conn = DriverManager.getConnection(url, usuario, senha);
    }

    public static Conexao getIntancia() throws SQLException {
        if (instancia == null) {
            instancia = new Conexao();
        }

        return instancia;
    }

    public Connection getConexao() {
        return conn;
    }
}
