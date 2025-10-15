package ru.rustore.sdk.appupdate;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.appupdate.ServiceConnectionC11355P;
import ru.rustore.sdk.appupdate.errors.RemoteProviderErrors;
import ru.rustore.sdk.core.util.ContextExtKt;

/* renamed from: ru.rustore.sdk.appupdate.O */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC11354O extends Binder implements IInterface {
    public AbstractBinderC11354O() {
        attachInterface(this, "ru.vk.store.provider.appupdate.GetAppUpdateInfoCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("ru.vk.store.provider.appupdate.GetAppUpdateInfoCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("ru.vk.store.provider.appupdate.GetAppUpdateInfoCallback");
            return true;
        }
        if (i == 1) {
            Bundle updateInfoBundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
            ServiceConnectionC11355P.a aVar = (ServiceConnectionC11355P.a) this;
            Intrinsics.checkNotNullParameter(updateInfoBundle, "updateInfoBundle");
            ServiceConnectionC11355P.this.f10055e.invoke(ServiceConnectionC11355P.this.f10052b.m7435a(updateInfoBundle));
            ContextExtKt.unbindServiceSafely(ServiceConnectionC11355P.this.f10051a, aVar.f10058b);
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int i3 = parcel.readInt();
            String errorMessage = parcel.readString();
            ServiceConnectionC11355P.a aVar2 = (ServiceConnectionC11355P.a) this;
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            ServiceConnectionC11355P.this.f10056f.invoke(RemoteProviderErrors.INSTANCE.toRuStoreException(i3, errorMessage));
            ContextExtKt.unbindServiceSafely(ServiceConnectionC11355P.this.f10051a, aVar2.f10058b);
        }
        parcel2.writeNoException();
        return true;
    }
}
