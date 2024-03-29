/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleos;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author mest2
 */
public class Login extends javax.swing.JFrame {
    
    
    
    public boolean correto = false;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        pwSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setIconImage(new ImageIcon(getClass().getResource("imagens/icone.png")).
            getImage());
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        lblUsuario.setText("Usuário:");

        txtUsuario.setToolTipText("");
        txtUsuario.setMaximumSize(new java.awt.Dimension(6, 20));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });

        lblSenha.setText("Senha:");

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleos/imagens/Entrar button.png"))); // NOI18N
        btnEntrar.setBorder(null);
        btnEntrar.setBorderPainted(false);
        btnEntrar.setMaximumSize(new java.awt.Dimension(655, 45));
        btnEntrar.setPreferredSize(new java.awt.Dimension(655, 45));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleos/imagens/foto login.png"))); // NOI18N

        pwSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwSenhaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(pwSenha))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(pwSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        txtUsuario.getAccessibleContext().setAccessibleDescription("Digite aqui o usuário!");
        btnEntrar.getAccessibleContext().setAccessibleName("Entrar");
        btnEntrar.getAccessibleContext().setAccessibleDescription("Entrar");
        lblFoto.getAccessibleContext().setAccessibleName("foto");

        getAccessibleContext().setAccessibleDescription("Tela de login");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
       
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
       
        char[] k = pwSenha.getPassword();
        String key = String.valueOf(k);
        
        
        if(new ConnectDB().login(txtUsuario.getText(),key )){
            
                Principal p = new Principal();
                p.setVisible(true);
                dispose();
            }
        
       
        
            
        
    }//GEN-LAST:event_btnEntrarActionPerformed
    private void jPasswordKeyPressed(java.awt.event.KeyEvent evt) {                                     
            if(evt.getKeyCode() == evt.VK_ENTER){  
                char[] k = pwSenha.getPassword();
        String key = String.valueOf(k);
        
        
        if(new ConnectDB().login(txtUsuario.getText(),key )){
            
                Principal p = new Principal();
                p.setVisible(true);
                dispose();
            }
        
       
            } 
    }
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
                                            
            if(evt.getKeyCode() == evt.VK_ENTER){  
                char[] k = pwSenha.getPassword();
        String key = String.valueOf(k);
        
        
        if(new ConnectDB().login(txtUsuario.getText(),key )){
            
                Principal p = new Principal();
                p.setVisible(true);
                dispose();
            
        
       
            } 
    }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void pwSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwSenhaKeyPressed
                                           
            if(evt.getKeyCode() == evt.VK_ENTER){  
                char[] k = pwSenha.getPassword();
        String key = String.valueOf(k);
        
        
        if(new ConnectDB().login(txtUsuario.getText(),key )){
            
                Principal p = new Principal();
                p.setVisible(true);
                dispose();
            
        
       
            } 
    }
    }//GEN-LAST:event_pwSenhaKeyPressed

    /**
     * @param args the command line arguments
     */
    public void init() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
           
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
                
            }
        });
    }

    public static void main (String args[]){
        new Login().setVisible(true);
        
    }
    
   /* private String [] pegaDados(String login){
        String valores[] = new String[2];
        //a conexao só funciona dentro de algumas funcoes, por enquanto só funcionou no metodo main
         valores = new ConnectDB().pegaDados(login);
         return valores;
    }*/
    
    private boolean validaSenha(String senha){
        if(senha.equals("123") || senha.equals("")){
            return true;
        }else{
            System.out.println(senha);
            return false;
        }
    }
    
    private boolean validaUsuario(String usuario){
        String user = "MEST";
        usuario = usuario.toUpperCase();
        if(usuario.equals(user) || usuario.equals("")){
            return true;
        }else{
            System.out.println("-"+ usuario + "-");
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pwSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
