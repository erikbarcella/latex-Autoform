/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_exc_lerinteiro;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Ferramentas {

    /*metodo que retorna um array de strings digitado pelo usuario
      recebe como parametro a quantidade de elementos a ser lida
    */
    public static String[] lerVariasStrings(int quantidade){
        String[] palavras = new String[quantidade];
        for (int i = 0; i < quantidade; i++){
            palavras[i] = lerString("Digite a " + (i+1) + "ª string: ");
        }
        return palavras;
    }
    
    /*metodo que retorna uma string digitada pelo usuario
      a string mensagem recebida como parametro é mostrada ao usuario antes de permitir que ele digite a string a ser retornada
    */
    public static String lerString(String mensagem){
        System.out.print("\n" + mensagem + " ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    
    /*metodo que retorna um inteiro digitado pelo usuario
      a string mensagem recebida como parametro é mostrada ao usuario antes de permitir que ele digite a string a ser retornada
    */
    //metodo alterado para que, através de tratamento de exceções, fique executando até o usuário digitar um inteiro válido
    public static int lerInteiro(String mensagem){
        int inteiro = 0;
        while(true){
            try{
                System.out.print("\n" + mensagem + " ");
                Scanner in = new Scanner(System.in);
                inteiro = in.nextInt();
            }
            catch (java.util.InputMismatchException e){
                System.out.println("\nDigite um numero inteiro!");
                continue;
            }
            break;
        }
        return inteiro;
    }
    
    /*metodo que retorna um array de inteiros digitado pelo usuario
      recebe como parametro a quantidade de elementos a ser lida
    */
    public static int[] lerVariosInteiros(int quantidade){
        int[] numeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++){
            numeros[i] = lerInteiro("Digite o " + (i+1) + "º numero: ");
        }
        return numeros;
    }
    
    /*metodo que retorna um array de doubles digitado pelo usuario
      recebe como parametro a quantidade de elementos a ser lida
    */
    public static double[] lerVariosDoubles(int quantidade){
        double[] numeros = new double[quantidade];
        for (int i = 0; i < quantidade; i++){
            numeros[i] = lerDouble("Digite o " + (i+1) + "º numero: ");
        }
        return numeros;
    }
    
    /*metodo que retorna um double digitado pelo usuario
      a string mensagem recebida como parametro é mostrada ao usuario antes de permitir que ele digite a string a ser retornada
    */
     public static double lerDouble(String mensagem){
        System.out.print("\n" + mensagem + " ");
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }
}
