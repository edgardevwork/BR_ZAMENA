package androidx.compose.foundation.text2.input.internal;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import com.blackhub.bronline.game.gui.donate.adapters.DonateHeaderOrFooterAdapterKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextFieldCoreModifier.kt */
@Metadata(m7104d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000eH\u0002\u001a\f\u0010\u0013\u001a\u00020\u0005*\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t¨\u0006\u0014"}, m7105d2 = {"DefaultCursorThickness", "Landroidx/compose/ui/unit/Dp;", "F", "cursorAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "isSpecified", "", "Landroidx/compose/ui/graphics/Brush;", "(Landroidx/compose/ui/graphics/Brush;)Z", "getCursorRectInScroller", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/Density;", "cursorOffset", "", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "rtl", "textFieldWidth", "roundToNext", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,584:1\n652#2:585\n154#3:586\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt\n*L\n535#1:585\n529#1:586\n*E\n"})
/* loaded from: classes3.dex */
public final class TextFieldCoreModifierKt {

    @NotNull
    private static final AnimationSpec<Float> cursorAnimationSpec = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierKt$cursorAnimationSpec$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            invoke2(keyframesSpecConfig);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            keyframesSpecConfig.setDurationMillis(1000);
            Float fValueOf = Float.valueOf(1.0f);
            keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) fValueOf, 0);
            keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) fValueOf, DonateHeaderOrFooterAdapterKt.SCREEN_SIZE_MAX_1);
            Float fValueOf2 = Float.valueOf(0.0f);
            keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) fValueOf2, 500);
            keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) fValueOf2, 999);
        }
    }), null, 0, 6, null);
    private static final float DefaultCursorThickness = C2046Dp.m13666constructorimpl(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSpecified(Brush brush) {
        return ((brush instanceof SolidColor) && ((SolidColor) brush).getValue() == Color.INSTANCE.m11376getUnspecified0d7_KjU()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, int i, TextLayoutResult textLayoutResult, boolean z, int i2) {
        Rect zero;
        float left;
        float left2;
        if (textLayoutResult == null || (zero = textLayoutResult.getCursorRect(RangesKt___RangesKt.coerceIn(i, (ClosedRange<Integer>) new IntRange(0, textLayoutResult.getLayoutInput().getText().length())))) == null) {
            zero = Rect.INSTANCE.getZero();
        }
        Rect rect = zero;
        int iMo7868roundToPx0680j_4 = density.mo7868roundToPx0680j_4(DefaultCursorThickness);
        if (z) {
            left = (i2 - rect.getLeft()) - iMo7868roundToPx0680j_4;
        } else {
            left = rect.getLeft();
        }
        float f = left;
        if (z) {
            left2 = i2 - rect.getLeft();
        } else {
            left2 = rect.getLeft() + iMo7868roundToPx0680j_4;
        }
        return Rect.copy$default(rect, f, 0.0f, left2, 0.0f, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToNext(float f) {
        double dFloor;
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return f;
        }
        if (f > 0.0f) {
            dFloor = Math.ceil(f);
        } else {
            dFloor = Math.floor(f);
        }
        return (float) dFloor;
    }
}
