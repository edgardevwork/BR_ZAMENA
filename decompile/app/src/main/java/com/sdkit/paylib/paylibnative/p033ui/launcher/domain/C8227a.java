package com.sdkit.paylib.paylibnative.p033ui.launcher.domain;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.api.entity.PaylibResult;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.a */
/* loaded from: classes5.dex */
public final class C8227a implements FinishCodeReceiver {

    /* renamed from: a */
    public final InterfaceC8238l f2433a;

    /* renamed from: b */
    public final C8235i f2434b;

    /* renamed from: c */
    public final PaylibLogger f2435c;

    /* renamed from: d */
    public MutableStateFlow f2436d;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.a$a */
    /* loaded from: classes6.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ PaylibResult f2437a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PaylibResult paylibResult) {
            super(0);
            this.f2437a = paylibResult;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "notifyPaymentComplete() " + this.f2437a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.a$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ EnumC8105d f2438a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC8105d enumC8105d) {
            super(0);
            this.f2438a = enumC8105d;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC8105d invoke() {
            EnumC8105d enumC8105d = this.f2438a;
            return enumC8105d == null ? EnumC8105d.CLOSED_BY_USER : enumC8105d;
        }
    }

    public C8227a(InterfaceC8238l paylibStateManager, C8235i paylibResultResolver, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        Intrinsics.checkNotNullParameter(paylibResultResolver, "paylibResultResolver");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f2433a = paylibStateManager;
        this.f2434b = paylibResultResolver;
        this.f2435c = loggerFactory.get("FinishCodeReceiverImpl");
        this.f2436d = StateFlowKt.MutableStateFlow(null);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver
    /* renamed from: a */
    public void mo2267a(EnumC8105d enumC8105d) {
        PaylibResult paylibResultM2294a = this.f2434b.m2294a(new b(enumC8105d));
        PaylibLogger.DefaultImpls.d$default(this.f2435c, null, new a(paylibResultM2294a), 1, null);
        this.f2436d.tryEmit(paylibResultM2294a);
        this.f2436d = StateFlowKt.MutableStateFlow(null);
        this.f2433a.mo2344a();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver
    public Flow resultObserver() {
        return FlowKt.filterNotNull(this.f2436d);
    }
}
