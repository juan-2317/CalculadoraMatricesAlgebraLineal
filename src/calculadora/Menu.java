package calculadora;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDeterminante = new javax.swing.JButton();
        btnInversa = new javax.swing.JButton();
        btnOperacionesMultiples = new javax.swing.JButton();
        btnEscalar = new javax.swing.JButton();
        btnTranspuesta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora de Matrices");
        setResizable(false);

        btnDeterminante.setText("Determinante");
        btnDeterminante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeterminanteActionPerformed(evt);
            }
        });

        btnInversa.setText("Inversa y Cofactores");
        btnInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInversaActionPerformed(evt);
            }
        });

        btnOperacionesMultiples.setText("Suma, Resta y Multiplicación");
        btnOperacionesMultiples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperacionesMultiplesActionPerformed(evt);
            }
        });

        btnEscalar.setText("Escalar");
        btnEscalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscalarActionPerformed(evt);
            }
        });

        btnTranspuesta.setText("Traspuesta");
        btnTranspuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranspuestaActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lbTitulo.setText("¿Qué Desea Realizar?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnOperacionesMultiples, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEscalar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTranspuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInversa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeterminante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(lbTitulo)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(63, 63, 63)
                .addComponent(btnDeterminante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInversa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOperacionesMultiples)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEscalar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTranspuesta)
                .addGap(17, 17, 17)
                .addComponent(btnSalir)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeterminanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeterminanteActionPerformed
        Determinante d = new Determinante();
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }//GEN-LAST:event_btnDeterminanteActionPerformed

    private void btnInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInversaActionPerformed
        InversaYCofactores ic = new InversaYCofactores();
        ic.setLocationRelativeTo(null);
        ic.setVisible(true);
    }//GEN-LAST:event_btnInversaActionPerformed

    private void btnOperacionesMultiplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperacionesMultiplesActionPerformed
        OperacionesAritmeticas oa = new OperacionesAritmeticas();
        oa.setLocationRelativeTo(null);
        oa.setVisible(true);
    }//GEN-LAST:event_btnOperacionesMultiplesActionPerformed

    private void btnEscalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscalarActionPerformed
        MultiplicarPorEscalar me = new MultiplicarPorEscalar();
        me.setLocationRelativeTo(null);
        me.setVisible(true);
    }//GEN-LAST:event_btnEscalarActionPerformed

    private void btnTranspuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranspuestaActionPerformed
        Transpuesta t = new Transpuesta();
        t.setLocationRelativeTo(null);
        t.setVisible(true);
    }//GEN-LAST:event_btnTranspuestaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeterminante;
    private javax.swing.JButton btnEscalar;
    private javax.swing.JButton btnInversa;
    private javax.swing.JButton btnOperacionesMultiples;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTranspuesta;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
