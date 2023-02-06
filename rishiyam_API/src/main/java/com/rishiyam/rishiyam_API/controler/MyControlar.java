package com.rishiyam.rishiyam_API.controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rishiyam.rishiyam_API.dao.AttendanceDaoImpe;
import com.rishiyam.rishiyam_API.entity.Attend;
import com.rishiyam.rishiyam_API.services.AttendServicesByList;

@RestController
public class MyControlar {

	/*********** For DB Connection Dao Class ***************/
	 @Autowired
	 private AttendanceDaoImpe attendDao;

	@GetMapping("/attendance")
	public List<Attend> getAttendancesByDB() {
			
		return attendDao.findAll();
	}
	@GetMapping("/attendance/{id}")
	public Attend getAttendanceByDB(@PathVariable String id) {
		
		return attendDao.getOne(Integer.parseInt(id));
	}
	
	@PostMapping("/attendance")
	public Attend createAttendanceByDB(@RequestBody Attend a) {
		attendDao.save(a);
		return a;
	}
	
	
	@PutMapping("/attendance")
	public Attend updateAttendanceByDB(@RequestBody Attend a) {
		attendDao.save(a);
		return a;
	}
	
	@DeleteMapping("/attendance/{id}")
	public void deleteAttendanceByDB(@PathVariable String id){
		
		Attend a=attendDao.getOne(Integer.parseInt(id));
		attendDao.delete(a);
  }

	/****************
	 * this is cover by temperary list element only
	 **********************/

	/*
    @Autowired
	private AttendServicesByList attendServices;
    
    
	@GetMapping("/rishi")
	public String home() {	
		return "welcome to Home Page of Rishiyam.com";
	}
	@GetMapping("/attendance")
	public List<Attend> getAttendances() {
			
		return this.attendServices.getAttendance();
	}
	@GetMapping("/attendance/{id}")
	public Attend getAttendance(@PathVariable String id) {
		
		return this.attendServices.getAttendnceOfOnePerson(Integer.parseInt(id));
	}
	
	@PostMapping("/attendance")
	public Attend createAttendance(@RequestBody Attend a) {
		
		return this.attendServices.createAttendance(a);
	}
	
	
	@PutMapping("/attendance")
	public Attend updateAttendance(@RequestBody Attend a) {
		
		return this.attendServices.updateAttandance(a);
	}
	
	@DeleteMapping("/attendance/{id}")
	public ResponseEntity<HttpStatus> deleteAttendance(@PathVariable String id){
		try {
			this.attendServices.deleteAttendance(Integer.parseInt(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
  }

*/
}
