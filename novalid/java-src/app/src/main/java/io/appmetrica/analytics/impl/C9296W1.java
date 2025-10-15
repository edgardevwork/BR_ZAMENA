package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.W1 */
/* loaded from: classes7.dex */
public final class C9296W1 implements ProtobufConverter {

    /* renamed from: a */
    public final C8838D2 f7385a;

    public C9296W1() {
        this(new C8838D2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9368Z1 fromModel(@NonNull C9272V1 c9272v1) {
        C9368Z1 c9368z1 = new C9368Z1();
        c9368z1.f7612a = new C9344Y1[c9272v1.f7346a.size()];
        int i = 0;
        int i2 = 0;
        for (PermissionState permissionState : c9272v1.f7346a) {
            C9344Y1[] c9344y1Arr = c9368z1.f7612a;
            C9344Y1 c9344y1 = new C9344Y1();
            c9344y1.f7547a = permissionState.name;
            c9344y1.f7548b = permissionState.granted;
            c9344y1Arr[i2] = c9344y1;
            i2++;
        }
        C8888F2 c8888f2 = c9272v1.f7347b;
        if (c8888f2 != null) {
            c9368z1.f7613b = this.f7385a.fromModel(c8888f2);
        }
        c9368z1.f7614c = new String[c9272v1.f7348c.size()];
        Iterator it = c9272v1.f7348c.iterator();
        while (it.hasNext()) {
            c9368z1.f7614c[i] = (String) it.next();
            i++;
        }
        return c9368z1;
    }

    public C9296W1(C8838D2 c8838d2) {
        this.f7385a = c8838d2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9272V1 toModel(@NonNull C9368Z1 c9368z1) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            C9344Y1[] c9344y1Arr = c9368z1.f7612a;
            if (i2 >= c9344y1Arr.length) {
                break;
            }
            C9344Y1 c9344y1 = c9344y1Arr[i2];
            arrayList.add(new PermissionState(c9344y1.f7547a, c9344y1.f7548b));
            i2++;
        }
        C9320X1 c9320x1 = c9368z1.f7613b;
        C8888F2 model = c9320x1 != null ? this.f7385a.toModel(c9320x1) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c9368z1.f7614c;
            if (i < strArr.length) {
                arrayList2.add(strArr[i]);
                i++;
            } else {
                return new C9272V1(arrayList, model, arrayList2);
            }
        }
    }
}
