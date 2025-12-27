package arreglos;
public class Arreglos {
    public static void main(String[] args) {
        
        //Arreglos por numeros determinados
        int []numero= {1,2,3,4,5};
        for (int i=0; i<=4; i++){
        System.out.println("El numero "+numero[i]);
        }
        /*int [] lista={5,3,2,3,7};
        for(int i=0; i <=4 ; i=i+1) {
            System.out.println("Aca esta tu numero: "+lista[i]);
            JOptionPane.showMessageDialog(null, (lista[i]));
        }*/
        System.out.println("------------------------------------");
        
        //Arreglos por cantidad que piden
        int []num=new int[5] ;
        num[0]=91;
        num[1]=23;
        num[2]=47;
        num[3]=68;
        num[4]=50;
        System.out.println("El numero elegido es "+num[3]);
        System.out.println("-------------------------------------");
        for (int i=0; i<5; i++){
        System.out.println(num[i]);
        }
        System.out.println("-------------------------------------");
        
        
        //Arreglos por nombres dados
        String []mascotas={"gato","perro","pez","hamster"};
        for(int i=0; i<4 ; i++){
            System.out.println("Aca esta el: "+mascotas[i]);
        } 
        System.out.println("--------------------------------------");
        
        //Arreglos por caracteres dados
        char []dato=new char[4];
        dato[0]='j';
        dato[1]='a';
        dato[2]='i';
        dato[3]='r';
        System.out.println(""+dato[3]);
        System.out.println(""+dato[0]);
        System.out.println(""+dato[1]);
        System.out.println(""+dato[2]);
        System.out.println("-------------------------------------");
    }
}
