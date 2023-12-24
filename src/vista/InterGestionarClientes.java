package vista;

import java.sql.Connection;
import Conexion.Conexion;
import Controlador.Ctrl_Clientes;
import java.sql.PreparedStatement;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

/**
 *
 * @author Jaramillo
 */
public class InterGestionarClientes extends javax.swing.JInternalFrame {

    private int idCliente;

    public InterGestionarClientes() {
        initComponents();
        this.setSize(new Dimension(600, 400));
        this.setTitle("Gestionar Clientes");

        this.CargarTblaClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_clientes = new javax.swing.JTable();
        jLabel_walpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_actualizar.setBackground(new java.awt.Color(51, 204, 0));
        jButton_actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        jButton_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 130, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Email:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txt_email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        jPanel3.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nombre:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Telefono:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txt_telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 190, 170));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_clientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 350, 250));

        jLabel_walpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_walpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
        int filaSeleccionada = jTable_clientes.getSelectedRow();

        if (filaSeleccionada != -1) {
            int idCliente = (int) jTable_clientes.getValueAt(filaSeleccionada, 0);

            // Construye el objeto Cliente con los valores actuales de los JTextField
            Cliente cliente = new Cliente();
            cliente.setIDCliente(idCliente);
            cliente.setNombreCliente(txt_nombre.getText());
            cliente.setTelefono(txt_telefono.getText());
            cliente.setEmail(txt_email.getText());

            // Realiza la actualización llamando al método correspondiente del controlador
            Ctrl_Clientes controladorClientes = new Ctrl_Clientes();
            boolean actualizacionExitosa = controladorClientes.actualizar(cliente);

            if (actualizacionExitosa) {
                // Vuelve a cargar la tabla con los datos actualizados
                CargarTblaClientes();
                System.out.println("Actualización exitosa");
                // Puedes agregar un mensaje de éxito si lo deseas
            } else {
                System.out.println("Error en la actualización");
                // Puedes agregar un mensaje de error si lo deseas
            }
        } else {
            System.out.println("No se ha seleccionado ninguna fila");
        }
    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        // Obtén la fila seleccionada en la tabla
        int filaSeleccionada = jTable_clientes.getSelectedRow();

        if (filaSeleccionada != -1) { // Asegúrate de que se haya seleccionado una fila
            // Obtén el ID del cliente seleccionado
            int IDCliente = (int) jTable_clientes.getValueAt(filaSeleccionada, 0);

            // Realiza la eliminación llamando al método correspondiente del controlador
            Ctrl_Clientes controladorClientes = new Ctrl_Clientes();
            boolean eliminacionExitosa = controladorClientes.eliminar(idCliente);

            if (eliminacionExitosa) {
                // Vuelve a cargar la tabla sin el cliente eliminado
                CargarTblaClientes();
                // Puedes agregar un mensaje de éxito si lo deseas
            } else {
                // Puedes agregar un mensaje de error si lo deseas
            }
        } else {
            // Puedes mostrar un mensaje indicando que no se ha seleccionado ninguna fila
        }
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_walpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_clientes;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * metodo para mostrar todos los clientes registrados
     */
    private void CargarTblaClientes() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select IDCliente, NombreCliente, Telefono, Email from clientes";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarClientes.jTable_clientes = new JTable(model);
            InterGestionarClientes.jScrollPane1.setViewportView(InterGestionarClientes.jTable_clientes);

            model.addColumn("IDCliente");
            model.addColumn("NombreCliente");
            model.addColumn("Telefono");
            model.addColumn("Email");

            while (rs.next()) {
                Object fila[] = new Object[4];

                for (int i = 0; i < 4; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla cliente: " + e);
        }

        jTable_clientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_clientes.rowAtPoint(e.getPoint());

                if (fila_point > -1) {
                    idCliente = (int) model.getValueAt(fila_point, 0); // IDCliente en la primera columna
                    int columnaSeleccionada = jTable_clientes.getSelectedColumn();
                    EnviarDatosClienteSeleccionado(idCliente, columnaSeleccionada);
                }
            }

        });
    }

    private void EnviarDatosClienteSeleccionado(int idCliente, int columnaSeleccionada) {
        try {
            Connection con = Conexion.conectar();
            String columnaSeleccionadaNombre = "";

            switch (columnaSeleccionada) {
                case 1:
                    columnaSeleccionadaNombre = "NombreCliente";
                    break;
                case 2:
                    columnaSeleccionadaNombre = "Telefono";
                    break;
                case 3:
                    columnaSeleccionadaNombre = "Email";
                    break;
                // Puedes agregar más casos según sea necesario

                default:
                    // Manejo por defecto o error
                    break;
            }
            PreparedStatement pst = con.prepareStatement("select * from clientes where IDCliente = ?");
            pst.setInt(1, idCliente);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                // Establece los valores en los JTextFields
                txt_nombre.setText(rs.getString("NombreCliente"));
                txt_telefono.setText(rs.getString("Telefono"));
                txt_email.setText(rs.getString("Email"));
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al seleccionar cliente: " + e);
        }
    }

}
