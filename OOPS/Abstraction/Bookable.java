// Create an interface called Bookable that includes methods bookTicket and
// cancelBooking. Then, create two classes called Flight and Movie that
// implement the Bookable interface. The Flight class should have attributes
// flightNumber, departureCity, arrivalCity, and ticketPrice. The Movie class
// should have attributes movieTitle, showTime, and ticketPrice. Implement the
// bookTicket method in both classes to handle the booking process, and the
// cancelBooking method to handle the cancellation process. Implement
// appropriate logic for each method to simulate booking and canceling tickets.
// Demonstrate how to create instances of Flight and Movie, book and cancel
// bookings, and display the booking status.
// Solution Outline
// 1. Interface (Bookable): Define the methods bookTicket and
// cancelBooking.
// 2. Class (Flight): Implement the Bookable interface, add the attributes,
// and implement the methods.
// 3. Class (Movie): Implement the Bookable interface, add the attributes,
// and implement the methods.
// 4. Instances: Create instances of Flight and Movie, and use methods to
// book and cancel bookings, and display the booking status.
// program:

// Bookable.java:


public interface Bookable {
	void Bookticket();
	void Cancelbooking();
}
// Movie.java:

class Flight implements Bookable{
	int Flightnumber;
	String depcity,arrcity;
	double ticketprice;
	Flight(int Flightnumber,String depcity,String arrcity,double ticketprice){
		this.Flightnumber=Flightnumber;
		this.depcity=depcity;
		this.arrcity=arrcity;
		this.ticketprice=ticketprice;
	}
	public void Bookticket(){
		System.out.println("The Flight Ticket Is Booked");
		System.out.println("FlightNumber:"+Flightnumber);
		System.out.println("Departure City:"+depcity);
		System.out.println("Arrival City:"+arrcity);
		System.out.println("Ticket Price:"+ticketprice);
		}
	public void Cancelbooking() {
		System.out.println("The Booking is Cancelled");
	}	
}
public class Movie implements Bookable {
	String title,showtime;
	double ticketprice;
	int nop;
	Movie(String title,String showtime,double ticketprice,int nop){
		this.title=title;
		this.showtime=showtime;
		this.ticketprice=ticketprice;
		this.nop=nop;
	}
	public void Bookticket() {
		System.out.println("The Movie Ticket Is Booked");
		System.out.println("Movie Title:"+title);
		System.out.println("Show Time:"+showtime);
		System.out.println("TicketPrice"+ticketprice);
		System.out.println("Total Price"+(ticketprice*nop));
	}
	public void Cancelbooking() {
		System.out.println("The Booking is Cancelled");
	}
	public static void main(String[] args) {
		Flight f=new Flight(12332,"Chennai","Dubai",25000.0);
		f.Bookticket();
		f.Cancelbooking();
		System.out.println("---------------------");
		Movie m=new Movie("Dragon","5.30", 130, 5);
		m.Bookticket();
		m.Cancelbooking();
	}
}
// Output:
// The Flight Ticket Is Booked
// FlightNumber:12332
// Departure City:Chennai
// Arrival City:Dubai
// Ticket Price:25000.0
// The Booking is Cancelled
// ---------------------

// The Movie Ticket Is Booked
// Movie Title:Dragon
// Show Time:5.30
// TicketPrice130.0
// Total Price650.0
// The Booking is Cancelled

