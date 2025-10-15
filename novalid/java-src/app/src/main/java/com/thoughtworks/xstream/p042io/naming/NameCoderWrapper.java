package com.thoughtworks.xstream.p042io.naming;

/* loaded from: classes5.dex */
public class NameCoderWrapper implements NameCoder {
    public final NameCoder wrapped;

    public NameCoderWrapper(NameCoder nameCoder) {
        this.wrapped = nameCoder;
    }

    @Override // com.thoughtworks.xstream.p042io.naming.NameCoder
    public String decodeAttribute(String str) {
        return this.wrapped.decodeAttribute(str);
    }

    @Override // com.thoughtworks.xstream.p042io.naming.NameCoder
    public String decodeNode(String str) {
        return this.wrapped.decodeNode(str);
    }

    @Override // com.thoughtworks.xstream.p042io.naming.NameCoder
    public String encodeAttribute(String str) {
        return this.wrapped.encodeAttribute(str);
    }

    @Override // com.thoughtworks.xstream.p042io.naming.NameCoder
    public String encodeNode(String str) {
        return this.wrapped.encodeNode(str);
    }
}
