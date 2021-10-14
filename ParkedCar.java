public class ParkedCar
{
    //variables for class
    private String make;
    private String color;
    private String model;
    private int licenseNumber;
    private int minutesParked;

    // constructor for program

    public ParkedCar(String make)
    {
        this.make = make;
    }

    // setters

    public void setMake(String make)
    {
        this.make = make;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setLicenseNumber(int licenseNumber)
    {
        this.licenseNumber = licenseNumber;
    }

    public void setMinutesParked(int minutesParked)
    {
        this.minutesParked = minutesParked;
    }

    // getters

    public String getColor()
    {
        return color;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public int getMinutesParked()
    {
        return minutesParked;
    }
    
    public int getLicenseNumber()
    {
        return licenseNumber;
    }



}

