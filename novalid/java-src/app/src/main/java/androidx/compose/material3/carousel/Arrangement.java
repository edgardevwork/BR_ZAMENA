package androidx.compose.material3.carousel;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Arrangement.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0015"}, m7105d2 = {"Landroidx/compose/material3/carousel/Arrangement;", "", "priority", "", "smallSize", "", "smallCount", "mediumSize", "mediumCount", "largeSize", "largeCount", "(IFIFIFI)V", "getLargeSize", "()F", "getMediumSize", "getSmallSize", CatchStreamerKeys.COST_KEY, "targetLargeSize", "isValid", "", "Companion", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class Arrangement {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float MediumItemFlexPercentage = 0.1f;
    private final int largeCount;
    private final float largeSize;
    private final int mediumCount;
    private final float mediumSize;
    private final int priority;
    private final int smallCount;
    private final float smallSize;

    public Arrangement(int i, float f, int i2, float f2, int i3, float f3, int i4) {
        this.priority = i;
        this.smallSize = f;
        this.smallCount = i2;
        this.mediumSize = f2;
        this.mediumCount = i3;
        this.largeSize = f3;
        this.largeCount = i4;
    }

    public final float getSmallSize() {
        return this.smallSize;
    }

    public final float getMediumSize() {
        return this.mediumSize;
    }

    public final float getLargeSize() {
        return this.largeSize;
    }

    private final boolean isValid() {
        int i = this.largeCount;
        if (i <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f = this.largeSize;
        float f2 = this.mediumSize;
        return f > f2 && f2 > this.smallSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float cost(float targetLargeSize) {
        if (isValid()) {
            return Math.abs(targetLargeSize - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    /* compiled from: Arrangement.kt */
    @Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002JH\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0012JP\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m7105d2 = {"Landroidx/compose/material3/carousel/Arrangement$Companion;", "", "()V", "MediumItemFlexPercentage", "", "calculateLargeSize", "availableSpace", "smallCount", "", "smallSize", "mediumCount", "largeCount", "findLowestCostArrangement", "Landroidx/compose/material3/carousel/Arrangement;", "targetSmallSize", "smallSizeRange", "Landroidx/annotation/FloatRange;", "smallCounts", "", "targetMediumSize", "mediumCounts", "targetLargeSize", "largeCounts", "fit", "priority", "mediumSize", "largeSize", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float calculateLargeSize(float availableSpace, int smallCount, float smallSize, int mediumCount, int largeCount) {
            float f = mediumCount / 2.0f;
            return (availableSpace - ((smallCount + f) * smallSize)) / (largeCount + f);
        }

        private Companion() {
        }

        @Nullable
        public final Arrangement findLowestCostArrangement(float availableSpace, float targetSmallSize, @NotNull FloatRange smallSizeRange, @NotNull int[] smallCounts, float targetMediumSize, @NotNull int[] mediumCounts, float targetLargeSize, @NotNull int[] largeCounts) {
            int length = largeCounts.length;
            Arrangement arrangement = null;
            int i = 1;
            int i2 = 0;
            while (i2 < length) {
                int i3 = largeCounts[i2];
                int length2 = mediumCounts.length;
                int i4 = 0;
                while (i4 < length2) {
                    int i5 = mediumCounts[i4];
                    int length3 = smallCounts.length;
                    Arrangement arrangement2 = arrangement;
                    int i6 = i;
                    int i7 = 0;
                    while (i7 < length3) {
                        int i8 = i7;
                        Arrangement arrangement3 = arrangement2;
                        int i9 = length3;
                        int i10 = i4;
                        int i11 = length2;
                        int i12 = i2;
                        Arrangement arrangementFit = fit(i6, availableSpace, smallCounts[i7], targetSmallSize, smallSizeRange, i5, targetMediumSize, i3, targetLargeSize);
                        if (arrangement3 != null && arrangementFit.cost(targetLargeSize) >= arrangement3.cost(targetLargeSize)) {
                            arrangement2 = arrangement3;
                        } else {
                            if (arrangementFit.cost(targetLargeSize) == 0.0f) {
                                return arrangementFit;
                            }
                            arrangement2 = arrangementFit;
                        }
                        i6++;
                        i7 = i8 + 1;
                        length3 = i9;
                        i4 = i10;
                        length2 = i11;
                        i2 = i12;
                    }
                    i4++;
                    arrangement = arrangement2;
                    i = i6;
                }
                i2++;
            }
            return arrangement;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Arrangement fit(int priority, float availableSpace, int smallCount, float smallSize, FloatRange smallSizeRange, int mediumCount, float mediumSize, int largeCount, float largeSize) {
            float fMax;
            float fCalculateLargeSize;
            float f;
            float f2;
            float fCoerceIn = RangesKt___RangesKt.coerceIn(smallSize, (float) smallSizeRange.from(), (float) smallSizeRange.m9to());
            float f3 = largeCount;
            float f4 = mediumCount;
            float f5 = smallCount;
            float f6 = availableSpace - (((largeSize * f3) + (mediumSize * f4)) + (fCoerceIn * f5));
            if (smallCount > 0 && f6 > 0.0f) {
                fMax = Math.min(f6 / f5, ((float) smallSizeRange.m9to()) - fCoerceIn);
            } else {
                if (smallCount > 0 && f6 < 0.0f) {
                    fMax = Math.max(f6 / f5, ((float) smallSizeRange.from()) - fCoerceIn);
                }
                float f7 = smallCount <= 0 ? fCoerceIn : 0.0f;
                fCalculateLargeSize = calculateLargeSize(availableSpace, smallCount, f7, mediumCount, largeCount);
                f = (fCalculateLargeSize + f7) / 2.0f;
                if (mediumCount > 0 && fCalculateLargeSize != largeSize) {
                    f2 = (largeSize - fCalculateLargeSize) * f3;
                    float fMin = Math.min(Math.abs(f2), 0.1f * f * f4);
                    if (f2 <= 0.0f) {
                        f -= fMin / f4;
                        fCalculateLargeSize += fMin / f3;
                    } else {
                        f += fMin / f4;
                        fCalculateLargeSize -= fMin / f3;
                    }
                }
                return new Arrangement(priority, f7, smallCount, f, mediumCount, fCalculateLargeSize, largeCount);
            }
            fCoerceIn += fMax;
            if (smallCount <= 0) {
            }
            fCalculateLargeSize = calculateLargeSize(availableSpace, smallCount, f7, mediumCount, largeCount);
            f = (fCalculateLargeSize + f7) / 2.0f;
            if (mediumCount > 0) {
                f2 = (largeSize - fCalculateLargeSize) * f3;
                float fMin2 = Math.min(Math.abs(f2), 0.1f * f * f4);
                if (f2 <= 0.0f) {
                }
            }
            return new Arrangement(priority, f7, smallCount, f, mediumCount, fCalculateLargeSize, largeCount);
        }
    }
}
