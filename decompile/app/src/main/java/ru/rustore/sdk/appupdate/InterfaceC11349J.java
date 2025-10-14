package ru.rustore.sdk.appupdate;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ru.rustore.sdk.appupdate.ServiceConnectionC11353N;
import ru.rustore.sdk.appupdate.ServiceConnectionC11355P;
import ru.rustore.sdk.appupdate.ServiceConnectionC11377f0;
import ru.rustore.sdk.appupdate.ServiceConnectionC11381h0;

/* renamed from: ru.rustore.sdk.appupdate.J */
/* loaded from: classes6.dex */
public interface InterfaceC11349J extends IInterface {

    /* renamed from: ru.rustore.sdk.appupdate.J$a */
    /* loaded from: classes8.dex */
    public static abstract class a extends Binder implements InterfaceC11349J {

        /* renamed from: ru.rustore.sdk.appupdate.J$a$a */
        public static class C11951a implements InterfaceC11349J {

            /* renamed from: a */
            public final IBinder f10040a;

            public C11951a(IBinder iBinder) {
                this.f10040a = iBinder;
            }

            @Override // ru.rustore.sdk.appupdate.InterfaceC11349J
            /* renamed from: a */
            public final void mo7423a(String str, ServiceConnectionC11353N.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("ru.vk.store.provider.appupdate.AppUpdateProvider");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f10040a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f10040a;
            }

            @Override // ru.rustore.sdk.appupdate.InterfaceC11349J
            /* renamed from: a */
            public final void mo7422a(String str, Bundle bundle, ServiceConnectionC11355P.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("ru.vk.store.provider.appupdate.AppUpdateProvider");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongInterface(aVar);
                    this.f10040a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // ru.rustore.sdk.appupdate.InterfaceC11349J
            /* renamed from: a */
            public final void mo7425a(String str, ServiceConnectionC11381h0.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("ru.vk.store.provider.appupdate.AppUpdateProvider");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f10040a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ru.rustore.sdk.appupdate.InterfaceC11349J
            /* renamed from: a */
            public final void mo7424a(String str, ServiceConnectionC11377f0.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("ru.vk.store.provider.appupdate.AppUpdateProvider");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f10040a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static InterfaceC11349J m7426a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.appupdate.AppUpdateProvider");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC11349J)) ? new C11951a(iBinder) : (InterfaceC11349J) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo7422a(String str, Bundle bundle, ServiceConnectionC11355P.a aVar);

    /* renamed from: a */
    void mo7423a(String str, ServiceConnectionC11353N.a aVar);

    /* renamed from: a */
    void mo7424a(String str, ServiceConnectionC11377f0.a aVar);

    /* renamed from: a */
    void mo7425a(String str, ServiceConnectionC11381h0.a aVar);
}
