package com.thoughtworks.xstream.converters.collections;

import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import java.util.Collections;

/* loaded from: classes7.dex */
public class SingletonCollectionConverter extends CollectionConverter {
    public static final Class LIST;
    public static final Class SET;

    static {
        Boolean bool = Boolean.TRUE;
        LIST = Collections.singletonList(bool).getClass();
        SET = Collections.singleton(bool).getClass();
    }

    public SingletonCollectionConverter(Mapper mapper) {
        super(mapper);
    }

    @Override // com.thoughtworks.xstream.converters.collections.CollectionConverter, com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return LIST == cls || SET == cls;
    }

    @Override // com.thoughtworks.xstream.converters.collections.CollectionConverter, com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        Object completeItem = readCompleteItem(hierarchicalStreamReader, unmarshallingContext, null);
        if (unmarshallingContext.getRequiredType() == LIST) {
            return Collections.singletonList(completeItem);
        }
        return Collections.singleton(completeItem);
    }
}
