package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* renamed from: io.appmetrica.analytics.impl.B */
/* loaded from: classes6.dex */
public final class C8785B {

    /* renamed from: a */
    public final AdRevenue f6350a;

    /* renamed from: b */
    public final boolean f6351b;

    /* renamed from: c */
    public final C9413am f6352c;

    /* renamed from: d */
    public final C9364Yl f6353d;

    public C8785B(AdRevenue adRevenue, boolean z, PublicLogger publicLogger) {
        this.f6350a = adRevenue;
        this.f6351b = z;
        this.f6352c = new C9413am(100, "ad revenue strings", publicLogger);
        this.f6353d = new C9364Yl(30720, "ad revenue payload", publicLogger);
    }

    /* renamed from: a */
    public final Pair m4980a() {
        C9865t c9865t = new C9865t();
        int length = 0;
        for (Pair pair : CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m7112to(this.f6350a.adNetwork, new C9890u(c9865t)), TuplesKt.m7112to(this.f6350a.adPlacementId, new C9915v(c9865t)), TuplesKt.m7112to(this.f6350a.adPlacementName, new C9940w(c9865t)), TuplesKt.m7112to(this.f6350a.adUnitId, new C9965x(c9865t)), TuplesKt.m7112to(this.f6350a.adUnitName, new C9990y(c9865t)), TuplesKt.m7112to(this.f6350a.precision, new C10015z(c9865t)), TuplesKt.m7112to(this.f6350a.currency.getCurrencyCode(), new C8760A(c9865t))})) {
            String str = (String) pair.getFirst();
            Function1 function1 = (Function1) pair.getSecond();
            C9413am c9413am = this.f6352c;
            c9413am.getClass();
            String strMo5338a = c9413am.mo5338a(str);
            byte[] bArrStringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] bArrStringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(strMo5338a);
            function1.invoke(bArrStringToBytesForProtobuf2);
            length += bArrStringToBytesForProtobuf.length - bArrStringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) AbstractC8810C.f6417a.get(this.f6350a.adType);
        c9865t.f9070d = num != null ? num.intValue() : 0;
        C9840s c9840s = new C9840s();
        BigDecimal bigDecimal = this.f6350a.adRevenue;
        BigInteger bigInteger = AbstractC10023z7.f9394a;
        int i = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(AbstractC10023z7.f9394a) <= 0 && bigIntegerUnscaledValue.compareTo(AbstractC10023z7.f9395b) >= 0) {
                break;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i++;
        }
        Pair pairM7112to = TuplesKt.m7112to(Long.valueOf(bigIntegerUnscaledValue.longValue()), Integer.valueOf(i));
        long jLongValue = ((Number) pairM7112to.getFirst()).longValue();
        int iIntValue = ((Number) pairM7112to.getSecond()).intValue();
        c9840s.f9027a = jLongValue;
        c9840s.f9028b = iIntValue;
        c9865t.f9068b = c9840s;
        Map<String, String> map = this.f6350a.payload;
        if (map != null) {
            String strM5968b = AbstractC9452cb.m5968b(map);
            C9364Yl c9364Yl = this.f6353d;
            c9364Yl.getClass();
            byte[] bArrStringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(c9364Yl.mo5338a(strM5968b));
            c9865t.f9077k = bArrStringToBytesForProtobuf3;
            length += StringUtils.stringToBytesForProtobuf(strM5968b).length - bArrStringToBytesForProtobuf3.length;
        }
        if (this.f6351b) {
            c9865t.f9067a = "autocollected".getBytes(Charsets.UTF_8);
        }
        return TuplesKt.m7112to(MessageNano.toByteArray(c9865t), Integer.valueOf(length));
    }
}
