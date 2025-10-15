package com.google.android.p023a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: BaseProxy.java */
/* renamed from: com.google.android.a.a */
/* loaded from: classes4.dex */
public class C6728a implements IInterface {

    /* renamed from: a */
    public final IBinder f652a;

    /* renamed from: b */
    public final String f653b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    public C6728a(IBinder iBinder) {
        this.f652a = iBinder;
    }

    /* renamed from: a */
    public final Parcel m1038a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f653b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f652a;
    }

    /* renamed from: b */
    public final Parcel m1039b(Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f652a.transact(1, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
