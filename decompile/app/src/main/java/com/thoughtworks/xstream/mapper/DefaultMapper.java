package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.core.ClassLoaderReference;
import com.thoughtworks.xstream.core.util.Primitives;
import com.thoughtworks.xstream.mapper.Mapper;

/* loaded from: classes5.dex */
public class DefaultMapper implements Mapper {
    public static String XSTREAM_PACKAGE_ROOT;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$DefaultMapper;
    public final ClassLoaderReference classLoaderReference;

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String aliasForAttribute(Class cls, String str) {
        return str;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String aliasForAttribute(String str) {
        return str;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String aliasForSystemAttribute(String str) {
        return str;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String attributeForAlias(Class cls, String str) {
        return str;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String attributeForAlias(String str) {
        return str;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public Class defaultImplementationOf(Class cls) {
        return cls;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromAttribute(Class cls, String str) {
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromAttribute(Class cls, String str, Class cls2) {
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromAttribute(String str) {
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromItemType(Class cls) {
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromItemType(String str, Class cls) {
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromItemType(String str, Class cls, Class cls2) {
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String getFieldNameForItemTypeAndName(Class cls, Class cls2, String str) {
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public Mapper.ImplicitCollectionMapping getImplicitCollectionDefForFieldName(Class cls, String str) {
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public Class getItemTypeForItemFieldName(Class cls, String str) {
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public Converter getLocalConverter(Class cls, String str) {
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public boolean isIgnoredElement(String str) {
        return false;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public boolean isImmutableValueType(Class cls) {
        return false;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public boolean isReferenceable(Class cls) {
        return true;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public Mapper lookupMapperOfType(Class cls) {
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String realMember(Class cls, String str) {
        return str;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String serializedMember(Class cls, String str) {
        return str;
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public boolean shouldSerializeMember(Class cls, String str) {
        return true;
    }

    static {
        Class clsClass$ = class$com$thoughtworks$xstream$mapper$DefaultMapper;
        if (clsClass$ == null) {
            clsClass$ = class$("com.thoughtworks.xstream.mapper.DefaultMapper");
            class$com$thoughtworks$xstream$mapper$DefaultMapper = clsClass$;
        }
        String name = clsClass$.getName();
        int iIndexOf = name.indexOf(".xstream.");
        XSTREAM_PACKAGE_ROOT = iIndexOf > 0 ? name.substring(0, iIndexOf + 9) : ".N/A";
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public DefaultMapper(ClassLoaderReference classLoaderReference) {
        this.classLoaderReference = classLoaderReference;
    }

    public DefaultMapper(ClassLoader classLoader) {
        this(new ClassLoaderReference(classLoader));
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public String serializedClass(Class cls) {
        return cls.getName();
    }

    @Override // com.thoughtworks.xstream.mapper.Mapper
    public Class realClass(String str) throws Throwable {
        ClassLoader reference;
        Class clsPrimitiveType = Primitives.primitiveType(str);
        if (clsPrimitiveType != null) {
            return clsPrimitiveType;
        }
        try {
            boolean z = true;
            if (str.startsWith(XSTREAM_PACKAGE_ROOT)) {
                Class clsClass$ = class$com$thoughtworks$xstream$mapper$DefaultMapper;
                if (clsClass$ == null) {
                    clsClass$ = class$("com.thoughtworks.xstream.mapper.DefaultMapper");
                    class$com$thoughtworks$xstream$mapper$DefaultMapper = clsClass$;
                }
                reference = clsClass$.getClassLoader();
            } else {
                reference = this.classLoaderReference.getReference();
                if (str.charAt(0) != '[') {
                    z = false;
                }
            }
            return Class.forName(str, z, reference);
        } catch (ClassNotFoundException unused) {
            throw new CannotResolveClassException(str);
        } catch (IllegalArgumentException unused2) {
            throw new CannotResolveClassException(str);
        }
    }

    public String lookupName(Class cls) {
        return serializedClass(cls);
    }

    public Class lookupType(String str) {
        return realClass(str);
    }
}
