/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Felino;

/**
 *
 * @author aleja
 */
public class Felinos extends javax.swing.JFrame {

    private ArrayList<modelo.Felino> listaFelinos;

    public Felinos() {
        initComponents();
        listaFelinos = new ArrayList<>();
        this.setLocationRelativeTo(null);
    }

    public void listar() {
        int cont = 0;
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < listaFelinos.size(); i++) {
            cont++;
            modelo.addElement(cont + ". " + listaFelinos.get(i).getNombre() + ", " + listaFelinos.get(i).getRaza());
            String mensa = "";
            mensa = mensa + cont;
            mensaje.setText(mensa);
        }
        lstInformacion.setModel(modelo);

    }

    public void limpiarLista() {
        DefaultListModel model = (DefaultListModel) lstInformacion.getModel();
        model.clear();
    }

    public void limpiar() {
        n.setText(null);
        r.setText(null);
        c.setText(null);
        e.setText(null);
        grupo1.clearSelection();
        lstInformacion.clearSelection();
        n.requestFocus();

    }

    public boolean eliminarDato(String nombre) {

        boolean encontrado = false;
        for (int i = 0; i < listaFelinos.size(); i++) {
            if (listaFelinos.get(i).getNombre().equals(nombre)) {
                encontrado = true;
                listaFelinos.remove(i);
                limpiarLista();
                limpiarPromedio();
                listar();
                promedioEdad();

            }

        }
        return encontrado;
    }

    public double limpiarPromedio() {
        double Promedio = 0;
        return 0;

    }

    public double promedioEdad() {
        double promedio = 0;
        int suma = 0;
        for (int i = 0; i < listaFelinos.size(); i++) {
            suma = suma + listaFelinos.get(i).getEdad();
            promedio = suma / listaFelinos.size();

        }
        String mensa = "";
        mensa = mensa + promedio;
        mensaje2.setText(mensa);
        return promedio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        r = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        c = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        e = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        no = new javax.swing.JRadioButton();
        si = new javax.swing.JRadioButton();
        registrar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstInformacion = new javax.swing.JList();
        eliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mensaje2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        panel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/g2.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registra un gatico");

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Raza:");

        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Color:");

        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Edad:");

        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Se encuentran libres de toxoplasmosis");

        no.setBackground(new java.awt.Color(0, 0, 0));
        grupo1.add(no);
        no.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        no.setForeground(new java.awt.Color(255, 255, 255));
        no.setText("no");

        si.setBackground(new java.awt.Color(0, 0, 0));
        grupo1.add(si);
        si.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        si.setForeground(new java.awt.Color(255, 255, 255));
        si.setText("si");
        si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siActionPerformed(evt);
            }
        });

        registrar.setBackground(new java.awt.Color(255, 255, 255));
        registrar.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        registrar.setText("Agregar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        mostrar.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        mostrar.setText("Mostrar datos");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstInformacion);

        eliminar.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        eliminar.setText("Eliminar registro");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("cantidad de gatos registrados:");

        mensaje.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Promedio de edad: ");

        mensaje2.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        mensaje2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(si)
                        .addGap(10, 10, 10)
                        .addComponent(no))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registrar)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(c, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                        .addComponent(n, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(r, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(mostrar)
                                .addGap(18, 18, 18)
                                .addComponent(eliminar))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(mensaje2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(9, 9, 9)
                .addComponent(salir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(jLabel4))
                .addGap(267, 267, 267))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(no)
                            .addComponent(si))
                        .addGap(22, 22, 22)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registrar)
                            .addComponent(mostrar)
                            .addComponent(eliminar)
                            .addComponent(salir))
                        .addGap(29, 29, 29)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(mensaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        modelo.Felino feli = new modelo.Felino();
        String toxoplasmosis, nombre, raza, color, edad;
        int ed = 0;
        nombre = n.getText();
        raza = r.getText();
        color = c.getText();
        edad = e.getText();

        try {
            ed = Integer.parseInt(edad);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "el dato debe ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (si.isSelected()) {
            toxoplasmosis = "si";
        } else {
            toxoplasmosis = "no";
        }

        try {
            ed = Integer.parseInt(edad);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "el dato debe ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
        }
        feli.setNombre(nombre);
        feli.setRaza(raza);
        feli.setColor(color);
        feli.setEdad(ed);
        feli.setToxoplasmosis(toxoplasmosis);
        listaFelinos.add(feli);
        listar();
        promedioEdad();
        JOptionPane.showMessageDialog(null, "se agrego correctamente ", "AGREGAR", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
    }//GEN-LAST:event_registrarActionPerformed

    private void siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eActionPerformed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        int mos = lstInformacion.getSelectedIndex();
        if (mos == -1) {

            JOptionPane.showMessageDialog(null, "Seleccionar un elemento de la lista ", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, listaFelinos.get(mos).getDatos(), "Mostrar", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_mostrarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        String nombre = JOptionPane.showInputDialog("Digite el nombre que desea eliminar ");
        if (eliminarDato(nombre)) {
            JOptionPane.showMessageDialog(null, "Dato eliminado ");
        }

    }//GEN-LAST:event_eliminarActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c;
    private javax.swing.JTextField e;
    private javax.swing.JButton eliminar;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel mensaje2;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField n;
    private javax.swing.JRadioButton no;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField r;
    private javax.swing.JButton registrar;
    private javax.swing.JButton salir;
    private javax.swing.JRadioButton si;
    // End of variables declaration//GEN-END:variables

    public ArrayList<modelo.Felino> getListaFelinos() {
        return listaFelinos;
    }

    public void setListaFelinos(ArrayList<modelo.Felino> listaFelinos) {
        this.listaFelinos = listaFelinos;
    }

    public javax.swing.JTextField getC() {
        return c;
    }

    public void setC(javax.swing.JTextField c) {
        this.c = c;
    }

    public javax.swing.JTextField getE() {
        return e;
    }

    public void setE(javax.swing.JTextField e) {
        this.e = e;
    }

    public javax.swing.ButtonGroup getGrupo1() {
        return grupo1;
    }

    public void setGrupo1(javax.swing.ButtonGroup grupo1) {
        this.grupo1 = grupo1;
    }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public javax.swing.JTextField getN() {
        return n;
    }

    public void setN(javax.swing.JTextField n) {
        this.n = n;
    }

    public javax.swing.JRadioButton getNo() {
        return no;
    }

    public void setNo(javax.swing.JRadioButton no) {
        this.no = no;
    }

    public javax.swing.JPanel getPanel() {
        return panel;
    }

    public void setPanel(javax.swing.JPanel panel) {
        this.panel = panel;
    }

    public javax.swing.JTextField getR() {
        return r;
    }

    public void setR(javax.swing.JTextField r) {
        this.r = r;
    }

    public javax.swing.JButton getRegistrar() {
        return registrar;
    }

    public void setRegistrar(javax.swing.JButton registrar) {
        this.registrar = registrar;
    }

    public javax.swing.JRadioButton getSi() {
        return si;
    }

    public void setSi(javax.swing.JRadioButton si) {
        this.si = si;
    }

    public Object getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public javax.swing.JButton getMostrar() {
        return mostrar;
    }

    public void setMostrar(javax.swing.JButton mostrar) {
        this.mostrar = mostrar;
    }

    public javax.swing.JButton getSalir() {
        return salir;
    }

    public void setSalir(javax.swing.JButton salir) {
        this.salir = salir;
    }

    private void actalizarLista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
