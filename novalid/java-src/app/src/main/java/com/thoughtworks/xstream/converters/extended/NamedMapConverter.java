package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.collections.MapConverter;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.core.SecurityUtils;
import com.thoughtworks.xstream.core.util.HierarchicalStreams;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.util.Map;

/* loaded from: classes7.dex */
public class NamedMapConverter extends MapConverter {
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper$Null;
    public final String entryName;
    public final Mapper enumMapper;
    public final boolean keyAsAttribute;
    public final String keyName;
    public final Class keyType;
    public final ConverterLookup lookup;
    public final boolean valueAsAttribute;
    public final String valueName;
    public final Class valueType;

    public NamedMapConverter(Mapper mapper, String str, String str2, Class cls, String str3, Class cls2) {
        this(mapper, str, str2, cls, str3, cls2, false, false, null);
    }

    public NamedMapConverter(Class cls, Mapper mapper, String str, String str2, Class cls2, String str3, Class cls3) {
        this(cls, mapper, str, str2, cls2, str3, cls3, false, false, null);
    }

    public NamedMapConverter(Mapper mapper, String str, String str2, Class cls, String str3, Class cls2, boolean z, boolean z2, ConverterLookup converterLookup) {
        this(null, mapper, str, str2, cls, str3, cls2, z, z2, converterLookup);
    }

    public NamedMapConverter(Class cls, Mapper mapper, String str, String str2, Class cls2, String str3, Class cls3, boolean z, boolean z2, ConverterLookup converterLookup) {
        super(mapper, cls);
        this.entryName = (str == null || str.length() != 0) ? str : null;
        this.keyName = (str2 == null || str2.length() != 0) ? str2 : null;
        this.keyType = cls2;
        this.valueName = (str3 == null || str3.length() != 0) ? str3 : null;
        this.valueType = cls3;
        this.keyAsAttribute = z;
        this.valueAsAttribute = z2;
        this.lookup = converterLookup;
        this.enumMapper = JVM.isVersion(5) ? UseAttributeForEnumMapper.createEnumMapper(mapper) : null;
        if (cls2 == null || cls3 == null) {
            throw new IllegalArgumentException("Class types of key and value are mandatory");
        }
        if (str == null) {
            if (z || z2) {
                throw new IllegalArgumentException("Cannot write attributes to map entry, if map entry must be omitted");
            }
            if (str3 == null) {
                throw new IllegalArgumentException("Cannot write value as text of entry, if entry must be omitted");
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Cannot write key without name");
        }
        if (str3 == null) {
            if (z2) {
                throw new IllegalArgumentException("Cannot write value as attribute without name");
            }
            if (!z) {
                throw new IllegalArgumentException("Cannot write value as text of entry, if key is also child element");
            }
        }
        if (z && z2 && str2.equals(str3)) {
            throw new IllegalArgumentException("Cannot write key and value with same attribute name");
        }
    }

    @Override // com.thoughtworks.xstream.converters.collections.MapConverter, com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) throws Throwable {
        Map map = (Map) obj;
        SingleValueConverter singleValueConverter = this.keyAsAttribute ? getSingleValueConverter(this.keyType, "key") : null;
        SingleValueConverter singleValueConverter2 = (this.valueAsAttribute || this.valueName == null) ? getSingleValueConverter(this.valueType, "value") : null;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            String str = this.entryName;
            if (str != null) {
                ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, str, entry.getClass());
                if (singleValueConverter != null && key != null) {
                    hierarchicalStreamWriter.addAttribute(this.keyName, singleValueConverter.toString(key));
                }
                String str2 = this.valueName;
                if (str2 != null && singleValueConverter2 != null && value != null) {
                    hierarchicalStreamWriter.addAttribute(str2, singleValueConverter2.toString(value));
                }
            }
            if (singleValueConverter == null) {
                writeItem(this.keyName, this.keyType, key, marshallingContext, hierarchicalStreamWriter);
            }
            if (singleValueConverter2 == null) {
                writeItem(this.valueName, this.valueType, value, marshallingContext, hierarchicalStreamWriter);
            } else if (this.valueName == null) {
                hierarchicalStreamWriter.setValue(singleValueConverter2.toString(value));
            }
            if (this.entryName != null) {
                hierarchicalStreamWriter.endNode();
            }
        }
    }

    @Override // com.thoughtworks.xstream.converters.collections.MapConverter
    public void populateMap(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext, Map map, Map map2) throws Throwable {
        Object item;
        Object objFromString;
        String attribute;
        String attribute2;
        SingleValueConverter singleValueConverter = this.keyAsAttribute ? getSingleValueConverter(this.keyType, "key") : null;
        SingleValueConverter singleValueConverter2 = (this.valueAsAttribute || this.valueName == null) ? getSingleValueConverter(this.valueType, "value") : null;
        while (hierarchicalStreamReader.hasMoreChildren()) {
            if (this.entryName != null) {
                hierarchicalStreamReader.moveDown();
                item = (singleValueConverter == null || (attribute2 = hierarchicalStreamReader.getAttribute(this.keyName)) == null) ? null : singleValueConverter.fromString(attribute2);
                objFromString = (!this.valueAsAttribute || singleValueConverter2 == null || (attribute = hierarchicalStreamReader.getAttribute(this.valueName)) == null) ? null : singleValueConverter2.fromString(attribute);
            } else {
                item = null;
                objFromString = null;
            }
            if (singleValueConverter == null) {
                hierarchicalStreamReader.moveDown();
                if (singleValueConverter2 == null && !this.keyName.equals(this.valueName) && hierarchicalStreamReader.getNodeName().equals(this.valueName)) {
                    objFromString = readItem(this.valueType, hierarchicalStreamReader, unmarshallingContext, map);
                } else {
                    item = readItem(this.keyType, hierarchicalStreamReader, unmarshallingContext, map);
                }
                hierarchicalStreamReader.moveUp();
            }
            if (singleValueConverter2 == null) {
                hierarchicalStreamReader.moveDown();
                if (singleValueConverter == null && item == null && objFromString != null) {
                    item = readItem(this.keyType, hierarchicalStreamReader, unmarshallingContext, map);
                } else {
                    objFromString = readItem(this.valueType, hierarchicalStreamReader, unmarshallingContext, map);
                }
                hierarchicalStreamReader.moveUp();
            } else if (!this.valueAsAttribute) {
                objFromString = singleValueConverter2.fromString(hierarchicalStreamReader.getValue());
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            map2.put(item, objFromString);
            SecurityUtils.checkForCollectionDoSAttack(unmarshallingContext, jCurrentTimeMillis);
            if (this.entryName != null) {
                hierarchicalStreamReader.moveUp();
            }
        }
    }

    public final SingleValueConverter getSingleValueConverter(Class cls, String str) {
        SingleValueConverter converterFromItemType = (UseAttributeForEnumMapper.isEnum(cls) ? this.enumMapper : mapper()).getConverterFromItemType(null, cls, null);
        if (converterFromItemType != null) {
            return converterFromItemType;
        }
        Converter converterLookupConverterForType = this.lookup.lookupConverterForType(cls);
        if (converterLookupConverterForType instanceof SingleValueConverter) {
            return (SingleValueConverter) converterLookupConverterForType;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("No SingleValueConverter for ");
        stringBuffer.append(str);
        stringBuffer.append(" available");
        throw new ConversionException(stringBuffer.toString());
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public void writeItem(String str, Class cls, Object obj, MarshallingContext marshallingContext, HierarchicalStreamWriter hierarchicalStreamWriter) throws Throwable {
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
        ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, str, clsClass$);
        if (!clsClass$.equals(cls) && (strAliasForSystemAttribute = mapper().aliasForSystemAttribute("class")) != null) {
            hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute, mapper().serializedClass(clsClass$));
        }
        if (obj != null) {
            marshallingContext.convertAnother(obj);
        }
        hierarchicalStreamWriter.endNode();
    }

    public Object readItem(Class cls, HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext, Object obj) throws Throwable {
        String classAttribute = HierarchicalStreams.readClassAttribute(hierarchicalStreamReader, mapper());
        if (classAttribute != null) {
            cls = mapper().realClass(classAttribute);
        }
        Class clsClass$ = class$com$thoughtworks$xstream$mapper$Mapper$Null;
        if (clsClass$ == null) {
            clsClass$ = class$("com.thoughtworks.xstream.mapper.Mapper$Null");
            class$com$thoughtworks$xstream$mapper$Mapper$Null = clsClass$;
        }
        if (clsClass$.equals(cls)) {
            return null;
        }
        return unmarshallingContext.convertAnother(obj, cls);
    }
}
