package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p023a.BinderC6729b;
import com.google.android.p023a.C6728a;
import com.google.android.p023a.C6730c;

/* loaded from: classes4.dex */
public interface IGetInstallReferrerService extends IInterface {

    /* loaded from: classes6.dex */
    public static abstract class Stub extends BinderC6729b implements IGetInstallReferrerService {

        public static class Proxy extends C6728a implements IGetInstallReferrerService {
            public Proxy(IBinder iBinder) {
                super(iBinder);
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            /* renamed from: c */
            public final Bundle mo1053c(Bundle bundle) throws RemoteException {
                Parcel parcelM1038a = m1038a();
                C6730c.m1042b(parcelM1038a, bundle);
                Parcel parcelM1039b = m1039b(parcelM1038a);
                Bundle bundle2 = (Bundle) C6730c.m1041a(parcelM1039b, Bundle.CREATOR);
                parcelM1039b.recycle();
                return bundle2;
            }
        }

        /* renamed from: b */
        public static IGetInstallReferrerService m1054b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof IGetInstallReferrerService ? (IGetInstallReferrerService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.p023a.BinderC6729b
        /* renamed from: a */
        public final boolean mo1040a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Bundle bundleMo1053c = mo1053c((Bundle) C6730c.m1041a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            C6730c.m1043c(parcel2, bundleMo1053c);
            return true;
        }
    }

    /* renamed from: c */
    Bundle mo1053c(Bundle bundle) throws RemoteException;
}
