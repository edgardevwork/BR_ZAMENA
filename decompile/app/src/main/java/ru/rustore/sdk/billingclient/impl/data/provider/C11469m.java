package ru.rustore.sdk.billingclient.impl.data.provider;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import ru.rustore.sdk.core.util.ContextExtKt;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.provider.m */
/* loaded from: classes8.dex */
public final class C11469m extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: a */
    public final /* synthetic */ Function1<Throwable, Unit> f10275a;

    /* renamed from: b */
    public final /* synthetic */ Context f10276b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef<ServiceConnection> f10277c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11469m(C11471o c11471o, Context context, Ref.ObjectRef objectRef) {
        super(1);
        this.f10275a = c11471o;
        this.f10276b = context;
        this.f10277c = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable error = th;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f10275a.invoke(error);
        ContextExtKt.unbindServiceSafely(this.f10276b, this.f10277c.element);
        return Unit.INSTANCE;
    }
}
