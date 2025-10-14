package com.thoughtworks.xstream.security;

/* loaded from: classes5.dex */
public class NoPermission implements TypePermission {
    public final TypePermission permission;

    public NoPermission(TypePermission typePermission) {
        this.permission = typePermission;
    }

    @Override // com.thoughtworks.xstream.security.TypePermission
    public boolean allows(Class cls) {
        TypePermission typePermission = this.permission;
        if (typePermission == null || typePermission.allows(cls)) {
            throw new ForbiddenClassException(cls);
        }
        return false;
    }
}
