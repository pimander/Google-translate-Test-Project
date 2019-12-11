import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTranslateTestProject {


    private WebDriver driver;

    @Before

    public void preparationForTest(){

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://translate.google.com");
        driver.manage().window().maximize();
        System.out.println("1.Main page");
    }

    @Test
    //GT-05-3 Translate English -> Russian
    public void TranslateEnglishRussian() throws InterruptedException {


        driver.findElement(By.xpath("/html/body[@class='displaying-homepage']/div[@class='frame']/div[1]/div[@class='homepage-content-wrap']//div[@class='sl-wrap']/div[@role='button']")).click();
        System.out.println("2. Click on button left language list");
        Thread.sleep(2000);
        System.out.println("3. Open left List");
        driver.findElement(By.cssSelector("[onclick='_e\\(event\\, \\'changeLanguage\\+0\\'\\, \\'sl_list_en\\'\\)']")).click();
        System.out.println("4. Select English for left window");
        Thread.sleep(2000);


        driver.findElement(By.xpath("/html/body[@class='displaying-homepage']/div[@class='frame']/div[1]/div[@class='homepage-content-wrap']//div[@class='tl-wrap']/div[@role='button']")).click();
        System.out.println("5. Click on button right language list");
        Thread.sleep(2000);
        System.out.println("6. Open right List");
        driver.findElement(By.cssSelector("[onclick='_e\\(event\\, \\'changeLanguage\\+0\\'\\, \\'tl_list_ru\\'\\)']")).click();
        System.out.println("7. Select Russian for right window");
        Thread.sleep(2000);


        driver.findElement(By.xpath("/html//textarea[@id='source']")).sendKeys("Hello Google!");
        System.out.println("8.Enter Text 'Hello Google!' to left window");
        Thread.sleep(2000);


        WebElement element = driver.findElement(By.xpath("/html/body[@class='displaying-homepage show-result']/div[@class='frame']/div[1]/div[@class='homepage-content-wrap']//div[@class='text-wrap tlid-copy-target']"));

        String foundText = element.getText();

        Assert.assertEquals("Привет, Google!", foundText);
        System.out.println("9. Text 'Привет, Google!' in right window");


    }

    @Test
    //GT-05-4	Translate Russian -> English
    public void TranslateRussianEnglish() throws InterruptedException {


        driver.findElement(By.xpath("/html/body[@class='displaying-homepage']/div[@class='frame']/div[1]/div[@class='homepage-content-wrap']//div[@class='sl-wrap']/div[@role='button']")).click();
        System.out.println("2. Click on button left language list");
        Thread.sleep(2000);
        System.out.println("3. Open left List");
        driver.findElement(By.cssSelector("[onclick='_e\\(event\\, \\'changeLanguage\\+0\\'\\, \\'sl_list_ru\\'\\)']")).click();
        System.out.println("4. Select Russian for left window");
        Thread.sleep(2000);


        driver.findElement(By.xpath("/html/body[@class='displaying-homepage']/div[@class='frame']/div[1]/div[@class='homepage-content-wrap']//div[@class='tl-wrap']/div[@role='button']")).click();
        System.out.println("5. Click on button right language list");
        Thread.sleep(2000);
        System.out.println("6. Open right List");
        driver.findElement(By.cssSelector("[onclick='_e\\(event\\, \\'changeLanguage\\+0\\'\\, \\'tl_list_en\\'\\)']")).click();
        System.out.println("7. Select English for right window");
        Thread.sleep(2000);


        driver.findElement(By.xpath("/html//textarea[@id='source']")).sendKeys("Привет, Гугл!");
        System.out.println("8.Enter Text 'Привет, Гугл!' to left window");
        Thread.sleep(2000);


        WebElement element = driver.findElement(By.xpath("/html/body[@class='displaying-homepage show-result']/div[@class='frame']/div[1]/div[@class='homepage-content-wrap']//div[@class='text-wrap tlid-copy-target']"));

        String foundText = element.getText();

        Assert.assertEquals("Hi google!", foundText);
        System.out.println("9. Text 'Hi google!' in right window");


    }

    @Test
    //GT-05-5	Translate Italian -> Russian
    public void TranslateItalianRussian() throws InterruptedException {


        driver.findElement(By.xpath("/html/body[@class='displaying-homepage']/div[@class='frame']/div[1]/div[@class='homepage-content-wrap']//div[@class='sl-wrap']/div[@role='button']")).click();
        System.out.println("2. Click on button left language list");
        Thread.sleep(2000);
        System.out.println("3. Open left List");
        driver.findElement(By.cssSelector("[onclick='_e\\(event\\, \\'changeLanguage\\+0\\'\\, \\'sl_list_it\\'\\)']")).click();
        System.out.println("4. Select Italian for left window");
        Thread.sleep(2000);


        driver.findElement(By.xpath("/html/body[@class='displaying-homepage']/div[@class='frame']/div[1]/div[@class='homepage-content-wrap']//div[@class='tl-wrap']/div[@role='button']")).click();
        System.out.println("5. Click on button right language list");
        Thread.sleep(2000);
        System.out.println("6. Open right List");
        driver.findElement(By.cssSelector("[onclick='_e\\(event\\, \\'changeLanguage\\+0\\'\\, \\'tl_list_ru\\'\\)']")).click();
        System.out.println("7. Select Russian for right window");
        Thread.sleep(2000);


        driver.findElement(By.xpath("/html//textarea[@id='source']")).sendKeys("Andare a pesca.");
        System.out.println("8.Enter Text 'Andare a pesca.' to left window");
        Thread.sleep(2000);


        WebElement element = driver.findElement(By.xpath("/html/body[@class='displaying-homepage show-result']/div[@class='frame']/div[1]/div[@class='homepage-content-wrap']//div[@class='text-wrap tlid-copy-target']"));

        String foundText = element.getText();

        Assert.assertEquals("Иди на рыбалку.", foundText);
        System.out.println("9. Text 'Иди на рыбалку.' in right window");


    }

    @Test
    //GT-05-6	Translate Russian -> Italian
    public void TranslateRussianItalian() throws InterruptedException {


        driver.findElement(By.xpath("/html/body[@class='displaying-homepage']/div[@class='frame']/div[1]/div[@class='homepage-content-wrap']//div[@class='sl-wrap']/div[@role='button']")).click();
        System.out.println("2. Click on button left language list");
        Thread.sleep(2000);
        System.out.println("3. Open left List");
        driver.findElement(By.cssSelector("[onclick='_e\\(event\\, \\'changeLanguage\\+0\\'\\, \\'sl_list_ru\\'\\)']")).click();
        System.out.println("4. Select Russian for left window");
        Thread.sleep(2000);


        driver.findElement(By.xpath("/html/body[@class='displaying-homepage']/div[@class='frame']/div[1]/div[@class='homepage-content-wrap']//div[@class='tl-wrap']/div[@role='button']")).click();
        System.out.println("5. Click on button right language list");
        Thread.sleep(2000);
        System.out.println("6. Open right List");
        driver.findElement(By.cssSelector("[onclick='_e\\(event\\, \\'changeLanguage\\+0\\'\\, \\'tl_list_it\\'\\)']")).click();
        System.out.println("7. Select Italian for right window");
        Thread.sleep(2000);


        driver.findElement(By.xpath("/html//textarea[@id='source']")).sendKeys("Это круто");
        System.out.println("8.Enter Text 'Это круто' to left window");
        Thread.sleep(2000);


        WebElement element = driver.findElement(By.xpath("/html/body[@class='displaying-homepage show-result']/div[@class='frame']/div[1]/div[@class='homepage-content-wrap']//div[@class='text-wrap tlid-copy-target']"));

        String foundText = element.getText();

        Assert.assertEquals("È fantastico", foundText);
        System.out.println("9. Text 'È fantastico' in right window");


    }


    @After
    public void CloseWindow(){
      driver.quit();
    }
}
