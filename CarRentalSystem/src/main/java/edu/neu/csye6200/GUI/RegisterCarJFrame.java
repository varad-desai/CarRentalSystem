/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.GUI;

import static edu.neu.csye6200.GUI.CreateAccountJFrame.DATE_FORMAT;
import edu.neu.csye6200.SystemModel.AbstractCarRentalSystemAPI;
import edu.neu.csye6200.SystemModel.AbstractPersonAPI;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.UUID;

/**
 *
 * @author manish
 */
public class RegisterCarJFrame extends javax.swing.JFrame {

    AbstractPersonAPI person = null;
    /**
     * Creates new form RegisterCarJFrame
     */
    public RegisterCarJFrame() {
        initComponents();
    }
    
    public RegisterCarJFrame(AbstractPersonAPI person) {
        this.person = person;
        initComponents();
    }
    
    final static String TIME_FORMAT = "HH:mm:ss";
    
    public boolean isTimeNotValid(String time) 
    {
            try {
                DateFormat df = new SimpleDateFormat(TIME_FORMAT);
                df.setLenient(false);
                df.parse(time);
                return false;
            } catch (ParseException e) {
                return true;
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

        licenseNumberLesseeJLabel = new javax.swing.JLabel();
        carInsuranceCompanyJTextField = new javax.swing.JTextField();
        carCompanyJTextField = new javax.swing.JTextField();
        DateOfBirthDriverJLabel = new javax.swing.JLabel();
        carNumberOfSeatsJTextField = new javax.swing.JTextField();
        phoneNoDriverJLabel = new javax.swing.JLabel();
        systemEmailidLoginJLabel3 = new javax.swing.JLabel();
        lesseeNameJLabel = new javax.swing.JLabel();
        InsuranceNoJTextField = new javax.swing.JTextField();
        carNameJTextField = new javax.swing.JTextField();
        homeSystemLoginJButton = new javax.swing.JButton();
        registerAndAddCarJButton = new javax.swing.JButton();
        backSystemLoginJButton = new javax.swing.JButton();
        carRegisterJLabel = new javax.swing.JLabel();
        validationJLabel = new javax.swing.JLabel();
        systemEmailidLoginJLabel4 = new javax.swing.JLabel();
        PricePerHourJTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        licenseNumberLesseeJLabel.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        licenseNumberLesseeJLabel.setText("Company");
        licenseNumberLesseeJLabel.setName("licenseNumberLesseeJLabel"); // NOI18N

        carInsuranceCompanyJTextField.setName("renterPasswordLoginJTextField"); // NOI18N

        carCompanyJTextField.setName("carCompanyJTextField"); // NOI18N

        DateOfBirthDriverJLabel.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        DateOfBirthDriverJLabel.setText("Number Of Seats");
        DateOfBirthDriverJLabel.setName("DateOfBirthDriverJLabel"); // NOI18N

        carNumberOfSeatsJTextField.setName("carNumberOfSeatsJTextField"); // NOI18N

        phoneNoDriverJLabel.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        phoneNoDriverJLabel.setText("Insurance Company");
        phoneNoDriverJLabel.setName("phoneNoDriverJLabel"); // NOI18N

        systemEmailidLoginJLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        systemEmailidLoginJLabel3.setText("Insurance Number");
        systemEmailidLoginJLabel3.setName("systemEmailidLoginJLabel"); // NOI18N

        lesseeNameJLabel.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lesseeNameJLabel.setText("Name");
        lesseeNameJLabel.setName("lesseeNameJLabel"); // NOI18N

        InsuranceNoJTextField.setName("systemEmailidLoginJTextField"); // NOI18N

        carNameJTextField.setName("carNameJTextField"); // NOI18N

        homeSystemLoginJButton.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        homeSystemLoginJButton.setText("Home");
        homeSystemLoginJButton.setMaximumSize(new java.awt.Dimension(150, 50));
        homeSystemLoginJButton.setMinimumSize(new java.awt.Dimension(150, 50));
        homeSystemLoginJButton.setName("homeSystemLoginJButton"); // NOI18N
        homeSystemLoginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeSystemLoginJButtonActionPerformed(evt);
            }
        });

        registerAndAddCarJButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        registerAndAddCarJButton.setText("Register");
        registerAndAddCarJButton.setName("registerAndAddCarJButton"); // NOI18N
        registerAndAddCarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerAndAddCarJButtonActionPerformed(evt);
            }
        });

        backSystemLoginJButton.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        backSystemLoginJButton.setText("Back");
        backSystemLoginJButton.setMaximumSize(new java.awt.Dimension(150, 50));
        backSystemLoginJButton.setMinimumSize(new java.awt.Dimension(150, 50));
        backSystemLoginJButton.setName("backSystemLoginJButton"); // NOI18N
        backSystemLoginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSystemLoginJButtonActionPerformed(evt);
            }
        });

        carRegisterJLabel.setFont(new java.awt.Font("Garamond", 3, 24)); // NOI18N
        carRegisterJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carRegisterJLabel.setText("Register Your Car");
        carRegisterJLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carRegisterJLabel.setName("loginLabel"); // NOI18N

        validationJLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        validationJLabel.setForeground(new java.awt.Color(255, 0, 0));
        validationJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        systemEmailidLoginJLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        systemEmailidLoginJLabel4.setText("Price Per Hour");
        systemEmailidLoginJLabel4.setName("systemEmailidLoginJLabel"); // NOI18N

        PricePerHourJTextField1.setName("systemEmailidLoginJTextField"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(backSystemLoginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lesseeNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(licenseNumberLesseeJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DateOfBirthDriverJLabel)
                                    .addComponent(phoneNoDriverJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(systemEmailidLoginJLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(systemEmailidLoginJLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(homeSystemLoginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(InsuranceNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(carInsuranceCompanyJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(carNumberOfSeatsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(carCompanyJTextField)
                                                .addComponent(carNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(PricePerHourJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(carRegisterJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(validationJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(registerAndAddCarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carRegisterJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(validationJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lesseeNameJLabel)
                    .addComponent(carNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licenseNumberLesseeJLabel)
                    .addComponent(carCompanyJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateOfBirthDriverJLabel)
                    .addComponent(carNumberOfSeatsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNoDriverJLabel)
                    .addComponent(carInsuranceCompanyJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(systemEmailidLoginJLabel3)
                    .addComponent(InsuranceNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(systemEmailidLoginJLabel4)
                    .addComponent(PricePerHourJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(registerAndAddCarJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(homeSystemLoginJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backSystemLoginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeSystemLoginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeSystemLoginJButtonActionPerformed
        // TODO add your handling code here:
        //        this.dispose();
        //         hjf = new HomeJFrame();
        //        hjf.setVisible(true);
    }//GEN-LAST:event_homeSystemLoginJButtonActionPerformed

    private void registerAndAddCarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerAndAddCarJButtonActionPerformed
        // TODO add your handling code here:
        if(carNameJTextField.getText().isEmpty()){
            validationJLabel.setText("Name field cannot be Empty!");
        }
        else if(carCompanyJTextField.getText().isEmpty()){
            validationJLabel.setText("Company cannot be Empty!");
        }
        else if(carNumberOfSeatsJTextField.getText().isEmpty()){
            validationJLabel.setText("Number of Seats cannot be Empty!");
        }
        else if(carInsuranceCompanyJTextField.getText().isEmpty()){
            validationJLabel.setText("Insurance Company cannot be Empty!");
        }
        else if(InsuranceNoJTextField.getText().isEmpty()){
            validationJLabel.setText("Insurance No. cannot be Empty!");
        }
        else if(PricePerHourJTextField1.getText().isEmpty()){
            validationJLabel.setText("Price per hour cannot be Empty!");
        }
        else if(!PricePerHourJTextField1.getText().matches("^\\d+$")){
            validationJLabel.setText("Price per hour should be a positive integer.");
        }
        else{
            StringBuilder sb = new StringBuilder();
    //        UUID carID = UUID.randomUUID();
    //        System.out.println(carID);
    //        sb.append(carID).append(",");
            sb.append(person.getPersonId()).append(",");
            sb.append(carNameJTextField.getText()).append(",");
            sb.append(carCompanyJTextField.getText()).append(",");
            sb.append(carNumberOfSeatsJTextField.getText()).append(",");
            sb.append(carInsuranceCompanyJTextField.getText()).append(",");
            sb.append(InsuranceNoJTextField.getText()).append(",");
            sb.append(PricePerHourJTextField1.getText());

            String carData = sb.toString();
            System.out.println(carData);
            AbstractCarRentalSystemAPI acra = AbstractCarRentalSystemAPI.getObject();

            acra.addCar(carData);
            this.dispose();
            RenterHomeJFrame rhjf = new RenterHomeJFrame(this.person);
            rhjf.setVisible(true);
            
            validationJLabel.setForeground(Color.blue);
            validationJLabel.setText("Car Registered Successfully!");
            }
    }//GEN-LAST:event_registerAndAddCarJButtonActionPerformed

    private void backSystemLoginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backSystemLoginJButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HomeJFrame hjf = new HomeJFrame();
        hjf.setVisible(true);
    }//GEN-LAST:event_backSystemLoginJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterCarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterCarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterCarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterCarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterCarJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateOfBirthDriverJLabel;
    private javax.swing.JTextField InsuranceNoJTextField;
    private javax.swing.JTextField PricePerHourJTextField1;
    private javax.swing.JButton backSystemLoginJButton;
    private javax.swing.JTextField carCompanyJTextField;
    private javax.swing.JTextField carInsuranceCompanyJTextField;
    private javax.swing.JTextField carNameJTextField;
    private javax.swing.JTextField carNumberOfSeatsJTextField;
    private javax.swing.JLabel carRegisterJLabel;
    private javax.swing.JButton homeSystemLoginJButton;
    private javax.swing.JLabel lesseeNameJLabel;
    private javax.swing.JLabel licenseNumberLesseeJLabel;
    private javax.swing.JLabel phoneNoDriverJLabel;
    private javax.swing.JButton registerAndAddCarJButton;
    private javax.swing.JLabel systemEmailidLoginJLabel3;
    private javax.swing.JLabel systemEmailidLoginJLabel4;
    private javax.swing.JLabel validationJLabel;
    // End of variables declaration//GEN-END:variables
}
