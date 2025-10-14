package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.collections.CollectionConverter;
import com.thoughtworks.xstream.core.util.HierarchicalStreams;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;

/* loaded from: classes7.dex */
public class NamedCollectionConverter extends CollectionConverter {
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper$Null;
    public final String name;
    public final Class type;

    public NamedCollectionConverter(Mapper mapper, String str, Class cls) {
        this(null, mapper, str, cls);
    }

    public NamedCollectionConverter(Class cls, Mapper mapper, String str, Class cls2) {
        super(mapper, cls);
        this.name = str;
        this.type = cls2;
    }

    @Override // com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter
    public void writeCompleteItem(Object obj, MarshallingContext marshallingContext, HierarchicalStreamWriter hierarchicalStreamWriter) throws Throwable {
        writeItem(obj, marshallingContext, hierarchicalStreamWriter);
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter
    public void writeItem(Object obj, MarshallingContext marshallingContext, HierarchicalStreamWriter hierarchicalStreamWriter) throws Throwable {
        Class<?> clsClass$;
        String strAliasForSystemAttribute;
        if (obj == null) {
            clsClass$ = class$com$thoughtworks$xstream$mapper$Mapper$Null;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.Mapper$Null");
                class$com$thoughtworks$xstream$mapper$Mapper$Null = clsClass$;
            }
        } else {
            clsClass$ = obj.getClass();
        }
        ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, this.name, clsClass$);
        if (!clsClass$.equals(this.type) && (strAliasForSystemAttribute = mapper().aliasForSystemAttribute("class")) != null) {
            hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute, mapper().serializedClass(clsClass$));
        }
        if (obj != null) {
            marshallingContext.convertAnother(obj);
        }
        hierarchicalStreamWriter.endNode();
    }

    @Override // com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter
    public Object readBareItem(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext, Object obj) throws Throwable {
        String classAttribute = HierarchicalStreams.readClassAttribute(hierarchicalStreamReader, mapper());
        Class clsRealClass = classAttribute == null ? this.type : mapper().realClass(classAttribute);
        Class clsClass$ = class$com$thoughtworks$xstream$mapper$Mapper$Null;
        if (clsClass$ == null) {
            clsClass$ = class$("com.thoughtworks.xstream.mapper.Mapper$Null");
            class$com$thoughtworks$xstream$mapper$Mapper$Null = clsClass$;
        }
        if (clsClass$.equals(clsRealClass)) {
            return null;
        }
        return unmarshallingContext.convertAnother(obj, clsRealClass);
    }
}
