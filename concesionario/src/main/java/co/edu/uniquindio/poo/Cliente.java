package co.edu.uniquindio.poo;

public class Cliente extends Usuario {
    private String direccion;

    /**
     * Constructor de la clase Cliente
     * 
     * @param direccion la direccion del cliente
     */
    public Cliente(String nombre, String apellido, String cedula, String telefono, String correo,
            String cuenta, String contrasenia, String preguntaRecuperacion, String respuestaRecuperacion,
            String direccion) {
        super(nombre, apellido, cedula, telefono, correo, cuenta, contrasenia, preguntaRecuperacion,
                respuestaRecuperacion);
        this.direccion = direccion;
    }

    /**
     * Metodo para obtener direccion
     * 
     * @return la direccion del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo para cambiar direccion
     * 
     * @param direccion la nueva direccion del cliente
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
