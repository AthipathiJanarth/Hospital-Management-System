package ui;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import models.contactInfo;
import models.employeeDetails;
import models.employeeDirectory;

/**
 *
 * @author athipathi
 */
public class createPanel extends javax.swing.JPanel {

    employeeDetails employee;
    contactInfo contact;
    employeeDirectory employeeList;
    public createPanel(employeeDirectory empList) {
        initComponents();
        employeeList= empList;
        radioMale.setActionCommand("Male");
        btnGrpGender.add(radioMale);
        radioFemale.setActionCommand("Female");
        btnGrpGender.add(radioFemale);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpGender = new javax.swing.ButtonGroup();
        labelCreate = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelEmpID = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        labelStartDate = new javax.swing.JLabel();
        labelLevel = new javax.swing.JLabel();
        labelTeamInfo = new javax.swing.JLabel();
        labelPosition = new javax.swing.JLabel();
        labelMobile = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelPhoto = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmployeeID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPosition = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        errTxt = new javax.swing.JLabel();
        errTxt1 = new javax.swing.JLabel();
        errTxt2 = new javax.swing.JLabel();
        errTxt3 = new javax.swing.JLabel();
        errTxt4 = new javax.swing.JLabel();
        errTxt5 = new javax.swing.JLabel();
        errTxt6 = new javax.swing.JLabel();
        errTxt7 = new javax.swing.JLabel();
        errTxt8 = new javax.swing.JLabel();
        errTxt9 = new javax.swing.JLabel();
        browseBtn = new javax.swing.JButton();
        errTxt10 = new javax.swing.JLabel();

        labelCreate.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        labelCreate.setText("Create New Employee");

        labelName.setText("Name");

        labelEmpID.setText("Employee ID");

        labelAge.setText("Age");

        labelGender.setText("Gender");

        labelStartDate.setText("Start Date");

        labelLevel.setText("Level");

        labelTeamInfo.setText("Team Info");

        labelPosition.setText("Position Title");
        labelPosition.setToolTipText("");

        labelMobile.setText("Phone Number");

        labelEmail.setText("Email ID");

        labelPhoto.setText("Photo");

        txtName.setToolTipText("");

        txtEmployeeID.setToolTipText("");

        txtAge.setToolTipText("");

        txtLevel.setToolTipText("");

        txtDate.setToolTipText("");

        txtTeamInfo.setToolTipText("");

        txtPosition.setToolTipText("");

        txtPhone.setToolTipText("");

        txtEmail.setToolTipText("");

        addBtn.setText("Add Employee");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        radioMale.setText("Male");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });

        radioFemale.setText("Female");

        errTxt.setForeground(new java.awt.Color(255, 51, 51));
        errTxt.setLabelFor(errTxt);
        errTxt.setText("*This is a Mandatory Field");
        errTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        errTxt1.setForeground(new java.awt.Color(255, 51, 51));
        errTxt1.setLabelFor(errTxt);
        errTxt1.setText("*This is a Mandatory Field");
        errTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        errTxt2.setForeground(new java.awt.Color(255, 51, 51));
        errTxt2.setLabelFor(errTxt);
        errTxt2.setText("*This is a Mandatory Field");
        errTxt2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        errTxt3.setForeground(new java.awt.Color(255, 51, 51));
        errTxt3.setLabelFor(errTxt);
        errTxt3.setText("*This is a Mandatory Field");
        errTxt3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        errTxt4.setForeground(new java.awt.Color(255, 51, 51));
        errTxt4.setLabelFor(errTxt);
        errTxt4.setText("*This is a Mandatory Field");
        errTxt4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        errTxt5.setForeground(new java.awt.Color(255, 51, 51));
        errTxt5.setLabelFor(errTxt);
        errTxt5.setText("*This is a Mandatory Field");
        errTxt5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        errTxt6.setForeground(new java.awt.Color(255, 51, 51));
        errTxt6.setLabelFor(errTxt);
        errTxt6.setText("*This is a Mandatory Field");
        errTxt6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        errTxt7.setForeground(new java.awt.Color(255, 51, 51));
        errTxt7.setLabelFor(errTxt);
        errTxt7.setText("*This is a Mandatory Field");
        errTxt7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        errTxt8.setForeground(new java.awt.Color(255, 51, 51));
        errTxt8.setLabelFor(errTxt);
        errTxt8.setText("*This is a Mandatory Field");
        errTxt8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        errTxt9.setForeground(new java.awt.Color(255, 51, 51));
        errTxt9.setLabelFor(errTxt);
        errTxt9.setText("*This is a Mandatory Field");
        errTxt9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        browseBtn.setText("Browse Image");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });

        errTxt10.setForeground(new java.awt.Color(255, 51, 51));
        errTxt10.setLabelFor(errTxt);
        errTxt10.setText("*Please Upload an Image");
        errTxt10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioMale)
                                .addGap(18, 18, 18)
                                .addComponent(radioFemale))
                            .addComponent(browseBtn)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt7, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt8, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt9, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt10, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioMale)
                    .addComponent(radioFemale)
                    .addComponent(errTxt3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTxt9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(browseBtn)
                        .addComponent(errTxt10)))
                .addGap(29, 29, 29)
                .addComponent(addBtn)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        errTxt.setVisible(false);
        errTxt1.setVisible(false);
        errTxt2.setVisible(false);
        errTxt3.setVisible(false);
        errTxt4.setVisible(false);
        errTxt5.setVisible(false);
        errTxt6.setVisible(false);
        errTxt7.setVisible(false);
        errTxt8.setVisible(false);
        errTxt9.setVisible(false);
        errTxt10.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMaleActionPerformed
    
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        clearErrorText();       
        if(validateFields()){            
            contact = new contactInfo();
            employee= new employeeDetails();
            employee.setEmployeeDetails(txtName.getText(), Integer.parseInt(txtEmployeeID.getText()), Integer.parseInt(txtAge.getText()), btnGrpGender.getSelection().getActionCommand(), txtDate.getText(), txtLevel.getText(), txtTeamInfo.getText(), txtPosition.getText(),selectedImageFile.getAbsolutePath());           
              contact.setContactDetails(txtPhone.getText(), txtEmail.getText());
              employee.setContact(contact);
            if(employeeList.addEmployee(employee)){
                clearFields();
                JOptionPane.showMessageDialog(null, employee.getName() +"'s profile has been created.");
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed
    File selectedImageFile=null;
    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        JFileChooser browseImage = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImage.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImage.showOpenDialog(null);
         
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            selectedImageFile = browseImage.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, "Are you Sure want to upload this File "+selectedImagePath);          
        }
    }//GEN-LAST:event_browseBtnActionPerformed
    private boolean validateFields(){
        boolean radioSelected;
        try{
            radioSelected= btnGrpGender.getSelection().isSelected();
        }
        catch(Exception e){
            radioSelected=false;
        }
        boolean  valid=true;
        if(txtName.getText().isEmpty()){
            errTxt.setVisible(true);
            valid=false;
        }
        if(txtEmployeeID.getText().isEmpty()){
            errTxt1.setVisible(true);
            valid=false;
        }
        if(txtAge.getText().isEmpty()){
            errTxt2.setVisible(true);
            valid=false;
        }
        if(txtLevel.getText().isEmpty()){
            errTxt5.setVisible(true);
            valid=false;
        }       
        if(txtTeamInfo.getText().isEmpty()){
            errTxt6.setVisible(true);
            valid=false;
        }
        if(txtDate.getText().isEmpty()){
            errTxt4.setVisible(true);
            valid=false;
        }
        if(txtPosition.getText().isEmpty()){
            errTxt7.setVisible(true);
            valid=false;
        }        
        if(txtEmail.getText().isEmpty()){
            errTxt9.setVisible(true);
            valid=false;
        }
        if(txtPhone.getText().isEmpty()){
            errTxt8.setVisible(true);
            valid=false;
        }
         if(!radioSelected){            
            errTxt3.setVisible(true);
            valid=false;
        }  
        if(txtEmployeeID.getText().length()<1 || !txtEmployeeID.getText().matches("\\d+")){
            JOptionPane.showMessageDialog(this,"Employee Should be in Numbers");
            valid=false;
        } 
        if(txtPhone.getText().length()!=10 || !txtPhone.getText().matches("\\d+")){
            JOptionPane.showMessageDialog(this,"Please Enter a Valid Phone Number");
            valid=false;
        }
        if(txtAge.getText().length()>4 || !txtAge.getText().matches("\\d+")){
            JOptionPane.showMessageDialog(this,"Age Should be in Numbers");
            valid=false;
        }
        if(selectedImageFile==null){
            errTxt10.setVisible(true);
            valid=false;
        }
        if(txtEmail.getText().length()<2 || !txtEmail.getText().matches("^(.+)@(\\S+)$")){
            JOptionPane.showMessageDialog(this,"Please Enter a Valid Email");
            valid=false;
        }
        if(txtDate.getText().length()<2 || txtDate.getText().matches("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")){
            JOptionPane.showMessageDialog(this,"Please Enter a Valid Date");
            valid=false;
        }
        return valid;
    }
    private void  clearErrorText(){
        errTxt.setVisible(false);
        errTxt1.setVisible(false);
        errTxt2.setVisible(false);
        errTxt3.setVisible(false);
        errTxt4.setVisible(false);
        errTxt5.setVisible(false);
        errTxt6.setVisible(false);
        errTxt7.setVisible(false);
        errTxt8.setVisible(false);
        errTxt9.setVisible(false);
        errTxt10.setVisible(false);
    }
     private void  clearFields(){
         txtName.setText("");
         txtEmployeeID.setText("");
         txtAge.setText("");
         txtName.setText("");
         txtName.setText("");
         txtPhone.setText("");
         txtEmail.setText("");
         txtDate.setText("");
         txtLevel.setText("");
         txtPosition.setText("");
         txtTeamInfo.setText("");
         selectedImageFile=null;
         btnGrpGender.clearSelection();
           
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton browseBtn;
    private javax.swing.ButtonGroup btnGrpGender;
    private javax.swing.JLabel errTxt;
    private javax.swing.JLabel errTxt1;
    private javax.swing.JLabel errTxt10;
    private javax.swing.JLabel errTxt2;
    private javax.swing.JLabel errTxt3;
    private javax.swing.JLabel errTxt4;
    private javax.swing.JLabel errTxt5;
    private javax.swing.JLabel errTxt6;
    private javax.swing.JLabel errTxt7;
    private javax.swing.JLabel errTxt8;
    private javax.swing.JLabel errTxt9;
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelCreate;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmpID;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelLevel;
    private javax.swing.JLabel labelMobile;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPhoto;
    private javax.swing.JLabel labelPosition;
    private javax.swing.JLabel labelStartDate;
    private javax.swing.JLabel labelTeamInfo;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

}
