package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.basic.LongConverter;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public class AtomicLongConverter extends LongConverter implements Converter {
    @Override // com.thoughtworks.xstream.converters.basic.LongConverter, com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls != null && cls == AtomicLong.class;
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        hierarchicalStreamWriter.setValue(toString(obj));
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        String value = hierarchicalStreamReader.getValue();
        if (!hierarchicalStreamReader.hasMoreChildren()) {
            return fromString(value);
        }
        hierarchicalStreamReader.moveDown();
        Long l = (Long) super.fromString(hierarchicalStreamReader.getValue());
        hierarchicalStreamReader.moveUp();
        return new AtomicLong(l.longValue());
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        return super.toString(new Long(((AtomicLong) obj).get()));
    }

    @Override // com.thoughtworks.xstream.converters.basic.LongConverter, com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return new AtomicLong(((Long) super.fromString(str)).longValue());
    }
}
