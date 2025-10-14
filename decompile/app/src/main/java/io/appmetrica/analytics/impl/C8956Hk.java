package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Hk */
/* loaded from: classes8.dex */
public final class C8956Hk {

    /* renamed from: a */
    public final String f6728a;

    /* renamed from: b */
    public final String f6729b;

    /* renamed from: c */
    public final Integer f6730c;

    /* renamed from: d */
    public final Integer f6731d;

    /* renamed from: e */
    public final String f6732e;

    /* renamed from: f */
    public final Boolean f6733f;

    public C8956Hk(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f6728a = str;
        this.f6729b = str2;
        this.f6730c = num;
        this.f6731d = num2;
        this.f6732e = str3;
        this.f6733f = bool;
    }

    public C8956Hk(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
