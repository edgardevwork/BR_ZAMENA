package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.util.HierarchicalStreams;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public class AtomicReferenceConverter implements Converter {
    public Mapper mapper;

    public AtomicReferenceConverter(Mapper mapper) {
        this.mapper = mapper;
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls != null && cls == AtomicReference.class;
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        AtomicReference atomicReference = (AtomicReference) obj;
        hierarchicalStreamWriter.startNode(this.mapper.serializedMember(AtomicReference.class, "value"));
        Object obj2 = atomicReference.get();
        hierarchicalStreamWriter.addAttribute(this.mapper.aliasForSystemAttribute("class"), this.mapper.serializedClass(obj2 != null ? obj2.getClass() : null));
        marshallingContext.convertAnother(atomicReference.get());
        hierarchicalStreamWriter.endNode();
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        hierarchicalStreamReader.moveDown();
        Object objConvertAnother = unmarshallingContext.convertAnother(unmarshallingContext, HierarchicalStreams.readClassType(hierarchicalStreamReader, this.mapper));
        hierarchicalStreamReader.moveUp();
        return new AtomicReference(objConvertAnother);
    }
}
