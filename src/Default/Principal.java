package Default;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal extends javax.swing.JFrame {
int a=0,b=0,c=0,sec=0;

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        SIMB = new javax.swing.JLabel();
        SIMB1 = new javax.swing.JLabel();
        Resp = new javax.swing.JTextField();
        B1 = new javax.swing.JLabel();
        NEW = new javax.swing.JButton();
        BEGIN = new javax.swing.JButton();
        C = new javax.swing.JTextField();
        A = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        TIME = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SIMB.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        SIMB.setText("=");
        jPanel1.add(SIMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, 70));

        SIMB1.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        SIMB1.setText("+");
        jPanel1.add(SIMB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 70));

        Resp.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        Resp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Resp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(Resp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 110, 70));

        B1.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B1.setText("RESPUESTA");
        B1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 260, 70));

        NEW.setText("NUEVO");
        NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEWActionPerformed(evt);
            }
        });
        jPanel1.add(NEW, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 90, -1));

        BEGIN.setText("COMENZAR");
        BEGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEGINActionPerformed(evt);
            }
        });
        jPanel1.add(BEGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        C.setEditable(false);
        C.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        C.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 90, 70));

        A.setEditable(false);
        A.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        A.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 70));

        B.setEditable(false);
        B.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        B.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 90, 70));

        TIME.setEditable(false);
        TIME.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        TIME.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TIME.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIEMPO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 3, 18))); // NOI18N
        jPanel1.add(TIME, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 130, 100));

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

        jTabbedPane2.addTab("MULTIPLICACION", jPanel3);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 360));

        jMenu1.setText("Opciones");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Salir");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BEGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEGINActionPerformed
    
    try {
        generar();
        suma();
        
        tiempo();
    } catch (InterruptedException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
    }
  
    }//GEN-LAST:event_BEGINActionPerformed

    private void NEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEWActionPerformed
    
    }//GEN-LAST:event_NEWActionPerformed

    public void generar() {
    sec=15;
    a = (int) (Math.random() * 99) + 1;
    b = (int) (Math.random() * 99) + 1;
    A.setText(String.valueOf(a));
    B.setText(String.valueOf(b));
    
    }
    public void suma() {
    c=a+b;
     }
    public void resta() {
    c=a-b;
     }
    public void multiplicacion() {
    c=a*b;
     }
    public void tiempo() throws InterruptedException{
              try{ 
            while (true) {            
            Thread.sleep(1000);
            TIME.setText(String.valueOf(sec));
            sec--;
            if (sec==0) {
            C.setText(String.valueOf(c));
            TIME.setText(String.valueOf(sec));
            break;
            }}
        } catch(InterruptedException e ) { 
            }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws InterruptedException {
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
    private javax.swing.JTextField A;
    private javax.swing.JTextField B;
    private javax.swing.JLabel B1;
    private javax.swing.JButton BEGIN;
    private javax.swing.JTextField C;
    private javax.swing.JButton NEW;
    private javax.swing.JTextField Resp;
    private javax.swing.JLabel SIMB;
    private javax.swing.JLabel SIMB1;
    private javax.swing.JTextField TIME;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables


}
