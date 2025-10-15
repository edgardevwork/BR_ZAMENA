package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;
import kotlin.TuplesKt;

/* renamed from: io.appmetrica.analytics.impl.x7 */
/* loaded from: classes7.dex */
public final class C9973x7 implements ProtobufConverter {
    @NonNull
    /* renamed from: a */
    public final BigDecimal m6958a(@NonNull C9524f8 c9524f8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9524f8 fromModel(@NonNull BigDecimal bigDecimal) {
        BigInteger bigInteger = AbstractC10023z7.f9394a;
        int i = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(AbstractC10023z7.f9394a) <= 0 && bigIntegerUnscaledValue.compareTo(AbstractC10023z7.f9395b) >= 0) {
                Pair pairM7112to = TuplesKt.m7112to(Long.valueOf(bigIntegerUnscaledValue.longValue()), Integer.valueOf(i));
                C9998y7 c9998y7 = new C9998y7(((Number) pairM7112to.getSecond()).intValue(), ((Number) pairM7112to.getFirst()).longValue());
                C9524f8 c9524f8 = new C9524f8();
                c9524f8.f8084a = c9998y7.f9351a;
                c9524f8.f8085b = c9998y7.f9352b;
                return c9524f8;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i++;
        }
    }
}
