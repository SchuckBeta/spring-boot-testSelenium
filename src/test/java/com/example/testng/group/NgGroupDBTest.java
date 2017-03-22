package com.example.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class NgGroupDBTest {
  @BeforeGroups("database")
  public void setupDB() {
    System.out.println("NgGroupDBTest setupDB()");
  }

  @AfterGroups("database")
  public void cleanDB() {
    System.out.println("NgGroupDBTest cleanDB()");
  }

  @Test(groups= "selenium-test")
  public void runSelenium() {
    System.out.println("NgGroupDBTest runSelenium()");
  }

  @Test(groups= "selenium-test")
  public void runSelenium1() {
    System.out.println("NgGroupDBTest runSelenium1()");
  }

  @Test(groups = "database")
  public void testConnectOracle() {
    System.out.println("NgGroupDBTest testConnectOracle()");
  }

  @Test(groups = "database")
  public void testConnectMsSQL() {
    System.out.println("NgGroupDBTest testConnectMsSQL");
  }

  @Test(groups = {"mysql","database"})
  public void NgGroupDBMsSQL() {
    System.out.println("NgGroupDBTest testConnectMsSQL");
  }

  @Test(dependsOnGroups = {"database","selenium-test"})
  public void runFinal() {
    System.out.println("NgGroupDBTest runFinal");
  }
}
