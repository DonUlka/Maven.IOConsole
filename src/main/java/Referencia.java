import java.util.Scanner;

public class Referencia {

   public static void main(String[] args) {

      /** Instancia de la clase Scanner para preparar la entrada de datos (por teclado)*/
      Scanner in = new Scanner(System.in);

      String input = "";
      System.out.println("Escribe un mensaje: ");

      /** Guardamos el string (cadena) introducido por teclado en la variable input */
      input = in.nextLine();

      /** Imprimir en pantalla */
      System.out.println(input);


   }

}
