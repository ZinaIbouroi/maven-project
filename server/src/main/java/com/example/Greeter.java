package com.example;


public class Greeter {

  
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
