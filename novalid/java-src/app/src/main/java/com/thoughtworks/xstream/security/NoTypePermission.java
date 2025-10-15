package com.thoughtworks.xstream.security;

/* loaded from: classes5.dex */
public class NoTypePermission implements TypePermission {
    public static final TypePermission NONE = new NoTypePermission();
    public static /* synthetic */ Class class$com$thoughtworks$xstream$security$NoTypePermission;

    public int hashCode() {
        return 1;
    }

    @Override // com.thoughtworks.xstream.security.TypePermission
    public boolean allows(Class cls) {
        throw new ForbiddenClassException(cls);
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
            Class<?> clsClass$ = class$com$thoughtworks$xstream$security$NoTypePermission;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.security.NoTypePermission");
                class$com$thoughtworks$xstream$security$NoTypePermission = clsClass$;
            }
            if (cls == clsClass$) {
                return true;
            }
        }
        return false;
    }
}
