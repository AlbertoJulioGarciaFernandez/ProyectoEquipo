package proyectoenequipo;
/**
 *
 * @author Dani y Alberto (ETS)
 */
public class CadenaTexto {
    private String cadena="Proyecto";
    /**
    *un cambio desde mi equipo 
    *
    */
    private String cadena2=" ETS ";
    private String cadena3="Dani y Alberto"; 

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena2() {
        return cadena2;
    }

    public void setCadena2(String cadena2) {
        this.cadena2 = cadena2;
    }

    public String getCadena3() {
        return cadena3;
    }

    public void setCadena3(String cadena3) {
        this.cadena3 = cadena3;
    }
    
    @Override
    //metedo creado por dani
    public String toString(){
        return this.cadena+this.cadena2+this.cadena3;
    }                
    
}
