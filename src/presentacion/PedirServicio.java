package presentacion;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import negocio.AdministracionServicios;

import util.RHException;

public class PedirServicio extends javax.swing.JFrame {

    private AdministracionServicios mens;
    int ingreso_id = 0;
    String Tipo_id = "";
    
    
    public PedirServicio() {

        Ingreso ingreso = new Ingreso();        
        ingreso_id = ingreso.id_cliente;
        Tipo_id = ingreso.Tipo_id;
        
        mens = new AdministracionServicios();
        initComponents();
        this.setLocationRelativeTo(null);
        TF_Costo.setText("0");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CB_tipoPaquete = new javax.swing.JComboBox<>();
        TF_Fecha = new javax.swing.JTextField();
        CKB_IdaV = new javax.swing.JCheckBox();
        CB_Ciudad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TF_Costo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TF_Direccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TF_Obser = new javax.swing.JTextField();
        BotonAgregarDirec = new javax.swing.JButton();
        BotonConfirmar = new javax.swing.JButton();
        BotonCosto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Pedir servicio");

        jLabel2.setText("Tipo paquete");

        jLabel3.setText("Fecha de inicio");

        jLabel4.setText("Ida y vuelta?");

        CB_tipoPaquete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "trpdoc", "paqpeq", "paqmed", "paqgra" }));

        TF_Fecha.setText("2021-10-10 12:00:00");

        CKB_IdaV.setText("Si");

        CB_Ciudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogota", "Tunja" }));

        jLabel5.setText("Ciudad");

        jLabel6.setText("Costo");

        TF_Costo.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Direcciones");

        jLabel8.setText("Direccion");

        jLabel9.setText("Observacion");

        BotonAgregarDirec.setText("Agregar");
        BotonAgregarDirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarDirecActionPerformed(evt);
            }
        });

        BotonConfirmar.setText("Confirmar solicitud");
        BotonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConfirmarActionPerformed(evt);
            }
        });

        BotonCosto.setText("Calcular costo");
        BotonCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCostoActionPerformed(evt);
            }
        });

        jButton1.setText("<-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CB_tipoPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TF_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CB_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TF_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TF_Direccion)
                                .addComponent(TF_Obser, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonConfirmar)
                                .addGap(11, 11, 11)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonAgregarDirec)
                            .addComponent(BotonCosto)))
                    .addComponent(CKB_IdaV))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(79, 79, 79))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CB_tipoPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TF_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CKB_IdaV))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CB_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TF_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCosto))
                .addGap(18, 18, 18)
                .addComponent(BotonConfirmar)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TF_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TF_Obser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(BotonAgregarDirec)
                        .addGap(37, 37, 37)
                        .addComponent(jButton1))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarDirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarDirecActionPerformed
        
        try {
            
            int id_servicio = mens.numNuevoIDServ();
            
            mens.añadirDireccion( id_servicio, TF_Direccion.getText(), TF_Obser.getText());
            JOptionPane.showMessageDialog(null, "Direccion Incluida Exitosamente", null, JOptionPane.INFORMATION_MESSAGE);
        
        } catch (RHException f) {
            
            JOptionPane.showMessageDialog(null, f, "Error", JOptionPane.ERROR_MESSAGE);

        }
        
    }//GEN-LAST:event_BotonAgregarDirecActionPerformed

    private void BotonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConfirmarActionPerformed
        
        try {
            
            String TipoPaquete = CB_tipoPaquete.getSelectedItem().toString();
            int costo = 0;
            String ida_vuelta = "false";
            
            int n_ciudad = 2;
            int id_mensa = 1234567;
            
            String ciudad = CB_Ciudad.getSelectedItem().toString();
            int id_servicio = mens.numNuevoIDServ() + 1;
            
            if(CKB_IdaV.isSelected()){
            
                ida_vuelta = "true";
                
            }  
            
            if(ciudad.equals("Bogota")){
                
                n_ciudad = 1;
                id_mensa = 7777777;
            
            }
            
            int tarifa = mens.getTarifa(TipoPaquete);
            int comision = mens.getComision(ciudad);
            
            costo = tarifa + comision*50;
            
            mens.añadirServicio( id_servicio, TipoPaquete, "Ini", costo, TF_Fecha.getText(), ida_vuelta, n_ciudad, Tipo_id, ingreso_id, "cc", id_mensa);
            JOptionPane.showMessageDialog(null, "Servicio Incluido Exitosamente", null, JOptionPane.INFORMATION_MESSAGE);
            TF_Costo.setText(Integer.toString(costo));
            
        } catch (RHException f) {
            
            JOptionPane.showMessageDialog(null, f, "Error", JOptionPane.ERROR_MESSAGE);

        }   
        
    }//GEN-LAST:event_BotonConfirmarActionPerformed

    private void BotonCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCostoActionPerformed
        
        try {

            String TipoPaquete = CB_tipoPaquete.getSelectedItem().toString();
            String ciudad = CB_Ciudad.getSelectedItem().toString();
            
            int tarifa = mens.getTarifa(TipoPaquete);
            int comision = mens.getComision(ciudad);
            
            System.out.println(tarifa+" "+comision);   
            
            int costo = tarifa + comision*50;
            
            System.out.println(costo);
            TF_Costo.setText(Integer.toString(costo));
            
        } catch (RHException f) {
            
            JOptionPane.showMessageDialog(null, f, "Error", JOptionPane.ERROR_MESSAGE);

        }
        
    }//GEN-LAST:event_BotonCostoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
        JFrame frame = new MenuCliente();
        frame.setVisible(true);
        this.setVisible(false);
          
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarDirec;
    private javax.swing.JButton BotonConfirmar;
    private javax.swing.JButton BotonCosto;
    private javax.swing.JComboBox<String> CB_Ciudad;
    private javax.swing.JComboBox<String> CB_tipoPaquete;
    private javax.swing.JCheckBox CKB_IdaV;
    private javax.swing.JTextField TF_Costo;
    private javax.swing.JTextField TF_Direccion;
    private javax.swing.JTextField TF_Fecha;
    private javax.swing.JTextField TF_Obser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
