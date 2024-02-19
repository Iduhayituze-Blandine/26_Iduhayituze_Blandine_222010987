
package login_signup;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        Icon i = logo.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(image));
     
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        LoginH = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Usernametxt = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        Passwordtxt = new javax.swing.JPasswordField();
        Signupbtn = new javax.swing.JButton();
        noacctxt = new javax.swing.JLabel();
        Loginbtn = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        copytxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setIconImages(null);

        LoginPanel.setBackground(new java.awt.Color(153, 255, 153));
        LoginPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 153), new java.awt.Color(255, 255, 204)));
        LoginPanel.setPreferredSize(new java.awt.Dimension(600, 500));
        LoginPanel.setLayout(null);

        LoginH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LoginH.setText("LOGIN");
        LoginPanel.add(LoginH);
        LoginH.setBounds(250, 40, 110, 60);

        Email.setText("Username");
        LoginPanel.add(Email);
        Email.setBounds(100, 110, 80, 16);
        LoginPanel.add(Usernametxt);
        Usernametxt.setBounds(100, 140, 320, 50);

        Password.setText("Password");
        LoginPanel.add(Password);
        Password.setBounds(100, 210, 70, 16);
        LoginPanel.add(Passwordtxt);
        Passwordtxt.setBounds(100, 240, 330, 50);

        Signupbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Signupbtn.setForeground(new java.awt.Color(255, 204, 153));
        Signupbtn.setText("Sign Up");
        Signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupbtnActionPerformed(evt);
            }
        });
        LoginPanel.add(Signupbtn);
        Signupbtn.setBounds(270, 390, 90, 40);

        noacctxt.setText("I don't have an account");
        LoginPanel.add(noacctxt);
        noacctxt.setBounds(110, 400, 140, 16);

        Loginbtn.setBackground(new java.awt.Color(255, 204, 153));
        Loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Loginbtn.setText("Login");
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });
        LoginPanel.add(Loginbtn);
        Loginbtn.setBounds(100, 320, 100, 50);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_signup/happy-vibes-high-resolution-logo-transparent (1).png"))); // NOI18N
        LoginPanel.add(logo);
        logo.setBounds(20, 10, 120, 60);

        copytxt.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        copytxt.setText("Copyright © 2024 Happy Vibes. All Rights Reserved. Developed by Blandine Iduhaytuze. Privary Terms and Conditions.");
        LoginPanel.add(copytxt);
        copytxt.setBounds(80, 440, 430, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupbtnActionPerformed
        SignUp SignUpFrame = new SignUp ();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
       
        
    }//GEN-LAST:event_SignupbtnActionPerformed

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed
        
        String Username, Password, query,Fname = null, passDb = null;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/happyusers_db";
        SUser = "root";
        SPass = "";
        int notFound = 0;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(Usernametxt.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", JOptionPane.ERROR_MESSAGE);
            
            } else if("".equals(Passwordtxt.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
            
            } else{
                Username = Usernametxt.getText();
                Password = Passwordtxt.getText();
                
                query = "SELECT * FROM users WHERE Username = '"+Username + "'";
                ResultSet rs = st.executeQuery(query);
                while(rs.next()){
                    passDb = rs.getString("Password");
                    Fname = rs.getString("Fname");
                    notFound = 1;
                }
                
                if (notFound == 1 && Password.equals(passDb)){
                
                    HomePage HomePageFrame = new HomePage ();
                    HomePageFrame.setUser(Fname);
                    HomePageFrame.setVisible(true);
                    HomePageFrame.pack();
                    HomePageFrame.setLocationRelativeTo(null);
                    this.dispose();
                    
                } else{
                    JOptionPane.showMessageDialog(new JFrame(), "Incorrect email or password", "Error", JOptionPane.ERROR_MESSAGE);
                    
                }
                Passwordtxt.setText("");
            
            }
            
        }catch(Exception e){
            System.out.println("Error!" + e.getMessage());
        }
        
    }//GEN-LAST:event_LoginbtnActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JLabel LoginH;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton Loginbtn;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField Passwordtxt;
    private javax.swing.JButton Signupbtn;
    private javax.swing.JTextField Usernametxt;
    private javax.swing.JLabel copytxt;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel noacctxt;
    // End of variables declaration//GEN-END:variables
}
