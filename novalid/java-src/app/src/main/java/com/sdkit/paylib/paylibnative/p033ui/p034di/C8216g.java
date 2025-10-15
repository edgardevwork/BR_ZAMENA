package com.sdkit.paylib.paylibnative.p033ui.p034di;

import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8241o;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* renamed from: com.sdkit.paylib.paylibnative.ui.di.g */
/* loaded from: classes6.dex */
public final class C8216g implements Factory {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.di.g$a */
    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a */
        public static final C8216g f2383a = new C8216g();
    }

    /* renamed from: a */
    public static C8216g m2231a() {
        return a.f2383a;
    }

    /* renamed from: c */
    public static C8241o m2232c() {
        return (C8241o) Preconditions.checkNotNullFromProvides(C8214e.f2381a.m2227a());
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C8241o get() {
        return m2232c();
    }
}
