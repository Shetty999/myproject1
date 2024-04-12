package Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver rdriver;

    public Login(WebDriver rdriver)

    {
        this.rdriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

}
