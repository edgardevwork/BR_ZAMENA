package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.basic.DoubleConverter;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.util.OptionalDouble;

/* loaded from: classes7.dex */
public class OptionalDoubleConverter extends DoubleConverter implements Converter {
    @Override // com.thoughtworks.xstream.converters.basic.DoubleConverter, com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls != null && cls == OptionalDouble.class;
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
        double dDoubleValue = ((Double) unmarshallingContext.convertAnother(unmarshallingContext, Double.class)).doubleValue();
        hierarchicalStreamReader.moveUp();
        return zBooleanValue ? OptionalDouble.of(dDoubleValue) : OptionalDouble.empty();
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        OptionalDouble optionalDouble = (OptionalDouble) obj;
        return optionalDouble.isPresent() ? super.toString(Double.valueOf(optionalDouble.getAsDouble())) : "";
    }

    @Override // com.thoughtworks.xstream.converters.basic.DoubleConverter, com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        if (str == null || str.length() == 0) {
            return OptionalDouble.empty();
        }
        return OptionalDouble.of(((Double) super.fromString(str)).doubleValue());
    }
}
