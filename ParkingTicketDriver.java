public class ParkingTicketDriver
{
    //ties all the classes together
    public static void main(String[] args)
    {
        // two different cars
       ParkedCar car1 = new ParkedCar("Ford");
       ParkedCar car2 = new ParkedCar("Toyota");

       //two parking meters
       ParkingMeter meter1 = new ParkingMeter(45);
       ParkingMeter meter2 = new ParkingMeter(30);

       //two police officers
       PoliceOfficer officer1 = new PoliceOfficer("Baker " , 5467);
       PoliceOfficer officer2 = new PoliceOfficer("Smith" , 3444);

       ParkingTicket pt= new ParkingTicket("Baker",car1 , meter1);







        System.out.println("You have been here too long");

    }// end of main

}//end class
