package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.core.util.FastStack;
import com.thoughtworks.xstream.p042io.AttributeNameIterator;
import com.thoughtworks.xstream.p042io.naming.NameCoder;
import java.util.Iterator;

/* loaded from: classes8.dex */
public abstract class AbstractPullReader extends AbstractXmlReader {
    public static final int COMMENT = 4;
    public static final int END_NODE = 2;
    public static final int OTHER = 0;
    public static final int START_NODE = 1;
    public static final int TEXT = 3;
    public final FastStack elementStack;
    public final FastStack lookahead;
    public final FastStack lookback;
    public boolean marked;
    public final FastStack pool;

    public abstract String pullElementName();

    public abstract int pullNextEvent();

    public abstract String pullText();

    /* loaded from: classes5.dex */
    public static class Event {
        public int type;
        public String value;

        public Event() {
        }
    }

    public AbstractPullReader(NameCoder nameCoder) {
        super(nameCoder);
        this.elementStack = new FastStack(16);
        this.pool = new FastStack(16);
        this.lookahead = new FastStack(4);
        this.lookback = new FastStack(4);
    }

    public AbstractPullReader(XmlFriendlyReplacer xmlFriendlyReplacer) {
        this((NameCoder) xmlFriendlyReplacer);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public boolean hasMoreChildren() {
        int i;
        mark();
        do {
            i = readEvent().type;
            if (i == 1) {
                reset();
                return true;
            }
        } while (i != 2);
        reset();
        return false;
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public void moveDown() {
        int size = this.elementStack.size();
        while (this.elementStack.size() <= size) {
            move();
            if (this.elementStack.size() < size) {
                throw new RuntimeException();
            }
        }
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public void moveUp() {
        int size = this.elementStack.size();
        while (this.elementStack.size() >= size) {
            move();
        }
    }

    public final void move() {
        Event event = readEvent();
        this.pool.push(event);
        int i = event.type;
        if (i == 1) {
            this.elementStack.push(pullElementName());
        } else {
            if (i != 2) {
                return;
            }
            this.elementStack.pop();
        }
    }

    public final Event readEvent() {
        if (this.marked) {
            if (this.lookback.hasStuff()) {
                return (Event) this.lookahead.push(this.lookback.pop());
            }
            return (Event) this.lookahead.push(readRealEvent());
        }
        if (this.lookback.hasStuff()) {
            return (Event) this.lookback.pop();
        }
        return readRealEvent();
    }

    public final Event readRealEvent() {
        Event event = this.pool.hasStuff() ? (Event) this.pool.pop() : new Event();
        int iPullNextEvent = pullNextEvent();
        event.type = iPullNextEvent;
        if (iPullNextEvent == 3) {
            event.value = pullText();
        } else if (iPullNextEvent == 1) {
            event.value = pullElementName();
        } else {
            event.value = null;
        }
        return event;
    }

    public void mark() {
        this.marked = true;
    }

    public void reset() {
        while (this.lookahead.hasStuff()) {
            this.lookback.push(this.lookahead.pop());
        }
        this.marked = false;
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getValue() {
        mark();
        Event event = readEvent();
        StringBuffer stringBuffer = null;
        String str = null;
        while (true) {
            int i = event.type;
            if (i == 3) {
                String str2 = event.value;
                if (str2 != null && str2.length() > 0) {
                    if (str == null) {
                        str = str2;
                    } else {
                        if (stringBuffer == null) {
                            stringBuffer = new StringBuffer(str);
                        }
                        stringBuffer.append(str2);
                    }
                }
            } else if (i != 4) {
                break;
            }
            event = readEvent();
        }
        reset();
        if (stringBuffer != null) {
            return stringBuffer.toString();
        }
        return str == null ? "" : str;
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public Iterator getAttributeNames() {
        return new AttributeNameIterator(this);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getNodeName() {
        return unescapeXmlName((String) this.elementStack.peek());
    }

    @Override // com.thoughtworks.xstream.p042io.AbstractReader, com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamReader
    public String peekNextChild() {
        int i;
        mark();
        do {
            Event event = readEvent();
            i = event.type;
            if (i == 1) {
                reset();
                return event.value;
            }
        } while (i != 2);
        reset();
        return null;
    }
}
