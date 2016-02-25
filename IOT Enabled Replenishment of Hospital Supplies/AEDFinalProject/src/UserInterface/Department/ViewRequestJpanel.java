/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Department;

import Business.Enterprise.Enterprise;
import Business.ExtendedClasses.Machine;
import Business.ExtendedClasses.Sensor;
import Business.ExtendedClasses.WorkRequestHistory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DeptProcurementWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static jdk.internal.dynalink.support.Guards.isNull;

/**
 *
 * @author Abhishek
 */
public class ViewRequestJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewRequestJpanel
     */
    private JPanel userProcessContainer;
    private Organization org;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public ViewRequestJpanel(JPanel userProcessContainer,Organization organization,UserAccount account,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.org = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        populateMachineTable();
        populateRequestTable();
        
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
        workRequestJTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMachine = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        backJButton2 = new javax.swing.JButton();
        btnViewHistory = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 153));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        workRequestJTable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Reciever Organization", "Status", "Sender", "Sender Organization", "Machine Name", "Machine Status", "Requested Date", "Resolution Date", "Message form Servicing"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jTableMachine.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTableMachine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Machine Id", "Machine Name", "Sensor Name", "Sensor Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableMachine);
        if (jTableMachine.getColumnModel().getColumnCount() > 0) {
            jTableMachine.getColumnModel().getColumn(0).setResizable(false);
            jTableMachine.getColumnModel().getColumn(1).setResizable(false);
            jTableMachine.getColumnModel().getColumn(2).setResizable(false);
            jTableMachine.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Send Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backJButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton2.setText("<< Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });

        btnViewHistory.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnViewHistory.setText("View History");
        btnViewHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton2)
                        .addGap(53, 53, 53)
                        .addComponent(btnViewHistory))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton2)
                    .addComponent(btnViewHistory))
                .addContainerGap(223, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTableMachine.getSelectedRow();
        
        if(selectedRow>=0)
        {
            Machine machine = (Machine)(jTableMachine.getValueAt(selectedRow,1));
            String s = (String)jTableMachine.getValueAt(selectedRow, 2);
            System.out.println(s);
            if(s==null)
            {
                
                JOptionPane.showMessageDialog(this, "Kindly Add Sensor Value", "Error", JOptionPane.ERROR_MESSAGE);
                
            }
            else
            {
            if(machine.getSensorData().getSensorVlaue().equalsIgnoreCase("Working Fine"))
            {
               JOptionPane.showMessageDialog(this, "You can not Raise Request as Machine is Working Fine", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                if(machine.isIsRequestSent())
                        {
                            JOptionPane.showMessageDialog(this, "Request alreadey Present", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                else{
            SendRequestJPanel SendRequestJPanel = new SendRequestJPanel(userProcessContainer,machine,enterprise,userAccount,org);
            userProcessContainer.add("manageOrganizationJPanel", SendRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
                }
                   
            }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Kindly select Any Row!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed

    private void btnViewHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHistoryActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if(selectedRow>=0)
        {
            WorkRequest request = (DeptProcurementWorkRequest)(workRequestJTable.getValueAt(selectedRow,0));
            ViewRequestHistory ViewRequestHistory = new ViewRequestHistory(request,userProcessContainer);
            userProcessContainer.add("ViewRequestHistory", ViewRequestHistory);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Kindly select Any Row!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnViewHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton2;
    private javax.swing.JButton btnViewHistory;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMachine;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    private void populateMachineTable() {
      DefaultTableModel model = (DefaultTableModel) jTableMachine.getModel();
        model.setRowCount(0);
        for (Machine machine : org.getMachineDirectory().getMachineList()) {
                Object[] row = new Object[4];
                row[0] = machine.getMachineID();
                row[1] = machine;
                row[2] = machine.getSensorData().getSensorName();
                row[3] = machine.getSensorData().getSensorVlaue();
                model.addRow(row);
            
        }
        
    }

    public void populateRequestTable() {
       
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        if(userAccount.getWorkQueue().getWorkRequestList().size()>0){
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(!request.getStatus().equalsIgnoreCase("Serviced") && !request.getStatus().equalsIgnoreCase("Not Serviced"))
            {
               for(WorkRequestHistory wrh : request.getWrh().getWorkRequestHisList())
               {
                   System.out.println(wrh.getAssignedDate()+"  "+ wrh.getConpletedDate()+" "+wrh.getReceiver()+" "+wrh.getReceiverOrganization());
               }
                System.out.println(request.getWorkRequestId()+"IDS");
            Object[] row = new Object[11];
            row[0] = request;
            row[1] = request.getCurrentOwner();
            row[2] = request.getCurrentOwnerOrganzation();
            row[3] = request.getStatus();
            row[4] = request.getSender();
            row[5] = request.getOrg();
            row[6] = request.getMachine();
            row[7] = request.getSensorStatusOld();
            row[8] = request.getRequestDate();
            row[9] = request.getResolveDate();
            row[10] = request.getMsgforDept();
            model.addRow(row);
            }
        }
        }
    }
}