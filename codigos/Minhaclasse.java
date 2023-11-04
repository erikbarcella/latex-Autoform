package minhaclasse;
import java.util.Scanner;

public class Minhaclasse {

    public static void main(String[] args) {
        System.out.println("Esta eh minha primeira classe Java!");
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        a = in.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = in.nextInt();
        int resultado = multiplica(a,b);
        System.out.println("O resultado de " + a + " * " + b 
                +" eh: " + resultado + ".");
        System.out.println("Digite uma palavra:");
        
    }
    
    public static int multiplica(int a, int b){
        return a * b;
    }
    
}
