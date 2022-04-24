package presentacion;

import javax.swing.JFrame;

public class MenuCliente extends javax.swing.JFrame {

    public MenuCliente() {
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BotonPedirServ = new javax.swing.JButton();
        BotonCalificar = new javax.swing.JButton();
        BotonConsultarDet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Menu cliente");

        BotonPedirServ.setText("Pedir servicio");
        BotonPedirServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPedirServActionPerformed(evt);
            }
        });

        BotonCalificar.setText("Calificar servicio");
        BotonCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalificarActionPerformed(evt);
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
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonPedirServ)
                                .addGap(27, 27, 27)
                                .addComponent(BotonCalificar))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(BotonConsultarDet)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonPedirServ)
                    .addComponent(BotonCalificar))
                .addGap(18, 18, 18)
                .addComponent(BotonConsultarDet)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPedirServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPedirServActionPerformed
        
        JFrame frame = new PedirServicio();
        frame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonPedirServActionPerformed

    private void BotonCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalificarActionPerformed
        
        JFrame frame = new CalificarMensajero();
        frame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonCalificarActionPerformed

    private void BotonConsultarDetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarDetActionPerformed
        
        JFrame frame = new ConsultarDetalles();
        frame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonConsultarDetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCalificar;
    private javax.swing.JButton BotonConsultarDet;
    private javax.swing.JButton BotonPedirServ;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
