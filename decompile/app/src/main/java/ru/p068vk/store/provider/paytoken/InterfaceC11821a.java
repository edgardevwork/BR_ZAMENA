package ru.p068vk.store.provider.paytoken;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ru.rustore.sdk.billingclient.impl.data.connection.ServiceConnectionC11420b;

/* renamed from: ru.vk.store.provider.paytoken.a */
/* loaded from: classes5.dex */
public interface InterfaceC11821a extends IInterface {

    /* renamed from: ru.vk.store.provider.paytoken.a$a */
    public static abstract class a extends Binder implements InterfaceC11821a {

        /* renamed from: a */
        public static final /* synthetic */ int f11061a = 0;

        /* renamed from: ru.vk.store.provider.paytoken.a$a$a */
        public static class C11955a implements InterfaceC11821a {

            /* renamed from: a */
            public final IBinder f11062a;

            public C11955a(IBinder iBinder) {
                this.f11062a = iBinder;
            }

            @Override // ru.p068vk.store.provider.paytoken.InterfaceC11821a
            /* renamed from: a */
            public final void mo7561a(String str, boolean z, ServiceConnectionC11420b.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("ru.vk.store.provider.paytoken.PayTokenProvider");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f11062a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f11062a;
            }
        }
    }

    /* renamed from: a */
    void mo7561a(String str, boolean z, ServiceConnectionC11420b.a aVar);
}
