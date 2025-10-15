package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.math.BigDecimal;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes7.dex */
public class BigDecimalMath {
    public static double roundToDouble(BigDecimal x, RoundingMode mode) {
        return BigDecimalToDoubleRounder.INSTANCE.roundToDouble(x, mode);
    }

    /* loaded from: classes6.dex */
    public static class BigDecimalToDoubleRounder extends ToDoubleRounder<BigDecimal> {
        public static final BigDecimalToDoubleRounder INSTANCE = new BigDecimalToDoubleRounder();

        @Override // com.google.common.math.ToDoubleRounder
        public double roundToDoubleArbitrarily(BigDecimal bigDecimal) {
            return bigDecimal.doubleValue();
        }

        @Override // com.google.common.math.ToDoubleRounder
        public int sign(BigDecimal bigDecimal) {
            return bigDecimal.signum();
        }

        @Override // com.google.common.math.ToDoubleRounder
        public BigDecimal toX(double d, RoundingMode mode) {
            return new BigDecimal(d);
        }

        @Override // com.google.common.math.ToDoubleRounder
        public BigDecimal minus(BigDecimal a2, BigDecimal b) {
            return a2.subtract(b);
        }
    }
}
