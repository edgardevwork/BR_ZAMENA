package com.thoughtworks.xstream.converters.javabean;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.javabean.JavaBeanProvider;
import com.thoughtworks.xstream.converters.reflection.MissingFieldException;
import com.thoughtworks.xstream.core.util.FastField;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.util.HashSet;

/* loaded from: classes6.dex */
public class JavaBeanConverter implements Converter {
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper$Null;
    public final JavaBeanProvider beanProvider;
    public String classAttributeIdentifier;
    public final Mapper mapper;
    public final Class type;

    public JavaBeanConverter(Mapper mapper) {
        this(mapper, (Class) null);
    }

    public JavaBeanConverter(Mapper mapper, Class cls) {
        this(mapper, new BeanProvider(), cls);
    }

    public JavaBeanConverter(Mapper mapper, JavaBeanProvider javaBeanProvider) {
        this(mapper, javaBeanProvider, null);
    }

    public JavaBeanConverter(Mapper mapper, JavaBeanProvider javaBeanProvider, Class cls) {
        this.mapper = mapper;
        this.beanProvider = javaBeanProvider;
        this.type = cls;
    }

    public JavaBeanConverter(Mapper mapper, String str) {
        this(mapper, new BeanProvider());
        this.classAttributeIdentifier = str;
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        Class cls2 = this.type;
        return (cls2 == null || cls2 == cls) && this.beanProvider.canInstantiate(cls);
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(final Object obj, final HierarchicalStreamWriter hierarchicalStreamWriter, final MarshallingContext marshallingContext) {
        final String strAliasForSystemAttribute = this.mapper.aliasForSystemAttribute("class");
        this.beanProvider.visitSerializableProperties(obj, new JavaBeanProvider.Visitor() { // from class: com.thoughtworks.xstream.converters.javabean.JavaBeanConverter.1
            @Override // com.thoughtworks.xstream.converters.javabean.JavaBeanProvider.Visitor
            public boolean shouldVisit(String str, Class cls) {
                return JavaBeanConverter.this.mapper.shouldSerializeMember(cls, str);
            }

            @Override // com.thoughtworks.xstream.converters.javabean.JavaBeanProvider.Visitor
            public void visit(String str, Class cls, Class cls2, Object obj2) throws Throwable {
                if (obj2 != null) {
                    writeField(str, cls, obj2);
                } else {
                    writeNullField(str);
                }
            }

            public final void writeField(String str, Class cls, Object obj2) {
                String str2;
                Class<?> cls2 = obj2.getClass();
                Class clsDefaultImplementationOf = JavaBeanConverter.this.mapper.defaultImplementationOf(cls);
                ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, JavaBeanConverter.this.mapper.serializedMember(obj.getClass(), str), cls2);
                if (!cls2.equals(clsDefaultImplementationOf) && (str2 = strAliasForSystemAttribute) != null) {
                    hierarchicalStreamWriter.addAttribute(str2, JavaBeanConverter.this.mapper.serializedClass(cls2));
                }
                marshallingContext.convertAnother(obj2);
                hierarchicalStreamWriter.endNode();
            }

            public final void writeNullField(String str) throws Throwable {
                String strSerializedMember = JavaBeanConverter.this.mapper.serializedMember(obj.getClass(), str);
                HierarchicalStreamWriter hierarchicalStreamWriter2 = hierarchicalStreamWriter;
                Class clsClass$ = JavaBeanConverter.class$com$thoughtworks$xstream$mapper$Mapper$Null;
                if (clsClass$ == null) {
                    clsClass$ = JavaBeanConverter.class$("com.thoughtworks.xstream.mapper.Mapper$Null");
                    JavaBeanConverter.class$com$thoughtworks$xstream$mapper$Mapper$Null = clsClass$;
                }
                ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter2, strSerializedMember, clsClass$);
                HierarchicalStreamWriter hierarchicalStreamWriter3 = hierarchicalStreamWriter;
                String str2 = strAliasForSystemAttribute;
                Mapper mapper = JavaBeanConverter.this.mapper;
                Class clsClass$2 = JavaBeanConverter.class$com$thoughtworks$xstream$mapper$Mapper$Null;
                if (clsClass$2 == null) {
                    clsClass$2 = JavaBeanConverter.class$("com.thoughtworks.xstream.mapper.Mapper$Null");
                    JavaBeanConverter.class$com$thoughtworks$xstream$mapper$Mapper$Null = clsClass$2;
                }
                hierarchicalStreamWriter3.addAttribute(str2, mapper.serializedClass(clsClass$2));
                hierarchicalStreamWriter.endNode();
            }
        });
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        Object objInstantiateNewInstance = instantiateNewInstance(unmarshallingContext);
        HashSet hashSet = new HashSet() { // from class: com.thoughtworks.xstream.converters.javabean.JavaBeanConverter.2
            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean add(Object obj) {
                if (super.add(obj)) {
                    return true;
                }
                throw new DuplicatePropertyException(((FastField) obj).getName());
            }
        };
        Class<?> cls = objInstantiateNewInstance.getClass();
        while (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            String strRealMember = this.mapper.realMember(cls, hierarchicalStreamReader.getNodeName());
            if (this.mapper.shouldSerializeMember(cls, strRealMember)) {
                if (this.beanProvider.propertyDefinedInClass(strRealMember, cls)) {
                    this.beanProvider.writeProperty(objInstantiateNewInstance, strRealMember, unmarshallingContext.convertAnother(objInstantiateNewInstance, determineType(hierarchicalStreamReader, objInstantiateNewInstance, strRealMember)));
                    hashSet.add(new FastField(cls, strRealMember));
                } else if (!this.mapper.isIgnoredElement(strRealMember)) {
                    throw new MissingFieldException(cls.getName(), strRealMember);
                }
            }
            hierarchicalStreamReader.moveUp();
        }
        return objInstantiateNewInstance;
    }

    public final Object instantiateNewInstance(UnmarshallingContext unmarshallingContext) {
        Object objCurrentObject = unmarshallingContext.currentObject();
        return objCurrentObject == null ? this.beanProvider.newInstance(unmarshallingContext.getRequiredType()) : objCurrentObject;
    }

    public final Class determineType(HierarchicalStreamReader hierarchicalStreamReader, Object obj, String str) {
        String strAliasForSystemAttribute = this.classAttributeIdentifier;
        if (strAliasForSystemAttribute == null) {
            strAliasForSystemAttribute = this.mapper.aliasForSystemAttribute("class");
        }
        String attribute = strAliasForSystemAttribute == null ? null : hierarchicalStreamReader.getAttribute(strAliasForSystemAttribute);
        if (attribute != null) {
            return this.mapper.realClass(attribute);
        }
        return this.mapper.defaultImplementationOf(this.beanProvider.getPropertyType(obj, str));
    }

    /* loaded from: classes7.dex */
    public static class DuplicateFieldException extends ConversionException {
        public DuplicateFieldException(String str) {
            super(str);
        }
    }

    /* loaded from: classes7.dex */
    public static class DuplicatePropertyException extends ConversionException {
        public DuplicatePropertyException(String str) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Duplicate property ");
            stringBuffer.append(str);
            super(stringBuffer.toString());
            add("property", str);
        }
    }
}
