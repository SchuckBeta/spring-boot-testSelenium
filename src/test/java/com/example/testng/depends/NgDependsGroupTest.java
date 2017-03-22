package com.example.testng.depends;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NgDependsGroupTest {
  @Test(groups= "dependsGB")
  public void testNgDependsGB() {
      System.out.println("NgDependsGroupTest TestNG test case 1");
  }

  @Test(groups= "dependsGB")
  public void testNgDependsGB2() {
      System.out.println("NgDependsGroupTest TestNG test case 2");
  }

  @Test(dependsOnGroups={"group-class"})
  public void testNgDependsGroupClazz() {
      System.out.println("NgDependsGroupTest TestNG test case 3");
  }

  @Test(dependsOnGroups={"dependsGB"})
  public void testNgDependsGroupMethod() {
      System.out.println("NgDependsGroupTest TestNG test case 4");
  }

  @Test(dependsOnGroups={"dependsGB", "dependsA", "dependsC"})
  public void testNgDependsGroupMethod2() {
      System.out.println("NgDependsGroupTest TestNG test case 5");
  }

  @AfterClass
  public void afterClass() {
    System.out.println("NgDependsGroupTest after class");
  }

  @BeforeClass
  public void beforeClass() {
      System.out.println("NgDependsGroupTest before class");
  }

  @BeforeTest
  public void beforeTest() {
    System.out.println("----------------------------------------------");
    System.out.println("NgDependsGroupTest beforeTest class                   ");
    System.out.println("----------------------------------------------");
  }

  @AfterTest
  public void afterTest() {
    System.out.println("----------------------------------------------");
    System.out.println("NgDependsGroupTest afterTest class");
    System.out.println("----------------------------------------------");
  }
}
