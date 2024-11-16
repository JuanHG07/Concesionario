package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Cliente extends Usuario {
    private String direccion;
    private LinkedList<Transaccion> transacciones;

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
        transacciones = new LinkedList<>();
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

    /**
     * Metodo para obtener la lista de transacciones
     * 
     * @return la lista de transacciones
     */
    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    /**
     * Metodo para cambiar la lista de transacciones
     * 
     * @param transacciones la nueva lista de transacciones
     */
    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

}