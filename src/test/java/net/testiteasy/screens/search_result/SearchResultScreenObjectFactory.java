package net.testiteasy.screens.search_result;

import net.testiteasy.utils.variables.OSType;

import static com.codeborne.selenide.appium.ScreenObject.screen;
import static net.testiteasy.utils.parameters.TestDataParams.testConfig;

public class SearchResultScreenObjectFactory {

    public static SearchResultScreen get() {
        return testConfig().getOSType().equals(OSType.ANDROID) ?
                screen(AndroidSearchResultScreen.class) :
                screen(IOSSearchResultScreen.class);
    }
}
