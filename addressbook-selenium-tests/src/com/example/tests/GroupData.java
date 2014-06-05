package com.example.tests;

public class GroupData {
	public String name;
	public String header;
	public String footer;
	
	
	public String firstName;
	public String lastName;
	public String address;
	public String home;
	public String mNumber;
	public String wORK;
	public String eMail;
	public String eMail2;
	public String bDay;
	public String bMonth;
	public String bYear;
	public String groupName;
	public String adress2;
	public String pHONE2;

	public GroupData(String firstName, String lastName, String address,
			String home, String mNumber, String wORK, String eMail,
			String eMail2, String bDay, String bMonth, String bYear,
			String groupName, String adress2, String pHONE2) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.home = home;
		this.mNumber = mNumber;
		this.wORK = wORK;
		this.eMail = eMail;
		this.eMail2 = eMail2;
		this.bDay = bDay;
		this.bMonth = bMonth;
		this.bYear = bYear;
		this.groupName = groupName;
		this.adress2 = adress2;
		this.pHONE2 = pHONE2;
	}
	
	
	public GroupData() {
	
	}
	
	public GroupData(String groupname, String header, String footer) {
		this.name = groupname;
		this.header = header;
		this.footer = footer;
	}
}