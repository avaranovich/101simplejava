package org.softlang.company.features.sax;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.FileReader;
import java.io.IOException;

public class SAXUtilities {

    public static void parse(DefaultHandler handler, String file) throws SAXException, IOException {
        XMLReader xreader = XMLReaderFactory.createXMLReader();
        xreader.setContentHandler(handler);
        xreader.setErrorHandler(handler);
        FileReader reader = new FileReader(file);
        xreader.parse(new InputSource(reader));
    }

}