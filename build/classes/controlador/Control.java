package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.Caninos;
import vista.Felinos;
import vista.Inicio;

public class Control implements ActionListener {

    Inicio objI;
    Felinos objF;
    Caninos ObjC;

    public Control() {
        this.objI = new Inicio();
        this.objF = new Felinos();
        this.ObjC = new Caninos();
        objI.getBus().addActionListener(this);
        objF.getRegistrar().addActionListener(this);
        ObjC.getRegistrar().addActionListener(this);
    }

    public void iniciar() {
        objI.setTitle("inicio");
        objI.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == objF.getRegistrar()) {
            JOptionPane.showMessageDialog(objF, "nombre" + objF.getN().getText(), "mensaje", 1);
        } }
}
