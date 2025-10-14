package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.AbstractReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.path.Path;
import com.thoughtworks.xstream.p042io.path.PathTracker;
import com.thoughtworks.xstream.p042io.path.PathTrackingReader;

/* loaded from: classes7.dex */
public class ReferenceByXPathUnmarshaller extends AbstractReferenceUnmarshaller {
    public boolean isNameEncoding;
    public PathTracker pathTracker;

    public ReferenceByXPathUnmarshaller(Object obj, HierarchicalStreamReader hierarchicalStreamReader, ConverterLookup converterLookup, Mapper mapper) {
        super(obj, hierarchicalStreamReader, converterLookup, mapper);
        PathTracker pathTracker = new PathTracker();
        this.pathTracker = pathTracker;
        this.reader = new PathTrackingReader(hierarchicalStreamReader, pathTracker);
        this.isNameEncoding = hierarchicalStreamReader.underlyingReader() instanceof AbstractReader;
    }

    @Override // com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller
    public Object getReferenceKey(String str) {
        Path path = new Path(this.isNameEncoding ? ((AbstractReader) this.reader.underlyingReader()).decodeNode(str) : str);
        return str.charAt(0) != '/' ? this.pathTracker.getPath().apply(path) : path;
    }

    @Override // com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller
    public Object getCurrentReferenceKey() {
        return this.pathTracker.getPath();
    }
}
