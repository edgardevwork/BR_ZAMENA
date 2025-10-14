package ru.rustore.sdk.billingclient.impl.data.provider;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import ru.p068vk.store.sdk.lib.payment.info.aidl.model.C11824a;
import ru.rustore.sdk.core.util.ContextExtKt;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.provider.g */
/* loaded from: classes8.dex */
public final class C11463g extends Lambda implements Function1<C11824a, Unit> {

    /* renamed from: a */
    public final /* synthetic */ Function1<C11824a, Unit> f10264a;

    /* renamed from: b */
    public final /* synthetic */ Context f10265b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef<ServiceConnection> f10266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11463g(C11465i c11465i, Context context, Ref.ObjectRef objectRef) {
        super(1);
        this.f10264a = c11465i;
        this.f10265b = context;
        this.f10266c = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C11824a c11824a) {
        C11824a payInfo = c11824a;
        Intrinsics.checkNotNullParameter(payInfo, "payInfo");
        this.f10264a.invoke(payInfo);
        ContextExtKt.unbindServiceSafely(this.f10265b, this.f10266c.element);
        return Unit.INSTANCE;
    }
}
