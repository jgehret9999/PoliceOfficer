public class ParkingTicket extends ParkedCar
{
    //variables for class
    private String make;
    private String model;
    private String color;
    private int licenseNumber;
    private String officerName;
    private int badgeNumber;
    private float amountFined;

    // constructor for class

    public ParkingTicket(String officerName, ParkedCar)
    {
        this.officerName = officerName;
    }

    // setters
    public void setMake(String make)
    {
        this.make = make;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setLicenseNumber(int licenseNumber)
    {
        this.licenseNumber = licenseNumber;
    }

    public void setOfficerName(String officerName)
    {
        this.officerName = officerName;
    }

    public void setBadgeNumber(int badgeNumber)
    {
        this.badgeNumber = badgeNumber;
    }

    public void setAmountFined(float amountFined)
    {
        this.amountFined = amountFined;
    }

    // getters
    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public String getColor()
    {
        return color;
    }

    public int getLicenseNumber()
    {
        return licenseNumber;
    }

    public String getOfficerName()
    {
        return officerName;
    }

    public int getBadgeNumber()
    {
        return badgeNumber;
    }

    public float getAmountFined() {
        return amountFined;
    }
    
     /**
     * @return A string representing the parking ticket.
     */
    public String toString(){
        return "Officer Name: " + this.officerName + "\nBadge Number: " + this.badgeNumber + "\nCar Make: " + this.make
                                + "\nCar Model: " + this.model + "\nCar Color: " + this.color + "\nLicense #: " + this.licenseNumber
                                + "\nAmount Fined: " + this.amountFined;
    }
}
