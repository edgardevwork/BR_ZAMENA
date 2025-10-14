package ru.rustore.sdk.review;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.util.ContextExtKt;
import ru.rustore.sdk.review.InterfaceC11804w;
import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: ru.rustore.sdk.review.a */
/* loaded from: classes5.dex */
public final class ServiceConnectionC11782a implements ServiceConnection {

    /* renamed from: a */
    public final Context f11002a;

    /* renamed from: b */
    public final ReviewInfo f11003b;

    /* renamed from: c */
    public final String f11004c;

    /* renamed from: d */
    public final Function0<Unit> f11005d;

    /* renamed from: e */
    public final Function1<RuStoreException, Unit> f11006e;

    /* renamed from: ru.rustore.sdk.review.a$a */
    public static final class a extends AbstractBinderC11783b {
        public a() {
        }
    }

    public ServiceConnectionC11782a(Context context, ReviewInfo reviewInfo, String applicationId, C11795n onSuccess, C11796o onError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f11002a = context;
        this.f11003b = reviewInfo;
        this.f11004c = applicationId;
        this.f11005d = onSuccess;
        this.f11006e = onError;
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
            c11953a.mo7557a(this.f11003b.toBundle$sdk_public_review_release(), this.f11004c, new a());
        } catch (Exception e) {
            Function1<RuStoreException, Unit> function1 = this.f11006e;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            function1.invoke(new RuStoreException(message));
            ContextExtKt.unbindServiceSafely(this.f11002a, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11006e.invoke(new RuStoreException("onServiceDisconnected"));
        ContextExtKt.unbindServiceSafely(this.f11002a, this);
    }
}
