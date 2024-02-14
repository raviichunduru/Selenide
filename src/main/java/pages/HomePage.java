package pages;

import static enums.LeftMenuComponentType.PIM;

import enums.LeftMenuComponentType;
import  pagecomponents.LeftMenuComponent;

public class HomePage
{
    private final LeftMenuComponent leftMenuComponent;

    public HomePage()
    {
        this.leftMenuComponent = new LeftMenuComponent();
    }

    /*public LeftMenuComponent getLeftMenuComponent()
    {
        return leftMenuComponent;
    }*/

    public EmployeeInformationPage navigateToEmployeeInformationPage()
    {
        this.leftMenuComponent.selectMenufromLeftMenuOptions(PIM);
        return new EmployeeInformationPage();
    }
}
