

public class HotelManagement{
    private int roomNo;
    private int capacity;
    private int pricePerNight;
    private String checkInDate;
    private String checkOutDate;

    private boolean isAvailable=true;
    private boolean isReserve;
    HotelManagement(int room,int capacity,int pricePerNight){
        this.roomNo=room;
        this.capacity=capacity;
        this.pricePerNight=pricePerNight;
        this.checkInDate=checkInDate;
        this.checkOutDate=checkOutDate;

    }

    public void checkAvailabilty(String checkInDate,String checkOutDate) {
        if(isAvailable) {
            this.checkInDate=checkInDate;
            this.checkOutDate=checkOutDate;
            System.out.println("Room is available.");
            System.out.println(toString());
        }
        else {
            System.out.println("Room is occupied");
        }


    }
    public void reservation() {
        if(!isReserve ) {
            System.out.println("Reservation Successful");
            System.out.println("Room No: " +roomNo+" "+"Capacity: "+capacity+" "+"Price per night: "+pricePerNight);
        }
        else {
            System.out.println("Reservation UnSuccessful");
            System.out.println("Room is occupied");
        }

    }
    public void reservation(String checkInDate,String checkOutDate) {
        if(!isReserve && isAvailable ) {
            this.checkInDate=checkInDate;
            this.checkOutDate=checkOutDate;
            System.out.println("Reservation Successful with check in and check out dates");
            System.out.println(toString());

        }
        else {
            System.out.println("Reservation UnSuccessful");
            System.out.println("Room is not available on that date");
        }

    }
    public String toString() {
        return "Room No: " +roomNo+" "+"Capacity: "+capacity+" "+"Price per night: "+pricePerNight +"\n"
                +"Check in date: "+checkInDate+" check out date: "+checkOutDate;

    }



}
class Main56 {

    public static void main(String[] args) {
        HotelManagement room1=new HotelManagement(11,2,500);
        HotelManagement room2=new HotelManagement(12,2,700);

        room1.checkAvailabilty("21-08-2023", "22-08-2023");
        System.out.println();

        room1.reservation();
        System.out.println();

        room2.reservation("21-08-2023", "22-08-2023");



    }

}
