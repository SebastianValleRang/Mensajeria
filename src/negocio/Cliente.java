package negocio;

public class Cliente {

    private String k_tipoidentidad;
    private int k_identificacion;
    private String n_nombres;
    private String n_apellidos;
    private int o_telefono;
    private String o_correo;
    private String o_contraseña;

    public Cliente() {
    }

    public void setK_tipoidentidad(String k_tipoidentidad) {
        this.k_tipoidentidad = k_tipoidentidad;
    }

    public void setK_identificacion(int k_identificacion) {
        this.k_identificacion = k_identificacion;
    }

    public void setN_nombres(String n_nombres) {
        this.n_nombres = n_nombres;
    }

    public void setN_apellidos(String n_apellidos) {
        this.n_apellidos = n_apellidos;
    }

    public void setO_telefono(int o_telefono) {
        this.o_telefono = o_telefono;
    }

    public void setO_correo(String o_correo) {
        this.o_correo = o_correo;
    }

    public void setO_contraseña(String o_contraseña) {
        this.o_contraseña = o_contraseña;
    }

    public String getK_tipoidentidad() {
        return k_tipoidentidad;
    }

    public int getK_identificacion() {
        return k_identificacion;
    }

    public String getN_nombres() {
        return n_nombres;
    }

    public String getN_apellidos() {
        return n_apellidos;
    }

    public int getO_telefono() {
        return o_telefono;
    }

    public String getO_correo() {
        return o_correo;
    }

    public String getO_contraseña() {
        return o_contraseña;
    }

}
