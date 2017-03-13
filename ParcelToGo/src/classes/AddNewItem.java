package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Ion Pantalon
 */
public class AddNewItem extends javax.swing.JFrame {

    public AddNewItem() {
        initComponents();
        //set the labels to false
        label_item.setVisible(false);
        label_source.setVisible(false);
        label_destination.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        close_button = new javax.swing.JButton();
        save_button = new javax.swing.JButton();
        reset_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txt_source = new javax.swing.JTextField();
        label_destination = new javax.swing.JLabel();
        txt_destination = new javax.swing.JTextField();
        label_source = new javax.swing.JLabel();
        txt_item = new javax.swing.JTextField();
        sourceLbl = new javax.swing.JLabel();
        label_item = new javax.swing.JLabel();
        itemLbl = new javax.swing.JLabel();
        destinationLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        close_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button-Close-icon.png"))); // NOI18N
        close_button.setText("Close");
        close_button.setActionCommand("");
        close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttonActionPerformed(evt);
            }
        });

        save_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Floppy-Small-icon.png"))); // NOI18N
        save_button.setText("Save");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        reset_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button-Refresh-icon.png"))); // NOI18N
        reset_button.setText("Reset");
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(save_button)
                .addGap(12, 12, 12)
                .addComponent(reset_button, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {close_button, reset_button, save_button});

        label_destination.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_destination.setForeground(new java.awt.Color(255, 0, 0));
        label_destination.setText("Please enter the destination");

        label_source.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_source.setForeground(new java.awt.Color(255, 0, 0));
        label_source.setText("Please enter the source");

        sourceLbl.setText("Source");

        label_item.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_item.setForeground(new java.awt.Color(255, 0, 0));
        label_item.setText("Please enter an item");

        itemLbl.setText("Item");

        destinationLbl.setText("Destination");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Add a new order ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(destinationLbl)
                            .addComponent(itemLbl)
                            .addComponent(sourceLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_destination)
                            .addComponent(label_item)
                            .addComponent(txt_item, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_source)
                            .addComponent(txt_destination, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_source, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_item)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_source)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_destination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_destination)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttonActionPerformed
        dispose();      //close the window
    }//GEN-LAST:event_close_buttonActionPerformed

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        if (txt_item.getText().equals("")) {
            label_item.setVisible(true);
        } else if (txt_source.getText().equals("")) {
            label_source.setVisible(true);
        } else if (txt_destination.getText().equals("")) {
            label_destination.setVisible(true);
        } else {
            //set the methods to the data from text fields
            Slip slip = new Slip(txt_item.getText(), txt_source.getText(), txt_destination.getText());
            //calling the add new order 
            Dispatch dispatch = new Dispatch();
            dispatch.addNewOrder();
            this.setVisible(false);
        }
    }//GEN-LAST:event_save_buttonActionPerformed

    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
        int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to reset?", "Reset", JOptionPane.YES_NO_OPTION);
        if (answer == 0) {
            if (!txt_item.getText().equals("")) {
                txt_item.setText("");
            }
            if (!txt_source.getText().equals("")) {
                txt_source.setText("");
            }
            if (!txt_destination.getText().equals("")) {
                txt_destination.setText("");
            }
        }
    }//GEN-LAST:event_reset_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close_button;
    private javax.swing.JLabel destinationLbl;
    private javax.swing.JLabel itemLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_destination;
    private javax.swing.JLabel label_item;
    private javax.swing.JLabel label_source;
    private javax.swing.JButton reset_button;
    private javax.swing.JButton save_button;
    private javax.swing.JLabel sourceLbl;
    public static javax.swing.JTextField txt_destination;
    public static javax.swing.JTextField txt_item;
    public static javax.swing.JTextField txt_source;
    // End of variables declaration//GEN-END:variables
}
