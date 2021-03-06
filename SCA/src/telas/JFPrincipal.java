/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import bancodedados.Bancos;
import bancodedados.BaseUsuariosLocal;
import java.awt.Container;
import javax.swing.JOptionPane;

/**
 * Classe principal do projeto
 *
 * @author pfsel
 */
public class JFPrincipal extends javax.swing.JFrame {

    private int aut = 0;
    private boolean preenchido[];
    public Container painelPrincipal;

    /**
     * Creates new form JFPrincipal
     */
    public JFPrincipal() {
        initComponents();
        this.preenchido = new boolean[2];
        this.painelPrincipal = this.getContentPane();
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de controle de alunos");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLUsuário = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jBLogin = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();
        jPFSenha = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLUsuário.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLUsuário.setText("Usuário:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Senha:");

        jTFUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFUsuarioKeyReleased(evt);
            }
        });

        jBLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBLogin.setText("Login");
        jBLogin.setEnabled(false);
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jPFSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPFSenhaKeyReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/if4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCadastrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCadastrar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFUsuarioKeyReleased
        this.campoPreenchido(jTFUsuario.getText(), 0);
        this.ativaLogin();
    }//GEN-LAST:event_jTFUsuarioKeyReleased

    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginActionPerformed

        Bancos b = new BaseUsuariosLocal(this.jTFUsuario.getText(), this.jPFSenha.getText());

        b.consultar();
        if (b.autenticado()) {
            JPSelecao painel = new JPSelecao(this);
            painel.setVisible(true);
            painel.setBounds(0, 0, this.getWidth(), this.getHeight());
            this.setContentPane(painel);
            aut = 0;

        } else {
            JOptionPane.showMessageDialog(this, "Usuário não encontrado",
                    "Opa!",
                    JOptionPane.WARNING_MESSAGE);
            aut++;
        }
        if (aut == 2) {
            JOptionPane.showMessageDialog(this, "O aplicativo irá finalizar se você"
                    + " errar novamente",
                    "Opa!",
                    JOptionPane.WARNING_MESSAGE);

        }
        if (aut == 3) {
            JOptionPane.showMessageDialog(this, "O sistema será encerrado",
                    "Opa!",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

    }//GEN-LAST:event_jBLoginActionPerformed

    private void jPFSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPFSenhaKeyReleased
        this.campoPreenchido(jTFUsuario.getText(), 1);
        this.ativaLogin();
    }//GEN-LAST:event_jPFSenhaKeyReleased

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        JPCadastro painel = new JPCadastro(this);
        painel.setVisible(true);
        painel.setBounds(0, 0, this.getWidth(), this.getHeight());
        this.setContentPane(painel);


    }//GEN-LAST:event_jBCadastrarActionPerformed
    
    /**
     * método para a troca de painel entre as telas de login e cadastro
     */
    public void trocaPainel() {
        painelPrincipal.setBounds(0, 0, this.getWidth(), this.getHeight());
        painelPrincipal.setVisible(true);
        this.setContentPane(painelPrincipal);

    }
    
    /**
     * método que libera o botão de login
     */
    public void ativaLogin() {
        int aux = 0;
        for (int i = 0; i < 2; i++) {
            if (this.preenchido[i] == true) {
                aux++;
            }
        }
        if (aux == 2) {
            jBLogin.setEnabled(true);
        }
    }
    
    /**
     * método que verifica o conteudo dos campos de texto
     * @param texto = texto escrito
     * @param id = identificação do campo
     */
    private void campoPreenchido(String texto, int id) {
        this.preenchido[id] = texto.length() > 0;

    }

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLogin;
    private javax.swing.JLabel jLUsuário;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
