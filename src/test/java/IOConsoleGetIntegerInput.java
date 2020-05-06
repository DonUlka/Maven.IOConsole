import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class IOConsoleGetIntegerInput {

   @Test
   public void getIntegerInputTest1() {
      test("0", 0);
   }

   @Test
   public void getIntegerInputTest2() {
      test("1", 1);
   }

   @Test(expected= NoSuchElementException.class)
   public void getIntegerInputTest3() {
      test("3.14159", 3);
   }

   @Test
   public void getIntegerInputTest4() {
      test("2147483647", Integer.MAX_VALUE);
   }

   @Test
   public void getIntegerInputTest5() {
      test("-2147483648", Integer.MIN_VALUE);
   }

   @Test(expected=NoSuchElementException.class)
   public void getIntegerInputTest6() {
      test("_", null);
   }

   private void test(String input, Integer expected) {
      // : Given
      IOConsole console = getConsoleWithBufferedInput(input);

      // : When
      Integer actual = console.getIntegerInput("");

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
