package index;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class Welcome extends javax.swing.JFrame {

    public Welcome() {
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

        LoadingValue = new javax.swing.JLabel();
        melanjutkan = new javax.swing.JPanel();
        tulis = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LoadingLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        LoadingValue.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        LoadingValue.setForeground(new java.awt.Color(255, 255, 255));
        LoadingValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoadingValue.setText("0%");

        melanjutkan.setBackground(new java.awt.Color(182, 220, 255));
        melanjutkan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                melanjutkanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                melanjutkanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                melanjutkanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                melanjutkanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                melanjutkanMouseReleased(evt);
            }
        });

        tulis.setFont(new java.awt.Font("Wide Latin", 3, 14)); // NOI18N
        tulis.setText("LANJUT");
        tulis.setToolTipText("");
        tulis.setPreferredSize(new java.awt.Dimension(200, 100));

        javax.swing.GroupLayout melanjutkanLayout = new javax.swing.GroupLayout(melanjutkan);
        melanjutkan.setLayout(melanjutkanLayout);
        melanjutkanLayout.setHorizontalGroup(
            melanjutkanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, melanjutkanLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(tulis, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        melanjutkanLayout.setVerticalGroup(
            melanjutkanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(melanjutkanLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(tulis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        melanjutkan.getAccessibleContext().setAccessibleName("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/X PNG.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 40, 40));

        LoadingLabel.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        LoadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoadingLabel.setText("Loading...");
        LoadingLabel.setPreferredSize(new java.awt.Dimension(1336, 14));
        jPanel1.add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 720, 1290, 30));

        LoadingBar.setBackground(new java.awt.Color(234,234,234));
        LoadingBar.setForeground(new java.awt.Color(51,153,255));
        LoadingBar.setToolTipText("");
        LoadingBar.setAutoscrolls(true);
        LoadingBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LoadingBar.setEnabled(false);
        LoadingBar.setFocusable(false);
        LoadingBar.setName(""); // NOI18N
        LoadingBar.setStringPainted(true);
        jPanel1.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 1370, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/1366x768/WELCOME.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1368, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1368, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void melanjutkanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_melanjutkanMouseEntered
        // TODO add your handling code here:
        melanjutkan.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_melanjutkanMouseEntered

    private void melanjutkanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_melanjutkanMouseExited
        // TODO add your handling code here:
        melanjutkan.setBackground(new Color(182, 220, 255));
    }//GEN-LAST:event_melanjutkanMouseExited

    private void melanjutkanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_melanjutkanMousePressed
        // TODO add your handling code here:
        melanjutkan.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_melanjutkanMousePressed

    private void melanjutkanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_melanjutkanMouseReleased
        // TODO add your handling code here:
        melanjutkan.setBackground(new Color(182, 220, 255));
    }//GEN-LAST:event_melanjutkanMouseReleased

    private void melanjutkanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_melanjutkanMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new FORM_SwitchUser().setVisible(true);
    }//GEN-LAST:event_melanjutkanMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Welcome().setVisible(true);
//            }
//        });
        Welcome w = new Welcome();
        w.setForeground(new Color(69, 124, 235));
        w.setBackground(new Color(255, 255, 255));
        w.setVisible(true);
        try {
            for (int i = 0; i <= 1000; i++) {
                Thread.sleep(131);
                w.LoadingValue.setText(i + "%");

                if (i == 10) {
                    w.LoadingLabel.setText("Checking XAMPP..");
                }
                if (i == 32) {
                    w.LoadingLabel.setText("XAMPP ON");
                }
                if (i == 60) {
                    w.LoadingLabel.setText("Add asset/...");
                }
                if (i == 65) {
                    w.LoadingLabel.setText("Add index/...");
                }
                if (i == 75) {
                    w.LoadingLabel.setText("Add Connection/Connect/...");
                }
                if (i == 90) {
                    w.LoadingLabel.setText("Almost finish..");
                }
                if (i == 100) {
                    w.LoadingLabel.setText("Running program Switch User..");
                }
                if (i == 110) {
                    w.LoadingLabel.setText("DONE");
                }
                if (i == 130) {
                    w.LoadingLabel.setText("DONE");
                    new FORM_SwitchUser().setVisible(true);
                    w.dispose();
                }
                w.LoadingBar.setValue(i);
            }
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JProgressBar LoadingBar = new javax.swing.JProgressBar();
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel melanjutkan;
    private javax.swing.JLabel tulis;
    // End of variables declaration//GEN-END:variables
}
