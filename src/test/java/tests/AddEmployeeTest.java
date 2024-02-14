package tests;

import entity.EmployeeDetails;
import entity.LoginDetails;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import testdata.EmployeeTestData;
import testdata.LoginTestData;
import tests.base.TestSetup;

public class AddEmployeeTest extends TestSetup
{
    private final EmployeeDetails employeeDetails = EmployeeTestData.getRandomEmployeeDetails();
    private final LoginDetails loginDetails = LoginTestData.getValidLogindetails();

    @Test
    public void testAddEmployee() throws InterruptedException
    {
        LoginPage.getInstance()
                .loginToApplication(loginDetails)
                .navigateToEmployeeInformationPage()
                .addEmployee(employeeDetails)
                .checkIfEmployeeAddedSuccessfully();
    }
}
