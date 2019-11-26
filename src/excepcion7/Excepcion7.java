package excepcion7;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion7 {

        public static void main(String[] args) {
            Scanner teclado = new Scanner (System.in);
            int numero1, numero2;
            try{
                System.out.print("Introduce un número: ");
                numero1=teclado.nextInt();
                try{
                    System.out.print("Introduce otro número: ");
                    numero2=teclado.nextInt();
                    int cociente = numero1 / numero2;
                    System.out.println(numero1 + "/" + numero2 + " = " + cociente);
                    
                } catch(InputMismatchException e){
                    teclado.nextLine();
                    numero2=0;
                    System.out.println("Debe introducir un número");
                } catch (ArithmeticException e){
                    teclado.nextLine();
                    numero2 = 0;
                    System.out.println("No se puede dividir por cero");
                }
            } catch(InputMismatchException e){
                teclado.nextLine();
                numero1=0;
                System.out.println("Debe introducir un número");
        
    }
    
}
}
