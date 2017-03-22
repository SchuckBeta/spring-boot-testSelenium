package com.example.testng.params;

import org.testng.annotations.DataProvider;

public class DataProviderUtil {
  /**
   *获取数组.
   * @return 返回二维数组
   */
  @DataProvider(name = "getArrs")
  public static Object[][] getArrs() {
    return new Object[][] {
      new Object[] { 5, "e" },
      new Object[] { 6, "f" },
      new Object[] { 7, "g" },
      new Object[] { 8, "h" },
      new Object[] { 8, "h" },
      new Object[] { 8, "h" },
      new Object[] { 8, "h-1" },
      new Object[] { 8, "h-2" }
    };
  }
}
