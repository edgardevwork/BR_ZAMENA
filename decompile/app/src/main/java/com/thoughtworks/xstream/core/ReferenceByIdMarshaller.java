package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.p042io.path.Path;

/* loaded from: classes7.dex */
public class ReferenceByIdMarshaller extends AbstractReferenceMarshaller {
    public final IDGenerator idGenerator;

    /* loaded from: classes8.dex */
    public interface IDGenerator {
        String next(Object obj);
    }

    public ReferenceByIdMarshaller(HierarchicalStreamWriter hierarchicalStreamWriter, ConverterLookup converterLookup, Mapper mapper, IDGenerator iDGenerator) {
        super(hierarchicalStreamWriter, converterLookup, mapper);
        this.idGenerator = iDGenerator;
    }

    public ReferenceByIdMarshaller(HierarchicalStreamWriter hierarchicalStreamWriter, ConverterLookup converterLookup, Mapper mapper) {
        this(hierarchicalStreamWriter, converterLookup, mapper, new SequenceGenerator(1));
    }

    @Override // com.thoughtworks.xstream.core.AbstractReferenceMarshaller
    public String createReference(Path path, Object obj) {
        return obj.toString();
    }

    @Override // com.thoughtworks.xstream.core.AbstractReferenceMarshaller
    public Object createReferenceKey(Path path, Object obj) {
        return this.idGenerator.next(obj);
    }

    @Override // com.thoughtworks.xstream.core.AbstractReferenceMarshaller
    public void fireValidReference(Object obj) {
        String strAliasForSystemAttribute = getMapper().aliasForSystemAttribute("id");
        if (strAliasForSystemAttribute != null) {
            this.writer.addAttribute(strAliasForSystemAttribute, obj.toString());
        }
    }
}
