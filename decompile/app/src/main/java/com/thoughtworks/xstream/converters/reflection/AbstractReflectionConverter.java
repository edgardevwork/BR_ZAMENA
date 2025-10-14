package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.core.Caching;
import com.thoughtworks.xstream.core.ReferencingMarshallingContext;
import com.thoughtworks.xstream.core.util.ArrayIterator;
import com.thoughtworks.xstream.core.util.FastField;
import com.thoughtworks.xstream.core.util.Fields;
import com.thoughtworks.xstream.core.util.HierarchicalStreams;
import com.thoughtworks.xstream.core.util.Primitives;
import com.thoughtworks.xstream.core.util.SerializationMembers;
import com.thoughtworks.xstream.mapper.CannotResolveClassException;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class AbstractReflectionConverter implements Converter, Caching {
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper$Null;
    public static /* synthetic */ Class class$java$lang$Object;
    public static /* synthetic */ Class class$java$util$Collection;
    public static /* synthetic */ Class class$java$util$Map;
    public static /* synthetic */ Class class$java$util$Map$Entry;
    public final Mapper mapper;
    public transient ReflectionProvider pureJavaReflectionProvider;
    public final ReflectionProvider reflectionProvider;
    public transient SerializationMembers serializationMembers;
    public transient SerializationMethodInvoker serializationMethodInvoker;

    /* loaded from: classes5.dex */
    public interface FieldMarshaller {
        void writeField(String str, String str2, Class cls, Class cls2, Object obj);

        void writeItem(Object obj);
    }

    public boolean shouldUnmarshalTransientFields() {
        return false;
    }

    public AbstractReflectionConverter(Mapper mapper, ReflectionProvider reflectionProvider) {
        this.mapper = mapper;
        this.reflectionProvider = reflectionProvider;
        SerializationMethodInvoker serializationMethodInvoker = new SerializationMethodInvoker();
        this.serializationMethodInvoker = serializationMethodInvoker;
        this.serializationMembers = serializationMethodInvoker.serializationMembers;
    }

    public boolean canAccess(Class cls) {
        try {
            this.reflectionProvider.getFieldOrNull(cls, "%");
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) throws Throwable {
        Object objCallWriteReplace = this.serializationMembers.callWriteReplace(obj);
        if (objCallWriteReplace != obj && (marshallingContext instanceof ReferencingMarshallingContext)) {
            ((ReferencingMarshallingContext) marshallingContext).replace(obj, objCallWriteReplace);
        }
        if (objCallWriteReplace.getClass() != obj.getClass()) {
            String strAliasForSystemAttribute = this.mapper.aliasForSystemAttribute("resolves-to");
            if (strAliasForSystemAttribute != null) {
                hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute, this.mapper.serializedClass(objCallWriteReplace.getClass()));
            }
            marshallingContext.convertAnother(objCallWriteReplace);
            return;
        }
        doMarshal(objCallWriteReplace, hierarchicalStreamWriter, marshallingContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x017f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void doMarshal(final Object obj, final HierarchicalStreamWriter hierarchicalStreamWriter, final MarshallingContext marshallingContext) throws Throwable {
        Mapper.ImplicitCollectionMapping implicitCollectionMapping;
        Iterator it;
        Class<?> clsClass$;
        String strSerializedClass;
        String strSerializedClass2;
        Object obj2;
        final ArrayList<FieldInfo> arrayList = new ArrayList();
        final HashMap map = new HashMap();
        final Class<?> cls = obj.getClass();
        this.reflectionProvider.visitSerializableFields(obj, new ReflectionProvider.Visitor() { // from class: com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.1
            public final Set writtenAttributes = new HashSet();

            @Override // com.thoughtworks.xstream.converters.reflection.ReflectionProvider.Visitor
            public void visit(String str, Class cls2, Class cls3, Object obj3) {
                if (AbstractReflectionConverter.this.mapper.shouldSerializeMember(cls3, str)) {
                    if (!map.containsKey(str)) {
                        Class cls4 = obj.getClass();
                        if (cls3 != cls && !AbstractReflectionConverter.this.mapper.shouldSerializeMember(cls4, str)) {
                            cls4 = cls3;
                        }
                        map.put(str, AbstractReflectionConverter.this.reflectionProvider.getField(cls4, str));
                    }
                    SingleValueConverter converterFromItemType = AbstractReflectionConverter.this.mapper.getConverterFromItemType(str, cls2, cls3);
                    if (converterFromItemType != null) {
                        Mapper mapper = AbstractReflectionConverter.this.mapper;
                        String strAliasForAttribute = mapper.aliasForAttribute(mapper.serializedMember(cls3, str));
                        if (obj3 != null) {
                            if (this.writtenAttributes.contains(str)) {
                                ConversionException conversionException = new ConversionException("Cannot write field as attribute for object, attribute name already in use");
                                conversionException.add("field-name", str);
                                conversionException.add("object-type", cls.getName());
                                throw conversionException;
                            }
                            String string = converterFromItemType.toString(obj3);
                            if (string != null) {
                                hierarchicalStreamWriter.addAttribute(strAliasForAttribute, string);
                            }
                        }
                        this.writtenAttributes.add(str);
                        return;
                    }
                    arrayList.add(new FieldInfo(str, cls2, cls3, obj3));
                }
            }
        });
        FieldMarshaller fieldMarshaller = new FieldMarshaller() { // from class: com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.2
            @Override // com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.FieldMarshaller
            public void writeField(String str, String str2, Class cls2, Class cls3, Object obj3) {
                String strAliasForSystemAttribute;
                String strAliasForSystemAttribute2;
                Class cls4 = obj3 != null ? obj3.getClass() : cls2;
                HierarchicalStreamWriter hierarchicalStreamWriter2 = hierarchicalStreamWriter;
                if (str2 == null) {
                    str2 = AbstractReflectionConverter.this.mapper.serializedMember(cls, str);
                }
                ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter2, str2, cls4);
                if (obj3 != null) {
                    Class clsDefaultImplementationOf = AbstractReflectionConverter.this.mapper.defaultImplementationOf(cls2);
                    if (!cls4.equals(clsDefaultImplementationOf)) {
                        String strSerializedClass3 = AbstractReflectionConverter.this.mapper.serializedClass(cls4);
                        if (!strSerializedClass3.equals(AbstractReflectionConverter.this.mapper.serializedClass(clsDefaultImplementationOf)) && (strAliasForSystemAttribute2 = AbstractReflectionConverter.this.mapper.aliasForSystemAttribute("class")) != null) {
                            hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute2, strSerializedClass3);
                        }
                    }
                    if (((Field) map.get(str)).getDeclaringClass() != cls3 && (strAliasForSystemAttribute = AbstractReflectionConverter.this.mapper.aliasForSystemAttribute("defined-in")) != null) {
                        hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute, AbstractReflectionConverter.this.mapper.serializedClass(cls3));
                    }
                    AbstractReflectionConverter.this.marshallField(marshallingContext, obj3, AbstractReflectionConverter.this.reflectionProvider.getField(cls3, str));
                }
                hierarchicalStreamWriter.endNode();
            }

            @Override // com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.FieldMarshaller
            public void writeItem(Object obj3) throws Throwable {
                if (obj3 == null) {
                    String strSerializedClass3 = AbstractReflectionConverter.this.mapper.serializedClass(null);
                    HierarchicalStreamWriter hierarchicalStreamWriter2 = hierarchicalStreamWriter;
                    Class clsClass$2 = AbstractReflectionConverter.class$com$thoughtworks$xstream$mapper$Mapper$Null;
                    if (clsClass$2 == null) {
                        clsClass$2 = AbstractReflectionConverter.class$("com.thoughtworks.xstream.mapper.Mapper$Null");
                        AbstractReflectionConverter.class$com$thoughtworks$xstream$mapper$Mapper$Null = clsClass$2;
                    }
                    ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter2, strSerializedClass3, clsClass$2);
                    hierarchicalStreamWriter.endNode();
                    return;
                }
                ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, AbstractReflectionConverter.this.mapper.serializedClass(obj3.getClass()), obj3.getClass());
                marshallingContext.convertAnother(obj3);
                hierarchicalStreamWriter.endNode();
            }
        };
        HashMap map2 = new HashMap();
        for (FieldInfo fieldInfo : arrayList) {
            if (fieldInfo.value != null) {
                Field field = (Field) map.get(fieldInfo.fieldName);
                Mapper mapper = this.mapper;
                Class<?> declaringClass = field.getDeclaringClass();
                Class<?> cls2 = fieldInfo.definedIn;
                if (declaringClass == cls2) {
                    cls2 = cls;
                }
                Mapper.ImplicitCollectionMapping implicitCollectionDefForFieldName = mapper.getImplicitCollectionDefForFieldName(cls2, fieldInfo.fieldName);
                if (implicitCollectionDefForFieldName == null) {
                    implicitCollectionMapping = implicitCollectionDefForFieldName;
                    if (implicitCollectionMapping != null) {
                        if ((marshallingContext instanceof ReferencingMarshallingContext) && (obj2 = fieldInfo.value) != Collections.EMPTY_LIST && obj2 != Collections.EMPTY_SET && obj2 != Collections.EMPTY_MAP) {
                            ((ReferencingMarshallingContext) marshallingContext).registerImplicit(obj2);
                        }
                        Object obj3 = fieldInfo.value;
                        boolean z = obj3 instanceof Collection;
                        boolean z2 = (obj3 instanceof Map) && implicitCollectionMapping.getKeyFieldName() == null;
                        if (fieldInfo.value.getClass().isArray()) {
                            it = new ArrayIterator(fieldInfo.value);
                        } else if (z) {
                            it = ((Collection) fieldInfo.value).iterator();
                        } else if (z2) {
                            it = ((Map) fieldInfo.value).entrySet().iterator();
                        } else {
                            it = ((Map) fieldInfo.value).values().iterator();
                        }
                        Iterator it2 = it;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (next == null) {
                                clsClass$ = class$java$lang$Object;
                                if (clsClass$ == null) {
                                    clsClass$ = class$("java.lang.Object");
                                    class$java$lang$Object = clsClass$;
                                }
                                strSerializedClass = this.mapper.serializedClass(null);
                            } else if (z2) {
                                if (implicitCollectionMapping.getItemFieldName() != null) {
                                    strSerializedClass2 = implicitCollectionMapping.getItemFieldName();
                                } else {
                                    Mapper mapper2 = this.mapper;
                                    Class clsClass$2 = class$java$util$Map$Entry;
                                    if (clsClass$2 == null) {
                                        clsClass$2 = class$("java.util.Map$Entry");
                                        class$java$util$Map$Entry = clsClass$2;
                                    }
                                    strSerializedClass2 = mapper2.serializedClass(clsClass$2);
                                }
                                Map.Entry entry = (Map.Entry) next;
                                ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, strSerializedClass2, entry.getClass());
                                fieldMarshaller.writeItem(entry.getKey());
                                fieldMarshaller.writeItem(entry.getValue());
                                hierarchicalStreamWriter.endNode();
                            } else if (implicitCollectionMapping.getItemFieldName() != null) {
                                clsClass$ = implicitCollectionMapping.getItemType();
                                strSerializedClass = implicitCollectionMapping.getItemFieldName();
                            } else {
                                clsClass$ = next.getClass();
                                strSerializedClass = this.mapper.serializedClass(clsClass$);
                            }
                            fieldMarshaller.writeField(fieldInfo.fieldName, strSerializedClass, clsClass$, fieldInfo.definedIn, next);
                        }
                    } else {
                        fieldMarshaller.writeField(fieldInfo.fieldName, null, fieldInfo.type, fieldInfo.definedIn, fieldInfo.value);
                    }
                } else {
                    Set set = (Set) map2.get(fieldInfo.fieldName);
                    if (set == null) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(implicitCollectionDefForFieldName);
                        map2.put(fieldInfo.fieldName, hashSet);
                    } else {
                        if (!set.add(implicitCollectionDefForFieldName)) {
                            implicitCollectionMapping = null;
                        }
                        if (implicitCollectionMapping != null) {
                        }
                    }
                    implicitCollectionMapping = implicitCollectionDefForFieldName;
                    if (implicitCollectionMapping != null) {
                    }
                }
            }
        }
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public void marshallField(MarshallingContext marshallingContext, Object obj, Field field) {
        marshallingContext.convertAnother(obj, this.mapper.getLocalConverter(field.getDeclaringClass(), field.getName()));
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) throws Throwable {
        return this.serializationMembers.callReadResolve(doUnmarshal(instantiateNewInstance(hierarchicalStreamReader, unmarshallingContext), hierarchicalStreamReader, unmarshallingContext));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doUnmarshal(Object obj, HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) throws Throwable {
        String fieldName;
        Class itemTypeForItemFieldName;
        Object objConvertAnother;
        Field fieldOrNull;
        Class<?> clsClass$;
        Class clsDefaultImplementationOf;
        Class cls = obj.getClass();
        HashSet hashSet = new HashSet() { // from class: com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.3
            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean add(Object obj2) {
                if (super.add(obj2)) {
                    return true;
                }
                throw new DuplicateFieldException(((FastField) obj2).getName());
            }
        };
        Iterator attributeNames = hierarchicalStreamReader.getAttributeNames();
        while (attributeNames.hasNext()) {
            String str = (String) attributeNames.next();
            Mapper mapper = this.mapper;
            String strRealMember = mapper.realMember(cls, mapper.attributeForAlias(str));
            Field fieldOrNull2 = this.reflectionProvider.getFieldOrNull(cls, strRealMember);
            if (fieldOrNull2 != null && shouldUnmarshalField(fieldOrNull2)) {
                Class<?> declaringClass = fieldOrNull2.getDeclaringClass();
                if (this.mapper.shouldSerializeMember(declaringClass, strRealMember)) {
                    SingleValueConverter converterFromAttribute = this.mapper.getConverterFromAttribute(declaringClass, strRealMember, fieldOrNull2.getType());
                    Class<?> type = fieldOrNull2.getType();
                    if (converterFromAttribute != null) {
                        Object objFromString = converterFromAttribute.fromString(hierarchicalStreamReader.getAttribute(str));
                        if (type.isPrimitive()) {
                            type = Primitives.box(type);
                        }
                        if (objFromString != null && !type.isAssignableFrom(objFromString.getClass())) {
                            ConversionException conversionException = new ConversionException("Cannot convert type");
                            conversionException.add("source-type", objFromString.getClass().getName());
                            conversionException.add("target-type", type.getName());
                            throw conversionException;
                        }
                        hashSet.add(new FastField(declaringClass, strRealMember));
                        this.reflectionProvider.writeField(obj, strRealMember, objFromString, declaringClass);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        HashMap map = null;
        while (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            String nodeName = hierarchicalStreamReader.getNodeName();
            Class declaringClass2 = readDeclaringClass(hierarchicalStreamReader);
            Class cls2 = declaringClass2 == null ? cls : declaringClass2;
            String strRealMember2 = this.mapper.realMember(cls2, nodeName);
            Mapper.ImplicitCollectionMapping implicitCollectionDefForFieldName = this.mapper.getImplicitCollectionDefForFieldName(cls2, strRealMember2);
            if (implicitCollectionDefForFieldName == null) {
                fieldOrNull = this.reflectionProvider.getFieldOrNull(cls2, strRealMember2);
                if (fieldOrNull == null) {
                    itemTypeForItemFieldName = this.mapper.getItemTypeForItemFieldName(cls2, strRealMember2);
                    if (itemTypeForItemFieldName != null) {
                        String classAttribute = HierarchicalStreams.readClassAttribute(hierarchicalStreamReader, this.mapper);
                        if (classAttribute != null) {
                            itemTypeForItemFieldName = this.mapper.realClass(classAttribute);
                        }
                        fieldName = null;
                    } else {
                        try {
                            itemTypeForItemFieldName = this.mapper.realClass(nodeName);
                        } catch (CannotResolveClassException unused) {
                            itemTypeForItemFieldName = null;
                        }
                        try {
                            fieldName = this.mapper.getFieldNameForItemTypeAndName(cls2, itemTypeForItemFieldName, nodeName);
                        } catch (CannotResolveClassException unused2) {
                            fieldName = null;
                            if (itemTypeForItemFieldName != null) {
                                handleUnknownField(declaringClass2, strRealMember2, cls2, nodeName);
                                itemTypeForItemFieldName = null;
                                if (itemTypeForItemFieldName != null) {
                                }
                            }
                            if (objConvertAnother == null) {
                            }
                            if (fieldOrNull == null) {
                            }
                            hierarchicalStreamReader.moveUp();
                        }
                        if (itemTypeForItemFieldName != null || fieldName == null) {
                            handleUnknownField(declaringClass2, strRealMember2, cls2, nodeName);
                            itemTypeForItemFieldName = null;
                        }
                    }
                    if (itemTypeForItemFieldName != null) {
                        objConvertAnother = null;
                    } else {
                        Class clsClass$2 = class$java$util$Map$Entry;
                        if (clsClass$2 == null) {
                            clsClass$2 = class$("java.util.Map$Entry");
                            class$java$util$Map$Entry = clsClass$2;
                        }
                        if (clsClass$2.equals(itemTypeForItemFieldName)) {
                            hierarchicalStreamReader.moveDown();
                            Object objConvertAnother2 = unmarshallingContext.convertAnother(obj, HierarchicalStreams.readClassType(hierarchicalStreamReader, this.mapper));
                            hierarchicalStreamReader.moveUp();
                            hierarchicalStreamReader.moveDown();
                            Object objConvertAnother3 = unmarshallingContext.convertAnother(obj, HierarchicalStreams.readClassType(hierarchicalStreamReader, this.mapper));
                            hierarchicalStreamReader.moveUp();
                            objConvertAnother = Collections.singletonMap(objConvertAnother2, objConvertAnother3).entrySet().iterator().next();
                        } else {
                            objConvertAnother = unmarshallingContext.convertAnother(obj, itemTypeForItemFieldName);
                        }
                    }
                } else {
                    boolean z = false;
                    if (declaringClass2 == null) {
                        boolean z2 = false;
                        while (fieldOrNull != null) {
                            z2 = shouldUnmarshalField(fieldOrNull) && this.mapper.shouldSerializeMember(fieldOrNull.getDeclaringClass(), strRealMember2);
                            if (z2) {
                                break;
                            }
                            fieldOrNull = this.reflectionProvider.getFieldOrNull(fieldOrNull.getDeclaringClass().getSuperclass(), strRealMember2);
                        }
                        z = z2;
                    }
                    if (fieldOrNull == null || !(z || (shouldUnmarshalField(fieldOrNull) && this.mapper.shouldSerializeMember(fieldOrNull.getDeclaringClass(), strRealMember2)))) {
                        objConvertAnother = null;
                        itemTypeForItemFieldName = null;
                    } else {
                        String classAttribute2 = HierarchicalStreams.readClassAttribute(hierarchicalStreamReader, this.mapper);
                        if (classAttribute2 != null) {
                            clsDefaultImplementationOf = this.mapper.realClass(classAttribute2);
                        } else {
                            clsDefaultImplementationOf = this.mapper.defaultImplementationOf(fieldOrNull.getType());
                        }
                        Object objUnmarshallField = unmarshallField(unmarshallingContext, obj, clsDefaultImplementationOf, fieldOrNull);
                        Class type2 = fieldOrNull.getType();
                        if (!type2.isPrimitive()) {
                            clsDefaultImplementationOf = type2;
                        }
                        itemTypeForItemFieldName = clsDefaultImplementationOf;
                        objConvertAnother = objUnmarshallField;
                    }
                    fieldName = null;
                }
            } else {
                fieldName = implicitCollectionDefForFieldName.getFieldName();
                Class itemType = implicitCollectionDefForFieldName.getItemType();
                if (itemType == null) {
                    String classAttribute3 = HierarchicalStreams.readClassAttribute(hierarchicalStreamReader, this.mapper);
                    Mapper mapper2 = this.mapper;
                    if (classAttribute3 == null) {
                        classAttribute3 = nodeName;
                    }
                    itemType = mapper2.realClass(classAttribute3);
                }
                itemTypeForItemFieldName = itemType;
                objConvertAnother = unmarshallingContext.convertAnother(obj, itemTypeForItemFieldName);
                fieldOrNull = null;
            }
            if (objConvertAnother == null && !itemTypeForItemFieldName.isAssignableFrom(objConvertAnother.getClass())) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Cannot convert type ");
                stringBuffer.append(objConvertAnother.getClass().getName());
                stringBuffer.append(" to type ");
                stringBuffer.append(itemTypeForItemFieldName.getName());
                throw new ConversionException(stringBuffer.toString());
            }
            if (fieldOrNull == null) {
                this.reflectionProvider.writeField(obj, strRealMember2, objConvertAnother, fieldOrNull.getDeclaringClass());
                hashSet.add(new FastField(fieldOrNull.getDeclaringClass(), strRealMember2));
            } else if (itemTypeForItemFieldName != null) {
                if (fieldName == null) {
                    Mapper mapper3 = this.mapper;
                    if (objConvertAnother != null) {
                        clsClass$ = objConvertAnother.getClass();
                    } else {
                        clsClass$ = class$com$thoughtworks$xstream$mapper$Mapper$Null;
                        if (clsClass$ == null) {
                            clsClass$ = class$("com.thoughtworks.xstream.mapper.Mapper$Null");
                            class$com$thoughtworks$xstream$mapper$Mapper$Null = clsClass$;
                        }
                    }
                    fieldName = mapper3.getFieldNameForItemTypeAndName(cls2, clsClass$, nodeName);
                }
                if (map == null) {
                    map = new HashMap();
                }
                writeValueToImplicitCollection(objConvertAnother, map, obj, new FieldLocation(fieldName, cls2));
            }
            hierarchicalStreamReader.moveUp();
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof ArraysList) {
                    Object physicalArray = ((ArraysList) value).toPhysicalArray();
                    FieldLocation fieldLocation = (FieldLocation) entry.getKey();
                    Field fieldOrNull3 = this.reflectionProvider.getFieldOrNull(fieldLocation.definedIn, fieldLocation.fieldName);
                    this.reflectionProvider.writeField(obj, fieldLocation.fieldName, physicalArray, fieldOrNull3 != null ? fieldOrNull3.getDeclaringClass() : null);
                }
            }
        }
        return obj;
    }

    public Object unmarshallField(UnmarshallingContext unmarshallingContext, Object obj, Class cls, Field field) {
        return unmarshallingContext.convertAnother(obj, cls, this.mapper.getLocalConverter(field.getDeclaringClass(), field.getName()));
    }

    public boolean shouldUnmarshalField(Field field) {
        return !Modifier.isTransient(field.getModifiers()) || shouldUnmarshalTransientFields();
    }

    public final void handleUnknownField(Class cls, String str, Class cls2, String str2) {
        if (cls == null) {
            for (Class superclass = cls2; superclass != null; superclass = superclass.getSuperclass()) {
                if (!this.mapper.shouldSerializeMember(superclass, str2)) {
                    return;
                }
            }
        }
        throw new UnknownFieldException(cls2.getName(), str);
    }

    public final void writeValueToImplicitCollection(Object obj, Map map, Object obj2, FieldLocation fieldLocation) throws Throwable {
        Class fieldType;
        Collection mappingList;
        Collection arraysList = (Collection) map.get(fieldLocation);
        if (arraysList == null) {
            Field fieldOrNull = this.reflectionProvider.getFieldOrNull(fieldLocation.definedIn, fieldLocation.fieldName);
            if (fieldOrNull != null) {
                fieldType = fieldOrNull.getType();
            } else {
                fieldType = this.reflectionProvider.getFieldType(obj2, fieldLocation.fieldName, null);
            }
            if (fieldType.isArray()) {
                arraysList = new ArraysList(fieldType);
            } else {
                Class<?> clsDefaultImplementationOf = this.mapper.defaultImplementationOf(fieldType);
                Class clsClass$ = class$java$util$Collection;
                if (clsClass$ == null) {
                    clsClass$ = class$("java.util.Collection");
                    class$java$util$Collection = clsClass$;
                }
                if (!clsClass$.isAssignableFrom(clsDefaultImplementationOf)) {
                    Class clsClass$2 = class$java$util$Map;
                    if (clsClass$2 == null) {
                        clsClass$2 = class$("java.util.Map");
                        class$java$util$Map = clsClass$2;
                    }
                    if (!clsClass$2.isAssignableFrom(clsDefaultImplementationOf)) {
                        ObjectAccessException objectAccessException = new ObjectAccessException("Field is configured for an implicit Collection or Map, but is of an incompatible type");
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append(obj2.getClass().getName());
                        stringBuffer.append(".");
                        stringBuffer.append(fieldLocation.fieldName);
                        objectAccessException.add(SerializableConverter.ELEMENT_FIELD, stringBuffer.toString());
                        objectAccessException.add("field-type", clsDefaultImplementationOf.getName());
                        throw objectAccessException;
                    }
                }
                if (this.pureJavaReflectionProvider == null) {
                    this.pureJavaReflectionProvider = new PureJavaReflectionProvider();
                }
                Object objNewInstance = this.pureJavaReflectionProvider.newInstance(clsDefaultImplementationOf);
                if (objNewInstance instanceof Collection) {
                    mappingList = (Collection) objNewInstance;
                } else {
                    mappingList = new MappingList((Map) objNewInstance, this.mapper.getImplicitCollectionDefForFieldName(fieldLocation.definedIn, fieldLocation.fieldName).getKeyFieldName());
                }
                this.reflectionProvider.writeField(obj2, fieldLocation.fieldName, objNewInstance, fieldOrNull != null ? fieldOrNull.getDeclaringClass() : null);
                arraysList = mappingList;
            }
            map.put(fieldLocation, arraysList);
        }
        arraysList.add(obj);
    }

    public final Class readDeclaringClass(HierarchicalStreamReader hierarchicalStreamReader) {
        String strAliasForSystemAttribute = this.mapper.aliasForSystemAttribute("defined-in");
        String attribute = strAliasForSystemAttribute == null ? null : hierarchicalStreamReader.getAttribute(strAliasForSystemAttribute);
        if (attribute == null) {
            return null;
        }
        return this.mapper.realClass(attribute);
    }

    public Object instantiateNewInstance(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        String strAliasForSystemAttribute = this.mapper.aliasForSystemAttribute("resolves-to");
        String attribute = strAliasForSystemAttribute == null ? null : hierarchicalStreamReader.getAttribute(strAliasForSystemAttribute);
        Object objCurrentObject = unmarshallingContext.currentObject();
        if (objCurrentObject != null) {
            return objCurrentObject;
        }
        if (attribute != null) {
            return this.reflectionProvider.newInstance(this.mapper.realClass(attribute));
        }
        return this.reflectionProvider.newInstance(unmarshallingContext.getRequiredType());
    }

    @Override // com.thoughtworks.xstream.core.Caching
    public void flushCache() {
        this.serializationMethodInvoker.flushCache();
    }

    public Object readResolve() {
        SerializationMethodInvoker serializationMethodInvoker = new SerializationMethodInvoker();
        this.serializationMethodInvoker = serializationMethodInvoker;
        this.serializationMembers = serializationMethodInvoker.serializationMembers;
        return this;
    }

    /* loaded from: classes7.dex */
    public static class DuplicateFieldException extends ConversionException {
        public DuplicateFieldException(String str) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Duplicate field ");
            stringBuffer.append(str);
            super(stringBuffer.toString());
            add(SerializableConverter.ELEMENT_FIELD, str);
        }
    }

    /* loaded from: classes7.dex */
    public static class UnknownFieldException extends ConversionException {
        public UnknownFieldException(String str, String str2) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No such field ");
            stringBuffer.append(str);
            stringBuffer.append(".");
            stringBuffer.append(str2);
            super(stringBuffer.toString());
            add(SerializableConverter.ELEMENT_FIELD, str2);
        }
    }

    /* loaded from: classes5.dex */
    public static class FieldLocation {
        public final Class definedIn;
        public final String fieldName;

        public FieldLocation(String str, Class cls) {
            this.fieldName = str;
            this.definedIn = cls;
        }

        public int hashCode() {
            Class cls = this.definedIn;
            int iHashCode = ((cls == null ? 0 : cls.getName().hashCode()) + 7) * 7;
            String str = this.fieldName;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            FieldLocation fieldLocation = (FieldLocation) obj;
            if (this.definedIn != fieldLocation.definedIn) {
                return false;
            }
            String str = this.fieldName;
            if (str == null) {
                if (fieldLocation.fieldName != null) {
                    return false;
                }
            } else if (!str.equals(fieldLocation.fieldName)) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes8.dex */
    public static class FieldInfo extends FieldLocation {
        public final Class type;
        public final Object value;

        public FieldInfo(String str, Class cls, Class cls2, Object obj) {
            super(str, cls2);
            this.type = cls;
            this.value = obj;
        }
    }

    /* loaded from: classes5.dex */
    public static class ArraysList extends ArrayList {
        public final Class physicalFieldType;

        public ArraysList(Class cls) {
            this.physicalFieldType = cls;
        }

        public Object toPhysicalArray() throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
            Object[] array = toArray();
            Object objNewInstance = Array.newInstance(this.physicalFieldType.getComponentType(), array.length);
            if (this.physicalFieldType.getComponentType().isPrimitive()) {
                for (int i = 0; i < array.length; i++) {
                    Array.set(objNewInstance, i, Array.get(array, i));
                }
            } else {
                System.arraycopy(array, 0, objNewInstance, 0, array.length);
            }
            return objNewInstance;
        }
    }

    /* loaded from: classes5.dex */
    public class MappingList extends AbstractList {
        public final Map fieldCache = new HashMap();
        public final String keyFieldName;
        public final Map map;

        public MappingList(Map map, String str) {
            this.map = map;
            this.keyFieldName = str;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            if (obj == null) {
                boolean z = !this.map.containsKey(null);
                this.map.put(null, null);
                return z;
            }
            Class<?> cls = obj.getClass();
            if (this.keyFieldName != null) {
                Field field = (Field) this.fieldCache.get(cls);
                if (field == null) {
                    field = AbstractReflectionConverter.this.reflectionProvider.getField(cls, this.keyFieldName);
                    this.fieldCache.put(cls, field);
                }
                if (field != null) {
                    return this.map.put(Fields.read(field, obj), obj) == null;
                }
            } else if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return this.map.put(entry.getKey(), entry.getValue()) == null;
            }
            ConversionException conversionException = new ConversionException("Element  is not defined as entry for implicit map");
            conversionException.add("map-type", this.map.getClass().getName());
            conversionException.add("element-type", obj.getClass().getName());
            throw conversionException;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.map.size();
        }
    }
}
