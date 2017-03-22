package com.example.testng.params;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NgParamsDataProviderTest {
  @DataProvider(name = "innerArrs")
  public Object[][] returnData() {
    return new Object[][] {
      new Object[] { 9, "kkkkkkkk" },
      new Object[] { 10, "jjjjjjjj" },
    };
  }

  @Test(groups={"dpInner"}, dataProvider = "innerArrs")
  public void testNgDPInner(Integer n, String s) {
    System.out.println( n + s );
  }

  @Test(groups={"dpOuter"}, dataProvider = "getArrs", dataProviderClass = DataProviderUtil.class)
  public void testNgDPOuter(Integer n, String s) {
    System.out.println( n + s );
  }

  @AfterClass
  public void afterClass() {
    System.out.println("NgParamsDataProviderTest after class");
  }

  @BeforeClass
  public void beforeClass() {
      System.out.println("NgParamsDataProviderTest before class");
  }

  @BeforeTest
  public void beforeTest() {
    System.out.println("----------------------------------------------");
    System.out.println("NgParamsDataProviderTest beforeTest class                   ");
    System.out.println("----------------------------------------------");
  }

  @AfterTest
  public void afterTest() {
    System.out.println("----------------------------------------------");
    System.out.println("NgParamsDataProviderTest afterTest class");
    System.out.println("----------------------------------------------");
  }
}
