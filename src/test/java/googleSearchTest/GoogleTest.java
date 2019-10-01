
package googleSearchTest;


import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.Integer.parseInt;


public class GoogleTest {
    @Test
    public void searchOpenInGoogle() {

        open( "https://google.com/" );
        $( By.name( "q" ) ).val( "Открытие" ).pressEnter();
        SelenideElement searchResult = $(byXpath("//*[@id=\"resultStats\"]"));
        String searchResText = searchResult.innerText();
       // int intRes =  Integer.parseInt( searchResJava.trim() );
       // System.out.println(intRes);
        System.out.println(searchResText);
    }

}

//Здесь попробовал достать innerText элемента и распарсить в int



























