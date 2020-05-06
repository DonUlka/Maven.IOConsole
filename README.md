### Consola de entrada y salida

* Objetivo - 
  * Asegurar que todos los test pasen completando los métodos en la clase `IOConsole`:
    * `void print(String val, Object... args)`
    * `void println(String val, Object... args)`
    * `String getStringInput(String prompt, Object... args)`
    * `Integer getIntegerInput(String prompt, Object... args)`
    * `Long getLongInput(String prompt, Object... args)`
    * `Float getFloatInput(String prompt, Object... args)`
    * `Double getDoubleInput(String prompt, Object... args)`

* Propósito 
  * Establecer familiaridad con:
    * `System.in` 
    * `System.out` 
    * `InputStream` 
    * `OutputStream` 
    * [Número variable de argumentos (varargs)](https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/) 

* NOTA: 
  * **Fork** el repositorio a tu cuenta de GitHub.
  * **Clona** tu repositorio del paso anterior (**fork**) a tu máquina local (PC o Mac)
  * Ve completando el proyecto y sube tus cambios a tu repositorio usando:
    * ```git add``` para añadir tus cambios
    * ```git commit``` para ponerle [consolidar](https://spanish.stackexchange.com/questions/17811/hay-alguna-forma-de-traducir-al-espa%C3%B1ol-commit-hablando-de-bases-de-datos) tu cambios y darle un mensaje
    * ```git push``` para subir los cambios en tu código hacia tu GitHub
  * Al terminar tu proyecto haz un ```pull request``` para compararlo con el ```master``` de Adalegion
- Nota adicional - Al finalizar todos los tests, revisa la clase `Main` para entender mejor como esta clase puede ayudarte en futuros proyectos.
  
  
- Recursos:
  - [PrintStream](https://www.javatpoint.com/java-printstream-format-method)
  - [PrintStream - format() y printf()](https://books.google.com/books?id=t1HOYNTih_4C&pg=PA78&lpg=PA78&dq=PrintStream+format()+java+metodo&source=bl&ots=18dV0_wE8U&sig=ACfU3U0f5khS499VZj39bZPEl-zkm3UQMg&hl=en&sa=X&ved=2ahUKEwiur7OSnZ_pAhXtmHIEHaC4C5MQ6AEwC3oECAkQAQ#v=onepage&q=PrintStream%20format()%20java%20metodo&f=false)
  - [varargs](https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/)
  - [Lista de lenguajes](https://en.wikipedia.org/wiki/List_of_programming_languages)


<br><br>
## `System.in` y `System.out`
Usando la entrada por teclado y la salida por pantalla 
  
### Ejemplo
  ```
      /** Instancia de la clase Scanner para preparar la entrada de datos (por teclado)*/
      Scanner in = new Scanner(System.in);

      String input = "";
      System.out.println("Escribe un mensaje: ");

      /** Guardamos el string (cadena) introducido por teclado en la variable input */
      input = in.nextLine();

      /** Imprimir en pantalla */
      System.out.println(input);
  ```
