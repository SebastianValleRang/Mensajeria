package negocio;

public class Indicacion {
    
    private int k_iddireccion;
    private int k_idservicio;
    private String o_direccion;
    private String o_observaciones;
    
    public Indicacion(){
    }

    public void setK_iddireccion(int k_iddireccion) {
        this.k_iddireccion = k_iddireccion;
    }

    public void setK_idservicio(int k_idservicio) {
        this.k_idservicio = k_idservicio;
    }

    public void setO_direccion(String o_direccion) {
        this.o_direccion = o_direccion;
    }

    public void setO_observaciones(String o_observaciones) {
        this.o_observaciones = o_observaciones;
    }

    public int getK_iddireccion() {
        return k_iddireccion;
    }

    public int getK_idservicio() {
        return k_idservicio;
    }

    public String getO_direccion() {
        return o_direccion;
    }

    public String getO_observaciones() {
        return o_observaciones;
    }
    
    
}
