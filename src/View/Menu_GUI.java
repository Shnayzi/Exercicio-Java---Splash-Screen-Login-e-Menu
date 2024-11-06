/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Menu_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Menu_GUI
     */
    public Menu_GUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        cadastrar_btn = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Calculadora_btn = new javax.swing.JMenuItem();
        Bloco_btn = new javax.swing.JMenuItem();
        nave_btn = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        encerrar_btn = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        Help_btn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jMenu1.setText("Cliente");

        jMenu5.setText("Relatorio");

        jMenuItem1.setText("Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItem5.setText("produto");
        jMenu5.add(jMenuItem5);

        jMenu1.add(jMenu5);

        cadastrar_btn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        cadastrar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icno.png"))); // NOI18N
        cadastrar_btn.setText("Cadastrar");
        cadastrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_btnActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrar_btn);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Produto");

        jMenuItem2.setText("jMenuItem2");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ferramentas");

        Calculadora_btn.setText("Calculadora");
        Calculadora_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculadora_btnActionPerformed(evt);
            }
        });
        jMenu3.add(Calculadora_btn);

        Bloco_btn.setText("Bloco de Notas");
        Bloco_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bloco_btnActionPerformed(evt);
            }
        });
        jMenu3.add(Bloco_btn);

        nave_btn.setText("navegador");
        nave_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nave_btnActionPerformed(evt);
            }
        });
        jMenu3.add(nave_btn);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sair");

        encerrar_btn.setText("Encerrar");
        encerrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encerrar_btnActionPerformed(evt);
            }
        });
        jMenu4.add(encerrar_btn);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Ajuda");

        Help_btn.setText("Help");
        Help_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Help_btnActionPerformed(evt);
            }
        });
        jMenu6.add(Help_btn);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(433, 316));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_btnActionPerformed
      JOptionPane.showMessageDialog(null, "Sem funcionamento");
    }//GEN-LAST:event_cadastrar_btnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void encerrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrar_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_encerrar_btnActionPerformed

    private void Calculadora_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculadora_btnActionPerformed
        try {
            Runtime.getRuntime().exec("cmd.exe /c start calc.exe ");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro P001, Calculadora não encontrada.");
        }
    }//GEN-LAST:event_Calculadora_btnActionPerformed

    private void Bloco_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bloco_btnActionPerformed
        try {
            Runtime.getRuntime().exec("cmd.exe /c start notepad.exe ");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro P002, Bloco de Notas não encontrada.");
        }
    }//GEN-LAST:event_Bloco_btnActionPerformed

    private void Help_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Help_btnActionPerformed
        // C:\help.pdf
        
        try {
            Runtime.getRuntime().exec("cmd.exe /c start C:\\help.pdf ");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro P003, help.pdf não encontrada.");
        }
    }//GEN-LAST:event_Help_btnActionPerformed

    private void nave_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nave_btnActionPerformed
         try {
            Runtime.getRuntime().exec("cmd.exe /c start chrome.exe guilhermeolialves.netlify.app ");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro P004, site não encontrada.");
        }
    }//GEN-LAST:event_nave_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Bloco_btn;
    private javax.swing.JMenuItem Calculadora_btn;
    private javax.swing.JMenuItem Help_btn;
    private javax.swing.JMenuItem cadastrar_btn;
    private javax.swing.JMenuItem encerrar_btn;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem nave_btn;
    // End of variables declaration//GEN-END:variables
}
