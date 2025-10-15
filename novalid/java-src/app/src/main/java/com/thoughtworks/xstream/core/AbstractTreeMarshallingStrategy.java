package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.MarshallingStrategy;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.DataHolder;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;

/* loaded from: classes5.dex */
public abstract class AbstractTreeMarshallingStrategy implements MarshallingStrategy {
    public abstract TreeMarshaller createMarshallingContext(HierarchicalStreamWriter hierarchicalStreamWriter, ConverterLookup converterLookup, Mapper mapper);

    public abstract TreeUnmarshaller createUnmarshallingContext(Object obj, HierarchicalStreamReader hierarchicalStreamReader, ConverterLookup converterLookup, Mapper mapper);

    @Override // com.thoughtworks.xstream.MarshallingStrategy
    public Object unmarshal(Object obj, HierarchicalStreamReader hierarchicalStreamReader, DataHolder dataHolder, ConverterLookup converterLookup, Mapper mapper) {
        return createUnmarshallingContext(obj, hierarchicalStreamReader, converterLookup, mapper).start(dataHolder);
    }

    @Override // com.thoughtworks.xstream.MarshallingStrategy
    public void marshal(HierarchicalStreamWriter hierarchicalStreamWriter, Object obj, ConverterLookup converterLookup, Mapper mapper, DataHolder dataHolder) {
        createMarshallingContext(hierarchicalStreamWriter, converterLookup, mapper).start(obj, dataHolder);
    }
}
