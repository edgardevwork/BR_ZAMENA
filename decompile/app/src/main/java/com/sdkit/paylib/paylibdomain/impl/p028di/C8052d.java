package com.sdkit.paylib.paylibdomain.impl.p028di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.serialization.json.Json;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.di.d */
/* loaded from: classes7.dex */
public final class C8052d implements Factory {

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.di.d$a */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a */
        public static final C8052d f1209a = new C8052d();
    }

    /* renamed from: a */
    public static C8052d m1519a() {
        return a.f1209a;
    }

    /* renamed from: c */
    public static Json m1520c() {
        return (Json) Preconditions.checkNotNullFromProvides(C8051c.f1207a.m1517a());
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Json get() {
        return m1520c();
    }
}
