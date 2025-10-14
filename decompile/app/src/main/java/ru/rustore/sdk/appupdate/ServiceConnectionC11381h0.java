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

/* renamed from: ru.rustore.sdk.appupdate.h0 */
/* loaded from: classes6.dex */
public final class ServiceConnectionC11381h0 implements ServiceConnection {

    /* renamed from: a */
    @NotNull
    public final Context f10116a;

    /* renamed from: b */
    @NotNull
    public final String f10117b;

    /* renamed from: c */
    @NotNull
    public final Function0<Unit> f10118c;

    /* renamed from: d */
    @NotNull
    public final Function1<RuStoreException, Unit> f10119d;

    public ServiceConnectionC11381h0(@NotNull Context context, @NotNull String applicationId, @NotNull C11398v onSuccess, @NotNull C11399w onError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f10116a = context;
        this.f10117b = applicationId;
        this.f10118c = onSuccess;
        this.f10119d = onError;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        try {
            InterfaceC11349J.a.m7426a(service).mo7425a(this.f10117b, new a(this));
        } catch (Exception e) {
            Function1<RuStoreException, Unit> function1 = this.f10119d;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            function1.invoke(new RuStoreException(message));
            ContextExtKt.unbindServiceSafely(this.f10116a, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@Nullable ComponentName componentName) {
        this.f10119d.invoke(new RuStoreException("onServiceDisconnected"));
        ContextExtKt.unbindServiceSafely(this.f10116a, this);
    }

    /* renamed from: ru.rustore.sdk.appupdate.h0$a */
    /* loaded from: classes7.dex */
    public static final class a extends InterfaceC11379g0.a {

        /* renamed from: b */
        public final /* synthetic */ ServiceConnectionC11381h0 f10121b;

        public a(ServiceConnectionC11381h0 serviceConnectionC11381h0) {
            this.f10121b = serviceConnectionC11381h0;
        }

        @Override // ru.rustore.sdk.appupdate.InterfaceC11379g0
        /* renamed from: a */
        public final void mo7433a(int i, String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            ServiceConnectionC11381h0.this.f10119d.invoke(RemoteProviderErrors.INSTANCE.toRuStoreException(i, errorMessage));
            ContextExtKt.unbindServiceSafely(ServiceConnectionC11381h0.this.f10116a, this.f10121b);
        }

        @Override // ru.rustore.sdk.appupdate.InterfaceC11379g0
        /* renamed from: a */
        public final void mo7432a() {
            ServiceConnectionC11381h0.this.f10118c.invoke();
            ContextExtKt.unbindServiceSafely(ServiceConnectionC11381h0.this.f10116a, this.f10121b);
        }
    }
}
