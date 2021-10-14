public class ParkingMeter {
    //----------------------------------------------------------
    //                      VARIABLES
    //----------------------------------------------------------
    private int minutesPurchased; // Holds the amount of meter time purchased in minutes.

    //----------------------------------------------------------
    //                      CONSTRUCTORS
    //----------------------------------------------------------

    // Main Constructor
    public ParkingMeter(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    //----------------------------------------------------------
    //                      GETTERS AND SETTERS
    //----------------------------------------------------------

    /**
     * This method gets the number of minutes purchased.
     * @return The number of minutes purchased.
     */
    public int getMinutesPurchased() {
        return minutesPurchased;
    }


    /**
     * This method sets the amount of minutes purchased.
     * @param minutesPurchased THe amount of minutes being purchased.
     */
    public void setMinutesPurchased(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }
}
