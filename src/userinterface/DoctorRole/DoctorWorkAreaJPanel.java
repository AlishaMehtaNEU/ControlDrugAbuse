/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.GoverningBodyOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PrescriptionRequest;
import Business.WorkQueue.WorkRequest;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import helper.Prescription;
import helper.Helper;
import helper.Medicine;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.UserRole.PrescriptionJPanel;

/**
 *
 * @author ashwin
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
     private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
     private EcoSystem system;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise, EcoSystem system) {
        
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        valueLabel.setText(userAccount.getEmployee().getName());
        workRequestJTable.setFillsViewportHeight(true);
        workRequestJTable1.setFillsViewportHeight(true);
        populateAllTables();
    }
    
    public void populateAllTables() {
         populateRequestTable();
         populateDoctorsRequestsTable();
     }
    
    public void populateRequestTable() {
        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        dtm.setRowCount(0);
        for (WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList()) {
            if (workRequest.getStatus().equals(Helper.WorkRequestStatus.RoutedToDoctor)) {
                PrescriptionRequest prescriptionWorkRequest = (PrescriptionRequest) workRequest;
                if (prescriptionWorkRequest.getPrescription().getDoctor() != null) {
                    if (prescriptionWorkRequest.getPrescription().getDoctor().equals(userAccount)) {
                        Object row[] = new Object[4];
                        row[0] = prescriptionWorkRequest.getMessage();
                        row[1] = prescriptionWorkRequest.getStatus();
                        row[2] = prescriptionWorkRequest;
                        row[3] = prescriptionWorkRequest.getPrescription().getTimeIssued();
                        dtm.addRow(row);
                    }
                }
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        valueLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnReject = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnViewHistory = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestJTable1 = new javax.swing.JTable();
        btnSaveMsg = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1225, 700));
        setMinimumSize(new java.awt.Dimension(1225, 700));
        setPreferredSize(new java.awt.Dimension(1225, 700));
        setRequestFocusEnabled(false);

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
        enterpriseLabel.setText("Hello Dr");

        valueLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        valueLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        valueLabel1.setText("Hope you are doing well today!");

        jPanel1.setBackground(new java.awt.Color(181, 181, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Please check patient requests for this week:");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Status", "Patient Name", "Time Issued"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setToolTipText("");
        workRequestJTable.setFocusable(false);
        workRequestJTable.setGridColor(new java.awt.Color(255, 255, 255));
        workRequestJTable.setRowHeight(22);
        jScrollPane2.setViewportView(workRequestJTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        btnReject.setBackground(new java.awt.Color(255, 255, 255));
        btnReject.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btnReject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wrong.png"))); // NOI18N
        btnReject.setText("Reject");
        btnReject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRejectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRejectMouseExited(evt);
            }
        });
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        btnApprove.setBackground(new java.awt.Color(255, 255, 255));
        btnApprove.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btnApprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.png"))); // NOI18N
        btnApprove.setText("Approve");
        btnApprove.setMaximumSize(new java.awt.Dimension(197, 39));
        btnApprove.setMinimumSize(new java.awt.Dimension(197, 39));
        btnApprove.setPreferredSize(new java.awt.Dimension(197, 39));
        btnApprove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnApproveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnApproveMouseExited(evt);
            }
        });
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnViewHistory.setBackground(new java.awt.Color(255, 255, 255));
        btnViewHistory.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btnViewHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download.png"))); // NOI18N
        btnViewHistory.setText("View History");
        btnViewHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewHistoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewHistoryMouseExited(evt);
            }
        });
        btnViewHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHistoryActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(181, 181, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(490, 209));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setText("Please check patient requests history:");

        workRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Status", "Patient Name", "Time Issued"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable1.setGridColor(new java.awt.Color(255, 255, 255));
        workRequestJTable1.setRowHeight(22);
        jScrollPane3.setViewportView(workRequestJTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnSaveMsg.setBackground(new java.awt.Color(255, 255, 255));
        btnSaveMsg.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btnSaveMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/message-text.png"))); // NOI18N
        btnSaveMsg.setText("Save Message");
        btnSaveMsg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMsgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMsgMouseExited(evt);
            }
        });
        btnSaveMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveMsgActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(181, 181, 255));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Doctor Workspace");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(98, 98, 98)
                .addComponent(enterpriseLabel)
                .addGap(12, 12, 12)
                .addComponent(valueLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valueLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnApprove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refreshTestJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaveMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(valueLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSaveMsg)
                        .addGap(18, 18, 18)
                        .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnReject)
                        .addGap(12, 12, 12)
                        .addComponent(btnViewHistory))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void populateDoctorsRequestsTable() {
        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable1.getModel();
        dtm.setRowCount(0);
            
        for(WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList()) {
            if(workRequest.getStatus().equals(Helper.WorkRequestStatus.ApprovedByDoctor) || 
               workRequest.getStatus().equals(Helper.WorkRequestStatus.RejectedByDoctor)) {
                PrescriptionRequest prescriptionWorkRequest = (PrescriptionRequest) workRequest;
                
                if(prescriptionWorkRequest.getPrescription().getDoctor() != null){
                    if(prescriptionWorkRequest.getPrescription().getDoctor().equals(userAccount)) {
                        Object row[] = new Object[4];
                        row[0] = prescriptionWorkRequest.getMessage();
                        row[1] = prescriptionWorkRequest.getStatus();
                        row[2] = prescriptionWorkRequest;
                        row[3] = prescriptionWorkRequest.getPrescription().getTimeIssued();

                        dtm.addRow(row);
                    }
                }
            }
        }
    }
    
    
    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateAllTables();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if(selectedRow >= 0){
            PrescriptionRequest request = (PrescriptionRequest) workRequestJTable.getValueAt(selectedRow, 2);
            request.setMessage(request.getMessage());
            request.setSender(userAccount);
            request.setStatus(Helper.WorkRequestStatus.RejectedByDoctor);
            Organization currentNetworkGoverningOrg = null;
            dB4OUtil.storeSystem(system);

            populateAllTables();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
//        for(Network network: system.getNetworkList()){
//            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()) {
//                if(enterprise.getEnterpriseType() == Enterprise.EnterpriseType.GoverningBody) {
//                    for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()) {
//                        if(organization instanceof GoverningBodyOrganization){
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
//            
//            dB4OUtil.storeSystem(system);
//            
//           
//        }
    }//GEN-LAST:event_btnRejectActionPerformed
 public void setColor(JButton p){
        p.setBackground(new Color(102,102,255));
    }
    public void resetColor(JButton p1){
        p1.setBackground(new Color(255,255,255));
        
    }
    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if(selectedRow >= 0){
            PrescriptionRequest request = (PrescriptionRequest) workRequestJTable.getValueAt(selectedRow, 2);
            request.setMessage(request.getMessage());
            request.setSender(userAccount);
            request.setStatus(Helper.WorkRequestStatus.ApprovedByDoctor);
            Organization currentNetworkGoverningOrg = null;
            dB4OUtil.storeSystem(system);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        populateAllTables();
        
//        for(Network network: system.getNetworkList()){
//            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()) {
//                if(enterprise.getEnterpriseType() == Enterprise.EnterpriseType.GoverningBody) {
//                    for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()) {
//                        if(organization instanceof GoverningBodyOrganization){
//                            currentNetworkGoverningOrg = organization;
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//                
//        if (currentNetworkGoverningOrg != null) {
//            System.out.println("Inside Doc1"  + currentNetworkGoverningOrg.getWorkQueue().getWorkRequestList());
//            currentNetworkGoverningOrg.getWorkQueue().getWorkRequestList().add(request);
//            System.out.println("Inside Doc2"  + userAccount.getWorkQueue().getWorkRequestList());
//            userAccount.getWorkQueue().getWorkRequestList().add(request);
//            System.out.println("Inside Doc3"  + currentNetworkGoverningOrg.getWorkQueue().getWorkRequestList());
//            System.out.println("Inside Doc4"  + userAccount.getWorkQueue().getWorkRequestList());
//            dB4OUtil.storeSystem(system);
//            
//           
//        }
        
        
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnViewHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHistoryActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow >= 0) {     
            PrescriptionRequest request = (PrescriptionRequest) workRequestJTable.getValueAt(selectedRow, 2);

            Document document = new Document(PageSize.A4, 50, 50, 50, 50);
            document.addAuthor("Surya");


            document.addSubject("All prescriptions for " + request.getPrescription().getPatient().getEmployee().getName());
            
            String fileName = "allMedicines-" + request.getPrescription().getPatient().getEmployee().getName() + ".pdf";

            try {
                PdfWriter.getInstance(document , new FileOutputStream(fileName));
            } catch (FileNotFoundException | DocumentException ex) {
                Logger.getLogger(PrescriptionJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            document.open();

            for (Prescription prescription : request.getPrescription().getPatient().getListOfPrescriptions()) {
                try {
                    document.add(new Paragraph("Prescription for " + prescription.getPatient().getEmployee().getName() + " from " + prescription.getDoctor()));
                    document.add(Chunk.NEWLINE);
                } catch (DocumentException ex) {
                    Logger.getLogger(PrescriptionJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

                PdfPTable table = new PdfPTable(2);

                table.addCell("Medicine Name");
                table.addCell("Quantity");

                for (Medicine medicine : prescription.getMedicines()) {
                    String medicineName = medicine.getName();
                    Integer quantity = medicine.getQuantity();

                    table.addCell(medicineName);
                    table.addCell(Integer.toString(quantity));
                }

                try {
                    document.add(table);
                    document.add(Chunk.NEWLINE);
                } catch (DocumentException ex) {
                    Logger.getLogger(PrescriptionJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            JOptionPane.showMessageDialog(null, "File downloaded - " + fileName);
            document.close();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
    }//GEN-LAST:event_btnViewHistoryActionPerformed

    private void btnViewHistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewHistoryMouseEntered
        // TODO add your handling code here:
        setColor(btnViewHistory);
    }//GEN-LAST:event_btnViewHistoryMouseEntered

    private void btnViewHistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewHistoryMouseExited
        // TODO add your handling code here:
        resetColor(btnViewHistory);
    }//GEN-LAST:event_btnViewHistoryMouseExited

    private void btnApproveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApproveMouseEntered
        // TODO add your handling code here:
        setColor(btnApprove);
    }//GEN-LAST:event_btnApproveMouseEntered

    private void btnApproveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApproveMouseExited
        // TODO add your handling code here:
        resetColor(btnApprove);
    }//GEN-LAST:event_btnApproveMouseExited

    private void btnRejectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRejectMouseEntered
        // TODO add your handling code here:
        setColor(btnReject);
    }//GEN-LAST:event_btnRejectMouseEntered

    private void btnRejectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRejectMouseExited
        // TODO add your handling code here:
        resetColor(btnReject);
    }//GEN-LAST:event_btnRejectMouseExited

    private void refreshTestJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshTestJButtonMouseEntered
        // TODO add your handling code here:
        setColor(refreshTestJButton);
    }//GEN-LAST:event_refreshTestJButtonMouseEntered

    private void refreshTestJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshTestJButtonMouseExited
        // TODO add your handling code here:
        resetColor(refreshTestJButton);
    }//GEN-LAST:event_refreshTestJButtonMouseExited

    private void btnSaveMsgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMsgMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveMsgMouseEntered

    private void btnSaveMsgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMsgMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveMsgMouseExited

    private void btnSaveMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveMsgActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if(selectedRow >= 0){
            PrescriptionRequest request = (PrescriptionRequest) workRequestJTable.getValueAt(selectedRow, 2);
            String message  = workRequestJTable.getValueAt(selectedRow, 0).toString();
            request.setMessage(message);
            dB4OUtil.storeSystem(system);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
    }//GEN-LAST:event_btnSaveMsgActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnSaveMsg;
    private javax.swing.JButton btnViewHistory;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel1;
    private javax.swing.JTable workRequestJTable;
    private javax.swing.JTable workRequestJTable1;
    // End of variables declaration//GEN-END:variables
}