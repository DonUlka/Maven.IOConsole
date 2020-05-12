import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IOConsoleGetDoubleInput_7 {

   @Test
   public void getFloatInputTest1() {
      // : Given
      String input = "0";
      double expected = 0.0;

      test(input, expected);
   }

   @Test
   public void getFloatInputTest2() {
      // : Given
      String input = "1";
      double expected = 1.0;

      test(input, expected);
   }

   @Test
   public void getFloatInputTest3() {
      // : Given
      String input = "3.14159";
      double expected = 3.14159;

      test(input, expected);
   }

   @Test
   public void getFloatInputTest4() {
      // : Given
      String input = "1.79769313486231570e+308";
      double maxValue = Double.MAX_VALUE;

      test(input, maxValue);
   }

   @Test
   public void getFloatInputTest5() {
      // : Given
      String input = "4.94065645841246544e-324";
      double expected = Double.MIN_VALUE;

      test(input, expected);
   }

   @Test()
   public void getFloatInputThrowsExceptionTest6() {
      // : Given
      String input = "_";
      Exception expected = new InputMismatchException();
      testThrowsException(input, expected);
   }

   private void testThrowsException(String input, Exception expected) {
      // : When
      IOConsole console = getConsoleWithBufferedInput(input);

      // Then
      assertThrows(expected.getClass(), () -> console.getDoubleInput(input));
   }

   private void test(String input, Double expected) {
      // : When
      IOConsole console = getConsoleWithBufferedInput(input);
      Double actual = console.getDoubleInput("");

      // : Then
      assertEquals(expected, actual);
   }

   private IOConsole getConsoleWithBufferedInput(String inputString) {
      byte[] inputBytes = inputString.getBytes();
      ByteArrayInputStream inputByteArray = new ByteArrayInputStream(inputBytes);
      Scanner scanner = new Scanner(inputByteArray);
      return new IOConsole(scanner, System.out);
   }

}
