package org.softlang.company.tests;

import static org.softlang.company.features.Serialization.*;

import org.w3c.dom.Document;

import java.io.File;

import org.junit.Test;

public class SerializationTest {

    private static String sampleCompany =
        "inputs"
        + File.separator
        + "sampleCompany.xml";
    private static String output =
        "outputs"
        + File.separator
        + "output.xml";

    @Test
    public void testDeserialization() throws Exception {
        loadDocument(sampleCompany);
    }

    @Test
    public void testSerialization() throws Exception {
        Document doc = loadDocument(sampleCompany);
        new File("outputs").mkdir();
        saveDocument(doc,output);
        loadDocument(output);
    }

}