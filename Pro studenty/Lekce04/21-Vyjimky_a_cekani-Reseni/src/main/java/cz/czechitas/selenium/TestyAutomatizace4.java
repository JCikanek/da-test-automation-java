package cz.czechitas.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestyAutomatizace4 {

    WebDriver prohlizec;

    @BeforeEach
    public void setUp() {
//      System.setProperty("webdriver.gecko.driver", System.getProperty("user.home") + "/Java-Training/Selenium/geckodriver");
        System.setProperty("webdriver.gecko.driver", "C:\\Java-Training\\Selenium\\geckodriver.exe");
        prohlizec = new FirefoxDriver();
//        prohlizec.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        prohlizec.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @Test
    public void poStiskuTlacikaLoginMusiBytZobrazenaStrankaLoggedIn() {
        prohlizec.navigate().to("https://automation.shinekamil.repl.co/login.html");

        WebElement polickoUsername = prohlizec.findElement(By.id("login-username"));
        WebElement polickoPassword = prohlizec.findElement(By.id("login-password"));
        WebElement tlacitkoPrihlasit = prohlizec.findElement(By.id("login-submit"));
        polickoUsername.sendKeys("czechitas");
        polickoPassword.sendKeys("D4Ostr4v42020");
        tlacitkoPrihlasit.click();

        WebElement hlaseniLogged = prohlizec.findElement(By.xpath("//h1[text() = 'LOGGED!']"));
        Assertions.assertNotNull(hlaseniLogged);
    }

    @Test
    public void poStiskuTlacikaShowMeSecretMusiBytZobrazenaHlaska() {
        prohlizec.navigate().to("https://automation.shinekamil.repl.co/loading.html");

        WebElement tlacitkoShowMeSecret = prohlizec.findElement(By.id("loading-button"));
        tlacitkoShowMeSecret.click();

//        WebElement tajnaHlaska = prohlizec.findElement(By.xpath("//*[@class = 'qa-secret']"));
//        Assertions.assertNotNull(tajnaHlaska);
//        System.out.println("Tajna hlaska je pritomna");

        WebDriverWait cekani = new WebDriverWait(prohlizec, 10);
        cekani.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'qa-secret']")));
        System.out.println("Tajna hlaska je opravdu pritomna");
    }

    @Test
    public void poStiskuTlacikaShowMeSecretMusiZmizetUkazatelNahravani() {
        prohlizec.navigate().to("https://automation.shinekamil.repl.co/loading.html");

        WebElement tlacitkoShowMeSecret = prohlizec.findElement(By.id("loading-button"));
        tlacitkoShowMeSecret.click();

        WebDriverWait cekani = new WebDriverWait(prohlizec, 10);
        cekani.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading-spinner")));
    }


    @AfterEach
    public void tearDown() {
        prohlizec.quit();
    }
}
