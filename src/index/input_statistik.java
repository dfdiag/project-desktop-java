package index;

import Connection.Connect;
import index.admin.Jasa;
import index.admin.Statistik;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class input_statistik extends javax.swing.JFrame {

    /**
     * Creates new form input_jasa
     */
    public input_statistik() {
        initComponents();
        tanggal();
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
        txt_pemasukan = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_PendapatanBersih = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_pengeluaran = new javax.swing.JTextField();
        txt_tanggal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_barang1 = new javax.swing.JTextArea();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(960, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_pemasukan.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jPanel1.add(txt_pemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 254, -1));

        btn_submit.setText("SUMBIT");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 110, 30));

        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/X PNG.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 30, 20));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 110, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("KETERANGAN");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 110, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setText("PENDAPATAN BERSIH");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 150, -1));

        txt_PendapatanBersih.setEditable(false);
        txt_PendapatanBersih.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txt_PendapatanBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PendapatanBersihActionPerformed(evt);
            }
        });
        jPanel2.add(txt_PendapatanBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 254, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setText("PEMASUKAN");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 110, -1));

        txt_pengeluaran.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txt_pengeluaran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pengeluaranKeyReleased(evt);
            }
        });
        jPanel2.add(txt_pengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 254, -1));

        txt_tanggal.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jPanel2.add(txt_tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 250, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel5.setText("TANGGAL");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 110, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel6.setText("PENGELUARAN");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 110, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 110, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Statistik");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 40));

        txt_barang1.setColumns(20);
        txt_barang1.setLineWrap(true);
        txt_barang1.setRows(5);
        txt_barang1.setWrapStyleWord(true);
        txt_barang1.setAutoscrolls(false);
        jScrollPane2.setViewportView(txt_barang1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 250, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 960, 450));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/InputJasaReal.jpg"))); // NOI18N
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void tanggal() {
        DateFormat tgl = new SimpleDateFormat("Y-M-d");
        String htgl = tgl.format(Calendar.getInstance().getTime());
        txt_tanggal.setText(htgl);
    }

    private void kosong() {
        txt_barang1.setText(null);
        txt_PendapatanBersih.setText(null);
        txt_pemasukan.setText(null);
        txt_pengeluaran.setText(null);
        txt_tanggal.setText(null);
    }
    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        kosong();
        tanggal();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void kembali() {
        this.setVisible(false);
        try {
            new DashboardPegawaiJasa().setVisible(true);
        } catch (Exception e) {
        }
    }

    private void hitung() {
        long a = Long.parseLong(txt_pemasukan.getText()),
                b = Long.parseLong(txt_pengeluaran.getText()),
                pendapatanBersih;
        pendapatanBersih = (a - b);
        txt_PendapatanBersih.setText("" + pendapatanBersih);
    }


    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txt_PendapatanBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PendapatanBersihActionPerformed
    }//GEN-LAST:event_txt_PendapatanBersihActionPerformed

    private void txt_pengeluaranKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pengeluaranKeyReleased
        // TODO add your handling code here:
        hitung();
    }//GEN-LAST:event_txt_pengeluaranKeyReleased

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO `statistik` (No, tanggal, nama_barang, biaya_pengeluaran, biaya_pemasukan, pendapatan_bersih) VALUES("
                    + "NULL,'" + txt_tanggal.getText() + "','" + txt_barang1.getText() + "','" + txt_pengeluaran.getText() + "','" + txt_pemasukan.getText() + "','" + txt_PendapatanBersih.getText() + "');";
            java.sql.Connection conn = (Connection) Connect.ConfigDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "berhasill");
            this.dispose();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_submitActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input_jasa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new input_statistik().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_PendapatanBersih;
    private javax.swing.JTextArea txt_barang1;
    private javax.swing.JTextField txt_pemasukan;
    private javax.swing.JTextField txt_pengeluaran;
    private javax.swing.JTextField txt_tanggal;
    // End of variables declaration//GEN-END:variables

}
