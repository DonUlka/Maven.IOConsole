import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IOConsoleGetLongInput_5 {

   @Test
   public void getLongInputTest1() {
      // : Given
      String input = "0";
      long expected = 0L;

      test(input, expected);
   }

   @Test
   public void getLongInputTest2() {
      // : Given
      String input = "1";
      long expected = 1L;

      test(input, expected);
   }

   @Test
   public void getLongInputTest4() {
      // : Given
      String input = "9223372036854775807";
      long expected = Long.MAX_VALUE;

      test(input, expected);
   }

   @Test
   public void getLongInputTest5() {
      // : Given
      String input = "-9223372036854775808";
      long expected = Long.MIN_VALUE;

      test(input, expected);
   }

   @Test()
   public void getLongInputException1Test3() {
      // : Given
      String input = "3.14159";
      Exception expected = new InputMismatchException();

      testThrowsException(input, expected);
   }

   @Test()
   public void getLongInputException2Test6() {
      // : Given
      String input = "_";
      Exception expected = new InputMismatchException();

      testThrowsException(input, expected);
   }

   private void testThrowsException(String input, Exception exception) {
      // : When
      IOConsole console = getConsoleWithBufferedInput(input);

      // : Then
      assertThrows(exception.getClass(), () -> console.getLongInput(input));
   }

   private void test(String input, Long expected) {
      // : When
      IOConsole console = getConsoleWithBufferedInput(input);
      Long actual = console.getLongInput("");

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
