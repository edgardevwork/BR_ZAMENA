package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;

/* loaded from: classes7.dex */
public class ReferenceByIdUnmarshaller extends AbstractReferenceUnmarshaller {
    @Override // com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller
    public Object getReferenceKey(String str) {
        return str;
    }

    public ReferenceByIdUnmarshaller(Object obj, HierarchicalStreamReader hierarchicalStreamReader, ConverterLookup converterLookup, Mapper mapper) {
        super(obj, hierarchicalStreamReader, converterLookup, mapper);
    }

    @Override // com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller
    public Object getCurrentReferenceKey() {
        String strAliasForSystemAttribute = getMapper().aliasForSystemAttribute("id");
        if (strAliasForSystemAttribute == null) {
            return null;
        }
        return this.reader.getAttribute(strAliasForSystemAttribute);
    }
}
