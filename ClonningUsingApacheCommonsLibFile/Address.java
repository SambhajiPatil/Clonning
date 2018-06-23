package ClonningUsingApacheCommonsLibFile;

import java.io.Serializable;

public class Address implements Serializable
{
  public Address(int pcode, String city) {
		super();
		this.pcode = pcode;
		this.city = city;
	}
public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
public int getPcode() {
	return pcode;
}
public void setPcode(int pcode) {
	this.pcode = pcode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
private int pcode;
  private String city;
@Override
public String toString() {
	return " \n Address [pcode=" + pcode + ", city=" + city + "]";
}
  
}
