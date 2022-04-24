package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import negocio.Cliente;
import negocio.Servicio;
import negocio.Indicacion;
import negocio.Mensajero;
import negocio.Tarifa;
import negocio.Ciudad;
import negocio.Horario;
import negocio.Calificacion;

import util.RHException;
import util.ServiceLocator;

public class MensajeriaDAO {

    public MensajeriaDAO() {

    }

    public void añadirCliente(Cliente cliente) throws RHException {

        try {

            String strSQL = "INSERT INTO cliente (k_tipoidentidad, k_identificacion, n_nombres, n_apellidos, o_telefono, o_correo, o_contraseña) VALUES (?, ?, ?, ?, ?, ?, ?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setString(1, cliente.getK_tipoidentidad());
            prepStmt.setInt(2, cliente.getK_identificacion());
            prepStmt.setString(3, cliente.getN_nombres());
            prepStmt.setString(4, cliente.getN_apellidos());
            prepStmt.setInt(5, cliente.getO_telefono());
            prepStmt.setString(6, cliente.getO_correo());
            prepStmt.setString(7, cliente.getO_contraseña());

            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();

        } catch (SQLException e) {

            ServiceLocator.getInstance().rollback();
            throw new RHException("MensajeriaDAO", "No pudo crear la cuenta" + e.getMessage());

        } finally {

            ServiceLocator.getInstance().liberarConexion();

        }

    }

    public void añadirServicio(Servicio servicio) throws RHException {

        try {

            String strSQL = "INSERT INTO servicio (k_idservicio, i_tipopaquete, i_estado, q_costo, f_iniciohora, o_idavuelta, k_codigopostal, k_tipoidentidad, k_identificacion, k_tipoidentidadmensa, k_identidadmensa) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setInt(1, servicio.getK_idservicio());
            prepStmt.setString(2, servicio.getI_tipopaquete());
            prepStmt.setString(3, servicio.getI_estado());
            prepStmt.setInt(4, servicio.getQ_costo());
            prepStmt.setTimestamp(5, java.sql.Timestamp.valueOf(servicio.getF_iniciohora()));
            prepStmt.setString(6, servicio.getO_idavuelta());
            prepStmt.setInt(7, servicio.getK_codigopostal());
            prepStmt.setString(8, servicio.getK_tipoidentidad());
            prepStmt.setInt(9, servicio.getK_identificacion());
            prepStmt.setString(10, servicio.getK_tipoidentidadmensa());
            prepStmt.setInt(11, servicio.getK_identidadmensa());

            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();

        } catch (SQLException e) {

            ServiceLocator.getInstance().rollback();
            throw new RHException("MensajeriaDAO", "No pudo crear la cuenta" + e.getMessage());

        } finally {

            ServiceLocator.getInstance().liberarConexion();

        }

    }

    public void añadirDireccion(Indicacion indicacion) throws RHException {

        try {

            String strSQL = "INSERT INTO indicacion(k_idservicio, o_direccion, o_observaciones) VALUES ( ?, ?, ?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setInt(1, indicacion.getK_idservicio());
            prepStmt.setString(2, indicacion.getO_direccion());
            prepStmt.setString(3, indicacion.getO_observaciones());

            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();

        } catch (SQLException e) {

            ServiceLocator.getInstance().rollback();
            throw new RHException("MensajeriaDAO", "No pudo crear la cuenta" + e.getMessage());

        } finally {

            ServiceLocator.getInstance().liberarConexion();

        }

    }

    public void añadirMensajero(Mensajero mensajero) throws RHException {

        try {

            String strSQL = "INSERT INTO mensajero(k_tipoidentidadmensa, k_identidadmensa, f_nacimiento, n_nombres, n_apellidos, o_nacionalidad, i_sexo, o_telefono, o_correo, o_ciudad, o_direccion, o_contraseña, o_codsegsocial, i_tiposervicio, i_mediotrans) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setString(1, mensajero.getK_tipoidentidadmensa());
            prepStmt.setInt(2, mensajero.getK_identidadmensa());
            prepStmt.setDate(3, java.sql.Date.valueOf(mensajero.getF_nacimiento()));
            prepStmt.setString(4, mensajero.getN_nombres());
            prepStmt.setString(5, mensajero.getN_apellidos());
            prepStmt.setString(6, mensajero.getO_nacionalidad());
            prepStmt.setString(7, mensajero.getI_sexo());
            prepStmt.setInt(8, mensajero.getO_telefono());
            prepStmt.setString(9, mensajero.getO_correo());
            prepStmt.setString(10, mensajero.getO_ciudad());
            prepStmt.setString(11, mensajero.getO_direccion());
            prepStmt.setString(12, mensajero.getO_contraseña());
            prepStmt.setInt(13, mensajero.getO_codsegsocial());
            prepStmt.setString(14, mensajero.getI_tiposervicio());
            prepStmt.setString(15, mensajero.getI_mediotrans());

            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();

        } catch (SQLException e) {

            ServiceLocator.getInstance().rollback();
            throw new RHException("MensajeriaDAO", "No pudo crear la cuenta" + e.getMessage());

        } finally {

            ServiceLocator.getInstance().liberarConexion();

        }

    }

    public void añadirHorario(Horario horario) throws RHException {

        try {

            String strSQL = "INSERT INTO horario( i_dia, o_horainicial, o_horafinal, k_tipoidentidadmensa, k_identidadmensa)	VALUES (?, ?, ?, ?, ?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setString(1, horario.getI_dia());
            prepStmt.setTime(2, java.sql.Time.valueOf(horario.getO_horainicial()));
            prepStmt.setTime(3, java.sql.Time.valueOf(horario.getO_horafinal()));
            prepStmt.setString(4, horario.getK_tipoidentidadmensa());
            prepStmt.setInt(5, horario.getK_identidadmensa());

            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();

        } catch (SQLException e) {

            ServiceLocator.getInstance().rollback();
            throw new RHException("MensajeriaDAO", "No pudo crear la cuenta" + e.getMessage());

        } finally {

            ServiceLocator.getInstance().liberarConexion();

        }

    }

    public void añadirCalificacion(Calificacion calificacion) throws RHException {

        try {

            String strSQL = "INSERT INTO calificacion( k_idservicio, q_valor, o_descripcion)	VALUES ( ?, ?, ?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setInt(1, calificacion.getK_idservicio());
            prepStmt.setInt(2, calificacion.getQ_valor());
            prepStmt.setString(3, calificacion.getO_descripcion());

            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();

        } catch (SQLException e) {

            ServiceLocator.getInstance().rollback();
            throw new RHException("MensajeriaDAO", "No pudo crear la cuenta" + e.getMessage());

        } finally {

            ServiceLocator.getInstance().liberarConexion();

        }

    }

    public void actualizarEstado(int k_idservicio, String Estado) throws RHException {

        try {

            String strSQL = "UPDATE servicio SET i_estado=? WHERE k_idservicio = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setString(1, Estado);
            prepStmt.setInt(2, k_idservicio);

            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();

        } catch (SQLException e) {

            ServiceLocator.getInstance().rollback();
            throw new RHException("MensajeriaDAO", "No pudo crear la cuenta" + e.getMessage());

        } finally {

            ServiceLocator.getInstance().liberarConexion();

        }

    }

    public ArrayList<String> verServicios(Integer k_identidadmensa, String K_tipoidentidadmensa) throws RHException {

        ArrayList<String> array = new ArrayList<String>();

        try {

            Servicio s = new Servicio();

            String strSQL = "SELECT * FROM servicio WHERE k_identidadmensa = ? AND K_tipoidentidadmensa = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setInt(1, k_identidadmensa);
            prepStmt.setString(2, K_tipoidentidadmensa);

            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {

                array.add(rs.getString(1));
                array.add(rs.getString(2));
                array.add(rs.getString(3));
                array.add(rs.getString(4));
                array.add(rs.getString(5));
                array.add(rs.getString(6));
                array.add(rs.getString(7));
                array.add(rs.getString(8));
                array.add(rs.getString(9));
                array.add(rs.getString(10));
                array.add(rs.getString(11));

            }

        } catch (SQLException e) {
            throw new RHException("MensajeriaDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }

        return array;

    }

    public ArrayList<String> verServiciosAct(Integer k_identidadmensa, String K_tipoidentidadmensa) throws RHException {

        ArrayList<String> array = new ArrayList<String>();

        try {

            Servicio s = new Servicio();

            String strSQL = "SELECT * FROM servicio WHERE k_identidadmensa = ? AND K_tipoidentidadmensa = ? AND i_estado = 'Ini' ";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setInt(1, k_identidadmensa);
            prepStmt.setString(2, K_tipoidentidadmensa);

            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {

                array.add(rs.getString(1));
                array.add(rs.getString(2));
                array.add(rs.getString(3));
                array.add(rs.getString(4));
                array.add(rs.getString(5));
                array.add(rs.getString(6));
                array.add(rs.getString(7));
                array.add(rs.getString(8));
                array.add(rs.getString(9));
                array.add(rs.getString(10));
                array.add(rs.getString(11));

            }

        } catch (SQLException e) {
            throw new RHException("MensajeriaDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }

        return array;

    }

    public ArrayList<String> consultarDetallesServ(Integer k_idservicio) throws RHException {

        ArrayList<String> array = new ArrayList<String>();

        try {

            String strSQL = "SELECT * FROM servicio WHERE k_idservicio = ? ";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setInt(1, k_idservicio);

            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {

                array.add(rs.getString(1));
                array.add(rs.getString(2));
                array.add(rs.getString(3));
                array.add(rs.getString(4));
                array.add(rs.getString(5));
                array.add(rs.getString(6));
                array.add(rs.getString(7));
                array.add(rs.getString(8));
                array.add(rs.getString(9));
                array.add(rs.getString(10));
                array.add(rs.getString(11));

            }

        } catch (SQLException e) {
            throw new RHException("MensajeriaDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }

        return array;

    }

    public ArrayList<String> consultarDetallesFecha(String f_iniciohora) throws RHException {

        ArrayList<String> array = new ArrayList<String>();

        try {

            String strSQL = "SELECT * FROM servicio WHERE f_iniciohora = ? ";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setTimestamp(1, java.sql.Timestamp.valueOf(f_iniciohora));

            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {

                array.add(rs.getString(1));
                array.add(rs.getString(2));
                array.add(rs.getString(3));
                array.add(rs.getString(4));
                array.add(rs.getString(5));
                array.add(rs.getString(6));
                array.add(rs.getString(7));
                array.add(rs.getString(8));
                array.add(rs.getString(9));
                array.add(rs.getString(10));
                array.add(rs.getString(11));

            }

        } catch (SQLException e) {
            throw new RHException("MensajeriaDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }

        return array;

    }

    public ArrayList<String> consultarDetallesDI(Integer k_identificacion, String k_tipoidentidad) throws RHException {

        ArrayList<String> array = new ArrayList<String>();

        try {

            String strSQL = "SELECT * FROM servicio WHERE k_identificacion = ? AND k_tipoidentidad = ? ";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setInt(1, k_identificacion);
            prepStmt.setString(2, k_tipoidentidad);

            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {

                array.add(rs.getString(1));
                array.add(rs.getString(2));
                array.add(rs.getString(3));
                array.add(rs.getString(4));
                array.add(rs.getString(5));
                array.add(rs.getString(6));
                array.add(rs.getString(7));
                array.add(rs.getString(8));
                array.add(rs.getString(9));
                array.add(rs.getString(10));
                array.add(rs.getString(11));

            }

        } catch (SQLException e) {
            throw new RHException("MensajeriaDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }

        return array;

    }

    public int getTarifa(String n_tipopaquete) throws RHException {

        int tarifa = 1;

        try {

            String strSQL = "SELECT * FROM tarifa WHERE i_tipopaquete = ? ";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setString(1, n_tipopaquete);
            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {

                tarifa = rs.getInt("v_tarifapaquete");

            }

        } catch (SQLException e) {
            throw new RHException("MensajeriaDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }

        return tarifa;

    }

    public int getComision(String n_nombre) throws RHException {

        int tarifa = 1;

        try {

            String strSQL = "SELECT * FROM ciudad WHERE n_nombre = ? ";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setString(1, n_nombre);
            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {

                tarifa = rs.getInt("t_comision");

            }

        } catch (SQLException e) {
            throw new RHException("MensajeriaDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }

        return tarifa;

    }
    
    public boolean getClieEnc(int k_idservicio, int k_identificacion, String k_tipoidentidad) throws RHException {

        int idClie = 1;
        boolean bo = false;

        try {

            String strSQL = "SELECT * FROM servicio WHERE k_tipoidentidad = ? AND k_idservicio = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setString(1, k_tipoidentidad);
            prepStmt.setInt(2, k_idservicio);
            
            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {

                idClie = rs.getInt("k_identificacion");

            }

        } catch (SQLException e) {
            throw new RHException("MensajeriaDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
        
        if(idClie == k_identificacion){
        
            bo = true;
        
        }

        return bo;

    }
    
    public boolean getMensEnc(int k_idservicio, int k_identidadmensa, String k_tipoidentidadmensa) throws RHException {

        int idMens = 1;
        boolean bo = false;

        try {

            String strSQL = "SELECT * FROM servicio WHERE k_tipoidentidadmensa = ? AND k_idservicio = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setString(1, k_tipoidentidadmensa);
            prepStmt.setInt(2, k_idservicio);
            
            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {

                idMens = rs.getInt("k_identidadmensa");

            }

        } catch (SQLException e) {
            throw new RHException("MensajeriaDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
        
        if(idMens == k_identidadmensa){
        
            bo = true;
        
        }

        return bo;

    }
    
    public int numNuevoIDServ() throws RHException {

        ArrayList<Integer> array = new ArrayList();
        int mayor = 0;

        try {

            String strSQL = "SELECT * FROM servicio";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {

                array.add(rs.getInt(1));

            }
            
            for (int i = 0; i < array.size() ; i++) {
                
                if(mayor <= array.get(i)){
                    
                    mayor = array.get(i);
                
                }
                
            }
            
            System.out.println(mayor);

        } catch (SQLException e) {
            throw new RHException("MensajeriaDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }

        return mayor;

    }

    public String getContraseña(String k_tipoidentidad, int k_identificacion) throws RHException {

        String contraseña = "";

        try {

            String strSQL = "SELECT * FROM cliente WHERE k_identificacion = ? AND k_tipoidentidad = ? ";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setInt(1, k_identificacion);
            prepStmt.setString(2, k_tipoidentidad);
            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {

                contraseña = rs.getString("o_contraseña");

            }

        } catch (SQLException e) {
            throw new RHException("MensajeriaDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }

        return contraseña;

    }

    public String getContraseñaMensa(String k_tipoidentidadmensa, int k_identidadmensa) throws RHException {

        String contraseña = "";

        try {

            String strSQL = "SELECT * FROM mensajero WHERE k_identidadmensa = ? AND k_tipoidentidadmensa = ? ";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setInt(1, k_identidadmensa);
            prepStmt.setString(2, k_tipoidentidadmensa);
            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {

                contraseña = rs.getString("o_contraseña");

            }

        } catch (SQLException e) {
            throw new RHException("MensajeriaDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }

        return contraseña;

    }

    public String getEstado(int k_idservicio) throws RHException {

        String estado = "";

        try {

            String strSQL = "SELECT * FROM servicio WHERE k_idservicio = ? ";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);

            prepStmt.setInt(1, k_idservicio);
            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {

                estado = rs.getString("i_estado");

            }

        } catch (SQLException e) {
            throw new RHException("MensajeriaDAO", e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }

        return estado;

    }

    // setInt
    // setDouble
    // prepStmt.setDate(7, java.sql.Date.valueOf(empleado.getHire_date()));
}
