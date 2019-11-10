package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfoClass {
    WebDriver driver;

    @FindBy(xpath = "//a[@class='btn btn-primary padding-horizontal-50']")//Click StartedWithFreeAccount button
    WebElement getStartedWithFreeAccount;
    @FindBy(xpath = "//input[@placeholder='First name']")//send First Name
    WebElement enterFirstName;
    @FindBy(xpath = "//input[@placeholder='Last name']")//send Last Name
    WebElement enterLastName;
    @FindBy(xpath = "//input[@placeholder='Email']")// send Email
    WebElement enterEmail;
    @FindBy(xpath = "//input[@id='password']")//send password
     WebElement enterPassword;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-block']")// click continueButton
    WebElement continueButton;

    @FindBy(name = "zipCode")// enter code
    WebElement enterCode;
    @FindBy(id = "ms1")// enter Country
    WebElement enterCountry;
    @FindBy(xpath = "//button[@class='btn btn-primary']")// click continueButton
    WebElement couButton;

    @FindBy(xpath = "//input[@placeholder='Job Title']")// Enter Job Title
    WebElement enterJob;
    @FindBy(xpath = "//input[@placeholder='Company *']")// Enter Company
    WebElement enterCompany;
    @FindBy(xpath = "//input[@placeholder='Start Date *']")// Enter Start Date
    WebElement EnterStarDue;
    @FindBy(xpath = "//div[@class='form-with-remove']//div[1]//dp-date-picker[1]//div[2]//div[1]//dp-month-calendar[1]//div[1]//div[1]//div[1]//button[3]")// click month
    WebElement chooseMonth;
    @FindBy(xpath = "//button[@class='btn btn-primary']")// click continue
    WebElement clickNext;

    @FindBy(xpath = "//button[@class='btn btn-link margin-top-25']")// click SKIP
    WebElement clickSkip;
    @FindBy(xpath = "//label[3]//span[1]")// choose radiobutton
    WebElement chooseRadioButton;
    @FindBy(xpath = "//button[@class='btn btn-primary']")// click continue
    WebElement clickNextPage;
    @FindBy(xpath = "//h1[@class='text-center text-bold margin-bottom-0']")// check Your profile is almost ready!
    WebElement myProfile;


    public InfoClass(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setGetStartedWithFreeAccount() {
        getStartedWithFreeAccount.click(); //Click StartedWithFreeAccount button
    }
    public void setEnterFirstName(String origin) {
        enterFirstName.sendKeys(origin); //send First Name
    }
    public void setEnterLastName(String origin) {
        enterLastName.sendKeys(origin); //send Last Name
    }
    public void setEnterEmail(String origin) {
        enterEmail.sendKeys(origin); // send Email
    }
    public void setEnterPassword(String origin) {
        enterPassword.sendKeys(origin); //send password
    }
    public void setContinueButton() {
        continueButton.click(); // click continueButton
    }
    public void setEnterCode(String origin) {
        enterCode.sendKeys(origin); // click continueButton
    }
    public void setEnterCountry(String origin) {
        enterCountry.sendKeys(origin); // click continueButton
    }
    public void setCouButton() {
        couButton.click(); // click continueButton
    }
    public void setEnterJob(String origin) {
        enterJob.sendKeys(origin); // Enter Job Title
    }
    public void setEnterCompany(String origin) {
        enterCompany.sendKeys(origin); // Enter Company
    }
    public void setEnterStarDue() {
        EnterStarDue.click(); // Enter Start Date
    }
    public void setChooseMonth() {
        chooseMonth.click(); // click month
    }
    public void setClickNext() {
        clickNext.click(); // click continue
    }
    public void setClickSkip() {
        clickSkip.click(); // click SKIP
    }
    public void setChooseRadioButton() {
        chooseRadioButton.click(); // choose radiobutton
    }
    public void setClickNextPage() {
        clickNextPage.click(); // click continue
    }

}
