/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

import Classes.ServicosDao;
import Modelo.Servicos;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas.delGiudce
 */
public class novoServico extends javax.swing.JFrame {

    private int id = -1;
    
    public novoServico() {
        initComponents();
    }
    public novoServico(int id) {
        this();
        this.id = id;
        this.setTitle("Alterar Contato");
        
        try{
            
            ServicosDao consultar = new ServicosDao();        
            Servicos servicos = consultar.procurar(id);
            tf_nome.setText(servicos.getNome());
            tf_valor.setText(String.valueOf(servicos.getValor()));
            tf_descricao.setText(servicos.getDescricao());                   
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Opss! Ocorreu um erro: " + e.getMessage());
        }
        }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        tf_valor = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf_descricao = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setLayout(null);

        jPanel3.setLayout(null);

        jButton4.setBackground(new java.awt.Color(0, 102, 204));
        jButton4.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_salvar.png"))); // NOI18N
        jButton4.setText("Salvar");
        jButton4.setToolTipText("Salvar dados");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(550, 20, 110, 50);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 320, 730, 80);

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 280));
        jPanel4.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Des");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(110, 10, 70, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(360, 0, 180, 70);

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 380));
        jPanel5.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ser");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(120, 10, 60, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nome:");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(50, 70, 80, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Valor R$:");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(50, 120, 110, 20);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 0, 180, 320);

        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("viço");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 80, 50);

        tf_nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_nome.setForeground(new java.awt.Color(0, 102, 204));
        tf_nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_nomeMouseClicked(evt);
            }
        });
        jPanel2.add(tf_nome);
        tf_nome.setBounds(20, 70, 140, 21);

        tf_valor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_valor.setForeground(new java.awt.Color(0, 102, 204));
        tf_valor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_valorMouseClicked(evt);
            }
        });
        jPanel2.add(tf_valor);
        tf_valor.setBounds(20, 120, 140, 21);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(180, 0, 180, 320);

        jPanel7.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.add(jPanel6);
        jPanel6.setBounds(160, 0, 30, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("crição");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(0, 0, 110, 50);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(540, 0, 190, 70);

        tf_descricao.setColumns(20);
        tf_descricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_descricao.setRows(5);
        jScrollPane2.setViewportView(tf_descricao);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(390, 70, 310, 220);

        jPanel8.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8);
        jPanel8.setBounds(360, 70, 30, 220);

        jPanel9.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9);
        jPanel9.setBounds(700, 70, 30, 220);

        jPanel10.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10);
        jPanel10.setBounds(360, 290, 370, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(728, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomeMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void tf_valorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_valorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_valorMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        Servicos servico = new Servicos();
        if (id == -1){
            try {            
            
            servico.setNome(tf_nome.getText());
            servico.setValor(Double.parseDouble(tf_valor.getText()));
            servico.setDescricao(tf_descricao.getText());

            ServicosDao cadastrarServico = new ServicosDao();
            servico = cadastrarServico.inserir(servico);

            JOptionPane.showMessageDialog(this, "Registro Cadastrado");
            dispose();
            
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro: \n"
                    + e.getMessage());
            } 
        }
        else{
            try{
                servico.setId(id);
                servico.setNome(tf_nome.getText());
                servico.setValor(Double.parseDouble(tf_valor.getText()));
                servico.setDescricao(tf_descricao.getText());
                
                
                ServicosDao servicoAlterar = new ServicosDao();
                servico = servicoAlterar.alterar(servico);
                JOptionPane.showMessageDialog(this, "Registro alterado!");
                dispose();
            }
            catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na alteração: \n"
                    + e.getMessage());
            } 
            
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(novoServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(novoServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(novoServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(novoServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new novoServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea tf_descricao;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_valor;
    // End of variables declaration//GEN-END:variables

}
