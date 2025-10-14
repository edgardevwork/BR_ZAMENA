package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.identifiers.impl.q */
/* loaded from: classes7.dex */
public final class C8755q implements InterfaceC8740b {

    /* renamed from: a */
    public final C8744f f6293a;

    @VisibleForTesting
    public C8755q(@NotNull C8744f c8744f) {
        this.f6293a = c8744f;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.InterfaceC8740b
    @NotNull
    /* renamed from: a */
    public final C8741c mo4914a(@NotNull Context context) {
        C8741c c8741c;
        try {
            try {
                try {
                    try {
                        C8741c c8741cM4924b = m4924b(context);
                        try {
                            this.f6293a.m4917b(context);
                            return c8741cM4924b;
                        } catch (Throwable unused) {
                            return c8741cM4924b;
                        }
                    } catch (C8750l e) {
                        String message = e.getMessage();
                        if (message == null) {
                            message = "No yandex adv_id service";
                        }
                        c8741c = new C8741c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message, 2);
                        this.f6293a.m4917b(context);
                        return c8741c;
                    } catch (Throwable th) {
                        return new C8741c(IdentifierStatus.UNKNOWN, null, "exception while fetching yandex adv_id: " + th.getMessage(), 2);
                    }
                } catch (C8745g e2) {
                    String message2 = e2.getMessage();
                    if (message2 == null) {
                        message2 = "unknown exception while binding yandex adv_id service";
                    }
                    c8741c = new C8741c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message2, 2);
                    this.f6293a.m4917b(context);
                    return c8741c;
                }
            } catch (Throwable unused2) {
                return c8741c;
            }
        } finally {
            try {
                this.f6293a.m4917b(context);
            } catch (Throwable unused3) {
            }
        }
    }

    /* renamed from: b */
    public final C8741c m4924b(Context context) {
        C8757s c8757s = (C8757s) ((InterfaceC8759u) this.f6293a.m4916a(context));
        c8757s.getClass();
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            c8757s.f6295a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            String string = parcelObtain2.readString();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            parcelObtain = Parcel.obtain();
            parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
                c8757s.f6295a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                boolean z = parcelObtain2.readInt() != 0;
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return new C8741c(IdentifierStatus.OK, new C8739a("yandex", string, Boolean.valueOf(z)), null, 4);
            } finally {
            }
        } finally {
        }
    }

    public C8755q() {
        this(new C8744f(AbstractC8756r.f6294a, C8754p.f6292a, "yandex"));
    }
}
