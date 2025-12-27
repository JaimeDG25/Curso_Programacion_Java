
package Ejemplo3;

public class Constructor {
    String nombre;
    int edad;
    private int sueldo;
    
    public Constructor(String nombre,int edad, int sueldo){
        this.nombre=nombre;
        this.edad=edad;
        this.sueldo=sueldo;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int getSueldo(){
        return sueldo;
    }
    

}
