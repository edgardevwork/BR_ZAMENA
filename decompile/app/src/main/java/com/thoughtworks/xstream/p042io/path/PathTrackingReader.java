package com.thoughtworks.xstream.p042io.path;

import com.thoughtworks.xstream.converters.ErrorWriter;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.ReaderWrapper;

/* loaded from: classes7.dex */
public class PathTrackingReader extends ReaderWrapper {
    public final PathTracker pathTracker;

    public PathTrackingReader(HierarchicalStreamReader hierarchicalStreamReader, PathTracker pathTracker) {
        super(hierarchicalStreamReader);
        this.pathTracker = pathTracker;
        pathTracker.pushElement(getNodeName());
    }

    @Override // com.thoughtworks.xstream.p042io.ReaderWrapper, com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public void moveDown() {
        super.moveDown();
        this.pathTracker.pushElement(getNodeName());
    }

    @Override // com.thoughtworks.xstream.p042io.ReaderWrapper, com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public void moveUp() {
        super.moveUp();
        this.pathTracker.popElement();
    }

    @Override // com.thoughtworks.xstream.p042io.ReaderWrapper, com.thoughtworks.xstream.p042io.HierarchicalStreamReader, com.thoughtworks.xstream.converters.ErrorReporter
    public void appendErrors(ErrorWriter errorWriter) {
        errorWriter.add("path", this.pathTracker.getPath().toString());
        super.appendErrors(errorWriter);
    }
}
