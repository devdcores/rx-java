package com.devd.rxjava;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * In highOrderFunctions we pass the lambda's as the return of the method.
 * These returned lambda executed only when get() is called.
 */
public class HighOrderFunctionIllustration {
  public static void main(String[] args) {
    Supplier<String> combineAndTransform = createCombineAndTransform("Hello ", "World", (s) -> {
      return s.toUpperCase();
    });
    
    //lambda function gets executed when get() is called.
    System.out.println(combineAndTransform.get());
  }
  
  //retuning the lambda.
  public static Supplier<String> createCombineAndTransform(String a, String b, Function<String, String> stringTransform) {
    return () -> {
      String aa = a;
      String bb = b;
      
      if (stringTransform != null) {
        aa = stringTransform.apply(a);
        bb = stringTransform.apply(b);
      }
      
      return aa + bb;
    };
  }
}
