package net.testiteasy.steps.result;

import io.cucumber.java.en.When;
import net.testiteasy.screens.search_result.SearchResultScreen;
import net.testiteasy.screens.search_result.SearchResultScreenObjectFactory;

public class SearchResultStepDefinitions {

    private final SearchResultScreen searchResultScreen = SearchResultScreenObjectFactory.get();

    @When("search result is displayed on the Result page")
    public void searchResultIsDisplayed() {
        searchResultScreen.searchResultIsDisplayed();
    }

    @When("search result has the text {string}")
    public void userTypeInSearchLine(String text) {
        searchResultScreen.searchResultHasText(text);
    }
}
