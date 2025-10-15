package com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi;

import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.C8252f;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.d */
/* loaded from: classes6.dex */
public final class C8256d implements Factory {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.d$a */
    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a */
        public static final C8256d f2711a = new C8256d();
    }

    /* renamed from: a */
    public static C8256d m2475a() {
        return a.f2711a;
    }

    /* renamed from: c */
    public static C8252f m2476c() {
        return (C8252f) Preconditions.checkNotNullFromProvides(C8255c.f2710a.m2474a());
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C8252f get() {
        return m2476c();
    }
}
