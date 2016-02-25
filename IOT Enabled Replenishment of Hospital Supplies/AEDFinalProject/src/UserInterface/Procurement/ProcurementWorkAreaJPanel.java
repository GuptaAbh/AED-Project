/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Procurement;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ProcurementOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Abhishek
 */
public class ProcurementWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcurementWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private ProcurementOrganization procOrganization;
    private Enterprise enterprise;
    public ProcurementWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise= enterprise;
        this.procOrganization= (ProcurementOrganization) organization;
        checkPendingRequest();
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
        jButton2 = new javax.swing.JButton();
        AddProductJPanel = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 153));
        setMaximumSize(new java.awt.Dimension(1000, 600));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("View Department Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("View Served Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        AddProductJPanel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddProductJPanel.setText("Add Product To Organization");
        AddProductJPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductJPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddProductJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(439, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addGap(62, 62, 62)
                .addComponent(jButton2)
                .addGap(49, 49, 49)
                .addComponent(AddProductJPanel)
                .addContainerGap(237, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ProcViewRequestJpanel ProcViewRequestJpanel = new ProcViewRequestJpanel(userProcessContainer,userAccount,procOrganization,enterprise);
        userProcessContainer.add("ProcViewRequestJpanel", ProcViewRequestJpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ProcViewServedRequest ProcViewServedRequest = new ProcViewServedRequest(userProcessContainer,userAccount,procOrganization,enterprise);
        userProcessContainer.add("ProcViewServedRequest", ProcViewServedRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AddProductJPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductJPanelActionPerformed
        ProcuremenetAddProduct procuremenetAddSupplier = new ProcuremenetAddProduct(userProcessContainer,userAccount,procOrganization,enterprise);
        userProcessContainer.add("procuremenetAddSupplier", procuremenetAddSupplier);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
// TODO add your handling code here:
    }//GEN-LAST:event_AddProductJPanelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProductJPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables

    private void checkPendingRequest() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int count=0;
        
        for(WorkRequest request : procOrganization.getWorkQueue().getWorkRequestList())
        {
            if(request.getStatus().equalsIgnoreCase("Sent to Procurement") || request.getStatus().equalsIgnoreCase("Pending with Procurement"))
            {
                count ++;
            }
        
    }
        if(count>0)
        {
            InputStream in;
        try{
         in = new FileInputStream(new File (System.getProperty("user.dir")+"\\Sound.wav"));
         //private static final String FILENAME = System.getProperty("user.dir")+"\\DB.db4o";
         AudioStream audios = new  AudioStream(in);
         AudioPlayer.player.start(audios);
        }
        catch(Exception e){
             
        }
            JOptionPane.showMessageDialog(this, "Welcome "+ userAccount.getUsername()+", Your Organization have "+count+" pending Request !!", "Update", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Welcome "+ userAccount.getUsername()+", Your Organization have "+count+" pending Request !!", "Update", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
