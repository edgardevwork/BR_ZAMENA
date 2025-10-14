package com.sdkit.paylib.paylibpayment.impl.domain.network.data;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.o */
/* loaded from: classes8.dex */
public final class C8544o {

    /* renamed from: a */
    public static final C8544o f4976a = new C8544o();

    /* renamed from: a */
    public final String m4096a(int i) {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        StringBuilder sb = new StringBuilder();
        int length = string.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = string.charAt(i2);
            if (cCharAt != '-') {
                sb.append(cCharAt);
            }
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "filterTo(StringBuilder(), predicate).toString()");
        return StringsKt___StringsKt.take(string2, i);
    }
}
