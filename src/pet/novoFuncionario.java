/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

import Classes.EnderecoDao;
import Classes.FuncionariosDao;
import Modelo.Endereco;
import Modelo.Funcionarios;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas.delGiudce
 */
public class novoFuncionario extends javax.swing.JFrame {

    private int id = -1;        
    
    public novoFuncionario() {
        initComponents();
    }
    
    public novoFuncionario(int id) {
        this();
        this.id = id;
        this.setTitle("Alterar Contato");
        
        try{
            
            FuncionariosDao consultar = new FuncionariosDao();        
            Funcionarios funcionario = consultar.procurar(id);
            tf_nome.setText(funcionario.getNome());
            tf_sobrenome.setText(funcionario.getSobrenome());
            tf_cpf.setText(funcionario.getCpf());
            tf_telefone.setText(funcionario.getTelefone());
            tf_login.setText(funcionario.getLogin());
            tf_senha.setText(funcionario.getSenha());
            
            //JOptionPane.showMessageDialog(null, cliente.getIdEndereco());            
            
            EnderecoDao consultarEndereco = new EnderecoDao();        
            Endereco endereco = consultarEndereco.procurar(funcionario.getIdEndereco());
            tf_rua.setText(endereco.getRua());
            tf_numero.setText(endereco.getNumero());
            tf_bairro.setText(endereco.getBairro());
            tf_cidade.setText(endereco.getCidade());        
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Opss! Ocorreu um erro: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_login = new javax.swing.JTextField();
        tf_nome = new javax.swing.JTextField();
        tf_sobrenome = new javax.swing.JTextField();
        tf_cpf = new javax.swing.JTextField();
        tf_telefone = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_rua = new javax.swing.JTextField();
        tf_numero = new javax.swing.JTextField();
        tf_bairro = new javax.swing.JTextField();
        tf_senha = new javax.swing.JTextField();
        tf_cidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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
        jLabel4.setText("Ende");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(90, 10, 90, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Número:");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(50, 120, 100, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Rua:");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(50, 70, 52, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Bairro:");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(50, 170, 80, 20);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Senha:");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(50, 270, 90, 20);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cidade:");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(50, 220, 100, 20);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(360, 0, 180, 320);

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 380));
        jPanel5.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dados");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(70, 10, 110, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nome:");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(40, 70, 80, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sobrenome:");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(40, 120, 140, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CPF:");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(40, 170, 60, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ID:");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(40, 270, 40, 20);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Telefone:");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(40, 220, 110, 20);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 0, 180, 320);

        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Pessoais");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 10, 160, 30);

        tf_login.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_login.setForeground(new java.awt.Color(0, 102, 204));
        tf_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_loginMouseClicked(evt);
            }
        });
        jPanel2.add(tf_login);
        tf_login.setBounds(20, 270, 140, 21);

        tf_nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_nome.setForeground(new java.awt.Color(0, 102, 204));
        tf_nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_nomeMouseClicked(evt);
            }
        });
        jPanel2.add(tf_nome);
        tf_nome.setBounds(20, 70, 140, 21);

        tf_sobrenome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_sobrenome.setForeground(new java.awt.Color(0, 102, 204));
        tf_sobrenome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_sobrenomeMouseClicked(evt);
            }
        });
        jPanel2.add(tf_sobrenome);
        tf_sobrenome.setBounds(20, 120, 140, 21);

        tf_cpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_cpf.setForeground(new java.awt.Color(0, 102, 204));
        tf_cpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_cpfMouseClicked(evt);
            }
        });
        jPanel2.add(tf_cpf);
        tf_cpf.setBounds(20, 170, 140, 21);

        tf_telefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_telefone.setForeground(new java.awt.Color(0, 102, 204));
        tf_telefone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_telefoneMouseClicked(evt);
            }
        });
        jPanel2.add(tf_telefone);
        tf_telefone.setBounds(20, 220, 140, 21);

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
        jLabel5.setText("reço");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(0, 0, 80, 50);

        tf_rua.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_rua.setForeground(new java.awt.Color(0, 102, 204));
        tf_rua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_ruaMouseClicked(evt);
            }
        });
        jPanel7.add(tf_rua);
        tf_rua.setBounds(20, 70, 140, 21);

        tf_numero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_numero.setForeground(new java.awt.Color(0, 102, 204));
        tf_numero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_numeroMouseClicked(evt);
            }
        });
        jPanel7.add(tf_numero);
        tf_numero.setBounds(20, 120, 140, 21);

        tf_bairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_bairro.setForeground(new java.awt.Color(0, 102, 204));
        tf_bairro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_bairroMouseClicked(evt);
            }
        });
        jPanel7.add(tf_bairro);
        tf_bairro.setBounds(20, 170, 140, 21);

        tf_senha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_senha.setForeground(new java.awt.Color(0, 102, 204));
        tf_senha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_senhaMouseClicked(evt);
            }
        });
        jPanel7.add(tf_senha);
        tf_senha.setBounds(20, 270, 140, 21);

        tf_cidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_cidade.setForeground(new java.awt.Color(0, 102, 204));
        tf_cidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_cidadeMouseClicked(evt);
            }
        });
        jPanel7.add(tf_cidade);
        tf_cidade.setBounds(20, 220, 140, 21);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(540, 0, 190, 320);

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

    private void tf_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_loginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_loginMouseClicked

    private void tf_nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomeMouseClicked

    private void tf_sobrenomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_sobrenomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_sobrenomeMouseClicked

    private void tf_cpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cpfMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cpfMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void tf_ruaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_ruaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ruaMouseClicked

    private void tf_numeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_numeroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_numeroMouseClicked

    private void tf_bairroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_bairroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_bairroMouseClicked

    private void tf_senhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_senhaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_senhaMouseClicked

    private void tf_telefoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_telefoneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_telefoneMouseClicked

    private void tf_cidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cidadeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cidadeMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        Funcionarios funcionarios = new Funcionarios();
        Endereco endereco = new Endereco();
        if (id == -1){
        try {
            endereco.setRua(tf_rua.getText());
            endereco.setNumero(tf_numero.getText());
            endereco.setBairro(tf_bairro.getText());
            endereco.setCidade(tf_cidade.getText());

            EnderecoDao cadastrarEndereco = new EnderecoDao();
            endereco = cadastrarEndereco.inserir(endereco);

            //JOptionPane.showMessageDialog(this, "Endereço Cadastrado    TIRAR");
            
            funcionarios.setNome(tf_nome.getText());
            funcionarios.setCpf(tf_cpf.getText());
            funcionarios.setSobrenome(tf_sobrenome.getText());
            funcionarios.setTelefone(tf_telefone.getText());
            funcionarios.setLogin(tf_login.getText());
            funcionarios.setSenha(tf_senha.getText());
            funcionarios.setIdEndereco(endereco.getId());

            FuncionariosDao cadastrar = new FuncionariosDao();
            funcionarios = cadastrar.inserir(funcionarios);

            JOptionPane.showMessageDialog(this, "Registro cadastrado");
            dispose();
                        

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: \n"
                    + e.getMessage());
            }
        }
        else{
            try {
                FuncionariosDao funcionarioProcurar = new FuncionariosDao();
                Funcionarios idEndereco = funcionarioProcurar.procurar(id);
                endereco.setId(idEndereco.getIdEndereco());
                endereco.setRua(tf_rua.getText());
                endereco.setNumero(tf_numero.getText());
                endereco.setBairro(tf_bairro.getText());
                endereco.setCidade(tf_cidade.getText());
                EnderecoDao enderecoAlterar = new EnderecoDao();
                endereco = enderecoAlterar.alterar(endereco);
                //JOptionPane.showMessageDialog(this, "Endereco alterado!");
                
                funcionarios.setId(id);
                funcionarios.setNome(tf_nome.getText());
                funcionarios.setCpf(tf_cpf.getText());
                funcionarios.setSobrenome(tf_sobrenome.getText());
                funcionarios.setTelefone(tf_telefone.getText());
                funcionarios.setLogin(tf_login.getText());
                funcionarios.setSenha(tf_senha.getText());
                funcionarios.setIdEndereco(endereco.getId());
                
                FuncionariosDao funcionarioAlterar = new FuncionariosDao();
                funcionarios = funcionarioAlterar.alterar(funcionarios);
                JOptionPane.showMessageDialog(this, "Registro alterado!");
                dispose();
                
            }
            
            catch(Exception e) {
                JOptionPane.showMessageDialog(this, "Erro na alteração do registro:\n"
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
            java.util.logging.Logger.getLogger(novoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(novoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(novoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(novoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new novoFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTextField tf_bairro;
    private javax.swing.JTextField tf_cidade;
    private javax.swing.JTextField tf_cpf;
    private javax.swing.JTextField tf_login;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_numero;
    private javax.swing.JTextField tf_rua;
    private javax.swing.JTextField tf_senha;
    private javax.swing.JTextField tf_sobrenome;
    private javax.swing.JTextField tf_telefone;
    // End of variables declaration//GEN-END:variables
}