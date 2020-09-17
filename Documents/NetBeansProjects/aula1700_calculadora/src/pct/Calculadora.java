package pct;

import java.util.Scanner;



public class Calculadora {
    public static void main(String[] args) {
        // Declaração de variáveis 
        
        int n1, n2, total;
        
        // Criação e intaância de objeto de entrada
        
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação do sistema
        
        System.out.println("\n \t\t\t -- Calculadora simples -- \n");
        // /t = tab
        
        System.out.println("Soma simples");
        
        //Entrada
        
        System.out.print("\n\t Informe N1:  ");
        n1 =  entrada.nextInt();
        // se tem parênteses é um método
        
        System.out.print("\n\t Informe N2:  ");
        n2 = entrada.nextInt();
        
     
        //Processamento
        
        total = n1 + n2;
       
        //Saída
        
        //System.out.printf("\n\t\t\t %d + %d = %d\n", n1,n2,total);
        
        System.out.println("\n\t\t\t" + n1 + "+" + n2 + " = " + total + "\n");
    }
    
}
