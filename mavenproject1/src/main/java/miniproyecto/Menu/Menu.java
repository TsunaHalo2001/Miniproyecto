/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miniproyecto.Menu;

public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg_1 = new javax.swing.JPanel();
        Panel_lista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista_Soldados = new javax.swing.JList<>();
        Lista_lateral = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Panel_Datos = new javax.swing.JPanel();
        Boton_Crear = new javax.swing.JButton();
        Boton_Actualizar = new javax.swing.JButton();
        Img_Menu = new javax.swing.JLabel();
        Bienvenida = new javax.swing.JLabel();
        Resetear = new javax.swing.JButton();
        Boton_Visualizar1 = new javax.swing.JButton();
        Panel_Titulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bg_1.setBackground(new java.awt.Color(51, 51, 51));
        Bg_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_lista.setBackground(new java.awt.Color(102, 102, 102));

        Lista_Soldados.setBackground(new java.awt.Color(204, 204, 204));
        Lista_Soldados.setBorder(null);
        Lista_Soldados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(Lista_Soldados);

        Lista_lateral.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lista_lateral.setForeground(new java.awt.Color(255, 255, 255));
        Lista_lateral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lista_lateral.setText("Lista");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Eliminar");

        javax.swing.GroupLayout Panel_listaLayout = new javax.swing.GroupLayout(Panel_lista);
        Panel_lista.setLayout(Panel_listaLayout);
        Panel_listaLayout.setHorizontalGroup(
            Panel_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_listaLayout.createSequentialGroup()
                .addGroup(Panel_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_listaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(Panel_listaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Lista_lateral, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Panel_listaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_listaLayout.setVerticalGroup(
            Panel_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_listaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Lista_lateral, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        Bg_1.add(Panel_lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 500));

        Panel_Datos.setBackground(new java.awt.Color(204, 204, 204));

        Boton_Crear.setBackground(new java.awt.Color(51, 51, 51));
        Boton_Crear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton_Crear.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Crear.setText("Crear");
        Boton_Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_CrearMouseClicked(evt);
            }
        });
        Boton_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CrearActionPerformed(evt);
            }
        });

        Boton_Actualizar.setBackground(new java.awt.Color(51, 51, 51));
        Boton_Actualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton_Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Actualizar.setText("Actualizar");
        Boton_Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_ActualizarMouseClicked(evt);
            }
        });
        Boton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ActualizarActionPerformed(evt);
            }
        });

        Img_Menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Img_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproyecto/Img/puede servir 2.jpg"))); // NOI18N

        Bienvenida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(0, 0, 0));
        Bienvenida.setText("Bienvenido al sistema de gestion militar");

        Resetear.setBackground(new java.awt.Color(51, 51, 51));
        Resetear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Resetear.setForeground(new java.awt.Color(255, 255, 255));
        Resetear.setText("Resetear");
        Resetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetearActionPerformed(evt);
            }
        });

        Boton_Visualizar1.setBackground(new java.awt.Color(51, 51, 51));
        Boton_Visualizar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton_Visualizar1.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Visualizar1.setText("Realizar Accion");
        Boton_Visualizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_Visualizar1MouseClicked(evt);
            }
        });
        Boton_Visualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Visualizar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_DatosLayout = new javax.swing.GroupLayout(Panel_Datos);
        Panel_Datos.setLayout(Panel_DatosLayout);
        Panel_DatosLayout.setHorizontalGroup(
            Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DatosLayout.createSequentialGroup()
                .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_DatosLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Resetear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel_DatosLayout.createSequentialGroup()
                                .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Boton_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton_Visualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(Img_Menu))))
                    .addGroup(Panel_DatosLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        Panel_DatosLayout.setVerticalGroup(
            Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DatosLayout.createSequentialGroup()
                .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_DatosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(Boton_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Boton_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Boton_Visualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_DatosLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(Img_Menu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(Resetear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        Bg_1.add(Panel_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 510, 410));

        Panel_Titulo.setBackground(new java.awt.Color(204, 204, 204));

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Sistema de gestion militar ");
        Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Panel_TituloLayout = new javax.swing.GroupLayout(Panel_Titulo);
        Panel_Titulo.setLayout(Panel_TituloLayout);
        Panel_TituloLayout.setHorizontalGroup(
            Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TituloLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        Panel_TituloLayout.setVerticalGroup(
            Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TituloLayout.createSequentialGroup()
                .addComponent(Titulo)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        Bg_1.add(Panel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 490, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg_1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void Boton_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CrearActionPerformed
        
    }//GEN-LAST:event_Boton_CrearActionPerformed

    private void Boton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ActualizarActionPerformed
       
    }//GEN-LAST:event_Boton_ActualizarActionPerformed

    private void ResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetearActionPerformed

    }//GEN-LAST:event_ResetearActionPerformed

    private void Boton_CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_CrearMouseClicked
        Crear Cr = new Crear();
        Cr.setVisible(true);
        dispose();
    }//GEN-LAST:event_Boton_CrearMouseClicked

    private void Boton_Visualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Visualizar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_Visualizar1ActionPerformed

    private void Boton_ActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_ActualizarMouseClicked
        Actualizar Act = new Actualizar();
        Act.setVisible(true);
        dispose();
    }//GEN-LAST:event_Boton_ActualizarMouseClicked

    private void Boton_Visualizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Visualizar1MouseClicked
        Realizar_Accion Realizar = new Realizar_Accion();
        Realizar.setVisible(true);
        dispose();
    }//GEN-LAST:event_Boton_Visualizar1MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg_1;
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JButton Boton_Actualizar;
    private javax.swing.JButton Boton_Crear;
    private javax.swing.JButton Boton_Visualizar1;
    private javax.swing.JLabel Img_Menu;
    private javax.swing.JList<String> Lista_Soldados;
    private javax.swing.JLabel Lista_lateral;
    private javax.swing.JPanel Panel_Datos;
    private javax.swing.JPanel Panel_Titulo;
    private javax.swing.JPanel Panel_lista;
    private javax.swing.JButton Resetear;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
