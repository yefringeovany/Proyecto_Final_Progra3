package gt.com.tarea.vistas;

import gt.com.tarea.estructuras.Factura;
import gt.com.tarea.estructuras.TablaHash;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TablaHashFacturas extends javax.swing.JFrame {

    private TablaHash tablaHash;
    private static final int TAMANIO = 100;

    public TablaHashFacturas() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        tablaHash = new TablaHash(TAMANIO);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldNumero2 = new javax.swing.JTextField();
        jTextFieldFecha2 = new javax.swing.JTextField();
        jTextFieldNombre2 = new javax.swing.JTextField();
        jTextFieldNit2 = new javax.swing.JTextField();
        jTextFieldTelefono2 = new javax.swing.JTextField();
        jTextFieldMonto2 = new javax.swing.JTextField();
        jButtonAgregar2 = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaFacturas = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldIngresarNumero = new javax.swing.JTextField();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonMenuTablaHash = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel13.setText("Numero: ");

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel14.setText("Fecha: ");

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel15.setText("Nombre: ");

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16.setText("Nit: ");

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel17.setText("Telefono: ");

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel18.setText("Monto: ");

        jTextFieldNumero2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextFieldFecha2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextFieldNombre2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextFieldNit2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextFieldTelefono2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextFieldMonto2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButtonAgregar2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonAgregar2.setText("Agregar");
        jButtonAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregar2ActionPerformed(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Tabla hash facturas");

        jTextAreaFacturas.setColumns(20);
        jTextAreaFacturas.setRows(5);
        jScrollPane2.setViewportView(jTextAreaFacturas);

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel20.setText("Ingresar numero: ");

        jTextFieldIngresarNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButtonLimpiar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonMenuTablaHash.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonMenuTablaHash.setText("Menu tabla hash");
        jButtonMenuTablaHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuTablaHashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jButtonAgregar2))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNumero2)
                                    .addComponent(jTextFieldFecha2)
                                    .addComponent(jTextFieldNombre2)
                                    .addComponent(jTextFieldNit2)
                                    .addComponent(jTextFieldTelefono2)
                                    .addComponent(jTextFieldMonto2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(jButtonLimpiar, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jButtonMenuTablaHash))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldIngresarNumero)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEliminar))))
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTextFieldIngresarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar)
                            .addComponent(jButtonEliminar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextFieldFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextFieldNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextFieldNit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextFieldTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jTextFieldMonto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAgregar2)
                            .addComponent(jButtonLimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(jButtonMenuTablaHash)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuTablaHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuTablaHashActionPerformed
        MenuTablaHash menuTablaHash = new MenuTablaHash();
        menuTablaHash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonMenuTablaHashActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        String numero = jTextFieldIngresarNumero.getText();
        if (tablaHash.buscar(numero)) {
            tablaHash.eliminar(numero);
            JOptionPane.showMessageDialog(this, "Factura eliminada correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró ningúna factura con el numero especificado");
        }
        actualizarTextArea();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiarCamposDeTexto();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String numero = jTextFieldIngresarNumero.getText();
        Factura facturaBuscada = (Factura) tablaHash.obtener(numero);
        if (facturaBuscada != null) {
            llenarCamposDeTexto(facturaBuscada);
        } else {
            JOptionPane.showMessageDialog(this, "Factura no encontrada");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregar2ActionPerformed
        String numero = jTextFieldNumero2.getText();
        String fecha = jTextFieldFecha2.getText();
        String nombre = jTextFieldNombre2.getText();
        String nit = jTextFieldNit2.getText();
        String telefono = jTextFieldTelefono2.getText();
        String monto = jTextFieldMonto2.getText();
        Factura nuevaFactura = new Factura(numero, fecha, nombre, nit, telefono, monto);
        tablaHash.agregar(numero, nuevaFactura);
        actualizarTextArea();
        limpiarCamposDeTexto();
    }//GEN-LAST:event_jButtonAgregar2ActionPerformed

    private void actualizarTextArea() {
        jTextAreaFacturas.setText("");
        for (int i = 0; i < tablaHash.getCapacidad(); i++) {
            LinkedList<TablaHash.Pair> lista = tablaHash.getLista(i);
            if (lista != null) {
                for (TablaHash.Pair pair : lista) {
                    Factura factura = (Factura) pair.valor;
                    jTextAreaFacturas.append(factura.toString() + "\n");
                }
            }
        }
    }

    private void llenarCamposDeTexto(Factura factura) {
        jTextFieldNumero2.setText(factura.getNumero());
        jTextFieldFecha2.setText(factura.getFecha());
        jTextFieldNombre2.setText(factura.getNombre());
        jTextFieldNit2.setText(factura.getNit());
        jTextFieldTelefono2.setText(factura.getTelefono());
        jTextFieldMonto2.setText(factura.getMonto());
    }

    private void limpiarCamposDeTexto() {
        jTextFieldNumero2.setText(null);
        jTextFieldFecha2.setText(null);
        jTextFieldNombre2.setText(null);
        jTextFieldNit2.setText(null);
        jTextFieldTelefono2.setText(null);
        jTextFieldMonto2.setText(null);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TablaHashFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaHashFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaHashFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaHashFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaHashFacturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar2;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonMenuTablaHash;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaFacturas;
    private javax.swing.JTextField jTextFieldFecha2;
    private javax.swing.JTextField jTextFieldIngresarNumero;
    private javax.swing.JTextField jTextFieldMonto2;
    private javax.swing.JTextField jTextFieldNit2;
    private javax.swing.JTextField jTextFieldNombre2;
    private javax.swing.JTextField jTextFieldNumero2;
    private javax.swing.JTextField jTextFieldTelefono2;
    // End of variables declaration//GEN-END:variables
}
