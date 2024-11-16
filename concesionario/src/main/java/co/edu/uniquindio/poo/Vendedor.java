package co.edu.uniquindio.poo;

public class Vendedor extends Usuario {
    private String codigoEmpleado;

    /**
     * Constructor de la clase Vendedor
     * 
     * @param nombre                el nombre del vendedor
     * @param apellido              el apellido del vendedor
     * @param cedula                la cedula del vendedor
     * @param telefono              el telefono del vendedor
     * @param correo                el correo del vendedor
     * @param cuenta                la cuenta del vendedor
     * @param contrasenia           la contrasenia del vendedor
     * @param preguntaRecuperacion  la pregunta de recuperacion del vendedor
     * @param respuestaRecuperacion la respuesta de recuperacion del vendedor
     * @param codigoEmpleado        el codigo de empleado del vendedor
     */
    public Vendedor(String nombre, String apellido, String cedula, String telefono, String correo, String cuenta,
            String contrasenia, String preguntaRecuperacion, String respuestaRecuperacion, String codigoEmpleado) {
        super(nombre, apellido, cedula, telefono, correo, cuenta, contrasenia, preguntaRecuperacion,
                respuestaRecuperacion);
        this.codigoEmpleado = codigoEmpleado;
    }

    /**
     * Metodo para obtener el codigo de empleado
     * 
     * @return el codigo de empleado del vendedor
     */
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Metodo para cambiar el codigo de empleado
     * 
     * @param codigoEmpleado el nuevo codigo de empleado del vendedor
     */
    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

}
