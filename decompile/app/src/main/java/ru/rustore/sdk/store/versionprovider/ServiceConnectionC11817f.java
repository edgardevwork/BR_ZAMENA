package ru.rustore.sdk.store.versionprovider;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.p068vk.store.sdk.lib.storeversion.aidl.model.StoreVersionInfo;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.store.versionprovider.InterfaceC11816e;

/* renamed from: ru.rustore.sdk.store.versionprovider.f */
/* loaded from: classes5.dex */
public final class ServiceConnectionC11817f implements ServiceConnection {

    /* renamed from: a */
    public final C11813b f11057a;

    /* renamed from: b */
    public final Function1<StoreVersionInfo, Unit> f11058b;

    /* renamed from: c */
    public final Function1<RuStoreException, Unit> f11059c;

    /* renamed from: ru.rustore.sdk.store.versionprovider.f$a */
    public static final class a extends AbstractBinderC11812a {
        public a() {
        }
    }

    public ServiceConnectionC11817f(C11813b storeVersionInfoSerializer, C11814c onSuccess, C11815d onError) {
        Intrinsics.checkNotNullParameter(storeVersionInfoSerializer, "storeVersionInfoSerializer");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f11057a = storeVersionInfoSerializer;
        this.f11058b = onSuccess;
        this.f11059c = onError;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC11816e c11954a;
        Object objM15699constructorimpl;
        int i = InterfaceC11816e.a.f11055a;
        if (iBinder == null) {
            c11954a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.sdk.storeversion.aidl.StoreVersionProvider");
            c11954a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC11816e)) ? new InterfaceC11816e.a.C11954a(iBinder) : (InterfaceC11816e) iInterfaceQueryLocalInterface;
        }
        a aVar = new a();
        try {
            Result.Companion companion = Result.INSTANCE;
            c11954a.mo7560a(aVar);
            objM15699constructorimpl = Result.m15699constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
        if (thM15702exceptionOrNullimpl != null) {
            Function1<RuStoreException, Unit> function1 = this.f11059c;
            String message = thM15702exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            function1.invoke(new RuStoreException(message));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11059c.invoke(new RuStoreException("onServiceDisconnected"));
    }
}
