package steps;

import io.cucumber.java.Before;
import com.codeborne.selenide.Selenide;

public class BeforeStep {

    @Before
    public void openUrl() {
        Selenide.open("https://www.google.com/");
    }
}
