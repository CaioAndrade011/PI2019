/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

import Classes.AgendamentoDao;
import Classes.AnimaisDao;
import Classes.ClientesDao;
import Classes.ServicosDao;
import Modelo.Agendamento;
import Modelo.Animais;
import Modelo.Clientes;
import Modelo.Servicos;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas.delGiudce
 */
public class agendar extends javax.swing.JFrame {

    /**
     * Creates new form agendar
     */
    public agendar() {
        initComponents();
        setBackground (new Color(0,0,0,0));
        
        tabela_agendamento.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        tabela_agendamento.getTableHeader().setOpaque(false);
        tabela_agendamento.getTableHeader().setBackground(new Color(0,120,215));
        tabela_agendamento.getTableHeader().setForeground(new Color(255,255,255));
        tabela_agendamento.setRowHeight(25);
        
        try{
            AgendamentoDao listarAgendamentos = new AgendamentoDao();
            ClientesDao listarClientes = new ClientesDao();
            AnimaisDao listarAnimais = new AnimaisDao();
            ServicosDao listarServicos = new ServicosDao();
            
        List<Agendamento> lista = listarAgendamentos.listar();
        
        //Clientes cliente = new Clientes();
        //cliente = listarClientes.procurar();        
        
        DefaultTableModel model = new DefaultTableModel();
        this.tabela_agendamento.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Id", "Cliente", "Animal", "Serviço","Horário"});
             
            
        for(Agendamento agendamento: lista){
           
                model.addRow(new Object[]{agendamento.getId(),
                    agendamento.getCliente(),
                    agendamento.getAnimal(),
                    agendamento.getServico(),
                    agendamento.getHorario(),
                });  
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar: \n"
                    + e.getMessage());
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_agendamento = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        tf_pesquisa = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1019, 690));

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agendamento");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(460, 20, 250, 40);

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

        jPanel3.setLayout(null);

        tabela_agendamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabela_agendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Animal", "Serviço", "Horário"
            }
        ));
        tabela_agendamento.setFocusable(false);
        tabela_agendamento.setRowHeight(25);
        tabela_agendamento.setShowVerticalLines(false);
        tabela_agendamento.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela_agendamento);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 800, 510);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(190, 80, 800, 510);

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));
        jPanel5.setLayout(null);

        jButton6.setBackground(new java.awt.Color(0, 102, 204));
        jButton6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_adicionar_.png"))); // NOI18N
        jButton6.setText("Novo");
        jButton6.setToolTipText("Cadastrar novo agendamento");
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6);
        jButton6.setBounds(10, 0, 170, 70);

        jButton4.setBackground(new java.awt.Color(0, 102, 204));
        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_editar_.png"))); // NOI18N
        jButton4.setText("Editar");
        jButton4.setToolTipText("Editar agendamento");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);
        jButton4.setBounds(10, 70, 170, 70);

        jButton5.setBackground(new java.awt.Color(0, 102, 204));
        jButton5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_excluir_.png"))); // NOI18N
        jButton5.setText("Excluir");
        jButton5.setToolTipText("Excluir agendamento");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5);
        jButton5.setBounds(10, 140, 170, 70);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_procurar_.png"))); // NOI18N
        jPanel5.add(jLabel2);
        jLabel2.setBounds(40, 500, 120, 100);

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_atualizar.png"))); // NOI18N
        jButton1.setText("Atualizar");
        jButton1.setToolTipText("Atualizar tabela");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(10, 210, 170, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo 230x230.png"))); // NOI18N
        jPanel5.add(jLabel3);
        jLabel3.setBounds(-10, 280, 210, 230);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 80, 190, 600);

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));
        jPanel4.setLayout(null);

        jSeparator1.setMinimumSize(new java.awt.Dimension(100, 100));
        jSeparator1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel4.add(jSeparator1);
        jSeparator1.setBounds(30, 50, 390, 10);

        tf_pesquisa.setBackground(new java.awt.Color(0, 102, 204));
        tf_pesquisa.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tf_pesquisa.setToolTipText("Procurar agendamento");
        tf_pesquisa.setBorder(null);
        tf_pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_pesquisaKeyReleased(evt);
            }
        });
        jPanel4.add(tf_pesquisa);
        tf_pesquisa.setBounds(30, 20, 390, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(160, 590, 830, 90);

        jPanel6.setBackground(new java.awt.Color(0, 102, 204));
        jPanel6.setLayout(null);
        jPanel1.add(jPanel6);
        jPanel6.setBounds(990, 80, 30, 600);

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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int linha = tabela_agendamento.getSelectedRow();
        
        if (linha != -1) {
            
            int resp = JOptionPane.showConfirmDialog(this, 
                "Deseja excluir o registro", "Excluir", JOptionPane.YES_NO_OPTION);
            
            if (resp == JOptionPane.YES_OPTION) {
                int id = (Integer)tabela_agendamento.getModel().getValueAt(linha, 0);
            
                try {
                Agendamento agendamento = new Agendamento();
                agendamento.setId(id);
                AgendamentoDao excluir = new AgendamentoDao();
                excluir.excluir(agendamento);
                
                }   catch(Exception e) {
                    JOptionPane.showMessageDialog(this, 
                    "Erro ao excluir: "+ e.getMessage());
                }  
            }
        }   
        else {JOptionPane.showMessageDialog(null, "Selecione um item da tabela!");            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int linha = tabela_agendamento.getSelectedRow();
      
      if (linha != -1) {
          int id = (Integer)tabela_agendamento.getModel().getValueAt(linha, 0);    
          novoAgendamento agendamentoFrame = new novoAgendamento(id);
          agendamentoFrame.setVisible(true);
            
        } else {
          JOptionPane.showMessageDialog(null, "Selecione um item na tabela!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        novoAgendamento novoagendamentoFrame = new novoAgendamento();
        novoagendamentoFrame.setVisible(true);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
            AgendamentoDao listarAgendamentos = new AgendamentoDao();
            ClientesDao listarClientes = new ClientesDao();
            AnimaisDao listarAnimais = new AnimaisDao();
            ServicosDao listarServicos = new ServicosDao();
            
        List<Agendamento> lista = listarAgendamentos.listar();     
        
        DefaultTableModel model = new DefaultTableModel();
        this.tabela_agendamento.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Id", "Cliente", "Animal", "Serviço","Horário"});             
            
        for(Agendamento agendamento: lista){
           
                model.addRow(new Object[]{agendamento.getId(),
                    agendamento.getCliente(),
                    agendamento.getAnimal(),
                    agendamento.getServico(),
                    agendamento.getHorario(),
                });  
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar: \n"
                    + e.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_pesquisaKeyReleased
        // TODO add your handling code here:
        try{
        AgendamentoDao listarAgendamento = new AgendamentoDao();
        
        List<Agendamento> lista = listarAgendamento.listarTabela(tf_pesquisa.getText());
        DefaultTableModel model = new DefaultTableModel();
        this.tabela_agendamento.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Id", "Cliente", "Animal", "Serviço","Horário"});
             
            
        for(Agendamento agendamento: lista){
           
                model.addRow(new Object[]{agendamento.getId(),
                    agendamento.getCliente(),
                    agendamento.getAnimal(),
                    agendamento.getServico(),
                    agendamento.getHorario(),
                });  
            }
        
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar: \n"
                    + e.getMessage());
        }
    }//GEN-LAST:event_tf_pesquisaKeyReleased

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
            java.util.logging.Logger.getLogger(agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabela_agendamento;
    private javax.swing.JTextField tf_pesquisa;
    // End of variables declaration//GEN-END:variables
}
