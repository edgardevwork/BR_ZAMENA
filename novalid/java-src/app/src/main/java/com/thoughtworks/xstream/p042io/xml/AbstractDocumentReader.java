package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.converters.ErrorWriter;
import com.thoughtworks.xstream.core.util.FastStack;
import com.thoughtworks.xstream.p042io.AttributeNameIterator;
import com.thoughtworks.xstream.p042io.naming.NameCoder;
import java.util.Iterator;

/* loaded from: classes8.dex */
public abstract class AbstractDocumentReader extends AbstractXmlReader implements DocumentReader {
    public Object current;
    public FastStack pointers;

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader, com.thoughtworks.xstream.converters.ErrorReporter
    public void appendErrors(ErrorWriter errorWriter) {
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public void close() {
    }

    public abstract Object getChild(int i);

    public abstract int getChildCount();

    public abstract Object getParent();

    public abstract void reassignCurrentElement(Object obj);

    public AbstractDocumentReader(Object obj) {
        this(obj, new XmlFriendlyNameCoder());
    }

    public AbstractDocumentReader(Object obj, NameCoder nameCoder) {
        super(nameCoder);
        FastStack fastStack = new FastStack(16);
        this.pointers = fastStack;
        this.current = obj;
        fastStack.push(new Pointer());
        reassignCurrentElement(this.current);
    }

    public AbstractDocumentReader(Object obj, XmlFriendlyReplacer xmlFriendlyReplacer) {
        this(obj, (NameCoder) xmlFriendlyReplacer);
    }

    /* loaded from: classes5.dex */
    public static class Pointer {

        /* renamed from: v */
        public int f5910v;

        public Pointer() {
        }
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public boolean hasMoreChildren() {
        return ((Pointer) this.pointers.peek()).f5910v < getChildCount();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public void moveUp() {
        this.current = getParent();
        this.pointers.popSilently();
        reassignCurrentElement(this.current);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public void moveDown() {
        Pointer pointer = (Pointer) this.pointers.peek();
        this.pointers.push(new Pointer());
        Object child = getChild(pointer.f5910v);
        this.current = child;
        pointer.f5910v++;
        reassignCurrentElement(child);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public Iterator getAttributeNames() {
        return new AttributeNameIterator(this);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.DocumentReader
    public Object getCurrent() {
        return this.current;
    }
}
