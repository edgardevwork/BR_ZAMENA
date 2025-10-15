package androidx.compose.animation.core;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathMeasure;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: PathEasing.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m7105d2 = {"Landroidx/compose/animation/core/PathEasing;", "Landroidx/compose/animation/core/Easing;", "path", "Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/ui/graphics/Path;)V", "offsetX", "", "offsetY", "transform", "", "fraction", "animation-core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class PathEasing implements Easing {
    public static final int $stable = 0;

    @NotNull
    private final float[] offsetX;

    @NotNull
    private final float[] offsetY;

    public PathEasing(@NotNull Path path) {
        PathMeasure PathMeasure = AndroidPathMeasure_androidKt.PathMeasure();
        PathMeasure.setPath(path, false);
        float length = PathMeasure.getLength();
        if (length <= 0.0f) {
            throw new IllegalArgumentException("Path cannot be zero in length. Ensure that supplied Path starts at [0,0] and ends at [1,1]".toString());
        }
        int i = (int) (length / 0.002f);
        int i2 = i + 1;
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = 0.0f;
        }
        this.offsetX = fArr;
        float[] fArr2 = new float[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            fArr2[i4] = 0.0f;
        }
        this.offsetY = fArr2;
        for (int i5 = 0; i5 < i2; i5++) {
            long jMo11238getPositiontuRUvjQ = PathMeasure.mo11238getPositiontuRUvjQ((i5 * length) / i);
            this.offsetX[i5] = Offset.m11099getXimpl(jMo11238getPositiontuRUvjQ);
            this.offsetY[i5] = Offset.m11100getYimpl(jMo11238getPositiontuRUvjQ);
            if (i5 > 0) {
                float[] fArr3 = this.offsetX;
                if (fArr3[i5] < fArr3[i5 - 1]) {
                    throw new IllegalArgumentException("Path needs to be continuously increasing");
                }
            }
        }
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float fraction) {
        if (fraction <= 0.0f) {
            return 0.0f;
        }
        if (fraction >= 1.0f) {
            return 1.0f;
        }
        int iBinarySearch$default = ArraysKt___ArraysJvmKt.binarySearch$default(this.offsetX, fraction, 0, 0, 6, (Object) null);
        if (iBinarySearch$default > 0) {
            return this.offsetY[iBinarySearch$default];
        }
        int iAbs = Math.abs(iBinarySearch$default);
        float[] fArr = this.offsetX;
        if (iAbs >= fArr.length - 1) {
            return ArraysKt___ArraysKt.last(this.offsetY);
        }
        int i = iAbs + 1;
        float f = fArr[i];
        float f2 = fArr[iAbs];
        float f3 = (fraction - f2) / (f - f2);
        float[] fArr2 = this.offsetY;
        float f4 = fArr2[iAbs];
        return f4 + (f3 * (fArr2[i] - f4));
    }
}
