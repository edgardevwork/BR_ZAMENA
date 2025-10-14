package com.thoughtworks.xstream.p042io.binary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class ReaderDepthState {
    public static final String EMPTY_STRING = "";
    public State current;

    public static class State {
        public List attributes;
        public boolean hasMoreChildren;
        public String name;
        public State parent;
        public String value;

        public State() {
        }
    }

    public static class Attribute {
        public String name;
        public String value;

        public Attribute() {
        }
    }

    public void push() {
        State state = new State();
        state.parent = this.current;
        this.current = state;
    }

    public void pop() {
        this.current = this.current.parent;
    }

    public String getName() {
        return this.current.name;
    }

    public void setName(String str) {
        this.current.name = str;
    }

    public String getValue() {
        String str = this.current.value;
        return str == null ? "" : str;
    }

    public void setValue(String str) {
        this.current.value = str;
    }

    public boolean hasMoreChildren() {
        return this.current.hasMoreChildren;
    }

    public void setHasMoreChildren(boolean z) {
        this.current.hasMoreChildren = z;
    }

    public void addAttribute(String str, String str2) {
        Attribute attribute = new Attribute();
        attribute.name = str;
        attribute.value = str2;
        State state = this.current;
        if (state.attributes == null) {
            state.attributes = new ArrayList();
        }
        this.current.attributes.add(attribute);
    }

    public String getAttribute(String str) {
        List<Attribute> list = this.current.attributes;
        if (list == null) {
            return null;
        }
        for (Attribute attribute : list) {
            if (attribute.name.equals(str)) {
                return attribute.value;
            }
        }
        return null;
    }

    public String getAttribute(int i) {
        List list = this.current.attributes;
        if (list == null) {
            return null;
        }
        return ((Attribute) list.get(i)).value;
    }

    public String getAttributeName(int i) {
        List list = this.current.attributes;
        if (list == null) {
            return null;
        }
        return ((Attribute) list.get(i)).name;
    }

    public int getAttributeCount() {
        List list = this.current.attributes;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Iterator getAttributeNames() {
        List list = this.current.attributes;
        if (list == null) {
            return Collections.EMPTY_SET.iterator();
        }
        final Iterator it = list.iterator();
        return new Iterator() { // from class: com.thoughtworks.xstream.io.binary.ReaderDepthState.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                return ((Attribute) it.next()).name;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
