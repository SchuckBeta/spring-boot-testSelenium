package com.example.testng.ano;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NgBaseTest {
  @Test
  public void testNgLearn1() {
      System.out.println("NgBaseTest TestNG test case 1");
  }

  @Test
  public void testNgLearn2() {
      System.out.println("NgBaseTest TestNG test case 2");
  }

  @AfterClass
  public void afterClass() {
    System.out.println("NgBaseTest after class");
  }

  @BeforeClass
  public void beforeClass() {
      System.out.println("NgBaseTest before class");
  }

  @BeforeTest
  public void beforeTest() {
    System.out.println("----------------------------------------------");
    System.out.println("NgBaseTest beforeTest class                   ");
    System.out.println("----------------------------------------------");
  }

  @AfterTest
  public void afterTest() {
    System.out.println("----------------------------------------------");
    System.out.println("NgBaseTest afterTest class");
    System.out.println("----------------------------------------------");
  }
}
