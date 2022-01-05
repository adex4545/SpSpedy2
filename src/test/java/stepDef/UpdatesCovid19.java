package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class UpdatesCovid19 {

        WebDriver driver;

        @Given("That  I am viewing the DIY webpage")
        public void that_I_am_viewing_the_DIY_webpage() {
        System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Drivers\\Driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://uat11.speedyservices.com/diy");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("userName")).sendKeys("test.user2@test.com");
        driver.findElement(By.id("Password")).sendKeys("Test02");
        driver.findElement(By.name("submitBtn")).click();
        driver.findElement(By.xpath("//nav[@class='main-navigation-tabs']//a[normalize-space()='DIY']")).click();
     }

      @When("I press the {string} button")
      public void i_press_the_button(String string) {
      driver.findElement(By.xpath("//span[normalize-space()='COVID-19 Service Updates']")).click();
          System.out.println("covid 19 services is pressed");
     }
      @Then("The {string} page will be displayed same as B2B but with B2C theme")
      public void the_page_will_be_displayed_same_as_B2B_but_with_B2C_theme(String string) {

       String ActualTitle=driver.getTitle();
       String ExpectedTitle ="Covid 19: Customer Notice";
       Assert.assertEquals(ExpectedTitle,ActualTitle);

       driver.close();
    }
}
