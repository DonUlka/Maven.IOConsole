import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IOConsolePrint_1 {

   /**
    * Test usando un string (cadena)
    */
   @Test
   public void printTest1() {
      String outputString = "The legion is here.";
      test(outputString);
   }

   /**
    * Test usando un string (cadena) con un argumento
    */
   @Test
   public void printTest2() {
      String outputString = "The %s is here.";
      Object[] stringArguments = {"legion"};
      test(outputString, stringArguments);
   }

   /**
    * Test usando un string (cadena) con dos argumentos
    */
   @Test
   public void printTest3() {
      String outputString = "The %s is %s.";
      Object[] stringArguments = {"legion", "here"};
      test(outputString, stringArguments);
   }

   private void test(String outputString, Object... stringArguments) {
      // Given
      String expected = String.format(outputString, stringArguments);
      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      IOConsole console = new IOConsole(System.in, new PrintStream(outputStream));

      // When
      console.print(outputString, stringArguments);
      String actual = outputStream.toString();

      // Then
      assertEquals(expected, actual);
   }
}
