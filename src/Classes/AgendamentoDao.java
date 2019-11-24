package Classes;

import Modelo.Agendamento;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AgendamentoDao {
    
    private Conexao conexao;

    public AgendamentoDao() throws SQLException {
        conexao = Conexao.getIntancia();
    }

    public Agendamento inserir(Agendamento agendamento) throws SQLException {
        String sql = "INSERT INTO agendamento (idcliente, idanimal, idservico, cliente, animal, servico, horario, dia, idfuncionario, observacoes, status, levaTraz) "
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        PreparedStatement pst = conexao.getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        pst.setInt(1, agendamento.getIdCliente());
        pst.setInt(2, agendamento.getIdAnimal());
        pst.setInt(3, agendamento.getIdServico());
        pst.setString(4, agendamento.getCliente());
        pst.setString(5, agendamento.getAnimal());
        pst.setString(6, agendamento.getServico());
        pst.setString(7, agendamento.getHorario());
        pst.setString(8, agendamento.getDia());
        pst.setInt(9, agendamento.getIdFuncionario());
        pst.setString(10, agendamento.getObservacoes());
        pst.setString(11, agendamento.getStatus());
        pst.setString(12, agendamento.getLevaTraz());

        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        if (rs.next()) {
            agendamento.setId(rs.getInt(1));
        }

        rs.close();
        pst.close();

        return agendamento;
        
    }
    
    public List<Agendamento> listar () throws SQLException{
       
       String SQL = "select idagendamento, idcliente, idanimal, idservico, cliente, animal, servico, horario, dia, idfuncionario, status, levaTraz  from agendamento";

       PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
       // pst.setString(1, "%" + cidade + "%");    
        ResultSet rs = pst.executeQuery();
        
        List<Agendamento> lista = new ArrayList<>();
        
        while (rs.next()) {
            Agendamento agendamento = new Agendamento();
            agendamento.setId(rs.getInt("idagendamento"));
            agendamento.setIdCliente(rs.getInt("idcliente"));
            agendamento.setIdAnimal(rs.getInt("idanimal"));
            agendamento.setIdServico(rs.getInt("idservico"));
            agendamento.setCliente(rs.getString("cliente"));
            agendamento.setAnimal(rs.getString("animal"));
            agendamento.setServico(rs.getString("servico"));
            agendamento.setHorario(rs.getString("horario"));
            agendamento.setDia(rs.getString("dia"));
            agendamento.setIdFuncionario(rs.getInt("idfuncionario"));
            agendamento.setStatus(rs.getString("status"));
            agendamento.setLevaTraz(rs.getString("levaTraz"));           
            
            lista.add(agendamento);
        }
        
        rs.close();
        pst.close();
        
        return lista;        
    }
    
    public Agendamento procurar(int id) throws SQLException {
        final String SQL = "SELECT *"
                + " FROM agendamento WHERE idagendamento = ? "; 
       
        
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();
        
        Agendamento agendamento=  null;
        
        if (rs.next()) {
            agendamento = new Agendamento();
            agendamento.setId(rs.getInt("idagendamento"));
            agendamento.setIdCliente(rs.getInt("idcliente"));
            agendamento.setIdAnimal(rs.getInt("idanimal"));
            agendamento.setIdServico(rs.getInt("idservico"));
            agendamento.setCliente(rs.getString("cliente"));
            agendamento.setAnimal(rs.getString("animal"));
            agendamento.setServico(rs.getString("servico"));
            agendamento.setHorario(rs.getString("horario"));
            agendamento.setDia(rs.getString("dia"));
            agendamento.setIdFuncionario(rs.getInt("idfuncionario"));
            agendamento.setObservacoes(rs.getString("observacoes"));
            agendamento.setStatus(rs.getString("status"));
            agendamento.setLevaTraz(rs.getString("levaTraz"));
        }
        
        rs.close();
        pst.close();
        
        return agendamento;
    }
    
    public Agendamento alterar(Agendamento agendamento) throws SQLException {
        final String SQL = "UPDATE agendamento set"
                + " idcliente = ?,"
                + " idanimal = ?,"
                + " idservico = ?,"
                + " cliente = ?,"
                + " animal = ?,"
                + " servico = ?,"
                + " horario = ?,"
                + " dia = ?,"
                + " idfuncionario = ?,"
                + " observacoes = ?,"
                + " status = ?,"
                + " levaTraz = ?"
                + " WHERE idagendamento = ?";
        
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setInt(1, agendamento.getIdCliente());
        pst.setInt(2, agendamento.getIdAnimal());
        pst.setInt(3, agendamento.getIdServico());
        pst.setString(4, agendamento.getCliente());
        pst.setString(5, agendamento.getAnimal());
        pst.setString(6, agendamento.getServico());
        pst.setString(7, agendamento.getHorario());
        pst.setString(8, agendamento.getDia());
        pst.setInt(9, agendamento.getIdFuncionario());
        pst.setString(10, agendamento.getObservacoes());
        pst.setString(11, agendamento.getStatus());
        pst.setString(12, agendamento.getLevaTraz());
        pst.setInt(13, agendamento.getId());
        
        pst.executeUpdate();
        pst.close();
        
        return agendamento;
    }   
    
     public boolean excluir(Agendamento agendamento) throws SQLException {
        final String SQL = "DELETE FROM agendamento WHERE idagendamento = ?";
        
        PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setInt(1, agendamento.getId());
        
        int n = pst.executeUpdate();
        
        pst.close();
        
        return n > 0;
    } 
     
     public List<Agendamento> listarTabela (String nome) throws SQLException{
       
       String SQL = "select * from agendamento where cliente like ? ";

       PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
        pst.setString(1, "%" + nome + "%");    
        ResultSet rs = pst.executeQuery();
        
        List<Agendamento> lista = new ArrayList<>();
        
        while (rs.next()) {
            Agendamento agendamento = new Agendamento();
            agendamento.setId(rs.getInt("idagendamento"));
            agendamento.setCliente(rs.getString("cliente"));
            agendamento.setAnimal(rs.getString("animal"));
            agendamento.setServico(rs.getString("servico"));
            agendamento.setHorario(rs.getString("horario"));
            
            lista.add(agendamento);
        }
        
        rs.close();
        pst.close();
        
        return lista;        
    }
     
     public List<Agendamento> listarStatus () throws SQLException{
       
       String SQL = "select * from agendamento where status = 'aberto'";

       PreparedStatement pst = conexao.getConexao().prepareStatement(SQL);
       // pst.setString(1, "%" + cidade + "%");    
        ResultSet rs = pst.executeQuery();
        
        List<Agendamento> lista = new ArrayList<>();
        
        while (rs.next()) {
            Agendamento agendamento = new Agendamento();
            agendamento.setId(rs.getInt("idagendamento"));
            agendamento.setIdCliente(rs.getInt("idcliente"));
            agendamento.setIdAnimal(rs.getInt("idanimal"));
            agendamento.setIdServico(rs.getInt("idservico"));
            agendamento.setCliente(rs.getString("cliente"));
            agendamento.setAnimal(rs.getString("animal"));
            agendamento.setServico(rs.getString("servico"));
            agendamento.setHorario(rs.getString("horario"));
            agendamento.setDia(rs.getString("dia"));
            agendamento.setIdFuncionario(rs.getInt("idfuncionario"));
            agendamento.setStatus(rs.getString("status"));
            agendamento.setLevaTraz(rs.getString("levaTraz"));           
            
            lista.add(agendamento);
        }
        
        rs.close();
        pst.close();
        
        return lista;        
    }
}
