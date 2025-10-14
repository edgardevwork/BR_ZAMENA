package androidx.constraintlayout.compose;

import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.ConstraintReference;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ConstraintScopeCommon.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010J\u0014\u0010\u0018\u001a\u00020\u0019*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\u0014\u0010\u001a\u001a\u00020\u0019*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0010H\u0002R(\u0010\u0003\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR6\u0010\t\u001a%\u0012!\u0012\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\n0\n¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR<\u0010\u000e\u001a+\u0012'\u0012%\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0002\b\u00060\n0\n¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, m7105d2 = {"Landroidx/constraintlayout/compose/AnchorFunctions;", "", "()V", "baselineAnchorFunction", "Lkotlin/Function2;", "Landroidx/constraintlayout/core/state/ConstraintReference;", "Lkotlin/ExtensionFunctionType;", "getBaselineAnchorFunction", "()Lkotlin/jvm/functions/Function2;", "horizontalAnchorFunctions", "", "getHorizontalAnchorFunctions", "()[[Lkotlin/jvm/functions/Function2;", "[[Lkotlin/jvm/functions/Function2;", "verticalAnchorFunctions", "Lkotlin/Function3;", "Landroidx/compose/ui/unit/LayoutDirection;", "getVerticalAnchorFunctions", "()[[Lkotlin/jvm/functions/Function3;", "[[Lkotlin/jvm/functions/Function3;", "verticalAnchorIndexToFunctionIndex", "", FirebaseAnalytics.Param.INDEX, "layoutDirection", "clearLeft", "", "clearRight", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes.dex */
public final class AnchorFunctions {

    @NotNull
    public static final AnchorFunctions INSTANCE = new AnchorFunctions();

    @NotNull
    public static final Function3<ConstraintReference, Object, LayoutDirection, ConstraintReference>[][] verticalAnchorFunctions = {new Function3[]{new Function3<ConstraintReference, Object, LayoutDirection, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$verticalAnchorFunctions$1
        @Override // kotlin.jvm.functions.Function3
        public final ConstraintReference invoke(@NotNull ConstraintReference arrayOf, @NotNull Object other, @NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            AnchorFunctions.INSTANCE.clearLeft(arrayOf, layoutDirection);
            ConstraintReference constraintReferenceLeftToLeft = arrayOf.leftToLeft(other);
            Intrinsics.checkNotNullExpressionValue(constraintReferenceLeftToLeft, "leftToLeft(other)");
            return constraintReferenceLeftToLeft;
        }
    }, new Function3<ConstraintReference, Object, LayoutDirection, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$verticalAnchorFunctions$2
        @Override // kotlin.jvm.functions.Function3
        public final ConstraintReference invoke(@NotNull ConstraintReference arrayOf, @NotNull Object other, @NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            AnchorFunctions.INSTANCE.clearLeft(arrayOf, layoutDirection);
            ConstraintReference constraintReferenceLeftToRight = arrayOf.leftToRight(other);
            Intrinsics.checkNotNullExpressionValue(constraintReferenceLeftToRight, "leftToRight(other)");
            return constraintReferenceLeftToRight;
        }
    }}, new Function3[]{new Function3<ConstraintReference, Object, LayoutDirection, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$verticalAnchorFunctions$3
        @Override // kotlin.jvm.functions.Function3
        public final ConstraintReference invoke(@NotNull ConstraintReference arrayOf, @NotNull Object other, @NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            AnchorFunctions.INSTANCE.clearRight(arrayOf, layoutDirection);
            ConstraintReference constraintReferenceRightToLeft = arrayOf.rightToLeft(other);
            Intrinsics.checkNotNullExpressionValue(constraintReferenceRightToLeft, "rightToLeft(other)");
            return constraintReferenceRightToLeft;
        }
    }, new Function3<ConstraintReference, Object, LayoutDirection, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$verticalAnchorFunctions$4
        @Override // kotlin.jvm.functions.Function3
        public final ConstraintReference invoke(@NotNull ConstraintReference arrayOf, @NotNull Object other, @NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            AnchorFunctions.INSTANCE.clearRight(arrayOf, layoutDirection);
            ConstraintReference constraintReferenceRightToRight = arrayOf.rightToRight(other);
            Intrinsics.checkNotNullExpressionValue(constraintReferenceRightToRight, "rightToRight(other)");
            return constraintReferenceRightToRight;
        }
    }}};

    @NotNull
    public static final Function2<ConstraintReference, Object, ConstraintReference>[][] horizontalAnchorFunctions = {new Function2[]{new Function2<ConstraintReference, Object, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$horizontalAnchorFunctions$1
        @Override // kotlin.jvm.functions.Function2
        public final ConstraintReference invoke(@NotNull ConstraintReference arrayOf, @NotNull Object other) {
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            arrayOf.topToBottom(null);
            arrayOf.baselineToBaseline(null);
            ConstraintReference constraintReference = arrayOf.topToTop(other);
            Intrinsics.checkNotNullExpressionValue(constraintReference, "topToTop(other)");
            return constraintReference;
        }
    }, new Function2<ConstraintReference, Object, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$horizontalAnchorFunctions$2
        @Override // kotlin.jvm.functions.Function2
        public final ConstraintReference invoke(@NotNull ConstraintReference arrayOf, @NotNull Object other) {
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            arrayOf.topToTop(null);
            arrayOf.baselineToBaseline(null);
            ConstraintReference constraintReference = arrayOf.topToBottom(other);
            Intrinsics.checkNotNullExpressionValue(constraintReference, "topToBottom(other)");
            return constraintReference;
        }
    }}, new Function2[]{new Function2<ConstraintReference, Object, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$horizontalAnchorFunctions$3
        @Override // kotlin.jvm.functions.Function2
        public final ConstraintReference invoke(@NotNull ConstraintReference arrayOf, @NotNull Object other) {
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            arrayOf.bottomToBottom(null);
            arrayOf.baselineToBaseline(null);
            ConstraintReference constraintReferenceBottomToTop = arrayOf.bottomToTop(other);
            Intrinsics.checkNotNullExpressionValue(constraintReferenceBottomToTop, "bottomToTop(other)");
            return constraintReferenceBottomToTop;
        }
    }, new Function2<ConstraintReference, Object, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$horizontalAnchorFunctions$4
        @Override // kotlin.jvm.functions.Function2
        public final ConstraintReference invoke(@NotNull ConstraintReference arrayOf, @NotNull Object other) {
            Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(other, "other");
            arrayOf.bottomToTop(null);
            arrayOf.baselineToBaseline(null);
            ConstraintReference constraintReferenceBottomToBottom = arrayOf.bottomToBottom(other);
            Intrinsics.checkNotNullExpressionValue(constraintReferenceBottomToBottom, "bottomToBottom(other)");
            return constraintReferenceBottomToBottom;
        }
    }}};

    @NotNull
    public static final Function2<ConstraintReference, Object, ConstraintReference> baselineAnchorFunction = new Function2<ConstraintReference, Object, ConstraintReference>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$baselineAnchorFunction$1
        @Override // kotlin.jvm.functions.Function2
        public final ConstraintReference invoke(@NotNull ConstraintReference constraintReference, @NotNull Object other) {
            Intrinsics.checkNotNullParameter(constraintReference, "$this$null");
            Intrinsics.checkNotNullParameter(other, "other");
            constraintReference.topToTop(null);
            constraintReference.topToBottom(null);
            constraintReference.bottomToTop(null);
            constraintReference.bottomToBottom(null);
            ConstraintReference constraintReferenceBaselineToBaseline = constraintReference.baselineToBaseline(other);
            Intrinsics.checkNotNullExpressionValue(constraintReferenceBaselineToBaseline, "baselineToBaseline(other)");
            return constraintReferenceBaselineToBaseline;
        }
    };

    /* compiled from: ConstraintScopeCommon.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final Function3<ConstraintReference, Object, LayoutDirection, ConstraintReference>[][] getVerticalAnchorFunctions() {
        return verticalAnchorFunctions;
    }

    public final void clearLeft(ConstraintReference constraintReference, LayoutDirection layoutDirection) {
        constraintReference.leftToLeft(null);
        constraintReference.leftToRight(null);
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            constraintReference.startToStart(null);
            constraintReference.startToEnd(null);
        } else {
            if (i != 2) {
                return;
            }
            constraintReference.endToStart(null);
            constraintReference.endToEnd(null);
        }
    }

    public final void clearRight(ConstraintReference constraintReference, LayoutDirection layoutDirection) {
        constraintReference.rightToLeft(null);
        constraintReference.rightToRight(null);
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            constraintReference.endToStart(null);
            constraintReference.endToEnd(null);
        } else {
            if (i != 2) {
                return;
            }
            constraintReference.startToStart(null);
            constraintReference.startToEnd(null);
        }
    }

    public final int verticalAnchorIndexToFunctionIndex(int index, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return index >= 0 ? index : layoutDirection == LayoutDirection.Ltr ? index + 2 : (-index) - 1;
    }

    @NotNull
    public final Function2<ConstraintReference, Object, ConstraintReference>[][] getHorizontalAnchorFunctions() {
        return horizontalAnchorFunctions;
    }

    @NotNull
    public final Function2<ConstraintReference, Object, ConstraintReference> getBaselineAnchorFunction() {
        return baselineAnchorFunction;
    }
}
