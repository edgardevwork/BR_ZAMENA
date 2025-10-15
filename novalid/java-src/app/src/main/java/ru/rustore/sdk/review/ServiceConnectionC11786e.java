package ru.rustore.sdk.review;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.util.ContextExtKt;
import ru.rustore.sdk.review.InterfaceC11804w;
import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: ru.rustore.sdk.review.e */
/* loaded from: classes5.dex */
public final class ServiceConnectionC11786e implements ServiceConnection {

    /* renamed from: a */
    public final Context f11010a;

    /* renamed from: b */
    public final String f11011b;

    /* renamed from: c */
    public final Function1<ReviewInfo, Unit> f11012c;

    /* renamed from: d */
    public final Function1<RuStoreException, Unit> f11013d;

    /* renamed from: ru.rustore.sdk.review.e$a */
    public static final class a extends AbstractBinderC11785d {
        public a() {
        }
    }

    public ServiceConnectionC11786e(Context context, String applicationId, C11799r onSuccess, C11800s onError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f11010a = context;
        this.f11011b = applicationId;
        this.f11012c = onSuccess;
        this.f11013d = onError;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC11804w c11953a;
        try {
            int i = InterfaceC11804w.a.f11040a;
            if (iBinder == null) {
                c11953a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.review.ReviewProvider");
                c11953a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC11804w)) ? new InterfaceC11804w.a.C11953a(iBinder) : (InterfaceC11804w) iInterfaceQueryLocalInterface;
            }
            c11953a.mo7558a(this.f11011b, new a());
        } catch (Exception e) {
            Function1<RuStoreException, Unit> function1 = this.f11013d;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            function1.invoke(new RuStoreException(message));
            ContextExtKt.unbindServiceSafely(this.f11010a, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11013d.invoke(new RuStoreException("onServiceDisconnected"));
        ContextExtKt.unbindServiceSafely(this.f11010a, this);
    }
}
