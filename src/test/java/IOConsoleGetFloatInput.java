import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class IOConsoleGetFloatInput {

   @Test
   public void getFloatInputTest1() {
      test("0", 0f);
   }

   @Test
   public void getFloatInputTest2() {
      test("1", 1f);
   }

   public void getFloatInputTest3() {
      test("3.14159", 3.14159f);
   }

   @Test
   public void getFloatInputTest4() {
      test("3.4028235E38", Float.MAX_VALUE);
   }

   @Test
   public void getFloatInputTest5() {
      test("1.4E-45", Float.MIN_VALUE);
   }

   @Test(expected=NoSuchElementException.class)
   public void getFloatInputTest6() {
      test("_", null);
   }

   private void test(String input, Float expected) {
      // : Given
      IOConsole console = getConsoleWithBufferedInput(input);

      // : When
      Float actual = console.getFloatInput("");

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
