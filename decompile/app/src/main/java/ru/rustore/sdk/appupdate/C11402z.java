package ru.rustore.sdk.appupdate;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* renamed from: ru.rustore.sdk.appupdate.z */
/* loaded from: classes8.dex */
public final class C11402z extends Lambda implements Function1<AppUpdateInfo, Unit> {

    /* renamed from: a */
    public final /* synthetic */ SingleEmitter<AppUpdateInfo> f10154a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11402z(SingleEmitter<AppUpdateInfo> singleEmitter) {
        super(1);
        this.f10154a = singleEmitter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AppUpdateInfo appUpdateInfo) {
        AppUpdateInfo appUpdateInfo2 = appUpdateInfo;
        Intrinsics.checkNotNullParameter(appUpdateInfo2, "appUpdateInfo");
        this.f10154a.success(appUpdateInfo2);
        return Unit.INSTANCE;
    }
}
