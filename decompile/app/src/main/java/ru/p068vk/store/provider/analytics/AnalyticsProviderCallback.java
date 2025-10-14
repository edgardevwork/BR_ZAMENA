package ru.p068vk.store.provider.analytics;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public interface AnalyticsProviderCallback extends IInterface {
    public static final String DESCRIPTOR = "ru.vk.store.provider.analytics.AnalyticsProviderCallback";

    public static class Default implements AnalyticsProviderCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // ru.p068vk.store.provider.analytics.AnalyticsProviderCallback
        public void onError(int i, String str) throws RemoteException {
        }

        @Override // ru.p068vk.store.provider.analytics.AnalyticsProviderCallback
        public void onSuccess() throws RemoteException {
        }
    }

    void onError(int i, String str) throws RemoteException;

    void onSuccess() throws RemoteException;

    public static abstract class Stub extends Binder implements AnalyticsProviderCallback {
        public static final int TRANSACTION_onError = 2;
        public static final int TRANSACTION_onSuccess = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, AnalyticsProviderCallback.DESCRIPTOR);
        }

        public static AnalyticsProviderCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(AnalyticsProviderCallback.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof AnalyticsProviderCallback)) {
                return (AnalyticsProviderCallback) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(AnalyticsProviderCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(AnalyticsProviderCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onSuccess();
                parcel2.writeNoException();
            } else if (i == 2) {
                onError(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        public static class Proxy implements AnalyticsProviderCallback {
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return AnalyticsProviderCallback.DESCRIPTOR;
            }

            @Override // ru.p068vk.store.provider.analytics.AnalyticsProviderCallback
            public void onSuccess() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AnalyticsProviderCallback.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ru.p068vk.store.provider.analytics.AnalyticsProviderCallback
            public void onError(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AnalyticsProviderCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
