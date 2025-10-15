package ru.p068vk.store.sdk.payment.info.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ru.rustore.sdk.billingclient.impl.data.connection.ServiceConnectionC11419a;

/* renamed from: ru.vk.store.sdk.payment.info.aidl.a */
/* loaded from: classes5.dex */
public interface InterfaceC11825a extends IInterface {

    /* renamed from: ru.vk.store.sdk.payment.info.aidl.a$a */
    public static abstract class a extends Binder implements InterfaceC11825a {

        /* renamed from: a */
        public static final /* synthetic */ int f11066a = 0;

        /* renamed from: ru.vk.store.sdk.payment.info.aidl.a$a$a */
        public static class C11956a implements InterfaceC11825a {

            /* renamed from: a */
            public final IBinder f11067a;

            public C11956a(IBinder iBinder) {
                this.f11067a = iBinder;
            }

            @Override // ru.p068vk.store.sdk.payment.info.aidl.InterfaceC11825a
            /* renamed from: a */
            public final void mo7562a(String str, boolean z, ServiceConnectionC11419a.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("ru.vk.store.sdk.payment.info.aidl.PaymentInfoProvider");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f11067a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f11067a;
            }
        }
    }

    /* renamed from: a */
    void mo7562a(String str, boolean z, ServiceConnectionC11419a.a aVar);
}
