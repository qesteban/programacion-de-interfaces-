
    package calculadora2;


    public class calculadora extends javax.swing.JFrame {

        String memoria1;
        String signo;
        String memoria2;




        public calculadora() {
            initComponents();
        }


        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

            txtpantalla = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();
            jButton3 = new javax.swing.JButton();
            jButton4 = new javax.swing.JButton();
            jButton5 = new javax.swing.JButton();
            jButton6 = new javax.swing.JButton();
            jButton7 = new javax.swing.JButton();
            jButton8 = new javax.swing.JButton();
            jButton9 = new javax.swing.JButton();
            jButton10 = new javax.swing.JButton();
            jButton11 = new javax.swing.JButton();
            jButton12 = new javax.swing.JButton();
            jButton13 = new javax.swing.JButton();
            jButton14 = new javax.swing.JButton();
            jButton15 = new javax.swing.JButton();
            jButton16 = new javax.swing.JButton();
            jButton17 = new javax.swing.JButton();
            jButton18 = new javax.swing.JButton();
            jButton19 = new javax.swing.JButton();
            jButton20 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jButton1.setBackground(new java.awt.Color(0, 102, 102));
            jButton1.setForeground(new java.awt.Color(255, 255, 255));
            jButton1.setText("1");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setBackground(new java.awt.Color(0, 102, 102));
            jButton2.setForeground(new java.awt.Color(255, 255, 255));
            jButton2.setText("4");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            jButton3.setBackground(new java.awt.Color(0, 102, 102));
            jButton3.setForeground(new java.awt.Color(255, 255, 255));
            jButton3.setText("7");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });

            jButton4.setBackground(new java.awt.Color(0, 102, 102));
            jButton4.setForeground(new java.awt.Color(255, 255, 255));
            jButton4.setText("0");
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton4ActionPerformed(evt);
                }
            });

            jButton5.setBackground(new java.awt.Color(0, 102, 102));
            jButton5.setForeground(new java.awt.Color(255, 255, 255));
            jButton5.setText("2");
            jButton5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton5ActionPerformed(evt);
                }
            });

            jButton6.setBackground(new java.awt.Color(0, 102, 102));
            jButton6.setForeground(new java.awt.Color(255, 255, 255));
            jButton6.setText("+/-");
            jButton6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton6ActionPerformed(evt);
                }
            });

            jButton7.setBackground(new java.awt.Color(0, 102, 102));
            jButton7.setForeground(new java.awt.Color(255, 255, 255));
            jButton7.setText("8");
            jButton7.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton7ActionPerformed(evt);
                }
            });

            jButton8.setBackground(new java.awt.Color(0, 102, 102));
            jButton8.setForeground(new java.awt.Color(255, 255, 255));
            jButton8.setText("5");
            jButton8.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton8ActionPerformed(evt);
                }
            });

            jButton9.setBackground(new java.awt.Color(0, 102, 102));
            jButton9.setForeground(new java.awt.Color(255, 255, 255));
            jButton9.setText("3");
            jButton9.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton9ActionPerformed(evt);
                }
            });

            jButton10.setBackground(new java.awt.Color(0, 102, 102));
            jButton10.setForeground(new java.awt.Color(255, 255, 255));
            jButton10.setText(".");
            jButton10.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton10ActionPerformed(evt);
                }
            });

            jButton11.setBackground(new java.awt.Color(0, 102, 102));
            jButton11.setForeground(new java.awt.Color(255, 255, 255));
            jButton11.setText("9");
            jButton11.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton11ActionPerformed(evt);
                }
            });

            jButton12.setBackground(new java.awt.Color(0, 102, 102));
            jButton12.setForeground(new java.awt.Color(255, 255, 255));
            jButton12.setText("6");
            jButton12.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton12ActionPerformed(evt);
                }
            });

            jButton13.setBackground(new java.awt.Color(0, 102, 102));
            jButton13.setForeground(new java.awt.Color(255, 255, 255));
            jButton13.setText("-");
            jButton13.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton13ActionPerformed(evt);
                }
            });

            jButton14.setBackground(new java.awt.Color(0, 102, 102));
            jButton14.setForeground(new java.awt.Color(255, 255, 255));
            jButton14.setText("/");
            jButton14.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton14ActionPerformed(evt);
                }
            });

            jButton15.setBackground(new java.awt.Color(0, 102, 102));
            jButton15.setForeground(new java.awt.Color(255, 255, 255));
            jButton15.setText("*");
            jButton15.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton15ActionPerformed(evt);
                }
            });

            jButton16.setBackground(new java.awt.Color(0, 102, 102));
            jButton16.setForeground(new java.awt.Color(255, 255, 255));
            jButton16.setText("+");
            jButton16.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton16ActionPerformed(evt);
                }
            });

            jButton17.setBackground(new java.awt.Color(0, 102, 102));
            jButton17.setForeground(new java.awt.Color(255, 255, 255));
            jButton17.setText("C");
            jButton17.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton17ActionPerformed(evt);
                }
            });

            jButton18.setBackground(new java.awt.Color(0, 102, 102));
            jButton18.setForeground(new java.awt.Color(255, 255, 255));
            jButton18.setText("=");
            jButton18.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton18ActionPerformed(evt);
                }
            });

            jButton19.setBackground(new java.awt.Color(0, 102, 102));
            jButton19.setForeground(new java.awt.Color(255, 255, 255));
            jButton19.setText("1/x");
            jButton19.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton19ActionPerformed(evt);
                }
            });

            jButton20.setBackground(new java.awt.Color(0, 102, 102));
            jButton20.setForeground(new java.awt.Color(255, 255, 255));
            jButton20.setText("CE");
            jButton20.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton20ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(34, 34, 34)
                                                    .addComponent(txtpantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(21, 21, 21)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addContainerGap(24, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(txtpantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(25, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
            txtpantalla.setText(txtpantalla.getText()+"5");
        }

        private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
            txtpantalla.setText(txtpantalla.getText()+"8");
        }

        private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
            if (!txtpantalla.getText().equals("")) {
                memoria1=txtpantalla.getText();
                signo="-";
                txtpantalla.setText("");
            }


        }

        private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
            String resultado;
            memoria2=txtpantalla.getText();

            if (!memoria2.equals("")) {
                resultado=calculadora(memoria1,memoria2,signo);
                txtpantalla.setText(resultado);
            }


        }
        public static String calculadora(String memoria1,String memoria2,String signo){
            Double resultado=0.0;
            String respuesta;


            if (signo.equals("-")) {
                resultado=Double.parseDouble(memoria1)-Double.parseDouble(memoria2);

            }
            if (signo.equals("+")) {
                resultado=Double.parseDouble(memoria1)+Double.parseDouble(memoria2);

            }
            if (signo.equals("*")) {
                resultado=Double.parseDouble(memoria1)*Double.parseDouble(memoria2);

            }
            if (signo.equals("/")) {
                resultado=Double.parseDouble(memoria1)/Double.parseDouble(memoria2);

            }

            respuesta=resultado.toString();
            return respuesta;
        }




        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
            txtpantalla.setText(txtpantalla.getText()+"1");
        }

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
            txtpantalla.setText(txtpantalla.getText()+"2");
        }
        private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
            txtpantalla.setText(txtpantalla.getText()+"3");
        }
        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
            txtpantalla.setText(txtpantalla.getText()+"4");
        }

        private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
            txtpantalla.setText(txtpantalla.getText()+"6");
        }
        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
            txtpantalla.setText(txtpantalla.getText()+"7");
        }
        private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
            txtpantalla.setText(txtpantalla.getText()+"9");
        }

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
            txtpantalla.setText(txtpantalla.getText()+"0");
        }

        private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {

            String cadena;
            cadena=txtpantalla.getText();

            if (cadena.length()<=0) {
                txtpantalla.setText("0.");

            }
            else{
                if (!existepunto(txtpantalla.getText())) {
                    txtpantalla.setText(txtpantalla.getText()+".");

                }
            }

        }

        private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {

            String cadena;
            cadena=txtpantalla.getText();

            if (cadena.length()>0) {
                cadena=cadena.substring(0, cadena.length()-1);
                txtpantalla.setText(cadena);
            }
        }
        private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {
            txtpantalla.setText("");
        }

        private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {

            String cadena;
            Double num;
            cadena=txtpantalla.getText();
            if (cadena.length()>0) {
                num=1/(Double.parseDouble(cadena));
                txtpantalla.setText(num.toString());


            }
        }

        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {

            Double num;
            String cadena;
            cadena=txtpantalla.getText();
            if (cadena.length()>0) {
                num=(-1)*Double.parseDouble(cadena);
                txtpantalla.setText(num.toString());
            }
        }

        private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {

            if (!txtpantalla.getText().equals("")) {
                memoria1=txtpantalla.getText();
                signo="+";
                txtpantalla.setText("");
            }
        }

        private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
           
            if (!txtpantalla.getText().equals("")) {
                memoria1=txtpantalla.getText();
                signo="*";
                txtpantalla.setText("");
            }
        }

        private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {

            if (!txtpantalla.getText().equals("")) {
                memoria1=txtpantalla.getText();
                signo="/";
                txtpantalla.setText("");
            }
        }

        public static boolean existepunto(String cadena){
            boolean resultado;
            resultado=false;

            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.substring(i, i+1).equals(".")) {
                    resultado=true;
                    break;




                }

            }
            return resultado;


        }


        public static void main(String args[]) {

            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }



            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new calculadora().setVisible(true);
                }
            });
        }

        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton10;
        private javax.swing.JButton jButton11;
        private javax.swing.JButton jButton12;
        private javax.swing.JButton jButton13;
        private javax.swing.JButton jButton14;
        private javax.swing.JButton jButton15;
        private javax.swing.JButton jButton16;
        private javax.swing.JButton jButton17;
        private javax.swing.JButton jButton18;
        private javax.swing.JButton jButton19;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton20;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JButton jButton6;
        private javax.swing.JButton jButton7;
        private javax.swing.JButton jButton8;
        private javax.swing.JButton jButton9;
        private javax.swing.JTextField txtpantalla;

    }


