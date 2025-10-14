package com.thoughtworks.xstream.security;

/* loaded from: classes5.dex */
public class TypeHierarchyPermission implements TypePermission {
    public Class type;

    public TypeHierarchyPermission(Class cls) {
        this.type = cls;
    }

    @Override // com.thoughtworks.xstream.security.TypePermission
    public boolean allows(Class cls) {
        if (cls == null) {
            return false;
        }
        return this.type.isAssignableFrom(cls);
    }
}
