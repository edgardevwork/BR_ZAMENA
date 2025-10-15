package com.thoughtworks.xstream.security;

/* loaded from: classes5.dex */
public class AnyTypePermission implements TypePermission {
    public static final TypePermission ANY = new AnyTypePermission();
    public static /* synthetic */ Class class$com$thoughtworks$xstream$security$AnyTypePermission;

    @Override // com.thoughtworks.xstream.security.TypePermission
    public boolean allows(Class cls) {
        return true;
    }

    public int hashCode() {
        return 3;
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
            Class<?> clsClass$ = class$com$thoughtworks$xstream$security$AnyTypePermission;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.security.AnyTypePermission");
                class$com$thoughtworks$xstream$security$AnyTypePermission = clsClass$;
            }
            if (cls == clsClass$) {
                return true;
            }
        }
        return false;
    }
}
