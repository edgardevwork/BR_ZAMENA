package ru.p068vk.store.provider.paytoken;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.connection.ServiceConnectionC11420b;
import ru.rustore.sdk.core.exception.RuStoreApplicationBannedException;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreUserBannedException;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;

/* renamed from: ru.vk.store.provider.paytoken.b */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC11822b extends Binder implements IInterface {
    public AbstractBinderC11822b() {
        attachInterface(this, "ru.vk.store.provider.paytoken.PayTokenProviderCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("ru.vk.store.provider.paytoken.PayTokenProviderCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("ru.vk.store.provider.paytoken.PayTokenProviderCallback");
            return true;
        }
        if (i == 1) {
            String payToken = parcel.readString();
            Intrinsics.checkNotNullParameter(payToken, "payToken");
            ServiceConnectionC11420b.this.f10198c.invoke(payToken);
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int i3 = parcel.readInt();
            String errorMessage = parcel.readString();
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            ServiceConnectionC11420b.this.f10199d.invoke(i3 != 1001 ? i3 != 1004 ? i3 != 1005 ? new RuStoreException(errorMessage) : new RuStoreApplicationBannedException() : new RuStoreUserBannedException() : new RuStoreUserUnauthorizedException());
        }
        parcel2.writeNoException();
        return true;
    }
}
