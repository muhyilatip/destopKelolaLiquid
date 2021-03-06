/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package dashboard;

import database.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Abdul Latip Muhyi
 */
public class kelolaBarangMasuk extends javax.swing.JInternalFrame {

    
    
    /**
     * Creates new form kelolaBarangMasuk
     */
    public kelolaBarangMasuk() {
        initComponents();

        show_barang_inJtable();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldKodeBarang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNamaBarang = new javax.swing.JTextField();
        jLabelTypeBarang = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldKandunganNikotin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldHargaBeli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldHargaJual = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldQty = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldSuplier = new javax.swing.JTextField();
        jButtonEdit = new javax.swing.JButton();
        jButtonTambah1 = new javax.swing.JButton();
        cbTypeBarang = new javax.swing.JComboBox<>();
        jButtonHapus1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBarangMasuk = new javax.swing.JTable();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel14.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Kelola Barang Masuk");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Swis721 Cn BT", 0, 12)); // NOI18N
        jLabel2.setText("Kode Barang");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jTextFieldKodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKodeBarangActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldKodeBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, 30));

        jLabel3.setFont(new java.awt.Font("Swis721 Cn BT", 0, 12)); // NOI18N
        jLabel3.setText("Nama Barang");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jTextFieldNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaBarangActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 190, 30));

        jLabelTypeBarang.setFont(new java.awt.Font("Swis721 Cn BT", 0, 12)); // NOI18N
        jLabelTypeBarang.setText("Type Barang ( Juice / Creame )");
        jPanel1.add(jLabelTypeBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, -1));

        jLabel18.setFont(new java.awt.Font("Swis721 Cn BT", 0, 12)); // NOI18N
        jLabel18.setText("Kandungan Nikotin ( mm )");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, -1));

        jTextFieldKandunganNikotin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKandunganNikotinActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldKandunganNikotin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, 30));

        jLabel5.setFont(new java.awt.Font("Swis721 Cn BT", 0, 12)); // NOI18N
        jLabel5.setText("Harga Beli");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 50, -1));

        jTextFieldHargaBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHargaBeliActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldHargaBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 190, 30));

        jLabel6.setFont(new java.awt.Font("Swis721 Cn BT", 0, 12)); // NOI18N
        jLabel6.setText("Harga Jual");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 60, -1));

        jTextFieldHargaJual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHargaJualActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldHargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 190, 30));

        jLabel13.setFont(new java.awt.Font("Swis721 Cn BT", 0, 12)); // NOI18N
        jLabel13.setText("QTY");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 60, -1));

        jTextFieldQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQtyActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 190, 30));

        jLabel19.setFont(new java.awt.Font("Swis721 Cn BT", 0, 12)); // NOI18N
        jLabel19.setText("Suplier ( PT )");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 70, -1));

        jTextFieldSuplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSuplierActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldSuplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 190, 30));

        jButtonEdit.setBackground(new java.awt.Color(102, 204, 0));
        jButtonEdit.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-making_notes.png"))); // NOI18N
        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 80, 40));

        jButtonTambah1.setBackground(new java.awt.Color(102, 153, 255));
        jButtonTambah1.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jButtonTambah1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add.png"))); // NOI18N
        jButtonTambah1.setText("Tambah");
        jButtonTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambah1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTambah1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 40));

        cbTypeBarang.setFont(new java.awt.Font("Swis721 Cn BT", 0, 11)); // NOI18N
        cbTypeBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Juice", "2 Cream" }));
        jPanel1.add(cbTypeBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 190, 30));

        jButtonHapus1.setBackground(new java.awt.Color(255, 102, 102));
        jButtonHapus1.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jButtonHapus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete_trash.png"))); // NOI18N
        jButtonHapus1.setText("Hapus");
        jButtonHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapus1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonHapus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 100, 40));

        jTableBarangMasuk.setFont(new java.awt.Font("Swis721 Cn BT", 0, 11)); // NOI18N
        jTableBarangMasuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kandungan Nikotin", "Type Barang", "Harga Beli", "Harga Jual", "QTY", "Suplier"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBarangMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBarangMasukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBarangMasuk);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 870, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 313, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    koneksi k = new koneksi();
    Connection con = k.connection;
    
    public ArrayList<barang> getBarangList()
    {
       ArrayList<barang> barangList = new ArrayList<barang>();
       
       String query = "SELECT * FROM barang";
       
       Statement st;
       ResultSet rs;
       
       try{
           st = con.createStatement();
           rs = st.executeQuery(query);
           
           barang Barang;           
           while(rs.next()){
               Barang = new barang(rs.getInt("kode_barang"),rs.getString("nama_barang"), 
                       rs.getInt("kandungan_nikotin"), rs.getInt("id_type"), 
                       rs.getDouble("harga_jual"), rs.getDouble("harga_beli"), rs.getInt("stok"), rs.getString("suplier"), rs.getString("tangggal") );
               barangList.add(Barang);
           }        
       }catch(Exception e){
           e.printStackTrace();
       }       
       return barangList;
    }
    
    public void show_barang_inJtable(){
        
        ArrayList<barang> list = getBarangList();
        
        DefaultTableModel model = (DefaultTableModel)jTableBarangMasuk.getModel();
        
        Object[] row = new Object[8];
        
        for(int i=0; i < list.size(); i++){
            row[0] = list.get(i).getKodeBarang();
            row[1] = list.get(i).getNamaBarang();
            row[2] = list.get(i).getTypeBarang();
            row[3] = list.get(i).getKandunganNikotin();
            row[4] = list.get(i).getHargaJual();
            row[5] = list.get(i).getHargaBeli();
            row[6] = list.get(i).getStok();
            row[7] = list.get(i).getSuplier();
            
            model.addRow(row);
        }       
    }
    
    public void executeSQLQuery(String query, String pesan)
    {
        Statement st;
        
        try{
           st = con.createStatement();
           
           if(st.executeUpdate(query) == 1){
               
               //refresh jtable data
               DefaultTableModel model = (DefaultTableModel)jTableBarangMasuk.getModel();
               model.setRowCount(0);
               show_barang_inJtable();
               
               JOptionPane.showMessageDialog(null, "Data " + pesan + " Succefully");
           }
           else{
               JOptionPane.showMessageDialog(null, "Data Not " + pesan);           
           }
                 
       }catch(Exception e){
           e.printStackTrace();
       }        
    }
    
    public void simpanTransaksi(String query)
    {
        Statement st;
        
        try{
           st = con.createStatement();
           
           if(st.executeUpdate(query) == 1){
                                   
                int jawab;

                jawab = JOptionPane.showOptionDialog(null, "Cetak Faktur Penjualan?", "", 
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

                if(jawab == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "Cetak Faktur !");
                }               
           }
           else{
               JOptionPane.showMessageDialog(null, "Transaksi tidak dapat disimpan");           
           }
                 
       }catch(Exception e){
           e.printStackTrace();
       }        
    }
    
    private void jTextFieldKodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKodeBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKodeBarangActionPerformed

    private void jTextFieldNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaBarangActionPerformed

    private void jTextFieldKandunganNikotinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKandunganNikotinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKandunganNikotinActionPerformed

    private void jTextFieldHargaBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHargaBeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHargaBeliActionPerformed

    private void jTextFieldHargaJualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHargaJualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHargaJualActionPerformed

    private void jTextFieldQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQtyActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        String query = "UPDATE `barang` SET `nama_barang`='"+jTextFieldNamaBarang.getText()+"',"
                + "`kandungan_nikotin`='"+jTextFieldKandunganNikotin.getText()+"',"
                + "`id_type`='"+(cbTypeBarang.getSelectedIndex()+1)+"',"
                + "`harga_jual`='"+jTextFieldHargaJual.getText()+"',"
                + "`harga_beli`='"+jTextFieldHargaBeli.getText()+"',"
                + "`stok`='"+jTextFieldQty.getText()+"',"
                + "`suplier`='"+jTextFieldSuplier.getText()+"' "
                + "WHERE `kode_barang`="+jTextFieldKodeBarang.getText();
        
        executeSQLQuery(query, "Updated");
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jTextFieldSuplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSuplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSuplierActionPerformed

    private void jButtonTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambah1ActionPerformed
        
        String query = "INSERT INTO `barang`(`kode_barang`, `nama_barang`, `kandungan_nikotin`, `id_type`, `harga_jual`, `harga_beli`, `stok`, `suplier`) "
                + "VALUES ('"+jTextFieldKodeBarang.getText()+"','"+jTextFieldNamaBarang.getText()+"', '"+jTextFieldKandunganNikotin.getText()+"','"+(cbTypeBarang.getSelectedIndex()+1)+"', '"+jTextFieldHargaJual.getText()+"','"+jTextFieldHargaBeli.getText()+"','"+jTextFieldQty.getText()+"','"+jTextFieldSuplier.getText()+"')";
        
        executeSQLQuery(query, "Inserted");
        
        DefaultTableModel model = new DefaultTableModel();

            model = (DefaultTableModel)jTableBarangMasuk.getModel();

            model.addRow(new Object[]{

//                tfNoResi.getText(),
                jTextFieldKodeBarang.getText(),
                jTextFieldNamaBarang.getText(),
                cbTypeBarang.getSelectedIndex(),
                jTextFieldKandunganNikotin.getText(),
                jTextFieldHargaBeli.getText(),
                jTextFieldHargaJual.getText(),
                jTextFieldQty.getText(),
                jTextFieldSuplier.getText()

            });
        
        jTextFieldKodeBarang.setText("");
        jTextFieldNamaBarang.setText("");
//        cbTypeBarang.setSelectedIndex("");
        jTextFieldKandunganNikotin.setText("");
        jTextFieldHargaBeli.setText("");
        jTextFieldHargaJual.setText("");
        jTextFieldQty.setText("");
        jTextFieldSuplier.setText("");
    }//GEN-LAST:event_jButtonTambah1ActionPerformed

    private void jButtonHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapus1ActionPerformed
        String query = "DELETE FROM `barang` WHERE kode_barang="+jTextFieldKodeBarang.getText();
        
        executeSQLQuery(query, "Deleted");
    }//GEN-LAST:event_jButtonHapus1ActionPerformed

    private void jTableBarangMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBarangMasukMouseClicked
        jTextFieldKodeBarang.setEditable(false);
              
        //menampilkan data yang di klik pada table ke dalam form      
        
        int i = jTableBarangMasuk.getSelectedRow();
        
        TableModel model = jTableBarangMasuk.getModel();
        
        jTextFieldKodeBarang.setText(model.getValueAt(i, 0).toString());
        jTextFieldNamaBarang.setText(model.getValueAt(i, 1).toString());
        jTextFieldKandunganNikotin.setText(model.getValueAt(i, 2).toString());
        cbTypeBarang.getModel().setSelectedItem("PCS");
        jTextFieldHargaJual.setText(model.getValueAt(i, 4).toString());
        jTextFieldHargaBeli.setText(model.getValueAt(i, 5).toString());
        jTextFieldQty.setText(model.getValueAt(i, 6).toString());
        jTextFieldSuplier.setText(model.getValueAt(i, 7).toString());
    }//GEN-LAST:event_jTableBarangMasukMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbTypeBarang;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonHapus1;
    private javax.swing.JButton jButtonTambah1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTypeBarang;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBarangMasuk;
    private javax.swing.JTextField jTextFieldHargaBeli;
    private javax.swing.JTextField jTextFieldHargaJual;
    private javax.swing.JTextField jTextFieldKandunganNikotin;
    private javax.swing.JTextField jTextFieldKodeBarang;
    private javax.swing.JTextField jTextFieldNamaBarang;
    private javax.swing.JTextField jTextFieldQty;
    private javax.swing.JTextField jTextFieldSuplier;
    // End of variables declaration//GEN-END:variables
}
