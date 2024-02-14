package testdata;

import entity.EmployeeDetails;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public final class EmployeeTestData
{
    private EmployeeTestData () {}

    private static final PodamFactory FACTORY = new PodamFactoryImpl();

    public static EmployeeDetails getRandomEmployeeDetails()
    {
        return FACTORY.manufacturePojo(EmployeeDetails.class);
    }

}
