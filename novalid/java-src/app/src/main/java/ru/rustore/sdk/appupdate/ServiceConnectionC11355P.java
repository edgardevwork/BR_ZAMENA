package ru.rustore.sdk.appupdate;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.appupdate.InterfaceC11349J;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import ru.rustore.sdk.appupdate.model.AppUpdateParams;
import ru.rustore.sdk.appupdate.model.AppUpdateParamsKt;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.util.ContextExtKt;

/* renamed from: ru.rustore.sdk.appupdate.P */
/* loaded from: classes6.dex */
public final class ServiceConnectionC11355P implements ServiceConnection {

    /* renamed from: a */
    @NotNull
    public final Context f10051a;

    /* renamed from: b */
    @NotNull
    public final C11391o f10052b;

    /* renamed from: c */
    @NotNull
    public final String f10053c;

    /* renamed from: d */
    @NotNull
    public final AppUpdateParams f10054d;

    /* renamed from: e */
    @NotNull
    public final Function1<AppUpdateInfo, Unit> f10055e;

    /* renamed from: f */
    @NotNull
    public final Function1<RuStoreException, Unit> f10056f;

    /* renamed from: ru.rustore.sdk.appupdate.P$a */
    /* loaded from: classes8.dex */
    public static final class a extends AbstractBinderC11354O {

        /* renamed from: b */
        public final /* synthetic */ ServiceConnectionC11355P f10058b;

        public a(ServiceConnectionC11355P serviceConnectionC11355P) {
            this.f10058b = serviceConnectionC11355P;
        }
    }

    public ServiceConnectionC11355P(@NotNull Context context, @NotNull C11391o appUpdateInfoMapper, @NotNull String applicationId, @NotNull AppUpdateParams appUpdateParams, @NotNull C11402z onSuccess, @NotNull C11340A onError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appUpdateInfoMapper, "appUpdateInfoMapper");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(appUpdateParams, "appUpdateParams");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f10051a = context;
        this.f10052b = appUpdateInfoMapper;
        this.f10053c = applicationId;
        this.f10054d = appUpdateParams;
        this.f10055e = onSuccess;
        this.f10056f = onError;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        try {
            InterfaceC11349J.a.m7426a(service).mo7422a(this.f10053c, AppUpdateParamsKt.toBundle(this.f10054d), new a(this));
        } catch (Exception e) {
            Function1<RuStoreException, Unit> function1 = this.f10056f;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            function1.invoke(new RuStoreException(message));
            ContextExtKt.unbindServiceSafely(this.f10051a, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@Nullable ComponentName componentName) {
        this.f10056f.invoke(new RuStoreException("onServiceDisconnected"));
        ContextExtKt.unbindServiceSafely(this.f10051a, this);
    }
}
