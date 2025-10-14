package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.naming.NameCoder;
import org.kxml2.io.KXmlParser;
import org.xmlpull.p066v1.XmlPullParser;

/* loaded from: classes7.dex */
public class KXml2Driver extends AbstractXppDriver {
    public KXml2Driver() {
        super(new XmlFriendlyNameCoder());
    }

    public KXml2Driver(NameCoder nameCoder) {
        super(nameCoder);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractXppDriver
    public XmlPullParser createParser() {
        return new KXmlParser();
    }
}
