package com.thoughtworks.xstream.mapper;

import java.lang.reflect.Proxy;

/* loaded from: classes8.dex */
public class DynamicProxyMapper extends MapperWrapper {

    /* renamed from: class$com$thoughtworks$xstream$mapper$DynamicProxyMapper$DynamicProxy */
    public static /* synthetic */ Class f5915x3ae28bf8;
    public String alias;

    /* loaded from: classes5.dex */
    public static class DynamicProxy {
    }

    public DynamicProxyMapper(Mapper mapper) {
        this(mapper, "dynamic-proxy");
    }

    public DynamicProxyMapper(Mapper mapper, String str) {
        super(mapper);
        this.alias = str;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String str) {
        this.alias = str;
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public String serializedClass(Class cls) {
        if (Proxy.isProxyClass(cls)) {
            return this.alias;
        }
        return super.serializedClass(cls);
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public Class realClass(String str) throws Throwable {
        if (str.equals(this.alias)) {
            Class cls = f5915x3ae28bf8;
            if (cls != null) {
                return cls;
            }
            Class clsClass$ = class$("com.thoughtworks.xstream.mapper.DynamicProxyMapper$DynamicProxy");
            f5915x3ae28bf8 = clsClass$;
            return clsClass$;
        }
        return super.realClass(str);
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }
}
