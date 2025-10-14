package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.InitializationException;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAliasType;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamConverters;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamImplicitCollection;
import com.thoughtworks.xstream.annotations.XStreamInclude;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.ConverterMatcher;
import com.thoughtworks.xstream.converters.ConverterRegistry;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.SingleValueConverterWrapper;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.core.ClassLoaderReference;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.core.util.DependencyInjectionFactory;
import com.thoughtworks.xstream.core.util.TypedNull;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public class AnnotationMapper extends MapperWrapper implements AnnotationConfiguration {
    public final Set<Class<?>> annotatedTypes;
    public transient Object[] arguments;
    public transient AttributeMapper attributeMapper;
    public transient ClassAliasingMapper classAliasingMapper;
    public final Map<Class<?>, Map<List<Object>, Converter>> converterCache;
    public final ConverterRegistry converterRegistry;
    public transient DefaultImplementationsMapper defaultImplementationsMapper;
    public transient ElementIgnoringMapper elementIgnoringMapper;
    public transient FieldAliasingMapper fieldAliasingMapper;
    public transient ImplicitCollectionMapper implicitCollectionMapper;
    public transient LocalConversionMapper localConversionMapper;
    public boolean locked;

    public AnnotationMapper(Mapper mapper, ConverterRegistry converterRegistry, ConverterLookup converterLookup, ClassLoaderReference classLoaderReference, ReflectionProvider reflectionProvider) {
        super(mapper);
        this.converterCache = new HashMap();
        Set<Class<?>> setSynchronizedSet = Collections.synchronizedSet(new HashSet());
        this.annotatedTypes = setSynchronizedSet;
        this.converterRegistry = converterRegistry;
        setSynchronizedSet.add(Object.class);
        setupMappers();
        this.locked = true;
        Object reference = classLoaderReference.getReference();
        this.arguments = new Object[]{this, classLoaderReference, reflectionProvider, converterLookup, new JVM(), reference == null ? new TypedNull(ClassLoader.class) : reference};
    }

    public AnnotationMapper(Mapper mapper, ConverterRegistry converterRegistry, ConverterLookup converterLookup, ClassLoader classLoader, ReflectionProvider reflectionProvider, JVM jvm) {
        this(mapper, converterRegistry, converterLookup, new ClassLoaderReference(classLoader), reflectionProvider);
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public String realMember(Class cls, String str) {
        if (!this.locked) {
            processAnnotations(cls);
        }
        return super.realMember(cls, str);
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public String serializedClass(Class cls) {
        if (!this.locked) {
            processAnnotations(cls);
        }
        return super.serializedClass(cls);
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public Class defaultImplementationOf(Class cls) {
        if (!this.locked) {
            processAnnotations(cls);
        }
        Class clsDefaultImplementationOf = super.defaultImplementationOf(cls);
        if (!this.locked) {
            processAnnotations(clsDefaultImplementationOf);
        }
        return clsDefaultImplementationOf;
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public Converter getLocalConverter(Class cls, String str) {
        if (!this.locked) {
            processAnnotations(cls);
        }
        return super.getLocalConverter(cls, str);
    }

    @Override // com.thoughtworks.xstream.mapper.AnnotationConfiguration
    public void autodetectAnnotations(boolean z) {
        this.locked = !z;
    }

    @Override // com.thoughtworks.xstream.mapper.AnnotationConfiguration
    public void processAnnotations(Class[] clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            return;
        }
        this.locked = true;
        UnprocessedTypesSet unprocessedTypesSet = new UnprocessedTypesSet();
        for (Class cls : clsArr) {
            unprocessedTypesSet.add((UnprocessedTypesSet) cls);
        }
        processTypes(unprocessedTypesSet);
    }

    public final void processAnnotations(Class cls) {
        if (cls == null) {
            return;
        }
        UnprocessedTypesSet unprocessedTypesSet = new UnprocessedTypesSet();
        unprocessedTypesSet.add((UnprocessedTypesSet) cls);
        processTypes(unprocessedTypesSet);
    }

    public final void processTypes(Set<Class<?>> set) {
        while (!set.isEmpty()) {
            Iterator<Class<?>> it = set.iterator();
            Class<?> next = it.next();
            it.remove();
            synchronized (next) {
                if (!this.annotatedTypes.contains(next)) {
                    try {
                        if (!next.isPrimitive()) {
                            addParametrizedTypes(next, set);
                            processConverterAnnotations(next);
                            processAliasAnnotation(next, set);
                            processAliasTypeAnnotation(next);
                            if (next.isInterface()) {
                                this.annotatedTypes.add(next);
                            } else {
                                processImplicitCollectionAnnotation(next);
                                for (Field field : next.getDeclaredFields()) {
                                    if (!field.isEnumConstant() && (field.getModifiers() & 136) <= 0) {
                                        addParametrizedTypes(field.getGenericType(), set);
                                        if (!field.isSynthetic()) {
                                            processFieldAliasAnnotation(field);
                                            processAsAttributeAnnotation(field);
                                            processImplicitAnnotation(field);
                                            processOmitFieldAnnotation(field);
                                            processLocalConverterAnnotation(field);
                                        }
                                    }
                                }
                                this.annotatedTypes.add(next);
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public final void addParametrizedTypes(Type type, final Set<Class<?>> set) {
        final HashSet hashSet = new HashSet();
        LinkedHashSet<Type> linkedHashSet = new LinkedHashSet<Type>() { // from class: com.thoughtworks.xstream.mapper.AnnotationMapper.1
            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean add(Type type2) {
                if (type2 instanceof Class) {
                    return set.add((Class) type2);
                }
                if (type2 == null || hashSet.contains(type2)) {
                    return false;
                }
                return super.add((C86601) type2);
            }
        };
        while (type != null) {
            hashSet.add(type);
            int i = 0;
            if (type instanceof Class) {
                Class<?> cls = (Class) type;
                set.add(cls);
                if (!cls.isPrimitive()) {
                    for (TypeVariable<Class<?>> typeVariable : cls.getTypeParameters()) {
                        linkedHashSet.add(typeVariable);
                    }
                    linkedHashSet.add(cls.getGenericSuperclass());
                    Type[] genericInterfaces = cls.getGenericInterfaces();
                    int length = genericInterfaces.length;
                    while (i < length) {
                        linkedHashSet.add(genericInterfaces[i]);
                        i++;
                    }
                }
            } else if (type instanceof TypeVariable) {
                Type[] bounds = ((TypeVariable) type).getBounds();
                int length2 = bounds.length;
                while (i < length2) {
                    linkedHashSet.add(bounds[i]);
                    i++;
                }
            } else if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                linkedHashSet.add(parameterizedType.getRawType());
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length3 = actualTypeArguments.length;
                while (i < length3) {
                    linkedHashSet.add(actualTypeArguments[i]);
                    i++;
                }
            } else if (type instanceof GenericArrayType) {
                linkedHashSet.add(((GenericArrayType) type).getGenericComponentType());
            }
            if (linkedHashSet.isEmpty()) {
                type = null;
            } else {
                Iterator<Type> it = linkedHashSet.iterator();
                Type next = it.next();
                it.remove();
                type = next;
            }
        }
    }

    public final void processConverterAnnotations(Class<?> cls) {
        if (this.converterRegistry != null) {
            XStreamConverters xStreamConverters = (XStreamConverters) cls.getAnnotation(XStreamConverters.class);
            XStreamConverter xStreamConverter = (XStreamConverter) cls.getAnnotation(XStreamConverter.class);
            ArrayList<XStreamConverter> arrayList = xStreamConverters != null ? new ArrayList(Arrays.asList(xStreamConverters.value())) : new ArrayList();
            if (xStreamConverter != null) {
                arrayList.add(xStreamConverter);
            }
            for (XStreamConverter xStreamConverter2 : arrayList) {
                Converter converterCacheConverter = cacheConverter(xStreamConverter2, xStreamConverter != null ? cls : null);
                if (converterCacheConverter != null) {
                    if (xStreamConverter != null || converterCacheConverter.canConvert(cls)) {
                        this.converterRegistry.registerConverter(converterCacheConverter, xStreamConverter2.priority());
                    } else {
                        throw new InitializationException("Converter " + xStreamConverter2.value().getName() + " cannot handle annotated class " + cls.getName());
                    }
                }
            }
        }
    }

    public final void processAliasAnnotation(Class<?> cls, Set<Class<?>> set) {
        XStreamAlias xStreamAlias = (XStreamAlias) cls.getAnnotation(XStreamAlias.class);
        if (xStreamAlias != null) {
            ClassAliasingMapper classAliasingMapper = this.classAliasingMapper;
            if (classAliasingMapper == null) {
                throw new InitializationException("No " + ClassAliasingMapper.class.getName() + " available");
            }
            classAliasingMapper.addClassAlias(xStreamAlias.value(), cls);
            if (xStreamAlias.impl() != Void.class) {
                this.defaultImplementationsMapper.addDefaultImplementation(xStreamAlias.impl(), cls);
                if (cls.isInterface()) {
                    set.add(xStreamAlias.impl());
                }
            }
        }
    }

    public final void processAliasTypeAnnotation(Class<?> cls) {
        XStreamAliasType xStreamAliasType = (XStreamAliasType) cls.getAnnotation(XStreamAliasType.class);
        if (xStreamAliasType != null) {
            ClassAliasingMapper classAliasingMapper = this.classAliasingMapper;
            if (classAliasingMapper == null) {
                throw new InitializationException("No " + ClassAliasingMapper.class.getName() + " available");
            }
            classAliasingMapper.addTypeAlias(xStreamAliasType.value(), cls);
        }
    }

    @Deprecated
    public final void processImplicitCollectionAnnotation(Class<?> cls) {
        XStreamImplicitCollection xStreamImplicitCollection = (XStreamImplicitCollection) cls.getAnnotation(XStreamImplicitCollection.class);
        if (xStreamImplicitCollection != null) {
            if (this.implicitCollectionMapper == null) {
                throw new InitializationException("No " + ImplicitCollectionMapper.class.getName() + " available");
            }
            String strValue = xStreamImplicitCollection.value();
            String strItem = xStreamImplicitCollection.item();
            try {
                Type genericType = cls.getDeclaredField(strValue).getGenericType();
                Class<?> cls2 = genericType instanceof ParameterizedType ? getClass(((ParameterizedType) genericType).getActualTypeArguments()[0]) : null;
                if (cls2 == null) {
                    this.implicitCollectionMapper.add(cls, strValue, null, Object.class);
                } else if (strItem.equals("")) {
                    this.implicitCollectionMapper.add(cls, strValue, null, cls2);
                } else {
                    this.implicitCollectionMapper.add(cls, strValue, strItem, cls2);
                }
            } catch (NoSuchFieldException unused) {
                throw new InitializationException(cls.getName() + " does not have a field named '" + strValue + "' as required by " + XStreamImplicitCollection.class.getName());
            }
        }
    }

    public final void processFieldAliasAnnotation(Field field) {
        XStreamAlias xStreamAlias = (XStreamAlias) field.getAnnotation(XStreamAlias.class);
        if (xStreamAlias != null) {
            FieldAliasingMapper fieldAliasingMapper = this.fieldAliasingMapper;
            if (fieldAliasingMapper == null) {
                throw new InitializationException("No " + FieldAliasingMapper.class.getName() + " available");
            }
            fieldAliasingMapper.addFieldAlias(xStreamAlias.value(), field.getDeclaringClass(), field.getName());
        }
    }

    public final void processAsAttributeAnnotation(Field field) {
        if (((XStreamAsAttribute) field.getAnnotation(XStreamAsAttribute.class)) != null) {
            AttributeMapper attributeMapper = this.attributeMapper;
            if (attributeMapper == null) {
                throw new InitializationException("No " + AttributeMapper.class.getName() + " available");
            }
            attributeMapper.addAttributeFor(field);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void processImplicitAnnotation(Field field) {
        Class<?> cls;
        XStreamImplicit xStreamImplicit = (XStreamImplicit) field.getAnnotation(XStreamImplicit.class);
        if (xStreamImplicit != null) {
            if (this.implicitCollectionMapper == null) {
                throw new InitializationException("No " + ImplicitCollectionMapper.class.getName() + " available");
            }
            String name = field.getName();
            String strItemFieldName = xStreamImplicit.itemFieldName();
            String strKeyFieldName = xStreamImplicit.keyFieldName();
            boolean zIsAssignableFrom = Map.class.isAssignableFrom(field.getType());
            if (!field.getType().isArray()) {
                Type genericType = field.getGenericType();
                if (genericType instanceof ParameterizedType) {
                    cls = getClass(((ParameterizedType) genericType).getActualTypeArguments()[zIsAssignableFrom ? 1 : 0]);
                } else {
                    cls = null;
                }
            }
            if (zIsAssignableFrom) {
                ImplicitCollectionMapper implicitCollectionMapper = this.implicitCollectionMapper;
                Class<?> declaringClass = field.getDeclaringClass();
                if (strItemFieldName == null || "".equals(strItemFieldName)) {
                    strItemFieldName = null;
                }
                implicitCollectionMapper.add(declaringClass, name, strItemFieldName, cls, (strKeyFieldName == null || "".equals(strKeyFieldName)) ? null : strKeyFieldName);
                return;
            }
            if (strItemFieldName != null && !"".equals(strItemFieldName)) {
                this.implicitCollectionMapper.add(field.getDeclaringClass(), name, strItemFieldName, cls);
            } else {
                this.implicitCollectionMapper.add(field.getDeclaringClass(), name, cls);
            }
        }
    }

    public final void processOmitFieldAnnotation(Field field) {
        if (((XStreamOmitField) field.getAnnotation(XStreamOmitField.class)) != null) {
            ElementIgnoringMapper elementIgnoringMapper = this.elementIgnoringMapper;
            if (elementIgnoringMapper == null) {
                throw new InitializationException("No " + ElementIgnoringMapper.class.getName() + " available");
            }
            elementIgnoringMapper.omitField(field.getDeclaringClass(), field.getName());
        }
    }

    public final void processLocalConverterAnnotation(Field field) {
        Converter converterCacheConverter;
        XStreamConverter xStreamConverter = (XStreamConverter) field.getAnnotation(XStreamConverter.class);
        if (xStreamConverter == null || (converterCacheConverter = cacheConverter(xStreamConverter, field.getType())) == null) {
            return;
        }
        LocalConversionMapper localConversionMapper = this.localConversionMapper;
        if (localConversionMapper == null) {
            throw new InitializationException("No " + LocalConversionMapper.class.getName() + " available");
        }
        localConversionMapper.registerLocalConverter(field.getDeclaringClass(), field.getName(), converterCacheConverter);
    }

    public final Converter cacheConverter(XStreamConverter xStreamConverter, Class cls) {
        Object[] objArr;
        ArrayList arrayList = new ArrayList();
        if (cls != null && xStreamConverter.useImplicitType()) {
            arrayList.add(cls);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(xStreamConverter.booleans());
        arrayList2.add(xStreamConverter.bytes());
        arrayList2.add(xStreamConverter.chars());
        arrayList2.add(xStreamConverter.doubles());
        arrayList2.add(xStreamConverter.floats());
        arrayList2.add(xStreamConverter.ints());
        arrayList2.add(xStreamConverter.longs());
        arrayList2.add(xStreamConverter.shorts());
        arrayList2.add(xStreamConverter.strings());
        arrayList2.add(xStreamConverter.types());
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                int length = Array.getLength(next);
                for (int i = 0; i < length; i++) {
                    arrayList.add(Array.get(next, i));
                }
            }
        }
        for (Class<?> cls2 : xStreamConverter.nulls()) {
            arrayList.add(new TypedNull(cls2));
        }
        Class<? extends ConverterMatcher> clsValue = xStreamConverter.value();
        Map<List<Object>, Converter> map = this.converterCache.get(clsValue);
        Converter singleValueConverterWrapper = map != null ? map.get(arrayList) : null;
        if (singleValueConverterWrapper == null) {
            int size = arrayList.size();
            if (size > 0) {
                Object[] objArr2 = this.arguments;
                objArr = new Object[objArr2.length + size];
                System.arraycopy(objArr2, 0, objArr, size, objArr2.length);
                System.arraycopy(arrayList.toArray(new Object[size]), 0, objArr, 0, size);
            } else {
                objArr = this.arguments;
            }
            try {
                if (SingleValueConverter.class.isAssignableFrom(clsValue) && !Converter.class.isAssignableFrom(clsValue)) {
                    singleValueConverterWrapper = new SingleValueConverterWrapper((SingleValueConverter) DependencyInjectionFactory.newInstance(clsValue, objArr));
                } else {
                    singleValueConverterWrapper = (Converter) DependencyInjectionFactory.newInstance(clsValue, objArr);
                }
                if (map == null) {
                    map = new HashMap<>();
                    this.converterCache.put(clsValue, map);
                }
                map.put(arrayList, singleValueConverterWrapper);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate converter ");
                sb.append(clsValue.getName());
                sb.append(cls != null ? " for type " + cls.getName() : "");
                throw new InitializationException(sb.toString(), e);
            }
        }
        return singleValueConverterWrapper;
    }

    public final Class<?> getClass(Type type) {
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        return null;
    }

    public final void setupMappers() {
        this.classAliasingMapper = (ClassAliasingMapper) lookupMapperOfType(ClassAliasingMapper.class);
        this.defaultImplementationsMapper = (DefaultImplementationsMapper) lookupMapperOfType(DefaultImplementationsMapper.class);
        this.implicitCollectionMapper = (ImplicitCollectionMapper) lookupMapperOfType(ImplicitCollectionMapper.class);
        this.fieldAliasingMapper = (FieldAliasingMapper) lookupMapperOfType(FieldAliasingMapper.class);
        this.elementIgnoringMapper = (ElementIgnoringMapper) lookupMapperOfType(ElementIgnoringMapper.class);
        this.attributeMapper = (AttributeMapper) lookupMapperOfType(AttributeMapper.class);
        this.localConversionMapper = (LocalConversionMapper) lookupMapperOfType(LocalConversionMapper.class);
    }

    public final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = this.arguments.length - 2;
        objectOutputStream.writeInt(length);
        for (int i = 0; i < length; i++) {
            objectOutputStream.writeObject(this.arguments[i]);
        }
    }

    public final void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        setupMappers();
        int i = objectInputStream.readInt();
        this.arguments = new Object[i + 2];
        for (int i2 = 0; i2 < i; i2++) {
            this.arguments[i2] = objectInputStream.readObject();
            Object[] objArr = this.arguments;
            Object obj = objArr[i2];
            if (obj instanceof ClassLoaderReference) {
                objArr[i + 1] = ((ClassLoaderReference) obj).getReference();
            }
        }
        this.arguments[i] = new JVM();
    }

    /* loaded from: classes5.dex */
    public final class UnprocessedTypesSet extends LinkedHashSet<Class<?>> {
        public UnprocessedTypesSet() {
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Class<?> cls) {
            XStreamInclude xStreamInclude;
            Class<?>[] clsArrValue;
            if (cls == null) {
                return false;
            }
            while (cls.isArray()) {
                cls = cls.getComponentType();
            }
            String name = cls.getName();
            if (name.startsWith("java.") || name.startsWith("javax.")) {
                return false;
            }
            boolean zAdd = AnnotationMapper.this.annotatedTypes.contains(cls) ? false : super.add((UnprocessedTypesSet) cls);
            if (zAdd && (xStreamInclude = (XStreamInclude) cls.getAnnotation(XStreamInclude.class)) != null && (clsArrValue = xStreamInclude.value()) != null) {
                for (Class<?> cls2 : clsArrValue) {
                    add(cls2);
                }
            }
            return zAdd;
        }
    }
}
