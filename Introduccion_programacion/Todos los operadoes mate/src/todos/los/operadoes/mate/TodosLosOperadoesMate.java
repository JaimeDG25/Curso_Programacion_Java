
package todos.los.operadoes.mate;
import java.util.Scanner;
public class TodosLosOperadoesMate {

    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        double suma,resta,expo,raiz1,raiz2;
        float multi,div,resto;
        
        //random
        double rand=Math.random();
        double mover=rand*10;
        double red=Math.round(mover);
        
        System.out.println("El numero random es de "+red);
        System.out.println("Ingre el primer numero");
        int num1=var.nextInt();
        System.out.println("Ingre el segundo numero");
        int num2=var.nextInt();
        //suma
        suma=num1+num2;
        //resta
        resta=num1-num2;
        //multi
        multi=num1*num2;
        //div
        div=num1/num2;
        //resto
        resto=num1%num2;
        //expo
        expo=Math.pow(num1, num2);
        //raiz
        raiz1=Math.sqrt(num1);
        raiz2=Math.sqrt(num2);
         
        System.out.println("Su resultado "+suma);
        System.out.println("Su resultado "+resta);
        System.out.println("Su resultado "+multi);
        System.out.println("Su resultado "+div);
        System.out.println("Su resultado "+resto);
        System.out.println("Su resultado "+expo);
        System.out.println("Su resultado "+raiz1+" "+raiz2);
        
        //redondeo
        System.out.println("Ingresa un numero decimal");
        float nud=var.nextFloat();
        int resu=Math.round(nud);
        System.out.println("El redondeo es: "+resu);
        
        
    }
    
}
