package ru.rustore.sdk.appupdate;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import ru.rustore.sdk.appupdate.model.AppUpdateParams;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* renamed from: ru.rustore.sdk.appupdate.B */
/* loaded from: classes7.dex */
public final class C11341B extends Lambda implements Function1<SingleEmitter<AppUpdateInfo>, ServiceConnection> {

    /* renamed from: a */
    public final /* synthetic */ C11394r f10027a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11341B(C11394r c11394r) {
        super(1);
        this.f10027a = c11394r;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ServiceConnection invoke(SingleEmitter<AppUpdateInfo> singleEmitter) {
        SingleEmitter<AppUpdateInfo> emitter = singleEmitter;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        C11394r c11394r = this.f10027a;
        AppUpdateParams appUpdateParamsM7436a = C11394r.m7436a(c11394r, c11394r.f10141a);
        C11394r c11394r2 = this.f10027a;
        Context context = c11394r2.f10141a;
        C11391o c11391o = c11394r2.f10142b;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return new ServiceConnectionC11355P(context, c11391o, packageName, appUpdateParamsM7436a, new C11402z(emitter), new C11340A(emitter));
    }
}
