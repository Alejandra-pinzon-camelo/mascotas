/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Canino;

/**
 *
 * @author aleja
 */
public class Caninos extends javax.swing.JFrame {

    private ArrayList<modelo.Canino> listaCaninos;

    public Caninos() {
        initComponents();
        listaCaninos = new ArrayList<>();
        this.setLocationRelativeTo(null);
    }

    public void listar() {
        int cont1 = 0;
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < listaCaninos.size(); i++) {
            cont1++;
            modelo.addElement(cont1 + ". " + listaCaninos.get(i).getNombre() + ", " + listaCaninos.get(i).getRaza());
             String mensa = "";
            mensa = mensa + cont1;
            mensaje.setText(mensa);
        }
        lstInformacion.setModel(modelo);

    }

    public void limpiarLista() {
        DefaultListModel model = (DefaultListModel) lstInformacion.getModel();
        model.clear();
    }
    public double limpiarPromedio(){
      double  Promedio =0;
        return 0;
    }

    public boolean eliminarDato(String nombre) {

        boolean encontrado = false;
        for (int i = 0; i < listaCaninos.size(); i++) {
            if (listaCaninos.get(i).getNombre().equals(nombre)) {
                encontrado = true;
                listaCaninos.remove(i);
                limpiarLista();
                limpiarPromedio();
                listar();
                promedioEdad();
            }

        }
        return encontrado;

    }

    public void limpiar() {
        nom.setText(null);
        ra.setText(null);
        co.setText(null);
        ed.setText(null);
        nivelEdu.setSelectedIndex(0);
        lstInformacion.clearSelection();
        nom.requestFocus();

    }
    public double promedioEdad(){
       double promedio=0;
       int suma=0;
       for (int i = 0; i < listaCaninos.size(); i++) {
        suma=suma+listaCaninos.get(i).getEdad();
      promedio=suma/listaCaninos.size();
           
       }
        String mensa = "";
            mensa = mensa + promedio;
            jLabel10.setText(mensa);
        return promedio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        co = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ed = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        mostrar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstInformacion = new javax.swing.JList();
        nivelEdu = new javax.swing.JComboBox();
        salir = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/ca.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registra un perrito");

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");

        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Raza:");

        ra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Color:");

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Edad:");

        ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("nivel de entrenaniento");

        mostrar.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        mostrar.setText("Mostrar datos");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        eliminar.setText("Eliminar registro");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstInformacion);

        nivelEdu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-SELECCIONAR-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        salir.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        registrar.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        registrar.setText("Agregar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cantidad de perros registrados:");

        mensaje.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Promedio edad: ");

        jLabel10.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(17, 17, 17)))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nom, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(ra)
                                    .addComponent(co)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nivelEdu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(registrar)
                                .addGap(18, 18, 18)
                                .addComponent(mostrar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(eliminar)
                                .addGap(18, 18, 18)
                                .addComponent(salir))
                            .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(206, 206, 206))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(co, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(nivelEdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mostrar)
                            .addComponent(eliminar)
                            .addComponent(registrar)
                            .addComponent(salir))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void raActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raActionPerformed

    private void edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        int mos = lstInformacion.getSelectedIndex();
        if (mos == -1) {

            JOptionPane.showMessageDialog(null, "Seleccionar un elemento de la lista ", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, listaCaninos.get(mos).getDatos(), "Mostrar", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_mostrarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        String nombre = JOptionPane.showInputDialog("Digite el nombre que desea eliminar ");
        if (eliminarDato(nombre)) {
            JOptionPane.showMessageDialog(null, "Dato eliminado ");
        }

    }//GEN-LAST:event_eliminarActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        modelo.Canino cani = new modelo.Canino();
        String nivel, nombre, raza, color, edad;
        int eda = 0, nive = 0;
        nombre = nom.getText();
        raza = ra.getText();
        color = co.getText();
        edad = ed.getText();
        nivel = nivelEdu.getSelectedItem().toString();
        try {
            nive = Integer.parseInt(nivel);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "el dato debe ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
        }

        try {
            eda = Integer.parseInt(edad);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "el dato debe ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
        }

        try {
            eda = Integer.parseInt(edad);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "el dato debe ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
        }
        cani.setNombre(nombre);
        cani.setRaza(raza);
        cani.setColor(color);
        cani.setEdad(eda);
        cani.setNivel(nive);

        listaCaninos.add(cani);
        listar();
        promedioEdad();
        JOptionPane.showMessageDialog(null, "se agrego correctamente ", "AGREGAR", JOptionPane.INFORMATION_MESSAGE);
        limpiar();

    }//GEN-LAST:event_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField co;
    private javax.swing.JTextField ed;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstInformacion;
    private javax.swing.JLabel mensaje;
    private javax.swing.JButton mostrar;
    private javax.swing.JComboBox nivelEdu;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField ra;
    private javax.swing.JButton registrar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

    public ArrayList<modelo.Canino> getListaCaninos() {
        return listaCaninos;
    }

    public void setListaCaninos(ArrayList<modelo.Canino> listaCaninos) {
        this.listaCaninos = listaCaninos;
    }

    public javax.swing.JTextField getCo() {
        return co;
    }

    public void setCo(javax.swing.JTextField co) {
        this.co = co;
    }

    public javax.swing.JTextField getEd() {
        return ed;
    }

    public void setEd(javax.swing.JTextField ed) {
        this.ed = ed;
    }

    public javax.swing.JButton getEliminar() {
        return eliminar;
    }

    public void setEliminar(javax.swing.JButton eliminar) {
        this.eliminar = eliminar;
    }

    
   

    public javax.swing.JList getLstInformacion() {
        return lstInformacion;
    }

    public void setLstInformacion(javax.swing.JList lstInformacion) {
        this.lstInformacion = lstInformacion;
    }

    public javax.swing.JButton getMostrar() {
        return mostrar;
    }

    public void setMostrar(javax.swing.JButton mostrar) {
        this.mostrar = mostrar;
    }

    public javax.swing.JComboBox getNivelEdu() {
        return nivelEdu;
    }

    public void setNivelEdu(javax.swing.JComboBox nivelEdu) {
        this.nivelEdu = nivelEdu;
    }

    public javax.swing.JTextField getNom() {
        return nom;
    }

    public void setNom(javax.swing.JTextField nom) {
        this.nom = nom;
    }

    public javax.swing.JTextField getRa() {
        return ra;
    }

    public void setRa(javax.swing.JTextField ra) {
        this.ra = ra;
    }

    public javax.swing.JButton getRegistrar() {
        return registrar;
    }

    public void setRegistrar(javax.swing.JButton registrar) {
        this.registrar = registrar;
    }

    public javax.swing.JButton getSalir() {
        return salir;
    }

    public void setSalir(javax.swing.JButton salir) {
        this.salir = salir;
    }
}
