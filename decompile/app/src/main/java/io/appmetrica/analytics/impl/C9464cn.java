package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.cn */
/* loaded from: classes6.dex */
public final class C9464cn {

    /* renamed from: c */
    public static final int[] f7880c = {0, 1, 2, 3};

    /* renamed from: a */
    public final SparseArray f7881a = new SparseArray();

    /* renamed from: b */
    public int f7882b = 0;

    public C9464cn(int[] iArr) {
        for (int i : iArr) {
            this.f7881a.put(i, new HashMap());
        }
    }
}
