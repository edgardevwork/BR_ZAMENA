package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.util.HierarchicalStreams;
import com.thoughtworks.xstream.core.util.Primitives;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class NamedArrayConverter implements Converter {
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper$Null;
    public final Class arrayType;
    public final String itemName;
    public final Mapper mapper;

    public NamedArrayConverter(Class cls, Mapper mapper, String str) {
        if (!cls.isArray()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(cls.getName());
            stringBuffer.append(" is not an array");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        this.arrayType = cls;
        this.mapper = mapper;
        this.itemName = str;
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls == this.arrayType;
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) throws Throwable {
        Class<?> clsUnbox;
        String strAliasForSystemAttribute;
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 == null) {
                clsUnbox = class$com$thoughtworks$xstream$mapper$Mapper$Null;
                if (clsUnbox == null) {
                    clsUnbox = class$("com.thoughtworks.xstream.mapper.Mapper$Null");
                    class$com$thoughtworks$xstream$mapper$Mapper$Null = clsUnbox;
                }
            } else if (this.arrayType.getComponentType().isPrimitive()) {
                clsUnbox = Primitives.unbox(obj2.getClass());
            } else {
                clsUnbox = obj2.getClass();
            }
            ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, this.itemName, clsUnbox);
            if (!clsUnbox.equals(this.arrayType.getComponentType()) && (strAliasForSystemAttribute = this.mapper.aliasForSystemAttribute("class")) != null) {
                hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute, this.mapper.serializedClass(clsUnbox));
            }
            if (obj2 != null) {
                marshallingContext.convertAnother(obj2);
            }
            hierarchicalStreamWriter.endNode();
        }
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) throws Throwable {
        ArrayList arrayList = new ArrayList();
        while (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            String classAttribute = HierarchicalStreams.readClassAttribute(hierarchicalStreamReader, this.mapper);
            Class<?> componentType = classAttribute == null ? this.arrayType.getComponentType() : this.mapper.realClass(classAttribute);
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$Mapper$Null;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.Mapper$Null");
                class$com$thoughtworks$xstream$mapper$Mapper$Null = clsClass$;
            }
            Object objConvertAnother = null;
            if (!clsClass$.equals(componentType)) {
                objConvertAnother = unmarshallingContext.convertAnother(null, componentType);
            }
            arrayList.add(objConvertAnother);
            hierarchicalStreamReader.moveUp();
        }
        Object objNewInstance = Array.newInstance(this.arrayType.getComponentType(), arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }
}
