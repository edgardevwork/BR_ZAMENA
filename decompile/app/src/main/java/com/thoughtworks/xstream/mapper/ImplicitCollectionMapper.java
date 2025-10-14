package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.InitializationException;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.core.util.Primitives;
import com.thoughtworks.xstream.mapper.Mapper;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public class ImplicitCollectionMapper extends MapperWrapper {
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper$Null;
    public static /* synthetic */ Class class$java$lang$Object;
    public static /* synthetic */ Class class$java$util$Collection;
    public static /* synthetic */ Class class$java$util$Map;
    public static /* synthetic */ Class class$java$util$Map$Entry;
    public final Map classNameToMapper;
    public ReflectionProvider reflectionProvider;

    public ImplicitCollectionMapper(Mapper mapper, ReflectionProvider reflectionProvider) {
        super(mapper);
        this.classNameToMapper = new HashMap();
        this.reflectionProvider = reflectionProvider;
    }

    public final ImplicitCollectionMapperForClass getMapper(Class cls, String str) {
        Field fieldOrNull = str != null ? this.reflectionProvider.getFieldOrNull(cls, str) : null;
        Class<?> declaringClass = fieldOrNull != null ? fieldOrNull.getDeclaringClass() : null;
        while (cls != null) {
            ImplicitCollectionMapperForClass implicitCollectionMapperForClass = (ImplicitCollectionMapperForClass) this.classNameToMapper.get(cls);
            if (implicitCollectionMapperForClass != null) {
                return implicitCollectionMapperForClass;
            }
            if (cls == declaringClass) {
                break;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public final ImplicitCollectionMapperForClass getOrCreateMapper(Class cls) {
        ImplicitCollectionMapperForClass implicitCollectionMapperForClass = (ImplicitCollectionMapperForClass) this.classNameToMapper.get(cls);
        if (implicitCollectionMapperForClass != null) {
            return implicitCollectionMapperForClass;
        }
        ImplicitCollectionMapperForClass implicitCollectionMapperForClass2 = new ImplicitCollectionMapperForClass(cls);
        this.classNameToMapper.put(cls, implicitCollectionMapperForClass2);
        return implicitCollectionMapperForClass2;
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public String getFieldNameForItemTypeAndName(Class cls, Class cls2, String str) {
        ImplicitCollectionMapperForClass mapper = getMapper(cls, null);
        if (mapper != null) {
            return mapper.getFieldNameForItemTypeAndName(cls2, str);
        }
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public Class getItemTypeForItemFieldName(Class cls, String str) {
        ImplicitCollectionMapperForClass mapper = getMapper(cls, null);
        if (mapper != null) {
            return mapper.getItemTypeForItemFieldName(str);
        }
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public Mapper.ImplicitCollectionMapping getImplicitCollectionDefForFieldName(Class cls, String str) {
        ImplicitCollectionMapperForClass mapper = getMapper(cls, str);
        if (mapper != null) {
            return mapper.getImplicitCollectionDefForFieldName(str);
        }
        return null;
    }

    public void add(Class cls, String str, Class cls2) {
        add(cls, str, null, cls2);
    }

    public void add(Class cls, String str, String str2, Class cls2) {
        add(cls, str, str2, cls2, null);
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public void add(Class cls, String str, String str2, Class cls2, String str3) {
        Field declaredField;
        Field field = null;
        if (cls != null) {
            Class superclass = cls;
            loop0: do {
                declaredField = null;
                while (true) {
                    Class clsClass$ = class$java$lang$Object;
                    if (clsClass$ == null) {
                        clsClass$ = class$("java.lang.Object");
                        class$java$lang$Object = clsClass$;
                    }
                    if (superclass == clsClass$) {
                        break loop0;
                    }
                    try {
                        declaredField = superclass.getDeclaredField(str);
                        break;
                    } catch (NoSuchFieldException unused) {
                        superclass = superclass.getSuperclass();
                    } catch (SecurityException e) {
                        throw new InitializationException("Access denied for field with implicit collection", e);
                    }
                }
            } while (Modifier.isStatic(declaredField.getModifiers()));
            field = declaredField;
        }
        if (field == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No field \"");
            stringBuffer.append(str);
            stringBuffer.append("\" for implicit collection");
            throw new InitializationException(stringBuffer.toString());
        }
        Class clsClass$2 = class$java$util$Map;
        if (clsClass$2 == null) {
            clsClass$2 = class$("java.util.Map");
            class$java$util$Map = clsClass$2;
        }
        if (!clsClass$2.isAssignableFrom(field.getType())) {
            Class clsClass$3 = class$java$util$Collection;
            if (clsClass$3 == null) {
                clsClass$3 = class$("java.util.Collection");
                class$java$util$Collection = clsClass$3;
            }
            if (!clsClass$3.isAssignableFrom(field.getType())) {
                Class<?> type = field.getType();
                if (!type.isArray()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Field \"");
                    stringBuffer2.append(str);
                    stringBuffer2.append("\" declares no collection or array");
                    throw new InitializationException(stringBuffer2.toString());
                }
                Class componentType = type.getComponentType();
                if (componentType.isPrimitive()) {
                    componentType = Primitives.box(componentType);
                }
                if (cls2 == null) {
                    cls2 = componentType;
                } else {
                    if (cls2.isPrimitive()) {
                        cls2 = Primitives.box(cls2);
                    }
                    if (!componentType.isAssignableFrom(cls2)) {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("Field \"");
                        stringBuffer3.append(str);
                        stringBuffer3.append("\" declares an array, but the array type is not compatible with ");
                        stringBuffer3.append(cls2.getName());
                        throw new InitializationException(stringBuffer3.toString());
                    }
                }
            }
        } else if (str2 == null && str3 == null && (cls2 = class$java$util$Map$Entry) == null) {
            cls2 = class$("java.util.Map$Entry");
            class$java$util$Map$Entry = cls2;
        }
        getOrCreateMapper(cls).add(new ImplicitCollectionMappingImpl(str, cls2, str2, str3));
    }

    /* loaded from: classes5.dex */
    public class ImplicitCollectionMapperForClass {
        public Class definedIn;
        public Map namedItemTypeToDef = new HashMap();
        public Map itemFieldNameToDef = new HashMap();
        public Map fieldNameToDef = new HashMap();

        public ImplicitCollectionMapperForClass(Class cls) {
            this.definedIn = cls;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        
            if (r2 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
        
            return r2.getFieldName();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
        
            r0 = r6.this$0.getMapper(r6.definedIn.getSuperclass(), null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
        
            if (r0 == null) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
        
            return r0.getFieldNameForItemTypeAndName(r7, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String getFieldNameForItemTypeAndName(Class cls, String str) throws Throwable {
            Iterator it = this.namedItemTypeToDef.keySet().iterator();
            ImplicitCollectionMappingImpl implicitCollectionMappingImpl = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                NamedItemType namedItemType = (NamedItemType) it.next();
                ImplicitCollectionMappingImpl implicitCollectionMappingImpl2 = (ImplicitCollectionMappingImpl) this.namedItemTypeToDef.get(namedItemType);
                Class clsClass$ = ImplicitCollectionMapper.class$com$thoughtworks$xstream$mapper$Mapper$Null;
                if (clsClass$ == null) {
                    clsClass$ = ImplicitCollectionMapper.class$("com.thoughtworks.xstream.mapper.Mapper$Null");
                    ImplicitCollectionMapper.class$com$thoughtworks$xstream$mapper$Mapper$Null = clsClass$;
                }
                if (cls == clsClass$) {
                    implicitCollectionMappingImpl = implicitCollectionMappingImpl2;
                    break;
                }
                if (namedItemType.itemType.isAssignableFrom(cls)) {
                    if (implicitCollectionMappingImpl2.getItemFieldName() != null) {
                        if (implicitCollectionMappingImpl2.getItemFieldName().equals(str)) {
                            return implicitCollectionMappingImpl2.getFieldName();
                        }
                    } else if (implicitCollectionMappingImpl == null || implicitCollectionMappingImpl.getItemType() == null || (implicitCollectionMappingImpl2.getItemType() != null && implicitCollectionMappingImpl.getItemType().isAssignableFrom(implicitCollectionMappingImpl2.getItemType()))) {
                        implicitCollectionMappingImpl = implicitCollectionMappingImpl2;
                    }
                }
            }
        }

        public Class getItemTypeForItemFieldName(String str) {
            ImplicitCollectionMappingImpl implicitCollectionDefByItemFieldName = getImplicitCollectionDefByItemFieldName(str);
            if (implicitCollectionDefByItemFieldName == null) {
                ImplicitCollectionMapperForClass mapper = ImplicitCollectionMapper.this.getMapper(this.definedIn.getSuperclass(), null);
                if (mapper != null) {
                    return mapper.getItemTypeForItemFieldName(str);
                }
                return null;
            }
            return implicitCollectionDefByItemFieldName.getItemType();
        }

        public final ImplicitCollectionMappingImpl getImplicitCollectionDefByItemFieldName(String str) {
            if (str == null) {
                return null;
            }
            ImplicitCollectionMappingImpl implicitCollectionMappingImpl = (ImplicitCollectionMappingImpl) this.itemFieldNameToDef.get(str);
            if (implicitCollectionMappingImpl != null) {
                return implicitCollectionMappingImpl;
            }
            ImplicitCollectionMapperForClass mapper = ImplicitCollectionMapper.this.getMapper(this.definedIn.getSuperclass(), null);
            if (mapper != null) {
                return mapper.getImplicitCollectionDefByItemFieldName(str);
            }
            return null;
        }

        public Mapper.ImplicitCollectionMapping getImplicitCollectionDefForFieldName(String str) {
            Mapper.ImplicitCollectionMapping implicitCollectionMapping = (Mapper.ImplicitCollectionMapping) this.fieldNameToDef.get(str);
            if (implicitCollectionMapping != null) {
                return implicitCollectionMapping;
            }
            ImplicitCollectionMapperForClass mapper = ImplicitCollectionMapper.this.getMapper(this.definedIn.getSuperclass(), null);
            if (mapper != null) {
                return mapper.getImplicitCollectionDefForFieldName(str);
            }
            return null;
        }

        public void add(ImplicitCollectionMappingImpl implicitCollectionMappingImpl) {
            this.fieldNameToDef.put(implicitCollectionMappingImpl.getFieldName(), implicitCollectionMappingImpl);
            this.namedItemTypeToDef.put(implicitCollectionMappingImpl.createNamedItemType(), implicitCollectionMappingImpl);
            if (implicitCollectionMappingImpl.getItemFieldName() != null) {
                this.itemFieldNameToDef.put(implicitCollectionMappingImpl.getItemFieldName(), implicitCollectionMappingImpl);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class ImplicitCollectionMappingImpl implements Mapper.ImplicitCollectionMapping {
        public final String fieldName;
        public final String itemFieldName;
        public final Class itemType;
        public final String keyFieldName;

        public ImplicitCollectionMappingImpl(String str, Class cls, String str2, String str3) {
            this.fieldName = str;
            this.itemFieldName = str2;
            this.itemType = cls;
            this.keyFieldName = str3;
        }

        public NamedItemType createNamedItemType() {
            return new NamedItemType(this.itemType, this.itemFieldName);
        }

        @Override // com.thoughtworks.xstream.mapper.Mapper.ImplicitCollectionMapping
        public String getFieldName() {
            return this.fieldName;
        }

        @Override // com.thoughtworks.xstream.mapper.Mapper.ImplicitCollectionMapping
        public String getItemFieldName() {
            return this.itemFieldName;
        }

        @Override // com.thoughtworks.xstream.mapper.Mapper.ImplicitCollectionMapping
        public Class getItemType() {
            return this.itemType;
        }

        @Override // com.thoughtworks.xstream.mapper.Mapper.ImplicitCollectionMapping
        public String getKeyFieldName() {
            return this.keyFieldName;
        }
    }

    /* loaded from: classes5.dex */
    public static class NamedItemType {
        public String itemFieldName;
        public Class itemType;

        public NamedItemType(Class cls, String str) throws Throwable {
            if (cls == null && (cls = ImplicitCollectionMapper.class$java$lang$Object) == null) {
                cls = ImplicitCollectionMapper.class$("java.lang.Object");
                ImplicitCollectionMapper.class$java$lang$Object = cls;
            }
            this.itemType = cls;
            this.itemFieldName = str;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof NamedItemType)) {
                return false;
            }
            NamedItemType namedItemType = (NamedItemType) obj;
            return this.itemType.equals(namedItemType.itemType) && isEquals(this.itemFieldName, namedItemType.itemFieldName);
        }

        public static boolean isEquals(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        public int hashCode() {
            int iHashCode = this.itemType.hashCode() << 7;
            String str = this.itemFieldName;
            return str != null ? iHashCode + str.hashCode() : iHashCode;
        }
    }
}
