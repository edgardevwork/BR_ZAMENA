package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: ru.rustore.sdk.metrics.internal.F */
/* loaded from: classes5.dex */
public final class C11588F extends Lambda implements Function0<String> {

    /* renamed from: a */
    public final /* synthetic */ String f10619a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11588F(String str) {
        super(0);
        this.f10619a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "Delete id's from storage " + this.f10619a;
    }
}
