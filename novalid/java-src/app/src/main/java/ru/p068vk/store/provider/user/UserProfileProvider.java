package ru.p068vk.store.provider.user;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ru.p068vk.store.provider.user.UserProfileProviderCallback;

/* loaded from: classes5.dex */
public interface UserProfileProvider extends IInterface {
    public static final String DESCRIPTOR = "ru.vk.store.provider.user.UserProfileProvider";

    public static class Default implements UserProfileProvider {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // ru.p068vk.store.provider.user.UserProfileProvider
        public void getUserProfile(String str, UserProfileProviderCallback userProfileProviderCallback) throws RemoteException {
        }
    }

    void getUserProfile(String str, UserProfileProviderCallback userProfileProviderCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements UserProfileProvider {
        public static final int TRANSACTION_getUserProfile = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, UserProfileProvider.DESCRIPTOR);
        }

        public static UserProfileProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(UserProfileProvider.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof UserProfileProvider)) {
                return (UserProfileProvider) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(UserProfileProvider.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(UserProfileProvider.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                getUserProfile(parcel.readString(), UserProfileProviderCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public static class Proxy implements UserProfileProvider {
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return UserProfileProvider.DESCRIPTOR;
            }

            @Override // ru.p068vk.store.provider.user.UserProfileProvider
            public void getUserProfile(String str, UserProfileProviderCallback userProfileProviderCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(UserProfileProvider.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(userProfileProviderCallback);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
