package com.thoughtworks.xstream.p042io.naming;

/* loaded from: classes5.dex */
public class NoNameCoder implements NameCoder {
    @Override // com.thoughtworks.xstream.p042io.naming.NameCoder
    public String decodeAttribute(String str) {
        return str;
    }

    @Override // com.thoughtworks.xstream.p042io.naming.NameCoder
    public String decodeNode(String str) {
        return str;
    }

    @Override // com.thoughtworks.xstream.p042io.naming.NameCoder
    public String encodeAttribute(String str) {
        return str;
    }

    @Override // com.thoughtworks.xstream.p042io.naming.NameCoder
    public String encodeNode(String str) {
        return str;
    }
}
