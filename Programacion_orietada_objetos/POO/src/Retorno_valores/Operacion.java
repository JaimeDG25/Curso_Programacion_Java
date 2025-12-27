
package Retorno_valores;

public class Operacion {
    //Atributos

    //Metodo para sumar los numeros
    public int sumar(int numero1, int numero2){
        int suma=numero1+numero2;
        return suma;
    }
    //Metodo para sumar los numeros
    public int restar(int numero1, int numero2){
        int resta=numero1-numero2;
        return resta;
    }
    //Metodo para sumar los numeros
    public int multiplicar(int numero1, int numero2){
        int multiplicacion=numero1*numero2;
        return multiplicacion;
    }
    //Metodo para sumar los numeros
    public int dividir(int numero1, int numero2){
        int division=numero1/numero2;
        return division;
    }
    public void mostrar_resultados(int suma, int resta, int multiplicacion, int division){
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
        System.out.println("El resultado de la division es: "+division);
    }
}
