package com.thoughtworks.xstream.p042io.xml.xppdom;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import org.xmlpull.p066v1.XmlPullParser;
import org.xmlpull.p066v1.XmlPullParserException;
import org.xmlpull.p066v1.XmlPullParserFactory;

/* loaded from: classes5.dex */
public class XppFactory {
    public static XmlPullParser createDefaultParser() throws XmlPullParserException {
        return XmlPullParserFactory.newInstance().newPullParser();
    }

    public static XppDom buildDom(String str) throws XmlPullParserException, IOException {
        return buildDom(new StringReader(str));
    }

    public static XppDom buildDom(Reader reader) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserCreateDefaultParser = createDefaultParser();
        xmlPullParserCreateDefaultParser.setInput(reader);
        return XppDom.build(xmlPullParserCreateDefaultParser);
    }

    public static XppDom buildDom(InputStream inputStream, String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserCreateDefaultParser = createDefaultParser();
        xmlPullParserCreateDefaultParser.setInput(inputStream, str);
        return XppDom.build(xmlPullParserCreateDefaultParser);
    }
}
