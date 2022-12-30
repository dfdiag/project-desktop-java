/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package index;

import com.mysql.cj.jdbc.Driver;
import Connection.Connect;
import index.admin.Jasa;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yaya
 */
public class edit_jasa extends javax.swing.JFrame {

    /**
     * Creates new form input_jasa
     */
    public edit_jasa() {
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

        btn_nama = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txt_nama = new javax.swing.JTextField();
        txt_telepon = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        txt_biaya = new javax.swing.JTextField();
        txt_tanggal = new javax.swing.JTextField();
        btn_submit1 = new javax.swing.JButton();
        cbStatus = new javax.swing.JComboBox<>();
        btn_reset = new javax.swing.JButton();
        cbJenisLaundry = new javax.swing.JComboBox<>();
        txt_harga = new javax.swing.JTextField();
        txt_beratBarang = new javax.swing.JTextField();
        txt_no = new javax.swing.JTextField();
        btn_no = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ButtonClose = new javax.swing.JLabel();
        btn_hitung = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txt_kembali = new javax.swing.JTextField();
        txt_bayar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_dataPakaian1 = new javax.swing.JTextArea();
        BG = new javax.swing.JLabel();

        btn_nama.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btn_nama.setText("CEK");
        btn_nama.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_nama.setIconTextGap(0);
        btn_nama.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_namaActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setPreferredSize(new java.awt.Dimension(960, 540));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nama.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 230, -1));

        txt_telepon.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jPanel2.add(txt_telepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 230, -1));

        txt_alamat.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jPanel2.add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 230, -1));

        txt_biaya.setEditable(false);
        txt_biaya.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jPanel2.add(txt_biaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 220, -1));

        txt_tanggal.setEditable(false);
        txt_tanggal.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jPanel2.add(txt_tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 220, -1));

        btn_submit1.setText("SUMBIT");
        btn_submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submit1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_submit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 110, 30));

        cbStatus.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "diambil", "progress" }));
        jPanel2.add(cbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 120, 20));

        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel2.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 110, 30));

        cbJenisLaundry.setFont(new java.awt.Font("Rockwell", 0, 11)); // NOI18N
        cbJenisLaundry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilih", "kering", "mamel" }));
        cbJenisLaundry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJenisLaundryActionPerformed(evt);
            }
        });
        jPanel2.add(cbJenisLaundry, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 100, -1));

        txt_harga.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jPanel2.add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 100, -1));

        txt_beratBarang.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txt_beratBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_beratBarangActionPerformed(evt);
            }
        });
        jPanel2.add(txt_beratBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 120, -1));

        txt_no.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jPanel2.add(txt_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 110, -1));

        btn_no.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btn_no.setText("CEK NO");
        btn_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_noActionPerformed(evt);
            }
        });
        jPanel2.add(btn_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 150, 80, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("/KG");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        ButtonClose.setForeground(new java.awt.Color(0, 51, 51));
        ButtonClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/X PNG.png"))); // NOI18N
        ButtonClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCloseMouseClicked(evt);
            }
        });
        jPanel2.add(ButtonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        btn_hitung.setText("HITUNG");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });
        jPanel2.add(btn_hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 90, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Bayar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Kembali");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 100, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Berat Barang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 120, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 90, 30));

        txt_kembali.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jPanel2.add(txt_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 210, -1));

        txt_bayar.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txt_bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bayarKeyReleased(evt);
            }
        });
        jPanel2.add(txt_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 210, -1));

        txt_dataPakaian1.setColumns(20);
        txt_dataPakaian1.setLineWrap(true);
        txt_dataPakaian1.setRows(5);
        txt_dataPakaian1.setWrapStyleWord(true);
        txt_dataPakaian1.setAutoscrolls(false);
        jScrollPane2.setViewportView(txt_dataPakaian1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 220, 100));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/EditJasa.jpg"))); // NOI18N
        jPanel2.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_namaActionPerformed
        // TODO add your handling code here:
        try {
            java.sql.Connection conn = (Connection) Connect.ConfigDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery("SELECT * FROM data_pelanggan " + " WHERE nama LIKE '%" + txt_nama.getText() + "%'");
            if (res.next()) {
                btn_submit1.setEnabled(true);
                txt_no.setText(res.getString("no"));
                txt_nama.setText(res.getString("nama"));
                txt_telepon.setText(res.getString("telepon"));
                txt_alamat.setText(res.getString("alamat"));
                txt_beratBarang.setText(res.getString("berat_barang"));
                cbJenisLaundry.setSelectedItem(res.getString("jenis_laundry"));
                cbStatus.setSelectedItem(res.getString("status"));
                txt_dataPakaian1.setText(res.getString("data_pakaian"));
                //                java.sql.PreparedStatement pst = conn.createStatement();
                //                pst.execute();
            } else {
                JOptionPane.showMessageDialog(this, "NO salah");
                btn_submit1.setEnabled(false);
                txt_nama.setText("");
                txt_telepon.setText("");
                txt_alamat.setText("");
                txt_beratBarang.setText("");
                cbJenisLaundry.setSelectedIndex(0);
                cbStatus.setSelectedIndex(0);
                txt_dataPakaian1.setText("");
                txt_nama.requestFocus();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_namaActionPerformed

    private void btn_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_noActionPerformed
        // TODO add your handling code here:
        try {
            java.sql.Connection conn = (Connection) Connect.ConfigDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery("SELECT * FROM data_pelanggan " + " WHERE no='" + txt_no.getText() + "'");
            if (res.next()) {
                btn_submit1.setEnabled(true);
                //txt_no.setText(res.getString("no"));
                txt_nama.setText(res.getString("nama"));
                txt_telepon.setText(res.getString("telepon"));
                txt_alamat.setText(res.getString("alamat"));
                txt_beratBarang.setText(res.getString("berat_barang"));
                cbJenisLaundry.setSelectedItem(res.getString("jenis_laundry"));
                cbStatus.setSelectedItem(res.getString("status"));
                txt_dataPakaian1.setText(res.getString("data_pakaian"));
                txt_tanggal.setText(res.getString("tanggal"));
                txt_biaya.setText(res.getString("biaya"));
                txt_bayar.setText(res.getString("bayar"));
                txt_kembali.setText(res.getString("kembali"));
            } else {
                JOptionPane.showMessageDialog(this, "NO salah");
                btn_submit1.setEnabled(false);
                txt_nama.setText("");
                txt_telepon.setText("");
                txt_alamat.setText("");
                txt_beratBarang.setText("");
                cbJenisLaundry.setSelectedIndex(0);
                cbStatus.setSelectedIndex(0);
                txt_dataPakaian1.setText("");
                txt_no.requestFocus();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_noActionPerformed

    private void txt_beratBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_beratBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_beratBarangActionPerformed

    private void cbJenisLaundryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJenisLaundryActionPerformed
        // TODO add your handling code here:

        switch (cbJenisLaundry.getSelectedIndex()) {
            case 0:
                txt_harga.setText("");
                txt_biaya.setText("");
                break;
            case 1:
                txt_harga.setText("4000");
                break;
            case 2:
                txt_harga.setText("3500");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cbJenisLaundryActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submit1ActionPerformed
        // TODO add your handling code here:
        try {
            String sql = " UPDATE data_pelanggan SET nama='" + txt_nama.getText() + "',"
                    + "telepon='" + txt_telepon.getText() + "',"
                    + "alamat='" + txt_alamat.getText() + "',"
                    + "berat_barang='" + txt_beratBarang.getText() + "',"
                    + "jenis_laundry ='" + cbJenisLaundry.getSelectedItem() + "',"
                    + "harga ='" + txt_harga.getText() +"',"
                    + "biaya='" + txt_biaya.getText() + "',"
                    + "bayar='" + txt_bayar.getText() + "',"
                    + "kembali='" + txt_kembali.getText() + "',"
                    + "status='" + cbStatus.getSelectedItem() + "',"
                    + "tanggal='" + txt_tanggal.getText() + "',"
                    + "data_pakaian='" + txt_dataPakaian1.getText() + "'"
                    + "WHERE data_pelanggan.no='" + txt_no.getText() + "'";
            java.sql.Connection conn = (Connection) Connect.ConfigDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Perubahan data berhasil");
            this.dispose();
        } catch (HeadlessException | SQLException e) {
            System.out.println("koneksi gagal" + e.toString());
        }
    }//GEN-LAST:event_btn_submit1ActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void ButtonCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ButtonCloseMouseClicked

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        total_biaya();
    }//GEN-LAST:event_btn_hitungActionPerformed

    private void txt_bayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bayarKeyReleased
        kembalian(); // menghitung inputan kembalian
    }//GEN-LAST:event_txt_bayarKeyReleased

    public void tanggal() {
        DateFormat tgl = new SimpleDateFormat("Y-M-d k:m:s");
        String htgl = tgl.format(Calendar.getInstance().getTime());
        txt_tanggal.setText(htgl);
    }

        private void kembalian(){
        if (txt_biaya.getText().isEmpty()){                 //jika data berat kosong maka menampilkan informasi berat barang belum diisi
            JOptionPane.showMessageDialog(null, "Berat Barang belum diisi");
        }else {
            double total_biaya = Double.parseDouble(txt_biaya.getText()),
                    bayar = Double.parseDouble(txt_bayar.getText()),
                    kembaliannya;
            kembaliannya = (bayar - total_biaya);
            txt_kembali.setText("" + kembaliannya);
            tanggal();
        }
    }
        
    private void kosong() {
        txt_no.setText(null);
        txt_nama.setText(null);
        txt_telepon.setText(null);
        txt_alamat.setText(null);
        txt_harga.setText(null);
        txt_beratBarang.setText(null);
        cbJenisLaundry.setSelectedIndex(0);
        txt_biaya.setText(null);
        txt_bayar.setText(null);
        txt_kembali.setText(null);
        txt_tanggal.setText(null);
        cbStatus.setSelectedIndex(0);
        txt_dataPakaian1.setText(null);
    }

    private void kembali() {
        this.setVisible(false);
        try {
            new DashboardPegawaiJasa().setVisible(true);
        } catch (Exception e) {
        }
    }

    private void total_biaya() {
        if (txt_beratBarang.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Berat Barang belum diisi");
        } else {
            double harga = Double.parseDouble(txt_harga.getText()),
                    beratBarang = Double.parseDouble(txt_beratBarang.getText()),
                    //tanahTersedia = Long.parseLong(txttanahtersedia.getText()),
                    totalharga;
            totalharga = (beratBarang * harga);
            txt_biaya.setText("" + totalharga);
            tanggal();

        }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_jasa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new edit_jasa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel ButtonClose;
    private javax.swing.JButton btn_hitung;
    private javax.swing.JButton btn_nama;
    private javax.swing.JButton btn_no;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_submit1;
    private javax.swing.JComboBox<String> cbJenisLaundry;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_bayar;
    private javax.swing.JTextField txt_beratBarang;
    private javax.swing.JTextField txt_biaya;
    private javax.swing.JTextArea txt_dataPakaian1;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_kembali;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_no;
    private javax.swing.JTextField txt_tanggal;
    private javax.swing.JTextField txt_telepon;
    // End of variables declaration//GEN-END:variables

}
