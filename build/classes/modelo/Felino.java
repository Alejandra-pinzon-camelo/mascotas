
package modelo;

public class Felino extends Mascota{
    private String  toxoplasmosis;

    public Felino() {
         this.toxoplasmosis = null;
    }

    public Felino(String toxoplasmosis, String nombre, String raza, String color, int edad) {
        super(nombre, raza, color, edad);
        this.toxoplasmosis = toxoplasmosis;
    }

    public String getToxoplasmosis() {
        return toxoplasmosis;
    }

    public void setToxoplasmosis(String toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }
     public String getDatos(){
        return  "Nombre: " + getNombre()
                + "\n Raza: " + getRaza()
                + "\n Color: " + getColor()
                + "\n Edad: " + getEdad()
                + "\n libres de toxoplasmosis: " + getToxoplasmosis();
              
         
     }

     
    
}
