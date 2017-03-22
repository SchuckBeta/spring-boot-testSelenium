package com.example.testng.group;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NgGroupTest {

  @Test(groups = {"groupAno"})
  public void testNgGroupAno() {
    System.out.println("NgGroupTest TestNG test case 1");
  }

  @Test(groups = {"groupAno"})
  public void testNgGroupAno2() {
    System.out.println("NgGroupTest TestNG test case 2");
  }

  @Test(groups = {"groupException"}, expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp="Runtime")
  public void testNgGroupException() {
    System.out.println("NgGroupTest TestNG test case 3");
    throw new RuntimeException("Runtime");
  }

  @Test(groups = {"groupException"}, expectedExceptions = IndexOutOfBoundsException.class)
  public void testNgGroupException2() {
    System.out.println("NgGroupTest TestNG test case 4");
    throw new IndexOutOfBoundsException("Runtime");
  }

  @Test(groups = {"groupIgnore"})
  public void testNgIgnore() {
    System.out.println("NgGroupTest TestNG test case 5");
  }

  @Test(groups = {"groupParam"}, dataProvider = "dp")
  public void testNgGroupParam(Integer n, String s) {
    System.out.println("NgGroupTest TestNG test case 6"+n);
    System.out.println("{5" + n + ":" + s + "}");
  }

  @Test(groups = {"groupParam"}, dataProvider = "dp")
  public void testNgGroupParam2(Integer n, String s) {
    System.out.println("NgGroupTest TestNG test case 7"+n);
    System.out.println("{6" + n + ":" + s + "}");
  }

  @DataProvider
  public Object[][] dp() {
    System.out.println("NgGroupTest dp class");
    return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, new Object[] { 3, "c" }};
  }

  @AfterClass
  public void afterClass() {
    System.out.println("NgGroupTest after class");
  }

  @BeforeClass
  public void beforeClass() {
      System.out.println("NgGroupTest before class");
  }

  @BeforeTest
  public void beforeTest() {
    System.out.println("----------------------------------------------");
    System.out.println("NgGroupTest beforeTest class                   ");
    System.out.println("----------------------------------------------");
  }

  @AfterTest
  public void afterTest() {
    System.out.println("----------------------------------------------");
    System.out.println("NgGroupTest afterTest class");
    System.out.println("----------------------------------------------");
  }
}
