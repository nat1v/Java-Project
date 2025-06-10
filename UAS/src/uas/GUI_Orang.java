
package uas;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;


public class GUI_Orang extends javax.swing.JFrame {

  
    public GUI_Orang() {
        initComponents();
        this.setTitle("Aplikasi Data Mahasiswa");
        // Load data into table and clear form on startup
        load_table();
        kosongkan_form();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tglLahir_User = new com.toedter.calendar.JDateChooser();
        NIM_User = new javax.swing.JTextField();
        Nama_User = new javax.swing.JTextField();
        ComboProdi_User = new javax.swing.JComboBox<>();
        isLaki_User = new javax.swing.JRadioButton();
        ooo = new javax.swing.JRadioButton();
        Status_User = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Queue_SQL = new javax.swing.JButton();
        Update_SQL = new javax.swing.JButton();
        Delete_SQL = new javax.swing.JButton();
        Search_SQL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIM");

        jLabel2.setText("Tanggal Lahir");

        jLabel3.setText("Nama");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("Status");

        jLabel6.setText("Prodi");

        NIM_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIM_UserActionPerformed(evt);
            }
        });

        Nama_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama_UserActionPerformed(evt);
            }
        });

        ComboProdi_User.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ILKOM", "PTI", "SI", "TRPL." }));

        buttonGroup1.add(isLaki_User);
        isLaki_User.setText("Laki-Laki");

        buttonGroup1.add(ooo);
        ooo.setText("Perempuan");

        Status_User.setText("Single");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Nim", "Nama", "Tanggal Lahir", "Umur", "JenisKelamin", "Status", "Prodi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Queue_SQL.setText("Queue");
        Queue_SQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Queue_SQLActionPerformed(evt);
            }
        });

        Update_SQL.setText("Update");
        Update_SQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_SQLActionPerformed(evt);
            }
        });

        Delete_SQL.setText("Delete");
        Delete_SQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_SQLActionPerformed(evt);
            }
        });

        Search_SQL.setText("Search");
        Search_SQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_SQLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(tglLahir_User, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ComboProdi_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Status_User, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(isLaki_User, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(ooo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Nama_User, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NIM_User, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Delete_SQL)
                                    .addComponent(Update_SQL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Search_SQL)
                                    .addComponent(Queue_SQL))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(729, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(tglLahir_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(NIM_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Nama_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(isLaki_User)
                            .addComponent(ooo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Status_User))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ComboProdi_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Update_SQL)
                            .addComponent(Search_SQL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Queue_SQL)
                            .addComponent(Delete_SQL))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jLabel2)
                    .addContainerGap(371, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private int hitungUmur(Date birthDate) {
        if (birthDate == null) {
            return 0;
        }
        LocalDate birthLocalDate = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate currentLocalDate = LocalDate.now();
        return Period.between(birthLocalDate, currentLocalDate).getYears();
    }
    
    private void NIM_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIM_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIM_UserActionPerformed
    private void kosongkan_form() {
        NIM_User.setEditable(true);
        NIM_User.setText(null);
        Nama_User.setText(null);
        tglLahir_User.setDate(null);
        buttonGroup1.clearSelection();
        Status_User.setSelected(false);
        ComboProdi_User.setSelectedItem(this);
    }
    private void load_table() {
        // Create a new table model
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Umur");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Status");
        model.addColumn("Prodi");

        // Fetch data from database
        try {
            int no = 1;
            String sql = "SELECT * FROM dataMahasiswa";
            Connection conn = (Connection) koneksiDatabase.getKoneksi();
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                    no++,
                    res.getString("NIM"),
                    res.getString("Nama"),
                    res.getString("TanggalLahir"),
                    res.getInt("Umur"),
                    res.getString("JenisKelamin"),
                    res.getString("Status"),
                    res.getString("Prodi")
                });
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage());
        }
    }
    
    private void Nama_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama_UserActionPerformed

    private void Update_SQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_SQLActionPerformed
        try {
            String sql = "UPDATE dataMahasiswa SET Nama=?, TanggalLahir=?, Umur=?, JenisKelamin=?, Status=?, Prodi=? WHERE NIM=?";
            Connection conn = (Connection) koneksiDatabase.getKoneksi();
            PreparedStatement pstm = conn.prepareStatement(sql);

            // Get values from form
            Date birthDate = tglLahir_User.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String tanggalLahir = sdf.format(tglLahir_User.getDate());
            int umur = hitungUmur(birthDate);
            
            
            String jenisKelamin = isLaki_User.isSelected() ? "Laki-Laki" : "Perempuan";
            String status = Status_User.isSelected() ? "Single" : "Menikah"; 
            
            
            
            pstm.setString(1, Nama_User.getText());
            pstm.setString(2, tanggalLahir);
            pstm.setInt(3, umur); // <-- SET AGE
            pstm.setString(4, jenisKelamin);
            pstm.setString(5, status);
            pstm.setString(6, ComboProdi_User.getSelectedItem().toString());
            pstm.setString(7, NIM_User.getText()); 

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal mengupdate data: " + e.getMessage());
        }
        load_table();
        kosongkan_form();
                       
    }//GEN-LAST:event_Update_SQLActionPerformed

    private void Queue_SQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Queue_SQLActionPerformed
        try {
            String sql = "INSERT INTO dataMahasiswa (NIM, Nama, Umur, TanggalLahir, JenisKelamin, Status, Prodi) VALUES (?, ?, ?, ?, ?, ?, ?)";
            Connection conn = (Connection) koneksiDatabase.getKoneksi();
            PreparedStatement pstm = conn.prepareStatement(sql);

            // Get values from form
            Date birthDate = tglLahir_User.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String tanggalLahir = sdf.format(tglLahir_User.getDate());
            int umur = hitungUmur(birthDate);
            
            String jenisKelamin = isLaki_User.isSelected() ? "Laki-Laki" : "Perempuan";
            String status = Status_User.isSelected() ? "Single" : "Menikah";

            pstm.setString(1, NIM_User.getText()); 
            pstm.setString(2, Nama_User.getText());
            pstm.setInt(3, umur); // <-- SET AGE
            pstm.setString(4, tanggalLahir);
            pstm.setString(5, jenisKelamin);
            pstm.setString(6, status);
            pstm.setString(7, ComboProdi_User.getSelectedItem().toString());
            
            
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan.");
            
            load_table();
            kosongkan_form();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data: " + e.getMessage());
        }
    
    }//GEN-LAST:event_Queue_SQLActionPerformed

    private void Delete_SQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_SQLActionPerformed
        try {
            String sql = "DELETE FROM dataMahasiswa WHERE NIM=?";
            Connection conn = (Connection) koneksiDatabase.getKoneksi();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, NIM_User.getText());
            
            int confirmation = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
            
            if(confirmation == JOptionPane.YES_OPTION){
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal menghapus data: " + e.getMessage());
        }
        load_table();
        kosongkan_form();
    }//GEN-LAST:event_Delete_SQLActionPerformed

    private void Search_SQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_SQLActionPerformed
        try {
            String sql = "SELECT * FROM dataMahasiswa WHERE NIM = ?";
            Connection conn = (Connection) koneksiDatabase.getKoneksi();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, NIM_User.getText());
            
            ResultSet rs = pstm.executeQuery();
            
            if (rs.next()) {
                // Data found, populate the form
                Nama_User.setText(rs.getString("Nama"));
                tglLahir_User.setDate(rs.getDate("TanggalLahir"));
                
                if ("Laki-Laki".equals(rs.getString("JenisKelamin"))) {
                    isLaki_User.setSelected(true);
                } else {
                    ooo.setSelected(true);
                }
                
                Status_User.setSelected("Single".equals(rs.getString("Status")));
                ComboProdi_User.setSelectedItem(rs.getString("Prodi"));
                
                JOptionPane.showMessageDialog(null, "Data ditemukan.");
                NIM_User.setEditable(false); // Lock NIM after search
            } else {
                JOptionPane.showMessageDialog(null, "Data dengan NIM tersebut tidak ditemukan.");
                kosongkan_form();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error saat mencari data: " + e.getMessage());
        }
    
    }//GEN-LAST:event_Search_SQLActionPerformed
    
    //MENGISI DATA DI FORM SAAT TABEL DI KLIK
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String nim = jTable1.getValueAt(baris, 1).toString();
        NIM_User.setText(nim);
        NIM_User.setEditable(false); // Disable editing NIM when a row is selected

        String nama = jTable1.getValueAt(baris, 2).toString();
        Nama_User.setText(nama);

        try {
            Date tgl = new SimpleDateFormat("yyyy-MM-dd").parse((String)jTable1.getValueAt(baris, 3));
            tglLahir_User.setDate(tgl);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String jk = jTable1.getValueAt(baris, 4).toString();
        if ("Laki-Laki".equals(jk)) {
            isLaki_User.setSelected(true);
        } else {
            ooo.setSelected(true);
        }

        String status = jTable1.getValueAt(baris, 5).toString();
        Status_User.setSelected("Single".equals(status));

        String prodi = jTable1.getValueAt(baris, 6).toString();
        ComboProdi_User.setSelectedItem(prodi);
    }//GEN-LAST:event_jTable1MouseClicked

    
    public static void main(String args[]) {
        try {
            // Choose your theme here.
            // UIManager.setLookAndFeel(new FlatLightLaf()); // For a light theme
            FlatIntelliJLaf.setup(); 
            
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
            // If it fails, it will fall back to the default Swing look and feel.
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Orang().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboProdi_User;
    private javax.swing.JButton Delete_SQL;
    private javax.swing.JTextField NIM_User;
    private javax.swing.JTextField Nama_User;
    private javax.swing.JButton Queue_SQL;
    private javax.swing.JButton Search_SQL;
    private javax.swing.JCheckBox Status_User;
    private javax.swing.JButton Update_SQL;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton isLaki_User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton ooo;
    private com.toedter.calendar.JDateChooser tglLahir_User;
    // End of variables declaration//GEN-END:variables
}
