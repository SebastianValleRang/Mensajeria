package presentacion;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.AdministracionServicios;
import util.RHException;

public class ConsultarDetalles extends javax.swing.JFrame {
    
    private AdministracionServicios mens;

    public ConsultarDetalles() {

        initComponents();
        this.setLocationRelativeTo(null);
        mens = new AdministracionServicios();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        TF_NumServ = new javax.swing.JTextField();
        TF_Fecha = new javax.swing.JTextField();
        TF_NumCLie = new javax.swing.JTextField();
        BotonConsultarFecha = new javax.swing.JButton();
        CB_TipoID = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Query = new javax.swing.JTable();
        BotonConsultarNumero = new javax.swing.JButton();
        BotonConsultarDI = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotonInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Consultar detalles de un servicio");

        TF_Fecha.setText("2021-10-10 12:00:00");

        BotonConsultarFecha.setText("Consultar con fecha");
        BotonConsultarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarFechaActionPerformed(evt);
            }
        });

        CB_TipoID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cc", "ti", "pa" }));

        Tabla_Query.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla_Query);

        BotonConsultarNumero.setText("Consultar con numero");
        BotonConsultarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarNumeroActionPerformed(evt);
            }
        });

        BotonConsultarDI.setText("Consultar con D.I.");
        BotonConsultarDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarDIActionPerformed(evt);
            }
        });

        jLabel2.setText("Numero de servicio");

        jLabel3.setText("Fecha del servicio");

        jLabel4.setText("Identificacion del cliente");

        BotonInicio.setText("<-");
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonInicio)
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TF_Fecha)
                                    .addComponent(TF_NumServ)
                                    .addComponent(CB_TipoID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TF_NumCLie))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotonConsultarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BotonConsultarNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(BotonConsultarDI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel1))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(BotonInicio))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_NumServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonConsultarNumero)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonConsultarFecha)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CB_TipoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_NumCLie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(BotonConsultarDI)))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonConsultarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarFechaActionPerformed
        
        ArrayList<String> array = new ArrayList<String>();

        int aux = 0;
        String[] datos = new String[11];
        
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID servicio");
        modelo.addColumn("Tipo paquete");
        modelo.addColumn("estado");
        modelo.addColumn("costo");
        modelo.addColumn("Fecha inicio");
        modelo.addColumn("ida y vuelta");
        modelo.addColumn("Codigo postal");
        modelo.addColumn("Tipo identidad");
        modelo.addColumn("Identificacion");
        modelo.addColumn("Tipo identidad mensa");
        modelo.addColumn("Identidad mensa");
        
        Tabla_Query.setModel(modelo);

        try {

            array = mens.consultarDetallesFecha(TF_Fecha.getText());

            aux = array.size();
            int col = aux / 11;
            int aux2 = 0;
            
            for (int j = 0; j < col; j++) {
                
                for (int i = 0; i < datos.length; i++) {
                    
                    datos[i] = array.get(aux2); 
                    aux2++;
                    
                }
                
                modelo.addRow(datos);
                
            }
            
            Tabla_Query.setModel(modelo);
            
        } catch (RHException f) {

            JOptionPane.showMessageDialog(null, f, "Error", JOptionPane.ERROR_MESSAGE);

        }
        
    }//GEN-LAST:event_BotonConsultarFechaActionPerformed

    private void BotonConsultarDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarDIActionPerformed
        
        String tipoID = CB_TipoID.getSelectedItem().toString();
        
        ArrayList<String> array = new ArrayList<String>();

        int aux = 0;
        String[] datos = new String[11];
        
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID servicio");
        modelo.addColumn("Tipo paquete");
        modelo.addColumn("estado");
        modelo.addColumn("costo");
        modelo.addColumn("Fecha inicio");
        modelo.addColumn("ida y vuelta");
        modelo.addColumn("Codigo postal");
        modelo.addColumn("Tipo identidad");
        modelo.addColumn("Identificacion");
        modelo.addColumn("Tipo identidad mensa");
        modelo.addColumn("Identidad mensa");
        
        Tabla_Query.setModel(modelo);

        try {
           
            array = mens.consultarDetallesDI(Integer.parseInt(TF_NumCLie.getText()), tipoID);

            aux = array.size();
            int col = aux / 11;
            int aux2 = 0;
            
            for (int j = 0; j < col; j++) {
                
                for (int i = 0; i < datos.length; i++) {
                    
                    datos[i] = array.get(aux2); 
                    aux2++;
                    
                }
                
                modelo.addRow(datos);
                
            }
            
            Tabla_Query.setModel(modelo);
            
        } catch (RHException f) {

            JOptionPane.showMessageDialog(null, f, "Error", JOptionPane.ERROR_MESSAGE);

        }
        
    }//GEN-LAST:event_BotonConsultarDIActionPerformed

    private void BotonConsultarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarNumeroActionPerformed
        
        ArrayList<String> array = new ArrayList<String>();

        int aux = 0;
        String[] datos = new String[11];
        
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID servicio");
        modelo.addColumn("Tipo paquete");
        modelo.addColumn("estado");
        modelo.addColumn("costo");
        modelo.addColumn("Fecha inicio");
        modelo.addColumn("ida y vuelta");
        modelo.addColumn("Codigo postal");
        modelo.addColumn("Tipo identidad");
        modelo.addColumn("Identificacion");
        modelo.addColumn("Tipo identidad mensa");
        modelo.addColumn("Identidad mensa");
        
        Tabla_Query.setModel(modelo);

        try {
            
            array = mens.consultarDetallesServ(Integer.parseInt(TF_NumServ.getText()));

            aux = array.size();
            int col = aux / 11;
            int aux2 = 0;
            
            for (int j = 0; j < col; j++) {
                
                for (int i = 0; i < datos.length; i++) {
                    
                    datos[i] = array.get(aux2); 
                    aux2++;
                    
                }
                
                modelo.addRow(datos);
                
            }
            
            Tabla_Query.setModel(modelo);
            
        } catch (RHException f) {

            JOptionPane.showMessageDialog(null, f, "Error", JOptionPane.ERROR_MESSAGE);

        }
        
    }//GEN-LAST:event_BotonConsultarNumeroActionPerformed

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
                
        JFrame frame = new Interfaz();
        frame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonInicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsultarDI;
    private javax.swing.JButton BotonConsultarFecha;
    private javax.swing.JButton BotonConsultarNumero;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JComboBox<String> CB_TipoID;
    private javax.swing.JTextField TF_Fecha;
    private javax.swing.JTextField TF_NumCLie;
    private javax.swing.JTextField TF_NumServ;
    private javax.swing.JTable Tabla_Query;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
