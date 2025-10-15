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
import ru.rustore.sdk.appupdate.InterfaceC11379g0;
import ru.rustore.sdk.appupdate.errors.RemoteProviderErrors;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.util.ContextExtKt;

/* renamed from: ru.rustore.sdk.appupdate.f0 */
/* loaded from: classes6.dex */
public final class ServiceConnectionC11377f0 implements ServiceConnection {

    /* renamed from: a */
    @NotNull
    public final Context f10108a;

    /* renamed from: b */
    @NotNull
    public final String f10109b;

    /* renamed from: c */
    @NotNull
    public final Function0<Unit> f10110c;

    /* renamed from: d */
    @NotNull
    public final Function1<RuStoreException, Unit> f10111d;

    public ServiceConnectionC11377f0(@NotNull Context context, @NotNull String applicationId, @NotNull C11345F onSuccess, @NotNull C11346G onError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f10108a = context;
        this.f10109b = applicationId;
        this.f10110c = onSuccess;
        this.f10111d = onError;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        try {
            InterfaceC11349J.a.m7426a(service).mo7424a(this.f10109b, new a(this));
        } catch (Exception e) {
            Function1<RuStoreException, Unit> function1 = this.f10111d;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            function1.invoke(new RuStoreException(message));
            ContextExtKt.unbindServiceSafely(this.f10108a, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@Nullable ComponentName componentName) {
        this.f10111d.invoke(new RuStoreException("onServiceDisconnected"));
        ContextExtKt.unbindServiceSafely(this.f10108a, this);
    }

    /* renamed from: ru.rustore.sdk.appupdate.f0$a */
    /* loaded from: classes7.dex */
    public static final class a extends InterfaceC11379g0.a {

        /* renamed from: b */
        public final /* synthetic */ ServiceConnectionC11377f0 f10113b;

        public a(ServiceConnectionC11377f0 serviceConnectionC11377f0) {
            this.f10113b = serviceConnectionC11377f0;
        }

        @Override // ru.rustore.sdk.appupdate.InterfaceC11379g0
        /* renamed from: a */
        public final void mo7433a(int i, String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            ServiceConnectionC11377f0.this.f10111d.invoke(RemoteProviderErrors.INSTANCE.toRuStoreException(i, errorMessage));
            ContextExtKt.unbindServiceSafely(ServiceConnectionC11377f0.this.f10108a, this.f10113b);
        }

        @Override // ru.rustore.sdk.appupdate.InterfaceC11379g0
        /* renamed from: a */
        public final void mo7432a() {
            ServiceConnectionC11377f0.this.f10110c.invoke();
            ContextExtKt.unbindServiceSafely(ServiceConnectionC11377f0.this.f10108a, this.f10113b);
        }
    }
}
