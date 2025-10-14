package ru.p068vk.store.provider.analytics;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import ru.p068vk.store.provider.analytics.AnalyticsProviderCallback;

/* loaded from: classes5.dex */
public interface AnalyticsProvider extends IInterface {
    public static final String DESCRIPTOR = "ru.vk.store.provider.analytics.AnalyticsProvider";

    public static class Default implements AnalyticsProvider {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // ru.p068vk.store.provider.analytics.AnalyticsProvider
        public void postAnalytcsEvent(String str, String str2, Bundle bundle, AnalyticsProviderCallback analyticsProviderCallback) throws RemoteException {
        }
    }

    void postAnalytcsEvent(String str, String str2, Bundle bundle, AnalyticsProviderCallback analyticsProviderCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements AnalyticsProvider {
        public static final int TRANSACTION_postAnalytcsEvent = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, AnalyticsProvider.DESCRIPTOR);
        }

        public static AnalyticsProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(AnalyticsProvider.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof AnalyticsProvider)) {
                return (AnalyticsProvider) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(AnalyticsProvider.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(AnalyticsProvider.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                postAnalytcsEvent(parcel.readString(), parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), AnalyticsProviderCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public static class Proxy implements AnalyticsProvider {
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return AnalyticsProvider.DESCRIPTOR;
            }

            @Override // ru.p068vk.store.provider.analytics.AnalyticsProvider
            public void postAnalytcsEvent(String str, String str2, Bundle bundle, AnalyticsProviderCallback analyticsProviderCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AnalyticsProvider.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeStrongInterface(analyticsProviderCallback);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class _Parcel {
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
