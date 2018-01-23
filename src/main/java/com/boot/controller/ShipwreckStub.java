package com.boot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.boot.model.Shipwreck;

public class ShipwreckStub {
	private static Map<Long, Shipwreck> wrecks = new HashMap<Long, Shipwreck>();
	private static Long idIndex = 3L;

	//populate initial wrecks
	static {
		Shipwreck a = new Shipwreck(1L, "Shivam Srivastava", "QA Engineer 3", "", "", "Jan 29 - 11:00 AM", 138.44, "");
		wrecks.put(1L, a);
		Shipwreck b = new Shipwreck(2L, "Shivam Srivastava", "QA Engineer 3", "", "", "Feb 12 - 15:00 PM", 138.44, "");
		wrecks.put(2L, b);
		Shipwreck c = new Shipwreck(3L, "Arpit Pandey", "Customer Happiness Engineer", "", "", "Feb 15 - 13:00 PM", 138.44, "");
		wrecks.put(3L, c);
	}

	public static List<Shipwreck> list() {
		return new ArrayList<Shipwreck>(wrecks.values());
	}

	public static Shipwreck create(Shipwreck wreck) {
		idIndex += idIndex;
		wreck.setId(idIndex);
		wrecks.put(idIndex, wreck);
		return wreck;
	}

	public static Shipwreck get(Long id) {
		return wrecks.get(id);
	}

	public static Shipwreck update(Long id, Shipwreck wreck) {
		wrecks.put(id, wreck);
		return wreck;
	}

	public static Shipwreck delete(Long id) {
		return wrecks.remove(id);
	}
}
