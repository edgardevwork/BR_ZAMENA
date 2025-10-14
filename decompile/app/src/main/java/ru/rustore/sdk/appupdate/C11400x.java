package ru.rustore.sdk.appupdate;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* renamed from: ru.rustore.sdk.appupdate.x */
/* loaded from: classes8.dex */
public final class C11400x extends Lambda implements Function1<SingleEmitter<Unit>, ServiceConnection> {

    /* renamed from: a */
    public final /* synthetic */ C11394r f10151a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11400x(C11394r c11394r) {
        super(1);
        this.f10151a = c11394r;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ServiceConnection invoke(SingleEmitter<Unit> singleEmitter) {
        SingleEmitter<Unit> emitter = singleEmitter;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Context context = this.f10151a.f10141a;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return new ServiceConnectionC11381h0(context, packageName, new C11398v(emitter), new C11399w(emitter));
    }
}
