package pages;

import com.codeborne.selenide.SelenideElement;
import entity.LoginDetails;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage
{
    private LoginPage () {}

    public static LoginPage getInstance() {return new LoginPage();}

    private static final SelenideElement USER_NAME = $(byName("username"));
    private static final SelenideElement PASSWORD = $(byAttribute("name", "password"));
    private static final SelenideElement LOGIN_BUTTON = $("[type='submit']");

    public HomePage loginToApplication(LoginDetails loginDetails)
    {
        USER_NAME.shouldBe(visible).setValue(loginDetails.getUserName());
        PASSWORD.shouldBe(visible).setValue(loginDetails.getPassword());
        LOGIN_BUTTON.shouldBe(enabled).click();
        return new HomePage();
    }
}
