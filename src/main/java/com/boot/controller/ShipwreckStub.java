package com.boot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.boot.model.Hiring;

public class ShipwreckStub {
	private static Map<Long, Hiring> wrecks = new HashMap<Long, Hiring>();
	private static Long idIndex = 3L;

	//populate initial wrecks
	static {
		Hiring a = new Hiring(1L, "Dan", "CEO", "", "", "Jan 29 - 11:00 AM", 138.44, "");
		wrecks.put(1L, a);
		Hiring b = new Hiring(2L, "Yan", "CTO", "", "", "Feb 12 - 15:00 PM", 138.44, "");
		wrecks.put(2L, b);
		Hiring c = new Hiring(3L, "Zan", "CPO", "", "", "Feb 15 - 13:00 PM", 138.44, "");
		wrecks.put(3L, c);
	}

	public static List<Hiring> list() {
		return new ArrayList<Hiring>(wrecks.values());
	}

	public static Hiring create(Hiring wreck) {
		idIndex += idIndex;
		wreck.setId(idIndex);
		wrecks.put(idIndex, wreck);
		return wreck;
	}

	public static Hiring get(Long id) {
		return wrecks.get(id);
	}

	public static Hiring update(Long id, Hiring wreck) {
		wrecks.put(id, wreck);
		return wreck;
	}

	public static Hiring delete(Long id) {
		return wrecks.remove(id);
	}
}
