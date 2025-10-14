package com.sdkit.paylib.paylibpayment.impl.domain.network.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.utils.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8585b {

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.utils.b$a */
    public static final class a extends Lambda implements Function1 {

        /* renamed from: a */
        public static final a f5785a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(String value) throws UnsupportedEncodingException {
            Intrinsics.checkNotNullParameter(value, "value");
            String strEncode = URLEncoder.encode(value, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(strEncode, "encode(value, \"UTF-8\")");
            return strEncode;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.utils.b$b */
    public static final class b extends Lambda implements Function1 {

        /* renamed from: a */
        public static final b f5786a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(Pair pair) throws UnsupportedEncodingException {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return ((String) pair.component1()) + '=' + URLEncoder.encode((String) pair.component2(), "UTF-8");
        }
    }

    /* renamed from: a */
    public static final String m4648a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, a.f5785a, 30, null);
    }

    /* renamed from: b */
    public static final String m4649b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt___CollectionsKt.joinToString$default(list, "&", null, null, 0, null, b.f5786a, 30, null);
    }
}
