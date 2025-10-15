package ru.rustore.sdk.appupdate;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.appupdate.InterfaceC11349J;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.util.ContextExtKt;

/* renamed from: ru.rustore.sdk.appupdate.N */
/* loaded from: classes6.dex */
public final class ServiceConnectionC11353N implements ServiceConnection {

    /* renamed from: a */
    @NotNull
    public final Context f10045a;

    /* renamed from: b */
    @NotNull
    public final String f10046b;

    /* renamed from: c */
    @NotNull
    public final Function0<Unit> f10047c;

    /* renamed from: d */
    @NotNull
    public final Function1<RuStoreException, Unit> f10048d;

    /* renamed from: ru.rustore.sdk.appupdate.N$a */
    /* loaded from: classes8.dex */
    public static final class a extends AbstractBinderC11352M {

        /* renamed from: b */
        public final /* synthetic */ ServiceConnectionC11353N f10050b;

        public a(ServiceConnectionC11353N serviceConnectionC11353N) {
            this.f10050b = serviceConnectionC11353N;
        }
    }

    public ServiceConnectionC11353N(@NotNull Context context, @NotNull String applicationId, @NotNull C11395s onSuccess, @NotNull C11396t onError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f10045a = context;
        this.f10046b = applicationId;
        this.f10047c = onSuccess;
        this.f10048d = onError;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        try {
            InterfaceC11349J.a.m7426a(service).mo7423a(this.f10046b, new a(this));
        } catch (Exception e) {
            Function1<RuStoreException, Unit> function1 = this.f10048d;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            function1.invoke(new RuStoreException(message));
            ContextExtKt.unbindServiceSafely(this.f10045a, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@Nullable ComponentName componentName) {
        this.f10048d.invoke(new RuStoreException("onServiceDisconnected"));
        ContextExtKt.unbindServiceSafely(this.f10045a, this);
    }
}
