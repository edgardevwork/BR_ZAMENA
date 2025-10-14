package androidx.compose.p003ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContentDrawScope.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, m7105d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public interface ContentDrawScope extends DrawScope {
    void drawContent();

    /* compiled from: ContentDrawScope.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs */
        public static void m11838drawImageAZ2fEMs(@NotNull ContentDrawScope contentDrawScope, @NotNull ImageBitmap imageBitmap, long j, long j2, long j3, long j4, @FloatRange(from = 0.0d, m9to = 1.0d) float f, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i, int i2) {
            ContentDrawScope.super.mo11795drawImageAZ2fEMs(imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, i2);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0 */
        public static long m11839getCenterF1C5BW0(@NotNull ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo11888getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc */
        public static long m11840getSizeNHjbRc(@NotNull ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo11889getSizeNHjbRc();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o */
        public static int m11841roundToPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo7867roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4 */
        public static int m11842roundToPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo7868roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA */
        public static float m11843toDpGaN1DYA(@NotNull ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo7869toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM */
        public static float m11844toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo7870toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM */
        public static float m11845toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, int i) {
            return ContentDrawScope.super.mo7871toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM */
        public static long m11846toDpSizekrfVVM(@NotNull ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo7872toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o */
        public static float m11847toPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo7873toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4 */
        public static float m11848toPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo7874toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull ContentDrawScope contentDrawScope, @NotNull DpRect dpRect) {
            return ContentDrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ */
        public static long m11849toSizeXkaWNTQ(@NotNull ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo7875toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do */
        public static long m11850toSp0xMU5do(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo7876toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4 */
        public static long m11851toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo7877toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4 */
        public static long m11852toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, int i) {
            return ContentDrawScope.super.mo7878toSpkPz2Gy4(i);
        }
    }
}
