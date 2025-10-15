package com.thoughtworks.xstream.p042io;

import com.thoughtworks.xstream.converters.ErrorReporter;
import com.thoughtworks.xstream.converters.ErrorWriter;
import java.util.Iterator;

/* loaded from: classes5.dex */
public interface HierarchicalStreamReader extends ErrorReporter {
    @Override // com.thoughtworks.xstream.converters.ErrorReporter
    void appendErrors(ErrorWriter errorWriter);

    void close();

    String getAttribute(int i);

    String getAttribute(String str);

    int getAttributeCount();

    String getAttributeName(int i);

    Iterator getAttributeNames();

    String getNodeName();

    String getValue();

    boolean hasMoreChildren();

    void moveDown();

    void moveUp();

    HierarchicalStreamReader underlyingReader();
}
