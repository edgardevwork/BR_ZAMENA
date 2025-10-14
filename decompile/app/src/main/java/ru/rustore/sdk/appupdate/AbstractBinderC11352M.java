package ru.rustore.sdk.appupdate;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.appupdate.ServiceConnectionC11353N;
import ru.rustore.sdk.appupdate.errors.RemoteProviderErrors;
import ru.rustore.sdk.core.util.ContextExtKt;

/* renamed from: ru.rustore.sdk.appupdate.M */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC11352M extends Binder implements IInterface {
    public AbstractBinderC11352M() {
        attachInterface(this, "ru.vk.store.provider.appupdate.CompleteUpdateFlowCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("ru.vk.store.provider.appupdate.CompleteUpdateFlowCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("ru.vk.store.provider.appupdate.CompleteUpdateFlowCallback");
            return true;
        }
        if (i == 1) {
            ServiceConnectionC11353N.a aVar = (ServiceConnectionC11353N.a) this;
            ServiceConnectionC11353N.this.f10047c.invoke();
            ContextExtKt.unbindServiceSafely(ServiceConnectionC11353N.this.f10045a, aVar.f10050b);
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int i3 = parcel.readInt();
            String errorMessage = parcel.readString();
            ServiceConnectionC11353N.a aVar2 = (ServiceConnectionC11353N.a) this;
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            ServiceConnectionC11353N.this.f10048d.invoke(RemoteProviderErrors.INSTANCE.toRuStoreException(i3, errorMessage));
            ContextExtKt.unbindServiceSafely(ServiceConnectionC11353N.this.f10045a, aVar2.f10050b);
        }
        parcel2.writeNoException();
        return true;
    }
}
