package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.oa */
/* loaded from: classes7.dex */
public class C9751oa extends AbstractC9010K2 {

    /* renamed from: b */
    public final InterfaceC9826ra f8828b;

    public C9751oa(int i) {
        this(i, null);
    }

    /* renamed from: b */
    public int mo5481b(@Nullable Object obj) {
        return 0;
    }

    public C9751oa(int i, @Nullable InterfaceC9826ra interfaceC9826ra) {
        super(i);
        this.f8828b = interfaceC9826ra;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9010K2, io.appmetrica.analytics.impl.InterfaceC9826ra
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9054Lm mo5318a(@Nullable List<Object> list) {
        int iMo5481b;
        int i = 0;
        if (list == null || (list.size() <= this.f6853a && this.f8828b == null)) {
            iMo5481b = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            iMo5481b = 0;
            int i2 = 0;
            for (Object obj : list) {
                if (i2 < this.f6853a) {
                    InterfaceC9826ra interfaceC9826ra = this.f8828b;
                    if (interfaceC9826ra != null) {
                        C9054Lm c9054LmMo5318a = interfaceC9826ra.mo5318a(obj);
                        Object obj2 = c9054LmMo5318a.f6954a;
                        iMo5481b += c9054LmMo5318a.f6955b.getBytesTruncated();
                        AbstractC9664kn.m6343a(obj, c9054LmMo5318a.f6954a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i++;
                    iMo5481b += mo5481b(obj);
                }
                i2++;
            }
            list = arrayList;
        }
        return new C9054Lm(list, new C8815C4(i, iMo5481b));
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: b */
    public final InterfaceC9826ra m6591b() {
        return this.f8828b;
    }
}
