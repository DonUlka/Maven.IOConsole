import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class IOConsoleGetDoubleInput {

   @Test
   public void getFloatInputTest1() {
      test("0", 0.0);
   }

   @Test
   public void getFloatInputTest2() {
      test("1", 1.0);
   }

   public void getFloatInputTest3() {
      test("3.14159", 3.14159);
   }

   @Test
   public void getFloatInputTest4() {
      test("1.79769313486231570e+308", Double.MAX_VALUE);
   }

   @Test
   public void getFloatInputTest5() {
      test("4.94065645841246544e-324", Double.MIN_VALUE);
   }

   @Test(expected= NoSuchElementException.class)
   public void getFloatInputTest6() {
      test("_", null);
   }

   private void test(String input, Double expected) {
      // : Given
      IOConsole console = getConsoleWithBufferedInput(input);

      // : When
      Double actual = console.getDoubleInput("");

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
