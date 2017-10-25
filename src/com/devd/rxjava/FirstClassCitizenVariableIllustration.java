package com.devd.rxjava;

import java.util.function.BiFunction;

/**
 * It is regarding how can we assign function to the variables.
 * And the function is executed only when apply method is called.
 */
public class FirstClassCitizenVariableIllustration {
  
  public static void main(String[] args) {
    
    BiFunction<String, String, String> concatFunction = (a, b) -> {
      return a + b;
    };
    System.out.println(concatFunction.apply("Hello ", "World"));
    
    concatFunction = FirstClassCitizenVariableIllustration::concatStrings;
    System.out.println(concatFunction.apply("Hello ", "World2"));
    
    FirstClassCitizenVariableIllustration firstClassCitizenVariableIllustration = new FirstClassCitizenVariableIllustration();
    concatFunction = firstClassCitizenVariableIllustration::concatStrings2;
    System.out.println(concatFunction.apply("Hello ", "World3"));
    
  }
  
  public static String concatStrings(String a, String b) {
    return a + b;
  }
  
  public String concatStrings2(String a, String b) {
    return a + b;
  }
  
}
