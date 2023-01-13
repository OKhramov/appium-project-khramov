package net.testiteasy.screens.search_result;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SearchResultScreen {

    @AndroidFindBy(id = "view_page_subtitle_text")
    @iOSXCUITFindBy(id = "view_page_subtitle_text")
    private SelenideElement SEARCH_RESULT_DESCRIPTION;


    public void searchResultIsDisplayed() {
        SEARCH_RESULT_DESCRIPTION.shouldBe(Condition.visible);
    }

    public void searchResultHasText(String text) {
        SEARCH_RESULT_DESCRIPTION.shouldHave(Condition.text(text));
    }
}
