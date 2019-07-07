/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Clienteamor;
import Modelo.ReporteG1;
import Modelo.ReporteG2;
import Modelo.ReporteG3;
import Modelo.ReporteG4;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
public class ReporteGeneral extends javax.swing.JFrame {

    /**
     * Creates new form StockProductos
     */
    public ReporteGeneral() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProductoMsVendido = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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
        jLabel2.setText("REPORTE  GENERAL  ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HABITACION MENOS SOLICITADA:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PRODUCTO MAS VENDIDO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta1.jpg"))); // NOI18N
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta3.jpg"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta2.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 90, 20));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta1.jpg"))); // NOI18N
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta3.jpg"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta2.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 90, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                " Mayor Visitas", " N° de Registros"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 280, 40));

        jLabel8.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRODUCTO MENOS VENDIDO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HABITACION MÁS SOLICITADA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "   Mayor Demanda", "  Cantidad Maxima"
            }
        ));
        ProductoMsVendido.setViewportView(jTable3);

        getContentPane().add(ProductoMsVendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 270, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                " Menor Visitas", " N° de Registros"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 280, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta1.jpg"))); // NOI18N
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta3.jpg"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta2.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 90, 20));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta1.jpg"))); // NOI18N
        jButton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta3.jpg"))); // NOI18N
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta2.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 90, 20));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "   Menor Demanda", "  Cantidad Minima"
            }
        ));
        jScrollPane3.setViewportView(jTable4);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 270, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte_general.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 720, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        System.exit(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        this.dispose();
        new Menu().setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    
    DefaultTableModel modelo;  // Se llama la clase DefaultTableModel.. y se intancia un objeto modelo
       modelo = (DefaultTableModel) jTable1.getModel(); // el objeto modelo se iguala al nombre de la tabla que se va a mostrar (jTable1)
       jTable1.setModel(modelo); // se le envía el modelo para que lo muestre
       modelo.setRowCount(0); // le asignamos que comienze desde la fila 0
       
       Controlador.CReporte r = new Controlador.CReporte(); // se crea un objeto de la clase controlador donde esta el método para mostrar
       //int Rut=Integer.parseInt(jTextField7.getText()) ;  // Se recibe el Rut por parametro (para buscarlo) en el campo de texto JTextField6
       List<ReporteG1> list = r.ReporteGeneral_1();// Se crea una lista asociada al nombre de la clase del Reporte, luego el objeto de la clasecontrolador se le aplica el método para mostrar y se le pasa por parametro la variable Rut
      
       
       Object rowData[] = new Object[2]; // se crea un arreglo de Objetos rowData para leer las filas que traen las columnas, en este caso son 9 campos
       
       
       
       for (int i = 0; i < list.size(); i++) {   // con un for se lee el arreglo
           
           rowData[0] = list.get(i).getNombreHabitacion();    //cada posición de la columna se trae con el método get de cada atributo creados en la clase modelo     
           rowData[1] = list.get(i).getCount();
           
           modelo.addRow(rowData);   // con esta instrucción se traspasan los elementos de la lista a la tabla modelo
         
          }        // TODO add your handling code here:
                                            


               // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    
        
       DefaultTableModel modelo;  // Se llama la clase DefaultTableModel.. y se intancia un objeto modelo
       modelo = (DefaultTableModel) jTable2.getModel(); // el objeto modelo se iguala al nombre de la tabla que se va a mostrar (jTable1)
       jTable2.setModel(modelo); // se le envía el modelo para que lo muestre
       modelo.setRowCount(0); // le asignamos que comienze desde la fila 0
       
       Controlador.CReporte r = new Controlador.CReporte(); // se crea un objeto de la clase controlador donde esta el método para mostrar
       //int Rut=Integer.parseInt(jTextField7.getText()) ;  // Se recibe el Rut por parametro (para buscarlo) en el campo de texto JTextField6
       List<ReporteG2> list = r.ReporteGeneral_2();// Se crea una lista asociada al nombre de la clase del Reporte, luego el objeto de la clasecontrolador se le aplica el método para mostrar y se le pasa por parametro la variable Rut
      
       
       Object rowData[] = new Object[2]; // se crea un arreglo de Objetos rowData para leer las filas que traen las columnas, en este caso son 9 campos
       
       
       
       for (int i = 0; i < list.size(); i++) {   // con un for se lee el arreglo
           
           rowData[0] = list.get(i).getNombreHabitacion();    //cada posición de la columna se trae con el método get de cada atributo creados en la clase modelo     
           rowData[1] = list.get(i).getCount();
           
           modelo.addRow(rowData);   // con esta instrucción se traspasan los elementos de la lista a la tabla modelo
         
          }   

            // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         

    DefaultTableModel modelo;  // Se llama la clase DefaultTableModel.. y se intancia un objeto modelo
       modelo = (DefaultTableModel) jTable3.getModel(); // el objeto modelo se iguala al nombre de la tabla que se va a mostrar (jTable1)
       jTable3.setModel(modelo); // se le envía el modelo para que lo muestre
       modelo.setRowCount(0); // le asignamos que comienze desde la fila 0
       
       Controlador.CReporte r = new Controlador.CReporte(); // se crea un objeto de la clase controlador donde esta el método para mostrar
       //int Rut=Integer.parseInt(jTextField7.getText()) ;  // Se recibe el Rut por parametro (para buscarlo) en el campo de texto JTextField6
       List<ReporteG3> list = r.ReporteGeneral_3();// Se crea una lista asociada al nombre de la clase del Reporte, luego el objeto de la clasecontrolador se le aplica el método para mostrar y se le pasa por parametro la variable Rut
      
       
       Object rowData[] = new Object[2]; // se crea un arreglo de Objetos rowData para leer las filas que traen las columnas, en este caso son 9 campos
       
       
       
       for (int i = 0; i < list.size(); i++) {   // con un for se lee el arreglo
           
           rowData[0] = list.get(i).getNombre();    //cada posición de la columna se trae con el método get de cada atributo creados en la clase modelo     
           rowData[1] = list.get(i).getCantidad();
           
           modelo.addRow(rowData);   // con esta instrucción se traspasan los elementos de la lista a la tabla modelo
         
          }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed


    DefaultTableModel modelo;  // Se llama la clase DefaultTableModel.. y se intancia un objeto modelo
       modelo = (DefaultTableModel) jTable4.getModel(); // el objeto modelo se iguala al nombre de la tabla que se va a mostrar (jTable1)
       jTable4.setModel(modelo); // se le envía el modelo para que lo muestre
       modelo.setRowCount(0); // le asignamos que comienze desde la fila 0
       
       Controlador.CReporte r = new Controlador.CReporte(); // se crea un objeto de la clase controlador donde esta el método para mostrar
       //int Rut=Integer.parseInt(jTextField7.getText()) ;  // Se recibe el Rut por parametro (para buscarlo) en el campo de texto JTextField6
       List<ReporteG4> list = r.ReporteGeneral_4();// Se crea una lista asociada al nombre de la clase del Reporte, luego el objeto de la clasecontrolador se le aplica el método para mostrar y se le pasa por parametro la variable Rut
      
       
       Object rowData[] = new Object[2]; // se crea un arreglo de Objetos rowData para leer las filas que traen las columnas, en este caso son 9 campos
       
       
       
       for (int i = 0; i < list.size(); i++) {   // con un for se lee el arreglo
           
           rowData[0] = list.get(i).getNombre();    //cada posición de la columna se trae con el método get de cada atributo creados en la clase modelo     
           rowData[1] = list.get(i).getCantidad();
           
           modelo.addRow(rowData);   // con esta instrucción se traspasan los elementos de la lista a la tabla modelo
         
          }           // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ProductoMsVendido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}
