package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.AbstractReader;
import com.thoughtworks.xstream.p042io.naming.NameCoder;

/* loaded from: classes7.dex */
public abstract class AbstractXmlReader extends AbstractReader {
    public AbstractXmlReader() {
        this(new XmlFriendlyNameCoder());
    }

    public AbstractXmlReader(XmlFriendlyReplacer xmlFriendlyReplacer) {
        this((NameCoder) xmlFriendlyReplacer);
    }

    public AbstractXmlReader(NameCoder nameCoder) {
        super(nameCoder);
    }

    public String unescapeXmlName(String str) {
        return decodeNode(str);
    }

    public String escapeXmlName(String str) {
        return encodeNode(str);
    }
}
