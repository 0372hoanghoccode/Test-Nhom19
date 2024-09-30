/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Component;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Admin
 */
public class SearchBar extends javax.swing.JPanel {

    /**
     * Creates new form SearchBar
     */
    public SearchBar() {
        initComponents();
        lamMoiBtn.setIcon(new FlatSVGIcon("./image/icon/toolBar_refresh.svg"));
        txtSearch.putClientProperty("JTextField.placeholderText", "Nhập nội dung muốn tìm kiếm...");
        txtSearch.putClientProperty("JTextField.showClearButton", true);
    }
    
    public SearchBar(String[] str) {
        initComponents();
        cbxType.setModel(new DefaultComboBoxModel<>(str));
        lamMoiBtn.setIcon(new FlatSVGIcon("./image/icon/toolBar_refresh.svg"));
        txtSearch.putClientProperty("JTextField.placeholderText", "Nhập nội dung muốn tìm kiếm...");
        txtSearch.putClientProperty("JTextField.showClearButton", true);
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

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(221, 221, 221)));
        setPreferredSize(new java.awt.Dimension(630, 100));

        txtSearch.setPreferredSize(new java.awt.Dimension(250, 44));

        lamMoiBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lamMoiBtn.setText("Làm mới");
        lamMoiBtn.setAlignmentY(0.0F);
        lamMoiBtn.setFocusPainted(false);
        lamMoiBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lamMoiBtn.setPreferredSize(new java.awt.Dimension(125, 44));

        jLabel1.setText("Tìm kiếm theo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lamMoiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lamMoiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cbxType;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton lamMoiBtn;
    public javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
