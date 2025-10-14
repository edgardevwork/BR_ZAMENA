package io.appmetrica.analytics.logger.common.impl;

import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.logger.common.impl.b */
/* loaded from: classes8.dex */
public final class C10070b {

    /* renamed from: a */
    public final C10073e f9493a;

    public C10070b() {
        this(new C10073e());
    }

    /* renamed from: a */
    public final ArrayList m7049a(String str) {
        String[] strArrSplit = str.split("\\n");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            int i = 0;
            while (str2.length() > i) {
                int length = str2.length();
                int i2 = i + 3800;
                int iMin = Math.min(length, i2);
                if (length > i2) {
                    int iM7050a = C10073e.m7050a(this.f9493a.f9498a.matcher(str2), i, iMin);
                    length = iM7050a == -1 ? iMin : iM7050a + 1;
                }
                arrayList.add(str2.substring(i, length));
                i = length;
            }
        }
        return arrayList;
    }

    public C10070b(C10073e c10073e) {
        this.f9493a = c10073e;
    }
}
