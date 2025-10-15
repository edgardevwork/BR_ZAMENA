package com.thoughtworks.xstream.converters.time;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.time.Clock;
import java.time.ZoneId;

/* loaded from: classes6.dex */
public class SystemClockConverter implements Converter {
    public final Mapper mapper;
    public final Class<?> type = Clock.systemUTC().getClass();

    public SystemClockConverter(Mapper mapper) {
        this.mapper = mapper;
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls == this.type;
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        Clock clockM4769m = SystemClockConverter$$ExternalSyntheticApiModelOutline0.m4769m(obj);
        ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, this.mapper.serializedMember(SystemClockConverter$$ExternalSyntheticApiModelOutline1.m4770m(), "zone"), null);
        marshallingContext.convertAnother(clockM4769m.getZone());
        hierarchicalStreamWriter.endNode();
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        hierarchicalStreamReader.moveDown();
        ZoneId zoneIdM4774m = SystemClockConverter$$ExternalSyntheticApiModelOutline5.m4774m(unmarshallingContext.convertAnother(null, SystemClockConverter$$ExternalSyntheticApiModelOutline4.m4773m()));
        hierarchicalStreamReader.moveUp();
        return Clock.system(zoneIdM4774m);
    }
}
