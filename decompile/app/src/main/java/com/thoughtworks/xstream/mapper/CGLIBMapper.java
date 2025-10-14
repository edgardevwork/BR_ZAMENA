package com.thoughtworks.xstream.mapper;

import net.sf.cglib.proxy.Enhancer;

/* loaded from: classes8.dex */
public class CGLIBMapper extends MapperWrapper {
    public static String DEFAULT_NAMING_MARKER = "$$EnhancerByCGLIB$$";
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$CGLIBMapper$Marker;
    public final String alias;

    /* loaded from: classes5.dex */
    public interface Marker {
    }

    public CGLIBMapper(Mapper mapper) {
        this(mapper, "CGLIB-enhanced-proxy");
    }

    public CGLIBMapper(Mapper mapper, String str) {
        super(mapper);
        this.alias = str;
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public String serializedClass(Class cls) {
        String strSerializedClass = super.serializedClass(cls);
        if (cls == null) {
            return strSerializedClass;
        }
        String name = cls.getName();
        return (name.equals(strSerializedClass) && name.indexOf(DEFAULT_NAMING_MARKER) > 0 && Enhancer.isEnhanced(cls)) ? this.alias : strSerializedClass;
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public Class realClass(String str) throws Throwable {
        if (!str.equals(this.alias)) {
            return super.realClass(str);
        }
        Class cls = class$com$thoughtworks$xstream$mapper$CGLIBMapper$Marker;
        if (cls != null) {
            return cls;
        }
        Class clsClass$ = class$("com.thoughtworks.xstream.mapper.CGLIBMapper$Marker");
        class$com$thoughtworks$xstream$mapper$CGLIBMapper$Marker = clsClass$;
        return clsClass$;
    }
}
