package io.appmetrica.analytics.identifiers.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: io.appmetrica.analytics.identifiers.impl.n */
/* loaded from: classes7.dex */
public abstract class AbstractBinderC8752n extends Binder implements InterfaceC8753o {
    public AbstractBinderC8752n() {
        attachInterface(this, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
    }

    /* renamed from: a */
    public static InterfaceC8753o m4921a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC8753o)) ? new C8751m(iBinder) : (InterfaceC8753o) iInterfaceQueryLocalInterface;
    }

    /* renamed from: a */
    public abstract /* synthetic */ String m4922a() throws RemoteException;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* renamed from: b */
    public abstract /* synthetic */ boolean m4923b() throws RemoteException;

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            String strM4922a = m4922a();
            parcel2.writeNoException();
            parcel2.writeString(strM4922a);
            return true;
        }
        if (i != 2) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            return true;
        }
        parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        boolean zM4923b = m4923b();
        parcel2.writeNoException();
        parcel2.writeInt(zM4923b ? 1 : 0);
        return true;
    }
}
