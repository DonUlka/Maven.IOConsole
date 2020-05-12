import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IOConsole {

   /**
    * Usa los siguientes 2 atributos para trabajar en este proyecto
    */
   private final Scanner in;
   private final PrintStream out;

   /**
    * NO tocar este constructor ya que es usado por el constructor de abajo
    */
   public IOConsole(Scanner in, PrintStream printStream) {
      this.in = in;
      this.out = printStream;
   }

   /**
    * NO tocar este constructor ya que es usado por los tests (printTests)
    */
   public IOConsole(InputStream inputStream, OutputStream outputStream) {
      this(new Scanner(inputStream), new PrintStream(outputStream));
   }

   /**
    * Nota que este método NO retorna algo
    *
    * @param val  : Text a mostrar en consola
    * @param args : Argumentos opcionales enviados para el formato del string (cadena)
    */
   public void print(String val, Object... args) {
      // Escribe tu código debajo de esta línea (puedes borrar este comentario después)
   }

   /**
    * Nota que este método NO retorna algo
    *
    * @param val  : Texto a mostrar en consola
    * @param args : Argumentos opcionales enviados para el formato del string (cadena)
    */

   public void println(String val, Object... args) {
      // Escribe tu código debajo de esta línea (puedes borrar este comentario después)
   }

   /**
    * @param prompt : String de entrada del usuario
    * @param args   : Argumentos opcionales enviados para el formato del String (cadena)
    * @return La entrada del usuario como un String
    */
   public String getStringInput(String prompt, Object... args) {
      // Escribe tu código debajo de esta línea (puedes borrar este comentario después)
      return null;
   }

   /**
    * @param prompt : String de entrada del usuario
    * @param args   : Argumentos opcionales enviados para el formato del String (cadena)
    * @return La entrada del usuario como un Integer
    */
   public Integer getIntegerInput(String prompt, Object... args) {
      // Escribe tu código debajo de esta línea (puedes borrar este comentario después)
      return null;
   }

   /**
    * @param prompt : String de entrada del usuario
    * @param args   : Argumentos opcionales enviados para el formato del String (cadena)
    * @return La entrada del usuario como un Long
    */
   public Long getLongInput(String prompt, Object... args) {
      // Escribe tu código debajo de esta línea (puedes borrar este comentario después)
      return null;
   }

   /**
    * @param prompt : String de entrada del usuario
    * @param args   : Argumentos opcionales enviados para el formato del String (cadena)
    * @return La entrada del usuario como un Float
    */
   public Float getFloatInput(String prompt, Object... args) {
      return null;
   }

   /**
    * @param prompt : String de entrada del usuario
    * @param args   : optional arguments to send for string formatting
    * @return user's input as double
    */
   public Double getDoubleInput(String prompt, Object... args) {
      // Escribe tu código debajo de esta línea (puedes borrar este comentario después)
      return null;
   }

}
