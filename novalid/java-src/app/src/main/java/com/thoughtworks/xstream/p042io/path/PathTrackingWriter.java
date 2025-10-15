package com.thoughtworks.xstream.p042io.path;

import com.thoughtworks.xstream.p042io.AbstractWriter;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.p042io.WriterWrapper;

/* loaded from: classes7.dex */
public class PathTrackingWriter extends WriterWrapper {
    public final boolean isNameEncoding;
    public final PathTracker pathTracker;

    public PathTrackingWriter(HierarchicalStreamWriter hierarchicalStreamWriter, PathTracker pathTracker) {
        super(hierarchicalStreamWriter);
        this.isNameEncoding = hierarchicalStreamWriter.underlyingWriter() instanceof AbstractWriter;
        this.pathTracker = pathTracker;
    }

    @Override // com.thoughtworks.xstream.p042io.WriterWrapper, com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void startNode(String str) {
        this.pathTracker.pushElement(this.isNameEncoding ? ((AbstractWriter) this.wrapped.underlyingWriter()).encodeNode(str) : str);
        super.startNode(str);
    }

    @Override // com.thoughtworks.xstream.p042io.WriterWrapper, com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriter
    public void startNode(String str, Class cls) {
        this.pathTracker.pushElement(this.isNameEncoding ? ((AbstractWriter) this.wrapped.underlyingWriter()).encodeNode(str) : str);
        super.startNode(str, cls);
    }

    @Override // com.thoughtworks.xstream.p042io.WriterWrapper, com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void endNode() {
        super.endNode();
        this.pathTracker.popElement();
    }
}
