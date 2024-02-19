
package login_signup;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class HomePage extends javax.swing.JFrame {


    public HomePage() {
        initComponents();
        Icon i = logo.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(image));
        
        Icon j = emoji.getIcon();
        ImageIcon iconi = (ImageIcon)j;
        Image images = iconi.getImage().getScaledInstance(emoji.getWidth(), emoji.getHeight(), Image.SCALE_SMOOTH);
        emoji.setIcon(new ImageIcon(images));
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePage = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        welcometxt = new javax.swing.JLabel();
        emoji = new javax.swing.JLabel();
        copytxt = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HomePage.setBackground(new java.awt.Color(255, 255, 204));
        HomePage.setPreferredSize(new java.awt.Dimension(600, 500));
        HomePage.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_signup/happy-vibes-high-resolution-logo-transparent (1).png"))); // NOI18N
        HomePage.add(logo);
        logo.setBounds(20, 10, 120, 60);

        welcometxt.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        welcometxt.setText("Welcome to Happy Vibes");
        HomePage.add(welcometxt);
        welcometxt.setBounds(120, 40, 376, 107);

        emoji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_signup/happy-removebg-preview.png"))); // NOI18N
        HomePage.add(emoji);
        emoji.setBounds(178, 209, 231, 170);

        copytxt.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        copytxt.setText("Copyright © 2024 Happy Vibes. All Rights Reserved. Developed by Blandine Iduhaytuze. Privary Terms and Conditions.");
        HomePage.add(copytxt);
        copytxt.setBounds(50, 440, 430, 16);

        next.setBackground(new java.awt.Color(255, 204, 153));
        next.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        HomePage.add(next);
        next.setBounds(460, 373, 80, 40);

        user.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        user.setText("Blandine");
        HomePage.add(user);
        user.setBounds(240, 130, 210, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HomePage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        HomePageN HomePageNFrame = new HomePageN ();
        HomePageNFrame.setVisible(true);
        HomePageNFrame.pack();
        HomePageNFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_nextActionPerformed
    
    public void setUser(String name){
        user.setText(name);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePage;
    private javax.swing.JLabel copytxt;
    private javax.swing.JLabel emoji;
    private javax.swing.JLabel logo;
    private javax.swing.JButton next;
    private javax.swing.JLabel user;
    private javax.swing.JLabel welcometxt;
    // End of variables declaration//GEN-END:variables
}
