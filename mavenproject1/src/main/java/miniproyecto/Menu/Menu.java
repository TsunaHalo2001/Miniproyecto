/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miniproyecto.Menu;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionEvent;

import miniproyecto.Soldados.Soldado;
import miniproyecto.Soldados.SoldadoRaso;
import miniproyecto.Soldados.Teniente;
import miniproyecto.Soldados.Coronel;
import miniproyecto.Soldados.Capitan;
import miniproyecto.app.Modelo;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        modelo.leerLista(Lista_Soldados);
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
        Resetear = new javax.swing.JButton();
        Panel_Datos = new javax.swing.JPanel();
        Boton_Crear = new javax.swing.JButton();
        Boton_Actualizar = new javax.swing.JButton();
        Bienvenida = new javax.swing.JLabel();
        Boton_Visualizar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Panel_Titulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bg_1.setBackground(new java.awt.Color(133, 159, 61));
        Bg_1.setPreferredSize(new java.awt.Dimension(800, 500));
        Bg_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_lista.setBackground(new java.awt.Color(26, 26, 25));

        Lista_Soldados.setBackground(new java.awt.Color(49, 81, 30));
        Lista_Soldados.setBorder(null);
        Lista_Soldados.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Lista_Soldados.setForeground(new java.awt.Color(0, 0, 0));
        Lista_Soldados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "a", "b" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Lista_Soldados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Lista_Soldados.setToolTipText("");
        Lista_Soldados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lista_Soldados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                Lista_SoldadosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Lista_Soldados);

        Lista_lateral.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lista_lateral.setForeground(new java.awt.Color(255, 255, 255));
        Lista_lateral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lista_lateral.setText("Lista");

        jButton1.setBackground(new java.awt.Color(15, 15, 15));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Eliminar");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Resetear.setBackground(new java.awt.Color(26, 26, 25));
        Resetear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Resetear.setForeground(new java.awt.Color(255, 255, 255));
        Resetear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproyecto/Img/Re.png"))); // NOI18N
        Resetear.setBorder(null);
        Resetear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetearMouseClicked(evt);
            }
        });
        Resetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetearActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Resetear)
                .addGap(22, 22, 22))
        );
        Panel_listaLayout.setVerticalGroup(
            Panel_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_listaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Lista_lateral, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resetear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        Bg_1.add(Panel_lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 500));

        Panel_Datos.setBackground(new java.awt.Color(49, 81, 30));

        Boton_Crear.setBackground(new java.awt.Color(15, 15, 15));
        Boton_Crear.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Boton_Crear.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Crear.setText("Crear");
        Boton_Crear.setBorder(null);
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

        Boton_Actualizar.setBackground(new java.awt.Color(15, 15, 15));
        Boton_Actualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Boton_Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Actualizar.setText("Actualizar");
        Boton_Actualizar.setBorder(null);
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

        Bienvenida.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(0, 0, 0));
        Bienvenida.setText("Bienvenido al sistema de gestion militar");

        Boton_Visualizar1.setBackground(new java.awt.Color(15, 15, 15));
        Boton_Visualizar1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Boton_Visualizar1.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Visualizar1.setText("Realizar Accion");
        Boton_Visualizar1.setBorder(null);
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproyecto/Img/1.jpg"))); // NOI18N

        javax.swing.GroupLayout Panel_DatosLayout = new javax.swing.GroupLayout(Panel_Datos);
        Panel_Datos.setLayout(Panel_DatosLayout);
        Panel_DatosLayout.setHorizontalGroup(
            Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DatosLayout.createSequentialGroup()
                .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_DatosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Boton_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(Boton_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(Boton_Visualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_DatosLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_DatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(128, 128, 128))
        );
        Panel_DatosLayout.setVerticalGroup(
            Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Visualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(74, 74, 74))
        );

        Bg_1.add(Panel_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 510, 410));

        Panel_Titulo.setBackground(new java.awt.Color(49, 81, 30));

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
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
            .addComponent(Bg_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if (Lista_Soldados.getSelectedIndex() != -1) {
            Actualizar Act = new Actualizar();
            modelo.index = Lista_Soldados.getSelectedIndex();
            Act.setVisible(true);

            dispose();
        }
    }//GEN-LAST:event_Boton_ActualizarMouseClicked

    private void Boton_Visualizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Visualizar1MouseClicked
        Realizar_Accion Realizar = new Realizar_Accion();

        Realizar.setVisible(true);
        dispose();
    }//GEN-LAST:event_Boton_Visualizar1MouseClicked

    private void ResetearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetearMouseClicked
        // TODO add your handling code here:
        modelo.resetearLista(Lista_Soldados);
    }//GEN-LAST:event_ResetearMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        modelo.eliminardeLista(Lista_Soldados);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void Lista_SoldadosValueChanged(javax.swing.event.ListSelectionEvent evt) {                                    
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg_1;
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JButton Boton_Actualizar;
    private javax.swing.JButton Boton_Crear;
    private javax.swing.JButton Boton_Visualizar1;
    private javax.swing.JList<String> Lista_Soldados;
    private javax.swing.JLabel Lista_lateral;
    private javax.swing.JPanel Panel_Datos;
    private javax.swing.JPanel Panel_Titulo;
    private javax.swing.JPanel Panel_lista;
    private javax.swing.JButton Resetear;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
