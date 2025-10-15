package ru.rustore.sdk.billingclient.impl.data.provider;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import ru.rustore.sdk.core.util.ContextExtKt;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.provider.h */
/* loaded from: classes8.dex */
public final class C11464h extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: a */
    public final /* synthetic */ Function1<Throwable, Unit> f10267a;

    /* renamed from: b */
    public final /* synthetic */ Context f10268b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef<ServiceConnection> f10269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11464h(C11466j c11466j, Context context, Ref.ObjectRef objectRef) {
        super(1);
        this.f10267a = c11466j;
        this.f10268b = context;
        this.f10269c = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable error = th;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f10267a.invoke(error);
        ContextExtKt.unbindServiceSafely(this.f10268b, this.f10269c.element);
        return Unit.INSTANCE;
    }
}
