/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Component;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import java.awt.BorderLayout;
/**
 *
 * @author Admin
 */
public class SearchBar1 extends javax.swing.JPanel {
    SearchTongTien searchTongTien = new SearchTongTien();
    SearchDaytoDay searchDaytoDay = new SearchDaytoDay();
    /**
     * Creates new form SearchBar
     */
    public SearchBar1() {
        initComponents();
        lamMoiBtn.setIcon(new FlatSVGIcon("./image/icon/toolBar_refresh.svg"));
        txtSearch.putClientProperty("JTextField.placeholderText", "Nhập nội dung muốn tìm kiếm...");
        txtSearch.putClientProperty("JTextField.showClearButton", true);
//        addSearchDaytoDay();
//        addSearchTongTien();
        
        setupComboBoxListener();
    }
    
    public SearchBar1(String[] str) {
        initComponents();
        cbxType.setModel(new DefaultComboBoxModel<>(str));
        lamMoiBtn.setIcon(new FlatSVGIcon("./image/icon/toolBar_refresh.svg"));
        txtSearch.putClientProperty("JTextField.placeholderText", "Nhập nội dung muốn tìm kiếm...");
        txtSearch.putClientProperty("JTextField.showClearButton", true);
//        addSearchDaytoDay();
//        addSearchTongTien();
        setupComboBoxListener();
    }
    
    
    
     private void addSearchDaytoDay() {
    searchDaytoDay.setVisible(true);
    JpanelHien.removeAll();
    
    // Set the layout for JpanelHien
    JpanelHien.setLayout(new BorderLayout()); // Change to BorderLayout if needed
    
    // Add the SearchTongTien panel to JpanelHien
    JpanelHien.add(searchDaytoDay, BorderLayout.CENTER); // Use BorderLayout.CENTER to fill the panel
    
    // Revalidate and repaint to update the layout
    JpanelHien.revalidate();
    JpanelHien.repaint();
}
     
     private void addSearchTongTien() {
    searchTongTien.setVisible(true);
    // Clear all existing components from JpanelHien
    JpanelHien.removeAll();
    
    // Set the layout for JpanelHien
    JpanelHien.setLayout(new BorderLayout()); // Change to BorderLayout if needed
    
    // Add the SearchTongTien panel to JpanelHien
    JpanelHien.add(searchTongTien, BorderLayout.CENTER); // Use BorderLayout.CENTER to fill the panel
    
    // Revalidate and repaint to update the layout
    JpanelHien.revalidate();
    JpanelHien.repaint();
}
     private void setupComboBoxListener() {
    // Add an ActionListener to the JComboBox
    cbxType.addActionListener(e -> {
        // Get the selected item from the JComboBox
        String selectedItem = (String) cbxType.getSelectedItem();

        // Check if searchTongTien is not null
       if (searchTongTien != null) {
    // Kiểm tra nếu giá trị của selectedItem là "Tổng Tiền"
            if (selectedItem.equals("Tổng tiền")) {
            searchTongTien.setVisible(true); // Hiện panel SearchTongTien
            searchDaytoDay.setVisible(false);
            addSearchTongTien();
            }
            else if (selectedItem.equals("Ngày xuất")) {
             searchDaytoDay.setVisible(true);
             searchTongTien.setVisible(false);
             addSearchDaytoDay();
            } else {
            searchTongTien.setVisible(false); // Ẩn panel SearchTongTien
            searchDaytoDay.setVisible(false);
    }
}

        // Revalidate and repaint to update the layout
        JpanelHien.revalidate();
        JpanelHien.repaint();
    });
}


     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearch = new javax.swing.JTextField();
        lamMoiBtn = new javax.swing.JButton();
        cbxType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        JpanelHien = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(221, 221, 221)));
        setPreferredSize(new java.awt.Dimension(630, 100));

        txtSearch.setPreferredSize(new java.awt.Dimension(250, 44));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        lamMoiBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lamMoiBtn.setText("Làm mới");
        lamMoiBtn.setAlignmentY(0.0F);
        lamMoiBtn.setFocusPainted(false);
        lamMoiBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lamMoiBtn.setPreferredSize(new java.awt.Dimension(125, 44));

        jLabel1.setText("Tìm kiếm theo:");

        JpanelHien.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout JpanelHienLayout = new javax.swing.GroupLayout(JpanelHien);
        JpanelHien.setLayout(JpanelHienLayout);
        JpanelHienLayout.setHorizontalGroup(
            JpanelHienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        JpanelHienLayout.setVerticalGroup(
            JpanelHienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JpanelHien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lamMoiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lamMoiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpanelHien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelHien;
    public javax.swing.JComboBox<String> cbxType;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton lamMoiBtn;
    public javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
