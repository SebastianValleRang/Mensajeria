package presentacion;

import javax.swing.JFrame;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonRegistrarse = new javax.swing.JButton();
        BotonIngreso = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotonRegistrarMensa = new javax.swing.JButton();
        BotonIngresarMensa = new javax.swing.JButton();
        BotonConsultarDet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Bienvenido a Colombia Express");

        jLabel2.setText("Para poder acceder a nuestros servicios por favor registrese o en caso de que ya este registrado favor ingresar");

        BotonRegistrarse.setText("Registrarse");
        BotonRegistrarse.setActionCommand("BotonRegistrarse");
        BotonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarseActionPerformed(evt);
            }
        });

        BotonIngreso.setText("Ingresar");
        BotonIngreso.setActionCommand("BotonIngreso");
        BotonIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Mensajeros");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Clientes");

        BotonRegistrarMensa.setText("Registrarse");
        BotonRegistrarMensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarMensaActionPerformed(evt);
            }
        });

        BotonIngresarMensa.setText("Ingresar");
        BotonIngresarMensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarMensaActionPerformed(evt);
            }
        });

        BotonConsultarDet.setText("Consultar detalles");
        BotonConsultarDet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarDetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonRegistrarse)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4))
                    .addComponent(BotonIngreso))
                .addGap(173, 173, 173)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonIngresarMensa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(BotonRegistrarMensa))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(BotonConsultarDet)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegistrarse)
                    .addComponent(BotonRegistrarMensa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonIngreso)
                    .addComponent(BotonIngresarMensa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonConsultarDet)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        BotonRegistrarse.getAccessibleContext().setAccessibleName("BotonRegistrarse");
        BotonIngreso.getAccessibleContext().setAccessibleName("BotonIngreso");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarseActionPerformed
        
        JFrame frame = new Registro();
        frame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonRegistrarseActionPerformed

    private void BotonIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresoActionPerformed
        
        JFrame frame = new Ingreso();
        frame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonIngresoActionPerformed

    private void BotonRegistrarMensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarMensaActionPerformed
        
        JFrame frame = new RegistroMensa();
        frame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonRegistrarMensaActionPerformed

    private void BotonIngresarMensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarMensaActionPerformed
        
        JFrame frame = new IngresoMensa();
        frame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonIngresarMensaActionPerformed

    private void BotonConsultarDetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarDetActionPerformed
        
        JFrame frame = new ConsultarDetalles();
        frame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonConsultarDetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsultarDet;
    private javax.swing.JButton BotonIngresarMensa;
    private javax.swing.JButton BotonIngreso;
    private javax.swing.JButton BotonRegistrarMensa;
    private javax.swing.JButton BotonRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
