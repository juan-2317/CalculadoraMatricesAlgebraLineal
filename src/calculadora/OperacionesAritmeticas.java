package calculadora;

public class OperacionesAritmeticas extends javax.swing.JFrame {

    public OperacionesAritmeticas() {
        initComponents();
        // Establecer el orden que tendrán los elementos cuando se cambie el foco
        //  presionando la tecla TAB
        setFocusTraversalPolicy(new ManejadorFoco(a11, a12, a13, a21, a22, a23, a31,
                a32, a33, b11, b12, b13, b21, b22, b23, b31, b32, b33, btnSuma,
                btnResta, btnMultiplicar, btnLimpiar, btnSalir));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b23 = new javax.swing.JTextField();
        b31 = new javax.swing.JTextField();
        c31 = new javax.swing.JTextField();
        a11 = new javax.swing.JTextField();
        b32 = new javax.swing.JTextField();
        c11 = new javax.swing.JTextField();
        c32 = new javax.swing.JTextField();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        b11 = new javax.swing.JTextField();
        btnMultiplicar = new javax.swing.JButton();
        c33 = new javax.swing.JTextField();
        b33 = new javax.swing.JTextField();
        b13 = new javax.swing.JTextField();
        b12 = new javax.swing.JTextField();
        c21 = new javax.swing.JTextField();
        b22 = new javax.swing.JTextField();
        c22 = new javax.swing.JTextField();
        b21 = new javax.swing.JTextField();
        a33 = new javax.swing.JTextField();
        c13 = new javax.swing.JTextField();
        c12 = new javax.swing.JTextField();
        a13 = new javax.swing.JTextField();
        a21 = new javax.swing.JTextField();
        a12 = new javax.swing.JTextField();
        c23 = new javax.swing.JTextField();
        a32 = new javax.swing.JTextField();
        a31 = new javax.swing.JTextField();
        a23 = new javax.swing.JTextField();
        a22 = new javax.swing.JTextField();
        lbTitulo = new javax.swing.JLabel();
        lbMatrizA = new javax.swing.JLabel();
        lbMatrizB = new javax.swing.JLabel();
        lbMatrizRes = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Operaciones Aritméticas Básicas");
        setResizable(false);

        c31.setEditable(false);

        c11.setEditable(false);

        c32.setEditable(false);

        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnMultiplicar.setText("*");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        c33.setEditable(false);

        c21.setEditable(false);

        c22.setEditable(false);

        c13.setEditable(false);

        c12.setEditable(false);

        c23.setEditable(false);

        lbTitulo.setText("OPERACIONES ARITMÉTICAS BÁSICAS CON MATRICES.");

        lbMatrizA.setText("Matriz A:");

        lbMatrizB.setText("Matriz B:");

        lbMatrizRes.setText("Resultado:");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(lbTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnMultiplicar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(btnSuma)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnResta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lbMatrizA)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lbMatrizB)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(76, 76, 76)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(240, 240, 240)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbMatrizRes)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatrizA)
                    .addComponent(lbMatrizB)
                    .addComponent(lbMatrizRes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResta)
                    .addComponent(btnSuma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMultiplicar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnLimpiar))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        a[0][0] = Integer.parseInt(a11.getText());
        a[0][1] = Integer.parseInt(a12.getText());
        a[0][2] = Integer.parseInt(a13.getText());
        a[1][0] = Integer.parseInt(a21.getText());
        a[1][1] = Integer.parseInt(a22.getText());
        a[1][2] = Integer.parseInt(a23.getText());
        a[2][0] = Integer.parseInt(a31.getText());
        a[2][1] = Integer.parseInt(a32.getText());
        a[2][2] = Integer.parseInt(a33.getText());

        b[0][0] = Integer.parseInt(b11.getText());
        b[0][1] = Integer.parseInt(b12.getText());
        b[0][2] = Integer.parseInt(b13.getText());
        b[1][0] = Integer.parseInt(b21.getText());
        b[1][1] = Integer.parseInt(b22.getText());
        b[1][2] = Integer.parseInt(b23.getText());
        b[2][0] = Integer.parseInt(b31.getText());
        b[2][1] = Integer.parseInt(b32.getText());
        b[2][2] = Integer.parseInt(b33.getText());

        sumar(a, b, c);

        c11.setText(Integer.toString(c[0][0]));
        c12.setText(Integer.toString(c[0][1]));
        c13.setText(Integer.toString(c[0][2]));
        c21.setText(Integer.toString(c[1][0]));
        c22.setText(Integer.toString(c[1][1]));
        c23.setText(Integer.toString(c[1][2]));
        c31.setText(Integer.toString(c[2][0]));
        c32.setText(Integer.toString(c[2][1]));
        c33.setText(Integer.toString(c[2][2]));
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        a[0][0] = Integer.parseInt(a11.getText());
        a[0][1] = Integer.parseInt(a12.getText());
        a[0][2] = Integer.parseInt(a13.getText());
        a[1][0] = Integer.parseInt(a21.getText());
        a[1][1] = Integer.parseInt(a22.getText());
        a[1][2] = Integer.parseInt(a23.getText());
        a[2][0] = Integer.parseInt(a31.getText());
        a[2][1] = Integer.parseInt(a32.getText());
        a[2][2] = Integer.parseInt(a33.getText());

        b[0][0] = Integer.parseInt(b11.getText());
        b[0][1] = Integer.parseInt(b12.getText());
        b[0][2] = Integer.parseInt(b13.getText());
        b[1][0] = Integer.parseInt(b21.getText());
        b[1][1] = Integer.parseInt(b22.getText());
        b[1][2] = Integer.parseInt(b23.getText());
        b[2][0] = Integer.parseInt(b31.getText());
        b[2][1] = Integer.parseInt(b32.getText());
        b[2][2] = Integer.parseInt(b33.getText());

        restar(a, b, c);

        c11.setText(Integer.toString(c[0][0]));
        c12.setText(Integer.toString(c[0][1]));
        c13.setText(Integer.toString(c[0][2]));
        c21.setText(Integer.toString(c[1][0]));
        c22.setText(Integer.toString(c[1][1]));
        c23.setText(Integer.toString(c[1][2]));
        c31.setText(Integer.toString(c[2][0]));
        c32.setText(Integer.toString(c[2][1]));
        c33.setText(Integer.toString(c[2][2]));

    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        a[0][0] = Integer.parseInt(a11.getText());
        a[0][1] = Integer.parseInt(a12.getText());
        a[0][2] = Integer.parseInt(a13.getText());
        a[1][0] = Integer.parseInt(a21.getText());
        a[1][1] = Integer.parseInt(a22.getText());
        a[1][2] = Integer.parseInt(a23.getText());
        a[2][0] = Integer.parseInt(a31.getText());
        a[2][1] = Integer.parseInt(a32.getText());
        a[2][2] = Integer.parseInt(a33.getText());

        b[0][0] = Integer.parseInt(b11.getText());
        b[0][1] = Integer.parseInt(b12.getText());
        b[0][2] = Integer.parseInt(b13.getText());
        b[1][0] = Integer.parseInt(b21.getText());
        b[1][1] = Integer.parseInt(b22.getText());
        b[1][2] = Integer.parseInt(b23.getText());
        b[2][0] = Integer.parseInt(b31.getText());
        b[2][1] = Integer.parseInt(b32.getText());
        b[2][2] = Integer.parseInt(b33.getText());

        multiplicar(a, b, c);

        c11.setText(Integer.toString(c[0][0]));
        c12.setText(Integer.toString(c[0][1]));
        c13.setText(Integer.toString(c[0][2]));
        c21.setText(Integer.toString(c[1][0]));
        c22.setText(Integer.toString(c[1][1]));
        c23.setText(Integer.toString(c[1][2]));
        c31.setText(Integer.toString(c[2][0]));
        c32.setText(Integer.toString(c[2][1]));
        c33.setText(Integer.toString(c[2][2]));
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        a11.setText("");
        a12.setText("");
        a13.setText("");
        a21.setText("");
        a22.setText("");
        a23.setText("");
        a31.setText("");
        a32.setText("");
        a33.setText("");

        b11.setText("");
        b12.setText("");
        b13.setText("");
        b21.setText("");
        b22.setText("");
        b23.setText("");
        b31.setText("");
        b32.setText("");
        b33.setText("");

        c11.setText("");
        c12.setText("");
        c13.setText("");
        c21.setText("");
        c22.setText("");
        c23.setText("");
        c31.setText("");
        c32.setText("");
        c33.setText("");

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void sumar(int[][] a, int[][] b, int[][] c) {

        // Suma de matrices
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

    }

    private void restar(int[][] a, int[][] b, int[][] c) {

        // Resta de matrices
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }

    }

    private void multiplicar(int[][] a, int[][] b, int[][] c) {

        // Multiplicación de matrices
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a11;
    private javax.swing.JTextField a12;
    private javax.swing.JTextField a13;
    private javax.swing.JTextField a21;
    private javax.swing.JTextField a22;
    private javax.swing.JTextField a23;
    private javax.swing.JTextField a31;
    private javax.swing.JTextField a32;
    private javax.swing.JTextField a33;
    private javax.swing.JTextField b11;
    private javax.swing.JTextField b12;
    private javax.swing.JTextField b13;
    private javax.swing.JTextField b21;
    private javax.swing.JTextField b22;
    private javax.swing.JTextField b23;
    private javax.swing.JTextField b31;
    private javax.swing.JTextField b32;
    private javax.swing.JTextField b33;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSuma;
    private javax.swing.JTextField c11;
    private javax.swing.JTextField c12;
    private javax.swing.JTextField c13;
    private javax.swing.JTextField c21;
    private javax.swing.JTextField c22;
    private javax.swing.JTextField c23;
    private javax.swing.JTextField c31;
    private javax.swing.JTextField c32;
    private javax.swing.JTextField c33;
    private javax.swing.JLabel lbMatrizA;
    private javax.swing.JLabel lbMatrizB;
    private javax.swing.JLabel lbMatrizRes;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
