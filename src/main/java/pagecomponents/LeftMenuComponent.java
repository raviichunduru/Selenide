package pagecomponents;

import enums.LeftMenuComponentType;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;

import static com.codeborne.selenide.Selenide.$;

public class LeftMenuComponent
{
    public void selectMenufromLeftMenuOptions(LeftMenuComponentType menuType)
    {
        $(byText(menuType.getMenuName())).shouldBe(visible).click();
    }
}
