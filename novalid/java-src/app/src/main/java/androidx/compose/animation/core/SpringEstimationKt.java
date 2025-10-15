package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SpringEstimation.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000b\u001a(\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a8\u0010\u0011\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a0\u0010\u0014\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a(\u0010\u0015\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a9\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0019H\u0082\b\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0003H\u0082\b¨\u0006\u001d"}, m7105d2 = {"estimateAnimationDurationMillis", "", "stiffness", "", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "springConstant", "dampingCoefficient", "mass", "", "estimateCriticallyDamped", "firstRoot", "Landroidx/compose/animation/core/ComplexDouble;", "p0", "v0", "estimateDurationInternal", "secondRoot", "initialPosition", "estimateOverDamped", "estimateUnderDamped", "iterateNewtonsMethod", "x", "fn", "Lkotlin/Function1;", "fnPrime", "isNotFinite", "", "animation-core_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 3 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,329:1\n328#1:362\n328#1:363\n324#1:364\n328#1:365\n328#1:366\n324#1:367\n103#2:330\n107#2:336\n103#2:340\n103#2:346\n107#2:352\n103#2:356\n35#3,2:331\n54#3,3:333\n66#3,3:337\n35#3,2:341\n54#3,3:343\n35#3,2:347\n54#3,3:349\n66#3,3:353\n35#3,2:357\n54#3,3:359\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n149#1:362\n150#1:363\n188#1:364\n221#1:365\n222#1:366\n266#1:367\n59#1:330\n60#1:336\n60#1:340\n90#1:346\n91#1:352\n91#1:356\n59#1:331,2\n59#1:333,3\n60#1:337,3\n60#1:341,2\n60#1:343,3\n90#1:347,2\n90#1:349,3\n91#1:353,3\n91#1:357,2\n91#1:359,3\n*E\n"})
/* loaded from: classes.dex */
public final class SpringEstimationKt {
    public static final long estimateAnimationDurationMillis(float f, float f2, float f3, float f4, float f5) {
        return estimateAnimationDurationMillis(f, f2, f3, f4, f5);
    }

    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5) {
        double dSqrt = 2.0d * d2 * Math.sqrt(d);
        double d6 = (dSqrt * dSqrt) - (4.0d * d);
        double d7 = -dSqrt;
        ComplexDouble complexDoubleComplexSqrt = ComplexDoubleKt.complexSqrt(d6);
        complexDoubleComplexSqrt._real += d7;
        complexDoubleComplexSqrt._real *= 0.5d;
        complexDoubleComplexSqrt._imaginary *= 0.5d;
        ComplexDouble complexDoubleComplexSqrt2 = ComplexDoubleKt.complexSqrt(d6);
        double d8 = -1;
        complexDoubleComplexSqrt2._real *= d8;
        complexDoubleComplexSqrt2._imaginary *= d8;
        complexDoubleComplexSqrt2._real += d7;
        complexDoubleComplexSqrt2._real *= 0.5d;
        complexDoubleComplexSqrt2._imaginary *= 0.5d;
        return estimateDurationInternal(complexDoubleComplexSqrt, complexDoubleComplexSqrt2, d2, d3, d4, d5);
    }

    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5, double d6) {
        double dSqrt = d2 / (Math.sqrt(d * d3) * 2.0d);
        double d7 = (d2 * d2) - ((4.0d * d3) * d);
        double d8 = 1.0d / (2.0d * d3);
        double d9 = -d2;
        ComplexDouble complexDoubleComplexSqrt = ComplexDoubleKt.complexSqrt(d7);
        complexDoubleComplexSqrt._real += d9;
        complexDoubleComplexSqrt._real *= d8;
        complexDoubleComplexSqrt._imaginary *= d8;
        ComplexDouble complexDoubleComplexSqrt2 = ComplexDoubleKt.complexSqrt(d7);
        double d10 = -1;
        complexDoubleComplexSqrt2._real *= d10;
        complexDoubleComplexSqrt2._imaginary *= d10;
        complexDoubleComplexSqrt2._real += d9;
        complexDoubleComplexSqrt2._real *= d8;
        complexDoubleComplexSqrt2._imaginary *= d8;
        return estimateDurationInternal(complexDoubleComplexSqrt, complexDoubleComplexSqrt2, dSqrt, d4, d5, d6);
    }

    private static final double estimateUnderDamped(ComplexDouble complexDouble, double d, double d2, double d3) {
        double real = complexDouble.getReal();
        double imaginary = (d2 - (real * d)) / complexDouble.getImaginary();
        return Math.log(d3 / Math.sqrt((d * d) + (imaginary * imaginary))) / real;
    }

    private static final double estimateCriticallyDamped(ComplexDouble complexDouble, double d, double d2, double d3) {
        double d4 = d3;
        double real = complexDouble.getReal();
        double d5 = real * d;
        double d6 = d2 - d5;
        double dLog = Math.log(Math.abs(d4 / d)) / real;
        double dLog2 = Math.log(Math.abs(d4 / d6));
        double dLog3 = dLog2;
        for (int i = 0; i < 6; i++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / real));
        }
        double d7 = dLog3 / real;
        if (!((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true)) {
            dLog = d7;
        } else if (!(!((Double.isInfinite(d7) || Double.isNaN(d7)) ? false : true))) {
            dLog = Math.max(dLog, d7);
        }
        double d8 = (-(d5 + d6)) / (real * d6);
        double d9 = real * d8;
        double dExp = (Math.exp(d9) * d) + (d6 * d8 * Math.exp(d9));
        if (Double.isNaN(d8) || d8 <= 0.0d) {
            d4 = -d4;
        } else if (d8 <= 0.0d || (-dExp) >= d4) {
            dLog = (-(2.0d / real)) - (d / d6);
        } else {
            if (d6 < 0.0d && d > 0.0d) {
                dLog = 0.0d;
            }
            d4 = -d4;
        }
        double dAbs = Double.MAX_VALUE;
        int i2 = 0;
        while (dAbs > 0.001d && i2 < 100) {
            i2++;
            double d10 = real * dLog;
            double d11 = d4;
            double dExp2 = dLog - ((((d + (d6 * dLog)) * Math.exp(d10)) + d4) / ((((1 + d10) * d6) + d5) * Math.exp(d10)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d4 = d11;
        }
        return dLog;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final double estimateOverDamped(ComplexDouble complexDouble, ComplexDouble complexDouble2, double d, double d2, double d3) {
        double dLog;
        double d4;
        double d5;
        double d6 = d3;
        double real = complexDouble.getReal();
        double real2 = complexDouble2.getReal();
        double d7 = real - real2;
        double d8 = ((real * d) - d2) / d7;
        double d9 = d - d8;
        double dLog2 = Math.log(Math.abs(d6 / d9)) / real;
        double dLog3 = Math.log(Math.abs(d6 / d8)) / real2;
        if (!((Double.isInfinite(dLog2) || Double.isNaN(dLog2)) ? false : true)) {
            dLog = dLog3;
        } else {
            if (!(!((Double.isInfinite(dLog3) || Double.isNaN(dLog3)) ? false : true))) {
                dLog2 = Math.max(dLog2, dLog3);
            }
            dLog = dLog2;
        }
        double d10 = d9 * real;
        double dLog4 = Math.log(d10 / ((-d8) * real2)) / (real2 - real);
        if (!Double.isNaN(dLog4) && dLog4 > 0.0d) {
            if (dLog4 > 0.0d) {
                d4 = d8;
                if ((-estimateOverDamped$xInflection(d9, real, dLog4, d8, real2)) < d6) {
                    if (d4 > 0.0d && d9 < 0.0d) {
                        dLog = 0.0d;
                    }
                }
            } else {
                d4 = d8;
            }
            dLog = Math.log((-((d4 * real2) * real2)) / (d10 * real)) / d7;
            d5 = d4 * real2;
            if (Math.abs((Math.exp(real * dLog) * d10) + (Math.exp(real2 * dLog) * d5)) >= 1.0E-4d) {
                return dLog;
            }
            double d11 = Double.MAX_VALUE;
            int i = 0;
            while (d11 > 0.001d && i < 100) {
                i++;
                double d12 = real * dLog;
                double d13 = real2 * dLog;
                double dExp = dLog - ((((Math.exp(d12) * d9) + (Math.exp(d13) * d4)) + d6) / ((Math.exp(d12) * d10) + (Math.exp(d13) * d5)));
                double dAbs = Math.abs(dLog - dExp);
                dLog = dExp;
                d11 = dAbs;
            }
            return dLog;
        }
        d4 = d8;
        d6 = -d6;
        d5 = d4 * real2;
        if (Math.abs((Math.exp(real * dLog) * d10) + (Math.exp(real2 * dLog) * d5)) >= 1.0E-4d) {
        }
    }

    private static final double estimateOverDamped$xInflection(double d, double d2, double d3, double d4, double d5) {
        return (d * Math.exp(d2 * d3)) + (d4 * Math.exp(d5 * d3));
    }

    private static final long estimateDurationInternal(ComplexDouble complexDouble, ComplexDouble complexDouble2, double d, double d2, double d3, double d4) {
        double dEstimateCriticallyDamped;
        double d5 = d2;
        if (d3 == 0.0d && d5 == 0.0d) {
            return 0L;
        }
        if (d3 < 0.0d) {
            d5 = -d5;
        }
        double dAbs = Math.abs(d3);
        if (d > 1.0d) {
            dEstimateCriticallyDamped = estimateOverDamped(complexDouble, complexDouble2, dAbs, d5, d4);
        } else if (d < 1.0d) {
            dEstimateCriticallyDamped = estimateUnderDamped(complexDouble, dAbs, d5, d4);
        } else {
            dEstimateCriticallyDamped = estimateCriticallyDamped(complexDouble, dAbs, d5, d4);
        }
        return (long) (dEstimateCriticallyDamped * 1000.0d);
    }

    private static final double iterateNewtonsMethod(double d, Function1<? super Double, Double> function1, Function1<? super Double, Double> function12) {
        return d - (function1.invoke(Double.valueOf(d)).doubleValue() / function12.invoke(Double.valueOf(d)).doubleValue());
    }

    private static final boolean isNotFinite(double d) {
        return !((Double.isInfinite(d) || Double.isNaN(d)) ? false : true);
    }
}
