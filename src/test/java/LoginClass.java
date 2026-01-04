import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginClass extends BaseTest {
    @Test
    public void loginClass(){
        driver.findElement(By.id("luser")).sendKeys("hs.1512150@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Qwerty@123*#");
        driver.findElement(By.className("signin-button")).click();
        //driver.findElement(By.className("inline-block")).click();
        //driver.findElement(By.xpath("//span[contains(text(),'Edit Profile')]")).click();

    }
}
