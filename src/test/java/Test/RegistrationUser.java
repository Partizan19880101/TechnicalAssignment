package Test;

import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RegistrationUser {
    private WebDriver driver;
    private String baseUrl;
    private JavascriptExecutor js;
    InfoClass infoClassDetails;

    @Test
    public void registrationUser() throws InterruptedException, IOException {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        baseUrl = "https://dev2.revetinc.com/";

        infoClassDetails = new InfoClass(driver);

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseUrl);//open base URL
        infoClassDetails.setGetStartedWithFreeAccount();

        infoClassDetails.setEnterFirstName("Pavel");
        infoClassDetails.setEnterLastName("Zuyonok");
        infoClassDetails.setEnterEmail("zuyonok@gmail.ru");
        infoClassDetails.setEnterPassword("QweasHdzxc1/");
        infoClassDetails.setContinueButton();

        infoClassDetails.setEnterCode("220000");
        infoClassDetails.setEnterCountry("Belarus");
        infoClassDetails.setCouButton();

        infoClassDetails.setEnterJob("QA Engineer");
        infoClassDetails.setEnterCompany("OnePoint LTD");
        infoClassDetails.setEnterStarDue();
        infoClassDetails.setChooseMonth();
        infoClassDetails.setClickNext();

        infoClassDetails.setClickSkip();
        infoClassDetails.setClickSkip();
        infoClassDetails.setClickSkip();
        /*driver.findElement(By.xpath("//label[@class='upper text-regular pointer']")).click();
        Runtime.getRuntime().exec("D:\\QA\\Udemy\\TechnicalAssignment\\scripts\\fileupload.exe");*/
        //This code upload jpeg file, but we need to use correct location of file

        infoClassDetails.setChooseRadioButton();
        infoClassDetails.setClickNextPage();
        /*driver.findElement(By.xpath("//span[@class='text-primary']")).click();
        Runtime.getRuntime().exec("D:\QA\Udemy\TechnicalAssignment\scripts\fileupload2.exe");*/
        //This code upload pdf file, but we need to use correct location of file

        infoClassDetails.setClickSkip();
        infoClassDetails.setClickSkip();
        Thread.sleep(3000);

        WebElement welcomeText = null;

        try {
            welcomeText = driver.findElement(By.xpath("//h1[@class='text-center text-bold margin-bottom-0']"));
        }
        catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
        Assert.assertTrue(welcomeText != null);


}

    @After
    public void afterClass() {
        //driver.quit();
    }
}
