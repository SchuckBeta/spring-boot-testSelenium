package com.example.testng.depends;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups="group-class")
public class NgGroupDepTest {

  @Test(groups="dependsA")
  public void testNgGroupDepA() {
      System.out.println("NgGroupDepTest TestNG test case 1");
  }

  @Test(groups="dependsA")
  public void testNgGroupDepA2() {
      System.out.println("NgGroupDepTest TestNG test case 2");
  }

  @Test(groups="dependsB")
  public void testNgGroupDepB() {
      System.out.println("NgGroupDepTest TestNG test case 3");
  }

  @Test(groups="dependsB")
  public void testNgGroupDepB2() {
      System.out.println("NgGroupDepTest TestNG test case 4");
  }

  @Test(groups="dependsC")
  public void testNgGroupDepC() {
      System.out.println("NgGroupDepTest TestNG test case 5");
  }

  @Test(groups="dependsC")
  public void testNgGroupDepC2() {
      System.out.println("NgGroupDepTest TestNG test case 6");
  }
}
