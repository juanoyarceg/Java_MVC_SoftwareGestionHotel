/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CReporte;
import Modelo.Clienteamor;
import Modelo.Reporte;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
public class Reportes extends javax.swing.JFrame {

    /**
     * Creates new form StockProductos
     */
    public Reportes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_cerrar1.png"))); // NOI18N
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_cerrar3.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_cerrar2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 30, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_back1.jpg"))); // NOI18N
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_back3.jpg"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_back2.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 30, 30));

        jLabel2.setFont(new java.awt.Font("Lato", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REPORTES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CLIENTE  DEL AMOR:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("REGISTRO  CLIENTE POR RUT:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("INGRESE RUT:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lato", 2, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Sin puntos ni código verificador");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 183, -1, 10));

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar1.jpg"))); // NOI18N
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar3.jpg"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar2.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 90, 20));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 170, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "idPersona", "Rut", "Nombre", "APaterno", "AMaterno", "Nacionalidad", "Sexo", "Fecha_Nacimiento", "Tipo_Cliente"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 670, 50));

        jButton4.setBackground(new java.awt.Color(153, 0, 0));
        jButton4.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar1.jpg"))); // NOI18N
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar3.jpg"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar2.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 90, 20));

        jLabel6.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DATOS PERSONA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jButton5.setBackground(new java.awt.Color(153, 0, 0));
        jButton5.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrar1.jpg"))); // NOI18N
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrar3.jpg"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrar2.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 90, 20));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 170, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "idPersona", "Nombre", "APaterno", "Tipo_Cliente"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, 50));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "RUT", "N Visitas"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 250, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 720, 670));

        jLabel8.setFont(new java.awt.Font("Lato", 2, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setText("Sin puntos ni código verificador");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 183, -1, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        System.exit(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        this.dispose();
        new Menu().setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      // PROCEDIMIENTO PARA MOSTRAR UNA TABLA COMPLETA
        
        DefaultTableModel modelo;  // Se llama la clase DefaultTableModel.. y se intancia un objeto modelo
       modelo = (DefaultTableModel) jTable1.getModel(); // el objeto modelo se iguala al nombre de la tabla que se va a mostrar (jTable1)
       jTable1.setModel(modelo); // se le envía el modelo para que lo muestre
       modelo.setRowCount(0); // le asignamos que comienze desde la fila 0
       
       Controlador.CReporte r = new Controlador.CReporte(); // se crea un objeto de la clase controlador donde esta el método para mostrar
       int Rut=Integer.parseInt(jTextField6.getText()) ;  // Se recibe el Rut por parametro (para buscarlo) en el campo de texto JTextField6
       List<Reporte> list = r.ConsultaReporte1(Rut); // Se crea una lista asociada al nombre de la clase del Reporte, luego el objeto de la clasecontrolador se le aplica el método para mostrar y se le pasa por parametro la variable Rut
      
       
       Object rowData[] = new Object[9]; // se crea un arreglo de Objetos rowData para leer las filas que traen las columnas, en este caso son 9 campos
       
       
       
       for (int i = 0; i < list.size(); i++) {   // con un for se lee el arreglo
           
           rowData[0] = list.get(i).getIdPersona();    //cada posición de la columna se trae con el método get de cada atributo creados en la clase modelo     
           rowData[1] = list.get(i).getRut();
           rowData[2] = list.get(i).getNombre();
           rowData[3] = list.get(i).getAPaterno();
           rowData[4] = list.get(i).getAMaterno();
           rowData[5] = list.get(i).getNacionalidad();
           rowData[6] = list.get(i).getSexo();
           rowData[7] = list.get(i).getFecha_Nacimiento();
           rowData[8] = list.get(i).getTipo_Cliente();
           modelo.addRow(rowData);   // con esta instrucción se traspasan los elementos de la lista a la tabla modelo
         
          }
       

        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  // PROCEDIMIENTO PARA MOSTRAR UNA TABLA INCOMPLETA
        
        DefaultTableModel modelo;  // Se llama la clase DefaultTableModel.. y se intancia un objeto modelo
       modelo = (DefaultTableModel) jTable2.getModel(); // el objeto modelo se iguala al nombre de la tabla que se va a mostrar (jTable1)
       jTable2.setModel(modelo); // se le envía el modelo para que lo muestre
       modelo.setRowCount(0); // le asignamos que comienze desde la fila 0
       
       Controlador.CReporte r = new Controlador.CReporte(); // se crea un objeto de la clase controlador donde esta el método para mostrar
       int Rut=Integer.parseInt(jTextField7.getText()) ;  // Se recibe el Rut por parametro (para buscarlo) en el campo de texto JTextField6
       List<Reporte> list = r.ConsultaReporte1(Rut); // Se crea una lista asociada al nombre de la clase del Reporte, luego el objeto de la clasecontrolador se le aplica el método para mostrar y se le pasa por parametro la variable Rut
      
       
       Object rowData[] = new Object[4]; // se crea un arreglo de Objetos rowData para leer las filas que traen las columnas, en este caso son 9 campos
       
       
       
       for (int i = 0; i < list.size(); i++) {   // con un for se lee el arreglo
           
           rowData[0] = list.get(i).getIdPersona();    //cada posición de la columna se trae con el método get de cada atributo creados en la clase modelo     
           rowData[1] = list.get(i).getNombre();
           rowData[2] = list.get(i).getAPaterno();
           rowData[3] = list.get(i).getTipo_Cliente();
           modelo.addRow(rowData);   // con esta instrucción se traspasan los elementos de la lista a la tabla modelo
         
          }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      
       DefaultTableModel modelo;  // Se llama la clase DefaultTableModel.. y se intancia un objeto modelo
       modelo = (DefaultTableModel) jTable3.getModel(); // el objeto modelo se iguala al nombre de la tabla que se va a mostrar (jTable1)
       jTable3.setModel(modelo); // se le envía el modelo para que lo muestre
       modelo.setRowCount(0); // le asignamos que comienze desde la fila 0
       
       Controlador.CReporte r = new Controlador.CReporte(); // se crea un objeto de la clase controlador donde esta el método para mostrar
       //int Rut=Integer.parseInt(jTextField7.getText()) ;  // Se recibe el Rut por parametro (para buscarlo) en el campo de texto JTextField6
       List<Clienteamor> list =r.ClientedelAmor();// Se crea una lista asociada al nombre de la clase del Reporte, luego el objeto de la clasecontrolador se le aplica el método para mostrar y se le pasa por parametro la variable Rut
      
       
       Object rowData[] = new Object[2]; // se crea un arreglo de Objetos rowData para leer las filas que traen las columnas, en este caso son 9 campos
       
       
       
       for (int i = 0; i < list.size(); i++) {   // con un for se lee el arreglo
           
           rowData[0] = list.get(i).getRut();    //cada posición de la columna se trae con el método get de cada atributo creados en la clase modelo     
           rowData[1] = list.get(i).getCount();
           
           modelo.addRow(rowData);   // con esta instrucción se traspasan los elementos de la lista a la tabla modelo
         
          }        // TODO add your handling code here:
                                            


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}