package com.thoughtworks.xstream.p042io;

/* loaded from: classes8.dex */
public interface HierarchicalStreamWriter {
    void addAttribute(String str, String str2);

    void close();

    void endNode();

    void flush();

    void setValue(String str);

    void startNode(String str);

    HierarchicalStreamWriter underlyingWriter();
}
