import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class IOConsoleGetLongInput {

   @Test
   public void getLongInputTest1() {
      test("0", 0L);
   }

   @Test
   public void getLongInputTest2() {
      test("1", 1L);
   }

   @Test(expected= NoSuchElementException.class)
   public void getLongInputTest3() {
      test("3.14159", 1L);
   }

   @Test
   public void getLongInputTest4() {
      test("9223372036854775807", Long.MAX_VALUE);
   }

   @Test
   public void getLongInputTest5() {
      test("-9223372036854775808", Long.MIN_VALUE);
   }

   @Test(expected=NoSuchElementException.class)
   public void getLongInputTest6() {
      test("_", null);
   }

   private void test(String input, Long expected) {
      // : Given
      IOConsole console = getConsoleWithBufferedInput(input);

      // : When
      Long actual = console.getLongInput("");

      // : Then
      Assert.assertEquals(expected, actual);
   }

   private IOConsole getConsoleWithBufferedInput(String inputString) {
      byte[] inputBytes = inputString.getBytes();
      ByteArrayInputStream inputByteArray = new ByteArrayInputStream(inputBytes);
      Scanner scanner = new Scanner(inputByteArray);
      return new IOConsole(scanner, System.out);
   }
}
