package com.sdkit.paylib.paylibplatform.impl.p040di;

import android.content.Context;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import com.sdkit.paylib.paylibplatform.impl.coroutines.C8590b;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibplatform.impl.di.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8591a {

    /* renamed from: com.sdkit.paylib.paylibplatform.impl.di.a$b */
    public static final class b {

        /* renamed from: a */
        public PaylibPlatformDependencies f5791a;

        public b() {
        }

        /* renamed from: a */
        public b m4663a(PaylibPlatformDependencies paylibPlatformDependencies) {
            this.f5791a = (PaylibPlatformDependencies) Preconditions.checkNotNull(paylibPlatformDependencies);
            return this;
        }

        /* renamed from: a */
        public InterfaceC8592b m4664a() {
            Preconditions.checkBuilderRequirement(this.f5791a, PaylibPlatformDependencies.class);
            return new c(this.f5791a);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibplatform.impl.di.a$c */
    /* loaded from: classes6.dex */
    public static final class c implements InterfaceC8592b {

        /* renamed from: b */
        public final PaylibPlatformDependencies f5792b;

        /* renamed from: c */
        public final c f5793c;

        /* renamed from: d */
        public Provider f5794d;

        public c(PaylibPlatformDependencies paylibPlatformDependencies) {
            this.f5793c = this;
            this.f5792b = paylibPlatformDependencies;
            m4665a(paylibPlatformDependencies);
        }

        /* renamed from: a */
        public final void m4665a(PaylibPlatformDependencies paylibPlatformDependencies) {
            this.f5794d = DoubleCheck.provider(C8590b.m4658a());
        }

        @Override // com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools
        public Context getContext() {
            return (Context) Preconditions.checkNotNullFromComponent(this.f5792b.getAppContext());
        }

        @Override // com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools
        public CoroutineDispatchers getCoroutineDispatchers() {
            return (CoroutineDispatchers) this.f5794d.get();
        }
    }

    /* renamed from: a */
    public static b m4662a() {
        return new b();
    }
}
