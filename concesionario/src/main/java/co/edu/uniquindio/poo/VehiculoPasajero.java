package co.edu.uniquindio.poo;

public abstract class VehiculoPasajero extends Vehiculo {
    int numeroPasajeros;
    int numeroPuertas;
    int numeroBolsasAire;

    
        /*
     * Constructor de la clase VehiculoPasajero
     */
    public VehiculoPasajero(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMaz,
            double cilindraje, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire) {
        super(codigo, marca, modelo, nuevo, cambios, velMaz, cilindraje);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasAire = numeroBolsasAire;
    }

    /*
     * Metodo get del atributo NumeroPasajeros
     */
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    /*
     * Metodo set del atributo NumeroPasajeros
     */
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    /*
     * Metodo get del atributo NumeroPuertas
     */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /*
     * Metodo set del atributo NumeroPuertas
     */
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    /*
     * Metodo get del atributo NumeroBolsasAire
     */
    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    /*
     * Metodo set del atributo NumeroBolsasAire
     */
    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    /*
     * Metodo toString para representar la clase VehiculoPasajero como una cadena de texto
     */
    @Override
    public String toString() {
        return "VehiculoPasajero [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas
                + ", numeroBolsasAire=" + numeroBolsasAire + "]";
    }



}
