package ru.rustore.sdk.store.versionprovider;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ru.p068vk.store.sdk.lib.storeversion.aidl.model.StoreVersionInfo;

/* renamed from: ru.rustore.sdk.store.versionprovider.a */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC11812a extends Binder implements IInterface {
    public AbstractBinderC11812a() {
        attachInterface(this, "ru.vk.store.sdk.storeversion.aidl.GetVersionInfoCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("ru.vk.store.sdk.storeversion.aidl.GetVersionInfoCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("ru.vk.store.sdk.storeversion.aidl.GetVersionInfoCallback");
            return true;
        }
        if (i == 1) {
            String rawVersionInfo = parcel.readString();
            Intrinsics.checkNotNullParameter(rawVersionInfo, "rawVersionInfo");
            ServiceConnectionC11817f serviceConnectionC11817f = ServiceConnectionC11817f.this;
            Function1<StoreVersionInfo, Unit> function1 = serviceConnectionC11817f.f11058b;
            serviceConnectionC11817f.f11057a.getClass();
            try {
                JSONObject jSONObject = new JSONObject(rawVersionInfo);
                StoreVersionInfo storeVersionInfo = new StoreVersionInfo(jSONObject.getString("NAME_KEY"), Long.valueOf(jSONObject.getLong("CODE_KEY")));
                Intrinsics.checkNotNullExpressionValue(storeVersionInfo, "storeVersionInfoSerializ….fromJson(rawVersionInfo)");
                function1.invoke(storeVersionInfo);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.readInt();
            String errorMessage = parcel.readString();
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            ServiceConnectionC11817f.this.f11059c.invoke(new GetStoreVersionInfoException(errorMessage));
        }
        parcel2.writeNoException();
        return true;
    }
}
