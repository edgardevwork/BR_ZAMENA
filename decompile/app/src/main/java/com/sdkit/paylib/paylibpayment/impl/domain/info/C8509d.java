package com.sdkit.paylib.paylibpayment.impl.domain.info;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.info.d */
/* loaded from: classes8.dex */
public final class C8509d {

    /* renamed from: b */
    public static final a f4830b = new a(null);

    /* renamed from: a */
    public final SharedPreferences f4831a;

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.info.d$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C8509d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4831a = context.getSharedPreferences("paylib.payment.device_id_storage", 0);
    }

    /* renamed from: a */
    public final String m3949a() {
        String string = this.f4831a.getString("device_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.f4831a.edit().putString("device_id", string2).apply();
        Intrinsics.checkNotNullExpressionValue(string2, "randomUUID().toString()\n…ICE_ID_KEY, it).apply() }");
        return string2;
    }
}
