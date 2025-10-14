package com.thoughtworks.xstream.converters.collections;

import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import java.util.Collections;

/* loaded from: classes7.dex */
public class SingletonMapConverter extends MapConverter {
    public static final Class MAP = Collections.singletonMap(Boolean.TRUE, null).getClass();

    public SingletonMapConverter(Mapper mapper) {
        super(mapper);
    }

    @Override // com.thoughtworks.xstream.converters.collections.MapConverter, com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return MAP == cls;
    }

    @Override // com.thoughtworks.xstream.converters.collections.MapConverter, com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        hierarchicalStreamReader.moveDown();
        Object completeItem = readCompleteItem(hierarchicalStreamReader, unmarshallingContext, null);
        Object completeItem2 = readCompleteItem(hierarchicalStreamReader, unmarshallingContext, null);
        hierarchicalStreamReader.moveUp();
        return Collections.singletonMap(completeItem, completeItem2);
    }
}
