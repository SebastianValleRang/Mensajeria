package negocio;

public class Calificacion {
    
    private int k_idcalificacion;
    private int k_idservicio;
    private int q_valor;
    private String o_descripcion;
    
    public Calificacion(){
    }

    public void setK_idcalificacion(int k_idcalificacion) {
        this.k_idcalificacion = k_idcalificacion;
    }

    public void setK_idservicio(int k_idservicio) {
        this.k_idservicio = k_idservicio;
    }

    public void setQ_valor(int q_valor) {
        this.q_valor = q_valor;
    }

    public void setO_descripcion(String o_descripcion) {
        this.o_descripcion = o_descripcion;
    }

    public int getK_idcalificacion() {
        return k_idcalificacion;
    }

    public int getK_idservicio() {
        return k_idservicio;
    }

    public int getQ_valor() {
        return q_valor;
    }

    public String getO_descripcion() {
        return o_descripcion;
    }
    
    
    
}
