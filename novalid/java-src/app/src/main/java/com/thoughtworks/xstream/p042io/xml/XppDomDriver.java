package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.naming.NameCoder;
import org.xmlpull.p066v1.XmlPullParser;
import org.xmlpull.p066v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class XppDomDriver extends AbstractXppDomDriver {
    public XppDomDriver() {
        super(new XmlFriendlyNameCoder());
    }

    public XppDomDriver(NameCoder nameCoder) {
        super(nameCoder);
    }

    public XppDomDriver(XmlFriendlyReplacer xmlFriendlyReplacer) {
        super(xmlFriendlyReplacer);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractXppDomDriver
    public synchronized XmlPullParser createParser() throws XmlPullParserException {
        return XppDriver.createDefaultParser();
    }
}
