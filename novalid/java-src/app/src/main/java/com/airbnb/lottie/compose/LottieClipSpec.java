package com.airbnb.lottie.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.LottieComposition;
import com.blackhub.bronline.launcher.download.DownloadWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LottieClipSpec.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H ¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H ¢\u0006\u0002\b\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m7105d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec;", "", "()V", "getMaxProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "getMaxProgress$lottie_compose_release", "getMinProgress", "getMinProgress$lottie_compose_release", "Frame", "Marker", "Markers", DownloadWorker.Progress, "Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Marker;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Markers;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Progress;", "lottie-compose_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public abstract class LottieClipSpec {
    public static final int $stable = 0;

    public /* synthetic */ LottieClipSpec(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract float getMaxProgress$lottie_compose_release(@NotNull LottieComposition composition);

    public abstract float getMinProgress$lottie_compose_release(@NotNull LottieComposition composition);

    public LottieClipSpec() {
    }

    /* compiled from: LottieClipSpec.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0010¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0010¢\u0006\u0002\b\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006!"}, m7105d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "min", "", "max", "maxInclusive", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "actualMaxFrame", "Ljava/lang/Integer;", "getMax", "()Ljava/lang/Integer;", "getMaxInclusive", "()Z", "getMin", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "equals", "other", "", "getMaxProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "getMaxProgress$lottie_compose_release", "getMinProgress", "getMinProgress$lottie_compose_release", "hashCode", "toString", "", "lottie-compose_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final /* data */ class Frame extends LottieClipSpec {
        public static final int $stable = 0;

        @Nullable
        public final Integer actualMaxFrame;

        @Nullable
        public final Integer max;
        public final boolean maxInclusive;

        @Nullable
        public final Integer min;

        public Frame() {
            this(null, null, false, 7, null);
        }

        public static /* synthetic */ Frame copy$default(Frame frame, Integer num, Integer num2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                num = frame.min;
            }
            if ((i & 2) != 0) {
                num2 = frame.max;
            }
            if ((i & 4) != 0) {
                z = frame.maxInclusive;
            }
            return frame.copy(num, num2, z);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Integer getMin() {
            return this.min;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getMax() {
            return this.max;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getMaxInclusive() {
            return this.maxInclusive;
        }

        @NotNull
        public final Frame copy(@Nullable Integer min, @Nullable Integer max, boolean maxInclusive) {
            return new Frame(min, max, maxInclusive);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Frame)) {
                return false;
            }
            Frame frame = (Frame) other;
            return Intrinsics.areEqual(this.min, frame.min) && Intrinsics.areEqual(this.max, frame.max) && this.maxInclusive == frame.maxInclusive;
        }

        public int hashCode() {
            Integer num = this.min;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.max;
            return ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.maxInclusive);
        }

        @NotNull
        public String toString() {
            return "Frame(min=" + this.min + ", max=" + this.max + ", maxInclusive=" + this.maxInclusive + ")";
        }

        public /* synthetic */ Frame(Integer num, Integer num2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? true : z);
        }

        @Nullable
        public final Integer getMin() {
            return this.min;
        }

        @Nullable
        public final Integer getMax() {
            return this.max;
        }

        public final boolean getMaxInclusive() {
            return this.maxInclusive;
        }

        public Frame(@Nullable Integer num, @Nullable Integer num2, boolean z) {
            super(null);
            this.min = num;
            this.max = num2;
            this.maxInclusive = z;
            if (num2 == null) {
                num2 = null;
            } else if (!z) {
                num2 = Integer.valueOf(num2.intValue() - 1);
            }
            this.actualMaxFrame = num2;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            if (this.min == null) {
                return 0.0f;
            }
            return RangesKt___RangesKt.coerceIn(r0.intValue() / composition.getEndFrame(), 0.0f, 1.0f);
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            if (this.actualMaxFrame == null) {
                return 1.0f;
            }
            return RangesKt___RangesKt.coerceIn(r0.intValue() / composition.getEndFrame(), 0.0f, 1.0f);
        }
    }

    /* compiled from: LottieClipSpec.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\u0015\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0010¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0010¢\u0006\u0002\b\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001a"}, m7105d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Progress;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "min", "", "max", "(FF)V", "getMax", "()F", "getMin", "component1", "component2", "copy", "equals", "", "other", "", "getMaxProgress", "composition", "Lcom/airbnb/lottie/LottieComposition;", "getMaxProgress$lottie_compose_release", "getMinProgress", "getMinProgress$lottie_compose_release", "hashCode", "", "toString", "", "lottie-compose_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final /* data */ class Progress extends LottieClipSpec {
        public static final int $stable = 0;
        public final float max;
        public final float min;

        /* JADX WARN: Illegal instructions before constructor call */
        public Progress() {
            float f = 0.0f;
            this(f, f, 3, null);
        }

        public static /* synthetic */ Progress copy$default(Progress progress, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = progress.min;
            }
            if ((i & 2) != 0) {
                f2 = progress.max;
            }
            return progress.copy(f, f2);
        }

        /* renamed from: component1, reason: from getter */
        public final float getMin() {
            return this.min;
        }

        /* renamed from: component2, reason: from getter */
        public final float getMax() {
            return this.max;
        }

        @NotNull
        public final Progress copy(float min, float max) {
            return new Progress(min, max);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return Float.compare(this.min, progress.min) == 0 && Float.compare(this.max, progress.max) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.min) * 31) + Float.hashCode(this.max);
        }

        @NotNull
        public String toString() {
            return "Progress(min=" + this.min + ", max=" + this.max + ")";
        }

        public /* synthetic */ Progress(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 1.0f : f2);
        }

        public final float getMin() {
            return this.min;
        }

        public final float getMax() {
            return this.max;
        }

        public Progress(float f, float f2) {
            super(null);
            this.min = f;
            this.max = f2;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            return this.min;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            return this.max;
        }
    }

    /* compiled from: LottieClipSpec.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0010¢\u0006\u0002\b\u0018J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0010¢\u0006\u0002\b\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001e"}, m7105d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Markers;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "min", "", "max", "maxInclusive", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getMax", "()Ljava/lang/String;", "getMaxInclusive", "()Z", "getMin", "component1", "component2", "component3", "copy", "equals", "other", "", "getMaxProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "getMaxProgress$lottie_compose_release", "getMinProgress", "getMinProgress$lottie_compose_release", "hashCode", "", "toString", "lottie-compose_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final /* data */ class Markers extends LottieClipSpec {
        public static final int $stable = 0;

        @Nullable
        public final String max;
        public final boolean maxInclusive;

        @Nullable
        public final String min;

        public Markers() {
            this(null, null, false, 7, null);
        }

        public static /* synthetic */ Markers copy$default(Markers markers, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = markers.min;
            }
            if ((i & 2) != 0) {
                str2 = markers.max;
            }
            if ((i & 4) != 0) {
                z = markers.maxInclusive;
            }
            return markers.copy(str, str2, z);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMin() {
            return this.min;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getMax() {
            return this.max;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getMaxInclusive() {
            return this.maxInclusive;
        }

        @NotNull
        public final Markers copy(@Nullable String min, @Nullable String max, boolean maxInclusive) {
            return new Markers(min, max, maxInclusive);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Markers)) {
                return false;
            }
            Markers markers = (Markers) other;
            return Intrinsics.areEqual(this.min, markers.min) && Intrinsics.areEqual(this.max, markers.max) && this.maxInclusive == markers.maxInclusive;
        }

        public int hashCode() {
            String str = this.min;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.max;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.maxInclusive);
        }

        @NotNull
        public String toString() {
            return "Markers(min=" + this.min + ", max=" + this.max + ", maxInclusive=" + this.maxInclusive + ")";
        }

        public /* synthetic */ Markers(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z);
        }

        @Nullable
        public final String getMin() {
            return this.min;
        }

        @Nullable
        public final String getMax() {
            return this.max;
        }

        public final boolean getMaxInclusive() {
            return this.maxInclusive;
        }

        public Markers(@Nullable String str, @Nullable String str2, boolean z) {
            super(null);
            this.min = str;
            this.max = str2;
            this.maxInclusive = z;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            String str = this.min;
            if (str == null) {
                return 0.0f;
            }
            com.airbnb.lottie.model.Marker marker = composition.getMarker(str);
            return RangesKt___RangesKt.coerceIn((marker != null ? marker.startFrame : 0.0f) / composition.getEndFrame(), 0.0f, 1.0f);
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            String str = this.max;
            if (str == null) {
                return 1.0f;
            }
            int i = this.maxInclusive ? 0 : -1;
            com.airbnb.lottie.model.Marker marker = composition.getMarker(str);
            return RangesKt___RangesKt.coerceIn((marker != null ? marker.startFrame + i : 0.0f) / composition.getEndFrame(), 0.0f, 1.0f);
        }
    }

    /* compiled from: LottieClipSpec.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0011J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0013J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m7105d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Marker;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "marker", "", "(Ljava/lang/String;)V", "getMarker", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "getMaxProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "getMaxProgress$lottie_compose_release", "getMinProgress", "getMinProgress$lottie_compose_release", "hashCode", "", "toString", "lottie-compose_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final /* data */ class Marker extends LottieClipSpec {
        public static final int $stable = 0;

        @NotNull
        public final String marker;

        public static /* synthetic */ Marker copy$default(Marker marker, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = marker.marker;
            }
            return marker.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMarker() {
            return this.marker;
        }

        @NotNull
        public final Marker copy(@NotNull String marker) {
            Intrinsics.checkNotNullParameter(marker, "marker");
            return new Marker(marker);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Marker) && Intrinsics.areEqual(this.marker, ((Marker) other).marker);
        }

        public int hashCode() {
            return this.marker.hashCode();
        }

        @NotNull
        public String toString() {
            return "Marker(marker=" + this.marker + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Marker(@NotNull String marker) {
            super(null);
            Intrinsics.checkNotNullParameter(marker, "marker");
            this.marker = marker;
        }

        @NotNull
        public final String getMarker() {
            return this.marker;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            com.airbnb.lottie.model.Marker marker = composition.getMarker(this.marker);
            return RangesKt___RangesKt.coerceIn((marker != null ? marker.startFrame : 0.0f) / composition.getEndFrame(), 0.0f, 1.0f);
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            com.airbnb.lottie.model.Marker marker = composition.getMarker(this.marker);
            if (marker == null) {
                return 1.0f;
            }
            return RangesKt___RangesKt.coerceIn((marker.startFrame + marker.durationFrames) / composition.getEndFrame(), 0.0f, 1.0f);
        }
    }
}
