/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

import Classes.AnimaisDao;
import Modelo.Animais;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas.delGiudce
 */
public class animal extends javax.swing.JFrame {

    /**
     * Creates new form animal
     */
    public animal() {
        initComponents();
        setBackground (new Color(0,0,0,0));
        
        tabela_animais.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        tabela_animais.getTableHeader().setOpaque(false);
        tabela_animais.getTableHeader().setBackground(new Color(0,120,215));
        tabela_animais.getTableHeader().setForeground(new Color(255,255,255));
        tabela_animais.setRowHeight(25);
        
        try{
            AnimaisDao listarAnimais = new AnimaisDao();
        
        List<Animais> lista = listarAnimais.listar();
        DefaultTableModel model = new DefaultTableModel();
        this.tabela_animais.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Id","Nome","Espécie", "Raça"});
        
        for(Animais animal: lista){
                model.addRow(new Object[]{animal.getId(),
                    animal.getNome(),
                    animal.getEspecie(),
                    animal.getRaca()
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
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_animais = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        tf_pesquisa = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Animais");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(230, 20, 130, 43);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(110, 30, 590, 70);

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_novo.png"))); // NOI18N
        jButton1.setText("Novo");
        jButton1.setToolTipText("Cadastrar novo animal");
        jButton1.setAutoscrolls(true);
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(0, 30, 110, 50);

        btn_editar.setBackground(new java.awt.Color(0, 102, 204));
        btn_editar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_editar.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.setToolTipText("Editar animal");
        btn_editar.setBorder(null);
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_editar);
        btn_editar.setBounds(0, 110, 110, 50);

        jButton4.setBackground(new java.awt.Color(0, 102, 204));
        jButton4.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_excluir.png"))); // NOI18N
        jButton4.setText("Excluir");
        jButton4.setToolTipText("Excluir animal");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(0, 190, 110, 50);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 70, 110, 260);

        tabela_animais.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabela_animais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Espécie", "Raça"
            }
        ));
        tabela_animais.setRowHeight(25);
        jScrollPane1.setViewportView(tabela_animais);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(110, 100, 590, 250);

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));
        jPanel5.setLayout(null);

        jSeparator1.setMinimumSize(new java.awt.Dimension(100, 100));
        jSeparator1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(10, 30, 330, 10);

        tf_pesquisa.setBackground(new java.awt.Color(0, 102, 204));
        tf_pesquisa.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tf_pesquisa.setToolTipText("Procurar um animal");
        tf_pesquisa.setBorder(null);
        tf_pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_pesquisaKeyReleased(evt);
            }
        });
        jPanel5.add(tf_pesquisa);
        tf_pesquisa.setBounds(10, 0, 330, 30);

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_atualizar.png"))); // NOI18N
        jButton2.setText("Atualizar");
        jButton2.setToolTipText("Atualizar tabela");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(480, 10, 110, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(110, 350, 620, 50);

        jPanel6.setBackground(new java.awt.Color(0, 102, 204));
        jPanel6.setLayout(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ico_procurar.png"))); // NOI18N
        jPanel6.add(jLabel3);
        jLabel3.setBounds(0, 0, 110, 70);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(0, 330, 110, 70);

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(700, 0, 30, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(728, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        animais novoanimalFrame = new animais();
        novoanimalFrame.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        int linha = tabela_animais.getSelectedRow();
      
      if (linha != -1) {
          int id = (Integer)tabela_animais.getModel().getValueAt(linha, 0);    
          animais animaisFrame = new animais(id);
          animaisFrame.setVisible(true);
            
        } else {
          JOptionPane.showMessageDialog(null, "Selecione um item na tabela!");
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            AnimaisDao listarAnimais = new AnimaisDao();
        
        List<Animais> lista = listarAnimais.listar();
        DefaultTableModel model = new DefaultTableModel();
        this.tabela_animais.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Id","Nome","Espécie", "Raça"});
        
        for(Animais animal: lista){
                model.addRow(new Object[]{animal.getId(),
                    animal.getNome(),
                    animal.getEspecie(),
                    animal.getRaca()
                });
            }
        
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar: \n"
                    + e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        int linha = tabela_animais.getSelectedRow();
        
        if (linha != -1) {
            
            int resp = JOptionPane.showConfirmDialog(this, 
                "Deseja excluir o registro", "Excluir", JOptionPane.YES_NO_OPTION);
            
            if (resp == JOptionPane.YES_OPTION) {
                int id = (Integer)tabela_animais.getModel().getValueAt(linha, 0);
            
                try {
                Animais animais = new Animais();
                animais.setId(id);
                AnimaisDao excluir = new AnimaisDao();
                excluir.excluir(animais);
                
                }   catch(Exception e) {
                    JOptionPane.showMessageDialog(this, 
                    "Erro ao excluir: "+ e.getMessage());
                }  
            }
        }   
        else {JOptionPane.showMessageDialog(null, "Selecione um item da tabela!");            
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tf_pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_pesquisaKeyReleased
        // TODO add your handling code here:
        try{
        AnimaisDao listarAnimais = new AnimaisDao();
        
        List<Animais> lista = listarAnimais.listarTabela(tf_pesquisa.getText());
        DefaultTableModel model = new DefaultTableModel();
        this.tabela_animais.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Id","Nome", "Telefone"});
        
        for(Animais animais: lista){
                model.addRow(new Object[]{animais.getId(),
                    animais.getNome(),
                    animais.getEspecie(),
                    animais.getRaca()
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
            java.util.logging.Logger.getLogger(animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new animal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabela_animais;
    private javax.swing.JTextField tf_pesquisa;
    // End of variables declaration//GEN-END:variables
}
