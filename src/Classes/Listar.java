
package Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Listar {
    
    private Conexao conexao;

    public Listar() throws SQLException {
        conexao = Conexao.getIntancia();
    }
    
       
}
