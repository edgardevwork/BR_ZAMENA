package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.ConverterMatcher;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.converters.reflection.SerializableConverter;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.core.util.FastField;
import com.thoughtworks.xstream.core.util.HierarchicalStreams;
import com.thoughtworks.xstream.core.util.Primitives;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class ToAttributedValueConverter implements Converter {
    public static final String STRUCTURE_MARKER = "";
    public final Mapper enumMapper;
    public final ConverterLookup lookup;
    public final Mapper mapper;
    public final ReflectionProvider reflectionProvider;
    public final Class type;
    public final Field valueField;

    public ToAttributedValueConverter(Class cls, Mapper mapper, ReflectionProvider reflectionProvider, ConverterLookup converterLookup) {
        this(cls, mapper, reflectionProvider, converterLookup, null, null);
    }

    public ToAttributedValueConverter(Class cls, Mapper mapper, ReflectionProvider reflectionProvider, ConverterLookup converterLookup, String str) {
        this(cls, mapper, reflectionProvider, converterLookup, str, null);
    }

    public ToAttributedValueConverter(Class cls, Mapper mapper, ReflectionProvider reflectionProvider, ConverterLookup converterLookup, String str, Class cls2) throws NoSuchFieldException, SecurityException {
        this.type = cls;
        this.mapper = mapper;
        this.reflectionProvider = reflectionProvider;
        this.lookup = converterLookup;
        if (str == null) {
            this.valueField = null;
        } else {
            try {
                Field declaredField = (cls2 != null ? cls2 : cls).getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                this.valueField = declaredField;
            } catch (NoSuchFieldException e) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(e.getMessage());
                stringBuffer.append(": ");
                stringBuffer.append(str);
                throw new IllegalArgumentException(stringBuffer.toString());
            }
        }
        this.enumMapper = JVM.isVersion(5) ? UseAttributeForEnumMapper.createEnumMapper(mapper) : null;
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return this.type == cls;
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, final HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        String strAliasForSystemAttribute;
        final Class<?> cls = obj.getClass();
        final HashMap map = new HashMap();
        final String[] strArr = new String[1];
        final Object[] objArr = new Object[1];
        final Class[] clsArr = new Class[1];
        final Class[] clsArr2 = new Class[1];
        this.reflectionProvider.visitSerializableFields(obj, new ReflectionProvider.Visitor() { // from class: com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter.1
            @Override // com.thoughtworks.xstream.converters.reflection.ReflectionProvider.Visitor
            public void visit(String str, Class cls2, Class cls3, Object obj2) {
                if (ToAttributedValueConverter.this.mapper.shouldSerializeMember(cls3, str)) {
                    FastField fastField = new FastField(cls3, str);
                    String strSerializedMember = ToAttributedValueConverter.this.mapper.serializedMember(cls3, str);
                    if (map.containsKey(strSerializedMember)) {
                        if (!ToAttributedValueConverter.this.fieldIsEqual(fastField)) {
                            ConversionException conversionException = new ConversionException("Cannot write attribute twice for object");
                            conversionException.add("alias", strSerializedMember);
                            conversionException.add("type", cls.getName());
                            throw conversionException;
                        }
                    } else {
                        map.put(strSerializedMember, ToAttributedValueConverter.this.reflectionProvider.getField(cls, str));
                    }
                    ConverterMatcher converterFromItemType = UseAttributeForEnumMapper.isEnum(cls2) ? ToAttributedValueConverter.this.enumMapper.getConverterFromItemType(null, cls2, null) : ToAttributedValueConverter.this.mapper.getLocalConverter(cls3, str);
                    if (converterFromItemType == null) {
                        converterFromItemType = ToAttributedValueConverter.this.lookup.lookupConverterForType(cls2);
                    }
                    if (obj2 != null) {
                        boolean z = ToAttributedValueConverter.this.valueField != null && ToAttributedValueConverter.this.fieldIsEqual(fastField);
                        if (z) {
                            clsArr2[0] = cls3;
                            clsArr[0] = cls2;
                            objArr[0] = obj2;
                            strArr[0] = "";
                        }
                        if (!(converterFromItemType instanceof SingleValueConverter)) {
                            if (z) {
                                return;
                            }
                            ConversionException conversionException2 = new ConversionException("Cannot write element as attribute");
                            conversionException2.add("alias", strSerializedMember);
                            conversionException2.add("type", cls.getName());
                            throw conversionException2;
                        }
                        String string = ((SingleValueConverter) converterFromItemType).toString(obj2);
                        if (z) {
                            strArr[0] = string;
                        } else if (string != null) {
                            hierarchicalStreamWriter.addAttribute(strSerializedMember, string);
                        }
                    }
                }
            }
        });
        if (strArr[0] != null) {
            Class<?> cls2 = objArr[0].getClass();
            Class clsDefaultImplementationOf = this.mapper.defaultImplementationOf(clsArr[0]);
            if (!cls2.equals(clsDefaultImplementationOf)) {
                String strSerializedClass = this.mapper.serializedClass(cls2);
                if (!strSerializedClass.equals(this.mapper.serializedClass(clsDefaultImplementationOf)) && (strAliasForSystemAttribute = this.mapper.aliasForSystemAttribute("class")) != null) {
                    hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute, strSerializedClass);
                }
            }
            String str = strArr[0];
            if (str == "") {
                marshallingContext.convertAnother(objArr[0]);
            } else {
                hierarchicalStreamWriter.setValue(str);
            }
        }
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        Class clsDefaultImplementationOf;
        Class<?> cls;
        Iterator it;
        HashSet hashSet;
        ConverterMatcher localConverter;
        Object objNewInstance = this.reflectionProvider.newInstance(unmarshallingContext.getRequiredType());
        Class<?> cls2 = objNewInstance.getClass();
        HashSet hashSet2 = new HashSet();
        Iterator attributeNames = hierarchicalStreamReader.getAttributeNames();
        HashSet hashSet3 = new HashSet();
        hashSet3.add(this.mapper.aliasForSystemAttribute("class"));
        while (attributeNames.hasNext()) {
            String str = (String) attributeNames.next();
            if (!hashSet3.contains(str)) {
                String strRealMember = this.mapper.realMember(cls2, str);
                Field fieldOrNull = this.reflectionProvider.getFieldOrNull(cls2, strRealMember);
                if (fieldOrNull == null) {
                    cls = cls2;
                    it = attributeNames;
                    hashSet = hashSet3;
                } else if (Modifier.isTransient(fieldOrNull.getModifiers())) {
                    continue;
                } else {
                    it = attributeNames;
                    Class<?> type = fieldOrNull.getType();
                    Class<?> declaringClass = fieldOrNull.getDeclaringClass();
                    if (UseAttributeForEnumMapper.isEnum(type)) {
                        hashSet = hashSet3;
                        cls = cls2;
                        localConverter = this.enumMapper.getConverterFromItemType(null, type, null);
                    } else {
                        cls = cls2;
                        hashSet = hashSet3;
                        localConverter = this.mapper.getLocalConverter(declaringClass, strRealMember);
                    }
                    if (localConverter == null) {
                        localConverter = this.lookup.lookupConverterForType(type);
                    }
                    if (!(localConverter instanceof SingleValueConverter)) {
                        ConversionException conversionException = new ConversionException("Cannot read field as a single value for object");
                        conversionException.add(SerializableConverter.ELEMENT_FIELD, strRealMember);
                        conversionException.add("type", cls.getName());
                        throw conversionException;
                    }
                    if (localConverter != null) {
                        Object objFromString = ((SingleValueConverter) localConverter).fromString(hierarchicalStreamReader.getAttribute(str));
                        if (type.isPrimitive()) {
                            type = Primitives.box(type);
                        }
                        if (objFromString != null && !type.isAssignableFrom(objFromString.getClass())) {
                            ConversionException conversionException2 = new ConversionException("Cannot assign object to type");
                            conversionException2.add("object type", objFromString.getClass().getName());
                            conversionException2.add("target type", type.getName());
                            throw conversionException2;
                        }
                        this.reflectionProvider.writeField(objNewInstance, strRealMember, objFromString, declaringClass);
                        if (!hashSet2.add(new FastField(declaringClass, strRealMember))) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append(strRealMember);
                            stringBuffer.append(" [");
                            stringBuffer.append(declaringClass.getName());
                            stringBuffer.append("]");
                            throw new AbstractReflectionConverter.DuplicateFieldException(stringBuffer.toString());
                        }
                    }
                }
                attributeNames = it;
                hashSet3 = hashSet;
                cls2 = cls;
            }
        }
        Field field = this.valueField;
        if (field != null) {
            Class<?> declaringClass2 = field.getDeclaringClass();
            String name = this.valueField.getName();
            Field field2 = name == null ? null : this.reflectionProvider.getField(declaringClass2, name);
            if (name == null || field2 == null) {
                ConversionException conversionException3 = new ConversionException("Cannot assign value to field of type");
                conversionException3.add("element", hierarchicalStreamReader.getNodeName());
                conversionException3.add(SerializableConverter.ELEMENT_FIELD, name);
                conversionException3.add("target type", unmarshallingContext.getRequiredType().getName());
                throw conversionException3;
            }
            String classAttribute = HierarchicalStreams.readClassAttribute(hierarchicalStreamReader, this.mapper);
            if (classAttribute != null) {
                clsDefaultImplementationOf = this.mapper.realClass(classAttribute);
            } else {
                clsDefaultImplementationOf = this.mapper.defaultImplementationOf(this.reflectionProvider.getFieldType(objNewInstance, name, declaringClass2));
            }
            Object objConvertAnother = unmarshallingContext.convertAnother(objNewInstance, clsDefaultImplementationOf, this.mapper.getLocalConverter(field2.getDeclaringClass(), field2.getName()));
            Class fieldType = this.reflectionProvider.getFieldType(objNewInstance, name, declaringClass2);
            if (!fieldType.isPrimitive()) {
                clsDefaultImplementationOf = fieldType;
            }
            if (objConvertAnother != null && !clsDefaultImplementationOf.isAssignableFrom(objConvertAnother.getClass())) {
                ConversionException conversionException4 = new ConversionException("Cannot assign object to type");
                conversionException4.add("object type", objConvertAnother.getClass().getName());
                conversionException4.add("target type", clsDefaultImplementationOf.getName());
                throw conversionException4;
            }
            this.reflectionProvider.writeField(objNewInstance, name, objConvertAnother, declaringClass2);
            if (!hashSet2.add(new FastField(declaringClass2, name))) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(name);
                stringBuffer2.append(" [");
                stringBuffer2.append(declaringClass2.getName());
                stringBuffer2.append("]");
                throw new AbstractReflectionConverter.DuplicateFieldException(stringBuffer2.toString());
            }
        }
        return objNewInstance;
    }

    public final boolean fieldIsEqual(FastField fastField) {
        return this.valueField.getName().equals(fastField.getName()) && this.valueField.getDeclaringClass().getName().equals(fastField.getDeclaringClass());
    }
}
