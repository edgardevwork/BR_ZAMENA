package androidx.compose.foundation.text2.input.internal;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextLayoutState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u000202ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\u0002022\u0006\u00106\u001a\u000200ø\u0001\u0000¢\u0006\u0004\b7\u00108J0\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ&\u0010C\u001a\u00020#2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u0002022\u0006\u0010I\u001a\u000202J\u0016\u0010J\u001a\u000200*\u000200H\u0002ø\u0001\u0000¢\u0006\u0004\bK\u0010LR/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR/\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R1\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00188F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR;\u0010\u001f\u001a#\u0012\u0004\u0012\u00020!\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\"\u0012\u0004\u0012\u00020#\u0018\u00010 ¢\u0006\u0002\b$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R/\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u000b\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "", "()V", "<set-?>", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coreNodeCoordinates", "getCoreNodeCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setCoreNodeCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "coreNodeCoordinates$delegate", "Landroidx/compose/runtime/MutableState;", "decoratorNodeCoordinates", "getDecoratorNodeCoordinates", "setDecoratorNodeCoordinates", "decoratorNodeCoordinates$delegate", "layoutCache", "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult$delegate", "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;", "Landroidx/compose/ui/unit/Dp;", "minHeightForSingleLineField", "getMinHeightForSingleLineField-D9Ej5fM", "()F", "setMinHeightForSingleLineField-0680j_4", "(F)V", "minHeightForSingleLineField$delegate", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "", "Lkotlin/ExtensionFunctionType;", "getOnTextLayout", "()Lkotlin/jvm/functions/Function2;", "setOnTextLayout", "(Lkotlin/jvm/functions/Function2;)V", "textLayoutNodeCoordinates", "getTextLayoutNodeCoordinates", "setTextLayoutNodeCoordinates", "textLayoutNodeCoordinates$delegate", "getOffsetForPosition", "", "position", "Landroidx/compose/ui/geometry/Offset;", "coerceInVisibleBounds", "", "getOffsetForPosition-3MmeM6k", "(JZ)I", "isPositionOnText", TypedValues.CycleType.S_WAVE_OFFSET, "isPositionOnText-k-4lQ0M", "(J)Z", "layoutWithNewMeasureInputs", "density", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "layoutWithNewMeasureInputs--hBUhpc", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Landroidx/compose/ui/text/TextLayoutResult;", "updateNonMeasureInputs", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "singleLine", "softWrap", "coercedInVisibleBoundsOfInputText", "coercedInVisibleBoundsOfInputText-MK-Hz9U", "(J)J", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text2/input/internal/TextLayoutState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,233:1\n154#2:234\n81#3:235\n81#3:236\n107#3,2:237\n81#3:239\n107#3,2:240\n81#3:242\n107#3,2:243\n81#3:245\n107#3,2:246\n*S KotlinDebug\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text2/input/internal/TextLayoutState\n*L\n79#1:234\n45#1:235\n72#1:236\n72#1:237,2\n73#1:239\n73#1:240,2\n74#1:242\n74#1:243,2\n79#1:245\n79#1:246,2\n*E\n"})
/* loaded from: classes3.dex */
public final class TextLayoutState {
    public static final int $stable = 8;

    /* renamed from: coreNodeCoordinates$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState coreNodeCoordinates;

    /* renamed from: decoratorNodeCoordinates$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState decoratorNodeCoordinates;

    @NotNull
    private TextFieldLayoutStateCache layoutCache;

    /* renamed from: layoutResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final TextFieldLayoutStateCache layoutResult;

    /* renamed from: minHeightForSingleLineField$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState minHeightForSingleLineField;

    @Nullable
    private Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> onTextLayout;

    /* renamed from: textLayoutNodeCoordinates$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState textLayoutNodeCoordinates;

    public TextLayoutState() {
        TextFieldLayoutStateCache textFieldLayoutStateCache = new TextFieldLayoutStateCache();
        this.layoutCache = textFieldLayoutStateCache;
        this.layoutResult = textFieldLayoutStateCache;
        this.textLayoutNodeCoordinates = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.coreNodeCoordinates = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.decoratorNodeCoordinates = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.minHeightForSingleLineField = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C2046Dp.m13664boximpl(C2046Dp.m13666constructorimpl(0)), null, 2, null);
    }

    @Nullable
    public final Function2<Density, Function0<TextLayoutResult>, Unit> getOnTextLayout() {
        return this.onTextLayout;
    }

    public final void setOnTextLayout(@Nullable Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2) {
        this.onTextLayout = function2;
    }

    @Nullable
    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult.getValue();
    }

    @Nullable
    public final LayoutCoordinates getTextLayoutNodeCoordinates() {
        return (LayoutCoordinates) this.textLayoutNodeCoordinates.getValue();
    }

    public final void setTextLayoutNodeCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.textLayoutNodeCoordinates.setValue(layoutCoordinates);
    }

    @Nullable
    public final LayoutCoordinates getCoreNodeCoordinates() {
        return (LayoutCoordinates) this.coreNodeCoordinates.getValue();
    }

    public final void setCoreNodeCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.coreNodeCoordinates.setValue(layoutCoordinates);
    }

    @Nullable
    public final LayoutCoordinates getDecoratorNodeCoordinates() {
        return (LayoutCoordinates) this.decoratorNodeCoordinates.getValue();
    }

    public final void setDecoratorNodeCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.decoratorNodeCoordinates.setValue(layoutCoordinates);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM */
    public final float m8702getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((C2046Dp) this.minHeightForSingleLineField.getValue()).m13680unboximpl();
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4 */
    public final void m8706setMinHeightForSingleLineField0680j_4(float f) {
        this.minHeightForSingleLineField.setValue(C2046Dp.m13664boximpl(f));
    }

    public final void updateNonMeasureInputs(@NotNull TransformedTextFieldState textFieldState, @NotNull TextStyle textStyle, boolean singleLine, boolean softWrap) {
        this.layoutCache.updateNonMeasureInputs(textFieldState, textStyle, singleLine, softWrap);
    }

    @NotNull
    /* renamed from: layoutWithNewMeasureInputs--hBUhpc */
    public final TextLayoutResult m8705layoutWithNewMeasureInputshBUhpc(@NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull FontFamily.Resolver fontFamilyResolver, long constraints) {
        TextLayoutResult textLayoutResultM8694layoutWithNewMeasureInputshBUhpc = this.layoutCache.m8694layoutWithNewMeasureInputshBUhpc(density, layoutDirection, fontFamilyResolver, constraints);
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2 = this.onTextLayout;
        if (function2 != null) {
            function2.invoke(density, new Function0<TextLayoutResult>() { // from class: androidx.compose.foundation.text2.input.internal.TextLayoutState$layoutWithNewMeasureInputs$1$textLayoutProvider$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final TextLayoutResult invoke() {
                    return this.this$0.layoutCache.getValue();
                }
            });
        }
        return textLayoutResultM8694layoutWithNewMeasureInputshBUhpc;
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default */
    public static /* synthetic */ int m8701getOffsetForPosition3MmeM6k$default(TextLayoutState textLayoutState, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return textLayoutState.m8703getOffsetForPosition3MmeM6k(j, z);
    }

    /* renamed from: getOffsetForPosition-3MmeM6k */
    public final int m8703getOffsetForPosition3MmeM6k(long position, boolean coerceInVisibleBounds) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return -1;
        }
        if (coerceInVisibleBounds) {
            position = m8700coercedInVisibleBoundsOfInputTextMKHz9U(position);
        }
        return layoutResult.m13137getOffsetForPositionk4lQ0M(TextLayoutStateKt.m8708fromDecorationToTextLayoutUv8p0NA(this, position));
    }

    /* renamed from: isPositionOnText-k-4lQ0M */
    public final boolean m8704isPositionOnTextk4lQ0M(long j) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        long jM8708fromDecorationToTextLayoutUv8p0NA = TextLayoutStateKt.m8708fromDecorationToTextLayoutUv8p0NA(this, m8700coercedInVisibleBoundsOfInputTextMKHz9U(j));
        int lineForVerticalPosition = layoutResult.getLineForVerticalPosition(Offset.m11100getYimpl(jM8708fromDecorationToTextLayoutUv8p0NA));
        return Offset.m11099getXimpl(jM8708fromDecorationToTextLayoutUv8p0NA) >= layoutResult.getLineLeft(lineForVerticalPosition) && Offset.m11099getXimpl(jM8708fromDecorationToTextLayoutUv8p0NA) <= layoutResult.getLineRight(lineForVerticalPosition);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0022  */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long m8700coercedInVisibleBoundsOfInputTextMKHz9U(long j) {
        Rect zero;
        LayoutCoordinates textLayoutNodeCoordinates = getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (textLayoutNodeCoordinates.isAttached()) {
                LayoutCoordinates decoratorNodeCoordinates = getDecoratorNodeCoordinates();
                zero = null;
                if (decoratorNodeCoordinates != null) {
                    zero = LayoutCoordinates.localBoundingBoxOf$default(decoratorNodeCoordinates, textLayoutNodeCoordinates, false, 2, null);
                }
            } else {
                zero = Rect.INSTANCE.getZero();
            }
            if (zero == null) {
            }
        } else {
            zero = Rect.INSTANCE.getZero();
        }
        return TextLayoutStateKt.m8707coerceIn3MmeM6k(j, zero);
    }
}
