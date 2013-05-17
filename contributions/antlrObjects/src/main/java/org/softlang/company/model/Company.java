package org.softlang.company.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;

/**
 * A company has a name and
 * consists of (possibly nested) departments.
 */
public class Company {

    private String name;
    private List<Department> depts = new LinkedList<Department>();

    public Company() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepts() {
        return depts;
    }

}