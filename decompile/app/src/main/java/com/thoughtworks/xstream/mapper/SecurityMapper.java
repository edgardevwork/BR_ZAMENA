package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.security.AnyTypePermission;
import com.thoughtworks.xstream.security.ForbiddenClassException;
import com.thoughtworks.xstream.security.NoTypePermission;
import com.thoughtworks.xstream.security.TypePermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class SecurityMapper extends MapperWrapper {
    public final List permissions;

    public SecurityMapper(Mapper mapper) {
        this(mapper, null);
    }

    public SecurityMapper(Mapper mapper, TypePermission[] typePermissionArr) {
        ArrayList arrayList;
        super(mapper);
        if (typePermissionArr == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(Arrays.asList(typePermissionArr));
        }
        this.permissions = arrayList;
    }

    public void addPermission(TypePermission typePermission) {
        if (typePermission.equals(NoTypePermission.NONE) || typePermission.equals(AnyTypePermission.ANY)) {
            this.permissions.clear();
        }
        this.permissions.add(0, typePermission);
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public Class realClass(String str) {
        Class clsRealClass = super.realClass(str);
        for (int i = 0; i < this.permissions.size(); i++) {
            if (((TypePermission) this.permissions.get(i)).allows(clsRealClass)) {
                return clsRealClass;
            }
        }
        throw new ForbiddenClassException(clsRealClass);
    }
}
