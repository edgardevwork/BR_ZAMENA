package com.thoughtworks.xstream.security;

import com.thoughtworks.xstream.core.util.Primitives;

/* loaded from: classes5.dex */
public class PrimitiveTypePermission implements TypePermission {
    public static final TypePermission PRIMITIVES = new PrimitiveTypePermission();
    public static /* synthetic */ Class class$com$thoughtworks$xstream$security$PrimitiveTypePermission;
    public static /* synthetic */ Class class$java$lang$Void;

    public int hashCode() {
        return 7;
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    @Override // com.thoughtworks.xstream.security.TypePermission
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean allows(Class cls) throws Throwable {
        if (cls != null && cls != Void.TYPE) {
            Class clsClass$ = class$java$lang$Void;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.Void");
                class$java$lang$Void = clsClass$;
            }
            if (cls == clsClass$ || !cls.isPrimitive()) {
            }
        } else if (!Primitives.isBoxed(cls)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) throws Throwable {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            Class<?> clsClass$ = class$com$thoughtworks$xstream$security$PrimitiveTypePermission;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.security.PrimitiveTypePermission");
                class$com$thoughtworks$xstream$security$PrimitiveTypePermission = clsClass$;
            }
            if (cls == clsClass$) {
                return true;
            }
        }
        return false;
    }
}
