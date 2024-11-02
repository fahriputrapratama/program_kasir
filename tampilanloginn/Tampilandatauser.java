
package tampilanloginn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Fahri
 */
public class Tampilandatauser extends javax.swing.JFrame {

    static void viewData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private Object tfieldcari;


   
    public Tampilandatauser() {
        initComponents();
        viewData("");
//        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        tekscari = new javax.swing.JTextField();
        btn_refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabledata = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add-24.png"))); // NOI18N
        btn_tambah.setText("Tambah");
        btn_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahMouseClicked(evt);
            }
        });
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-edit-24.png"))); // NOI18N
        btn_edit.setText("Edit Data");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-delete-24.png"))); // NOI18N
        btn_hapus.setText("Hapus Data");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        jLabel1.setText("Cari");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-search-24.png"))); // NOI18N

        tekscari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tekscariKeyReleased(evt);
            }
        });

        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_tambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_hapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tekscari, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_tambah)
                                .addComponent(btn_edit)
                                .addComponent(btn_hapus)
                                .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(tekscari))
                                .addGap(3, 3, 3))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        tabledata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Akun", "No", "Nama Lengkap", "Username", "Password", "Level"
            }
        ));
        tabledata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabledataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabledata);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed

        Tambah T = new Tambah(this, true);
        T.setVisible(true);
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int n = tabledata.getSelectedRow();
        if(n != -1){
            int id = Integer.parseInt(tabledata.getValueAt(n, 0).toString());
            
            int pilihan = JOptionPane.showConfirmDialog(this, 
                    "Apakah Anda yakin untuk menghapus data user ini?",
                    "Hapus Data",JOptionPane.YES_NO_OPTION);
            if(pilihan == 0){
                //yes
                String Q = "DELETE FROM akun WHERE id_akun="+id+" ";
                try {
                    Connection K = Config.configDB();
                    Statement S = K.createStatement();
                    S.executeUpdate(Q);
                    viewData(""); 
                } catch (Exception e) {
                }
            }else {
                //no
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        Edit_Data E = new Edit_Data(this, true);
        E.setVisible(true);
    }//GEN-LAST:event_btn_editActionPerformed
    
    private void btn_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseClicked
        // TODO add your handling code here:
        
  
    }//GEN-LAST:event_btn_tambahMouseClicked

    private void tekscariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tekscariKeyReleased
        String key = tekscari.getText();
        String w = "WHERE "
                + "fullname LIKE '%"+key+"%' "
                + "OR username LIKE '%"+key+"%' "
                + "OR password LIKE '%"+key+"%' "
                + "OR level LIKE '%"+key+"%'";
        viewData(w);
    }//GEN-LAST:event_tekscariKeyReleased

    private void tabledataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabledataMouseClicked

    }//GEN-LAST:event_tabledataMouseClicked

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        tekscari.setText(""); 
        viewData("");
    }//GEN-LAST:event_btn_refreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilandatauser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tabledata;
    private javax.swing.JTextField tekscari;
    // End of variables declaration//GEN-END:variables

    public static void viewData(String where) {
        
        try {
            DefaultTableModel m = (DefaultTableModel) tabledata.getModel();
            m.getDataVector().removeAllElements();
            Connection K = Config.configDB();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM akun "+where;
            ResultSet R = S.executeQuery(Q);
            int n = 1;
            while (R.next()) {                 
                int id = R.getInt("id_akun");
                String fullname = R.getString("fullname");
                String username = R.getString("username");
                String password = R.getString("password");
                String level = R.getString("level");
                Object[] data = {id,n,  fullname, username, password, level};
                m.addRow(data);
                n++;
            }
            
            tabledata.getColumnModel().getColumn(0).setMinWidth(0);
            tabledata.getColumnModel().getColumn(0).setMaxWidth(0);
            
        } catch (Exception e) {
            //error handling
        }
    }
}

