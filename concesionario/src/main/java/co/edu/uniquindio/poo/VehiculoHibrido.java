package co.edu.uniquindio.poo;

public class VehiculoHibrido extends Vehiculo{
   
    private boolean enchufable;
    private boolean ligero;


    
        /*
     * Constructor de la clase VehiculoHibrido
     */
    public VehiculoHibrido(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMaz,
            double cilindraje, boolean enchufable, boolean ligero) {
        super(codigo, marca, modelo, nuevo, cambios, velMaz, cilindraje, negocio);
        this.enchufable = enchufable;
        this.ligero = ligero;
    }

    /*
     * Metodo get del atributo Enchufable
     * @return enchufable
     */
    public boolean Enchufable() {
        return enchufable;
    }

    /*
     * Metodo set del atributo Enchufable
     */
    public void setEnchufable(boolean enchufable) {
        this.enchufable = enchufable;
    }

    /*
     * Metodo get del atributo Ligero
     * @return ligero
     */
    public boolean Ligero() {
        return ligero;
    }

    /*
     * Metodo set del atributo Ligero
     */
    public void setLigero(boolean ligero) {
        this.ligero = ligero;
    }

    /*
     * Metodo toString para representar la clase VehiculoHibrido como una cadena de texto
     * @return representacion textual del objeto VehiculoHibrido
     */
    @Override
    public String toString() {
        return "VehiculoHibrido [enchufable=" + enchufable + ", ligero=" + ligero + "]";
    }


    
}
