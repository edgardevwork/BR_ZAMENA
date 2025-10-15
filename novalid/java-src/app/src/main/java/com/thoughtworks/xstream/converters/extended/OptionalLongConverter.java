package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.basic.LongConverter;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.util.OptionalLong;

/* loaded from: classes7.dex */
public class OptionalLongConverter extends LongConverter implements Converter {
    @Override // com.thoughtworks.xstream.converters.basic.LongConverter, com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls != null && cls == OptionalLong.class;
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
        boolean zBooleanValue = ((Boolean) unmarshallingContext.convertAnother(unmarshallingContext, Boolean.class)).booleanValue();
        hierarchicalStreamReader.moveUp();
        hierarchicalStreamReader.moveDown();
        long jLongValue = ((Long) unmarshallingContext.convertAnother(unmarshallingContext, Long.class)).longValue();
        hierarchicalStreamReader.moveUp();
        return zBooleanValue ? OptionalLong.of(jLongValue) : OptionalLong.empty();
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        OptionalLong optionalLong = (OptionalLong) obj;
        return optionalLong.isPresent() ? super.toString(Long.valueOf(optionalLong.getAsLong())) : "";
    }

    @Override // com.thoughtworks.xstream.converters.basic.LongConverter, com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return (str == null || str.length() == 0) ? OptionalLong.empty() : OptionalLong.of(((Long) super.fromString(str)).longValue());
    }
}
