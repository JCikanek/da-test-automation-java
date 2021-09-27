package cz.czechitas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HlavniProgram {

    public void run() throws Exception {
//      System.setProperty("webdriver.gecko.driver", System.getProperty("user.home") + "/Java-Training/Selenium/geckodriver");
        System.setProperty("webdriver.gecko.driver", "C:\\Java-Training\\Selenium\\geckodriver.exe");

        WebDriver prohlizec;
        prohlizec = new FirefoxDriver();
        prohlizec.navigate().to("https://automation-playground.czechitas.repl.co/");

        WebElement zalozkaTabulka = prohlizec.findElement(By.id("table"));
        zalozkaTabulka.click();

        List<WebElement> seznamZvirat = prohlizec.findElements(By.xpath("//table/tbody/tr/td[1]"));
        for (int i = 0; i < seznamZvirat.size(); i++) {
            WebElement jednoZvire = seznamZvirat.get(i);
            System.out.println(jednoZvire.getText());
        }

        int lvlUzasnostiCelkem = 0;
        List<WebElement> seznamLeveluUzasnosti = prohlizec.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for (int i = 0; i < seznamLeveluUzasnosti.size(); i++) {
            WebElement jedenLvlUzasnosti = seznamLeveluUzasnosti.get(i);
            String textovaHodnotaLvlUzasnosti = jedenLvlUzasnosti.getText();
            int lvlUzasnosti = Integer.parseInt(textovaHodnotaLvlUzasnosti);
            lvlUzasnostiCelkem = lvlUzasnostiCelkem + lvlUzasnosti;
        }
        System.out.println("Celkem jsou zvirata uzasna: " + lvlUzasnostiCelkem);

        Thread.sleep(5_000);

        WebElement zalozkaItems = prohlizec.findElement(By.xpath("//li[@class='nav-item' and @id='adding']/a"));
        zalozkaItems.click();

        WebElement tlacitkoPridejKocku = prohlizec.findElement(By.id("addItem"));
        tlacitkoPridejKocku.click();
        tlacitkoPridejKocku.click();
        tlacitkoPridejKocku.click();
        tlacitkoPridejKocku.click();

        List<WebElement> seznamKocek = prohlizec.findElements(By.className("cat"));
        int pocetKocek = seznamKocek.size();
        WebElement polickoSPocitadlemKocek = prohlizec.findElement(By.id("counter"));
        String pocitadloKocekText = polickoSPocitadlemKocek.getText();
        int pocitadloKocek = Integer.parseInt(pocitadloKocekText);
        System.out.println("Pocet kocek na strance je " + pocetKocek);
        System.out.println("Pocitadlo ukazuje " + pocitadloKocek);
        if (pocetKocek == pocitadloKocek) {
            System.out.println("A je to spravne!");
        } else {
            System.out.println("A nesedi to!");
        }

        Thread.sleep(10_000);
        prohlizec.quit();
    }
}
