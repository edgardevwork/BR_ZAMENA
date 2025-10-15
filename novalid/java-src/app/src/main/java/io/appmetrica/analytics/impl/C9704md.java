package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: io.appmetrica.analytics.impl.md */
/* loaded from: classes8.dex */
public final /* synthetic */ class C9704md extends FunctionReferenceImpl implements Function1 {
    public C9704md(C9729nd c9729nd) {
        super(1, c9729nd, C9729nd.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C9729nd c9729nd = (C9729nd) this.receiver;
        c9729nd.f8730a.markCrashCompleted((String) obj);
        c9729nd.f8730a.deleteCompletedCrashes();
        return Unit.INSTANCE;
    }
}
