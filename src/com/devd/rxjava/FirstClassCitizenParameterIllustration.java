package com.devd.rxjava;

import java.util.function.Function;

/**
 * It is regarding how can we pass functions as parameters in methods.
 */
public class FirstClassCitizenParameterIllustration {
  
  public static void main(String[] args) {
    
    //Passing using lambda functions.
    System.out.println(concatAndTransform("Hello ", "World", (s) -> {
      return s.toUpperCase();
    }));
    
    Function<String, String> transform = (s) -> {
      return s.toLowerCase();
    };
    
    //Passing using Function.
    System.out.println(concatAndTransform("Hello ", "World", transform));
  }
  
  public static String concatAndTransform(String a, String b, Function<String, String> stringTransform) {
    if (stringTransform != null) {
      a = stringTransform.apply(a);
      b = stringTransform.apply(b);
    }
    return a + b;
  }
}
