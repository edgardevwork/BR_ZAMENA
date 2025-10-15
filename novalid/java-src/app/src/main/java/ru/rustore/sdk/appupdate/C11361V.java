package ru.rustore.sdk.appupdate;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.appupdate.listener.InstallStateUpdateListener;
import ru.rustore.sdk.appupdate.model.AppUpdateOptions;
import ru.rustore.sdk.appupdate.model.InstallState;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

/* renamed from: ru.rustore.sdk.appupdate.V */
/* loaded from: classes7.dex */
public final class C11361V extends Lambda implements Function1<InstallState, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11365Z f10065a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11361V(C11365Z c11365z) {
        super(1);
        this.f10065a = c11365z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InstallState installState) {
        InstallState installState2 = installState;
        Intrinsics.checkNotNullParameter(installState2, "installState");
        C11365Z c11365z = this.f10065a;
        AppUpdateOptions appUpdateOptions = c11365z.f10070d;
        if (appUpdateOptions != null) {
            int appUpdateType = appUpdateOptions.getAppUpdateType();
            int installStatus = installState2.getInstallStatus();
            if (installStatus == 1) {
                C11374e c11374e = c11365z.f10069c;
                c11374e.getClass();
                SingleSubscribeKt.subscribe$default(SingleSubscribeOnKt.subscribeOn(Single.INSTANCE.from(new C11370c(c11374e, new C11382i("updateStart.downloaded", c11374e.m7430a(appUpdateType)))), Dispatchers.INSTANCE.getIo()), null, C11372d.f10080a, 1, null);
            } else if (installStatus == 3) {
                c11365z.f10069c.m7431a(appUpdateType, String.valueOf(installState2.getInstallErrorCode()));
            }
        }
        if (installState2.getInstallStatus() == 3) {
            this.f10065a.f10070d = null;
        }
        Iterator it = this.f10065a.f10068b.iterator();
        while (it.hasNext()) {
            ((InstallStateUpdateListener) it.next()).onStateUpdated(installState2);
        }
        return Unit.INSTANCE;
    }
}
