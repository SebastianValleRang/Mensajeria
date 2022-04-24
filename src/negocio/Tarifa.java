package negocio;

public class Tarifa {
    
    private int k_codigo;
    private String i_tipopaquete;
    private int v_tarifapaquete;

    public Tarifa() {
    }
    
    public void setK_codigo(int k_codigo) {
        this.k_codigo = k_codigo;
    }

    public void setI_tipopaquete(String i_tipopaquete) {
        this.i_tipopaquete = i_tipopaquete;
    }

    public void setV_tarifapaquete(int v_tarifapaquete) {
        this.v_tarifapaquete = v_tarifapaquete;
    }

    public int getK_codigo() {
        return k_codigo;
    }

    public String getI_tipopaquete() {
        return i_tipopaquete;
    }

    public int getV_tarifapaquete() {
        return v_tarifapaquete;
    }
    
    
    
}
