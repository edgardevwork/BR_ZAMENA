package com.thoughtworks.xstream.p042io.xml;

/* loaded from: classes7.dex */
public class XStream11XmlFriendlyReplacer extends XmlFriendlyReplacer {
    @Override // com.thoughtworks.xstream.p042io.xml.XmlFriendlyNameCoder, com.thoughtworks.xstream.p042io.naming.NameCoder
    public String decodeAttribute(String str) {
        return str;
    }

    @Override // com.thoughtworks.xstream.p042io.xml.XmlFriendlyNameCoder, com.thoughtworks.xstream.p042io.naming.NameCoder
    public String decodeNode(String str) {
        return str;
    }

    @Override // com.thoughtworks.xstream.p042io.xml.XmlFriendlyReplacer
    public String unescapeName(String str) {
        return str;
    }
}
