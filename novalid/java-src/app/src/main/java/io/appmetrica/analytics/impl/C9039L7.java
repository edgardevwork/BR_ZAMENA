package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;

/* renamed from: io.appmetrica.analytics.impl.L7 */
/* loaded from: classes8.dex */
public final class C9039L7 {

    /* renamed from: a */
    public final Context f6924a;

    /* renamed from: b */
    public final C9198S f6925b;

    /* renamed from: c */
    public final C9443c2 f6926c;

    public C9039L7(Context context, C9198S c9198s, C9443c2 c9443c2) {
        this.f6924a = context;
        this.f6925b = c9198s;
        this.f6926c = c9443c2;
    }

    /* renamed from: a */
    public final String m5346a() {
        byte[] bArrDigest;
        AdTrackingInfoResult yandex = this.f6925b.mo5536a(this.f6924a, new C8982Im(5, 500)).getYandex();
        if (!yandex.isValid()) {
            String id = this.f6926c.getAppSetId().getId();
            if (id != null && id.length() != 0) {
                try {
                    UUID.fromString(id);
                    if (!Intrinsics.areEqual(id, "00000000-0000-0000-0000-000000000000")) {
                        return StringsKt__StringsJVMKt.replace$default(id, "-", "", false, 4, (Object) null);
                    }
                } catch (Throwable unused) {
                }
            }
            return StringsKt__StringsJVMKt.replace$default(UUID.randomUUID().toString(), "-", "", false, 4, (Object) null).toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        Intrinsics.checkNotNull(adTrackingInfo);
        String str = adTrackingInfo.advId;
        Intrinsics.checkNotNull(str);
        try {
            bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(Charsets.UTF_8));
        } catch (NoSuchAlgorithmException unused2) {
            bArrDigest = new byte[0];
        }
        return StringUtils.toHexString(bArrDigest);
    }

    public C9039L7(Context context) {
        this(context, C9676la.m6362h().m6385v(), C9676la.m6362h().m6366b());
    }
}
