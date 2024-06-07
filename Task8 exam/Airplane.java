package exam;
import java.time.LocalTime;
public class Airplane {
	private String flightNumber;
	private String destination;
	private LocalTime scheduledDeparture;
	private int delayTime;
	
	public Airplane(String flightNumber, String destination, LocalTime scheduledDepature) {
		this.flightNumber=flightNumber;
		this.destination=destination;
		this.scheduledDeparture=scheduledDepature;
		this.delayTime=0;
	}

	

	public String getFlightNumber() {
		return flightNumber;
	}



	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public LocalTime getScheduledDeparture() {
		return scheduledDeparture;
	}



	public void setScheduledDeparture(LocalTime scheduledDeparture) {
		this.scheduledDeparture = scheduledDeparture;
	}



	public int getDelayTime() {
		return delayTime;
	}



	public void setDelayTime(int delayTime) {
		this.delayTime = delayTime;
	}



	public void delay(int minutes) {
		this.delayTime=minutes;
		this.scheduledDeparture=this.scheduledDeparture.plusMinutes(minutes);
		
	}
	
	
	
	public void checkStatus() {
		if(delayTime==0) {
			System.out.println("flight "+flightNumber+" is on time");
			
		}
		else {
			System.out.println("flight"+flightNumber +"is delayed by "+delayTime+" minutes");
		}
	}

	

}
