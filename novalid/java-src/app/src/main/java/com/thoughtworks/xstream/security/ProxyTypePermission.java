package com.thoughtworks.xstream.security;

import java.lang.reflect.Proxy;

/* loaded from: classes5.dex */
public class ProxyTypePermission implements TypePermission {
    public static final TypePermission PROXIES = new ProxyTypePermission();

    /* renamed from: class$com$thoughtworks$xstream$mapper$DynamicProxyMapper$DynamicProxy */
    public static /* synthetic */ Class f5916x3ae28bf8;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$security$ProxyTypePermission;

    public int hashCode() {
        return 17;
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.security.TypePermission
    public boolean allows(Class cls) throws Throwable {
        if (cls != null) {
            if (!Proxy.isProxyClass(cls)) {
                Class clsClass$ = f5916x3ae28bf8;
                if (clsClass$ == null) {
                    clsClass$ = class$("com.thoughtworks.xstream.mapper.DynamicProxyMapper$DynamicProxy");
                    f5916x3ae28bf8 = clsClass$;
                }
                if (cls == clsClass$) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) throws Throwable {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            Class<?> clsClass$ = class$com$thoughtworks$xstream$security$ProxyTypePermission;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.security.ProxyTypePermission");
                class$com$thoughtworks$xstream$security$ProxyTypePermission = clsClass$;
            }
            if (cls == clsClass$) {
                return true;
            }
        }
        return false;
    }
}
