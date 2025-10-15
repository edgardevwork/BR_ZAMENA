package com.thoughtworks.xstream.security;

import net.sf.cglib.proxy.Proxy;

/* loaded from: classes5.dex */
public class CGLIBProxyTypePermission implements TypePermission {
    public static final TypePermission PROXIES = new CGLIBProxyTypePermission();
    public static /* synthetic */ Class class$com$thoughtworks$xstream$security$CGLIBProxyTypePermission;
    public static /* synthetic */ Class class$java$lang$Object;
    public static /* synthetic */ Class class$net$sf$cglib$proxy$Proxy;

    public int hashCode() {
        return 19;
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
            Class clsClass$ = class$java$lang$Object;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.Object");
                class$java$lang$Object = clsClass$;
            }
            if (cls != clsClass$ && !cls.isInterface()) {
                if (!Proxy.isProxyClass(cls)) {
                    String name = cls.getName();
                    StringBuffer stringBuffer = new StringBuffer();
                    Class clsClass$2 = class$net$sf$cglib$proxy$Proxy;
                    if (clsClass$2 == null) {
                        clsClass$2 = class$("net.sf.cglib.proxy.Proxy");
                        class$net$sf$cglib$proxy$Proxy = clsClass$2;
                    }
                    stringBuffer.append(clsClass$2.getPackage().getName());
                    stringBuffer.append(".");
                    if (name.startsWith(stringBuffer.toString())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) throws Throwable {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            Class<?> clsClass$ = class$com$thoughtworks$xstream$security$CGLIBProxyTypePermission;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.security.CGLIBProxyTypePermission");
                class$com$thoughtworks$xstream$security$CGLIBProxyTypePermission = clsClass$;
            }
            if (cls == clsClass$) {
                return true;
            }
        }
        return false;
    }
}
