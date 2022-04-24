package presentacion;

import javax.swing.JFrame;


public class MenuMensa extends javax.swing.JFrame {

    public MenuMensa() {
        
        initComponents();
        this.setLocationRelativeTo(null);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BotonVerEnc = new javax.swing.JButton();
        ActuEstado = new javax.swing.JButton();
        BotonConsultarDet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Menu Mensajero");

        BotonVerEnc.setText("Ver encargos");
        BotonVerEnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerEncActionPerformed(evt);
            }
        });

        ActuEstado.setText("Actualizar estados");
        ActuEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActuEstadoActionPerformed(evt);
            }
        });

        BotonConsultarDet.setText("Consultar Detalles");
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
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(BotonVerEnc)
                        .addGap(46, 46, 46)
                        .addComponent(ActuEstado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(BotonConsultarDet)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonVerEnc)
                    .addComponent(ActuEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonConsultarDet)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVerEncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerEncActionPerformed
        
        JFrame frame = new VisualizarEncargos();
        frame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonVerEncActionPerformed

    private void ActuEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActuEstadoActionPerformed
        
        JFrame frame = new ModificarEstados();
        frame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ActuEstadoActionPerformed

    private void BotonConsultarDetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarDetActionPerformed
            
        JFrame frame = new ConsultarDetalles();
        frame.setVisible(true);
        this.setVisible(false);
    
    }//GEN-LAST:event_BotonConsultarDetActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActuEstado;
    private javax.swing.JButton BotonConsultarDet;
    private javax.swing.JButton BotonVerEnc;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
