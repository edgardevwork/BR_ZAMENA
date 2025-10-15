package com.thoughtworks.xstream.security;

/* loaded from: classes5.dex */
public class NullPermission implements TypePermission {
    public static final TypePermission NULL = new NullPermission();
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper$Null;

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
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$Mapper$Null;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.Mapper$Null");
                class$com$thoughtworks$xstream$mapper$Mapper$Null = clsClass$;
            }
            if (cls != clsClass$) {
                return false;
            }
        }
        return true;
    }
}
