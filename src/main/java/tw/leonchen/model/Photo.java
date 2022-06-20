package tw.leonchen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hotel")
public class Photo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String hotelType;
	private String hotelArea;
	private String PeopleSum;
	private String bathSum;
	private String bedSum;
	private String bedType;
	private String adress;
	private String rdNumber;
	private String national;

	public Photo(int id, String hotelType, String hotelArea, String peopleSum, String bathSum, String bedSum,
			String bedType, String adress, String rdNumber, String national) {
		this.id = id;
		this.hotelType = hotelType;
		this.hotelArea = hotelArea;
		PeopleSum = peopleSum;
		this.bathSum = bathSum;
		this.bedSum = bedSum;
		this.bedType = bedType;
		this.adress = adress;
		this.rdNumber = rdNumber;
		this.national = national;
	}

	public Photo() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHotelType() {
		return hotelType;
	}

	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}

	public String getHotelArea() {
		return hotelArea;
	}

	public void setHotelArea(String hotelArea) {
		this.hotelArea = hotelArea;
	}

	public String getPeopleSum() {
		return PeopleSum;
	}

	public void setPeopleSum(String peopleSum) {
		PeopleSum = peopleSum;
	}

	public String getBathSum() {
		return bathSum;
	}

	public void setBathSum(String bathSum) {
		this.bathSum = bathSum;
	}

	public String getBedSum() {
		return bedSum;
	}

	public void setBedSum(String bedSum) {
		this.bedSum = bedSum;
	}

	public String getBedType() {
		return bedType;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getRdNumber() {
		return rdNumber;
	}

	public void setRdNumber(String rdNumber) {
		this.rdNumber = rdNumber;
	}

	public String getNational() {
		return national;
	}

	public void setNational(String national) {
		this.national = national;
	}
	

}
