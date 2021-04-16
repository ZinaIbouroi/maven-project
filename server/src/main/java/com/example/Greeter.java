/**
* Package.
*/
package com.example;

/**
* Creation de la classe greeter.
*/
public class Greeter {

  /**
  * Constructeur de la classe greeter.
  */
  public Greeter() {

  }
 /**
 * @param someone some name of person.
 * @return .
 */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
