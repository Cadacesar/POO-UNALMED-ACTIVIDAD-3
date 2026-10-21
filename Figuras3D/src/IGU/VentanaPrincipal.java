package IGU;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCilindro = new javax.swing.JButton();
        btnEsfera = new javax.swing.JButton();
        btnPiramide = new javax.swing.JButton();
        btnCubo = new javax.swing.JButton();
        btnPrisma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Calculadora de área y volumen de figuras 3D");

        jLabel2.setText("Elige que figura geométrica deseas calcular:");

        btnCilindro.setText("Cilindro");
        btnCilindro.addActionListener(this::btnCilindroActionPerformed);

        btnEsfera.setText("Esfera");
        btnEsfera.addActionListener(this::btnEsferaActionPerformed);

        btnPiramide.setText("Piramide (base cuadrada)");
        btnPiramide.addActionListener(this::btnPiramideActionPerformed);

        btnCubo.setText("Cubo");
        btnCubo.addActionListener(this::btnCuboActionPerformed);

        btnPrisma.setText("Prisma (base cuadrada)");
        btnPrisma.addActionListener(this::btnPrismaActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 147, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCilindro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEsfera, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCubo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(209, 209, 209))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPiramide)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnPrisma)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCilindro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEsfera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCubo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPiramide)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrisma)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrismaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrismaActionPerformed
        VentPrisma ventPrism = new VentPrisma();
        ventPrism.setVisible(true);
        ventPrism.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPrismaActionPerformed

    private void btnCuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuboActionPerformed
        VentCubo ventCubo = new VentCubo();
        ventCubo.setVisible(true);
        ventCubo.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCuboActionPerformed

    private void btnPiramideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiramideActionPerformed
        VentPiramide ventPir = new VentPiramide();
        ventPir.setVisible(true);
        ventPir.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPiramideActionPerformed

    private void btnEsferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsferaActionPerformed
        VentanaEsfera ventEsf = new VentanaEsfera();
        ventEsf.setVisible(true);
        ventEsf.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnEsferaActionPerformed

    private void btnCilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCilindroActionPerformed
        VentCilindro ventCil = new VentCilindro();
        ventCil.setVisible(true);
        ventCil.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCilindroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCilindro;
    private javax.swing.JButton btnCubo;
    private javax.swing.JButton btnEsfera;
    private javax.swing.JButton btnPiramide;
    private javax.swing.JButton btnPrisma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
