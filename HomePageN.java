
package login_signup;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class HomePageN extends javax.swing.JFrame {

    public HomePageN() {
        initComponents();
        Icon i = logo.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(image));
        
        Icon j = emoji.getIcon();
        ImageIcon iconi = (ImageIcon)j;
        Image images = iconi.getImage().getScaledInstance(emoji.getWidth(), emoji.getHeight(), Image.SCALE_SMOOTH);
        emoji.setIcon(new ImageIcon(images));
        
        Icon n = socials.getIcon();
        ImageIcon icony = (ImageIcon)n;
        Image imagess = icony.getImage().getScaledInstance(socials.getWidth(), socials.getHeight(), Image.SCALE_SMOOTH);
        socials.setIcon(new ImageIcon(imagess));
        
        Icon m = qr.getIcon();
        ImageIcon iconii = (ImageIcon)m;
        Image imagese = iconii.getImage().getScaledInstance(qr.getWidth(), qr.getHeight(), Image.SCALE_SMOOTH);
        qr.setIcon(new ImageIcon(imagese));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        copytxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        socials = new javax.swing.JLabel();
        qr = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Home = new javax.swing.JButton();
        Services = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        Services1 = new javax.swing.JButton();
        emoji = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_signup/happy-vibes-high-resolution-logo-transparent (1).png"))); // NOI18N
        jPanel1.add(logo);
        logo.setBounds(0, 20, 120, 60);

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        copytxt.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        copytxt.setText("Copyright © 2024 Happy Vibes. All Rights Reserved. Developed by Blandine Iduhaytuze. Privary Terms and Conditions.");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("About us");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Our Services");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Success Stories");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Annual Reports");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Contact us");

        jLabel6.setText("Email: info@happyvibes.com");

        jLabel7.setText("Toll free: 4444");

        socials.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_signup/socilas-removebg-previews.png"))); // NOI18N

        qr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_signup/qr.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("To donate");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qr, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(socials, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(copytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(socials, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(qr, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(19, 19, 19)))
                .addComponent(copytxt)
                .addGap(98, 98, 98))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 300, 600, 180);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        Home.setBackground(new java.awt.Color(255, 204, 153));
        Home.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Home.setText("Home");

        Services.setBackground(new java.awt.Color(255, 204, 153));
        Services.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Services.setText("Services");

        Logout.setBackground(new java.awt.Color(255, 204, 153));
        Logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        Services1.setBackground(new java.awt.Color(255, 204, 153));
        Services1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Services1.setText("About");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Services1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Services, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Services, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Services1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(140, 0, 460, 70);

        emoji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_signup/happy-removebg-preview.png"))); // NOI18N
        jPanel1.add(emoji);
        emoji.setBounds(200, 100, 231, 170);

        jScrollPane2.setBorder(null);

        txt.setBackground(new java.awt.Color(255, 255, 204));
        txt.setBorder(null);
        txt.setText("Welcome to our happy corner!\n\nHere, amidst the hustle and bustle of everyday life, we invite you to pause and immerse yourself in the warmth of positivity.\n\n");
        jScrollPane2.setViewportView(txt);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 110, 180, 150);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setToolTipText("This is a place where smiles are celebrated, and laughter is the soundtrack to our journey. \n\nLet's spread happiness together!");

        jTextPane1.setBackground(new java.awt.Color(255, 255, 204));
        jTextPane1.setBorder(null);
        jTextPane1.setText("This is a place where smiles are celebrated, and laughter is the soundtrack to our journey. \n\nLet's spread happiness together!");
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(440, 110, 140, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        Login LoginFrame = new Login ();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_LogoutActionPerformed

  
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Services;
    private javax.swing.JButton Services1;
    private javax.swing.JLabel copytxt;
    private javax.swing.JLabel emoji;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel qr;
    private javax.swing.JLabel socials;
    private javax.swing.JTextPane txt;
    // End of variables declaration//GEN-END:variables
}
