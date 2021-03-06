import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IOConsolePrintLn_2 {

   @Test
   public void printLnTest1() {
      String outputString = "The legion is here.";
      test(outputString);
   }

   @Test
   public void printLnTest2() {
      String outputString = "The %s is here.";
      Object[] stringArguments = {"legion"};
      test(outputString, stringArguments);
   }

   @Test
   public void printLnTest3() {
      String outputString = "The %s is %s.";
      Object[] stringArguments = {"legion", "here"};
      test(outputString, stringArguments);
   }

   private void test(String outputString, Object... stringArguments) {
      // Given
      String expected = String.format(outputString, stringArguments) + "\n";
      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      IOConsole console = new IOConsole(System.in, new PrintStream(outputStream));

      // When
      console.println(outputString, stringArguments);
      String actual = outputStream.toString();

      // Then
      assertEquals(expected, actual);
   }


}
