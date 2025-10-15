package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.core.ClassLoaderReference;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.core.util.CustomObjectInputStream;
import com.thoughtworks.xstream.core.util.CustomObjectOutputStream;
import com.thoughtworks.xstream.core.util.Fields;
import com.thoughtworks.xstream.core.util.HierarchicalStreams;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.p042io.StreamException;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputValidation;
import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class SerializableConverter extends AbstractReflectionConverter {
    public static final String ATTRIBUTE_CLASS = "class";
    public static final String ATTRIBUTE_NAME = "name";
    public static final String ATTRIBUTE_SERIALIZATION = "serialization";
    public static final String ATTRIBUTE_VALUE_CUSTOM = "custom";
    public static final String ELEMENT_DEFAULT = "default";
    public static final String ELEMENT_FIELD = "field";
    public static final String ELEMENT_FIELDS = "fields";
    public static final String ELEMENT_NULL = "null";
    public static final String ELEMENT_UNSERIALIZABLE_PARENTS = "unserializable-parents";
    public static /* synthetic */ Class class$java$io$Serializable;
    public static /* synthetic */ Class class$java$lang$Object;
    public final ClassLoaderReference classLoaderReference;

    public SerializableConverter(Mapper mapper, ReflectionProvider reflectionProvider, ClassLoaderReference classLoaderReference) {
        super(mapper, new UnserializableParentsReflectionProvider(reflectionProvider));
        this.classLoaderReference = classLoaderReference;
    }

    public SerializableConverter(Mapper mapper, ReflectionProvider reflectionProvider, ClassLoader classLoader) {
        this(mapper, reflectionProvider, new ClassLoaderReference(classLoader));
    }

    public SerializableConverter(Mapper mapper, ReflectionProvider reflectionProvider) {
        this(mapper, new UnserializableParentsReflectionProvider(reflectionProvider), new ClassLoaderReference(null));
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return JVM.canCreateDerivedObjectOutputStream() && isSerializable(cls);
    }

    public final boolean isSerializable(Class cls) throws Throwable {
        if (cls == null) {
            return false;
        }
        Class clsClass$ = class$java$io$Serializable;
        if (clsClass$ == null) {
            clsClass$ = class$("java.io.Serializable");
            class$java$io$Serializable = clsClass$;
        }
        if (!clsClass$.isAssignableFrom(cls) || cls.isInterface()) {
            return false;
        }
        if (!this.serializationMembers.supportsReadObject(cls, true) && !this.serializationMembers.supportsWriteObject(cls, true)) {
            return false;
        }
        Iterator it = hierarchyFor(cls).iterator();
        while (it.hasNext()) {
            Class clsClass$2 = class$java$io$Serializable;
            if (clsClass$2 == null) {
                clsClass$2 = class$("java.io.Serializable");
                class$java$io$Serializable = clsClass$2;
            }
            if (!clsClass$2.isAssignableFrom((Class) it.next())) {
                return canAccess(cls);
            }
        }
        return true;
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter
    public void doMarshal(final Object obj, final HierarchicalStreamWriter hierarchicalStreamWriter, final MarshallingContext marshallingContext) throws Throwable {
        String strAliasForSystemAttribute;
        String strAliasForSystemAttribute2;
        String strAliasForSystemAttribute3 = this.mapper.aliasForSystemAttribute(ATTRIBUTE_SERIALIZATION);
        if (strAliasForSystemAttribute3 != null) {
            hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute3, "custom");
        }
        final Class[] clsArr = new Class[1];
        final boolean[] zArr = {false};
        CustomObjectOutputStream.StreamCallback streamCallback = new CustomObjectOutputStream.StreamCallback() { // from class: com.thoughtworks.xstream.converters.reflection.SerializableConverter.1
            @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
            public void writeToStream(Object obj2) {
                if (obj2 == null) {
                    hierarchicalStreamWriter.startNode("null");
                    hierarchicalStreamWriter.endNode();
                } else {
                    ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, SerializableConverter.this.mapper.serializedClass(obj2.getClass()), obj2.getClass());
                    marshallingContext.convertAnother(obj2);
                    hierarchicalStreamWriter.endNode();
                }
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
            public void writeFieldsToStream(Map map) {
                String strAliasForSystemAttribute4;
                ObjectStreamClass objectStreamClassLookup = ObjectStreamClass.lookup(clsArr[0]);
                hierarchicalStreamWriter.startNode("default");
                for (String str : map.keySet()) {
                    if (SerializableConverter.this.mapper.shouldSerializeMember(clsArr[0], str)) {
                        ObjectStreamField field = objectStreamClassLookup.getField(str);
                        Object obj2 = map.get(str);
                        if (field == null) {
                            throw new MissingFieldException(obj2.getClass().getName(), str);
                        }
                        if (obj2 != null) {
                            ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, SerializableConverter.this.mapper.serializedMember(obj.getClass(), str), obj2.getClass());
                            if (field.getType() != obj2.getClass() && !field.getType().isPrimitive() && (strAliasForSystemAttribute4 = SerializableConverter.this.mapper.aliasForSystemAttribute("class")) != null) {
                                hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute4, SerializableConverter.this.mapper.serializedClass(obj2.getClass()));
                            }
                            marshallingContext.convertAnother(obj2);
                            hierarchicalStreamWriter.endNode();
                        }
                    }
                }
                hierarchicalStreamWriter.endNode();
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
            public void defaultWriteObject() {
                String strAliasForSystemAttribute4;
                ObjectStreamClass objectStreamClassLookup = ObjectStreamClass.lookup(clsArr[0]);
                if (objectStreamClassLookup == null) {
                    return;
                }
                boolean z = false;
                for (ObjectStreamField objectStreamField : objectStreamClassLookup.getFields()) {
                    Object field = SerializableConverter.this.readField(objectStreamField, clsArr[0], obj);
                    if (field != null) {
                        if (!zArr[0]) {
                            hierarchicalStreamWriter.startNode(SerializableConverter.this.mapper.serializedClass(clsArr[0]));
                            zArr[0] = true;
                        }
                        if (!z) {
                            hierarchicalStreamWriter.startNode("default");
                            z = true;
                        }
                        if (SerializableConverter.this.mapper.shouldSerializeMember(clsArr[0], objectStreamField.getName())) {
                            Class<?> cls = field.getClass();
                            ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, SerializableConverter.this.mapper.serializedMember(obj.getClass(), objectStreamField.getName()), cls);
                            if (!cls.equals(SerializableConverter.this.mapper.defaultImplementationOf(objectStreamField.getType())) && (strAliasForSystemAttribute4 = SerializableConverter.this.mapper.aliasForSystemAttribute("class")) != null) {
                                hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute4, SerializableConverter.this.mapper.serializedClass(cls));
                            }
                            marshallingContext.convertAnother(field);
                            hierarchicalStreamWriter.endNode();
                        }
                    }
                }
                if (zArr[0] && !z) {
                    hierarchicalStreamWriter.startNode("default");
                    hierarchicalStreamWriter.endNode();
                } else if (z) {
                    hierarchicalStreamWriter.endNode();
                }
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
            public void flush() {
                hierarchicalStreamWriter.flush();
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
            public void close() {
                throw new UnsupportedOperationException("Objects are not allowed to call ObjectOutputStream.close() from writeObject()");
            }
        };
        try {
            Iterator it = hierarchyFor(obj.getClass()).iterator();
            boolean z = false;
            while (it.hasNext()) {
                clsArr[0] = (Class) it.next();
                Class clsClass$ = class$java$io$Serializable;
                if (clsClass$ == null) {
                    clsClass$ = class$("java.io.Serializable");
                    class$java$io$Serializable = clsClass$;
                }
                if (clsClass$.isAssignableFrom(clsArr[0])) {
                    if (z) {
                        marshalUnserializableParent(hierarchicalStreamWriter, marshallingContext, obj);
                        z = false;
                    }
                    if (this.serializationMembers.supportsWriteObject(clsArr[0], false)) {
                        zArr[0] = true;
                        hierarchicalStreamWriter.startNode(this.mapper.serializedClass(clsArr[0]));
                        Class cls = clsArr[0];
                        if (cls != this.mapper.defaultImplementationOf(cls) && (strAliasForSystemAttribute = this.mapper.aliasForSystemAttribute("class")) != null) {
                            hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute, clsArr[0].getName());
                        }
                        CustomObjectOutputStream customObjectOutputStream = CustomObjectOutputStream.getInstance(marshallingContext, streamCallback);
                        this.serializationMembers.callWriteObject(clsArr[0], obj, customObjectOutputStream);
                        customObjectOutputStream.popCallback();
                        hierarchicalStreamWriter.endNode();
                    } else if (this.serializationMembers.supportsReadObject(clsArr[0], false)) {
                        zArr[0] = true;
                        hierarchicalStreamWriter.startNode(this.mapper.serializedClass(clsArr[0]));
                        Class cls2 = clsArr[0];
                        if (cls2 != this.mapper.defaultImplementationOf(cls2) && (strAliasForSystemAttribute2 = this.mapper.aliasForSystemAttribute("class")) != null) {
                            hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute2, clsArr[0].getName());
                        }
                        streamCallback.defaultWriteObject();
                        hierarchicalStreamWriter.endNode();
                    } else {
                        zArr[0] = false;
                        streamCallback.defaultWriteObject();
                        if (zArr[0]) {
                            hierarchicalStreamWriter.endNode();
                        }
                    }
                } else {
                    z = true;
                }
            }
        } catch (IOException e) {
            throw new StreamException("Cannot write defaults", e);
        }
    }

    public void marshalUnserializableParent(HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext, Object obj) throws Throwable {
        hierarchicalStreamWriter.startNode(ELEMENT_UNSERIALIZABLE_PARENTS);
        super.doMarshal(obj, hierarchicalStreamWriter, marshallingContext);
        hierarchicalStreamWriter.endNode();
    }

    public final Object readField(ObjectStreamField objectStreamField, Class cls, Object obj) {
        return Fields.read(Fields.find(cls, objectStreamField.getName()), obj);
    }

    public List hierarchyFor(Class cls) throws Throwable {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Class clsClass$ = class$java$lang$Object;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.Object");
                class$java$lang$Object = clsClass$;
            }
            if (cls == clsClass$ || cls == null) {
                break;
            }
            arrayList.add(cls);
            cls = cls.getSuperclass();
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    @Override // com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter
    public Object doUnmarshal(final Object obj, final HierarchicalStreamReader hierarchicalStreamReader, final UnmarshallingContext unmarshallingContext) throws Throwable {
        final Class[] clsArr = new Class[1];
        String strAliasForSystemAttribute = this.mapper.aliasForSystemAttribute(ATTRIBUTE_SERIALIZATION);
        if (strAliasForSystemAttribute != null && !"custom".equals(hierarchicalStreamReader.getAttribute(strAliasForSystemAttribute))) {
            throw new ConversionException("Cannot deserialize object with new readObject()/writeObject() methods");
        }
        CustomObjectInputStream.StreamCallback streamCallback = new CustomObjectInputStream.StreamCallback() { // from class: com.thoughtworks.xstream.converters.reflection.SerializableConverter.2
            @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
            public Object readFromStream() {
                hierarchicalStreamReader.moveDown();
                Object objConvertAnother = unmarshallingContext.convertAnother(obj, HierarchicalStreams.readClassType(hierarchicalStreamReader, SerializableConverter.this.mapper));
                hierarchicalStreamReader.moveUp();
                return objConvertAnother;
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
            public Map readFieldsFromStream() {
                Class type;
                HashMap map = new HashMap();
                hierarchicalStreamReader.moveDown();
                if (hierarchicalStreamReader.getNodeName().equals(SerializableConverter.ELEMENT_FIELDS)) {
                    while (hierarchicalStreamReader.hasMoreChildren()) {
                        hierarchicalStreamReader.moveDown();
                        if (!hierarchicalStreamReader.getNodeName().equals(SerializableConverter.ELEMENT_FIELD)) {
                            throw new ConversionException("Expected <field/> element inside <field/>");
                        }
                        map.put(hierarchicalStreamReader.getAttribute("name"), unmarshallingContext.convertAnother(obj, SerializableConverter.this.mapper.realClass(hierarchicalStreamReader.getAttribute("class"))));
                        hierarchicalStreamReader.moveUp();
                    }
                } else if (hierarchicalStreamReader.getNodeName().equals("default")) {
                    ObjectStreamClass objectStreamClassLookup = ObjectStreamClass.lookup(clsArr[0]);
                    while (hierarchicalStreamReader.hasMoreChildren()) {
                        hierarchicalStreamReader.moveDown();
                        String strRealMember = SerializableConverter.this.mapper.realMember(clsArr[0], hierarchicalStreamReader.getNodeName());
                        if (SerializableConverter.this.mapper.shouldSerializeMember(clsArr[0], strRealMember)) {
                            String classAttribute = HierarchicalStreams.readClassAttribute(hierarchicalStreamReader, SerializableConverter.this.mapper);
                            if (classAttribute != null) {
                                type = SerializableConverter.this.mapper.realClass(classAttribute);
                            } else {
                                ObjectStreamField field = objectStreamClassLookup.getField(strRealMember);
                                if (field == null) {
                                    throw new MissingFieldException(clsArr[0].getName(), strRealMember);
                                }
                                type = field.getType();
                            }
                            map.put(strRealMember, unmarshallingContext.convertAnother(obj, type));
                        }
                        hierarchicalStreamReader.moveUp();
                    }
                } else {
                    throw new ConversionException("Expected <fields/> or <default/> element when calling ObjectInputStream.readFields()");
                }
                hierarchicalStreamReader.moveUp();
                return map;
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
            public void defaultReadObject() {
                Class clsDefaultImplementationOf;
                if (SerializableConverter.this.serializationMembers.getSerializablePersistentFields(clsArr[0]) != null) {
                    readFieldsFromStream();
                    return;
                }
                if (hierarchicalStreamReader.hasMoreChildren()) {
                    hierarchicalStreamReader.moveDown();
                    if (!hierarchicalStreamReader.getNodeName().equals("default")) {
                        throw new ConversionException("Expected <default/> element in readObject() stream");
                    }
                    while (hierarchicalStreamReader.hasMoreChildren()) {
                        hierarchicalStreamReader.moveDown();
                        String strRealMember = SerializableConverter.this.mapper.realMember(clsArr[0], hierarchicalStreamReader.getNodeName());
                        if (SerializableConverter.this.mapper.shouldSerializeMember(clsArr[0], strRealMember)) {
                            String classAttribute = HierarchicalStreams.readClassAttribute(hierarchicalStreamReader, SerializableConverter.this.mapper);
                            if (classAttribute != null) {
                                clsDefaultImplementationOf = SerializableConverter.this.mapper.realClass(classAttribute);
                            } else {
                                SerializableConverter serializableConverter = SerializableConverter.this;
                                clsDefaultImplementationOf = serializableConverter.mapper.defaultImplementationOf(serializableConverter.reflectionProvider.getFieldType(obj, strRealMember, clsArr[0]));
                            }
                            SerializableConverter.this.reflectionProvider.writeField(obj, strRealMember, unmarshallingContext.convertAnother(obj, clsDefaultImplementationOf), clsArr[0]);
                        }
                        hierarchicalStreamReader.moveUp();
                    }
                    hierarchicalStreamReader.moveUp();
                }
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
            public void registerValidation(final ObjectInputValidation objectInputValidation, int i) {
                unmarshallingContext.addCompletionCallback(new Runnable() { // from class: com.thoughtworks.xstream.converters.reflection.SerializableConverter.2.1
                    @Override // java.lang.Runnable
                    public void run() throws InvalidObjectException {
                        try {
                            objectInputValidation.validateObject();
                        } catch (InvalidObjectException e) {
                            throw new ObjectAccessException("Cannot validate object", e);
                        }
                    }
                }, i);
            }

            @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
            public void close() {
                throw new UnsupportedOperationException("Objects are not allowed to call ObjectInputStream.close() from readObject()");
            }
        };
        while (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            String nodeName = hierarchicalStreamReader.getNodeName();
            if (nodeName.equals(ELEMENT_UNSERIALIZABLE_PARENTS)) {
                super.doUnmarshal(obj, hierarchicalStreamReader, unmarshallingContext);
            } else {
                String classAttribute = HierarchicalStreams.readClassAttribute(hierarchicalStreamReader, this.mapper);
                if (classAttribute == null) {
                    Mapper mapper = this.mapper;
                    clsArr[0] = mapper.defaultImplementationOf(mapper.realClass(nodeName));
                } else {
                    clsArr[0] = this.mapper.realClass(classAttribute);
                }
                if (this.serializationMembers.supportsReadObject(clsArr[0], false)) {
                    CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(unmarshallingContext, streamCallback, this.classLoaderReference);
                    this.serializationMembers.callReadObject(clsArr[0], obj, customObjectInputStream);
                    customObjectInputStream.popCallback();
                } else {
                    try {
                        streamCallback.defaultReadObject();
                    } catch (IOException e) {
                        throw new StreamException("Cannot read defaults", e);
                    }
                }
            }
            hierarchicalStreamReader.moveUp();
        }
        return obj;
    }

    public void doMarshalConditionally(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) throws Throwable {
        if (isSerializable(obj.getClass())) {
            doMarshal(obj, hierarchicalStreamWriter, marshallingContext);
        } else {
            super.doMarshal(obj, hierarchicalStreamWriter, marshallingContext);
        }
    }

    public Object doUnmarshalConditionally(Object obj, HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        return isSerializable(obj.getClass()) ? doUnmarshal(obj, hierarchicalStreamReader, unmarshallingContext) : super.doUnmarshal(obj, hierarchicalStreamReader, unmarshallingContext);
    }

    /* loaded from: classes6.dex */
    public static class UnserializableParentsReflectionProvider extends ReflectionProviderWrapper {
        public UnserializableParentsReflectionProvider(ReflectionProvider reflectionProvider) {
            super(reflectionProvider);
        }

        @Override // com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper, com.thoughtworks.xstream.converters.reflection.ReflectionProvider
        public void visitSerializableFields(Object obj, final ReflectionProvider.Visitor visitor) {
            this.wrapped.visitSerializableFields(obj, new ReflectionProvider.Visitor() { // from class: com.thoughtworks.xstream.converters.reflection.SerializableConverter.UnserializableParentsReflectionProvider.1
                @Override // com.thoughtworks.xstream.converters.reflection.ReflectionProvider.Visitor
                public void visit(String str, Class cls, Class cls2, Object obj2) throws Throwable {
                    Class clsClass$ = SerializableConverter.class$java$io$Serializable;
                    if (clsClass$ == null) {
                        clsClass$ = SerializableConverter.class$("java.io.Serializable");
                        SerializableConverter.class$java$io$Serializable = clsClass$;
                    }
                    if (clsClass$.isAssignableFrom(cls2)) {
                        return;
                    }
                    visitor.visit(str, cls, cls2, obj2);
                }
            });
        }
    }
}
