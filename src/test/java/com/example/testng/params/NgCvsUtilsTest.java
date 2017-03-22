package com.example.testng.params;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.example.utils.CvsUtils;

public class NgCvsUtilsTest {
  private static final String CSV_FILE_PATH = "E:\\workspace-sts\\spring-group\\src\\test\\resources\\testdata1.csv";
//  private static final String CSV_FILE_PATH2 = "E:\\workspace-sts\\spring-group\\src\\test\\resources\\testdata2.csv";

  @Test
  public void testNgCvsReadAll() {
//  System.out.println(CvsUtils.readNext(CSV_FILE_PATH));
    List<String[]> list =  CvsUtils.readAll(CSV_FILE_PATH);
    for (int i = 0; i < list.size(); i++) {
      String[] strings = list.get(i);
      for (int j = 0; j < strings.length; j++) {
        System.out.print(strings[j]);
        System.out.print("  | ");
      }
      System.out.println();
    }
  }

  @Test
  public void testNgCvsWriteNext() {
    String[] params = new String[]{"zhangsan", "lisi", "xiaoming"};
    String[] params1 = new String[]{"zhangsan1", "lisi1", "xiaoming1"};
    String[] params2 = new String[]{"zhangsan2", "lisi2", "xiaoming2"};
    List<String[]> paramlists = new ArrayList<String[]>();
    paramlists.add(params);
    paramlists.add(params1);
    paramlists.add(params2);
    System.out.println(CvsUtils.writeNext(CSV_FILE_PATH, params));
    System.out.println(CvsUtils.writeAll(CSV_FILE_PATH, paramlists));
  }

}
