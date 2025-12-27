
package arreglos;


public class for_each_arreglos {

    public static void main(String[] args) {
        int []numero={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int i:numero) {
            System.out.println("El numero es "+i);
        }
        System.out.println("------------------------------------");
        String []nombres={"Mario","tito","pepe","Lupe","Paula","Rodrigo","Carlos","Lugui",",Ale","Goku","Gohan"};
        for (String i: nombres) {
            System.out.println("El nombre es "+i);
        }
    }
    
}
