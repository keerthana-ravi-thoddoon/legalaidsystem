/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ClientRole;

import Business.Application.Application;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ClientOrganization;
import Business.Organization.ExaminerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kranthikumar
 */
public class ApplyForNPOJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ApplyForNPOJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount useraccount;
    private Enterprise enterprise;
    private ClientOrganization corg;
    private Network network;

    public ApplyForNPOJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, ClientOrganization corg, Network network, EcoSystem system) {
        try {
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.system = system;
            this.useraccount = account;
            this.corg = corg;
            this.enterprise = enterprise;
            this.network = network;

            if (useraccount.getApplication() == null) {
                useraccount.setApplication(new Application());
                updateBtn.setEnabled(false);
            } else {
                displayInfo(useraccount);
            }

            if (useraccount.getApplication().getStatus() == null) {
                valueLbl.setText("Pending...");
            } else {
                valueLbl.setText(useraccount.getApplication().getStatus());
            }

            /*if(useraccount.getApplication().getStatus().equals("Application Approved")){
            applyBtn.setEnabled(false);
            updateBtn.setEnabled(false);
        }
        else*/ {
                applyBtn.setEnabled(true);
                updateBtn.setEnabled(true);
            }
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Oops! we don't want you to see this. Please allow us sometime to fix it");
        }
    }

    private void displayInfo(UserAccount useraccount) {
        try {
            
            fnameTxt.setText(useraccount.getApplication().getFname());
            fnameTxt.setEnabled(false);
            lnameTxt.setText(useraccount.getApplication().getLname());
            lnameTxt.setEnabled(false);
            mnameTxt.setText(useraccount.getApplication().getMname());
            mnameTxt.setEnabled(false);
            aline1Txt.setText(useraccount.getApplication().getAline1());
            aline1Txt.setEnabled(false);
            aline2Txt.setText(useraccount.getApplication().getAline2());
            aline2Txt.setEnabled(false);
            cityTxt.setText(useraccount.getApplication().getCity());
            cityTxt.setEnabled(false);
            stateTxt.setText(useraccount.getApplication().getState());
            stateTxt.setEnabled(false);
            problemDescriptionTxt.setText(useraccount.getApplication().getProblemDescription());
            problemDescriptionTxt.setEnabled(false);
            incomeTxt.setText(convertInteger(useraccount.getApplication().getIncome()));
            incomeTxt.setEnabled(false);
            zipTxt.setText(convertInteger(useraccount.getApplication().getZip()));
            zipTxt.setEnabled(false);
//        numberTxt.setText(convertLong(useraccount.getApplication().getNumber()));
            ImageIcon icon = new ImageIcon((useraccount.getApplication().getPicturePath()));
            icon.setImage(icon.getImage().getScaledInstance(162, 102, Image.SCALE_DEFAULT));
            imageLbl.setIcon(icon);
            uploadBtn.setEnabled(false);
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Oops! we don't want you to see this. Please allow us sometime to fix it");
        }

    }

    public static String convertInteger(int i) {
        return Integer.toString(i);
    }

    public static String convertLong(long i) {
        return Long.toString(i);
    }

    private void updateApplication() {
        useraccount.getApplication().setFname(fnameTxt.getText());
        useraccount.getApplication().setMname(mnameTxt.getText());
        useraccount.getApplication().setLname(lnameTxt.getText());
        useraccount.getApplication().setAline1(aline1Txt.getText());
        useraccount.getApplication().setAline2(aline2Txt.getText());
        useraccount.getApplication().setCity(cityTxt.getText());
        useraccount.getApplication().setState(stateTxt.getText());
        useraccount.getApplication().setProblemDescription(problemDescriptionTxt.getText());
        useraccount.getApplication().setApplicant(useraccount);
//        ImageIcon icon = new ImageIcon((useraccount.getApplication().getPicturePath()));
//        icon.setImage(icon.getImage().getScaledInstance(162, 102, Image.SCALE_DEFAULT));
//        imageLbl.setIcon(icon);

        try {
            int income = Integer.parseInt(incomeTxt.getText());
            useraccount.getApplication().setIncome(income);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Income must be a number.");
            return;
        }

        try {
            int income = Integer.parseInt(incomeTxt.getText());
            useraccount.getApplication().setIncome(income);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Income must be a number.");
            return;
        }

//        try {
//            Long num;
//            num = Long.parseLong(numberTxt.getText());
//            useraccount.getApplication().setNumber(num);
//        }
//        catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Mobile number must be a number.");
//            return;
//        }
        JOptionPane.showMessageDialog(null, "Application Successfully Submitted");

        fnameTxt.setText("");
        lnameTxt.setText("");
        mnameTxt.setText("");
        aline1Txt.setText("");
        aline2Txt.setText("");
        cityTxt.setText("");
        stateTxt.setText("");
        zipTxt.setText("");
        problemDescriptionTxt.setText("");
        incomeTxt.setText("");
//        numberTxt.setText("");
        imageLbl.setText("");

        fnameTxt.setEditable(true);
        lnameTxt.setEditable(true);
        mnameTxt.setEditable(true);
        aline1Txt.setEditable(true);
        aline2Txt.setEditable(true);
        cityTxt.setEditable(true);
        stateTxt.setEditable(true);
        zipTxt.setEditable(true);
        incomeTxt.setEditable(true);
        problemDescriptionTxt.setEditable(true);
        uploadBtn.setEnabled(true);
//        numberTxt.setEditable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fnameTxt = new javax.swing.JTextField();
        mnameTxt = new javax.swing.JTextField();
        lnameTxt = new javax.swing.JTextField();
        aline1Txt = new javax.swing.JTextField();
        aline2Txt = new javax.swing.JTextField();
        cityTxt = new javax.swing.JTextField();
        stateTxt = new javax.swing.JTextField();
        zipTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        incomeTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        problemDescriptionTxt = new javax.swing.JTextField();
        applyBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        valueLbl = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        uploadBtn = new javax.swing.JButton();
        imageLbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel3.setText("Middle Name");

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel5.setText("Address Line 1");

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel6.setText("Address Line 2");

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel7.setText("City");

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel8.setText("State");

        jLabel9.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel9.setText("Zip Code");

        fnameTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameTxtActionPerformed(evt);
            }
        });

        mnameTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lnameTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameTxtActionPerformed(evt);
            }
        });

        cityTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        stateTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        zipTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel10.setText("Annual Income      $");

        incomeTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel12.setText("Problem Description");

        problemDescriptionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                problemDescriptionTxtActionPerformed(evt);
            }
        });

        applyBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        applyBtn.setText("Apply");
        applyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Status");

        valueLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel14.setText("Upload Supporting Documents");

        uploadBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uploadBtn.setText("Upload");
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Stencil", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("Apply for npo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valueLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(uploadBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(applyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(problemDescriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(aline2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(aline1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(incomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(stateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(zipTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(fnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(mnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(lnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(9, 9, 9)))))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aline1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aline2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(problemDescriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uploadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(applyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameTxtActionPerformed

    private void problemDescriptionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_problemDescriptionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_problemDescriptionTxtActionPerformed

    private void applyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyBtnActionPerformed
        // TODO add your handling code here:
        Organization org = null;
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                if (o instanceof ExaminerOrganization) {
                    org = o;
                    break;
                }
            }
            if (org != null) {
                if (org.getApplicationDirectory().getApplicationList().contains(useraccount.getApplication())) {
                    int i = org.getApplicationDirectory().getApplicationList().indexOf(useraccount.getApplication());
                    updateApplication();
                    org.getApplicationDirectory().getApplicationList().set(i, useraccount.getApplication());
                } else {
                    updateApplication();
                    org.getApplicationDirectory().getApplicationList().add(useraccount.getApplication());
                }
                break;
            }
        }
    }//GEN-LAST:event_applyBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        UpdateApplicationJPanel uajp = new UpdateApplicationJPanel(userProcessContainer, useraccount, corg, enterprise, network, system);
        userProcessContainer.add("UpdateApplicationJPanel", uajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void lnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameTxtActionPerformed

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        useraccount.getApplication().setPicturePath(chooser.getSelectedFile().getAbsolutePath());
        ImageIcon icon = new ImageIcon(useraccount.getApplication().getPicturePath());
        icon.setImage(icon.getImage().getScaledInstance(162, 102, Image.SCALE_DEFAULT));
        imageLbl.setIcon(icon);


    }//GEN-LAST:event_uploadBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aline1Txt;
    private javax.swing.JTextField aline2Txt;
    private javax.swing.JButton applyBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JTextField fnameTxt;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JTextField incomeTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lnameTxt;
    private javax.swing.JTextField mnameTxt;
    private javax.swing.JTextField problemDescriptionTxt;
    private javax.swing.JTextField stateTxt;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton uploadBtn;
    private javax.swing.JLabel valueLbl;
    private javax.swing.JTextField zipTxt;
    // End of variables declaration//GEN-END:variables
}
