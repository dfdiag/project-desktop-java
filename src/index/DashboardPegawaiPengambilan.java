package index;

import Connection.Connect;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class DashboardPegawaiPengambilan extends javax.swing.JFrame {

    private DefaultTableModel tabelcd;

    /**
     * Creates new form Datapegawai
     */
    private void showTable() {
        tabelcd = new DefaultTableModel();
        table.setModel(tabelcd);
        tabelcd.addColumn("no");
        tabelcd.addColumn("Nama");
        tabelcd.addColumn("Telepon");
        tabelcd.addColumn("Alamat");
        tabelcd.addColumn("Berat Barang");
        tabelcd.addColumn("Jenis laundry");
        tabelcd.addColumn("Biaya");
        tabelcd.addColumn("Bayar");
        tabelcd.addColumn("Kembali");
        tabelcd.addColumn("Status");
        tabelcd.addColumn("Tanggal Pengambilan");
        tabelcd.addColumn("Data pakaian");
        // menampilkan database ke dalam tabel
        String search = txt_search.getText();
        try {
            int no = 1;
            String sql = "SELECT * FROM data_pelanggan WHERE status = 'diambil'";
            java.sql.Connection conn = (Connection) Connect.ConfigDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                tabelcd.addRow(new Object[]{
                    res.getString("no"),
                    res.getString("nama"),
                    res.getString("telepon"),
                    res.getString("alamat"),
                    res.getString("berat_barang"),
                    res.getString("jenis_laundry"),
                    res.getString("biaya"),
                    res.getString("bayar"),
                    res.getString("kembali"),
                    res.getString("status"),
                    res.getString("tanggal"),
                    res.getString("data_pakaian")});
            }
            table.setModel(tabelcd);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void search() {

        tabelcd = new DefaultTableModel();
        table.setModel(tabelcd);
        tabelcd.addColumn("no");
        tabelcd.addColumn("Nama");
        tabelcd.addColumn("Telepon");
        tabelcd.addColumn("Alamat");
        tabelcd.addColumn("Berat Barang");
        tabelcd.addColumn("Jenis laundry");
        tabelcd.addColumn("Biaya");
        tabelcd.addColumn("Bayar");
        tabelcd.addColumn("Kembali");
        tabelcd.addColumn("Status");
        tabelcd.addColumn("Tanggal Pengambilan");
        tabelcd.addColumn("Data pakaian");
        // menampilkan database ke dalam tabel
        String search = txt_search.getText();
        try {
            int no = 1;
            String sql = "SELECT * FROM data_pelanggan WHERE no='" + search + "'"
                    + "or nama LIKE '%" + search + "%' AND status='diambil'";
            java.sql.Connection conn = (Connection) Connect.ConfigDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                tabelcd.addRow(new Object[]{
                    res.getString("no"),
                    res.getString("nama"),
                    res.getString("telepon"),
                    res.getString("alamat"),
                    res.getString("berat_barang"),
                    res.getString("jenis_laundry"),
                    res.getString("biaya"),
                    res.getString("bayar"),
                    res.getString("kembali"),
                    res.getString("status"),
                    res.getString("tanggal"),
                    res.getString("data_pakaian")});
            }
            table.setModel(tabelcd);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void kosong() {
        tabelcd.addColumn("No");
        tabelcd.addColumn("Nama");
        tabelcd.addColumn("Telepon");
        tabelcd.addColumn("Alamat");
        tabelcd.addColumn("Berat barang");
        tabelcd.addColumn("Jenis Lundry");
        tabelcd.addColumn("Biaya");
        tabelcd.addColumn("Bayar");
        tabelcd.addColumn("Kembali");
        tabelcd.addColumn("Status");
        tabelcd.addColumn("Tanggal Pengambilan");
        tabelcd.addColumn("Data Pakaian");
    }

    public DashboardPegawaiPengambilan() {
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

        btn_tambah = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btnkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_statistik = new javax.swing.JButton();
        btn_jasa = new javax.swing.JButton();
        btn_pengambilan = new javax.swing.JButton();
        btn_cetak = new javax.swing.JButton();
        btn_re = new javax.swing.JButton();
        Background1 = new javax.swing.JLabel();

        btn_tambah.setBackground(new java.awt.Color(51, 153, 255));
        btn_tambah.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SEARCH");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 170, -1, 30));

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 170, 220, 30));

        btnkeluar.setBackground(new java.awt.Color(111, 200, 255));
        btnkeluar.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnkeluar.setText("LOGOUT");
        btnkeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnkeluarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnkeluarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnkeluarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnkeluarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnkeluarMouseReleased(evt);
            }
        });
        getContentPane().add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 680, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 1030, 430));

        btn_edit.setBackground(new java.awt.Color(51, 153, 255));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        getContentPane().add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 680, -1, -1));

        btn_hapus.setBackground(new java.awt.Color(51, 153, 255));
        btn_hapus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 680, -1, -1));

        btn_statistik.setBackground(new java.awt.Color(111, 200, 255));
        btn_statistik.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btn_statistik.setText("STATISTIK");
        btn_statistik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_statistik.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_statistik.setPreferredSize(new java.awt.Dimension(360, 100));
        btn_statistik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_statistikActionPerformed(evt);
            }
        });
        getContentPane().add(btn_statistik, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 70));

        btn_jasa.setBackground(new java.awt.Color(111, 200, 255));
        btn_jasa.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btn_jasa.setText("JASA");
        btn_jasa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_jasa.setPreferredSize(new java.awt.Dimension(360, 100));
        btn_jasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jasaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_jasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 260, 70));

        btn_pengambilan.setBackground(new java.awt.Color(204, 255, 255));
        btn_pengambilan.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btn_pengambilan.setText("PENGAMBILAN");
        btn_pengambilan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pengambilan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_pengambilan.setPreferredSize(new java.awt.Dimension(360, 100));
        btn_pengambilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pengambilanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pengambilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 260, 70));

        btn_cetak.setBackground(new java.awt.Color(51, 153, 255));
        btn_cetak.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cetak.setText("CETAK");
        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 130, 80, 30));

        btn_re.setBackground(new java.awt.Color(51, 153, 255));
        btn_re.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btn_re.setText("REFRESH");
        btn_re.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reActionPerformed(evt);
            }
        });
        getContentPane().add(btn_re, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 130, 90, 30));

        Background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/1366x768/dashboard pelanggan.png"))); // NOI18N
        getContentPane().add(Background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_jasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jasaActionPerformed
        new DashboardPegawaiJasa().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_jasaActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        String no = txt_search.getText();
        if (txt_search.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Silahkan isi dahulu kolom \npencarian dengan no. pelanggan");
        } else {
            try {
                Statement statement = (Statement) Connect.ConfigDB().createStatement();
                statement.executeUpdate("delete from data_pelanggan where no= ('" + no + "');");
                showTable();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            } catch (HeadlessException | SQLException t) {
                JOptionPane.showMessageDialog(null, "Data gaagl dihapus");
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        search(); //tanpa klik search
    }//GEN-LAST:event_txt_searchKeyReleased

    private void btnkeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkeluarMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Switch User?");
        switch (a) {
            case JOptionPane.YES_OPTION:
                new FORM_SwitchUser().setVisible(true);
                this.dispose();
                break;
            case JOptionPane.NO_OPTION:
                System.exit(0);
            default:
                break;
        }
    }//GEN-LAST:event_btnkeluarMouseClicked

    private void btnkeluarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkeluarMouseEntered
        // TODO add your handling code here:
        btnkeluar.setBackground(new Color(58, 106, 135));
    }//GEN-LAST:event_btnkeluarMouseEntered

    private void btnkeluarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkeluarMouseExited
        // TODO add your handling code here:
        btnkeluar.setBackground(new Color(111, 200, 255));
    }//GEN-LAST:event_btnkeluarMouseExited

    private void btnkeluarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkeluarMousePressed
        // TODO add your handling code here:
        btnkeluar.setBackground(new Color(58, 106, 135));
    }//GEN-LAST:event_btnkeluarMousePressed

    private void btnkeluarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkeluarMouseReleased
        // TODO add your handling code here:
        btnkeluar.setBackground(new Color(111, 200, 255));
    }//GEN-LAST:event_btnkeluarMouseReleased

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed

        new edit_jasa().setVisible(true);
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        new input_jasa().setVisible(true);
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_pengambilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pengambilanActionPerformed
        btn_pengambilan.setEnabled(false);
    }//GEN-LAST:event_btn_pengambilanActionPerformed

    private void btn_statistikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_statistikActionPerformed
        new DashboardPegawaiStatistik().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_statistikActionPerformed

    private void btn_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reActionPerformed
        // TODO add your handling code here:
        showTable();
    }//GEN-LAST:event_btn_reActionPerformed

    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
        try {
            String nota2 = ("C:\\Users\\User\\Documents\\NetBeansProjects\\berliant\\src\\laporan\\nota2.jrxml"); //link file directorylaporan / struk
            HashMap hash = new HashMap();   //hashmap
            hash.put("no", txt_search.getText()); //mengambil parameter hash dari search
            JasperReport JRpt = JasperCompileManager.compileReport(nota2);  //menyiapkan data nota2
            JasperPrint JPrint = JasperFillManager.fillReport(JRpt, hash, Connect.ConfigDB());  //print
            JasperViewer.viewReport(JPrint, false); //jika Jprint ditutup tidak akan mengEksekusi System.exit(0);
        } catch (SQLException | JRException rptexcpt) {
            JOptionPane.showMessageDialog(null, "Masukkan No. pelanggan");
        }
    }//GEN-LAST:event_btn_cetakActionPerformed

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
            new DashboardPegawaiPengambilan().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background1;
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_jasa;
    private javax.swing.JButton btn_pengambilan;
    private javax.swing.JButton btn_re;
    private javax.swing.JButton btn_statistik;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
