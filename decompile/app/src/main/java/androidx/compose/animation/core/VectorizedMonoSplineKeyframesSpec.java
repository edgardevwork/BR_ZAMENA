package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.flv.ScriptTagPayloadReader;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorizedMonoSplineKeyframesSpec.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ-\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ-\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010 R\u0014\u0010\n\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0015\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006!"}, m7105d2 = {"Landroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "timestamps", "Landroidx/collection/IntList;", ScriptTagPayloadReader.KEY_KEY_FRAMES, "Landroidx/collection/IntObjectMap;", "durationMillis", "", "delayMillis", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;II)V", "getDelayMillis", "()I", "getDurationMillis", "lastInitialValue", "Landroidx/compose/animation/core/AnimationVector;", "lastTargetValue", "monoSpline", "Landroidx/compose/animation/core/MonoSpline;", "valueVector", "velocityVector", "getValueFromNanos", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "init", "", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "animation-core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@ExperimentalAnimationSpecApi
@SourceDebugExtension({"SMAP\nVectorizedMonoSplineKeyframesSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n+ 2 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,127:1\n266#2,6:128\n*S KotlinDebug\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n*L\n68#1:128,6\n*E\n"})
/* loaded from: classes3.dex */
public final class VectorizedMonoSplineKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;

    @NotNull
    private final IntObjectMap<V> keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private MonoSpline monoSpline;

    @NotNull
    private final IntList timestamps;
    private V valueVector;
    private V velocityVector;

    public VectorizedMonoSplineKeyframesSpec(@NotNull IntList intList, @NotNull IntObjectMap<V> intObjectMap, int i, int i2) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i;
        this.delayMillis = i2;
    }

    public /* synthetic */ VectorizedMonoSplineKeyframesSpec(IntList intList, IntObjectMap intObjectMap, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(intList, intObjectMap, i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    private final void init(V initialValue, V targetValue, V initialVelocity) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(initialValue);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(initialVelocity);
        }
        if (this.monoSpline != null) {
            V v = this.lastInitialValue;
            V v2 = null;
            if (v == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastInitialValue");
                v = null;
            }
            if (Intrinsics.areEqual(v, initialValue)) {
                V v3 = this.lastTargetValue;
                if (v3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lastTargetValue");
                } else {
                    v2 = v3;
                }
                if (Intrinsics.areEqual(v2, targetValue)) {
                    return;
                }
            }
        }
        this.lastInitialValue = initialValue;
        this.lastTargetValue = targetValue;
        int i = this.keyframes.get_size();
        int i2 = i + 2;
        float[] fArr = new float[i2];
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new float[initialValue.getSize()]);
        }
        fArr[0] = 0.0f;
        int i4 = i + 1;
        float f = 1000L;
        fArr[i4] = getDurationMillis() / f;
        float[] fArr2 = (float[]) arrayList.get(0);
        float[] fArr3 = (float[]) arrayList.get(i4);
        int size = initialValue.getSize();
        for (int i5 = 0; i5 < size; i5++) {
            fArr2[i5] = initialValue.get$animation_core_release(i5);
            fArr3[i5] = targetValue.get$animation_core_release(i5);
        }
        IntList intList = this.timestamps;
        int[] iArr = intList.content;
        int i6 = intList._size;
        int i7 = 0;
        while (i7 < i6) {
            int i8 = iArr[i7];
            V v4 = this.keyframes.get(i8);
            Intrinsics.checkNotNull(v4);
            V v5 = v4;
            i7++;
            fArr[i7] = i8 / f;
            float[] fArr4 = (float[]) arrayList.get(i7);
            int length = fArr4.length;
            for (int i9 = 0; i9 < length; i9++) {
                fArr4[i9] = v5.get$animation_core_release(i9);
            }
        }
        this.monoSpline = new MonoSpline(fArr, arrayList);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getValueFromNanos(long playTimeNanos, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / 1000000);
        if (this.keyframes.containsKey(iClampPlayTime)) {
            V v = this.keyframes.get(iClampPlayTime);
            Intrinsics.checkNotNull(v);
            return v;
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return targetValue;
        }
        if (iClampPlayTime <= 0) {
            return initialValue;
        }
        init(initialValue, targetValue, initialVelocity);
        MonoSpline monoSpline = this.monoSpline;
        if (monoSpline == null) {
            Intrinsics.throwUninitializedPropertyAccessException("monoSpline");
            monoSpline = null;
        }
        float f = iClampPlayTime / 1000;
        V v2 = this.valueVector;
        if (v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v2 = null;
        }
        monoSpline.getPos(f, v2);
        V v3 = this.valueVector;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getVelocityFromNanos(long playTimeNanos, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        long jClampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / 1000000);
        if (jClampPlayTime < 0) {
            return initialVelocity;
        }
        init(initialValue, targetValue, initialVelocity);
        MonoSpline monoSpline = this.monoSpline;
        if (monoSpline == null) {
            Intrinsics.throwUninitializedPropertyAccessException("monoSpline");
            monoSpline = null;
        }
        float f = jClampPlayTime / 1000;
        V v = this.velocityVector;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v = null;
        }
        monoSpline.getSlope(f, v);
        V v2 = this.velocityVector;
        if (v2 != null) {
            return v2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }
}
