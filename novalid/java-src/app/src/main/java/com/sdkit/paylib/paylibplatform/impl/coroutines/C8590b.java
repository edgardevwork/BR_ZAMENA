package com.sdkit.paylib.paylibplatform.impl.coroutines;

import dagger.internal.Factory;

/* renamed from: com.sdkit.paylib.paylibplatform.impl.coroutines.b */
/* loaded from: classes5.dex */
public final class C8590b implements Factory {

    /* renamed from: com.sdkit.paylib.paylibplatform.impl.coroutines.b$a */
    public static final class a {

        /* renamed from: a */
        public static final C8590b f5790a = new C8590b();
    }

    /* renamed from: a */
    public static C8590b m4658a() {
        return a.f5790a;
    }

    /* renamed from: c */
    public static C8589a m4659c() {
        return new C8589a();
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C8589a get() {
        return m4659c();
    }
}
