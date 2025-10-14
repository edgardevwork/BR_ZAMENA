package com.thoughtworks.xstream.converters.time;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter;
import com.thoughtworks.xstream.converters.reflection.SerializableConverter;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.time.DayOfWeek;
import java.time.temporal.WeekFields;

/* loaded from: classes6.dex */
public class WeekFieldsConverter implements Converter {
    public final Mapper mapper;

    public WeekFieldsConverter(Mapper mapper) {
        this.mapper = mapper;
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls == WeekFieldsConverter$$ExternalSyntheticApiModelOutline0.m4788m();
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        WeekFields weekFieldsM4792m = WeekFieldsConverter$$ExternalSyntheticApiModelOutline4.m4792m(obj);
        ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, this.mapper.serializedMember(WeekFieldsConverter$$ExternalSyntheticApiModelOutline0.m4788m(), "minimalDays"), Integer.TYPE);
        hierarchicalStreamWriter.setValue(String.valueOf(weekFieldsM4792m.getMinimalDaysInFirstWeek()));
        hierarchicalStreamWriter.endNode();
        ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, this.mapper.serializedMember(WeekFieldsConverter$$ExternalSyntheticApiModelOutline0.m4788m(), "firstDayOfWeek"), WeekFieldsConverter$$ExternalSyntheticApiModelOutline1.m4789m());
        marshallingContext.convertAnother(weekFieldsM4792m.getFirstDayOfWeek());
        hierarchicalStreamWriter.endNode();
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) throws NumberFormatException {
        String strRealMember;
        boolean zEquals = "custom".equals(hierarchicalStreamReader.getAttribute(this.mapper.aliasForSystemAttribute(SerializableConverter.ATTRIBUTE_SERIALIZATION)));
        if (zEquals) {
            hierarchicalStreamReader.moveDown();
            hierarchicalStreamReader.moveDown();
        }
        int i = 0;
        DayOfWeek dayOfWeekM4790m = null;
        while (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            if (zEquals) {
                strRealMember = hierarchicalStreamReader.getNodeName();
            } else {
                strRealMember = this.mapper.realMember(WeekFieldsConverter$$ExternalSyntheticApiModelOutline0.m4788m(), hierarchicalStreamReader.getNodeName());
            }
            if ("minimalDays".equals(strRealMember)) {
                i = Integer.parseInt(hierarchicalStreamReader.getValue());
            } else if ("firstDayOfWeek".equals(strRealMember)) {
                dayOfWeekM4790m = WeekFieldsConverter$$ExternalSyntheticApiModelOutline2.m4790m(unmarshallingContext.convertAnother(null, WeekFieldsConverter$$ExternalSyntheticApiModelOutline1.m4789m()));
            } else {
                throw new AbstractReflectionConverter.UnknownFieldException(WeekFieldsConverter$$ExternalSyntheticApiModelOutline0.m4788m().getName(), strRealMember);
            }
            hierarchicalStreamReader.moveUp();
        }
        if (zEquals) {
            hierarchicalStreamReader.moveUp();
            hierarchicalStreamReader.moveUp();
        }
        return WeekFields.of(dayOfWeekM4790m, i);
    }
}
