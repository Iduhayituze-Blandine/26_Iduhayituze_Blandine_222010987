
package registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class Registration extends javax.swing.JFrame {


    public Registration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Fname = new javax.swing.JLabel();
        Fnametxt = new javax.swing.JTextField();
        Lname = new javax.swing.JLabel();
        Lnametxt = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        Gendertxt = new javax.swing.JComboBox<>();
        Email = new javax.swing.JLabel();
        Emailtxt = new javax.swing.JTextField();
        Age = new javax.swing.JLabel();
        Agetxt = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        Passwordtxt = new javax.swing.JPasswordField();
        Password2 = new javax.swing.JLabel();
        Password2txt = new javax.swing.JPasswordField();
        Signupbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 460));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));

        Title.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        Title.setText("Registration Form");

        Fname.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        Fname.setText("First name");

        Lname.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        Lname.setText("Last name");

        Gender.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        Gender.setText("Gender");

        Gendertxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male", "Undefined", " " }));

        Email.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        Email.setText("Email");

        Age.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        Age.setText("Age");

        Password.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        Password.setText("Password");

        Password2.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        Password2.setText("Comfirm password");

        Signupbtn.setBackground(new java.awt.Color(153, 153, 255));
        Signupbtn.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Signupbtn.setText("Sign Up");
        Signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Fnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Password2txt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Password2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fname)
                    .addComponent(Lname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender)
                    .addComponent(Age))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(Password2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password2txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupbtnActionPerformed
        // TODO add your handling code here:
               String Fname, Lname, Gender, Age, Email, Password, Password2, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/studentregistration";
        SUser = "root";
        SPass = "";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(Fnametxt.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "First Name is required", "Error", JOptionPane.ERROR_MESSAGE);

            } else if("".equals(Lnametxt.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Last Name is required", "Error", JOptionPane.ERROR_MESSAGE);

            } else if("".equals(Gendertxt.getSelectedItem())) {
                JOptionPane.showMessageDialog(new JFrame(), "Gender is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if("".equals(Agetxt.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Age is required", "Error", JOptionPane.ERROR_MESSAGE);

            } else if("".equals(Emailtxt.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", JOptionPane.ERROR_MESSAGE);

            } else if("".equals(Passwordtxt.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", JOptionPane.ERROR_MESSAGE);

            } else if("".equals(Password2txt.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Repeat  the password to confirm, please!", "Error", JOptionPane.ERROR_MESSAGE);

            } else{
                Fname = Fnametxt.getText();
                Lname = Lnametxt.getText();
                Gender = (String) Gendertxt.getSelectedItem();
                Age = Agetxt.getText();
                Email = Emailtxt.getText();
                Password = Passwordtxt.getText();
                Password2 = Password2txt.getText();
                if(!Password.equals(Password2)){
                JOptionPane.showMessageDialog(new JFrame(), "Passwords should match, please!", "Error", JOptionPane.ERROR_MESSAGE);
               } 
                System.out.println(Password);

                query = "INSERT INTO students (Fname, Lname, Gender, Age, Email, Password, Password2)" +
                        "VALUES('"+Fname+"', '"+Lname+"', '"+Gender+"', '"+Age+"', '"+Email+"', '"+Password+"', '"+Password2+"')";
                
                st.execute(query);
                Fnametxt.setText("");
                Lnametxt.setText("");
                Gendertxt.setSelectedItem(ABORT);
                Agetxt.setText("");
                Emailtxt.setText("");
                Passwordtxt.setText("");
                Password2txt.setText("");
                showMessageDialog(null, "New account has been created successfully!");
                
                
            }

        }catch(Exception e){
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_SignupbtnActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JTextField Agetxt;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField Emailtxt;
    private javax.swing.JLabel Fname;
    private javax.swing.JTextField Fnametxt;
    private javax.swing.JLabel Gender;
    private javax.swing.JComboBox<String> Gendertxt;
    private javax.swing.JLabel Lname;
    private javax.swing.JTextField Lnametxt;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Password2;
    private javax.swing.JPasswordField Password2txt;
    private javax.swing.JPasswordField Passwordtxt;
    private javax.swing.JButton Signupbtn;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
