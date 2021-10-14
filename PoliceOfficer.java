//----------------------------------------------------------------------
// PoliceOfficer.java          by Jonathan Gehret               
//
// Defines PoliceOfficer objects having name and badge number attributes.
//----------------------------------------------------------------------

import java.util.ArrayList;

public class PoliceOfficer {
    //----------------------------------------------------------
    //                      VARIABLES
    //----------------------------------------------------------
    private String name;    // Stores the officers name
    private int badgeNumber; // Stores the officers badge number.
    ArrayList<ParkingTicket> tickets = new ArrayList<>();

    //----------------------------------------------------------
    //                      CONSTRUCTORS
    //----------------------------------------------------------

    // Main Constructor
    public PoliceOfficer(String name, int badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    //----------------------------------------------------------
    //                      GETTERS AND SETTERS
    //----------------------------------------------------------
    /**
     * This method get's the police officers name.
     * @return  The Police Officers name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public int getBadgeNumber() {
        return badgeNumber;
    }

    /**
     * @param badgeNumber
     */
    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    /**
     * This method calculates the amount of the fine being issued.  If the car
     * has been parked for an hour or less over its purchased
     * time, the fine is $25, otherwise its $25 plus $10 for
     * every additional hour or part of an hour. If the car
     * has been parked for an hour or less over its purchased
     * time, the fine is $25, otherwise its $25 plus $10 for
     * every additional hour or part of an hour.
     * @param pc    The car for which we are checking minutes parked
     * @param pm    The parking meter for which we are checking minutes purchased.
     * @return      The dollar amount of the fine.
     */
    private float calcFine(ParkedCar pc, ParkingMeter pm){
        int timeVar = pc.getMinutesParked() - pm.getMinutesPurchased();
        if(timeVar <= 0)
            return 0;
        else if (timeVar < 60)
            return 25;
        return (float)Math.ceil((timeVar / 60) * 10);
    }

    /**
     * This method issues a ticket to a give parked car, based on the time
     * difference with a given parking meter.
     * @param pc    The car to which the ticket is being issues.
     * @param pm    The parking meter where the car was parked.
     * @return      The parking ticket.
     */
    public ParkingTicket issueTicket(ParkedCar pc, ParkingMeter pm){
        ParkingTicket pt = new ParkingTicket(this.name, this.parkedCar);

        pt.setMake(pc.getMake());
        pt.setModel(pc.getModel());
        pt.setColor(pc.getColor());
        pt.setLicenseNumber(pc.getLicenseNumber());
        pt.setBadgeNumber(this.badgeNumber);
        pt.setAmountFined(calcFine(pc, pm));

        return pt;
    }

    /**
     * This method checks parked car and parking meter to see if the
     * the time purchased has expired, in which case a fine will be issued.
     * otherwise we do nothing.
     * @param pc    The parked car being checked
     * @param pm    The parking meter where the car is parked.
     * @return      True if a ticket was issued, false otherwise.
     */
    public boolean checkCar(ParkedCar pc, ParkingMeter pm){
        if(pc.getMinutesParked() > pm.getMinutesPurchased()){
            tickets.add(issueTicket(pc, pm));
            return true;
        }
        else
            return false;
    }

}
