package webElements;


import javax.swing.JLabel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebElements {

    private static void setIEqualizerIcon(JLabel jLabel) {
        jLabel.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\eq.gif")); // NOI18N
    }

    public static void clickOnButtonStop(WebDriver driver, WebElement webElement, JLabel jLabel) {
        webElement = driver.findElement(By.cssSelector("#jp_container_1 > div > div.jp-gui.jp-interface > ul > li:nth-child(3) > a"));
        webElement.click();
        setIEqualizerIcon(jLabel);
    }

    public static void clickOnButtonPlay(WebDriver driver, WebElement webElement, JLabel jLabel) {
        webElement = driver.findElement(By.cssSelector("#jp_container_1 > div > div.jp-gui.jp-interface > ul > li:nth-child(1) > a"));
        webElement.click();
        setIEqualizerIcon(jLabel);
    }

    public static void clickOnRadioFree(WebDriver driver, WebElement webElement, JLabel labelRadio, JLabel labelLogo, JLabel jLabel) {
        webElement = driver.findElement(By.cssSelector("#block-views-radio-list-block-1 > div > div > div.view-content > div > div:nth-child(50) > a"));
        webElement.click();
        labelRadio.setText("Radio Free");
        labelLogo.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\radiofree.jpg")); // NOI18N
        setIEqualizerIcon(jLabel);
    }

    public static void clickOnRmffm(WebDriver driver, WebElement webElement, JLabel labelRadio, JLabel labelLogo, JLabel jLabel) {
        webElement = driver.findElement(By.cssSelector("#block-views-radio-list-block-1 > div > div > div.view-content > div > div:nth-child(1) > a"));
        webElement.click();
        labelRadio.setText("RMF FM");
        labelLogo.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\rmfFm.png")); // NOI18N
        setIEqualizerIcon(jLabel);
    }

    public static void clickOnVoxfmButton(WebDriver driver, WebElement webElement, JLabel labelRadio, JLabel labelLogo, JLabel jLabel) {
        webElement = driver.findElement(By.cssSelector("#block-views-radio-list-block-1 > div > div > div.view-content > div > div:nth-child(39) > a"));
        webElement.click();
        labelRadio.setText("VOX FM");
        labelLogo.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\VoxFm.png")); // NOI18N
        setIEqualizerIcon(jLabel);
    }

    public static void clickOnRmfmaxButton(WebDriver driver, WebElement webElement, JLabel labelRadio, JLabel labelLogo, JLabel jLabel) {
        webElement = driver.findElement(By.cssSelector("#block-views-radio-list-block-1 > div > div > div.view-content > div > div:nth-child(11) > a"));
        webElement.click();
        labelRadio.setText("RMF MAXXX");
        labelLogo.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\rmfMaxx.jpg")); // NOI18N
        setIEqualizerIcon(jLabel);
    }

    public static void clickOnEskaRockButton(WebDriver driver, WebElement webElement, JLabel labelRadio, JLabel labelLogo, JLabel jLabel) {
        webElement = driver.findElement(By.cssSelector("#block-views-radio-list-block-1 > div > div > div.view-content > div > div:nth-child(4) > a"));
        webElement.click();
        labelRadio.setText("ESKA ROCK");
        labelLogo.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\eskarock.jpg")); // NOI18N
        setIEqualizerIcon(jLabel);
    }

    public static void clickOnRadioPlusButton(WebDriver driver, WebElement webElement, JLabel labelRadio, JLabel labelLogo, JLabel jLabel) {
        webElement = driver.findElement(By.cssSelector("#block-views-radio-list-block-1 > div > div > div.view-content > div > div:nth-child(5) > a"));
        webElement.click();
        labelRadio.setText("Radio Plus");
        labelLogo.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\radipPlus.png")); // NOI18N
        setIEqualizerIcon(jLabel);
    }

    public static void clickOnradioZetButton(WebDriver driver, WebElement webElement, JLabel labelRadio, JLabel labelLogo, JLabel jLabel) {
        webElement = driver.findElement(By.cssSelector("#block-views-radio-list-block-1 > div > div > div.view-content > div > div:nth-child(2) > a"));
        webElement.click();
        labelRadio.setText("Radio Zet");
        labelLogo.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\radiozet.jpg")); // NOI18N
        setIEqualizerIcon(jLabel);
    }

    public static void clickOnRadioZetGoldButton(WebDriver driver, WebElement webElement, JLabel labelRadio, JLabel labelLogo, JLabel jLabel) {
        webElement = driver.findElement(By.cssSelector("#block-views-radio-list-block-1 > div > div > div.view-content > div > div:nth-child(20) > a"));
        webElement.click();
        labelRadio.setText("ZET Gold");
        labelLogo.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\zetgold.png")); // NOI18N
        setIEqualizerIcon(jLabel);
    }

    public static void clickOnRadioEskaButton(WebDriver driver, WebElement webElement, JLabel labelRadio, JLabel labelLogo, JLabel jLabel) {
        webElement = driver.findElement(By.cssSelector("#block-views-radio-list-block-1 > div > div > div.view-content > div > div:nth-child(3) > a"));
        webElement.click();
        labelRadio.setText("Radio ESKA");
        labelLogo.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\eska.png")); // NOI18N
        setIEqualizerIcon(jLabel);
    }


}
