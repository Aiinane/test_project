package GoogleTest;

import ParentTest.ParentTest;
import org.testng.annotations.Test;


public class Googletest extends ParentTest {
   // WebDriver webDriver;
    @Test
    public void googleTest(){







       // webDriver.findElement(By.xpath(".//img[@alt='Google']"));


        googlePage.openGoogle();
        // webDriver.get("https://www.google.com/");

        googlePage.enterTextforG("maven selemium java");
        //  webDriver.findElement(By.xpath(".//input[@type='text']")).sendKeys("maven selemium java");

        googlePage.clickOnSubmit();
        // webDriver.findElement(By.xpath(".//div[5]/center[1]/input[1]")).click();
        //System.out.println("page was open");



        }




}
