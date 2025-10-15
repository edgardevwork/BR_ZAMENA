package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.naming.NameCoder;
import io.github.xstream.mxparser.MXParser;
import org.xmlpull.p066v1.XmlPullParser;

/* loaded from: classes7.dex */
public class MXParserDriver extends AbstractXppDriver {
    public MXParserDriver() {
        super(new XmlFriendlyNameCoder());
    }

    public MXParserDriver(NameCoder nameCoder) {
        super(nameCoder);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.AbstractXppDriver
    public XmlPullParser createParser() {
        return new MXParser();
    }
}
