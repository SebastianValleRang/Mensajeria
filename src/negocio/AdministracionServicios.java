package negocio;

import datos.MensajeriaDAO;
import java.util.ArrayList;
import util.RHException;

public class AdministracionServicios {
    
    private MensajeriaDAO mensajeriaDAO;
    private Cliente cliente;
    private Servicio servicio;
    private Indicacion indicacion;
    private Mensajero mensajero;
    private Horario horario;
    private Calificacion calificacion;
    
    public AdministracionServicios(){
        
        mensajeriaDAO = new MensajeriaDAO();
    
    }
    
    public void añadirCliente(String k_tipoidentidad, int k_identificacion, String n_nombres, String n_apellidos, int o_telefono, String o_correo, String o_contraseña) throws RHException {
      
      cliente = new Cliente();
      
      cliente.setK_tipoidentidad(k_tipoidentidad);
      cliente.setK_identificacion(k_identificacion);
      cliente.setN_nombres(n_nombres);
      cliente.setN_apellidos(n_apellidos);
      cliente.setO_telefono(o_telefono);
      cliente.setO_correo(o_correo);
      cliente.setO_contraseña(o_contraseña);
      
      mensajeriaDAO.añadirCliente(cliente);
      
    }
    
    public void añadirServicio(int K_idservicio, String I_tipopaquete, String I_estado,int Q_costo, String F_iniciohora, String O_idavuelta, int K_codigopostal, String K_tipoidentidad, int K_identificacion, String K_tipoidentidadmensa, int K_identidadmensa) throws RHException {
      
      servicio = new Servicio();
      
      servicio.setK_idservicio(K_idservicio);
      servicio.setI_tipopaquete(I_tipopaquete);
      servicio.setI_estado(I_estado);
      servicio.setQ_costo(Q_costo);
      servicio.setF_iniciohora(F_iniciohora);
      servicio.setO_idavuelta(O_idavuelta);
      servicio.setK_codigopostal(K_codigopostal);
      servicio.setK_tipoidentidad(K_tipoidentidad);
      servicio.setK_identificacion(K_identificacion);
      servicio.setK_tipoidentidadmensa(K_tipoidentidadmensa);
      servicio.setK_identidadmensa(K_identidadmensa);

      mensajeriaDAO.añadirServicio(servicio);
      
    }
    
    public void añadirDireccion(int K_idservicio, String O_direccion, String O_observaciones) throws RHException {
      
      indicacion = new Indicacion();
      
      indicacion.setK_idservicio(K_idservicio);
      indicacion.setO_direccion(O_direccion);
      indicacion.setO_observaciones(O_observaciones);
      
      mensajeriaDAO.añadirDireccion(indicacion);
      
    }
    
    public void añadirMensajero(String k_tipoidentidadmensa, int k_identidadmensa, String f_nacimiento, String n_nombres, String n_apellidos, String o_nacionalidad, String i_sexo, int o_telefono, String o_correo, String o_ciudad, String o_direccion, String o_contraseña, int o_codsegsocial, String i_tiposervicio, String i_mediotrans) throws RHException {
      
      mensajero = new Mensajero();
      
      mensajero.setK_tipoidentidadmensa(k_tipoidentidadmensa);
      mensajero.setK_identidadmensa(k_identidadmensa);
      mensajero.setF_nacimiento(f_nacimiento);
      mensajero.setN_nombres(n_nombres);
      mensajero.setN_apellidos(n_apellidos);
      mensajero.setO_nacionalidad(o_nacionalidad);
      mensajero.setI_sexo(i_sexo);
      mensajero.setO_telefono(o_telefono);
      mensajero.setO_correo(o_correo);
      mensajero.setO_ciudad(o_ciudad);
      mensajero.setO_direccion(o_direccion);
      mensajero.setO_contraseña(o_contraseña);
      mensajero.setO_codsegsocial(o_codsegsocial);
      mensajero.setI_tiposervicio(i_tiposervicio);
      mensajero.setI_mediotrans(i_mediotrans);
      
      mensajeriaDAO.añadirMensajero(mensajero);
      
    }
    
    public void añadirHorario( String i_dia, String o_horainicial, String o_horafinal, String k_tipoidentidadmensa, int k_identidadmensa) throws RHException {
      
      horario = new Horario();
      
      horario.setI_dia(i_dia);
      horario.setO_horainicial(o_horainicial);
      horario.setO_horafinal(o_horafinal);
      horario.setK_tipoidentidadmensa(k_tipoidentidadmensa);
      horario.setK_identidadmensa(k_identidadmensa);
      
      mensajeriaDAO.añadirHorario(horario);
      
    }
    
    public void añadirCalificacion( int k_idservicio, int q_valor, String o_descripcion) throws RHException {
      
      calificacion = new Calificacion();
      
      calificacion.setK_idservicio(k_idservicio);
      calificacion.setQ_valor(q_valor);
      calificacion.setO_descripcion(o_descripcion);
      
      mensajeriaDAO.añadirCalificacion(calificacion);
      
    }
    
    public ArrayList<String> consultarDetallesServ(Integer k_idservicio) throws RHException {
        return mensajeriaDAO.consultarDetallesServ(k_idservicio);
    }
    
    public ArrayList<String> consultarDetallesFecha(String f_iniciohora) throws RHException {
        return mensajeriaDAO.consultarDetallesFecha(f_iniciohora);
    }
    
    public ArrayList<String> consultarDetallesDI(Integer k_identificacion, String k_tipoidentidad) throws RHException {
        return mensajeriaDAO.consultarDetallesDI(k_identificacion, k_tipoidentidad);
    }
    
    public ArrayList<String> verServicios(Integer k_identidadmensa, String K_tipoidentidadmensa) throws RHException {
        return mensajeriaDAO.verServicios(k_identidadmensa, K_tipoidentidadmensa);
    }
    
    public ArrayList<String> verServiciosAct(Integer k_identidadmensa, String K_tipoidentidadmensa) throws RHException {
        return mensajeriaDAO.verServiciosAct(k_identidadmensa, K_tipoidentidadmensa);
    }
    
    public void actualizarEstado(Integer k_idservicio, String Estado) throws RHException {
        mensajeriaDAO.actualizarEstado(k_idservicio, Estado);
    }
    
    public int numNuevoIDServ() throws RHException {
        return mensajeriaDAO.numNuevoIDServ();
    }
    
    public boolean getClieEnc(int k_idservicio, int k_identificacion, String k_tipoidentidad) throws RHException {
        return mensajeriaDAO.getClieEnc(k_idservicio, k_identificacion, k_tipoidentidad);
    }
    
    public boolean getMensEnc(int k_idservicio, int k_identidadmensa, String k_tipoidentidadmensa) throws RHException {
        return mensajeriaDAO.getMensEnc(k_idservicio, k_identidadmensa, k_tipoidentidadmensa);
    }
    
    public int getTarifa(String tpaquete) throws RHException {
        return mensajeriaDAO.getTarifa(tpaquete);
    }
    
    public int getComision(String nombre) throws RHException {
        return mensajeriaDAO.getComision(nombre);
    }
    
    public String getContraseña(String a, int b) throws RHException {
        return mensajeriaDAO.getContraseña(a,b);
    }
    
    public String getContraseñaMensa(String a, int b) throws RHException {
        return mensajeriaDAO.getContraseñaMensa(a,b);
    }
    
    public String getEstado(int b) throws RHException {
        return mensajeriaDAO.getEstado(b);
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return new Cliente();
    }    
    
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Servicio getServicio() {
        return servicio;
    }
    
    public void setIndicacion(Indicacion indicacion) {
        this.indicacion = indicacion;
    }

    public Indicacion getIndicacion() {
        return indicacion;
    } 
    
    public void setMensajero(Mensajero mensajero) {
        this.mensajero = mensajero;
    }

    public Mensajero getMensajero() {
        return mensajero;
    }
    
    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public Horario getHorario() {
        return horario;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
    
}
