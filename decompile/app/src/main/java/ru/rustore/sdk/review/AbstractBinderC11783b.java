package ru.rustore.sdk.review;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.media3.common.PlaybackException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.rustore.sdk.core.exception.RuStoreApplicationBannedException;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreUserBannedException;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;
import ru.rustore.sdk.core.util.ContextExtKt;
import ru.rustore.sdk.review.ServiceConnectionC11782a;
import ru.rustore.sdk.review.errors.RuStoreInvalidReviewInfo;
import ru.rustore.sdk.review.errors.RuStoreRequestLimitReached;
import ru.rustore.sdk.review.errors.RuStoreReviewExists;

/* renamed from: ru.rustore.sdk.review.b */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC11783b extends Binder implements IInterface {
    public AbstractBinderC11783b() {
        attachInterface(this, "ru.vk.store.provider.review.LaunchReviewFlowCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        RuStoreException ruStoreUserUnauthorizedException;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("ru.vk.store.provider.review.LaunchReviewFlowCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("ru.vk.store.provider.review.LaunchReviewFlowCallback");
            return true;
        }
        if (i == 1) {
            ServiceConnectionC11782a.a aVar = (ServiceConnectionC11782a.a) this;
            ServiceConnectionC11782a.this.f11005d.invoke();
            ServiceConnectionC11782a serviceConnectionC11782a = ServiceConnectionC11782a.this;
            ContextExtKt.unbindServiceSafely(serviceConnectionC11782a.f11002a, serviceConnectionC11782a);
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int i3 = parcel.readInt();
            String string = parcel.readString();
            ServiceConnectionC11782a.a aVar2 = (ServiceConnectionC11782a.a) this;
            Function1<RuStoreException, Unit> function1 = ServiceConnectionC11782a.this.f11006e;
            if (i3 == 1001) {
                ruStoreUserUnauthorizedException = new RuStoreUserUnauthorizedException();
            } else if (i3 == 1004) {
                ruStoreUserUnauthorizedException = new RuStoreUserBannedException();
            } else if (i3 != 1005) {
                switch (i3) {
                    case PlaybackException.ERROR_CODE_PARSING_CONTAINER_MALFORMED /* 3001 */:
                        ruStoreUserUnauthorizedException = new RuStoreRequestLimitReached();
                        break;
                    case PlaybackException.ERROR_CODE_PARSING_MANIFEST_MALFORMED /* 3002 */:
                        ruStoreUserUnauthorizedException = new RuStoreReviewExists();
                        break;
                    case PlaybackException.ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED /* 3003 */:
                        ruStoreUserUnauthorizedException = new RuStoreInvalidReviewInfo();
                        break;
                    default:
                        if (string == null) {
                            string = "";
                        }
                        ruStoreUserUnauthorizedException = new RuStoreException(string);
                        break;
                }
            } else {
                ruStoreUserUnauthorizedException = new RuStoreApplicationBannedException();
            }
            function1.invoke(ruStoreUserUnauthorizedException);
            ServiceConnectionC11782a serviceConnectionC11782a2 = ServiceConnectionC11782a.this;
            ContextExtKt.unbindServiceSafely(serviceConnectionC11782a2.f11002a, serviceConnectionC11782a2);
        }
        parcel2.writeNoException();
        return true;
    }
}
