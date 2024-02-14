package enums;

public enum LeftMenuComponentType
{
    ADMIN("Admin"),
    PIM("PIM"),
    LEAVE("Leave");

    private final String menuName;

    LeftMenuComponentType(String menuName)
    {
        this.menuName = menuName;
    }

    public String getMenuName()
    {
        return menuName;
    }
}
