package com.rishiyam.rishiyam_API.services;

import java.util.List;

import com.rishiyam.rishiyam_API.entity.Attend;

public interface AttendServicesByList {

	
	public List<Attend> getAttendance();
	
	public Attend getAttendnceOfOnePerson(int i) ;

	public Attend createAttendance(Attend a);

	public Attend updateAttandance(Attend a);

	public void deleteAttendance(int parseInt);
	
	
}
