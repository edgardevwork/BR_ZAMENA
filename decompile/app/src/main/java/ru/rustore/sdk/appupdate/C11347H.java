package ru.rustore.sdk.appupdate;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* renamed from: ru.rustore.sdk.appupdate.H */
/* loaded from: classes7.dex */
public final class C11347H extends Lambda implements Function1<SingleEmitter<Unit>, ServiceConnection> {

    /* renamed from: a */
    public final /* synthetic */ AppUpdateInfo f10036a;

    /* renamed from: b */
    public final /* synthetic */ C11394r f10037b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11347H(C11394r c11394r, AppUpdateInfo appUpdateInfo) {
        super(1);
        this.f10036a = appUpdateInfo;
        this.f10037b = c11394r;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ServiceConnection invoke(SingleEmitter<Unit> singleEmitter) {
        SingleEmitter<Unit> emitter = singleEmitter;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.f10036a.markIsUsed$sdk_public_appupdate_release();
        Context context = this.f10037b.f10141a;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return new ServiceConnectionC11377f0(context, packageName, new C11345F(emitter), new C11346G(emitter));
    }
}
