package com.thoughtworks.xstream.security;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class ExplicitTypePermission implements TypePermission {
    public final Set names;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.thoughtworks.xstream.security.ExplicitTypePermission$1] */
    public ExplicitTypePermission(final Class[] clsArr) {
        this(new Object() { // from class: com.thoughtworks.xstream.security.ExplicitTypePermission.1
            public String[] getNames() {
                Class[] clsArr2 = clsArr;
                if (clsArr2 == null) {
                    return null;
                }
                String[] strArr = new String[clsArr2.length];
                int i = 0;
                while (true) {
                    Class[] clsArr3 = clsArr;
                    if (i >= clsArr3.length) {
                        return strArr;
                    }
                    strArr[i] = clsArr3[i].getName();
                    i++;
                }
            }
        }.getNames());
    }

    public ExplicitTypePermission(String[] strArr) {
        this.names = strArr == null ? Collections.EMPTY_SET : new HashSet(Arrays.asList(strArr));
    }

    @Override // com.thoughtworks.xstream.security.TypePermission
    public boolean allows(Class cls) {
        if (cls == null) {
            return false;
        }
        return this.names.contains(cls.getName());
    }
}
