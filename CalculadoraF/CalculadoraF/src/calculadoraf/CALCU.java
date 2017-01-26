
package calculadoraf;

/**
 *
 * Autor: fhanyy
 * 
 */


public class CALCU extends javax.swing.JDialog {
    
    
    
/* definiciooon de variables */
    
    double variable1,variable2,total; /*  <--- NOTA: agregar mas variables */
    boolean sumar,resta,multiplicacion,division;
    
    
    
    public CALCU(java.awt.Frame parent, boolean modal) {
                     super(parent, modal);
                        
                     initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton1 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonSumar = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botonRestar = new javax.swing.JButton();
        botonMultiplicar = new javax.swing.JButton();
        botonDividir = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        pantalla = new javax.swing.JTextField();
        decimal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(28, 102, 154));
        setForeground(new java.awt.Color(204, 0, 0));

        boton1.setBackground(new java.awt.Color(255, 255, 255));
        boton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        boton1.setText("1");
        boton1.setPreferredSize(new java.awt.Dimension(43, 25));
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton3.setBackground(new java.awt.Color(255, 255, 255));
        boton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton4.setBackground(new java.awt.Color(255, 255, 255));
        boton4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton2.setBackground(new java.awt.Color(255, 255, 255));
        boton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        boton2.setLabel("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton8.setBackground(new java.awt.Color(255, 255, 255));
        boton8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton6.setBackground(new java.awt.Color(255, 255, 255));
        boton6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton7.setBackground(new java.awt.Color(255, 255, 255));
        boton7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton5.setBackground(new java.awt.Color(255, 255, 255));
        boton5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton0.setBackground(new java.awt.Color(255, 255, 255));
        boton0.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });

        botonSumar.setBackground(new java.awt.Color(202, 0, 0));
        botonSumar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonSumar.setText("+");
        botonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumarActionPerformed(evt);
            }
        });

        boton9.setBackground(new java.awt.Color(255, 255, 255));
        boton9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        botonRestar.setBackground(new java.awt.Color(255, 211, 0));
        botonRestar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonRestar.setText("-");
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });

        botonMultiplicar.setBackground(new java.awt.Color(0, 204, 51));
        botonMultiplicar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonMultiplicar.setText("*");
        botonMultiplicar.setPreferredSize(new java.awt.Dimension(39, 23));
        botonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicarActionPerformed(evt);
            }
        });

        botonDividir.setBackground(new java.awt.Color(56, 204, 255));
        botonDividir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonDividir.setText("/");
        botonDividir.setToolTipText("");
        botonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDividirActionPerformed(evt);
            }
        });

        botonBorrar.setBackground(new java.awt.Color(158, 12, 158));
        botonBorrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonBorrar.setText("C");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonIgual.setBackground(new java.awt.Color(255, 96, 201));
        botonIgual.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonIgual.setText("=");
        botonIgual.setToolTipText("");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });

        pantalla.setEditable(false);
        pantalla.setBackground(new java.awt.Color(255, 255, 255));
        pantalla.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        decimal.setBackground(new java.awt.Color(153, 153, 153));
        decimal.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        decimal.setText(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("[ C A L C U L A D O R A ]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botonSumar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton0, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(decimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        boton1.getAccessibleContext().setAccessibleName("btn1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /* accion de botones!!! >.< */
    
    
    
    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
pantalla.setText(pantalla.getText()+boton1.getText());        
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
pantalla.setText(pantalla.getText()+boton2.getText());         
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
pantalla.setText(pantalla.getText()+boton6.getText());          
    }//GEN-LAST:event_boton6ActionPerformed

    
    
 /* bopton para borrar! */   
    
    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
                pantalla.setText("");        
    }//GEN-LAST:event_botonBorrarActionPerformed

/* fin boton borrar :v */    
    
    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
pantalla.setText(pantalla.getText()+boton3.getText());          
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
pantalla.setText(pantalla.getText()+boton4.getText());           
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
    pantalla.setText(pantalla.getText()+boton5.getText());        
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
pantalla.setText(pantalla.getText()+boton7.getText());           
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
pantalla.setText(pantalla.getText()+boton8.getText());           
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
pantalla.setText(pantalla.getText()+boton9.getText());          
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
pantalla.setText(pantalla.getText()+boton0.getText());         
    }//GEN-LAST:event_boton0ActionPerformed

  private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
pantalla.setText(pantalla.getText()+decimal.getText());           
    }//GEN-LAST:event_decimalActionPerformed

    private void botonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumarActionPerformed

        
  variable1=(Double.parseDouble(String.valueOf(pantalla.getText())));
        pantalla.setText("");
            sumar=true;
    }//GEN-LAST:event_botonSumarActionPerformed

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed
    variable1=(Double.parseDouble(String.valueOf(pantalla.getText())));
    pantalla.setText("");
resta=true;       
    }//GEN-LAST:event_botonRestarActionPerformed

    private void botonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicarActionPerformed
variable1=(Double.parseDouble(String.valueOf(pantalla.getText())));
pantalla.setText("");
multiplicacion=true;        
    }//GEN-LAST:event_botonMultiplicarActionPerformed

    private void botonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDividirActionPerformed
variable1=(Double.parseDouble(String.valueOf(pantalla.getText())));
pantalla.setText("");
division=true;        
    }//GEN-LAST:event_botonDividirActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
variable2=(Double.parseDouble(String.valueOf(pantalla.getText())));



    /* depende de que operacion selccionas aquii */
    
    
         /* if = si */   if(sumar==true)
{
    total=variable1+variable2;
    pantalla.setText((String.valueOf(total)));
    variable1=0;
    variable2=0;
    sumar=false;
    
    
    /* corregir esta parte -.- solo puse para poder sumar 2 variables. Ejemplo: 2+2=4. Si pongo 3 numeros el 3ero no lo lee */
    
}
      if(resta==true)
{
    total=variable1-variable2;
    pantalla.setText((String.valueOf(total)));
    variable1=0;
    variable2=0;
    resta=false;
    
}
      if(multiplicacion==true)
{
    total=variable1*variable2;
    pantalla.setText((String.valueOf(total)));
    variable1=0;
    variable2=0;
    multiplicacion=false;
    
}
      if(division==true)
{
    total=variable1/variable2;
    pantalla.setText((String.valueOf(total)));
    variable1=0;
    variable2=0;
    division=false;
    
}
    
    }//GEN-LAST:event_botonIgualActionPerformed

  
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            CALCU dialog = new CALCU(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonDividir;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMultiplicar;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonSumar;
    private javax.swing.JButton decimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables
}
