package ru.rustore.sdk.appupdate;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ru.rustore.sdk.appupdate.g0 */
/* loaded from: classes6.dex */
public interface InterfaceC11379g0 extends IInterface {

    /* renamed from: ru.rustore.sdk.appupdate.g0$a */
    /* loaded from: classes8.dex */
    public static abstract class a extends Binder implements InterfaceC11379g0 {
        public a() {
            attachInterface(this, "ru.vk.store.provider.appupdate.StartUpdateFlowCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("ru.vk.store.provider.appupdate.StartUpdateFlowCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("ru.vk.store.provider.appupdate.StartUpdateFlowCallback");
                return true;
            }
            if (i == 1) {
                mo7432a();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                mo7433a(parcel.readInt(), parcel.readString());
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo7432a();

    /* renamed from: a */
    void mo7433a(int i, String str);
}
