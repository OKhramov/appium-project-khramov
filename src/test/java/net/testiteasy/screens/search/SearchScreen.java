package net.testiteasy.screens.search;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.testiteasy.utils.variables.OSType;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static net.testiteasy.utils.parameters.TestDataParams.testConfig;

@SuppressWarnings("unused")
// TODO -->
// -- This screen should be changed and finished in courses.
// -- You need to change the selectors to the correct ones
// -- and think over the logic of using this screen.
public class SearchScreen {

    private final By SKIP_BUTTON = By.id("Skip");

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Explore\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Explore\"]")
    private SelenideElement EXPLORE_ICON;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Search…')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search Wikipedia\"]")
    private SelenideElement SEARCH_WIKIPEDIA_FIELD;

    @AndroidFindBy(id = "search_src_text")
    @iOSXCUITFindBy(id = "search_src_text")
    private SelenideElement SEARCH_TYPE_FIELD;

    @AndroidFindBy(id = "search_results_list")
    @iOSXCUITFindBy(id = "search_results_list")
    private SelenideElement SEARCH_RESULT;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Automation for Apps')]")
    @iOSXCUITFindBy(xpath = "//*[contains(@text, 'Automation for Apps')]")
    private SelenideElement APPIUM_RESULT_SEARCH;

    public void waitForMainContainerToAppear() {
        if (testConfig().getOSType() == OSType.IOS) {
            if ($(SKIP_BUTTON).is(Condition.visible)) {
                $(SKIP_BUTTON).click();
            }
        }

        EXPLORE_ICON.shouldBe(Condition.visible);
    }

    public void clickOnSearchField() {
        SEARCH_WIKIPEDIA_FIELD.shouldBe(Condition.visible).click();
    }

    public void sendKeysToSearchField(String text) {
        SEARCH_TYPE_FIELD.shouldBe(Condition.visible).sendKeys(text);
    }

    public void searchResultIsDisplayed() {
        SEARCH_RESULT.shouldBe(Condition.visible);
    }

    public void clickOnAppiumResultOfSearch() {
        APPIUM_RESULT_SEARCH.shouldBe(Condition.visible).click();
    }
}
