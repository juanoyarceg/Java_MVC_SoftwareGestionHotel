
package Vista;

import Controlador.Conexion;
import Controlador.Ctrabajador;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

 
public class InicioSesionUser extends javax.swing.JFrame {
/*private static final Conexion cone= Conexion.verificarConexion();
        Statement stmt = null;
        
    /**
     * Creates new form InicioSesionUser
     */
         /*public void validarAcceso(){   
     
     
         
        int resultado= 0;
        String login= jTextField6.getText();
        String password= String.valueOf (jPasswordField1.getPassword());
    try {
        stmt = cone.getCon().createStatement();
        String SQL_LOGIN= "SELECT * from `hotelopenmind`.`trabajador` where `Login`='"+login+"' and `Password`='"+password+"' ";
        ResultSet rs= stmt.executeQuery(SQL_LOGIN);
        if (rs.next()){
            
            resultado =1;
            
           
            if (resultado==1){
                JOptionPane.showMessageDialog(null,"Bienvenido " +login+ " al Sistema de Administración"
                        + " Hotel Open Mind");
                Menu menu= new Menu();
                menu.setVisible(true);
                this.dispose();
            } 
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Usuario/Contraseña incorrecta, pruebe nuevamente");
            }
            
            
            
        
    } catch (Exception e) {
        
           JOptionPane.showConfirmDialog(null, e.getMessage());
    }
            
        } */
     
        
        
    public InicioSesionUser() {
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

        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Lato", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LOGIN:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jTextField6.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 240, 40));

        jLabel2.setFont(new java.awt.Font("Lato", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lato", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PASSWORD:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 130, 40));

        jButton1.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 160, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_cerrar1.png"))); // NOI18N
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_cerrar3.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_cerrar2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 30, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_minimizar1.png"))); // NOI18N
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_minimizar3.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_minimizar2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciosesion-fondo.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(360, 325));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 //validación campos vacíos
        if (jTextField6.getText().length() == 0 ||jPasswordField1.getText().length()==0   ) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un login de usuario y password");
            jTextField6.requestFocus();
            return;  
     }  
        String login= jTextField6.getText();
        String password= jPasswordField1.getText();
                
                
        Ctrabajador ct = new Ctrabajador();
        ct.validarAcceso(login, password);
    // validarAcceso();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesionUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesionUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesionUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesionUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesionUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JPasswordField jPasswordField1;
    public javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
