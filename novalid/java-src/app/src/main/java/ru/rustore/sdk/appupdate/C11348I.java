package ru.rustore.sdk.appupdate;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import ru.rustore.sdk.reactive.single.Single;

/* renamed from: ru.rustore.sdk.appupdate.I */
/* loaded from: classes7.dex */
public final class C11348I extends Lambda implements Function1<Unit, Single<Integer>> {

    /* renamed from: a */
    public final /* synthetic */ C11394r f10038a;

    /* renamed from: b */
    public final /* synthetic */ AppUpdateInfo f10039b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11348I(C11394r c11394r, AppUpdateInfo appUpdateInfo) {
        super(1);
        this.f10038a = c11394r;
        this.f10039b = appUpdateInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Single<Integer> invoke(Unit unit) {
        Unit it = unit;
        Intrinsics.checkNotNullParameter(it, "it");
        C11394r c11394r = this.f10038a;
        AppUpdateInfo appUpdateInfo = this.f10039b;
        c11394r.getClass();
        return Single.INSTANCE.create(new C11342C(c11394r, appUpdateInfo));
    }
}
