package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.naming.NameCoder;
import org.xmlpull.mxp1.MXParser;
import org.xmlpull.p066v1.XmlPullParser;

/* loaded from: classes7.dex */
public class Xpp3DomDriver extends AbstractXppDomDriver {
    public Xpp3DomDriver() {
        super(new XmlFriendlyNameCoder());
    }

    public Xpp3DomDriver(NameCoder nameCoder) {
        super(nameCoder);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractXppDomDriver
    public XmlPullParser createParser() {
        return new MXParser();
    }
}
