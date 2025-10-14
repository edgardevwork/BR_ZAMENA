package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.math.LongMath;
import com.google.common.util.concurrent.RateLimiter;
import java.util.concurrent.TimeUnit;

@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes7.dex */
public abstract class SmoothRateLimiter extends RateLimiter {
    public double maxPermits;
    public long nextFreeTicketMicros;
    public double stableIntervalMicros;
    public double storedPermits;

    public abstract double coolDownIntervalMicros();

    public abstract void doSetRate(double permitsPerSecond, double stableIntervalMicros);

    public abstract long storedPermitsToWaitTime(double storedPermits, double permitsToTake);

    public /* synthetic */ SmoothRateLimiter(RateLimiter.SleepingStopwatch sleepingStopwatch, C76081 c76081) {
        this(sleepingStopwatch);
    }

    /* loaded from: classes6.dex */
    public static final class SmoothWarmingUp extends SmoothRateLimiter {
        public double coldFactor;
        public double slope;
        public double thresholdPermits;
        public final long warmupPeriodMicros;

        public SmoothWarmingUp(RateLimiter.SleepingStopwatch stopwatch, long warmupPeriod, TimeUnit timeUnit, double coldFactor) {
            super(stopwatch);
            this.warmupPeriodMicros = timeUnit.toMicros(warmupPeriod);
            this.coldFactor = coldFactor;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public void doSetRate(double permitsPerSecond, double stableIntervalMicros) {
            double d = this.maxPermits;
            double d2 = this.coldFactor * stableIntervalMicros;
            long j = this.warmupPeriodMicros;
            double d3 = (j * 0.5d) / stableIntervalMicros;
            this.thresholdPermits = d3;
            double d4 = ((j * 2.0d) / (stableIntervalMicros + d2)) + d3;
            this.maxPermits = d4;
            this.slope = (d2 - stableIntervalMicros) / (d4 - d3);
            if (d == Double.POSITIVE_INFINITY) {
                this.storedPermits = 0.0d;
                return;
            }
            if (d != 0.0d) {
                d4 = (this.storedPermits * d4) / d;
            }
            this.storedPermits = d4;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public long storedPermitsToWaitTime(double storedPermits, double permitsToTake) {
            long jPermitsToTime;
            double d = storedPermits - this.thresholdPermits;
            if (d > 0.0d) {
                double dMin = Math.min(d, permitsToTake);
                jPermitsToTime = (long) (((permitsToTime(d) + permitsToTime(d - dMin)) * dMin) / 2.0d);
                permitsToTake -= dMin;
            } else {
                jPermitsToTime = 0;
            }
            return jPermitsToTime + ((long) (this.stableIntervalMicros * permitsToTake));
        }

        public final double permitsToTime(double permits) {
            return this.stableIntervalMicros + (permits * this.slope);
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public double coolDownIntervalMicros() {
            return this.warmupPeriodMicros / this.maxPermits;
        }
    }

    /* loaded from: classes6.dex */
    public static final class SmoothBursty extends SmoothRateLimiter {
        public final double maxBurstSeconds;

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public long storedPermitsToWaitTime(double storedPermits, double permitsToTake) {
            return 0L;
        }

        public SmoothBursty(RateLimiter.SleepingStopwatch stopwatch, double maxBurstSeconds) {
            super(stopwatch);
            this.maxBurstSeconds = maxBurstSeconds;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public void doSetRate(double permitsPerSecond, double stableIntervalMicros) {
            double d = this.maxPermits;
            double d2 = this.maxBurstSeconds * permitsPerSecond;
            this.maxPermits = d2;
            if (d == Double.POSITIVE_INFINITY) {
                this.storedPermits = d2;
            } else {
                this.storedPermits = d != 0.0d ? (this.storedPermits * d2) / d : 0.0d;
            }
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public double coolDownIntervalMicros() {
            return this.stableIntervalMicros;
        }
    }

    public SmoothRateLimiter(RateLimiter.SleepingStopwatch stopwatch) {
        super(stopwatch);
        this.nextFreeTicketMicros = 0L;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    public final void doSetRate(double permitsPerSecond, long nowMicros) {
        resync(nowMicros);
        double micros = TimeUnit.SECONDS.toMicros(1L) / permitsPerSecond;
        this.stableIntervalMicros = micros;
        doSetRate(permitsPerSecond, micros);
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    public final double doGetRate() {
        return TimeUnit.SECONDS.toMicros(1L) / this.stableIntervalMicros;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    public final long queryEarliestAvailable(long nowMicros) {
        return this.nextFreeTicketMicros;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    public final long reserveEarliestAvailable(int requiredPermits, long nowMicros) {
        resync(nowMicros);
        long j = this.nextFreeTicketMicros;
        double d = requiredPermits;
        double dMin = Math.min(d, this.storedPermits);
        this.nextFreeTicketMicros = LongMath.saturatedAdd(this.nextFreeTicketMicros, storedPermitsToWaitTime(this.storedPermits, dMin) + ((long) ((d - dMin) * this.stableIntervalMicros)));
        this.storedPermits -= dMin;
        return j;
    }

    public void resync(long nowMicros) {
        if (nowMicros > this.nextFreeTicketMicros) {
            this.storedPermits = Math.min(this.maxPermits, this.storedPermits + ((nowMicros - r0) / coolDownIntervalMicros()));
            this.nextFreeTicketMicros = nowMicros;
        }
    }
}
