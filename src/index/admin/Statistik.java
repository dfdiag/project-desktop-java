package index.admin;

import Connection.Connect;
import index.DashboardAdminPelanggan;
import index.DashboardPegawaiJasa;
import index.edit_statistik;
import index.input_statistik;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Statistik extends javax.swing.JFrame {

    private DefaultTableModel tabelcd;

    /**
     * Creates new form Datapegawai
     */
    private void showTable() {
        tabelcd = new DefaultTableModel();
        table.setModel(tabelcd);
        tabelcd.addColumn("No");
        tabelcd.addColumn("Bulan / Tanggal");
        tabelcd.addColumn("Keterangan");
        tabelcd.addColumn("Biaya Pengeluaran");
        tabelcd.addColumn("Biaya Pemasukan");
        tabelcd.addColumn("Pendapatan Bersih");
        // menampilkan database ke dalam tabel
        String search = txt_search.getText();
        try {
            int no = 1;
            String sql = "SELECT * FROM statistik ";
            java.sql.Connection conn = (Connection) Connect.ConfigDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                tabelcd.addRow(new Object[]{
                    res.getString("No"),
                    res.getString("tanggal"),
                    res.getString("nama_barang"),
                    res.getString("biaya_pengeluaran"),
                    res.getString("biaya_pemasukan"),
                    res.getString("pendapatan_bersih")});
            }
            table.setModel(tabelcd);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void search() {

        tabelcd = new DefaultTableModel();
        table.setModel(tabelcd);
        tabelcd.addColumn("No");
        tabelcd.addColumn("Bulan / Tanggal");
        tabelcd.addColumn("Keterangan");
        tabelcd.addColumn("Biaya Pengeluaran");
        tabelcd.addColumn("Biaya Pemasukan");
        tabelcd.addColumn("Pendapatan Bersih");
        // menampilkan database ke dalam tabel
        String search = txt_search.getText();
        try {
            int no = 1;
            String sql = "SELECT * FROM statistik WHERE No='" + search + "'"
            +"or no LIKE '%"+ search + "%'";
            java.sql.Connection conn = (Connection) Connect.ConfigDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                tabelcd.addRow(new Object[]{
                    res.getString("No"),
                    res.getString("tanggal"),
                    res.getString("nama_barang"),
                    res.getString("biaya_pengeluaran"),
                    res.getString("biaya_pemasukan"),
                    res.getString("pendapatan_bersih")});
            }
            table.setModel(tabelcd);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void kosong() {
        table.setModel(tabelcd);
        tabelcd.addColumn("No");
        tabelcd.addColumn("Bulan / Tanggal");
        tabelcd.addColumn("Keterangan");
        tabelcd.addColumn("Biaya Pengeluaran");
        tabelcd.addColumn("Biaya Pemasukan");
        tabelcd.addColumn("Pendapatan Bersih");
    }

    public void tanggal() {
        DateFormat tgl = new SimpleDateFormat("Y-M-d");
        String htgl = tgl.format(Calendar.getInstance().getTime());
    }

    public Statistik() {
        initComponents();
        showTable();
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
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_refresh = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_hapus1 = new javax.swing.JButton();
        cal_tgl1 = new com.toedter.calendar.JDateChooser();
        cal_tgl2 = new com.toedter.calendar.JDateChooser();
        btn_cetak1 = new javax.swing.JButton();
        btn_re1 = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Background1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1336, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_tambah.setBackground(new java.awt.Color(51, 153, 255));
        btn_tambah.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, -1, -1));

        btn_edit.setBackground(new java.awt.Color(51, 153, 255));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, -1, -1));

        btn_refresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_refresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/BACK PNG.png"))); // NOI18N
        btn_refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_refreshMouseClicked(evt);
            }
        });
        jPanel1.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 560, 110, 110));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("STATISTIK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 430, 60));

        btn_hapus1.setBackground(new java.awt.Color(51, 153, 255));
        btn_hapus1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_hapus1.setText("HAPUS");
        btn_hapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapus1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, -1, -1));

        cal_tgl1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cal_tgl1KeyReleased(evt);
            }
        });
        jPanel1.add(cal_tgl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 180, 30));

        cal_tgl2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cal_tgl2KeyReleased(evt);
            }
        });
        jPanel1.add(cal_tgl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 70, 180, 30));

        btn_cetak1.setBackground(new java.awt.Color(51, 153, 255));
        btn_cetak1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cetak1.setText("CETAK");
        btn_cetak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetak1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cetak1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 70, 80, 30));

        btn_re1.setBackground(new java.awt.Color(51, 153, 255));
        btn_re1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btn_re1.setText("REFRESH");
        btn_re1.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_re1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_re1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_re1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 80, 30));

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel1.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 30, 60, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("s.d");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 80, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 1220, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1360, 670));

        Background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/1366x768/dashboard pelanggan.png"))); // NOI18N
        getContentPane().add(Background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refreshMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new DashboardAdminPelanggan().setVisible(true);
    }//GEN-LAST:event_btn_refreshMouseClicked

    private void btn_hapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapus1ActionPerformed
        // TODO add your handling code here:
        String no = txt_search.getText();
        if (txt_search.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Silahkan isi dahulu kolom \npencarian dengan no. -data-");
        } else {
            try {
                Statement statement = (Statement) Connect.ConfigDB().createStatement();
                statement.executeUpdate("DELETE FROM statistik WHERE No= ('" + no + "');");
                showTable();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            } catch (HeadlessException | SQLException t) {
                JOptionPane.showMessageDialog(null, "Data gaagl dihapus");
            }
        }
    }//GEN-LAST:event_btn_hapus1ActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        new input_statistik().setVisible(true);
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        new edit_statistik().setVisible(true);
    }//GEN-LAST:event_btn_editActionPerformed

    private void cal_tgl1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cal_tgl1KeyReleased
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_cal_tgl1KeyReleased

    private void cal_tgl2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cal_tgl2KeyReleased
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_cal_tgl2KeyReleased

    private void btn_cetak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetak1ActionPerformed

        try {
            String nota2 = ("C:\\Users\\yoni_\\Documents\\New folder\\SistemPengelolahDataKasir\\berliantExport\\src\\laporan\\Laporan.jrxml"); //link file directorylaporan / struk
            HashMap hash = new HashMap();   //hashmap
            hash.put("tgl1", cal_tgl1.getDate()); //mengambil parameter hash dari search
            hash.put("tgl2", cal_tgl2.getDate()); //mengambil parameter hash dari search
            JasperReport JRpt = JasperCompileManager.compileReport(nota2);  //menyiapkan data nota2
            JasperPrint JPrint = JasperFillManager.fillReport(JRpt, hash, Connect.ConfigDB());  //print
            JasperViewer.viewReport(JPrint, false); //jika Jprint ditutup tidak akan mengEksekusi System.exit(0);
        } catch (SQLException | JRException rptexcpt) {
            JOptionPane.showMessageDialog(null, "Masukkan No. pelanggan");
        }
    }//GEN-LAST:event_btn_cetak1ActionPerformed

    private void btn_re1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_re1ActionPerformed
        // TODO add your handling code here:
        showTable();
    }//GEN-LAST:event_btn_re1ActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        search(); //tanpa klik search
    }//GEN-LAST:event_txt_searchKeyReleased

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
            java.util.logging.Logger.getLogger(DashboardPegawaiJasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Statistik().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background1;
    private javax.swing.JButton btn_cetak1;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus1;
    private javax.swing.JButton btn_re1;
    private javax.swing.JLabel btn_refresh;
    private javax.swing.JButton btn_tambah;
    private com.toedter.calendar.JDateChooser cal_tgl1;
    private com.toedter.calendar.JDateChooser cal_tgl2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
