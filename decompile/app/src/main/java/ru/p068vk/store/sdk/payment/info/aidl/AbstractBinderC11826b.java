package ru.p068vk.store.sdk.payment.info.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ru.p068vk.store.sdk.lib.payment.info.aidl.model.C11824a;
import ru.rustore.sdk.billingclient.impl.data.connection.ServiceConnectionC11419a;
import ru.rustore.sdk.core.exception.RuStoreApplicationBannedException;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreUserBannedException;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;

/* renamed from: ru.vk.store.sdk.payment.info.aidl.b */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC11826b extends Binder implements IInterface {
    public AbstractBinderC11826b() {
        attachInterface(this, "ru.vk.store.sdk.payment.info.aidl.PaymentInfoProviderCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("ru.vk.store.sdk.payment.info.aidl.PaymentInfoProviderCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("ru.vk.store.sdk.payment.info.aidl.PaymentInfoProviderCallback");
            return true;
        }
        if (i == 1) {
            String rawPaymentInfo = parcel.readString();
            Intrinsics.checkNotNullParameter(rawPaymentInfo, "rawPaymentInfo");
            ServiceConnectionC11419a serviceConnectionC11419a = ServiceConnectionC11419a.this;
            Function1<C11824a, Unit> function1 = serviceConnectionC11419a.f10193d;
            serviceConnectionC11419a.f10192c.getClass();
            try {
                JSONObject jSONObject = new JSONObject(rawPaymentInfo);
                C11824a c11824a = new C11824a(jSONObject.getString("PAY_TOKEN_KEY"), jSONObject.getString("BASE_URL_KEY"), jSONObject.getBoolean("SANDBOX_ENABLED_KEY"));
                Intrinsics.checkNotNullExpressionValue(c11824a, "payInfoSerializer.fromJson(rawPaymentInfo)");
                function1.invoke(c11824a);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int i3 = parcel.readInt();
            String errorMessage = parcel.readString();
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            ServiceConnectionC11419a.this.f10194e.invoke(i3 != 1001 ? i3 != 1004 ? i3 != 1005 ? new RuStoreException(errorMessage) : new RuStoreApplicationBannedException() : new RuStoreUserBannedException() : new RuStoreUserUnauthorizedException());
        }
        parcel2.writeNoException();
        return true;
    }
}
