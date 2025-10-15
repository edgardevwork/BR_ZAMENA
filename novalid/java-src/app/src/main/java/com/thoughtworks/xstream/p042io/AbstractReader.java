package com.thoughtworks.xstream.p042io;

import com.thoughtworks.xstream.core.util.Cloneables;
import com.thoughtworks.xstream.p042io.naming.NameCoder;
import com.thoughtworks.xstream.p042io.naming.NoNameCoder;

/* loaded from: classes7.dex */
public abstract class AbstractReader implements ExtendedHierarchicalStreamReader {
    public NameCoder nameCoder;

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public HierarchicalStreamReader underlyingReader() {
        return this;
    }

    public AbstractReader() {
        this(new NoNameCoder());
    }

    public AbstractReader(NameCoder nameCoder) {
        this.nameCoder = (NameCoder) Cloneables.cloneIfPossible(nameCoder);
    }

    public String decodeNode(String str) {
        return this.nameCoder.decodeNode(str);
    }

    public String decodeAttribute(String str) {
        return this.nameCoder.decodeAttribute(str);
    }

    public String encodeNode(String str) {
        return this.nameCoder.encodeNode(str);
    }

    public String encodeAttribute(String str) {
        return this.nameCoder.encodeAttribute(str);
    }

    @Override // com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamReader
    public String peekNextChild() {
        throw new UnsupportedOperationException("peekNextChild");
    }
}
