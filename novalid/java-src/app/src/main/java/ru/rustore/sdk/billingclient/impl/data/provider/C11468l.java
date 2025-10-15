package ru.rustore.sdk.billingclient.impl.data.provider;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import ru.rustore.sdk.core.util.ContextExtKt;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.provider.l */
/* loaded from: classes8.dex */
public final class C11468l extends Lambda implements Function1<String, Unit> {

    /* renamed from: a */
    public final /* synthetic */ Function1<String, Unit> f10272a;

    /* renamed from: b */
    public final /* synthetic */ Context f10273b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef<ServiceConnection> f10274c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11468l(C11470n c11470n, Context context, Ref.ObjectRef objectRef) {
        super(1);
        this.f10272a = c11470n;
        this.f10273b = context;
        this.f10274c = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String token = str;
        Intrinsics.checkNotNullParameter(token, "token");
        this.f10272a.invoke(token);
        ContextExtKt.unbindServiceSafely(this.f10273b, this.f10274c.element);
        return Unit.INSTANCE;
    }
}
