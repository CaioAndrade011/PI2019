/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

import Classes.AgendamentoDao;
import Classes.AnimaisDao;
import Classes.ClientesDao;
import Classes.FuncionariosDao;
import Classes.ServicosDao;
import Modelo.Agendamento;
import Modelo.Animais;
import Modelo.Clientes;
import Modelo.Funcionarios;
import Modelo.Servicos;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author lucas.delGiudce
 */
public class novoAgendamento extends javax.swing.JFrame {

    private int id = -1; 
    
    public novoAgendamento() {
        initComponents();
        
        try{
            ClientesDao listarClientes = new ClientesDao();
            AnimaisDao listarAnimais = new AnimaisDao();
            ServicosDao listarServicos = new ServicosDao();
            FuncionariosDao listarFuncionarios = new FuncionariosDao();

            List<Clientes> lista = listarClientes.listar();
            List<Animais> listaAnimais = listarAnimais.listar();
            List<Servicos> listaServicos = listarServicos.listar();
            List<Funcionarios> listaFuncionarios = listarFuncionarios.listar();

            for (Clientes cliente: lista) {
                cb_cliente.addItem(cliente);
            }
            
            for (Animais animais: listaAnimais) {
                cb_animal.addItem(animais);
            }
            
            for (Servicos servico: listaServicos) {
                cb_servico.addItem(servico);
            }
            
            for (Funcionarios funcionario: listaFuncionarios) {
                cb_funcionario.addItem(funcionario);
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar: \n"
                    + e.getMessage());
        }            
        
    }
    
    public novoAgendamento(int id) {
        this();
        this.id = id;
        this.setTitle("Alterar Contato");
        
        //if(id != -1){
               
        try{
            
            AgendamentoDao consultar = new AgendamentoDao();        
            Agendamento agendamento = consultar.procurar(id);
            
            ClientesDao consultarCliente = new ClientesDao();
            AnimaisDao consultarAnimais = new AnimaisDao();
            ServicosDao consultarServicos = new ServicosDao();
            FuncionariosDao consultarFuncionarios = new FuncionariosDao();
            
            Clientes cliente = consultarCliente.procurar(agendamento.getIdCliente());
            Animais animal = consultarAnimais.procurar(agendamento.getIdCliente());
            Servicos servico = consultarServicos.procurar(agendamento.getIdCliente());
            Funcionarios funcionario = consultarFuncionarios.procurar(agendamento.getIdCliente());
            
            cb_cliente.getModel().setSelectedItem(cliente);
            cb_animal.getModel().setSelectedItem(animal);
            cb_servico.getModel().setSelectedItem(servico);
            tf_hora.setText(agendamento.getHorario());
            tf_dia.setText(agendamento.getDia());
            cb_funcionario.getModel().setSelectedItem(funcionario);
            ta_observacoes.setText(agendamento.getObservacoes());
            cb_status.getModel().setSelectedItem(agendamento.getStatus());
            cb_leva.getModel().setSelectedItem(agendamento.getLevaTraz());
                        
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Opss! Ocorreu um erro: " + e.getMessage());
        }
       // }        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        cb_leva = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb_status = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cb_cliente = new javax.swing.JComboBox<>();
        cb_servico = new javax.swing.JComboBox<>();
        cb_funcionario = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_observacoes = new javax.swing.JTextArea();
        tf_dia = new javax.swing.JTextField();
        cb_animal = new javax.swing.JComboBox<>();
        tf_hora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(0, 102, 204));
        jPanel7.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(0, 102, 204));
        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel4);
        jLabel4.setBounds(0, 0, 30, 30);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(990, 0, 30, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-1, 0, 1020, 80);

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));
        jPanel4.setLayout(null);

        jButton7.setBackground(new java.awt.Color(0, 102, 204));
        jButton7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_salvar_.png"))); // NOI18N
        jButton7.setText("Salvar");
        jButton7.setToolTipText("Salvar dados");
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);
        jButton7.setBounds(750, 20, 150, 50);

        cb_leva.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        cb_leva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        cb_leva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(cb_leva);
        cb_leva.setBounds(640, 20, 100, 50);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_status.png"))); // NOI18N
        jLabel5.setText("Status:");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(20, 10, 210, 70);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Leva traz?");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(440, 10, 200, 70);

        cb_status.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aberto", "Fechado" }));
        cb_status.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(cb_status);
        cb_status.setBounds(240, 20, 190, 50);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 590, 990, 90);

        jPanel6.setBackground(new java.awt.Color(0, 102, 204));
        jPanel6.setLayout(null);
        jPanel1.add(jPanel6);
        jPanel6.setBounds(990, 80, 30, 600);

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cliente:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(410, 30, 140, 40);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Animal:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(410, 80, 140, 40);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Serviço:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(410, 130, 150, 40);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Horário:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(410, 180, 150, 40);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Funcionário:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(410, 280, 220, 40);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Observações:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(410, 330, 240, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_preco.png"))); // NOI18N
        jLabel1.setText("Preço: R$");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(20, 450, 240, 50);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(jLabel2);
        jLabel2.setBounds(260, 450, 150, 50);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Dia:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(410, 230, 70, 40);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo 380x380.png"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 0, 380, 380);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 80, 650, 510);

        jPanel5.setLayout(null);

        cb_cliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cb_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_clienteActionPerformed(evt);
            }
        });
        jPanel5.add(cb_cliente);
        cb_cliente.setBounds(30, 30, 280, 30);

        cb_servico.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cb_servico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(cb_servico);
        cb_servico.setBounds(30, 130, 280, 30);

        cb_funcionario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cb_funcionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(cb_funcionario);
        cb_funcionario.setBounds(30, 280, 280, 30);

        ta_observacoes.setColumns(20);
        ta_observacoes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ta_observacoes.setRows(5);
        jScrollPane1.setViewportView(ta_observacoes);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(30, 330, 280, 150);

        tf_dia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tf_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_diaActionPerformed(evt);
            }
        });
        jPanel5.add(tf_dia);
        tf_dia.setBounds(30, 230, 280, 30);

        cb_animal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cb_animal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb_animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_animalActionPerformed(evt);
            }
        });
        jPanel5.add(cb_animal);
        cb_animal.setBounds(30, 80, 280, 30);

        tf_hora.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tf_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_horaActionPerformed(evt);
            }
        });
        jPanel5.add(tf_hora);
        tf_hora.setBounds(30, 180, 280, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(650, 80, 340, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1019, 680));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void cb_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_clienteActionPerformed

    private void tf_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_diaActionPerformed

    private void cb_animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_animalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_animalActionPerformed

    private void tf_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_horaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
                
        Agendamento agendamento = new Agendamento();
        Clientes cliente = (Clientes)cb_cliente.getSelectedItem();
        Animais animal = (Animais)cb_animal.getSelectedItem();
        Servicos servico = (Servicos)cb_servico.getSelectedItem();
        Funcionarios funcionario = (Funcionarios)cb_funcionario.getSelectedItem();
        
        if (id == -1){
        try{
        agendamento.setIdCliente(cliente.getId());
        agendamento.setIdAnimal(animal.getId());
        agendamento.setIdServico(servico.getId());
        agendamento.setCliente((cliente.getNome()));
        agendamento.setAnimal((animal.getNome()));
        agendamento.setServico((servico.getNome()));        
        agendamento.setHorario(tf_hora.getText());
        agendamento.setDia(tf_dia.getText());
        agendamento.setIdFuncionario(funcionario.getId());
        agendamento.setObservacoes(ta_observacoes.getText());
        agendamento.setStatus((String) cb_status.getSelectedItem());
        agendamento.setLevaTraz((String) cb_leva.getSelectedItem());
        
        AgendamentoDao cadastrar = new AgendamentoDao();
        agendamento = cadastrar.inserir(agendamento); 
            JOptionPane.showMessageDialog(this, "Registro cadastrado");  
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro: \n"
                    + e.getMessage());
        } 
        }
        
        else{
            try{
            agendamento.setId(id);
            agendamento.setIdCliente(cliente.getId());
            agendamento.setIdAnimal(animal.getId());
            agendamento.setIdServico(servico.getId());
            agendamento.setCliente(cliente.getNome());
            agendamento.setAnimal(animal.getNome());
            agendamento.setServico(servico.getNome());
            agendamento.setHorario(tf_hora.getText());
            agendamento.setDia(tf_dia.getText());
            agendamento.setIdFuncionario(funcionario.getId());
            agendamento.setObservacoes(ta_observacoes.getText());
            agendamento.setStatus((String) cb_status.getSelectedItem());
            agendamento.setLevaTraz((String) cb_leva.getSelectedItem());
            
            AgendamentoDao agendamentoAlterar = new AgendamentoDao();
                agendamento = agendamentoAlterar.alterar(agendamento);
                JOptionPane.showMessageDialog(this, "Registro alterado!");
                dispose();
                
            }
            
            catch(Exception e) {
                JOptionPane.showMessageDialog(this, "Erro na alteração do registro:\n"
                        + e.getMessage());
            }
             
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(novoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(novoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(novoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(novoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new novoAgendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Animais> cb_animal;
    private javax.swing.JComboBox<Clientes> cb_cliente;
    private javax.swing.JComboBox<Funcionarios> cb_funcionario;
    private javax.swing.JComboBox<String> cb_leva;
    private javax.swing.JComboBox<Servicos> cb_servico;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta_observacoes;
    private javax.swing.JTextField tf_dia;
    private javax.swing.JTextField tf_hora;
    // End of variables declaration//GEN-END:variables
}
