package co.edu.uniquindio.poo;

public abstract class Negocio {
    private String codigo;
    private double impuesto;
    private Vehiculo vehiculo;
    private Transaccion transaccion;

    /**
     * Constructor de la clase Servicio
     * 
     * @param codigo   el codigo del servicio
     * @param impuesto el impuesto aplicado al servicio
     */
    public Negocio(String codigo, double impuesto) {
        this.codigo = codigo;
        this.impuesto = impuesto;
    }

    /**
     * Metodo para obtener el codigo del servicio
     * 
     * @return el codigo del servicio
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Metodo para cambiar el codigo del servicio
     * 
     * @param codigo el nuevo codigo del servicio
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo para obtener el impuesto aplicado al servicio
     * 
     * @return el impuesto del servicio
     */
    public double getImpuesto() {
        return impuesto;
    }

    /**
     * Metodo para cambiar el impuesto aplicado al servicio
     * 
     * @param impuesto el nuevo impuesto del servicio
     */
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public abstract double calcularPrecioNegocio();
}
