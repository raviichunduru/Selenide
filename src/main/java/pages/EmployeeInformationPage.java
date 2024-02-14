package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebElementCondition;
import entity.EmployeeDetails;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class EmployeeInformationPage
{
    private static final SelenideElement ADD_EMPLOYEE_BUTTON = $(byText("Add Employee"));
    private static final SelenideElement FIRST_NAME = $(byAttribute("name","firstName"));
    private static final SelenideElement LAST_NAME = $(byAttribute("name","lastName"));
    private static final SelenideElement MIDDLE_NAME = $(byAttribute("name","middleName"));
    private static final SelenideElement EMPLOYEE_ID = $$(byXpath("//input[@class='oxd-input oxd-input--active']")).get(1);
    private static final SelenideElement IMAGE = $(byAttribute("type","File"));
    private static final SelenideElement SAVE_BUTTON = $(byAttribute("type","submit"));
    private static final SelenideElement SUCCESS_MESSAGE = $(byText("Success"));

    public EmployeeInformationPage addEmployee(EmployeeDetails employee)
    {
        ADD_EMPLOYEE_BUTTON.shouldBe(enabled).click();
        FIRST_NAME.shouldBe(visible).setValue(employee.getFirstName());
        LAST_NAME.shouldBe(visible).setValue(employee.getLastName());
        MIDDLE_NAME.shouldBe(visible).setValue(employee.getMiddleName());
        EMPLOYEE_ID.shouldBe(visible).setValue(String.valueOf(employee.getEmployeeID()));
        IMAGE.shouldBe(enabled).uploadFromClasspath(employee.getProfilePicturePath());
        SAVE_BUTTON.shouldBe(enabled).click();
        return this;
    }

    public void checkIfEmployeeAddedSuccessfully()
    {
        SUCCESS_MESSAGE.shouldHave(visible);
    }
}
