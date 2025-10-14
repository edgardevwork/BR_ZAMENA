package com.thoughtworks.xstream.p042io;

import com.thoughtworks.xstream.core.util.FastStack;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public class StatefulWriter extends WriterWrapper {
    public static int STATE_CLOSED = 4;
    public static int STATE_NODE_END = 3;
    public static int STATE_NODE_START = 1;
    public static int STATE_OPEN = 0;
    public static int STATE_VALUE = 2;
    public transient FastStack attributes;
    public transient int balance;
    public transient int state;

    public StatefulWriter(HierarchicalStreamWriter hierarchicalStreamWriter) {
        super(hierarchicalStreamWriter);
        this.state = STATE_OPEN;
        this.attributes = new FastStack(16);
    }

    @Override // com.thoughtworks.xstream.p042io.WriterWrapper, com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void startNode(String str) {
        startNodeCommon();
        super.startNode(str);
    }

    @Override // com.thoughtworks.xstream.p042io.WriterWrapper, com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriter
    public void startNode(String str, Class cls) {
        startNodeCommon();
        super.startNode(str, cls);
    }

    public final void startNodeCommon() {
        checkClosed();
        if (this.state == STATE_VALUE) {
            throw new StreamException(new IllegalStateException("Opening node after writing text"));
        }
        this.state = STATE_NODE_START;
        this.balance++;
        this.attributes.push(new HashSet());
    }

    @Override // com.thoughtworks.xstream.p042io.WriterWrapper, com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void addAttribute(String str, String str2) {
        checkClosed();
        if (this.state != STATE_NODE_START) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Writing attribute '");
            stringBuffer.append(str);
            stringBuffer.append("' without an opened node");
            throw new StreamException(new IllegalStateException(stringBuffer.toString()));
        }
        Set set = (Set) this.attributes.peek();
        if (set.contains(str)) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Writing attribute '");
            stringBuffer2.append(str);
            stringBuffer2.append("' twice");
            throw new StreamException(new IllegalStateException(stringBuffer2.toString()));
        }
        set.add(str);
        super.addAttribute(str, str2);
    }

    @Override // com.thoughtworks.xstream.p042io.WriterWrapper, com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void setValue(String str) {
        checkClosed();
        if (this.state != STATE_NODE_START) {
            throw new StreamException(new IllegalStateException("Writing text without an opened node"));
        }
        this.state = STATE_VALUE;
        super.setValue(str);
    }

    @Override // com.thoughtworks.xstream.p042io.WriterWrapper, com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void endNode() {
        checkClosed();
        int i = this.balance;
        this.balance = i - 1;
        if (i == 0) {
            throw new StreamException(new IllegalStateException("Unbalanced node"));
        }
        this.attributes.popSilently();
        this.state = STATE_NODE_END;
        super.endNode();
    }

    @Override // com.thoughtworks.xstream.p042io.WriterWrapper, com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void flush() {
        checkClosed();
        super.flush();
    }

    @Override // com.thoughtworks.xstream.p042io.WriterWrapper, com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void close() {
        this.state = STATE_CLOSED;
        super.close();
    }

    public final void checkClosed() {
        if (this.state == STATE_CLOSED) {
            throw new StreamException(new IOException("Writing on a closed stream"));
        }
    }

    public int state() {
        return this.state;
    }

    public final Object readResolve() {
        this.attributes = new FastStack(16);
        return this;
    }
}
