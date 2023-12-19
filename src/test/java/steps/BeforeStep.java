package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import com.codeborne.selenide.Selenide;

public class BeforeStep {

    @Before
    public void openUrl() {
        Configuration.headless = true;
        Selenide.open("https://www.google.com/");
    }
}
