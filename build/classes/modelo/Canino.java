
package modelo;


public class Canino extends Mascota{
    private int nivel;

    public Canino() {
        this.nivel = 0;
    }

    public Canino(int nivel, String nombre, String raza, String color, int edad) {
        super(nombre, raza, color, edad);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

   
     public String getDatos(){
        return  "Nombre: " + getNombre()
                + "\n Raza: " + getRaza()
                + "\n Color: " + getColor()
                + "\n Edad: " + getEdad()
                + "\n Nivel de Educacion: " + getNivel();
              
         
     }

   
}
