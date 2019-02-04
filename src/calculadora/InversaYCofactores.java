package calculadora;

import javax.swing.JOptionPane;
import fraccionarios.Fraccion;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class InversaYCofactores extends javax.swing.JFrame {

    public InversaYCofactores() {
        initComponents();
        // Establecer el orden que tendrán los elementos cuando se cambie el foco
        //  presionando la tecla TAB
        setFocusTraversalPolicy(new ManejadorFoco(a11, a12, a13, a21, a22, a23, a31,
                a32, a33, btnMatrizInversa, btnMatrizCofactores, checkDecimales, txtDecimales,
                btnLimpiar, btnSalir));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a11 = new javax.swing.JTextField();
        a12 = new javax.swing.JTextField();
        a13 = new javax.swing.JTextField();
        a23 = new javax.swing.JTextField();
        a22 = new javax.swing.JTextField();
        a21 = new javax.swing.JTextField();
        a33 = new javax.swing.JTextField();
        a32 = new javax.swing.JTextField();
        a31 = new javax.swing.JTextField();
        b22 = new javax.swing.JTextField();
        b33 = new javax.swing.JTextField();
        b13 = new javax.swing.JTextField();
        b21 = new javax.swing.JTextField();
        b31 = new javax.swing.JTextField();
        b23 = new javax.swing.JTextField();
        b32 = new javax.swing.JTextField();
        b12 = new javax.swing.JTextField();
        b11 = new javax.swing.JTextField();
        btnMatrizInversa = new javax.swing.JButton();
        c22 = new javax.swing.JTextField();
        c33 = new javax.swing.JTextField();
        c13 = new javax.swing.JTextField();
        c21 = new javax.swing.JTextField();
        c31 = new javax.swing.JTextField();
        c23 = new javax.swing.JTextField();
        c32 = new javax.swing.JTextField();
        c12 = new javax.swing.JTextField();
        c11 = new javax.swing.JTextField();
        lbMatrizCof = new javax.swing.JLabel();
        lbMatrizInv = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        btnMatrizCofactores = new javax.swing.JButton();
        lbC11 = new javax.swing.JLabel();
        lbC12 = new javax.swing.JLabel();
        lbC13 = new javax.swing.JLabel();
        lbC21 = new javax.swing.JLabel();
        lbC22 = new javax.swing.JLabel();
        lbC23 = new javax.swing.JLabel();
        lbC31 = new javax.swing.JLabel();
        lbC32 = new javax.swing.JLabel();
        lbC33 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        lbMatrizA = new javax.swing.JLabel();
        checkDecimales = new javax.swing.JCheckBox();
        lbNumDec = new javax.swing.JLabel();
        txtDecimales = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Matriz Inversa y Matriz de Cofactores");
        setResizable(false);

        b22.setEditable(false);

        b33.setEditable(false);

        b13.setEditable(false);

        b21.setEditable(false);

        b31.setEditable(false);

        b23.setEditable(false);

        b32.setEditable(false);

        b12.setEditable(false);

        b11.setEditable(false);

        btnMatrizInversa.setText("Calcular Inversa");
        btnMatrizInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizInversaActionPerformed(evt);
            }
        });

        c22.setEditable(false);

        c33.setEditable(false);

        c13.setEditable(false);

        c21.setEditable(false);

        c31.setEditable(false);

        c23.setEditable(false);

        c32.setEditable(false);

        c12.setEditable(false);

        c11.setEditable(false);

        lbMatrizCof.setText("Matriz de Cofactores");

        lbMatrizInv.setText("Matriz Inversa");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lbTitulo.setText("MATRIZ INVERSA Y MATRIZ DE COFACTORES.");

        lbResultado.setText("RESULTADO:");

        btnMatrizCofactores.setText("Calcular Cofactores");
        btnMatrizCofactores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizCofactoresActionPerformed(evt);
            }
        });

        lbC11.setText("C1,1");

        lbC12.setText("C1,2");

        lbC13.setText("C1,3");

        lbC21.setText("C2,1");

        lbC22.setText("C2,2");

        lbC23.setText("C2,3");

        lbC31.setText("C3,1");

        lbC32.setText("C3,2");

        lbC33.setText("C3,3");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lbMatrizA.setText("Matriz A:");

        checkDecimales.setText("Mostrar números decimales");

        lbNumDec.setText("Número de decimales: ");

        txtDecimales.setText("2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(lbTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(lbMatrizA)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMatrizCofactores)
                                    .addComponent(btnMatrizInversa)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(separador, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(lbResultado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbNumDec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDecimales, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMatrizInv)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b32))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(b23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(b33, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b13))))
                        .addGap(158, 158, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMatrizCof)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbC11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbC12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbC13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbC21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbC22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbC23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbC31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbC32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbC33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(237, 237, 237))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkDecimales)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lbTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnMatrizCofactores))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMatrizInversa)
                            .addComponent(lbMatrizA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(lbResultado)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatrizInv)
                    .addComponent(lbMatrizCof))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbC11)
                    .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbC12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbC13)
                    .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbC21)
                                .addComponent(lbC22)
                                .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbC23)
                                .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbC31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbC32)
                                .addComponent(c32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbC33)
                                .addComponent(c33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addComponent(checkDecimales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSalir)
                    .addComponent(lbNumDec)
                    .addComponent(txtDecimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMatrizInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizInversaActionPerformed
        try {
            int[][] a = new int[3][3];
            int[][] cofactores = new int[3][3];
            int determinante;

            a[0][0] = Integer.parseInt(a11.getText());
            a[0][1] = Integer.parseInt(a12.getText());
            a[0][2] = Integer.parseInt(a13.getText());
            a[1][0] = Integer.parseInt(a21.getText());
            a[1][1] = Integer.parseInt(a22.getText());
            a[1][2] = Integer.parseInt(a23.getText());
            a[2][0] = Integer.parseInt(a31.getText());
            a[2][1] = Integer.parseInt(a32.getText());
            a[2][2] = Integer.parseInt(a33.getText());

            determinante = determinante(a);

            if (determinante == 0) {
                throw new ArithmeticException();
            }

            calcularCofactores(a, cofactores);

            if (!checkDecimales.isSelected()) {
                Fraccion f;
                if (cofactores[0][0] % determinante == 0) {
                    b11.setText(Integer.toString(cofactores[0][0] / determinante));
                } else {
                    f = new Fraccion(cofactores[0][0], determinante).simplificar();
                    b11.setText(f.toString());
                }

                if (cofactores[0][1] % determinante == 0) {
                    b21.setText(Integer.toString(cofactores[0][1] / determinante));
                } else {
                    f = new Fraccion(cofactores[0][1], determinante).simplificar();
                    b21.setText(f.toString());
                }

                if (cofactores[0][2] % determinante == 0) {
                    b31.setText(Integer.toString(cofactores[0][2] / determinante));
                } else {
                    f = new Fraccion(cofactores[0][2], determinante).simplificar();
                    b31.setText(f.toString());
                }

                if (cofactores[1][0] % determinante == 0) {
                    b12.setText(Integer.toString(cofactores[1][0] / determinante));
                } else {
                    f = new Fraccion(cofactores[1][0], determinante).simplificar();
                    b12.setText(f.toString());
                }

                if (cofactores[1][1] % determinante == 0) {
                    b22.setText(Integer.toString(cofactores[1][1] / determinante));
                } else {
                    f = new Fraccion(cofactores[1][1], determinante).simplificar();
                    b22.setText(f.toString());
                }

                if (cofactores[1][2] % determinante == 0) {
                    b32.setText(Integer.toString(cofactores[1][2] / determinante));
                } else {
                    f = new Fraccion(cofactores[1][2], determinante).simplificar();
                    b32.setText(f.toString());
                }

                if (cofactores[2][0] % determinante == 0) {
                    b13.setText(Integer.toString(cofactores[2][0] / determinante));
                } else {
                    f = new Fraccion(cofactores[2][0], determinante).simplificar();
                    b13.setText(f.toString());
                }

                if (cofactores[2][1] % determinante == 0) {
                    b23.setText(Integer.toString(cofactores[2][1] / determinante));
                } else {
                    f = new Fraccion(cofactores[2][1], determinante).simplificar();
                    b23.setText(f.toString());
                }

                if (cofactores[2][2] % determinante == 0) {
                    b33.setText(Integer.toString(cofactores[2][2] / determinante));
                } else {
                    f = new Fraccion(cofactores[2][2], determinante).simplificar();
                    b33.setText(f.toString());
                }
            } else {
                DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
                simbolos.setDecimalSeparator('.');

                String formato = "#.";
                int n = Integer.parseInt(txtDecimales.getText());
                for (int i = 0; i < n; i++) {
                    formato += "#";
                }

                DecimalFormat decimales = new DecimalFormat(formato, simbolos);

                b11.setText(decimales.format((double) cofactores[0][0] / determinante));
                b21.setText(decimales.format((double) cofactores[0][1] / determinante));
                b31.setText(decimales.format((double) cofactores[0][2] / determinante));
                b12.setText(decimales.format((double) cofactores[1][0] / determinante));
                b22.setText(decimales.format((double) cofactores[1][1] / determinante));
                b32.setText(decimales.format((double) cofactores[1][2] / determinante));
                b13.setText(decimales.format((double) cofactores[2][0] / determinante));
                b23.setText(decimales.format((double) cofactores[2][1] / determinante));
                b33.setText(decimales.format((double) cofactores[2][2] / determinante));
            }
        } catch (ArithmeticException a) {
            String men = "No se puede invertir la matriz porque su determinante es cero";
            JOptionPane.showMessageDialog(this, men, "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnMatrizInversaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMatrizCofactoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizCofactoresActionPerformed
        int[][] a = new int[3][3];
        int[][] cofactores = new int[3][3];

        a[0][0] = Integer.parseInt(a11.getText());
        a[0][1] = Integer.parseInt(a12.getText());
        a[0][2] = Integer.parseInt(a13.getText());
        a[1][0] = Integer.parseInt(a21.getText());
        a[1][1] = Integer.parseInt(a22.getText());
        a[1][2] = Integer.parseInt(a23.getText());
        a[2][0] = Integer.parseInt(a31.getText());
        a[2][1] = Integer.parseInt(a32.getText());
        a[2][2] = Integer.parseInt(a33.getText());

        calcularCofactores(a, cofactores);

        c11.setText(Integer.toString(cofactores[0][0]));
        c21.setText(Integer.toString(cofactores[0][1]));
        c31.setText(Integer.toString(cofactores[0][2]));
        c12.setText(Integer.toString(cofactores[1][0]));
        c22.setText(Integer.toString(cofactores[1][1]));
        c32.setText(Integer.toString(cofactores[1][2]));
        c13.setText(Integer.toString(cofactores[2][0]));
        c23.setText(Integer.toString(cofactores[2][1]));
        c33.setText(Integer.toString(cofactores[2][2]));
    }//GEN-LAST:event_btnMatrizCofactoresActionPerformed

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

        txtDecimales.setText("2");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private int determinante(int[][] m) {
        int determinante1, determinante2, determinante3;

        determinante1 = m[0][0] * m[1][1] * m[2][2] + m[0][1] * m[1][2] * m[2][0]
                + m[1][0] * m[2][1] * m[0][2];
        determinante2 = m[2][0] * m[1][1] * m[0][2] + m[1][0] * m[0][1] * m[2][2]
                + m[2][1] * m[1][2] * m[0][0];
        determinante3 = determinante1 - determinante2;

        return determinante3;
    }

    private void calcularCofactores(int[][] a, int[][] cofactores) {

        // Cofactor 1,1
        cofactores[0][0] = a[1][1] * a[2][2] - a[2][1] * a[1][2];
        // resul11 *= 1;

        // Cofactor 1,2
        cofactores[0][1] = a[1][0] * a[2][2] - a[2][0] * a[1][2];
        cofactores[0][1] *= -1;

        // Cofactor 1,3
        cofactores[0][2] = a[1][0] * a[2][1] - a[2][0] * a[1][1];
        // resul13 *= 1;

        // Cofactor 2,1
        cofactores[1][0] = a[0][1] * a[2][2] - a[2][1] * a[0][2];
        cofactores[1][0] *= -1;

        // Cofactor 2,2
        cofactores[1][1] = a[0][0] * a[2][2] - a[2][0] * a[0][2];
        // resul22 *= 1;

        // Cofactor 2,3
        cofactores[1][2] = a[0][0] * a[2][1] - a[2][0] * a[0][1];
        cofactores[1][2] *= -1;

        // Cofactor 3,1
        cofactores[2][0] = a[0][1] * a[1][2] - a[1][1] * a[0][2];
        // resul31 *= 1;

        // Cofactor 3,2
        cofactores[2][1] = a[0][0] * a[1][2] - a[1][0] * a[0][2];
        cofactores[2][1] *= -1;

        // Cofactor 3,3
        cofactores[2][2] = a[0][0] * a[1][1] - a[1][0] * a[0][1];
        // resul33 *= 1;
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
    private javax.swing.JButton btnMatrizCofactores;
    private javax.swing.JButton btnMatrizInversa;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField c11;
    private javax.swing.JTextField c12;
    private javax.swing.JTextField c13;
    private javax.swing.JTextField c21;
    private javax.swing.JTextField c22;
    private javax.swing.JTextField c23;
    private javax.swing.JTextField c31;
    private javax.swing.JTextField c32;
    private javax.swing.JTextField c33;
    private javax.swing.JCheckBox checkDecimales;
    private javax.swing.JLabel lbC11;
    private javax.swing.JLabel lbC12;
    private javax.swing.JLabel lbC13;
    private javax.swing.JLabel lbC21;
    private javax.swing.JLabel lbC22;
    private javax.swing.JLabel lbC23;
    private javax.swing.JLabel lbC31;
    private javax.swing.JLabel lbC32;
    private javax.swing.JLabel lbC33;
    private javax.swing.JLabel lbMatrizA;
    private javax.swing.JLabel lbMatrizCof;
    private javax.swing.JLabel lbMatrizInv;
    private javax.swing.JLabel lbNumDec;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField txtDecimales;
    // End of variables declaration//GEN-END:variables
}
