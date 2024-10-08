
package Motos;


public class Moto {
    
    private String marca;
    private int modelo;
    private int motor;
    private int años;
    private int cilindraje;

    public Moto(String xtz, int par, int par1, int par2) {
    }

    public Moto(String marca, int modelo, int motor, int años, int cilindraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.años = años;
        this.cilindraje = cilindraje;
    }
    
    

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the motor
     */
    public int getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(int motor) {
        this.motor = motor;
    }

    /**
     * @return the años
     */
    public int getAños() {
        return años;
    }

    /**
     * @param años the años to set
     */
    public void setAños(int años) {
        this.años = años;
    }

    /**
     * @return the cilindraje
     */
    public int getCilindraje() {
        return cilindraje;
    }

    /**
     * @param cilindraje the cilindraje to set
     */
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
}