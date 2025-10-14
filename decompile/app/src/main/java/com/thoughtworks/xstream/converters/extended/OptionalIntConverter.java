package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.basic.IntConverter;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.util.OptionalInt;

/* loaded from: classes7.dex */
public class OptionalIntConverter extends IntConverter implements Converter {
    @Override // com.thoughtworks.xstream.converters.basic.IntConverter, com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls != null && cls == OptionalInt.class;
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
        int iIntValue = ((Integer) unmarshallingContext.convertAnother(unmarshallingContext, Integer.class)).intValue();
        hierarchicalStreamReader.moveUp();
        return zBooleanValue ? OptionalInt.of(iIntValue) : OptionalInt.empty();
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        OptionalInt optionalInt = (OptionalInt) obj;
        return optionalInt.isPresent() ? super.toString(Integer.valueOf(optionalInt.getAsInt())) : "";
    }

    @Override // com.thoughtworks.xstream.converters.basic.IntConverter, com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return (str == null || str.length() == 0) ? OptionalInt.empty() : OptionalInt.of(((Integer) super.fromString(str)).intValue());
    }
}
