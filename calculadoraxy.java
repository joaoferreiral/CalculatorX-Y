import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
      System.out.print("Informe o valor de x: "); 
        int x = sc.nextInt();
        System.out.print("Informe o valor de y: ");
        int y = sc.nextInt();
        int xy = x + y;
        int xvezesy = x * y;
        int xmenosy = x - y;
        int xdivy = x / y;
        
      System.out.println("O resultado do valor da expressão" + x + "+" + y +"é igual a: " + xy);
      System.out.println("O resultado do valor da expressão"+ x + "-" + y + "é igual a: " + xmenosy);
      System.out.println("O resultado do valor da expressão"+ x + "*" + y + "é igual a: " + xvezesy);
      System.out.println("O resultado do valor da expressão"+ x + "/" + y + "é igual a: " + xdivy);
      
      
      
    }
}