package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.mapper.Mapper;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes5.dex */
public abstract class MapperWrapper implements Mapper {
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$MapperWrapper;
    public final Mapper aliasForAttributeMapper;
    public final Mapper aliasForSystemAttributeMapper;
    public final Mapper attributeForAliasMapper;
    public final Mapper defaultImplementationOfMapper;
    public final Mapper getConverterFromAttributeMapper;
    public final Mapper getConverterFromItemTypeMapper;
    public final Mapper getFieldNameForItemTypeAndNameMapper;
    public final Mapper getImplicitCollectionDefForFieldNameMapper;
    public final Mapper getItemTypeForItemFieldNameMapper;
    public final Mapper getLocalConverterMapper;
    public final Mapper isIgnoredElementMapper;
    public final Mapper isImmutableValueTypeMapper;
    public final Mapper isReferenceableMapper;
    public final Mapper realClassMapper;
    public final Mapper realMemberMapper;
    public final Mapper serializedClassMapper;
    public final Mapper serializedMemberMapper;
    public final Mapper shouldSerializeMemberMapper;
    public final Mapper wrapped;

    public MapperWrapper(Mapper mapper) throws Throwable {
        this.wrapped = mapper;
        if (mapper instanceof MapperWrapper) {
            MapperWrapper mapperWrapper = (MapperWrapper) mapper;
            HashMap map = new HashMap();
            map.put("aliasForAttribute", mapperWrapper.aliasForAttributeMapper);
            map.put("aliasForSystemAttribute", mapperWrapper.aliasForSystemAttributeMapper);
            map.put("attributeForAlias", mapperWrapper.attributeForAliasMapper);
            map.put("defaultImplementationOf", mapperWrapper.defaultImplementationOfMapper);
            map.put("getConverterFromAttribute", mapperWrapper.getConverterFromAttributeMapper);
            map.put("getConverterFromItemType", mapperWrapper.getConverterFromItemTypeMapper);
            map.put("getFieldNameForItemTypeAndName", mapperWrapper.getFieldNameForItemTypeAndNameMapper);
            map.put("getImplicitCollectionDefForFieldName", mapperWrapper.getImplicitCollectionDefForFieldNameMapper);
            map.put("getItemTypeForItemFieldName", mapperWrapper.getItemTypeForItemFieldNameMapper);
            String str = "getLocalConverter";
            map.put("getLocalConverter", mapperWrapper.getLocalConverterMapper);
            map.put("isIgnoredElement", mapperWrapper.isIgnoredElementMapper);
            map.put("isImmutableValueType", mapperWrapper.isImmutableValueTypeMapper);
            map.put("isReferenceable", mapperWrapper.isReferenceableMapper);
            map.put("realClass", mapperWrapper.realClassMapper);
            map.put("realMember", mapperWrapper.realMemberMapper);
            map.put("serializedClass", mapperWrapper.serializedClassMapper);
            map.put("serializedMember", mapperWrapper.serializedMemberMapper);
            map.put("shouldSerializeMember", mapperWrapper.shouldSerializeMemberMapper);
            Method[] methods = mapper.getClass().getMethods();
            int i = 0;
            while (i < methods.length) {
                Method method = methods[i];
                Method[] methodArr = methods;
                Class<?> declaringClass = method.getDeclaringClass();
                Class<?> clsClass$ = class$com$thoughtworks$xstream$mapper$MapperWrapper;
                if (clsClass$ == null) {
                    clsClass$ = class$("com.thoughtworks.xstream.mapper.MapperWrapper");
                    class$com$thoughtworks$xstream$mapper$MapperWrapper = clsClass$;
                }
                String str2 = str;
                if (declaringClass != clsClass$) {
                    String name = method.getName();
                    if (map.containsKey(name)) {
                        map.put(name, mapper);
                    }
                }
                i++;
                methods = methodArr;
                str = str2;
            }
            this.aliasForAttributeMapper = (Mapper) map.get("aliasForAttribute");
            this.aliasForSystemAttributeMapper = (Mapper) map.get("aliasForSystemAttribute");
            this.attributeForAliasMapper = (Mapper) map.get("attributeForAlias");
            this.defaultImplementationOfMapper = (Mapper) map.get("defaultImplementationOf");
            this.getConverterFromAttributeMapper = (Mapper) map.get("getConverterFromAttribute");
            this.getConverterFromItemTypeMapper = (Mapper) map.get("getConverterFromItemType");
            this.getFieldNameForItemTypeAndNameMapper = (Mapper) map.get("getFieldNameForItemTypeAndName");
            this.getImplicitCollectionDefForFieldNameMapper = (Mapper) map.get("getImplicitCollectionDefForFieldName");
            this.getItemTypeForItemFieldNameMapper = (Mapper) map.get("getItemTypeForItemFieldName");
            this.getLocalConverterMapper = (Mapper) map.get(str);
            this.isIgnoredElementMapper = (Mapper) map.get("isIgnoredElement");
            this.isImmutableValueTypeMapper = (Mapper) map.get("isImmutableValueType");
            this.isReferenceableMapper = (Mapper) map.get("isReferenceable");
            this.realClassMapper = (Mapper) map.get("realClass");
            this.realMemberMapper = (Mapper) map.get("realMember");
            this.serializedClassMapper = (Mapper) map.get("serializedClass");
            this.serializedMemberMapper = (Mapper) map.get("serializedMember");
            this.shouldSerializeMemberMapper = (Mapper) map.get("shouldSerializeMember");
            return;
        }
        this.aliasForAttributeMapper = mapper;
        this.aliasForSystemAttributeMapper = mapper;
        this.attributeForAliasMapper = mapper;
        this.defaultImplementationOfMapper = mapper;
        this.getConverterFromAttributeMapper = mapper;
        this.getConverterFromItemTypeMapper = mapper;
        this.getFieldNameForItemTypeAndNameMapper = mapper;
        this.getImplicitCollectionDefForFieldNameMapper = mapper;
        this.getItemTypeForItemFieldNameMapper = mapper;
        this.getLocalConverterMapper = mapper;
        this.isIgnoredElementMapper = mapper;
        this.isImmutableValueTypeMapper = mapper;
        this.isReferenceableMapper = mapper;
        this.realClassMapper = mapper;
        this.realMemberMapper = mapper;
        this.serializedClassMapper = mapper;
        this.serializedMemberMapper = mapper;
        this.shouldSerializeMemberMapper = mapper;
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String serializedClass(Class cls) {
        return this.serializedClassMapper.serializedClass(cls);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public Class realClass(String str) {
        return this.realClassMapper.realClass(str);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String serializedMember(Class cls, String str) {
        return this.serializedMemberMapper.serializedMember(cls, str);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String realMember(Class cls, String str) {
        return this.realMemberMapper.realMember(cls, str);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public boolean isImmutableValueType(Class cls) {
        return this.isImmutableValueTypeMapper.isImmutableValueType(cls);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public boolean isReferenceable(Class cls) {
        return this.isReferenceableMapper.isReferenceable(cls);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public Class defaultImplementationOf(Class cls) {
        return this.defaultImplementationOfMapper.defaultImplementationOf(cls);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String aliasForAttribute(String str) {
        return this.aliasForAttributeMapper.aliasForAttribute(str);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String attributeForAlias(String str) {
        return this.attributeForAliasMapper.attributeForAlias(str);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String aliasForSystemAttribute(String str) {
        return this.aliasForSystemAttributeMapper.aliasForSystemAttribute(str);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String getFieldNameForItemTypeAndName(Class cls, Class cls2, String str) {
        return this.getFieldNameForItemTypeAndNameMapper.getFieldNameForItemTypeAndName(cls, cls2, str);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public Class getItemTypeForItemFieldName(Class cls, String str) {
        return this.getItemTypeForItemFieldNameMapper.getItemTypeForItemFieldName(cls, str);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public Mapper.ImplicitCollectionMapping getImplicitCollectionDefForFieldName(Class cls, String str) {
        return this.getImplicitCollectionDefForFieldNameMapper.getImplicitCollectionDefForFieldName(cls, str);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public boolean shouldSerializeMember(Class cls, String str) {
        return this.shouldSerializeMemberMapper.shouldSerializeMember(cls, str);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public boolean isIgnoredElement(String str) {
        return this.isIgnoredElementMapper.isIgnoredElement(str);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromItemType(String str, Class cls) {
        return this.getConverterFromItemTypeMapper.getConverterFromItemType(str, cls);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromItemType(Class cls) {
        return this.getConverterFromItemTypeMapper.getConverterFromItemType(cls);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromAttribute(String str) {
        return this.getConverterFromAttributeMapper.getConverterFromAttribute(str);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public Converter getLocalConverter(Class cls, String str) {
        return this.getLocalConverterMapper.getLocalConverter(cls, str);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public Mapper lookupMapperOfType(Class cls) {
        return cls.isAssignableFrom(getClass()) ? this : this.wrapped.lookupMapperOfType(cls);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromItemType(String str, Class cls, Class cls2) {
        return this.getConverterFromItemTypeMapper.getConverterFromItemType(str, cls, cls2);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String aliasForAttribute(Class cls, String str) {
        return this.aliasForAttributeMapper.aliasForAttribute(cls, str);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String attributeForAlias(Class cls, String str) {
        return this.attributeForAliasMapper.attributeForAlias(cls, str);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromAttribute(Class cls, String str) {
        return this.getConverterFromAttributeMapper.getConverterFromAttribute(cls, str);
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromAttribute(Class cls, String str, Class cls2) {
        return this.getConverterFromAttributeMapper.getConverterFromAttribute(cls, str, cls2);
    }
}
