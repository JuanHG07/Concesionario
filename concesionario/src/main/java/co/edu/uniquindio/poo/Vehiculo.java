package co.edu.uniquindio.poo;

public abstract class Vehiculo {

    private String codigo;
    private String marca;
    private String modelo;
    private boolean nuevo;
    private int cambios;
    private double velMaz;
    private double cilindraje;
    private Negocio negocio;


    /*
     * Metodo contructor de la clase Vehiculo
     */
    public Vehiculo(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMaz,
            double cilindraje) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.nuevo = nuevo;
        this.cambios = cambios;
        this.velMaz = velMaz;
        this.cilindraje = cilindraje;
    }

   

    /*
     * Metodo get del atributo Codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /*
     * Metodo set del atributo Codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /*
     * Metodo get del atributo Marca
     */
    public String getMarca() {
        return marca;
    }

    /*
     * Metodo set del atributo Marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /*
     * Metodo get del atributo Modelo
     */
    public String getModelo() {
        return modelo;
    }

    /*
     * Metodo set del atributo Modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /*
     * Metodo get del atributo Nuevo
     */
    public boolean getNuevo() {
        return nuevo;
    }

    /*
     * Metodo set del atributo Nuevo
     */
    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    /*
     * Metodo get del atributo Cambios
     */
    public int getCambios() {
        return cambios;
    }

    /*
     * Metodo set del atributo Cambios
     */
    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    /*
     * Metodo get del atributo Velocidad Maxima (velMaz)
     */
    public double getVelMaz() {
        return velMaz;
    }

    /*
     * Metodo set del atributo Velocidad Maxima (velMaz)
     */
    public void setVelMaz(double velMaz) {
        this.velMaz = velMaz;
    }

    /*
     * Metodo get del atributo Cilindraje
     */
    public double getCilindraje() {
        return cilindraje;
    }

    /*
     * Metodo set del atributo Cilindraje
     */
    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    /*
     * Metodo get del atributo Negocio
     * @return neogocio
     */
    public Negocio getNegocio() {
        return negocio;
    }

    public void setNegocio(Negocio negocio) {
        this.negocio = negocio;
    }

    /*
     * Metodo toString del la clase Vehiculo
     */
    @Override
    public String toString() {
        return "Vehiculo [codigo=" + codigo + ", marca=" + marca + ", modelo=" + modelo + ", nuevo=" + nuevo
                + ", cambios=" + cambios + ", velMaz=" + velMaz + ", cilindraje=" + cilindraje + "]";
    }

    
}
