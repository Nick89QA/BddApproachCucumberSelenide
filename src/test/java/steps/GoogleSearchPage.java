package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.*;

import static com.codeborne.selenide.Selenide.$x;

public class GoogleSearchPage {

    private SelenideElement confirmCookieButton = $x("//div/button[@id='L2AGLb']");
    private SelenideElement clickSearchGoogle = $x("//div/textarea[@name='q']");

    private SelenideElement matchingTextInLinkCucumber = $x("/*[text()='Cucumber: BDD Testing & Collaboration Tools for Teams']");

    private SelenideElement linkCucumber = $x("https://cucumber.io/");
    @Given("confirm cookie in start google page")
    public void confirm_cookie_in_start_google_page() {
        confirmCookieButton.click();

    }

    @When("enter a search word {string}")
    public void enter_a_search_word(String searchValue) {
        clickSearchGoogle.setValue(searchValue).pressEnter();
    }

    @And("find an article on the official website of Cucumber")
    public void found_off_website_of_cucumber() {
     matchingTextInLinkCucumber.shouldHave(Condition.text("Cucumber: BDD Testing & Collaboration Tools for Teams"));
     linkCucumber.click();

    }

    @Then("ensure that topic of quick start is onsite")
    public void ensure_that_topic_of_quick_start_is_onsite() {

    }


}
