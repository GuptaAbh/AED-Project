/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Department;

import Business.Enterprise.Enterprise;
import Business.ExtendedClasses.Machine;
import Business.ExtendedClasses.NumericVerifier;
import Business.ExtendedClasses.RandonNumberGenerator;
import Business.ExtendedClasses.Sensor;
import Business.ExtendedClasses.StringVerifier;
import Business.ExtendedClasses.WorkRequestHistory;
import Business.ExtendedClasses.WorkRequestHistoryDir;
import Business.Organization.Organization;
import Business.Organization.ProcurementOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DeptProcurementWorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class AddSensorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddSensorJPanel
     */
    private JPanel userProcessContainer;
    private Machine machine;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization org;
    public AddSensorJPanel(JPanel userProcessContainer,Machine machine,Enterprise enterprise , UserAccount account,Organization org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.machine = machine;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.org=org;
        RandonNumberGenerator rng = new RandonNumberGenerator();
        int i = rng.randomGenerator();
        MacTemperaturetxt.setText(String.valueOf(i));
        if(i>60)
        {
            comboSensorValue.setSelectedIndex(2);
        }
        if(i<=30)
            
        {
            comboSensorValue.setSelectedIndex(0);
        }
        
        if(i>30 && i<=60)
            
        {
            comboSensorValue.setSelectedIndex(1);
        }
        
        addVerifiers();
    }
    private void addVerifiers() {
        InputVerifier stringVerifier = new StringVerifier();
        SensorNameTxt.setInputVerifier(stringVerifier);
        InputVerifier integerVerifier = new NumericVerifier();
        MacTemperaturetxt.setInputVerifier(integerVerifier);   
        
                        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SensorNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboSensorValue = new javax.swing.JComboBox();
        btnSave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        MacTemperaturetxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 204, 153));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Sensor Name");

        SensorNameTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SensorNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SensorNameTxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Sensor Value");

        comboSensorValue.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        comboSensorValue.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Need to Replace", "Critical", "Down" }));
        comboSensorValue.setEnabled(false);
        comboSensorValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSensorValueActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Machine Temperature");

        MacTemperaturetxt.setEditable(false);
        MacTemperaturetxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MacTemperaturetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MacTemperaturetxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(backJButton)
                    .addComponent(jLabel3))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addComponent(comboSensorValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SensorNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MacTemperaturetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SensorNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboSensorValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MacTemperaturetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(backJButton))
                .addContainerGap(266, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void SensorNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SensorNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SensorNameTxtActionPerformed

    private void comboSensorValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSensorValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSensorValueActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Sensor sensor =machine.getSensorData();
        sensor.setSensorName(SensorNameTxt.getText());
        sensor.setMachineTemp(Integer.parseInt(MacTemperaturetxt.getText()));
        sensor.setSensorVlaue(comboSensorValue.getSelectedItem().toString());
        
        JOptionPane.showMessageDialog(this, "Sensor Data Added Successfully!!", "Update", JOptionPane.INFORMATION_MESSAGE);
        
        
        if(comboSensorValue.getSelectedItem().toString().equalsIgnoreCase("Down"))
        {
            if(machine.isIsRequestSent())
            {
                
            }
            else{
        
        DeptProcurementWorkRequest request = new DeptProcurementWorkRequest();
        machine.setIsRequestSent(true);
        request.setSensorStatusOld(machine.getSensorData().getSensorVlaue());
        request.setMachine(machine);
        request.setSender(userAccount);
        //request.setDeptmessage(message);
        request.setMessage("Automated Request");
            WorkRequestHistoryDir wrhDir = request.getWrh();
            WorkRequestHistory wrh = wrhDir.addHistory();
            wrh.setAssignedDate(new Date());
            wrh.setReceiver(userAccount);
            wrh.setReceiverOrganization(org);
            wrh.setComment("Originator: Automated Request");
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
            System.out.println(userAccount);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        
            }
        }
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void MacTemperaturetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MacTemperaturetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MacTemperaturetxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MacTemperaturetxt;
    private javax.swing.JTextField SensorNameTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox comboSensorValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
