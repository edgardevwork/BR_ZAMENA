package com.sdkit.paylib.paylibpayment.impl.p038di;

import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.di.f */
/* loaded from: classes8.dex */
public final class C8501f implements Factory {

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.di.f$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        public static final C8501f f4823a = new C8501f();
    }

    /* renamed from: a */
    public static C8501f m3934a() {
        return a.f4823a;
    }

    /* renamed from: c */
    public static InterfaceC8556a m3935c() {
        return (InterfaceC8556a) Preconditions.checkNotNullFromProvides(C8498c.f4820a.m3927a());
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC8556a get() {
        return m3935c();
    }
}
