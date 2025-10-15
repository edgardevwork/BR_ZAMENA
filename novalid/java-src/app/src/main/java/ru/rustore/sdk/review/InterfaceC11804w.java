package ru.rustore.sdk.review;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ru.rustore.sdk.review.ServiceConnectionC11782a;
import ru.rustore.sdk.review.ServiceConnectionC11786e;

/* renamed from: ru.rustore.sdk.review.w */
/* loaded from: classes5.dex */
public interface InterfaceC11804w extends IInterface {

    /* renamed from: ru.rustore.sdk.review.w$a */
    public static abstract class a extends Binder implements InterfaceC11804w {

        /* renamed from: a */
        public static final /* synthetic */ int f11040a = 0;

        /* renamed from: ru.rustore.sdk.review.w$a$a */
        public static class C11953a implements InterfaceC11804w {

            /* renamed from: a */
            public final IBinder f11041a;

            public C11953a(IBinder iBinder) {
                this.f11041a = iBinder;
            }

            @Override // ru.rustore.sdk.review.InterfaceC11804w
            /* renamed from: a */
            public final void mo7557a(Bundle bundle, String str, ServiceConnectionC11782a.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("ru.vk.store.provider.review.ReviewProvider");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f11041a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f11041a;
            }

            @Override // ru.rustore.sdk.review.InterfaceC11804w
            /* renamed from: a */
            public final void mo7558a(String str, ServiceConnectionC11786e.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("ru.vk.store.provider.review.ReviewProvider");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f11041a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* renamed from: a */
    void mo7557a(Bundle bundle, String str, ServiceConnectionC11782a.a aVar);

    /* renamed from: a */
    void mo7558a(String str, ServiceConnectionC11786e.a aVar);
}
