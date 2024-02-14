package entity;

import lombok.Data;
import uk.co.jemos.podam.common.PodamIntValue;
import uk.co.jemos.podam.common.PodamStringValue;

@Data
public class EmployeeDetails
{
    private String firstName;
    private String lastName;
    private String middleName;

    @PodamIntValue(minValue = 4, maxValue = 10)
    private Integer employeeID;

    @PodamStringValue(strValue = "images/employee image.png")
    private String profilePicturePath;

}
