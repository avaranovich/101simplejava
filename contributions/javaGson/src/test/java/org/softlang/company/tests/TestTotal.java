package org.softlang.company.tests;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;
import org.softlang.company.features.Parsing;
import org.softlang.company.features.Total;

import com.google.gson.JsonObject;

public class TestTotal {

	@Test
	public void testTotal() {
		String in = "inputs" + File.separator + "sampleCompany.json";
		JsonObject o = Parsing.parseFromFile(in);
		assertEquals(326927.0, Total.total(o), 0.0);
	}

}
