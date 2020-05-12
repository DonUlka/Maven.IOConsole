import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IOConsoleGetIntegerInput_4 {

   @Test
   public void getIntegerInputTest1() {
      // : Given
      String input = "0";
      int expected = 0;

      test(input, expected);
   }

   @Test
   public void getIntegerInputTest2() {
      // : Given
      String input = "1";
      int expected = 1;

      test(input, expected);
   }

   @Test
   public void getIntegerInputTest3() {
      // : Given
      String input = "2147483647";
      int expected = Integer.MAX_VALUE;

      test(input, expected);
   }

   @Test
   public void getIntegerInputTest4() {
      // : Given
      String input = "-2147483648";
      int expected = Integer.MIN_VALUE;

      test(input, expected);
   }

   @Test()
   public void getIntegerInputThrowsExceptionTest5() {
      // : Given
      String input = "3.14159";
      Exception expected = new InputMismatchException();

      testThrowsException(input, expected);
   }

   @Test()
   public void getIntegerInputThrowsExceptionTest6() {
      // : Given
      String input = "_";
      Exception expected = new InputMismatchException();

      testThrowsException(input, expected);
   }

   private void testThrowsException(String input, Exception expected) {
      // : When
      IOConsole console = getConsoleWithBufferedInput(input);

      // : Then
      assertThrows(expected.getClass(), () -> console.getIntegerInput(input));
   }

   private void test(String input, Integer expected) {
      // : When
      IOConsole console = getConsoleWithBufferedInput(input);
      Integer actual = console.getIntegerInput("");

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
