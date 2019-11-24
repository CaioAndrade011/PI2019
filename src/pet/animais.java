/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pet;

import Classes.AnimaisDao;
import Classes.ClientesDao;
import Modelo.Animais;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Modelo.Clientes;
import com.sun.xml.internal.ws.util.xml.CDATA;

/**
 *
 * @author lucas.delGiudce
 */
public class animais extends javax.swing.JFrame {

    private int id = -1;  
    
    public animais() {
        initComponents();
        
        //JOptionPane.showMessageDialog(null, id);
        
        try{
            ClientesDao listarClientes = new ClientesDao();

            List<Clientes> lista = listarClientes.listar();

            for (Clientes cliente: lista) {
                cb_dono.addItem(cliente);
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar: \n"
                    + e.getMessage());
        }
    }
    
    public animais(int id) {
        this();
        this.id = id;
        this.setTitle("Alterar Contato");
        
        //if(id != -1){
               
        try{
            
            AnimaisDao consultar = new AnimaisDao();        
            Animais animal = consultar.procurar(id);
            tf_nome.setText(animal.getNome());
            tf_especie.setText(animal.getEspecie());
            tf_raca.setText(animal.getRaca()); 
            
            ClientesDao consultarCliente = new ClientesDao();
            Clientes cliente = consultarCliente.procurar(animal.getIdCliente());
           
            //cb_dono.addItem(consultarCliente.procurar(animal.getIdCliente()));
            cb_dono.getModel().setSelectedItem(cliente);
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        tf_raca = new javax.swing.JTextField();
        tf_nome = new javax.swing.JTextField();
        tf_especie = new javax.swing.JTextField();
        cb_dono = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nome:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(320, 60, 110, 40);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Espécie:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(320, 140, 150, 40);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Dono:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(320, 300, 100, 40);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_girafa.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(240, 330, 50, 64);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_cachorro.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 30, 50, 64);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_bufalo.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(140, 30, 50, 64);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_coelho.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(240, 30, 50, 64);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_elefante.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 130, 60, 64);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_hipopotamo.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(140, 130, 50, 64);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_ovelha.png"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(240, 130, 50, 64);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_panda.png"))); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(30, 240, 50, 64);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_porco.png"))); // NOI18N
        jPanel2.add(jLabel13);
        jLabel13.setBounds(140, 240, 50, 64);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_urso.png"))); // NOI18N
        jPanel2.add(jLabel14);
        jLabel14.setBounds(240, 240, 50, 64);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_vaca.png"))); // NOI18N
        jPanel2.add(jLabel15);
        jLabel15.setBounds(30, 340, 50, 64);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_vacamarron.png"))); // NOI18N
        jPanel2.add(jLabel16);
        jLabel16.setBounds(140, 330, 50, 64);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Raça:");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(320, 220, 100, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 460, 440);

        jPanel3.setLayout(null);

        jButton5.setBackground(new java.awt.Color(0, 102, 204));
        jButton5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_pata.png"))); // NOI18N
        jButton5.setText("Salvar");
        jButton5.setToolTipText("Salvar dados");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(60, 330, 120, 50);

        tf_raca.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tf_raca.setForeground(new java.awt.Color(0, 102, 204));
        tf_raca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_racaMouseClicked(evt);
            }
        });
        jPanel3.add(tf_raca);
        tf_raca.setBounds(20, 200, 200, 30);

        tf_nome.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tf_nome.setForeground(new java.awt.Color(0, 102, 204));
        tf_nome.setToolTipText("");
        tf_nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_nomeMouseClicked(evt);
            }
        });
        jPanel3.add(tf_nome);
        tf_nome.setBounds(20, 40, 200, 30);

        tf_especie.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tf_especie.setForeground(new java.awt.Color(0, 102, 204));
        tf_especie.setToolTipText("");
        tf_especie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_especieMouseClicked(evt);
            }
        });
        jPanel3.add(tf_especie);
        tf_especie.setBounds(20, 120, 200, 30);

        cb_dono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_donoActionPerformed(evt);
            }
        });
        jPanel3.add(cb_dono);
        cb_dono.setBounds(20, 280, 200, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(460, 30, 240, 410);

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));
        jPanel4.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));
        jPanel5.setLayout(null);

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
        jPanel5.add(jLabel1);
        jLabel1.setBounds(0, 0, 30, 30);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(240, 0, 30, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(460, 0, 270, 30);

        jPanel6.setBackground(new java.awt.Color(0, 102, 204));
        jPanel6.setForeground(new java.awt.Color(0, 102, 204));
        jPanel6.setLayout(null);
        jPanel1.add(jPanel6);
        jPanel6.setBounds(700, 30, 30, 410);

        jPanel7.setBackground(new java.awt.Color(0, 102, 204));
        jPanel7.setLayout(null);
        jPanel1.add(jPanel7);
        jPanel7.setBounds(0, 440, 730, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(730, 470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_racaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_racaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_racaMouseClicked

    private void tf_nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomeMouseClicked

    private void tf_especieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_especieMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_especieMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        Animais animal = new Animais();
        Clientes cliente = (Clientes)cb_dono.getSelectedItem();
        if (id == -1){
        try{
            
            animal.setNome(tf_nome.getText());
            animal.setEspecie(tf_especie.getText());
            animal.setRaca(tf_raca.getText());
                                
            //if (cliente != null) {
                animal.setIdCliente(cliente.getId()); 
            //}
            
            
            AnimaisDao cadastrar = new AnimaisDao();
            animal = cadastrar.inserir(animal); 
            JOptionPane.showMessageDialog(this, "Registro cadastrado");            
                   
        }
        
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro: \n"
                    + e.getMessage());
        }
        }
        else{
            try {                
                animal.setId(id);
                animal.setNome(tf_nome.getText());
                animal.setEspecie(tf_especie.getText());
                animal.setRaca(tf_raca.getText());
                animal.setIdCliente(cliente.getId());
                //animal.setIdCliente(Integer.parseInt((String) cb_dono.getSelectedItem()));
                
                
                AnimaisDao animaisAlterar = new AnimaisDao();
                animal = animaisAlterar.alterar(animal);
                JOptionPane.showMessageDialog(this, "Registro alterado!");
                dispose();
                
            }
            
            catch(Exception e) {
                JOptionPane.showMessageDialog(this, "Erro na alteração do registro:\n"
                        + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cb_donoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_donoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_donoActionPerformed

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
            java.util.logging.Logger.getLogger(animais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(animais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(animais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(animais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new animais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> cb_dono;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTextField tf_especie;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_raca;
    // End of variables declaration//GEN-END:variables

}
