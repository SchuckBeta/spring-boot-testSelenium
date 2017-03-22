package com.example.testng.group;

import org.testng.annotations.Test;

@Test(groups= "selenium-test")
public class NgGroupDBSeleniumTest {

  public void runSelenium() {
    System.out.println("NgGroupDBSeleniumTest runSelenium()");
  }

  public void runSelenium1() {
    System.out.println("NgGroupDBSeleniumTest runSelenium1()");
  }
}
