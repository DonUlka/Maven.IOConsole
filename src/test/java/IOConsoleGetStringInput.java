import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class IOConsoleGetStringInput {

   @Test
   public void getStringInputTest1() {
      test("0");
   }

   @Test
   public void getStringInputTest2() {
      test("1");
   }

   @Test
   public void getStringInputTest3() {
      test("3.14159");
   }

   @Test
   public void getStringInputTest4() {
      test("0.314159E01");
   }

   @Test
   public void getStringInputTest5() {
      test("-9223372036854775807");
   }

   @Test
   public void getStringInputTest6() {
      test("_");
   }

   private void test(String input) {
      // : Given
      IOConsole console = getConsoleWithBufferedInput(input);

      // : When
      String actual = console.getStringInput("");

      // : Then
      Assert.assertEquals(input, actual);
   }

   private IOConsole getConsoleWithBufferedInput(String inputString) {
      byte[] inputBytes = inputString.getBytes();
      ByteArrayInputStream inputByteArray = new ByteArrayInputStream(inputBytes);
      Scanner scanner = new Scanner(inputByteArray);
      return new IOConsole(scanner, System.out);
   }

}
