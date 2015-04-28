/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author benjamin.ramirez006
 */



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UnknownFormatConversionException;

public class Lab8 {

  public static void main(final String[] args) {

    try {
      Lab8.bcImpossibleCast();
    } catch (final ClassCastException e) {
      System.out.println("   - ERROR:" + e.getMessage());
    }
    
    try {
      Lab8.bcImpossibleDowncast();
    } catch (final ClassCastException e) {
      System.out.println("   - ERROR:" + e.getMessage());
    }

    Lab8.bcImpossibleInstanceOf();
  
    try {
      Lab8.bcImpossibleDowncastOfArray();
    } catch (final ClassCastException e) {
      System.out.println("   - ERROR:" + e.getMessage());
    }

    Lab8.dmiBigDecimalConstructedFromDouble();
   
    Lab8.esComparingStringsWithEq();
 
    try {
      Lab8.vaFormatStringIllegal();
    } catch (final UnknownFormatConversionException e) {
      System.out.println("   - ERROR:" + e.getMessage());
    }
   
    Lab8.rvReturnValueIgnored();
  
    try {
      Lab8.npAlwaysNull();
    } catch (final NullPointerException e) {
      System.out.println("   - ERROR:" + e.getMessage());
    }

    Lab8.qabQuestionableBooleanAssignment();
  
  }

  private static void bcImpossibleCast() {
    final Object doubleValue = 1.0;
    final Long value = new BigDecimal((double) doubleValue).longValue();
    System.out.println("   - " + value);
  }

  private static void bcImpossibleDowncast() {
    final Object exception = new RuntimeException("abc");
    final SecurityException value = new SecurityException((Throwable) exception);
    System.out.println("   - " + value.getMessage());
  }

  private static void bcImpossibleInstanceOf() {
    final Object value = new BigDecimal((double) 1.0).longValue();
    System.out.println("   - " + (value instanceof Long));
  }

  private static void bcImpossibleDowncastOfArray() {
    final Collection<String> stringVector = new ArrayList<String>();
    stringVector.add("abc");
    stringVector.add("xyz");
    String[] stringArray = new String[stringVector.size()];
    stringArray = stringVector.toArray(stringArray);
    System.out.println("   - " + stringArray.length);
  }

  private static void dmiBigDecimalConstructedFromDouble() {
    final BigDecimal bigDecimal = new BigDecimal("3.1");
    System.out.println("   - " + bigDecimal.toString());
  }

  private static void esComparingStringsWithEq() {
    final StringBuilder sb1 = new StringBuilder("1234");
    final StringBuilder sb2 = new StringBuilder("1234");
    final String string1 = sb1.toString();
    final String string2 = sb2.toString();
    System.out.println("   - " + (string1.equals(string2)));
  }

  private static void vaFormatStringIllegal() {
    System.out.println(String.format("   - %s > %s", 10, 9));
  }

  private static void rvReturnValueIgnored() {
    final BigDecimal bigDecimal = BigDecimal.ONE;
    final BigDecimal bigDecimal2 = bigDecimal.add(BigDecimal.ONE);
    System.out.println(String.format("   - " + bigDecimal2));
  }

  private static void npAlwaysNull() {
    final String value = "";
    if (value.length() > 2) {
      System.out.println(String.format("   - " + value));
    } else {
      System.out.println(String.format("   - value is invalid"));
    }
  }

  private static void qabQuestionableBooleanAssignment() {
    boolean value = false;
    if (value == true) {
      System.out.println(String.format("   - value is true"));
    } else {
      System.out.println(String.format("   - value is false"));
    }
  }

}

