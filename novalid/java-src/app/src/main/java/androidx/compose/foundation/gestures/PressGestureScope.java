package androidx.compose.foundation.gestures;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TapGestureDetector.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, m7105d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAwaitRelease", "", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface PressGestureScope extends Density {
    @Nullable
    Object awaitRelease(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object tryAwaitRelease(@NotNull Continuation<? super Boolean> continuation);

    /* compiled from: TapGestureDetector.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m7946roundToPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.mo7867roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m7947roundToPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo7868roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m7948toDpGaN1DYA(@NotNull PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.mo7869toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7949toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo7870toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7950toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, int i) {
            return PressGestureScope.super.mo7871toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m7951toDpSizekrfVVM(@NotNull PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.mo7872toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m7952toPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.mo7873toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m7953toPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo7874toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull PressGestureScope pressGestureScope, @NotNull DpRect dpRect) {
            return PressGestureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m7954toSizeXkaWNTQ(@NotNull PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.mo7875toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m7955toSp0xMU5do(@NotNull PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo7876toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7956toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo7877toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7957toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, int i) {
            return PressGestureScope.super.mo7878toSpkPz2Gy4(i);
        }
    }
}
