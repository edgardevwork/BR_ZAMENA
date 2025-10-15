package com.sdkit.paylib.paylibnative.p033ui.launcher.domain;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.g */
/* loaded from: classes5.dex */
public final class C8233g implements InterfaceC8232f {

    /* renamed from: a */
    public final PaylibLogger f2460a;

    /* renamed from: b */
    public volatile EnumC8231e f2461b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.g$a */
    /* loaded from: classes6.dex */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "init change state " + C8233g.this.mo2283b() + " to " + EnumC8231e.NONE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.g$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: b */
        public final /* synthetic */ EnumC8231e f2464b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC8231e enumC8231e) {
            super(0);
            this.f2464b = enumC8231e;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "setState change state " + C8233g.this.mo2283b() + " to " + this.f2464b;
        }
    }

    public C8233g(PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f2460a = loggerFactory.get("PaylibLongPollingStateManagerImpl");
        this.f2461b = EnumC8231e.NONE;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8232f
    /* renamed from: a */
    public void mo2281a() {
        PaylibLogger.DefaultImpls.d$default(this.f2460a, null, new a(), 1, null);
        m2284b(EnumC8231e.NONE);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8232f
    /* renamed from: b */
    public EnumC8231e mo2283b() {
        return this.f2461b;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8232f
    /* renamed from: a */
    public void mo2282a(EnumC8231e state) {
        Intrinsics.checkNotNullParameter(state, "state");
        PaylibLogger.DefaultImpls.d$default(this.f2460a, null, new b(state), 1, null);
        m2284b(state);
    }

    /* renamed from: b */
    public void m2284b(EnumC8231e enumC8231e) {
        Intrinsics.checkNotNullParameter(enumC8231e, "<set-?>");
        this.f2461b = enumC8231e;
    }
}
