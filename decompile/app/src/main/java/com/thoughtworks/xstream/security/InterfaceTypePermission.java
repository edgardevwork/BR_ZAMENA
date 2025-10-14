package com.thoughtworks.xstream.security;

/* loaded from: classes5.dex */
public class InterfaceTypePermission implements TypePermission {
    public static final TypePermission INTERFACES = new InterfaceTypePermission();
    public static /* synthetic */ Class class$com$thoughtworks$xstream$security$InterfaceTypePermission;

    public int hashCode() {
        return 31;
    }

    @Override // com.thoughtworks.xstream.security.TypePermission
    public boolean allows(Class cls) {
        return cls != null && cls.isInterface();
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public boolean equals(Object obj) throws Throwable {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            Class<?> clsClass$ = class$com$thoughtworks$xstream$security$InterfaceTypePermission;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.security.InterfaceTypePermission");
                class$com$thoughtworks$xstream$security$InterfaceTypePermission = clsClass$;
            }
            if (cls == clsClass$) {
                return true;
            }
        }
        return false;
    }
}
