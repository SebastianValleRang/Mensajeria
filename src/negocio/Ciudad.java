package negocio;

public class Ciudad {
    
    private int k_codigopostal;
    private String n_nombre;
    private int t_comision;
    
    public Ciudad(){
    }

    public void setK_codigopostal(int k_codigopostal) {
        this.k_codigopostal = k_codigopostal;
    }

    public void setN_nombre(String n_nombre) {
        this.n_nombre = n_nombre;
    }

    public void setT_comision(int t_comision) {
        this.t_comision = t_comision;
    }

    public int getK_codigopostal() {
        return k_codigopostal;
    }

    public String getN_nombre() {
        return n_nombre;
    }

    public int getT_comision() {
        return t_comision;
    }
    
}
