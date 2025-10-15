package com.sdkit.paylib.paylibpayment.impl.domain.network.data;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.e */
/* loaded from: classes8.dex */
public abstract class AbstractC8532e {
    /* renamed from: a */
    public static final boolean m4006a(int i) {
        return i == 401 || i == 403;
    }

    /* renamed from: b */
    public static final boolean m4007b(int i) {
        return i == 400 || i == 404;
    }

    /* renamed from: c */
    public static final boolean m4008c(int i) {
        return i == 200;
    }

    /* renamed from: d */
    public static final boolean m4009d(int i) {
        return 500 <= i && i < 601;
    }

    /* renamed from: e */
    public static final boolean m4010e(int i) {
        return i == 408 || i == 40801;
    }
}
