package com.sdkit.paylib.paylibpayment.impl.utls;

import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibToken;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.utls.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8587a {
    /* renamed from: a */
    public static final String m4654a(PaylibToken paylibToken) {
        String strSubstring;
        String rawToken;
        String rawToken2;
        String rawToken3;
        String strSubstring2 = null;
        String rawToken4 = paylibToken != null ? paylibToken.getRawToken() : null;
        String string = "";
        if (rawToken4 != null && rawToken4.length() != 0) {
            Integer numValueOf = (paylibToken == null || (rawToken3 = paylibToken.getRawToken()) == null) ? null : Integer.valueOf(rawToken3.length());
            if (numValueOf != null && numValueOf.intValue() > 16) {
                StringBuilder sb = new StringBuilder();
                if (paylibToken == null || (rawToken2 = paylibToken.getRawToken()) == null) {
                    strSubstring = null;
                } else {
                    strSubstring = rawToken2.substring(0, 8);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                sb.append(strSubstring);
                sb.append("*");
                if (paylibToken != null && (rawToken = paylibToken.getRawToken()) != null) {
                    strSubstring2 = rawToken.substring(numValueOf.intValue() - 8, numValueOf.intValue());
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                sb.append(strSubstring2);
                string = sb.toString();
            }
            Intrinsics.checkNotNullExpressionValue(string, "{\n        val length = t…       \"\"\n        }\n    }");
        }
        return string;
    }
}
