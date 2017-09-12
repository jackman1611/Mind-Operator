package Default;

public class Principal extends javax.swing.JFrame {

   
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        A = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        SIMB = new javax.swing.JLabel();
        SIMB1 = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        Resp = new javax.swing.JTextField();
        B1 = new javax.swing.JLabel();
        siguente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        comenzar = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        A.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 70));

        B.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 90, 70));

        SIMB.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        SIMB.setText("=");
        jPanel1.add(SIMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, 70));

        SIMB1.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        SIMB1.setText("+");
        jPanel1.add(SIMB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 70));

        C.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 110, 70));

        Resp.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        Resp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Resp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(Resp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 110, 70));

        B1.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B1.setText("RESPUESTA");
        B1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 260, 70));

        siguente.setText("SIGUIENTE");
        jPanel1.add(siguente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 90, -1));

        jButton2.setText("NUEVO");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 90, -1));

        comenzar.setText("COMENZAR");
        comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        time.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIEMPO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 130, 120));

        jTabbedPane2.addTab("SUMA", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("RESTA", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("DIVISION", jPanel3);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 360));

        jMenu1.setText("Opciones");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Salir");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarActionPerformed
        
    }//GEN-LAST:event_comenzarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel B;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel C;
    private javax.swing.JTextField Resp;
    private javax.swing.JLabel SIMB;
    private javax.swing.JLabel SIMB1;
    private javax.swing.JButton comenzar;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton siguente;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
