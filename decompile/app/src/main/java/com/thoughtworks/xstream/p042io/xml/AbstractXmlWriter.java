package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.AbstractWriter;
import com.thoughtworks.xstream.p042io.naming.NameCoder;

/* loaded from: classes7.dex */
public abstract class AbstractXmlWriter extends AbstractWriter implements XmlFriendlyWriter {
    public AbstractXmlWriter() {
        this(new XmlFriendlyNameCoder());
    }

    public AbstractXmlWriter(XmlFriendlyReplacer xmlFriendlyReplacer) {
        this((NameCoder) xmlFriendlyReplacer);
    }

    public AbstractXmlWriter(NameCoder nameCoder) {
        super(nameCoder);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.XmlFriendlyWriter
    public String escapeXmlName(String str) {
        return super.encodeNode(str);
    }
}
