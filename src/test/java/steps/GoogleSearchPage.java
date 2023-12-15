package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.*;

import static com.codeborne.selenide.Selenide.$x;

public class GoogleSearchPage {

    private SelenideElement confirmCookieButton = $x("//div/button[@id='L2AGLb']");
    private SelenideElement clickSearchGoogle = $x("//div/textarea[@name='q']");
    private SelenideElement linkCucumberTutorial = $x("(//div/cite[contains(text(), 'https://cucumber.io')])[1]");

    private SelenideElement buttonAllowCookie = $x("(//div/button[contains(text(), 'Allow all cookies')])[1]");

    private SelenideElement topicDocs = $x("//a[text()='Docs' and @href='#']");

    private SelenideElement buttonInstallation = $x("//div/a[@href='/docs/installation/' and text()='Installation']");

    @Given("confirm cookie in start google page")
    public void confirm_cookie_in_start_google_page() {
        confirmCookieButton.click();

    }

    @When("enter a search word {string}")
    public void enter_a_search_word(String searchValue) {
        clickSearchGoogle.setValue(searchValue).pressEnter();
    }

    @And("and click on the official page Cucumber")
    public void and_click_on_the_official_page_Cucumber() {
        linkCucumberTutorial.shouldBe(Condition.visible, Condition.enabled).shouldHave(Condition.text("cucumber")).click();

    }

    @And("allow cookie on official website")
    public void allow_cookie_on_official_website() {
        buttonAllowCookie.shouldHave(Condition.visible, Condition.enabled).click();
    }

    @And("click on the topic Docs in drop down menu")
    public void click_on_the_topic_Docs_in_drop_down_menu() {
        topicDocs.shouldBe(Condition.visible, Condition.enabled).click();
    }

    @And("click on the button Installation in drop down menu")
    public void click_on_the_button_Installation_in_drop_down_menu() {
        buttonInstallation.shouldBe(Condition.visible, Condition.enabled).shouldHave(Condition.text("Installation")).click();
    }


    @Then("ensure that topic of quick start is onsite")
    public void ensure_that_topic_of_quick_start_is_onsite() {


    }


}
