// A variation that involves subtyping

package org.softlang.company.features;

import javax.xml.bind.JAXBElement;

import org.softlang.company.model.*;

public class Total {

	public static double total(Company c) {
		double total = 0;
		for (Department d : c.getDepartment())
			total += total(d);
		return total;
	}

	public static double total(Department d) {
		double total = total(d.getManager());
		for (JAXBElement<? extends Subunit> s : d.getSubunit())
			total += total(s.getValue());
		return total;
	}

	public static double total(Employee e) {
		return e.getSalary();
	}

	//
	// We cannot use virtual methods.
	// That is, we do not allow ourselves modifying schema-derived classes.
	//
	public static double total(Subunit s) {
		if (s instanceof Department)
			return total(((Department)s));
		else if (s instanceof Employee)
			return total(((Employee)s));
		else throw new IllegalArgumentException();
	}

}