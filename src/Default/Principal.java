package Default;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
int a=0,b=0,am=0,bm=0,c1=0,c2=0,c3=0,sec,n;
    public Principal() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        SIMB2 = new javax.swing.JLabel();
        SIMB3 = new javax.swing.JLabel();
        Resp1 = new javax.swing.JTextField();
        resres = new javax.swing.JLabel();
        BEGIN1 = new javax.swing.JButton();
        C3 = new javax.swing.JTextField();
        A3 = new javax.swing.JTextField();
        B3 = new javax.swing.JTextField();
        TIME1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        SIMB4 = new javax.swing.JLabel();
        SIMB5 = new javax.swing.JLabel();
        Resp2 = new javax.swing.JTextField();
        resmul = new javax.swing.JLabel();
        BEGIN2 = new javax.swing.JButton();
        C2 = new javax.swing.JTextField();
        A2 = new javax.swing.JTextField();
        B2 = new javax.swing.JTextField();
        TIME2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        SIMB = new javax.swing.JLabel();
        SIMB1 = new javax.swing.JLabel();
        Resp = new javax.swing.JTextField();
        resum = new javax.swing.JLabel();
        BEGIN = new javax.swing.JButton();
        C = new javax.swing.JTextField();
        A = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        TIME = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 390));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SIMB2.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        SIMB2.setText("=");
        jPanel2.add(SIMB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, 70));

        SIMB3.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        SIMB3.setText("-");
        jPanel2.add(SIMB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 70));

        Resp1.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        Resp1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Resp1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Resp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Resp1KeyTyped(evt);
            }
        });
        jPanel2.add(Resp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 110, 70));

        resres.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        resres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resres.setText("RESPUESTA");
        resres.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(resres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 260, 70));

        BEGIN1.setText("COMENZAR");
        BEGIN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEGIN1ActionPerformed(evt);
            }
        });
        jPanel2.add(BEGIN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        C3.setEditable(false);
        C3.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        C3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 90, 70));

        A3.setEditable(false);
        A3.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        A3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 70));

        B3.setEditable(false);
        B3.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        B3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 90, 70));

        TIME1.setEditable(false);
        TIME1.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        TIME1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TIME1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIEMPO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 3, 18))); // NOI18N
        jPanel2.add(TIME1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 130, 100));

        jTabbedPane2.addTab("RESTA", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SIMB4.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        SIMB4.setText("=");
        jPanel3.add(SIMB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, 70));

        SIMB5.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        SIMB5.setText("x");
        jPanel3.add(SIMB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 70));

        Resp2.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        Resp2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Resp2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Resp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Resp2KeyTyped(evt);
            }
        });
        jPanel3.add(Resp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 110, 70));

        resmul.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        resmul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resmul.setText("RESPUESTA");
        resmul.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(resmul, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 260, 70));

        BEGIN2.setText("COMENZAR");
        BEGIN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEGIN2ActionPerformed(evt);
            }
        });
        jPanel3.add(BEGIN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        C2.setEditable(false);
        C2.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        C2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 90, 70));

        A2.setEditable(false);
        A2.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        A2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 70));

        B2.setEditable(false);
        B2.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        B2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 90, 70));

        TIME2.setEditable(false);
        TIME2.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        TIME2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TIME2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIEMPO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 3, 18))); // NOI18N
        jPanel3.add(TIME2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 130, 100));

        jTabbedPane2.addTab("MULTIPLICACION", jPanel3);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SIMB.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        SIMB.setText("=");
        jPanel1.add(SIMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, 70));

        SIMB1.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        SIMB1.setText("+");
        jPanel1.add(SIMB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 70));

        Resp.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        Resp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Resp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Resp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RespKeyTyped(evt);
            }
        });
        jPanel1.add(Resp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 110, 70));

        resum.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        resum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resum.setText("RESPUESTA");
        resum.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(resum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 260, 70));

        BEGIN.setText("COMENZAR");
        BEGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEGINActionPerformed(evt);
            }
        });
        jPanel1.add(BEGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        C.setEditable(false);
        C.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        C.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 90, 70));

        A.setEditable(false);
        A.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        A.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 70));

        B.setEditable(false);
        B.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        B.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 90, 70));

        TIME.setEditable(false);
        TIME.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        TIME.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TIME.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIEMPO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 3, 18))); // NOI18N
        jPanel1.add(TIME, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 130, 100));

        jTabbedPane2.addTab("SUMA", jPanel1);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 350));

        jMenu1.setText("Opciones");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Nuevo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenu2.setText("Tiempo");

        jMenuItem3.setText("5 Segundos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("10 Segundos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("15 Segundos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenu1.add(jMenu2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BEGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEGINActionPerformed
     if (n==0) {
            JOptionPane.showMessageDialog(null, "Selecciona el tiempo primero en el menu OPCIONES");
        }
        else{
        generar();
        colocarSuma();
        suma();
    try {
        tiempo();
    } catch (InterruptedException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
    }
     
        } 
    }//GEN-LAST:event_BEGINActionPerformed

    private void BEGIN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEGIN1ActionPerformed
        if (n==0) {
            JOptionPane.showMessageDialog(null, "Selecciona el tiempo primero en el menu OPCIONES");
        }
        else{
        generar();
        colocarResta();
        resta();
    try {
        tiempo();
    } catch (InterruptedException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
    }
     
        }        
    }//GEN-LAST:event_BEGIN1ActionPerformed

    private void BEGIN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEGIN2ActionPerformed
     if (n==0) {
            JOptionPane.showMessageDialog(null, "Selecciona el tiempo primero en el menu OPCIONES");
        }
        else{
        generar();
        colocarMultiplicacion();
        multiplicacion();
    try {
        tiempo();
    } catch (InterruptedException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
    }
     
        } 
    }//GEN-LAST:event_BEGIN2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    A.setText(String.valueOf(null));
    B.setText(String.valueOf(null));
    A2.setText(String.valueOf(null));
    B2.setText(String.valueOf(null));
    A3.setText(String.valueOf(null));
    B3.setText(String.valueOf(null));
    C.setText(String.valueOf(null));
    C3.setText(String.valueOf(null));
    C2.setText(String.valueOf(null));
    
    TIME.setText(null);
    sec=0;
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       JOptionPane.showMessageDialog(null, "5 Segundos ACTIVOS");
        n=5;
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       JOptionPane.showMessageDialog(null, "10 Segundos ACTIVOS");
        n=10;
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       JOptionPane.showMessageDialog(null, "15 Segundos ACTIVOS");
        n=15;
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void Resp1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Resp1KeyTyped
       char c=evt.getKeyChar(); 
        int a = evt.getKeyChar();
          if(Character.isLetter(c)|| a>32 && a<=47|| a>58 && a<=64|| a>91 && a<=96|| a>123 && a<=136) { 
          //if(Character.isLetter(c)){      
              evt.consume();  
              getToolkit().beep();
              JOptionPane.showMessageDialog(null,"Ingresa Solo NUMEROS");       
          } 
    }//GEN-LAST:event_Resp1KeyTyped

    private void Resp2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Resp2KeyTyped
        char c=evt.getKeyChar(); 
        int a = evt.getKeyChar();
          if(Character.isLetter(c)|| a>32 && a<=47|| a>58 && a<=64|| a>91 && a<=96|| a>123 && a<=136) { 
          //if(Character.isLetter(c)){      
              evt.consume();  
              getToolkit().beep();
              JOptionPane.showMessageDialog(null,"Ingresa Solo NUMEROS");       
          } 
    }//GEN-LAST:event_Resp2KeyTyped

    private void RespKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RespKeyTyped
        char c=evt.getKeyChar(); 
        int a = evt.getKeyChar();
          if(Character.isLetter(c)|| a>32 && a<=47|| a>58 && a<=64|| a>91 && a<=96|| a>123 && a<=136) { 
          //if(Character.isLetter(c)){      
              evt.consume();  
              getToolkit().beep();
              JOptionPane.showMessageDialog(null,"Ingresa Solo NUMEROS");       
          } 
    }//GEN-LAST:event_RespKeyTyped

    public void generar() {
   
    a = (int) (Math.random() * 99) + 1;
    b = (int) (Math.random() * 99) + 1;
    
    am = (int) (Math.random() * 9) + 1;
    bm = (int) (Math.random() * 9) + 1;
     
    }
    public void colocarSuma(){
    A.setText(String.valueOf(a));
    B.setText(String.valueOf(b));
    }
    public void colocarMultiplicacion(){
    A2.setText(String.valueOf(am));
    B2.setText(String.valueOf(bm));
    }
    public void colocarResta(){
    A3.setText(String.valueOf(a));
    B3.setText(String.valueOf(b));
    }
    public void suma() {
    
    c1=a+b;
     }
    public void multiplicacion() {
    c2=am*bm;
     }
    public void resta() {
    c3=a-b;
     }
    
    public void progreso() throws InterruptedException{
       System.out.println(sec);
       TIME.setText(String.valueOf(sec));
       TIME1.setText(String.valueOf(sec)); 
       TIME2.setText(String.valueOf(sec)); 
       Thread.sleep(1000);
    }
     public void tiempo() throws InterruptedException {
      
        while(true) {
           
            sec++;  
            progreso();
            
            if (sec==n) {
            System.out.println("Termino el tiempo");
                if (c1>0||c1<0) {
                    C.setText(String.valueOf(c1));
                }
                if (c2>0||c2<0) {
                    C2.setText(String.valueOf(c2));
                }
                if (c3>0||c3<0) {
                    C3.setText(String.valueOf(c3));
                }
            
            break;
            
         }//if
         }//for
        sec=0;
     }//tiempo();
    
    /**
     * @param args the command line arguments
     */

    /**
     *
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
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
    private javax.swing.JTextField A2;
    private javax.swing.JTextField A3;
    private javax.swing.JTextField B;
    private javax.swing.JTextField B2;
    private javax.swing.JTextField B3;
    private javax.swing.JButton BEGIN;
    private javax.swing.JButton BEGIN1;
    private javax.swing.JButton BEGIN2;
    private javax.swing.JTextField C;
    private javax.swing.JTextField C2;
    private javax.swing.JTextField C3;
    private javax.swing.JTextField Resp;
    private javax.swing.JTextField Resp1;
    private javax.swing.JTextField Resp2;
    private javax.swing.JLabel SIMB;
    private javax.swing.JLabel SIMB1;
    private javax.swing.JLabel SIMB2;
    private javax.swing.JLabel SIMB3;
    private javax.swing.JLabel SIMB4;
    private javax.swing.JLabel SIMB5;
    private javax.swing.JTextField TIME;
    private javax.swing.JTextField TIME1;
    private javax.swing.JTextField TIME2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel resmul;
    private javax.swing.JLabel resres;
    private javax.swing.JLabel resum;
    // End of variables declaration//GEN-END:variables

}
