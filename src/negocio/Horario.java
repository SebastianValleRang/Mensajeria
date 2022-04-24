package negocio;

public class Horario {
    
    private int k_codigo;
    private String i_dia;
    private String o_horainicial;
    private String o_horafinal;
    private String k_tipoidentidadmensa;
    private int k_identidadmensa;
    
    public Horario(){
    }

    public void setK_codigo(int k_codigo) {
        this.k_codigo = k_codigo;
    }

    public void setI_dia(String i_dia) {
        this.i_dia = i_dia;
    }

    public void setO_horainicial(String o_horainicial) {
        this.o_horainicial = o_horainicial;
    }

    public void setO_horafinal(String o_horafinal) {
        this.o_horafinal = o_horafinal;
    }

    public void setK_tipoidentidadmensa(String k_tipoidentidadmensa) {
        this.k_tipoidentidadmensa = k_tipoidentidadmensa;
    }

    public void setK_identidadmensa(int k_identidadmensa) {
        this.k_identidadmensa = k_identidadmensa;
    }

    public int getK_codigo() {
        return k_codigo;
    }

    public String getI_dia() {
        return i_dia;
    }

    public String getO_horainicial() {
        return o_horainicial;
    }

    public String getO_horafinal() {
        return o_horafinal;
    }

    public String getK_tipoidentidadmensa() {
        return k_tipoidentidadmensa;
    }

    public int getK_identidadmensa() {
        return k_identidadmensa;
    }
    
}
