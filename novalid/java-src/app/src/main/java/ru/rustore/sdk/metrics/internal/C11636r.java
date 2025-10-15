package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: ru.rustore.sdk.metrics.internal.r */
/* loaded from: classes5.dex */
public final class C11636r extends Lambda implements Function0<String> {

    /* renamed from: a */
    public final /* synthetic */ Throwable f10706a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11636r(Throwable th) {
        super(0);
        this.f10706a = th;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "Http request was failed with: " + this.f10706a;
    }
}
