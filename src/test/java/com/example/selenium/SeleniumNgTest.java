package com.example.selenium;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;

public class SeleniumNgTest {
//  SeleniumServer server = null;
//  @BeforeSuite(alwaysRun = true)
//  public void setupBeforeSuite(ITestContext context) {
//    String seleniumHost = context.getCurrentXmlTest().getParameter("selenium.host");
//    String seleniumPort = context.getCurrentXmlTest().getParameter("selenium.port");
//    String seleniumBrowser = context.getCurrentXmlTest().getParameter("selenium.browser");
//    String seleniumUrl = context.getCurrentXmlTest().getParameter("selenium.url");
//  }
//    RemoteControlConfiguration rcc = new RemoteControlConfiguration();
//    rcc.setSingleWindow(true);
//    rcc.setPort(Integer.parseInt(seleniumPort));
//
//    try {
//      server = new SeleniumServer(false, rcc);
//      server.boot();
//    } catch (Exception e) {
//      throw new IllegalStateException("Can't start selenium server", e);
//    }
//
//    proc = new HttpCommandProcessor(seleniumHost, Integer.parseInt(seleniumPort),
//        seleniumBrowser, seleniumUrl);
//    selenium = new DefaultSelenium(proc);
//    selenium.start();
//  }
//
//  @AfterSuite(alwaysRun = true)
//  public void setupAfterSuite() {
//    selenium.stop();
//    server.stop();
//  }


//  private WebDriver driver;
//  private String baseUrl;
//  private boolean acceptNextAlert = true;
//  private StringBuffer verificationErrors = new StringBuffer();
//
//  @BeforeClass(alwaysRun = true)
//  public void setUp() throws Exception {
//    driver = new FirefoxDriver();
//    baseUrl = "${baseURL}";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//  }
//
//  @Test
//  public void TestZSF()throws Exception
//  {
//
//  }
//
//  @AfterClass(alwaysRun = true)
//  public void tearDown() throws Exception {
//    driver.quit();
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
//  }
//
//  private boolean isElementPresent(By by) {
//    try {
//      driver.findElement(by);
//      return true;
//    } catch (NoSuchElementException e) {
//      return false;
//    }
//  }
//
//  private boolean isAlertPresent() {
//    try {
//      driver.switchTo().alert();
//      return true;
//    } catch (NoAlertPresentException e) {
//      return false;
//    }
//  }
//
//  private String closeAlertAndGetItsText() {
//    try {
//      Alert alert = driver.switchTo().alert();
//      String alertText = alert.getText();
//      if (acceptNextAlert) {
//        alert.accept();
//      } else {
//        alert.dismiss();
//      }
//      return alertText;
//    } finally {
//      acceptNextAlert = true;
//    }
//  }
}
