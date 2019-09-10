/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleos;

import java.awt.Component;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 *
 * @author mest2
 */
public class Principal extends javax.swing.JFrame {

   

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jToolBar1 = new javax.swing.JToolBar();
        btnNewOS = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnConsultOS = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnNewClient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnConsultClient = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        btnUserAdm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal - Controle de Ordem de Serviço");
        setIconImage(new ImageIcon(getClass().getResource("imagens/icone.png")).
            getImage());

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnNewOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleos/imagens/nova os.png"))); // NOI18N
        btnNewOS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNewOS.setFocusable(false);
        btnNewOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNewOS.setMaximumSize(new java.awt.Dimension(70, 70));
        btnNewOS.setMinimumSize(new java.awt.Dimension(70, 70));
        btnNewOS.setPreferredSize(new java.awt.Dimension(70, 70));
        btnNewOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNewOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOSActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNewOS);
        btnNewOS.getAccessibleContext().setAccessibleName("Nova OS");
        btnNewOS.getAccessibleContext().setAccessibleDescription("Nova OS");

        jLabel3.setText("  ");
        jToolBar1.add(jLabel3);

        btnConsultOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleos/imagens/pesquisa os.png"))); // NOI18N
        btnConsultOS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultOS.setFocusable(false);
        btnConsultOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultOS.setMaximumSize(new java.awt.Dimension(70, 70));
        btnConsultOS.setMinimumSize(new java.awt.Dimension(70, 70));
        btnConsultOS.setPreferredSize(new java.awt.Dimension(70, 70));
        btnConsultOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultOSActionPerformed(evt);
            }
        });
        jToolBar1.add(btnConsultOS);
        btnConsultOS.getAccessibleContext().setAccessibleName("Consultar OS");
        btnConsultOS.getAccessibleContext().setAccessibleDescription("Consultar OS");

        jLabel2.setText("  ");
        jToolBar1.add(jLabel2);

        btnNewClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleos/imagens/new user.png"))); // NOI18N
        btnNewClient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNewClient.setFocusable(false);
        btnNewClient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNewClient.setMaximumSize(new java.awt.Dimension(70, 70));
        btnNewClient.setMinimumSize(new java.awt.Dimension(70, 70));
        btnNewClient.setPreferredSize(new java.awt.Dimension(70, 70));
        btnNewClient.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewClientActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNewClient);
        btnNewClient.getAccessibleContext().setAccessibleName("Novo Cliente");
        btnNewClient.getAccessibleContext().setAccessibleDescription("Novo Cliente");

        jLabel1.setText("  ");
        jToolBar1.add(jLabel1);

        btnConsultClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleos/imagens/user search.png"))); // NOI18N
        btnConsultClient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultClient.setFocusable(false);
        btnConsultClient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultClient.setMaximumSize(new java.awt.Dimension(79, 70));
        btnConsultClient.setMinimumSize(new java.awt.Dimension(79, 70));
        btnConsultClient.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultClientActionPerformed(evt);
            }
        });
        jToolBar1.add(btnConsultClient);
        btnConsultClient.getAccessibleContext().setAccessibleName("Cosulta Cliente");
        btnConsultClient.getAccessibleContext().setAccessibleDescription("Cosulta Cliente");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        btnUserAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleos/imagens/gerenciamento.png"))); // NOI18N
        btnUserAdm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUserAdm.setFocusable(false);
        btnUserAdm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUserAdm.setMaximumSize(new java.awt.Dimension(70, 70));
        btnUserAdm.setMinimumSize(new java.awt.Dimension(70, 70));
        btnUserAdm.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUserAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserAdmActionPerformed(evt);
            }
        });
        jToolBar2.add(btnUserAdm);
        btnUserAdm.getAccessibleContext().setAccessibleName("Gerenciamento de Usuários");
        btnUserAdm.getAccessibleContext().setAccessibleDescription("Gerenciamento de Usuários");

        jLabel4.setText("  ");
        jToolBar2.add(jLabel4);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleos/imagens/sair.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(70, 70));
        jButton1.setMinimumSize(new java.awt.Dimension(70, 70));
        jButton1.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton1);
        jButton1.getAccessibleContext().setAccessibleName("Sair");
        jButton1.getAccessibleContext().setAccessibleDescription("Sair");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOSActionPerformed
           NovaOS n = new NovaOS();
           n.setVisible(true);
    }//GEN-LAST:event_btnNewOSActionPerformed

    private void btnNewClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewClientActionPerformed
        NovoCliente n = new NovoCliente();
        n.setVisible(true);
    }//GEN-LAST:event_btnNewClientActionPerformed

    private void btnConsultClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultClientActionPerformed
        ConsultaCliente p = new ConsultaCliente();
        p.setVisible(true);
    }//GEN-LAST:event_btnConsultClientActionPerformed

    private void btnUserAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserAdmActionPerformed
        new GerenciamentoDeUsuarios().setVisible(true);
    }//GEN-LAST:event_btnUserAdmActionPerformed

    private void btnConsultOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultOSActionPerformed
        ConsultaOS c = new ConsultaOS();
        c.setVisible(true);
    }//GEN-LAST:event_btnConsultOSActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JDialog.setDefaultLookAndFeelDecorated (true);
        Component nulo = null;
        int resposta = JOptionPane.showConfirmDialog (nulo, "Deseja continuar?" , "Confirmar Logoff" ,
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.NO_OPTION) {
            System.out.println ( "Botão não clicado" );
            } else  if (resposta == JOptionPane.YES_OPTION) {
                Login l = new Login();
                l.setVisible(true);
                dispose();
            System.out.println ( "Botão Sim clicado" );
            } else  if (resposta == JOptionPane.CLOSED_OPTION) {
            System.out.println ( "JOptionPane fechado" );
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    void init() {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultClient;
    private javax.swing.JButton btnConsultOS;
    private javax.swing.JButton btnNewClient;
    private javax.swing.JButton btnNewOS;
    private javax.swing.JButton btnUserAdm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables

    
}
