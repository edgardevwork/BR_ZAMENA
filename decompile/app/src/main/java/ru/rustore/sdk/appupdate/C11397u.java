package ru.rustore.sdk.appupdate;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* renamed from: ru.rustore.sdk.appupdate.u */
/* loaded from: classes8.dex */
public final class C11397u extends Lambda implements Function1<SingleEmitter<Unit>, ServiceConnection> {

    /* renamed from: a */
    public final /* synthetic */ C11394r f10148a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11397u(C11394r c11394r) {
        super(1);
        this.f10148a = c11394r;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ServiceConnection invoke(SingleEmitter<Unit> singleEmitter) {
        SingleEmitter<Unit> emitter = singleEmitter;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Context context = this.f10148a.f10141a;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return new ServiceConnectionC11353N(context, packageName, new C11395s(emitter), new C11396t(emitter));
    }
}
