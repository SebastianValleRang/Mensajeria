package presentacion;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import negocio.AdministracionServicios;
import util.RHException;

import javax.swing.table.DefaultTableModel;
import negocio.AdministracionServicios;

public class VisualizarEncargos extends javax.swing.JFrame {

    private AdministracionServicios mens;
    int id_mensa = 0;
    String Tipo_id_mensa = "";

    public VisualizarEncargos() {
        
        IngresoMensa ingreso = new IngresoMensa();
        
        id_mensa = ingreso.id_mensa;
        Tipo_id_mensa = ingreso.Tipo_id_mensa;
        
        initComponents();
        mens = new AdministracionServicios();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Query = new javax.swing.JTable();
        BotonTodos = new javax.swing.JButton();
        BotonPend = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        BotonRegre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla_Query.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla_Query);

        BotonTodos.setText("Consultar todos los encargos");
        BotonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTodosActionPerformed(evt);
            }
        });

        BotonPend.setText("Consultar los encargos pendientes");
        BotonPend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPendActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Consultar encargos");

        BotonRegre.setText("<-");
        BotonRegre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonRegre)
                        .addGap(232, 232, 232)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(BotonTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BotonPend)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonRegre)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonTodos)
                    .addComponent(BotonPend))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTodosActionPerformed

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

            array = mens.verServicios(id_mensa, Tipo_id_mensa);

            aux = array.size();
            int col = aux / 11;
            int aux2 = 0;
            
            for (int j = 0; j < col; j++) {
                
                for (int i = 0; i < datos.length; i++) {
                    
                    datos[i] = array.get(aux2);; 
                    aux2++;
                    
                }
                
                modelo.addRow(datos);
                
            }
            
            Tabla_Query.setModel(modelo);         

        } catch (RHException f) {

            JOptionPane.showMessageDialog(null, f, "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_BotonTodosActionPerformed

    private void BotonPendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPendActionPerformed
        
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

            array = mens.verServiciosAct(id_mensa, Tipo_id_mensa);

            aux = array.size();
            int col = aux / 11;
            int aux2 = 0;
            
            for (int j = 0; j < col; j++) {
                
                for (int i = 0; i < datos.length; i++) {
                    
                    datos[i] = array.get(aux2);; 
                    aux2++;
                    
                }
                
                modelo.addRow(datos);
                
            }
            
            Tabla_Query.setModel(modelo);

        } catch (RHException f) {

            JOptionPane.showMessageDialog(null, f, "Error", JOptionPane.ERROR_MESSAGE);

        }
        
    }//GEN-LAST:event_BotonPendActionPerformed

    private void BotonRegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegreActionPerformed
        
        JFrame frame = new MenuMensa();
        frame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonRegreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonPend;
    private javax.swing.JButton BotonRegre;
    private javax.swing.JButton BotonTodos;
    private javax.swing.JTable Tabla_Query;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
