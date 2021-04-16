/**
* Package
*/
package com.example;

/**
* Creation de la classe greeter
*/
public class Greeter {

  /**
  * Constructeur de la classe greeter
  */
  public Greeter() {

  }
 /**
 * @param some name of person
 * @return greeting 
 */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
