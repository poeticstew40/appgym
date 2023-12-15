package com.appgym.igu;

import com.appgym.logica.Controladora;


public class Inscripcion extends javax.swing.JFrame {

    Controladora control = new Controladora();
    
    public Inscripcion() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        DNI = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DNIText = new javax.swing.JTextField();
        NombreText = new javax.swing.JTextField();
        ApellidoText = new javax.swing.JTextField();
        EmailText = new javax.swing.JTextField();
        TelefonoText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Fondo.setMinimumSize(new java.awt.Dimension(400, 400));
        Fondo.setPreferredSize(new java.awt.Dimension(400, 400));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 235, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 400));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoInscripcion.png"))); // NOI18N

        DNI.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        DNI.setForeground(new java.awt.Color(0, 0, 0));
        DNI.setText("DNI");

        Nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.setText("Nombre");

        Apellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Apellido.setForeground(new java.awt.Color(0, 0, 0));
        Apellido.setText("Apellido");

        Email.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Email.setForeground(new java.awt.Color(0, 0, 0));
        Email.setText("Email");

        Telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Telefono.setForeground(new java.awt.Color(0, 0, 0));
        Telefono.setText("Telefono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre)
                            .addComponent(DNI)
                            .addComponent(Apellido)
                            .addComponent(Email)
                            .addComponent(Telefono))))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        jPanel2.setBackground(new java.awt.Color(255, 235, 0));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Inscripcion Nuevo Miembro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 100));

        DNIText.setBackground(new java.awt.Color(255, 255, 255));
        DNIText.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        DNIText.setText("Ingrese el DNI");
        DNIText.setBorder(null);
        DNIText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNITextActionPerformed(evt);
            }
        });
        Fondo.add(DNIText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 190, -1));

        NombreText.setBackground(new java.awt.Color(255, 255, 255));
        NombreText.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        NombreText.setText("Ingrese el nombre");
        NombreText.setBorder(null);
        Fondo.add(NombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 190, -1));

        ApellidoText.setBackground(new java.awt.Color(255, 255, 255));
        ApellidoText.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ApellidoText.setText("Ingrese el apellido");
        ApellidoText.setBorder(null);
        Fondo.add(ApellidoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 190, -1));

        EmailText.setBackground(new java.awt.Color(255, 255, 255));
        EmailText.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EmailText.setText("Ingrese el email");
        EmailText.setBorder(null);
        Fondo.add(EmailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 190, -1));

        TelefonoText.setBackground(new java.awt.Color(255, 255, 255));
        TelefonoText.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TelefonoText.setText("Ingrese el telefono");
        TelefonoText.setBorder(null);
        Fondo.add(TelefonoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 190, -1));
        Fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 190, 10));
        Fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 190, 10));
        Fondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 190, 10));
        Fondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 190, 10));
        Fondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 190, 10));
        Fondo.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 190, 10));

        btnLimpiar.setBackground(new java.awt.Color(51, 51, 51));
        btnLimpiar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 235, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        Fondo.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 80, 30));

        btnAgregar.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 235, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        Fondo.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DNITextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNITextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DNITextActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    
     DNIText.setText("");
     NombreText.setText("");
     ApellidoText.setText("");
     EmailText.setText("");
     TelefonoText.setText("");
     
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        int dni = Integer.parseInt(DNIText.getText());
        String nombre = NombreText.getText();
        String apellido = ApellidoText.getText();
        String email = EmailText.getText();
        int telefono = Integer.parseInt(TelefonoText.getText());
        
        control.agregarPersona(dni, nombre, apellido, email, telefono);
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JTextField ApellidoText;
    private javax.swing.JLabel DNI;
    private javax.swing.JTextField DNIText;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailText;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField NombreText;
    private javax.swing.JLabel Telefono;
    private javax.swing.JTextField TelefonoText;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
