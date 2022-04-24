package presentacion;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import negocio.AdministracionServicios;
import util.RHException;

public class CalificarMensajero extends javax.swing.JFrame {

    private AdministracionServicios mens;
    int ingreso_id = 0;
    String Tipo_id = "";

    public CalificarMensajero() {
        
        Ingreso ingreso = new Ingreso();        
        ingreso_id = ingreso.id_cliente;
        Tipo_id = ingreso.Tipo_id;

        mens = new AdministracionServicios();
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TF_IDServ = new javax.swing.JTextField();
        TF_Valor = new javax.swing.JTextField();
        BotonCalificar = new javax.swing.JButton();
        TF_Descri = new javax.swing.JTextField();
        BotonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Calificar Mensajero");

        jLabel2.setText("Servicio ID");

        jLabel3.setText("Valor");

        jLabel4.setText("Descripcion");

        BotonCalificar.setText("Calificar");
        BotonCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalificarActionPerformed(evt);
            }
        });

        BotonRegresar.setText("<-");
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TF_IDServ)
                            .addComponent(TF_Valor)
                            .addComponent(TF_Descri, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(BotonCalificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonRegresar))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(TF_IDServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TF_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TF_Descri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BotonCalificar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonRegresar))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalificarActionPerformed

        try {
            
            String estado = mens.getEstado(Integer.parseInt(TF_IDServ.getText()));
            boolean rec = mens.getClieEnc(Integer.parseInt(TF_IDServ.getText()), ingreso_id, Tipo_id);
            
            //12312311 ingreso_id
            
            if (estado.equals("Ter") && rec) {
                
                mens.añadirCalificacion(Integer.parseInt(TF_IDServ.getText()), Integer.parseInt(TF_Valor.getText()), TF_Descri.getText());
                JOptionPane.showMessageDialog(null, "Registro Incluido Exitosamente", null, JOptionPane.INFORMATION_MESSAGE);
                
            } else {
                
                JOptionPane.showMessageDialog(null, "El servicio no ha sido terminado o no es el solicitante");

            }

        } catch (RHException f) {

            JOptionPane.showMessageDialog(null, f, "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_BotonCalificarActionPerformed

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        
        JFrame frame = new MenuCliente();
        frame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCalificar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JTextField TF_Descri;
    private javax.swing.JTextField TF_IDServ;
    private javax.swing.JTextField TF_Valor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
