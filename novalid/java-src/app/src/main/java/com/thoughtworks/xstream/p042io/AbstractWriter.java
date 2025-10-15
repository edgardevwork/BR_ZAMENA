package com.thoughtworks.xstream.p042io;

import com.thoughtworks.xstream.core.util.Cloneables;
import com.thoughtworks.xstream.p042io.naming.NameCoder;
import com.thoughtworks.xstream.p042io.naming.NoNameCoder;

/* loaded from: classes6.dex */
public abstract class AbstractWriter implements ExtendedHierarchicalStreamWriter {
    public NameCoder nameCoder;

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public HierarchicalStreamWriter underlyingWriter() {
        return this;
    }

    public AbstractWriter() {
        this(new NoNameCoder());
    }

    public AbstractWriter(NameCoder nameCoder) {
        this.nameCoder = (NameCoder) Cloneables.cloneIfPossible(nameCoder);
    }

    @Override // com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriter
    public void startNode(String str, Class cls) {
        startNode(str);
    }

    public String encodeNode(String str) {
        return this.nameCoder.encodeNode(str);
    }

    public String encodeAttribute(String str) {
        return this.nameCoder.encodeAttribute(str);
    }
}
