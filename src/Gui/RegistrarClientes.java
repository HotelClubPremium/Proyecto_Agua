
package Gui;

import Control.CtrViviendas ;
import Control.CtrClientes ;
import javax.swing.JOptionPane;
import Modelos.Clientes;
import Modelos.Viviendas;
import Modelos.ClientesDAO;
import Modelos.ViviendasDAO;

public class RegistrarClientes extends javax.swing.JFrame {

    CtrViviendas crV=new CtrViviendas();
     CtrClientes crC=new CtrClientes(); 
   /* private Integer ultimoregistro;*/
    
    public void limpiarcajas(){
            txtCedula.setText(null);
            txtNombre.setText(null);
            txtApellido.setText(null);
            txtEmail.setText(null);
            txtTelefono.setText(null);
            txtDireccion_C.setText(null);
            txtCodigo.setText(null);
            txtDireccion_V.setText(null);
            txtBarrio.setText(null);
            txtEstrato.setText(null);
           
           /* txtDireccion_C.setEditable(false);*/
 
 }
    
    
    public RegistrarClientes() {
        initComponents();
        Ultimo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion_V = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEstrato = new javax.swing.JTextField();
        txtBarrio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion_C = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        btn_Guardar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Vivienda"));

        jLabel1.setText("Codigo");

        jLabel2.setText("Direccion");

        jLabel3.setText("Estrato");

        jLabel4.setText("Barrio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtDireccion_V, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(txtEstrato, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(txtDireccion_V, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtEstrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));

        jLabel5.setText("Cedula");

        txtCedula.setName("txtUser"); // NOI18N
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre");

        jLabel8.setText("Apellidos");

        jLabel6.setText("Direccion");

        jLabel9.setText("Email");

        jLabel10.setText("Telefono");

        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourse/Buscar.png"))); // NOI18N
        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourse/Floppy-Small-icon.png"))); // NOI18N
        eliminar.setText("eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addComponent(txtDireccion_C)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_Buscar)
                        .addGap(40, 40, 40)
                        .addComponent(eliminar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtDireccion_C, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourse/Floppy-Small-icon.png"))); // NOI18N
        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourse/Cancelar.png"))); // NOI18N
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourse/Salir.png"))); // NOI18N
        btn_Salir.setText("Cerrar");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourse/Floppy-Small-icon.png"))); // NOI18N
        btn_actualizar.setText("actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btn_Guardar)
                .addGap(46, 46, 46)
                .addComponent(btn_Cancelar)
                .addGap(47, 47, 47)
                .addComponent(btn_Salir)
                .addGap(48, 48, 48)
                .addComponent(btn_actualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed

    }//GEN-LAST:event_txtCedulaActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
    
         Clientes c=new Clientes();
            c.setCedula(txtCedula.getText());
            c.setNombre(txtNombre.getText());
            c.setApellido(txtApellido.getText());
            c.setEmail(txtEmail.getText());
            c.setDireccion(txtDireccion_C.getText());
            c.setTelefono(txtTelefono.getText());
            String msg=crC.insert(c);   /* ese el u de ctrclientes*/
            
       // JOptionPane.showMessageDialog(this,msg);
        
         Viviendas v=new Viviendas();
           v.setCodigo(txtCodigo.getText());
         
            v.setDireccion(txtDireccion_V.getText());
            v.setEstrato(txtEstrato.getText());
            v.setId_barrio(Integer.parseInt(txtBarrio.getText()));
            v.setDeuda(0);
            v.setDescuento(0);
             msg=crV.insert(v);
         
            JOptionPane.showMessageDialog(this,msg);
            
            //Limpiar();
    
      
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
       limpiarcajas();

    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        //System.exit(0);
        new Principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        if (txtCedula.getText().equals("")  /*txtCodigo.getText().equals("")*/){
             JOptionPane.showMessageDialog(null,"Debe Escribir Una Cedula o codigo de vivienda");
        }
        else{
            Clientes c=new Clientes();
            ClientesDAO cDAO=new ClientesDAO();
            Viviendas v=new Viviendas();
            ViviendasDAO vDAO=new ViviendasDAO();
            //c=cDAO.Buscar(txtCedula.getText());
            
           // Integer codigo=  Integer.parseInt(txtCedula.getText());
                    // c  = crC.getPk(codigo);
            
            String cedula=txtCedula.getText();
            String codigo=txtCodigo.getText();
            
           // c  = crC.getPk(txtCedula.getText());
            
            c  = crC.getPk(cedula);
            v = crV.getPk(codigo);
           
            if (c == null ){
                 JOptionPane.showMessageDialog(null,"No Existe El Cliente");
                 
            }
            else{
            txtNombre.setText(c.getNombre());
            txtApellido.setText(c.getApellido());
            txtDireccion_C.setText(c.getDireccion());
            txtEmail.setText(c.getEmail());
            txtTelefono.setText(c.getTelefono());
              txtCodigo.setText(v.getCodigo());
            txtDireccion_V.setText(v.getDireccion());
            txtEstrato.setText(v.getEstrato());
            txtBarrio.setText(v.getId_barrio());
            }
            
            
            if ( v == null ){
                 JOptionPane.showMessageDialog(null,"No Existe  vivienda");
                 
            }
            else{
           
              txtCodigo.setText(v.getCodigo());
            txtDireccion_V.setText(v.getDireccion());
            txtEstrato.setText(v.getEstrato());
            txtBarrio.setText(v.getId_barrio());}
            
            
                        
        }


    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        if (txtCedula.getText().equals("") || txtNombre.getText().equals("")   ){
             JOptionPane.showMessageDialog(null,"DIGITE CONSUMO ACTUAL  VIVIENDA");
        }
        else{
        Clientes c = new Clientes();
         /*Integer cons_capturado = Integer.parseInt(consumo_capturado.getText()); 
         Integer lect_anterior=Integer.parseInt(lectura_anterior.getText());
         Integer cons_mes = Integer.parseInt(consumo_mes.getText());*/
         
      
          String cedula=txtCedula.getText();
         
         c.setCedula(txtCedula.getText());
            c.setNombre(txtNombre.getText());
            c.setApellido(txtApellido.getText());
            c.setEmail(txtEmail.getText());
            c.setDireccion(txtDireccion_C.getText());
            c.setTelefono(txtTelefono.getText());
            String msg=crC.update(cedula,c); 
         
         /*Integer codigo = Integer.parseInt(codigo_vivienda.getText());
        c.setLectura_anterior(lect_anterior);
        c.setConsumo_mes(cons_mes);
        String msg=CLC.update(codigo,c);*/
        JOptionPane.showMessageDialog(this, msg);
        limpiarcajas();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
         if (txtCedula.getText().equals("") || txtNombre.getText().equals("")   ){
             JOptionPane.showMessageDialog(null,"DIGITE CONSUMO ACTUAL  VIVIENDA");
        }
        else{
        Clientes c = new Clientes();
         /*Integer cons_capturado = Integer.parseInt(consumo_capturado.getText()); 
         Integer lect_anterior=Integer.parseInt(lectura_anterior.getText());
         Integer cons_mes = Integer.parseInt(consumo_mes.getText());*/
         
      
          String cedula=txtCedula.getText();
           
          
         
         c.setCedula(txtCedula.getText());
         String msg=crC.delete(cedula); 
            /*c.setNombre(txtNombre.getText());
            c.setApellido(txtApellido.getText());
            c.setEmail(txtEmail.getText());
            c.setDireccion(txtDireccion_C.getText());
            c.setTelefono(txtTelefono.getText());*/
            
         /*Integer codigo = Integer.parseInt(codigo_vivienda.getText());
        c.setLectura_anterior(lect_anterior);
        c.setConsumo_mes(cons_mes);
        String msg=CLC.update(codigo,c);*/
        JOptionPane.showMessageDialog(this, msg);
        limpiarcajas();
        }           // TODO
    }//GEN-LAST:event_eliminarActionPerformed

     void Ultimo(){
      //  ultimoregistro=crV.UltimoRegistro();
       // lb_Codigo.setText(String.valueOf(ultimoregistro));
    }
    
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
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
  
        java.awt.EventQueue.invokeLater(new Runnable() {
       
            public void run() {
                new RegistrarClientes().setVisible(true);
               
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBarrio;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion_C;
    private javax.swing.JTextField txtDireccion_V;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstrato;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
