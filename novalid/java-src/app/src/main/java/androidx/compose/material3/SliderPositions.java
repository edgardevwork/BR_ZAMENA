package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt__RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Slider.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016R7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0010\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00068F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, m7105d2 = {"Landroidx/compose/material3/SliderPositions;", "", "initialActiveRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "initialTickFractions", "", "(Lkotlin/ranges/ClosedFloatingPointRange;[F)V", "<set-?>", "activeRange", "getActiveRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "setActiveRange$material3_release", "(Lkotlin/ranges/ClosedFloatingPointRange;)V", "activeRange$delegate", "Landroidx/compose/runtime/MutableState;", "tickFractions", "getTickFractions", "()[F", "setTickFractions$material3_release", "([F)V", "tickFractions$delegate", "equals", "", "other", "hashCode", "", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Stable
@Deprecated(message = "Not necessary with the introduction of Slider state")
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderPositions\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2151:1\n81#2:2152\n107#2,2:2153\n81#2:2155\n107#2,2:2156\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderPositions\n*L\n1743#1:2152\n1743#1:2153,2\n1751#1:2155\n1751#1:2156,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SliderPositions {
    public static final int $stable = 0;

    /* renamed from: activeRange$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState activeRange;

    /* renamed from: tickFractions$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState tickFractions;

    public SliderPositions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public SliderPositions(@NotNull ClosedFloatingPointRange<Float> closedFloatingPointRange, @NotNull float[] fArr) {
        this.activeRange = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(closedFloatingPointRange, null, 2, null);
        this.tickFractions = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fArr, null, 2, null);
    }

    public /* synthetic */ SliderPositions(ClosedFloatingPointRange closedFloatingPointRange, float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RangesKt__RangesKt.rangeTo(0.0f, 1.0f) : closedFloatingPointRange, (i & 2) != 0 ? new float[0] : fArr);
    }

    @NotNull
    public final ClosedFloatingPointRange<Float> getActiveRange() {
        return (ClosedFloatingPointRange) this.activeRange.getValue();
    }

    public final void setActiveRange$material3_release(@NotNull ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        this.activeRange.setValue(closedFloatingPointRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final float[] getTickFractions() {
        return (float[]) this.tickFractions.getValue();
    }

    public final void setTickFractions$material3_release(@NotNull float[] fArr) {
        this.tickFractions.setValue(fArr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderPositions)) {
            return false;
        }
        SliderPositions sliderPositions = (SliderPositions) other;
        return Intrinsics.areEqual(getActiveRange(), sliderPositions.getActiveRange()) && Arrays.equals(getTickFractions(), sliderPositions.getTickFractions());
    }

    public int hashCode() {
        return (getActiveRange().hashCode() * 31) + Arrays.hashCode(getTickFractions());
    }
}
