package com.sdkit.paylib.paylibnative.p033ui.domain.savecardscreen;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibnative.ui.domain.savecardscreen.c */
/* loaded from: classes5.dex */
public final class C8221c implements InterfaceC8220b {

    /* renamed from: a */
    public final PaylibLogger f2391a;

    /* renamed from: b */
    public volatile EnumC8219a f2392b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.domain.savecardscreen.c$a */
    /* loaded from: classes6.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: b */
        public final /* synthetic */ EnumC8219a f2394b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC8219a enumC8219a) {
            super(0);
            this.f2394b = enumC8219a;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "setState state " + C8221c.this.mo2237a() + " to " + this.f2394b;
        }
    }

    public C8221c(PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f2391a = loggerFactory.get("PaylibSaveCardScreenStateManagerImpl");
        this.f2392b = EnumC8219a.NONE;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.domain.savecardscreen.InterfaceC8220b
    /* renamed from: a */
    public EnumC8219a mo2237a() {
        return this.f2392b;
    }

    /* renamed from: b */
    public void m2239b(EnumC8219a enumC8219a) {
        Intrinsics.checkNotNullParameter(enumC8219a, "<set-?>");
        this.f2392b = enumC8219a;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.domain.savecardscreen.InterfaceC8220b
    /* renamed from: a */
    public void mo2238a(EnumC8219a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        PaylibLogger.DefaultImpls.d$default(this.f2391a, null, new a(state), 1, null);
        m2239b(state);
    }
}
