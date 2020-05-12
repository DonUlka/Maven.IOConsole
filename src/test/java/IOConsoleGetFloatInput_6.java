import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IOConsoleGetFloatInput_6 {

   @Test
   public void getFloatInputTest1() {
      // : Given
      String input = "0";
      float expected = 0f;

      test(input, expected);
   }

   @Test
   public void getFloatInputTest2() {
      // : Given
      String input = "1";
      float expected = 1f;

      test(input, expected);
   }

   @Test
   public void getFloatInputTest3() {
      // : Given
      String input = "3.14159";
      float expected = 3.14159f;

      test(input, expected);
   }

   @Test
   public void getFloatInputTest4() {
      // : Given
      String input = "3.4028235E38";
      float expected = Float.MAX_VALUE;

      test(input, expected);
   }

   @Test
   public void getFloatInputTest5() {
      // : Given
      String input = "1.4E-45";
      float expected = Float.MIN_VALUE;

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

      // : Then
      assertThrows(expected.getClass(), () -> console.getFloatInput(input));
   }

   private void test(String input, Float expected) {
      // : When
      IOConsole console = getConsoleWithBufferedInput(input);
      Float actual = console.getFloatInput("");

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
