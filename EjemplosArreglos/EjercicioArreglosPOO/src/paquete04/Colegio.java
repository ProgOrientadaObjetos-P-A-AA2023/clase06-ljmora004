package paquete04;

public class Colegio {
    private String nombre;
    private String ciudad;
    
    public Colegio(String n, String c){
        nombre = n;
        ciudad = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(String x) {
        ciudad = x;
    }
    
    
}
