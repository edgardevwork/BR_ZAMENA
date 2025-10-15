package ru.rustore.sdk.billingclient.impl.data.connection;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.p068vk.store.sdk.lib.payment.info.aidl.C11823a;
import ru.p068vk.store.sdk.lib.payment.info.aidl.model.C11824a;
import ru.p068vk.store.sdk.payment.info.aidl.AbstractBinderC11826b;
import ru.p068vk.store.sdk.payment.info.aidl.InterfaceC11825a;
import ru.rustore.sdk.billingclient.impl.data.provider.C11463g;
import ru.rustore.sdk.billingclient.impl.data.provider.C11464h;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.connection.a */
/* loaded from: classes5.dex */
public final class ServiceConnectionC11419a implements ServiceConnection {

    /* renamed from: a */
    public final boolean f10190a;

    /* renamed from: b */
    public final String f10191b;

    /* renamed from: c */
    public final C11823a f10192c;

    /* renamed from: d */
    public final Function1<C11824a, Unit> f10193d;

    /* renamed from: e */
    public final Function1<Throwable, Unit> f10194e;

    /* renamed from: ru.rustore.sdk.billingclient.impl.data.connection.a$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractBinderC11826b {
        public a() {
        }
    }

    public ServiceConnectionC11419a(boolean z, String applicationId, C11823a payInfoSerializer, C11463g onSuccess, C11464h onError) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(payInfoSerializer, "payInfoSerializer");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f10190a = z;
        this.f10191b = applicationId;
        this.f10192c = payInfoSerializer;
        this.f10193d = onSuccess;
        this.f10194e = onError;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC11825a c11956a;
        try {
            int i = InterfaceC11825a.a.f11066a;
            if (iBinder == null) {
                c11956a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.sdk.payment.info.aidl.PaymentInfoProvider");
                c11956a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC11825a)) ? new InterfaceC11825a.a.C11956a(iBinder) : (InterfaceC11825a) iInterfaceQueryLocalInterface;
            }
            c11956a.mo7562a(this.f10191b, this.f10190a, new a());
        } catch (Throwable th) {
            this.f10194e.invoke(th);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f10194e.invoke(new RuntimeException("onServiceDisconnected"));
    }
}
