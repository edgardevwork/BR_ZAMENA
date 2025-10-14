package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.basic.BooleanConverter;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class AtomicBooleanConverter extends BooleanConverter implements Converter {
    @Override // com.thoughtworks.xstream.converters.basic.BooleanConverter, com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls != null && cls == AtomicBoolean.class;
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
        AtomicBoolean atomicBoolean = new AtomicBoolean("1".equals(hierarchicalStreamReader.getValue()));
        hierarchicalStreamReader.moveUp();
        return atomicBoolean;
    }

    @Override // com.thoughtworks.xstream.converters.basic.BooleanConverter, com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        return super.toString(((AtomicBoolean) obj).get() ? Boolean.TRUE : Boolean.FALSE);
    }

    @Override // com.thoughtworks.xstream.converters.basic.BooleanConverter, com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return new AtomicBoolean(((Boolean) super.fromString(str)).booleanValue());
    }
}
