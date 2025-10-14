package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.p042io.path.Path;

/* loaded from: classes7.dex */
public class ReferenceByXPathMarshaller extends AbstractReferenceMarshaller {
    public final int mode;

    @Override // com.thoughtworks.xstream.core.AbstractReferenceMarshaller
    public Object createReferenceKey(Path path, Object obj) {
        return path;
    }

    @Override // com.thoughtworks.xstream.core.AbstractReferenceMarshaller
    public void fireValidReference(Object obj) {
    }

    public ReferenceByXPathMarshaller(HierarchicalStreamWriter hierarchicalStreamWriter, ConverterLookup converterLookup, Mapper mapper, int i) {
        super(hierarchicalStreamWriter, converterLookup, mapper);
        this.mode = i;
    }

    @Override // com.thoughtworks.xstream.core.AbstractReferenceMarshaller
    public String createReference(Path path, Object obj) {
        Path pathRelativeTo = (Path) obj;
        if ((this.mode & ReferenceByXPathMarshallingStrategy.ABSOLUTE) <= 0) {
            pathRelativeTo = path.relativeTo(pathRelativeTo);
        }
        return (this.mode & ReferenceByXPathMarshallingStrategy.SINGLE_NODE) > 0 ? pathRelativeTo.explicit() : pathRelativeTo.toString();
    }
}
