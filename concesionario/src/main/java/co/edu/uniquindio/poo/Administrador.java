package co.edu.uniquindio.poo;

public class Administrador extends Usuario {
    private String departamento;

    /**
     * Constructor de la clase Administrador
     * 
     * @param departamento el departamento del administrador
     */
    public Administrador(String nombre, String apellido, String cedula, String telefono, String correo,
            String direccion,
            String cuenta, String contrasenia, String preguntaRecuperacion, String respuestaRecuperacion,
            String departamento) {
        super(nombre, apellido, cedula, telefono, correo, cuenta, contrasenia, preguntaRecuperacion,
                respuestaRecuperacion);
        this.departamento = departamento;
    }

    /**
     * Metodo para obtener el departamento
     * 
     * @return el departamento del administrador
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Metodo para cambiar el departamento
     * 
     * @param departamento el nuevo departamento del administrador
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
