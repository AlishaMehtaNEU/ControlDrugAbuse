/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StoreRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.StoreOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PrescriptionRequest;
import helper.Helper;
import helper.Prescription;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.UserAccount.StoreAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import userinterface.SystemAdminWorkArea.ManageNetworkJPanel;
import userinterface.StoreRole.ViewStoreUserJPanel;
/**
 *
 * @author ashwin
 */
public class StoreUserWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private StoreOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    /**
     * Creates new form StoreUserWorkAreaJPanel
     */
    
    public StoreUserWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, StoreOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        workRequestJTable.setFillsViewportHeight(true);
        workRequestJTable2.setFillsViewportHeight(true);
        pouplateTable();  
        pouplateDispatchTable();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDisptach = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestJTable2 = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        valueLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1225, 700));
        setMinimumSize(new java.awt.Dimension(1225, 700));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1225, 700));

        btnDisptach.setBackground(new java.awt.Color(255, 255, 255));
        btnDisptach.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btnDisptach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Send.png"))); // NOI18N
        btnDisptach.setText("Dispatch");
        btnDisptach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDisptachMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDisptachMouseExited(evt);
            }
        });
        btnDisptach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisptachActionPerformed(evt);
            }
        });

        refreshTestJButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshTestJButton.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        refreshTestJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshTestJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshTestJButtonMouseExited(evt);
            }
        });
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        enterpriseLabel.setText("Hello Operator");

        jPanel1.setBackground(new java.awt.Color(181, 181, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Doctor", "Status", "Patient Name", "Time Issued"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setGridColor(new java.awt.Color(255, 255, 255));
        workRequestJTable.setRowHeight(22);
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Please check customer requests for this week:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 376, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );

        valueLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(181, 181, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setText("Please see dispatched requests here:");

        workRequestJTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Doctor", "Status", "Patient Name", "Time Issued"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable2.setGridColor(new java.awt.Color(255, 255, 255));
        workRequestJTable2.setRowHeight(22);
        jScrollPane3.setViewportView(workRequestJTable2);
        if (workRequestJTable2.getColumnModel().getColumnCount() > 0) {
            workRequestJTable2.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable2.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable2.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable2.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable2.getColumnModel().getColumn(4).setResizable(false);
            workRequestJTable2.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnView.setBackground(new java.awt.Color(255, 255, 255));
        btnView.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png"))); // NOI18N
        btnView.setText("View");
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewMouseExited(evt);
            }
        });
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        valueLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        valueLabel1.setText("Hope you are doing well today!");

        jPanel3.setBackground(new java.awt.Color(181, 181, 255));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Store User Workspace");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(571, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valueLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(refreshTestJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDisptach))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDisptach, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void pouplateTable(){
        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        dtm.setRowCount(0);
        for(WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList()) {
            PrescriptionRequest prescriptionWorkRequest = (PrescriptionRequest) workRequest;
            if(prescriptionWorkRequest.getStoreAccount() != null){
                if(prescriptionWorkRequest.getStoreAccount().equals(userAccount) && prescriptionWorkRequest.getStatus().toString().equals("RoutedToStore")){
                    Object row[] = new Object[6];
                    row[0] = prescriptionWorkRequest.getMessage();
                    row[1] = prescriptionWorkRequest.getSender();
                    row[2] = prescriptionWorkRequest.getPrescription();
                    row[3] = prescriptionWorkRequest.getStatus();
                    row[4] = prescriptionWorkRequest;
                    row[5] = prescriptionWorkRequest.getPrescription().getTimeIssued();
                    dtm.addRow(row);
                }
            }
        }
    }
    
    public void pouplateDispatchTable(){
        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable2.getModel();
        dtm.setRowCount(0);
        for(WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList()) {
            PrescriptionRequest prescriptionWorkRequest = (PrescriptionRequest) workRequest;
            if(prescriptionWorkRequest.getStoreAccount() != null){
                if(prescriptionWorkRequest.getStoreAccount().equals(userAccount) && prescriptionWorkRequest.getStatus().toString().equals("ReadyForPickup")){
                    Object row[] = new Object[6];
                    row[0] = prescriptionWorkRequest.getMessage();
                    row[1] = prescriptionWorkRequest.getSender();
                    row[2] = prescriptionWorkRequest;
                    row[3] = prescriptionWorkRequest.getStatus();
                    row[4] = prescriptionWorkRequest;
                    row[5] = prescriptionWorkRequest.getPrescription().getTimeIssued();
                    dtm.addRow(row);
                }
            }
        }
    }
    public void setColor(JButton p){
        p.setBackground(new Color(102,102,255));
    }
    public void resetColor(JButton p1){
        p1.setBackground(new Color(255,255,255));
        
    }
    private void btnDisptachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisptachActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow >= 0) {
            Prescription prescription = (Prescription) workRequestJTable.getValueAt(selectedRow, 2);
            PrescriptionRequest request = (PrescriptionRequest) workRequestJTable.getValueAt(selectedRow, 4);
            request.setSender(userAccount);
            request.setPrescription(prescription);
            request.setStatus(Helper.WorkRequestStatus.ReadyForPickup);
            StoreAccount str = (StoreAccount) userAccount;
            Helper.sendEmail(request.getPrescription().getPatient().getEmail(), "From Store", "Medicines are ready. Please visit store " + str.getAddress() + ". Person handling your request is " + userAccount.getEmployee().getName());
            dB4OUtil.storeSystem(system);
            JOptionPane.showMessageDialog(null, "A request mail has been sent to user to pick up medicines");
        }
        else
            JOptionPane.showMessageDialog(null, "Please select a record to dispatch");
//        Organization currentNetworkGoverningOrg = null;
//        
//        for(Network network: system.getNetworkList()){
//            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()) {
//                if(enterprise.getEnterpriseType() == Enterprise.EnterpriseType.GoverningBody) {
//                    for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()) {
//                        if(organization instanceof StoreOrganization){
//                            currentNetworkGoverningOrg = organization;
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//        
//        if (currentNetworkGoverningOrg != null) {
//            currentNetworkGoverningOrg.getWorkQueue().getWorkRequestList().add(request);
//            userAccount.getWorkQueue().getWorkRequestList().add(request);
//            Helper.sendEmail(request.getPrescription().getPatient().getEmail(), "From Store", "Medicines are ready" );
//            dB4OUtil.storeSystem(system);
//            pouplateDispatchTable();
//            pouplateTable();
//        }
//        
        
    }//GEN-LAST:event_btnDisptachActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

       pouplateTable();
       pouplateDispatchTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow >= 0) {
            String message = workRequestJTable.getValueAt(selectedRow, 0).toString();
            String sender = workRequestJTable.getValueAt(selectedRow, 1).toString();;
            String doctor = workRequestJTable.getValueAt(selectedRow, 2).toString();;
            String status = workRequestJTable.getValueAt(selectedRow, 3).toString();
            PrescriptionRequest patient = (PrescriptionRequest) workRequestJTable.getValueAt(selectedRow, 4);
            String time = workRequestJTable.getValueAt(selectedRow, 5).toString();
            ViewStoreUserJPanel viewStoreUserJPanel = new ViewStoreUserJPanel(userProcessContainer, system, message, sender, doctor, status, patient, time);
            userProcessContainer.add("viewStoreUserJPanel",viewStoreUserJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
            JOptionPane.showMessageDialog(null, "Please select a record to view");
    }//GEN-LAST:event_btnViewActionPerformed

    private void refreshTestJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshTestJButtonMouseEntered
        // TODO add your handling code here:
        setColor(refreshTestJButton);
    }//GEN-LAST:event_refreshTestJButtonMouseEntered

    private void refreshTestJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshTestJButtonMouseExited
        // TODO add your handling code here:
        resetColor(refreshTestJButton);
    }//GEN-LAST:event_refreshTestJButtonMouseExited

    private void btnViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseEntered
        // TODO add your handling code here:
        setColor( btnView);
    }//GEN-LAST:event_btnViewMouseEntered

    private void btnViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseExited
        // TODO add your handling code here:
        resetColor( btnView);
    }//GEN-LAST:event_btnViewMouseExited

    private void btnDisptachMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDisptachMouseEntered
        // TODO add your handling code here:
        setColor(btnDisptach);
    }//GEN-LAST:event_btnDisptachMouseEntered

    private void btnDisptachMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDisptachMouseExited
        // TODO add your handling code here:
        resetColor(btnDisptach);
    }//GEN-LAST:event_btnDisptachMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisptach;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel1;
    private javax.swing.JTable workRequestJTable;
    private javax.swing.JTable workRequestJTable2;
    // End of variables declaration//GEN-END:variables
}
