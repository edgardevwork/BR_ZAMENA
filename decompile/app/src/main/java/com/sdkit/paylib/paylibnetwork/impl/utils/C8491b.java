package com.sdkit.paylib.paylibnetwork.impl.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import okhttp3.Call;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.utils.b */
/* loaded from: classes6.dex */
public final class C8491b extends Lambda implements Function1 {

    /* renamed from: a */
    public final /* synthetic */ Call f4208a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8491b(Call call) {
        super(1);
        this.f4208a = call;
    }

    /* renamed from: a */
    public final void m3883a(Throwable th) {
        try {
            this.f4208a.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m3883a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
