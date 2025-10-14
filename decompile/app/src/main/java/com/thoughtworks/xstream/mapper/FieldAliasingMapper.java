package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.core.util.FastField;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class FieldAliasingMapper extends MapperWrapper {
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$ElementIgnoringMapper;
    public static /* synthetic */ Class class$java$lang$Object;
    public final Map aliasToFieldMap;
    public final ElementIgnoringMapper elementIgnoringMapper;
    public final Map fieldToAliasMap;

    public FieldAliasingMapper(Mapper mapper) throws Throwable {
        super(mapper);
        this.fieldToAliasMap = new HashMap();
        this.aliasToFieldMap = new HashMap();
        Class clsClass$ = class$com$thoughtworks$xstream$mapper$ElementIgnoringMapper;
        if (clsClass$ == null) {
            clsClass$ = class$("com.thoughtworks.xstream.mapper.ElementIgnoringMapper");
            class$com$thoughtworks$xstream$mapper$ElementIgnoringMapper = clsClass$;
        }
        this.elementIgnoringMapper = (ElementIgnoringMapper) lookupMapperOfType(clsClass$);
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public void addFieldAlias(String str, Class cls, String str2) {
        this.fieldToAliasMap.put(key(cls, str2), str);
        this.aliasToFieldMap.put(key(cls, str), str2);
    }

    public void addFieldsToIgnore(Pattern pattern) {
        ElementIgnoringMapper elementIgnoringMapper = this.elementIgnoringMapper;
        if (elementIgnoringMapper != null) {
            elementIgnoringMapper.addElementsToIgnore(pattern);
        }
    }

    public void omitField(Class cls, String str) {
        ElementIgnoringMapper elementIgnoringMapper = this.elementIgnoringMapper;
        if (elementIgnoringMapper != null) {
            elementIgnoringMapper.omitField(cls, str);
        }
    }

    private Object key(Class cls, String str) {
        return new FastField(cls, str);
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public String serializedMember(Class cls, String str) throws Throwable {
        String member = getMember(cls, str, this.fieldToAliasMap);
        return member == null ? super.serializedMember(cls, str) : member;
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public String realMember(Class cls, String str) throws Throwable {
        String member = getMember(cls, str, this.aliasToFieldMap);
        return member == null ? super.realMember(cls, str) : member;
    }

    public final String getMember(Class cls, String str, Map map) throws Throwable {
        String str2 = null;
        while (str2 == null) {
            Class clsClass$ = class$java$lang$Object;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.Object");
                class$java$lang$Object = clsClass$;
            }
            if (cls == clsClass$ || cls == null) {
                break;
            }
            str2 = (String) map.get(key(cls, str));
            cls = cls.getSuperclass();
        }
        return str2;
    }
}
