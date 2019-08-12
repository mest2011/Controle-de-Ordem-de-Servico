/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleos;

import javax.swing.ImageIcon;import javax.swing.JOptionPane;
/**
 *
 * @author mest2
 */
public class NovoCliente extends javax.swing.JFrame {

    /**
     * Creates new form NovoCliente
     */
    public NovoCliente() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblCpf = new javax.swing.JLabel();
        txtAddreesCli = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        txtCodCli = new javax.swing.JTextField();
        txtNomeCli = new javax.swing.JTextField();
        txtCpfCli = new javax.swing.JTextField();
        lblCod = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        FtxtDateOfBirdCli = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCityCli = new javax.swing.JTextField();
        ftxtCepCli = new javax.swing.JFormattedTextField();
        lblNumberCli = new javax.swing.JLabel();
        txtNumberCli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ftxtPhone = new javax.swing.JFormattedTextField();
        ftxtCelPhone = new javax.swing.JFormattedTextField();
        lblCadatroCliente = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Cliente - Cadastro");
        setIconImage(new ImageIcon(getClass().getResource("imagens/icone.png")).
            getImage());
        setMaximumSize(new java.awt.Dimension(923, 452));
        setMinimumSize(new java.awt.Dimension(923, 452));
        setPreferredSize(new java.awt.Dimension(923, 452));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCpf.setText("CPF:");

        lblAddress.setText("Endereço:");

        lblZipCode.setText("CEP:");

        lblDateOfBirth.setText("Data de nascimento:");

        txtCodCli.setEditable(false);

        lblCod.setText("Código:");

        lblName.setText("Nome:");

        try {
            FtxtDateOfBirdCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FtxtDateOfBirdCli.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Cidade:");

        try {
            ftxtCepCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblNumberCli.setText("Número:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("Celular:");

        try {
            ftxtPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ftxtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtPhoneActionPerformed(evt);
            }
        });

        try {
            ftxtCelPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCelPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCod)
                    .addComponent(lblName)
                    .addComponent(lblCpf)
                    .addComponent(lblDateOfBirth)
                    .addComponent(lblAddress)
                    .addComponent(jLabel2)
                    .addComponent(lblNumberCli))
                .addGap(18, 57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAddreesCli)
                    .addComponent(FtxtDateOfBirdCli)
                    .addComponent(txtCpfCli)
                    .addComponent(txtNomeCli)
                    .addComponent(txtCodCli)
                    .addComponent(txtCityCli)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNumberCli, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblZipCode)
                        .addGap(35, 35, 35)
                        .addComponent(ftxtCepCli, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ftxtPhone)
                    .addComponent(ftxtCelPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel3)
                                                    .addComponent(ftxtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblCod)
                                                        .addComponent(txtCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(ftxtCelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblCpf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FtxtDateOfBirdCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblDateOfBirth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAddreesCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCityCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ftxtCepCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblZipCode)
                        .addComponent(lblNumberCli)
                        .addComponent(txtNumberCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        lblCadatroCliente.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblCadatroCliente.setText("Cadastro de Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(585, 585, 585)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCadatroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblCadatroCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void ftxtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtPhoneActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        boolean campos=true;
        String[] dadosCliente = new String[9]; 
        
        dadosCliente[0]=txtNomeCli.getText();
        dadosCliente[1]=txtCpfCli.getText();
        dadosCliente[2]=new SubstituirCaracteres().tiraData(FtxtDateOfBirdCli.getText());
        dadosCliente[3]=txtAddreesCli.getText();
        dadosCliente[4]=txtCityCli.getText();
        dadosCliente[5]=txtNumberCli.getText();
        dadosCliente[6]=new SubstituirCaracteres().retiraCep(ftxtCepCli.getText());
        dadosCliente[7]=ftxtPhone.getText();
        dadosCliente[8]=ftxtCelPhone.getText();
        
        if (dadosCliente[0].equals("")) {
           JOptionPane.showMessageDialog(null, "Insira um nome! \n Campo nome em branco!", "Nome", JOptionPane.ERROR_MESSAGE);
           campos = false;
        }else{
            try {
                long testaCpf = Long.parseLong(dadosCliente[1]);
                } catch (Exception e) {
                    System.out.println(e);
                  JOptionPane.showMessageDialog(null, "Insira apenas números!", "CPF", JOptionPane.ERROR_MESSAGE);
                  campos = false;
                }
                  if (dadosCliente[1].equals("")) {
                    JOptionPane.showMessageDialog(null, "Insira um CPF!", "CPF", JOptionPane.ERROR_MESSAGE);
                    campos = false;
                }else
            if (dadosCliente[2].equals("    -  -  ")) {
            JOptionPane.showMessageDialog(null, "Insira uma data de nascimento!", "Data", JOptionPane.ERROR_MESSAGE);
            campos = false;
        }else
            if (dadosCliente[3].equals("")) {
            JOptionPane.showMessageDialog(null, "Insira um endereço!", "Endereço", JOptionPane.ERROR_MESSAGE);
            campos = false;
        }else
            if (dadosCliente[4].equals("")) {
            JOptionPane.showMessageDialog(null, "Insira uma cidade!", "Cidade", JOptionPane.ERROR_MESSAGE);
            campos = false;
        }else{
                try {
                   long testaNum = Long.parseLong(dadosCliente[5]);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Insira apenas números!", "Número da casa", JOptionPane.ERROR_MESSAGE);
                    campos = false;
                }
                if (dadosCliente[5].equals("")) {
                JOptionPane.showMessageDialog(null, "Insira um número!", "Número da casa", JOptionPane.ERROR_MESSAGE);
                campos = false;
            }else{
                    String testaif = new SubstituirCaracteres().apenasNumeros(dadosCliente[6]);
                try {
                   long testaCep = Long.parseLong(testaif);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Insira apenas números!", "Cep", JOptionPane.ERROR_MESSAGE);
                    campos = false;
                }
                if (testaif.equals("")) {
                JOptionPane.showMessageDialog(null, "Insira um Cep!", "Cep", JOptionPane.ERROR_MESSAGE);
                campos = false;
                }else{
                    try {
                       long testaFone = Long.parseLong(new SubstituirCaracteres().apenasNumeros(dadosCliente[7]));
                     } catch (Exception e) {
                         JOptionPane.showMessageDialog(null, "Insira apenas números!", "Telefone", JOptionPane.ERROR_MESSAGE);
                         campos = false;
                     }
                     if (new SubstituirCaracteres().apenasNumeros(dadosCliente[7]).equals("")) {
                     JOptionPane.showMessageDialog(null, "Insira um Telefone!", "Telefone", JOptionPane.ERROR_MESSAGE);
                     campos = false;
                     }else{
                        try {
                            long testaCell = Long.parseLong(new SubstituirCaracteres().apenasNumeros(dadosCliente[8]));
                         } catch (Exception e) {
                             JOptionPane.showMessageDialog(null, "Insira apenas números!", "Celular", JOptionPane.ERROR_MESSAGE);
                             campos = false;
                         }
                         if (new SubstituirCaracteres().apenasNumeros(dadosCliente[8]).equals("")) {
                         JOptionPane.showMessageDialog(null, "Insira um Celular!", "Celular", JOptionPane.ERROR_MESSAGE);
                         campos = false;
                         }    
                      }    
                }
        
            }
        }        } 
 
        
        if (campos) {
            new ConnectDB().incluirCliente(dadosCliente);
            txtNomeCli.setText("");
            txtCpfCli.setText("");
            FtxtDateOfBirdCli.setText("");
            txtAddreesCli.setText("");
            txtCityCli.setText("");
            txtNumberCli.setText("");
            ftxtCepCli.setText("");
            ftxtPhone.setText("");
            ftxtCelPhone.setText("");
        }
         
    }//GEN-LAST:event_btnSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void init() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoCliente().setVisible(true);
            }
        });
    }

        public static void main(String args[]){
            init();
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField FtxtDateOfBirdCli;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField ftxtCelPhone;
    private javax.swing.JFormattedTextField ftxtCepCli;
    private javax.swing.JFormattedTextField ftxtPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCadatroCliente;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumberCli;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField txtAddreesCli;
    private javax.swing.JTextField txtCityCli;
    private javax.swing.JTextField txtCodCli;
    private javax.swing.JTextField txtCpfCli;
    private javax.swing.JTextField txtNomeCli;
    private javax.swing.JTextField txtNumberCli;
    // End of variables declaration//GEN-END:variables
}