package org.apache.ivy.osgi.p063p2;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import org.xml.sax.SAXException;

/* loaded from: classes5.dex */
public interface XMLInputParser {
    void parse(InputStream inputStream) throws SAXException, IOException, ParseException;
}
