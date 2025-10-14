package com.thoughtworks.xstream.security;

/* loaded from: classes5.dex */
public class ArrayTypePermission implements TypePermission {
    public static final TypePermission ARRAYS = new ArrayTypePermission();
    public static /* synthetic */ Class class$com$thoughtworks$xstream$security$ArrayTypePermission;

    public int hashCode() {
        return 13;
    }

    @Override // com.thoughtworks.xstream.security.TypePermission
    public boolean allows(Class cls) {
        return cls != null && cls.isArray();
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
            Class<?> clsClass$ = class$com$thoughtworks$xstream$security$ArrayTypePermission;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.security.ArrayTypePermission");
                class$com$thoughtworks$xstream$security$ArrayTypePermission = clsClass$;
            }
            if (cls == clsClass$) {
                return true;
            }
        }
        return false;
    }
}
