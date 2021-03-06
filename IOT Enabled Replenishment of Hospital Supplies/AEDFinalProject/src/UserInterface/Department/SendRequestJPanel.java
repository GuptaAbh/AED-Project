/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Department;

import Business.Enterprise.Enterprise;
import Business.ExtendedClasses.Machine;
import Business.ExtendedClasses.NumericVerifier;
import Business.ExtendedClasses.StringVerifier;
import Business.ExtendedClasses.WorkRequestHistory;
import Business.ExtendedClasses.WorkRequestHistoryDir;
import Business.Organization.Organization;
import Business.Organization.ProcurementOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DeptProcurementWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Abhishek
 */
public class SendRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SendRequestJPanel
     */
    private JPanel userProcessContainer;
    private Machine machine ; 
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization org;
    public SendRequestJPanel(JPanel userProcessContainer, Machine machine, Enterprise enterprise , UserAccount account,Organization org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.machine = machine;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.org=org;
        System.out.println(machine.isIsMachineActive()+"val");
        addVerifiers();
    }
    private void addVerifiers() {
        InputVerifier stringVerifier = new StringVerifier();
        messageJTextField.setInputVerifier(stringVerifier);
        
        
                        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        backJButton2 = new javax.swing.JButton();
        messageJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 153));
        setPreferredSize(new java.awt.Dimension(1000, 700));

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

        messageJTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton2)
                        .addGap(45, 45, 45)
                        .addComponent(jButton1)))
                .addGap(275, 275, 275))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(backJButton2))
                .addContainerGap(232, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewRequestJpanel dwjp = (ViewRequestJpanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String message = messageJTextField.getText();
        DeptProcurementWorkRequest request = new DeptProcurementWorkRequest();
        //request.setOriginator(userAccount);
        //request.setOriginatorOrg(org);
            
            machine.setIsRequestSent(true);
            request.setSensorStatusOld(machine.getSensorData().getSensorVlaue());
            request.setMachine(machine);
            request.setRequestType("DeptToProc");
            request.setSender(userAccount);
            request.setDeptmessage(message);
            request.setMessage(message);
            WorkRequestHistoryDir wrhDir = request.getWrh();
            WorkRequestHistory wrh = wrhDir.addHistory();
            wrh.setAssignedDate(new Date());
            wrh.setReceiver(userAccount);
            wrh.setReceiverOrganization(org);
            wrh.setComment("Originator: "+message);
            request.setStatus("Sent to Procurement");
            request.setOrg(org);
            Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                if (organization instanceof ProcurementOrganization){
                    org = organization;
                    break;
                }
            }
        
            if (org!=null){
                request.setCurrentOwnerOrganzation(org);
                org.getWorkQueue().getWorkRequestList().add(request);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
                JOptionPane.showMessageDialog(this, "Request Send!!", "Update", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Procurement Organization not present Kindly Setup the Organization!!", "Update", JOptionPane.INFORMATION_MESSAGE);
            }
        
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            ViewRequestJpanel dwjp = (ViewRequestJpanel) component;
            dwjp.populateRequestTable();
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
            
            
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField messageJTextField;
    // End of variables declaration//GEN-END:variables
}
