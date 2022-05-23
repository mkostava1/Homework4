package Automation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;

public class Firsttest {
    @Test

    public void login (){
        Selenide.open("https://redmed.ge/ka");
        Configuration.browserSize="1920x1080";
        $(byText("რეგისტრაცია")).click();
        sleep(1000);
        $(byText("სახელი")).click();
        $(byText("მომხმარებლის")).shouldBe(Condition.visible);
        $(byText("რეგისტრაცია")).shouldBe(Condition.visible);
        $("registration-button").shouldBe(Condition.disabled);
        $("userName").setValue("მარიამი");
        $("userName").shouldBe(Condition.visible);
        $(byText("userName")).shouldBe(Condition.enabled);
        sleep(3000);
        $(byText("რეგისტრაცია")).shouldBe(Condition.enabled);

        sleep(3000);





}


    }



