
package aloha2;

public class Ejemplo2 {
    private int n1;
    private int n2;

    public int getN1() {
        return n1;
    }
    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int Area(int n1, int n2){
        int area= n1*n2;
        return area;
    }
    public int Perimetro(int n1, int n2){
        int perimetro= (2*n1)+(2*n2);
        return perimetro;
    
    }
    
}
