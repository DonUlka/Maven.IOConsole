import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IOConsoleGetStringInput_3 {

   @Test
   public void getStringInputTest1() {
      // : Given
      String input = "0";

      test(input);
   }

   @Test
   public void getStringInputTest2() {
      // : Given
      String input = "1";

      test(input);
   }

   @Test
   public void getStringInputTest3() {
      // : Given
      String input = "3.14159";

      test(input);
   }

   @Test
   public void getStringInputTest4() {
      // : Given
      String input = "0.314159E01";

      test(input);
   }

   @Test
   public void getStringInputTest5() {
      // : Given
      String input = "-9223372036854775807";

      test(input);
   }

   @Test
   public void getStringInputTest6() {
      // : Given
      String input = "_";

      test(input);
   }

   private void test(String input) {
      // : When
      IOConsole console = getConsoleWithBufferedInput(input);
      String actual = console.getStringInput("");

      // : Then
      assertEquals(input, actual);
   }

   private IOConsole getConsoleWithBufferedInput(String inputString) {
      byte[] inputBytes = inputString.getBytes();
      ByteArrayInputStream inputByteArray = new ByteArrayInputStream(inputBytes);
      Scanner scanner = new Scanner(inputByteArray);
      return new IOConsole(scanner, System.out);
   }

}
