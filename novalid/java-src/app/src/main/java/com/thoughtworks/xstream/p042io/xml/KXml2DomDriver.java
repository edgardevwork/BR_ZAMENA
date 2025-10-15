package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.naming.NameCoder;
import org.kxml2.io.KXmlParser;
import org.xmlpull.p066v1.XmlPullParser;

/* loaded from: classes7.dex */
public class KXml2DomDriver extends AbstractXppDomDriver {
    public KXml2DomDriver() {
        super(new XmlFriendlyNameCoder());
    }

    public KXml2DomDriver(NameCoder nameCoder) {
        super(nameCoder);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractXppDomDriver
    public XmlPullParser createParser() {
        return new KXmlParser();
    }
}
