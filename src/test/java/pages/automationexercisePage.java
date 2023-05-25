package pages;


import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static com.github.dockerjava.api.model.Driver.*;

public class automationexercisePage {
    public automationexercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
