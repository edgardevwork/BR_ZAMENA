package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.k */
/* loaded from: classes7.dex */
public final class C8728k extends Lambda implements Function0 {

    /* renamed from: a */
    public final /* synthetic */ UtilityServiceProvider f6162a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8728k(UtilityServiceProvider utilityServiceProvider) {
        super(0);
        this.f6162a = utilityServiceProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new FirstExecutionConditionServiceImpl(this.f6162a);
    }
}
