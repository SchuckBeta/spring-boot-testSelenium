package com.example.testng.depends;

import org.testng.annotations.Test;

public class NgDependsMethodTest {
  @Test
  public void testNgInner() {
      System.out.println("NgDependsMethodTest TestNG test case 1");
  }

  @Test(dependsOnMethods={"testNgInner"})
  public void testNgInnerDepends() {
      System.out.println("NgDependsMethodTest TestNG test case 2");
  }
}
