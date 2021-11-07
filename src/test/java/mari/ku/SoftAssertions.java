package mari.ku;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertions {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1600x900";
    }

    @Test
    void checkExampleJUnit5SoftAssertions() {

        open("https://github.com/selenide/selenide");
        $(".UnderlineNav-body").find(byText("Wiki")).click();
        $("#wiki-body").find(byText("Soft assertions")).click();
        $$("ol li").filterBy(text("JUnit5")).shouldHave(itemWithText("Using JUnit5 extend test class:"));

    }


}
