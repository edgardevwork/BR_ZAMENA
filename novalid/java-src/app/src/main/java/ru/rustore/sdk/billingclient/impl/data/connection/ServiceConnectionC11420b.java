package ru.rustore.sdk.billingclient.impl.data.connection;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.p068vk.store.provider.paytoken.AbstractBinderC11822b;
import ru.p068vk.store.provider.paytoken.InterfaceC11821a;
import ru.rustore.sdk.billingclient.impl.data.provider.C11468l;
import ru.rustore.sdk.billingclient.impl.data.provider.C11469m;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.connection.b */
/* loaded from: classes5.dex */
public final class ServiceConnectionC11420b implements ServiceConnection {

    /* renamed from: a */
    public final boolean f10196a;

    /* renamed from: b */
    public final String f10197b;

    /* renamed from: c */
    public final Function1<String, Unit> f10198c;

    /* renamed from: d */
    public final Function1<Throwable, Unit> f10199d;

    /* renamed from: ru.rustore.sdk.billingclient.impl.data.connection.b$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractBinderC11822b {
        public a() {
        }
    }

    public ServiceConnectionC11420b(boolean z, String applicationId, C11468l onSuccess, C11469m onError) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f10196a = z;
        this.f10197b = applicationId;
        this.f10198c = onSuccess;
        this.f10199d = onError;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC11821a c11955a;
        try {
            int i = InterfaceC11821a.a.f11061a;
            if (iBinder == null) {
                c11955a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.paytoken.PayTokenProvider");
                c11955a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC11821a)) ? new InterfaceC11821a.a.C11955a(iBinder) : (InterfaceC11821a) iInterfaceQueryLocalInterface;
            }
            c11955a.mo7561a(this.f10197b, this.f10196a, new a());
        } catch (Throwable th) {
            this.f10199d.invoke(th);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f10199d.invoke(new RuntimeException("onServiceDisconnected"));
    }
}
