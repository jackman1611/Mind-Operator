package Default;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame implements Runnable {

    int a = 0, b = 0, am = 0, bm = 0, c1, c2, c3, sec=0, n, x,x2,x3, cont, error,op;

    public Principal() {
        initComponents();
    }
    Thread hilo;

   
    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == hilo) {
            tiempo();
        }
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
        jButton2 = new javax.swing.JButton();
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
        jButton1 = new javax.swing.JButton();
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
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
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

        jButton2.setText("COMPROBAR");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

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

        jButton1.setText("COMPROBAR");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

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

        jButton3.setText("COMPROBAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Errores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 80, 80));

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aciertos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 80, 80));

        jTabbedPane2.addTab("SUMA", jPanel1);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 350));

        jMenu1.setText("Opciones");

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
        if (n == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona el tiempo primero en el menu OPCIONES");
        } else {
       
            generar();
            colocarSuma();
            suma();

            hilo = new Thread(this);
            hilo.start();

        }
    }//GEN-LAST:event_BEGINActionPerformed

    private void BEGIN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEGIN1ActionPerformed
        if (n == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona el tiempo primero en el menu OPCIONES");
        } else {
        
            generar();
            colocarResta();
            resta();

            hilo = new Thread(this);
            hilo.start();

        }
    }//GEN-LAST:event_BEGIN1ActionPerformed

    private void BEGIN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEGIN2ActionPerformed
        if (n == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona el tiempo primero en el menu OPCIONES");
        } else {
        
            generar();
            colocarMultiplicacion();
            multiplicacion();
            hilo = new Thread(this);
            hilo.start();

        }
    }//GEN-LAST:event_BEGIN2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showMessageDialog(null, "5 Segundos ACTIVOS");
        n = 5;
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JOptionPane.showMessageDialog(null, "10 Segundos ACTIVOS");
        n = 10;
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JOptionPane.showMessageDialog(null, "15 Segundos ACTIVOS");
        n = 15;
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void Resp1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Resp1KeyTyped
        char c = evt.getKeyChar();
        int a = evt.getKeyChar();
        if (Character.isLetter(c) || a > 32 && a <= 47 || a > 58 && a <= 64 || a > 91 && a <= 96 || a > 123 && a <= 136) {
            //if(Character.isLetter(c)){      
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Ingresa Solo NUMEROS");
        }
    }//GEN-LAST:event_Resp1KeyTyped

    private void Resp2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Resp2KeyTyped
        char c = evt.getKeyChar();
        int a = evt.getKeyChar();
        if (Character.isLetter(c) || a > 32 && a <= 47 || a > 58 && a <= 64 || a > 91 && a <= 96 || a > 123 && a <= 136) {
            //if(Character.isLetter(c)){      
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Ingresa Solo NUMEROS");
        }
    }//GEN-LAST:event_Resp2KeyTyped

    private void RespKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RespKeyTyped
        char c = evt.getKeyChar();
        int a = evt.getKeyChar();
        if (Character.isLetter(c) || a > 32 && a <= 47 || a > 58 && a <= 64 || a > 91 && a <= 96 || a > 123 && a <= 136) {
            //if(Character.isLetter(c)){      
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Ingresa Solo NUMEROS");
        }
    }//GEN-LAST:event_RespKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (Resp==null) {
            JOptionPane.showMessageDialog(null, "Escribe tu respuesta");
        }else{
        if (c1!=0) {
                    C.setText(String.valueOf(c1));
                    
                    x=Integer.parseInt(Resp.getText());
                    if (c1==x) {
                        cont++;
                        op++;
                        JOptionPane.showMessageDialog(null, "Correcto!");
                    }
                    if (c1!=x) {
                        error++;
                        op++;
                        JOptionPane.showMessageDialog(null, "Incorrecto!");
                    }
                  detener();
                }
        }  
    }//GEN-LAST:event_jButton3ActionPerformed

    public void generar() {

        a = (int) (Math.random() * 49) + 1;
        b = (int) (Math.random() * 49) + 1;

        am = (int) (Math.random() * 9) + 1;
        bm = (int) (Math.random() * 9) + 1;

    }

    public void colocarSuma() {
        
        A.setText(String.valueOf(a));
        B.setText(String.valueOf(b));
    }

    public void colocarMultiplicacion() {
         
        A2.setText(String.valueOf(am));
        B2.setText(String.valueOf(bm));
    }

    public void colocarResta() {
        
        A3.setText(String.valueOf(a));
        B3.setText(String.valueOf(b));
    }

    public void suma() {
        C.setText(null);
        c1=a + b;
    }

    public void multiplicacion() {
        C2.setText(null);
        c2 = am * bm;
    }

    public void resta() {
        C3.setText(null);
        c3 = a - b;
    }

    public void progreso() {
        System.out.println(sec);
        TIME.setText(String.valueOf(sec));
        TIME1.setText(String.valueOf(sec));
        TIME2.setText(String.valueOf(sec));

    }

    public void tiempo() {

        while (true) {

            sec++;
            progreso();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (sec == n) {
                System.out.println("Termino el tiempo");
            
                if(Resp == null||Resp1 == null||Resp2 == null){
                error++;
                break;
                }else{
                if (c1!=0) {
                    C.setText(String.valueOf(c1));
                    
                    x=Integer.parseInt(Resp.getText());
                    if (c1==x) {
                        cont++;
                        op++;
                        JOptionPane.showMessageDialog(null, "Correcto!");
                        break;
                    }
                    if (c1!=x) {
                        error++;
                        op++;
                        JOptionPane.showMessageDialog(null, "Incorrecto!");
                        break;
                    }
                    
                }
                if (c2!=0) {
                    C2.setText(String.valueOf(c2));
                    x2=Integer.parseInt(Resp2.getText());
                    if (c2==x2) {
                        cont++;
                        op++;
                        JOptionPane.showMessageDialog(null, "Correcto!");
                        break;
                    }
                    if (c2!=x2) {
                        error++;
                        op++;
                        JOptionPane.showMessageDialog(null, "Incorrecto!");
                        break;
                    }
                  
                }
                if (c3>0||0>c3) {
                    C3.setText(String.valueOf(c3));
                    x3=Integer.parseInt(Resp1.getText());
                    if (c3==x3) {
                        cont++;
                        op++;
                        JOptionPane.showMessageDialog(null, "Correcto!");
                        break;
                    }
                    if (c3!=x3) {
                        error++;
                        op++;
                        JOptionPane.showMessageDialog(null, "Incorrecto!");
                        break;
                    }
                    
                } 
                }
            }//if
        }//while
        sec = 0;
        c1=0;
        c2=0;
        c3=0;
        detener();
    }//tiempo();

    public void detener(){
    hilo.stop();
    }
   
    /**
     *
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String args[]) throws InterruptedException {
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
            @Override
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel resmul;
    private javax.swing.JLabel resres;
    private javax.swing.JLabel resum;
    // End of variables declaration//GEN-END:variables

}
