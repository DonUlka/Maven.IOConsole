public class Main {

   private static final IOConsole console = new IOConsole(System.in, System.out);

   public static void main(String[] args) {

      String message1 = "¿Cuántos lenguajes quieres agregar?";
      System.out.println(message1);

      Integer numberOfLanguages = console.getIntegerInput(message1);
      Language[] languages = getLanguages(numberOfLanguages);
      for (Language language : languages) {

         String languageName = language.getName();
         String message2 = "El nombre del lenguaje fue %s";
         console.println(message2, languageName);
      }
   }

   private static Language[] getLanguages(Integer numberOfLanguages) {
      Language[] languageArray = new Language[numberOfLanguages];
      for (int currentIndex = 0; currentIndex < numberOfLanguages; currentIndex++) {

         String message = "¿Cuál es el nomnbre del lenguaje?";
         System.out.println(message);

         String languageName = console.getStringInput(message);
         Language currentLanguage = new Language(languageName);
         languageArray[currentIndex] = currentLanguage;
      }
      return languageArray;
   }

}
