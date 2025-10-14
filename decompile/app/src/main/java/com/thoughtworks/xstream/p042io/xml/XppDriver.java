package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.naming.NameCoder;
import org.xmlpull.p066v1.XmlPullParser;
import org.xmlpull.p066v1.XmlPullParserException;
import org.xmlpull.p066v1.XmlPullParserFactory;

/* loaded from: classes7.dex */
public class XppDriver extends AbstractXppDriver {
    public static XmlPullParserFactory factory;

    public XppDriver() {
        super(new XmlFriendlyNameCoder());
    }

    public XppDriver(NameCoder nameCoder) {
        super(nameCoder);
    }

    public XppDriver(XmlFriendlyReplacer xmlFriendlyReplacer) {
        this((NameCoder) xmlFriendlyReplacer);
    }

    public static synchronized XmlPullParser createDefaultParser() throws XmlPullParserException {
        try {
            if (factory == null) {
                factory = XmlPullParserFactory.newInstance();
            }
        } catch (Throwable th) {
            throw th;
        }
        return factory.newPullParser();
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractXppDriver
    public XmlPullParser createParser() throws XmlPullParserException {
        return createDefaultParser();
    }
}
