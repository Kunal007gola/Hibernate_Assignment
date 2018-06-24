package com.Kunal.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Author_Address {

		@Column(name="house_number")
		private int houseNo;
		private String street;
		private String city;
		private String state;
		private int pin;
		
		public int getHouseNo() {
			return houseNo;
		}
		public void setHouseNo(int houseNo) {
			this.houseNo = houseNo;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getPin() {
			return pin;
		}
		public void setPinCode(int pin) {
			this.pin = pin;
		}
		
}