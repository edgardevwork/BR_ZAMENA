package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.TreeSet;

@UnstableApi
/* loaded from: classes.dex */
public class SlidingPercentileBandwidthStatistic implements BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    public static final double DEFAULT_PERCENTILE = 0.5d;
    public long bitrateEstimate;
    public final int maxSampleCount;
    public final double percentile;
    public final ArrayDeque<Sample> samples;
    public final TreeSet<Sample> sortedSamples;
    public double weightSum;

    public SlidingPercentileBandwidthStatistic() {
        this(10, 0.5d);
    }

    public SlidingPercentileBandwidthStatistic(int i, double d) {
        Assertions.checkArgument(d >= 0.0d && d <= 1.0d);
        this.maxSampleCount = i;
        this.percentile = d;
        this.samples = new ArrayDeque<>();
        this.sortedSamples = new TreeSet<>();
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j, long j2) {
        while (this.samples.size() >= this.maxSampleCount) {
            Sample sampleRemove = this.samples.remove();
            this.sortedSamples.remove(sampleRemove);
            this.weightSum -= sampleRemove.weight;
        }
        double dSqrt = Math.sqrt(j);
        Sample sample = new Sample((j * 8000000) / j2, dSqrt);
        this.samples.add(sample);
        this.sortedSamples.add(sample);
        this.weightSum += dSqrt;
        this.bitrateEstimate = calculateBitrateEstimate();
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        return this.bitrateEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.samples.clear();
        this.sortedSamples.clear();
        this.weightSum = 0.0d;
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    public final long calculateBitrateEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        double d = this.weightSum * this.percentile;
        Iterator<Sample> it = this.sortedSamples.iterator();
        double d2 = 0.0d;
        long j = 0;
        double d3 = 0.0d;
        while (it.hasNext()) {
            Sample next = it.next();
            double d4 = d2 + (next.weight / 2.0d);
            if (d4 >= d) {
                return j == 0 ? next.bitrate : j + ((long) (((next.bitrate - j) * (d - d3)) / (d4 - d3)));
            }
            j = next.bitrate;
            d2 = (next.weight / 2.0d) + d4;
            d3 = d4;
        }
        return j;
    }

    public static class Sample implements Comparable<Sample> {
        public final long bitrate;
        public final double weight;

        public Sample(long j, double d) {
            this.bitrate = j;
            this.weight = d;
        }

        @Override // java.lang.Comparable
        public int compareTo(Sample sample) {
            return Util.compareLong(this.bitrate, sample.bitrate);
        }
    }
}
