package com.thoughtworks.xstream.converters.time;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.reflection.SerializableConverter;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.time.temporal.ValueRange;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class ValueRangeConverter implements Converter {
    public final Mapper mapper;

    public ValueRangeConverter(Mapper mapper) {
        this.mapper = mapper;
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls == ValueRangeConverter$$ExternalSyntheticApiModelOutline0.m4781m();
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        ValueRange valueRangeM4783m = ValueRangeConverter$$ExternalSyntheticApiModelOutline2.m4783m(obj);
        write("maxLargest", valueRangeM4783m.getMaximum(), hierarchicalStreamWriter);
        write("maxSmallest", valueRangeM4783m.getSmallestMaximum(), hierarchicalStreamWriter);
        write("minLargest", valueRangeM4783m.getLargestMinimum(), hierarchicalStreamWriter);
        write("minSmallest", valueRangeM4783m.getMinimum(), hierarchicalStreamWriter);
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        boolean zEquals = "custom".equals(hierarchicalStreamReader.getAttribute(this.mapper.aliasForSystemAttribute(SerializableConverter.ATTRIBUTE_SERIALIZATION)));
        if (zEquals) {
            hierarchicalStreamReader.moveDown();
            hierarchicalStreamReader.moveDown();
        }
        HashMap map = new HashMap();
        while (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            String nodeName = hierarchicalStreamReader.getNodeName();
            if (!zEquals) {
                nodeName = this.mapper.realMember(ValueRangeConverter$$ExternalSyntheticApiModelOutline0.m4781m(), nodeName);
            }
            map.put(nodeName, Long.valueOf(hierarchicalStreamReader.getValue()));
            hierarchicalStreamReader.moveUp();
        }
        if (zEquals) {
            hierarchicalStreamReader.moveUp();
            hierarchicalStreamReader.moveUp();
        }
        return ValueRange.of(((Long) map.get("minSmallest")).longValue(), ((Long) map.get("minLargest")).longValue(), ((Long) map.get("maxSmallest")).longValue(), ((Long) map.get("maxLargest")).longValue());
    }

    public final void write(String str, long j, HierarchicalStreamWriter hierarchicalStreamWriter) {
        ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, this.mapper.serializedMember(ValueRangeConverter$$ExternalSyntheticApiModelOutline0.m4781m(), str), Long.TYPE);
        hierarchicalStreamWriter.setValue(String.valueOf(j));
        hierarchicalStreamWriter.endNode();
    }
}
