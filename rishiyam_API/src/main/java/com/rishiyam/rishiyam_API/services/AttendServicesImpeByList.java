package com.rishiyam.rishiyam_API.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rishiyam.rishiyam_API.entity.Attend;

@Service
public class AttendServicesImpeByList implements AttendServicesByList {
	List<Attend> list;

	public AttendServicesImpeByList() {
		list = new ArrayList<>();
		list.add(new Attend(01, "Suraj", "mumbai", true));
		list.add(new Attend(02, "Sura", "mumbai", true));
	}

	@Override
	public List<Attend> getAttendance() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Attend getAttendnceOfOnePerson(int id) {

		Attend a = null;
		for (Attend itr : list) {
			if (itr.getId() == id) {
				a = itr;
			}
		}
		return a;
	}

	@Override
	public Attend createAttendance(Attend a) {
		list.add(a);
		return a;
	}

	@Override
	public Attend updateAttandance(Attend a) {
		list.forEach(e -> {
			if (e.getId() == a.getId()) {
				e.setCity(a.getCity());
				e.setName(a.getName());
				e.setStatus(a.getStatus());

			}
		});
		return a;
	}

	@Override
	public void deleteAttendance(int parseInt) {

		for (Attend itr : list) {
			if (itr.getId() == parseInt) {
				list.remove(itr);
			}
		}

	}
}
