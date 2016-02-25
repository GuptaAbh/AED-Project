/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Department;

import Business.ExtendedClasses.WorkRequestHistory;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ViewRequestHistory extends javax.swing.JPanel {

    /**
     * Creates new form ViewRequestHistory
     */
    private WorkRequest request;
    private JPanel userProcessContainer;
    public ViewRequestHistory(WorkRequest request,JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer =userProcessContainer;
        this.request = request;
        populatetable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestHistory = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 153));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        tblRequestHistory.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tblRequestHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Owner", "Owner Organization", "Assigned Date", "Completed Date", "Owner Comments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequestHistory);

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(backJButton)
                .addContainerGap(242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequestHistory;
    // End of variables declaration//GEN-END:variables

    private void populatetable() {

        DefaultTableModel model = (DefaultTableModel) tblRequestHistory.getModel();
        model.setRowCount(0);
        for(WorkRequestHistory wrh : request.getWrh().getWorkRequestHisList())
               {
                   System.out.println(wrh.getAssignedDate()+"  "+ wrh.getConpletedDate()+" "+wrh.getReceiver()+" "+wrh.getReceiverOrganization());
                   
                   Object[] row = new Object[5];
            row[0] = wrh.getReceiver();
            row[1] = wrh.getReceiverOrganization();
            row[2] = wrh.getAssignedDate();
            row[3] = wrh.getConpletedDate();
            row[4] = wrh.getComment();
            model.addRow(row);
               }
        
    }
}
