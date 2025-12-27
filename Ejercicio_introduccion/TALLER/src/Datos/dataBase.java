
package Datos;

public class dataBase {
    String [][] reserva = new String [2][2];      
    String [] datosE = new String [2];    
    int [] datosN = new int [2];
    double [] dinero = new double[4]; 

    public String[][] getReserva() {
        return reserva;
    }
    public void setReserva(String[][] reserva) {
        this.reserva = reserva;
    }
    public String[] getDatosE() {
        return datosE;
    }
    public void setDatosE(String[] datosE) {
        this.datosE = datosE;
    }
    public int[] getDatosN() {
        return datosN;
    }
    public void setDatosN(int[] datosN) {
        this.datosN = datosN;
    }
    public double[] getDinero() {
        return dinero;
    }
    public void setDinero(double[] dinero) {
        this.dinero = dinero;
    } 
    public void Inicializar(){
        datosPersonales añadir = new datosPersonales();
        datosE [0] = añadir.getNombre();
        datosE [1] = añadir.getApellido();
        datosN [0] = añadir.getDNI();
        datosN [1] = añadir.getPersonas();
    }  

}

