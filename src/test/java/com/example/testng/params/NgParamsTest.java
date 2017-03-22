package com.example.testng.params;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NgParamsTest {
  private static Logger logger = Logger.getLogger(NgParamsTest.class);

  @Test(groups={"xml"})
  @Parameters({"name", "age", "sex"})
  public void testNgXmlParamers(String name, Integer age, String sex) {
    System.out.println("NgParamsTest TestNG test case 1 +["+name+"-"+age+"-"+sex+"]");
  }

  @Test(groups={"xml"})
  @Parameters({"name", "age", "sex"})
  public void testNgXmlParamersOverride(String name, Integer age, String sex) {
    System.out.println("NgParamsTest TestNG test case 2 +["+name+"-"+age+"-"+sex+"]");
  }

  @AfterClass
  public void afterClass() {
    System.out.println("NgParamsTest after class");
  }

  @BeforeClass
  public void beforeClass() {
      System.out.println("NgParamsTest before class");
  }

  @BeforeTest
  public void beforeTest() {
    System.out.println("----------------------------------------------");
    System.out.println("NgParamsTest beforeTest class                   ");
    System.out.println("----------------------------------------------");
  }

  @AfterTest
  public void afterTest() {
    System.out.println("----------------------------------------------");
    System.out.println("NgParamsTest afterTest class");
    System.out.println("----------------------------------------------");
  }
}
