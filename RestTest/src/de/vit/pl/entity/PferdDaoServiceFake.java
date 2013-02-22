package de.vit.pl.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PferdDaoServiceFake {

	public List<Pferd> getAll() {
		ArrayList<Pferd> pferdeListe = new ArrayList<Pferd>();
		for (int i = 0; i < 100000; i++) {
			Pferd p = new Pferd();
			Calendar cal = Calendar.getInstance();
			cal.set(1912 + i, 10, 05);
			p.setGebDatum(cal.getTime());
			p.setId(Long.valueOf(i));
			p.setPferdLNR("00" +i);
			p.setName("someName" + i);
			pferdeListe.add(p);
		}
		return pferdeListe;
	}

	public Pferd getPferdById(Long id) {
		Pferd pferd = new Pferd();
		pferd.setId(id);
		pferd.setName("mein kleiner Onkel");
		Calendar cal = Calendar.getInstance();
		cal.set(1990, 10, 05);
		pferd.setGebDatum(cal.getTime());
		return pferd;
	}

}
