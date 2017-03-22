package com.example.testng.ano;

import javax.management.RuntimeErrorException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NgExceptionTest {
  @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp="NullPoint")
  public void testNgLearn1() {
      System.out.println("NgExceptionTest TestNG test case 1");
      throw new IllegalArgumentException("NullPoint");
  }

  @Test(expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp="Runtime")
  public void testNgLearn2() {
      System.out.println("NgExceptionTest TestNG test case 2");
      throw new RuntimeException("Runtime");
  }

//  @Test(expectedExceptionsMessageRegExp="NullPoint123456")
//  public void testNgLearn3() {
//      System.out.println("NgExceptionTest TestNG test case 3");
//      throw new RuntimeException("NullPoint123456");
//  }

  @AfterClass
  public void afterClass() {
    System.out.println("NgExceptionTest after class");
  }

  @BeforeClass
  public void beforeClass() {
      System.out.println("NgExceptionTest before class");
  }

  @BeforeTest
  public void beforeTest() {
    System.out.println("----------------------------------------------");
    System.out.println("NgExceptionTest beforeTest class                   ");
    System.out.println("----------------------------------------------");
  }

  @AfterTest
  public void afterTest() {
    System.out.println("----------------------------------------------");
    System.out.println("NgExceptionTest afterTest class");
    System.out.println("----------------------------------------------");
  }
}
