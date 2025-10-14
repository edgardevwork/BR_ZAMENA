package ru.rustore.sdk.store.versionprovider;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ru.rustore.sdk.store.versionprovider.ServiceConnectionC11817f;

/* renamed from: ru.rustore.sdk.store.versionprovider.e */
/* loaded from: classes5.dex */
public interface InterfaceC11816e extends IInterface {

    /* renamed from: ru.rustore.sdk.store.versionprovider.e$a */
    public static abstract class a extends Binder implements InterfaceC11816e {

        /* renamed from: a */
        public static final /* synthetic */ int f11055a = 0;

        /* renamed from: ru.rustore.sdk.store.versionprovider.e$a$a */
        public static class C11954a implements InterfaceC11816e {

            /* renamed from: a */
            public final IBinder f11056a;

            public C11954a(IBinder iBinder) {
                this.f11056a = iBinder;
            }

            @Override // ru.rustore.sdk.store.versionprovider.InterfaceC11816e
            /* renamed from: a */
            public final void mo7560a(ServiceConnectionC11817f.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("ru.vk.store.sdk.storeversion.aidl.StoreVersionProvider");
                    parcelObtain.writeStrongInterface(aVar);
                    this.f11056a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f11056a;
            }
        }
    }

    /* renamed from: a */
    void mo7560a(ServiceConnectionC11817f.a aVar);
}
