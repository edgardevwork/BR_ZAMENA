package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.util.HierarchicalStreams;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.util.Optional;

/* loaded from: classes6.dex */
public class OptionalConverter implements Converter {
    public Mapper mapper;

    public OptionalConverter(Mapper mapper) {
        this.mapper = mapper;
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls != null && cls == Optional.class;
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            hierarchicalStreamWriter.startNode(this.mapper.serializedMember(Optional.class, "value"));
            Object obj2 = optional.get();
            hierarchicalStreamWriter.addAttribute(this.mapper.aliasForSystemAttribute("class"), this.mapper.serializedClass(obj2 != null ? obj2.getClass() : null));
            marshallingContext.convertAnother(optional.get());
            hierarchicalStreamWriter.endNode();
        }
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        if (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            Object objConvertAnother = unmarshallingContext.convertAnother(unmarshallingContext, HierarchicalStreams.readClassType(hierarchicalStreamReader, this.mapper));
            hierarchicalStreamReader.moveUp();
            return Optional.of(objConvertAnother);
        }
        return Optional.empty();
    }
}
