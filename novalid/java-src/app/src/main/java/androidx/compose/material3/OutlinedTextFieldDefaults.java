package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldDefaults.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b)\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JP\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u009c\u0002\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%2\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00180'¢\u0006\u0002\b(2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010'¢\u0006\u0002\b(2\u0015\b\u0002\u0010-\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010'¢\u0006\u0002\b(2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010'¢\u0006\u0002\b(2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010'¢\u0006\u0002\b(2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010'¢\u0006\u0002\b(2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010'¢\u0006\u0002\b(2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010'¢\u0006\u0002\b(2\b\b\u0002\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\u0013\b\u0002\u00105\u001a\r\u0012\u0004\u0012\u00020\u00180'¢\u0006\u0002\b(H\u0007¢\u0006\u0002\u00106J\r\u0010\u001e\u001a\u00020\u0013H\u0007¢\u0006\u0002\u00107JÂ\u0003\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\b\b\u0002\u0010<\u001a\u0002092\b\b\u0002\u0010=\u001a\u0002092\b\b\u0002\u0010>\u001a\u0002092\b\b\u0002\u0010?\u001a\u0002092\b\b\u0002\u0010@\u001a\u0002092\b\b\u0002\u0010A\u001a\u0002092\b\b\u0002\u0010B\u001a\u0002092\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D2\b\b\u0002\u0010E\u001a\u0002092\b\b\u0002\u0010F\u001a\u0002092\b\b\u0002\u0010G\u001a\u0002092\b\b\u0002\u0010H\u001a\u0002092\b\b\u0002\u0010I\u001a\u0002092\b\b\u0002\u0010J\u001a\u0002092\b\b\u0002\u0010K\u001a\u0002092\b\b\u0002\u0010L\u001a\u0002092\b\b\u0002\u0010M\u001a\u0002092\b\b\u0002\u0010N\u001a\u0002092\b\b\u0002\u0010O\u001a\u0002092\b\b\u0002\u0010P\u001a\u0002092\b\b\u0002\u0010Q\u001a\u0002092\b\b\u0002\u0010R\u001a\u0002092\b\b\u0002\u0010S\u001a\u0002092\b\b\u0002\u0010T\u001a\u0002092\b\b\u0002\u0010U\u001a\u0002092\b\b\u0002\u0010V\u001a\u0002092\b\b\u0002\u0010W\u001a\u0002092\b\b\u0002\u0010X\u001a\u0002092\b\b\u0002\u0010Y\u001a\u0002092\b\b\u0002\u0010Z\u001a\u0002092\b\b\u0002\u0010[\u001a\u0002092\b\b\u0002\u0010\\\u001a\u0002092\b\b\u0002\u0010]\u001a\u0002092\b\b\u0002\u0010^\u001a\u0002092\b\b\u0002\u0010_\u001a\u0002092\b\b\u0002\u0010`\u001a\u0002092\b\b\u0002\u0010a\u001a\u0002092\b\b\u0002\u0010b\u001a\u0002092\b\b\u0002\u0010c\u001a\u0002092\b\b\u0002\u0010d\u001a\u000209H\u0007ø\u0001\u0000¢\u0006\u0004\be\u0010fJ8\u00103\u001a\u0002042\b\b\u0002\u0010g\u001a\u00020\u00042\b\b\u0002\u0010h\u001a\u00020\u00042\b\b\u0002\u0010i\u001a\u00020\u00042\b\b\u0002\u0010j\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\bk\u0010lR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u00148AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006m"}, m7105d2 = {"Landroidx/compose/material3/OutlinedTextFieldDefaults;", "", "()V", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultOutlinedTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultOutlinedTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "ContainerBox", "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "focusedBorderThickness", "unfocusedBorderThickness", "ContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "DecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", TtmlNode.RUBY_CONTAINER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", TtmlNode.START, "top", "end", "bottom", "contentPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2400:1\n74#2:2401\n154#3:2402\n154#3:2403\n154#3:2404\n154#3:2405\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults\n*L\n1655#1:2401\n1416#1:2402\n1422#1:2403\n1427#1:2404\n1432#1:2405\n*E\n"})
/* loaded from: classes2.dex */
public final class OutlinedTextFieldDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final OutlinedTextFieldDefaults INSTANCE = new OutlinedTextFieldDefaults();
    private static final float MinHeight = C2046Dp.m13666constructorimpl(56);
    private static final float MinWidth = C2046Dp.m13666constructorimpl(280);
    private static final float UnfocusedBorderThickness = C2046Dp.m13666constructorimpl(1);
    private static final float FocusedBorderThickness = C2046Dp.m13666constructorimpl(2);

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2 */
    public static final class C15362 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $container;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15362(String str, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function29, int i, int i2, int i3) {
            super(2);
            str = str;
            function2 = function2;
            z = z;
            z = z2;
            visualTransformation = visualTransformation;
            interactionSource = interactionSource;
            z = z3;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            function2 = function25;
            function2 = function26;
            function2 = function27;
            function2 = function28;
            textFieldColors = textFieldColors;
            paddingValues = paddingValues;
            function2 = function29;
            i = i;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, function2, function2, function2, textFieldColors, paddingValues, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    private OutlinedTextFieldDefaults() {
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1066756961);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1066756961, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:1409)");
        }
        Shape value = ShapesKt.getValue(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* renamed from: getMinHeight-D9Ej5fM */
    public final float m9629getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM */
    public final float m9630getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM */
    public final float m9631getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM */
    public final float m9628getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX WARN: Removed duplicated region for block: B:246:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01b3  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterial3Api
    /* renamed from: ContainerBox-nbWgWpA */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9625ContainerBoxnbWgWpA(final boolean z, final boolean z2, @NotNull final InteractionSource interactionSource, @NotNull final TextFieldColors textFieldColors, @Nullable Shape shape, float f, float f2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Shape value;
        float f3;
        float f4;
        final Shape shape2;
        final float f5;
        final float f6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1461761386);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(textFieldColors) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            if ((i2 & 16) == 0) {
                value = shape;
                int i4 = composerStartRestartGroup.changed(value) ? 16384 : 8192;
                i3 |= i4;
            } else {
                value = shape;
            }
            i3 |= i4;
        } else {
            value = shape;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                f3 = f;
                int i5 = composerStartRestartGroup.changed(f3) ? 131072 : 65536;
                i3 |= i5;
            } else {
                f3 = f;
            }
            i3 |= i5;
        } else {
            f3 = f;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f4 = f2;
                int i6 = composerStartRestartGroup.changed(f4) ? 1048576 : 524288;
                i3 |= i6;
            } else {
                f4 = f2;
            }
            i3 |= i6;
        } else {
            f4 = f2;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(this) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
                Shape shape3 = value;
                float f7 = f3;
                float f8 = f4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i7 = i3 & 8190;
                int i8 = i3 >> 3;
                BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(BorderKt.border(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m10013animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, textFieldColors, f7, f8, composerStartRestartGroup, (57344 & i8) | i7 | (i8 & 458752)).getValue(), shape3), textFieldColors.containerColor$material3_release(z, z2, interactionSource, composerStartRestartGroup, i7).getValue().m11350unboximpl(), shape3), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                shape2 = shape3;
                f5 = f7;
                f6 = f8;
            } else {
                if ((i2 & 16) != 0) {
                    value = ShapesKt.getValue(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    f3 = FocusedBorderThickness;
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    f4 = UnfocusedBorderThickness;
                    i3 &= -3670017;
                }
                Shape shape32 = value;
                float f72 = f3;
                float f82 = f4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461761386, i3, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1459)");
                }
                int i72 = i3 & 8190;
                int i82 = i3 >> 3;
                BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(BorderKt.border(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m10013animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, textFieldColors, f72, f82, composerStartRestartGroup, (57344 & i82) | i72 | (i82 & 458752)).getValue(), shape32), textFieldColors.containerColor$material3_release(z, z2, interactionSource, composerStartRestartGroup, i72).getValue().m11350unboximpl(), shape32), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape2 = shape32;
                f5 = f72;
                f6 = f82;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            shape2 = value;
            f5 = f3;
            f6 = f4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$ContainerBox$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    this.$tmp0_rcvr.m9625ContainerBoxnbWgWpA(z, z2, interactionSource, textFieldColors, shape2, f5, f6, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* renamed from: contentPadding-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m9624contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return outlinedTextFieldDefaults.m9627contentPaddinga9UjIt4(f, f2, f3, f4);
    }

    @NotNull
    /* renamed from: contentPadding-a9UjIt4 */
    public final PaddingValues m9627contentPaddinga9UjIt4(float f, float top, float end, float bottom) {
        return PaddingKt.m8119PaddingValuesa9UjIt4(f, top, end, bottom);
    }

    @Composable
    @NotNull
    public final TextFieldColors colors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-471651810);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-471651810, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1492)");
        }
        TextFieldColors defaultOutlinedTextFieldColors = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultOutlinedTextFieldColors;
    }

    @Composable
    @NotNull
    /* renamed from: colors-0hiis_0 */
    public final TextFieldColors m9626colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, @Nullable SelectionColors selectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, @Nullable Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        composer.startReplaceableGroup(1767617725);
        long jM11376getUnspecified0d7_KjU = (i6 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i6 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i6 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i6 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        long jM11376getUnspecified0d7_KjU5 = (i6 & 16) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j5;
        long jM11376getUnspecified0d7_KjU6 = (i6 & 32) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j6;
        long jM11376getUnspecified0d7_KjU7 = (i6 & 64) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j7;
        long jM11376getUnspecified0d7_KjU8 = (i6 & 128) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j8;
        long jM11376getUnspecified0d7_KjU9 = (i6 & 256) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j9;
        long jM11376getUnspecified0d7_KjU10 = (i6 & 512) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j10;
        SelectionColors selectionColors2 = (i6 & 1024) != 0 ? null : selectionColors;
        long jM11376getUnspecified0d7_KjU11 = (i6 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j11;
        long jM11376getUnspecified0d7_KjU12 = (i6 & 4096) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j12;
        long jM11376getUnspecified0d7_KjU13 = (i6 & 8192) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j13;
        long jM11376getUnspecified0d7_KjU14 = (i6 & 16384) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j14;
        long jM11376getUnspecified0d7_KjU15 = (32768 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j15;
        long jM11376getUnspecified0d7_KjU16 = (65536 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j16;
        long jM11376getUnspecified0d7_KjU17 = (131072 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j17;
        long jM11376getUnspecified0d7_KjU18 = (262144 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j18;
        long jM11376getUnspecified0d7_KjU19 = (524288 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j19;
        long jM11376getUnspecified0d7_KjU20 = (1048576 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j20;
        long jM11376getUnspecified0d7_KjU21 = (2097152 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j21;
        long jM11376getUnspecified0d7_KjU22 = (4194304 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j22;
        long jM11376getUnspecified0d7_KjU23 = (8388608 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j23;
        long jM11376getUnspecified0d7_KjU24 = (16777216 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j24;
        long jM11376getUnspecified0d7_KjU25 = (33554432 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j25;
        long jM11376getUnspecified0d7_KjU26 = (67108864 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j26;
        long jM11376getUnspecified0d7_KjU27 = (134217728 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j27;
        long jM11376getUnspecified0d7_KjU28 = (268435456 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j28;
        long jM11376getUnspecified0d7_KjU29 = (536870912 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j29;
        long jM11376getUnspecified0d7_KjU30 = (i6 & 1073741824) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j30;
        long jM11376getUnspecified0d7_KjU31 = (i7 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j31;
        long jM11376getUnspecified0d7_KjU32 = (i7 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j32;
        long jM11376getUnspecified0d7_KjU33 = (i7 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j33;
        long jM11376getUnspecified0d7_KjU34 = (i7 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j34;
        long jM11376getUnspecified0d7_KjU35 = (i7 & 16) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j35;
        long jM11376getUnspecified0d7_KjU36 = (i7 & 32) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j36;
        long jM11376getUnspecified0d7_KjU37 = (i7 & 64) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j37;
        long jM11376getUnspecified0d7_KjU38 = (i7 & 128) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j38;
        long jM11376getUnspecified0d7_KjU39 = (i7 & 256) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j39;
        long jM11376getUnspecified0d7_KjU40 = (i7 & 512) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j40;
        long jM11376getUnspecified0d7_KjU41 = (i7 & 1024) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j41;
        long jM11376getUnspecified0d7_KjU42 = (i7 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j42;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1767617725, i, i2, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1593)");
        }
        TextFieldColors textFieldColorsM9941copyejIjP34 = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i5 >> 6) & 112).m9941copyejIjP34(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU4, jM11376getUnspecified0d7_KjU5, jM11376getUnspecified0d7_KjU6, jM11376getUnspecified0d7_KjU7, jM11376getUnspecified0d7_KjU8, jM11376getUnspecified0d7_KjU9, jM11376getUnspecified0d7_KjU10, selectionColors2, jM11376getUnspecified0d7_KjU11, jM11376getUnspecified0d7_KjU12, jM11376getUnspecified0d7_KjU13, jM11376getUnspecified0d7_KjU14, jM11376getUnspecified0d7_KjU15, jM11376getUnspecified0d7_KjU16, jM11376getUnspecified0d7_KjU17, jM11376getUnspecified0d7_KjU18, jM11376getUnspecified0d7_KjU19, jM11376getUnspecified0d7_KjU20, jM11376getUnspecified0d7_KjU21, jM11376getUnspecified0d7_KjU22, jM11376getUnspecified0d7_KjU23, jM11376getUnspecified0d7_KjU24, jM11376getUnspecified0d7_KjU25, jM11376getUnspecified0d7_KjU26, jM11376getUnspecified0d7_KjU27, jM11376getUnspecified0d7_KjU28, jM11376getUnspecified0d7_KjU29, jM11376getUnspecified0d7_KjU30, jM11376getUnspecified0d7_KjU31, jM11376getUnspecified0d7_KjU32, jM11376getUnspecified0d7_KjU33, jM11376getUnspecified0d7_KjU34, jM11376getUnspecified0d7_KjU35, jM11376getUnspecified0d7_KjU36, jM11376getUnspecified0d7_KjU37, jM11376getUnspecified0d7_KjU38, jM11376getUnspecified0d7_KjU39, jM11376getUnspecified0d7_KjU40, jM11376getUnspecified0d7_KjU41, jM11376getUnspecified0d7_KjU42);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM9941copyejIjP34;
    }

    @Composable
    @JvmName(name = "getDefaultOutlinedTextFieldColors")
    @NotNull
    public final TextFieldColors getDefaultOutlinedTextFieldColors(@NotNull ColorScheme colorScheme, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-292363577);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-292363577, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1641)");
        }
        TextFieldColors defaultOutlinedTextFieldColorsCached = colorScheme.getDefaultOutlinedTextFieldColorsCached();
        if (defaultOutlinedTextFieldColorsCached == null) {
            OutlinedTextFieldTokens outlinedTextFieldTokens = OutlinedTextFieldTokens.INSTANCE;
            long jFromToken = ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusInputColor());
            long jFromToken2 = ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputColor());
            long jM11339copywmQWz5c$default = Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long jFromToken3 = ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorInputColor());
            Color.Companion companion = Color.INSTANCE;
            defaultOutlinedTextFieldColorsCached = new TextFieldColors(jFromToken, jFromToken2, jM11339copywmQWz5c$default, jFromToken3, companion.m11375getTransparent0d7_KjU(), companion.m11375getTransparent0d7_KjU(), companion.m11375getTransparent0d7_KjU(), companion.m11375getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getCaretColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorFocusCaretColor()), (SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusOutlineColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getOutlineColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledOutlineColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorOutlineColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getLeadingIconColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getTrailingIconColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getLabelColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledLabelColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPlaceholderColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getSupportingColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(outlinedTextFieldTokens.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), null);
            colorScheme.setDefaultOutlinedTextFieldColorsCached$material3_release(defaultOutlinedTextFieldColorsCached);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultOutlinedTextFieldColorsCached;
    }

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1 */
    public static final class C15351 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15351(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors) {
            super(2);
            z = z;
            z = z2;
            interactionSource = interactionSource;
            textFieldColors = textFieldColors;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1448570018, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                }
                OutlinedTextFieldDefaults.INSTANCE.m9625ContainerBoxnbWgWpA(z, z, interactionSource, textFieldColors, null, 0.0f, 0.0f, composer, 12582912, 112);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:285:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:517:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DecorationBox(@NotNull String str, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, boolean z, boolean z2, @NotNull VisualTransformation visualTransformation, @NotNull InteractionSource interactionSource, boolean z3, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, @Nullable Function2<? super Composer, ? super Integer, Unit> function25, @Nullable Function2<? super Composer, ? super Integer, Unit> function26, @Nullable Function2<? super Composer, ? super Integer, Unit> function27, @Nullable Function2<? super Composer, ? super Integer, Unit> function28, @Nullable TextFieldColors textFieldColors, @Nullable PaddingValues paddingValues, @Nullable Function2<? super Composer, ? super Integer, Unit> function29, @Nullable Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        TextFieldColors textFieldColorsColors;
        PaddingValues paddingValuesM9624contentPaddinga9UjIt4$default;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        Function2<? super Composer, ? super Integer, Unit> function217;
        int i15;
        boolean z5;
        PaddingValues paddingValues2;
        Function2<? super Composer, ? super Integer, Unit> function218;
        Function2<? super Composer, ? super Integer, Unit> function219;
        Function2<? super Composer, ? super Integer, Unit> function220;
        TextFieldColors textFieldColors2;
        Function2<? super Composer, ? super Integer, Unit> function221;
        Function2<? super Composer, ? super Integer, Unit> function222;
        Function2<? super Composer, ? super Integer, Unit> function223;
        Function2<? super Composer, ? super Integer, Unit> function224;
        Function2<? super Composer, ? super Integer, Unit> function225;
        Function2<? super Composer, ? super Integer, Unit> function226;
        boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-350442135);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                int i16 = 8192;
                if ((i3 & 16) != 0) {
                    i4 |= CpioConstants.C_ISBLK;
                } else {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        i4 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                    }
                    if ((i3 & 32) == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i5 = i3 & 64;
                    if (i5 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i6 = i3 & 128;
                    if (i6 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                    }
                    i7 = i3 & 256;
                    if (i7 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                    }
                    i9 = i3 & 1024;
                    if (i9 == 0) {
                        i10 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i10 = i2 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                    } else {
                        i10 = i2;
                    }
                    i11 = i3 & 2048;
                    if (i11 == 0) {
                        i10 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i10 |= composerStartRestartGroup.changedInstance(function26) ? 32 : 16;
                    }
                    int i17 = i10;
                    i12 = i3 & 4096;
                    if (i12 == 0) {
                        i17 |= 384;
                    } else {
                        if ((i2 & 384) == 0) {
                            i17 |= composerStartRestartGroup.changedInstance(function27) ? 256 : 128;
                        }
                        i13 = i3 & 8192;
                        if (i13 == 0) {
                            if ((i2 & 3072) == 0) {
                                i17 |= composerStartRestartGroup.changedInstance(function28) ? 2048 : 1024;
                            }
                            if ((i2 & CpioConstants.C_ISBLK) == 0) {
                                if ((i3 & 16384) == 0 && composerStartRestartGroup.changed(textFieldColors)) {
                                    i16 = 16384;
                                }
                                i17 |= i16;
                            }
                            if ((i2 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                                i17 |= ((i3 & 32768) == 0 && composerStartRestartGroup.changed(paddingValues)) ? 131072 : 65536;
                            }
                            i14 = i3 & 65536;
                            if (i14 == 0) {
                                i17 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                i17 |= composerStartRestartGroup.changedInstance(function29) ? 1048576 : 524288;
                            }
                            if ((i3 & 131072) == 0) {
                                i17 |= 12582912;
                            } else if ((i2 & 12582912) == 0) {
                                i17 |= composerStartRestartGroup.changed(this) ? 8388608 : 4194304;
                            }
                            if ((i4 & 306783379) == 306783378 || (4793491 & i17) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    boolean z7 = i5 == 0 ? false : z3;
                                    function210 = i6 == 0 ? null : function22;
                                    function211 = i7 == 0 ? null : function23;
                                    Function2<? super Composer, ? super Integer, Unit> function227 = i8 == 0 ? null : function24;
                                    Function2<? super Composer, ? super Integer, Unit> function228 = i9 == 0 ? null : function25;
                                    Function2<? super Composer, ? super Integer, Unit> function229 = i11 == 0 ? null : function26;
                                    function212 = i12 == 0 ? null : function27;
                                    function213 = i13 == 0 ? function28 : null;
                                    if ((i3 & 16384) == 0) {
                                        textFieldColorsColors = colors(composerStartRestartGroup, (i17 >> 21) & 14);
                                        i17 &= -57345;
                                    } else {
                                        textFieldColorsColors = textFieldColors;
                                    }
                                    if ((i3 & 32768) == 0) {
                                        paddingValuesM9624contentPaddinga9UjIt4$default = m9624contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        i17 &= -458753;
                                    } else {
                                        paddingValuesM9624contentPaddinga9UjIt4$default = paddingValues;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function230 = function227;
                                    if (i14 == 0) {
                                        function214 = function229;
                                        Function2<? super Composer, ? super Integer, Unit> function231 = function228;
                                        z4 = z7;
                                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                            public final /* synthetic */ TextFieldColors $colors;
                                            public final /* synthetic */ boolean $enabled;
                                            public final /* synthetic */ InteractionSource $interactionSource;
                                            public final /* synthetic */ boolean $isError;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C15351(boolean z8, boolean z72, InteractionSource interactionSource2, TextFieldColors textFieldColorsColors2) {
                                                super(2);
                                                z = z8;
                                                z = z72;
                                                interactionSource = interactionSource2;
                                                textFieldColors = textFieldColorsColors2;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer2, int i18) {
                                                if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1448570018, i18, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                    }
                                                    OutlinedTextFieldDefaults.INSTANCE.m9625ContainerBoxnbWgWpA(z, z, interactionSource, textFieldColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        });
                                        function215 = function230;
                                        function216 = function231;
                                        function217 = composableLambda;
                                    } else {
                                        Function2<? super Composer, ? super Integer, Unit> function232 = function228;
                                        z4 = z72;
                                        function214 = function229;
                                        function215 = function230;
                                        function216 = function232;
                                        function217 = function29;
                                    }
                                    i15 = i17;
                                    z5 = z4;
                                    paddingValues2 = paddingValuesM9624contentPaddinga9UjIt4$default;
                                    function218 = function214;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16384) != 0) {
                                        i17 &= -57345;
                                    }
                                    if ((32768 & i3) != 0) {
                                        i17 &= -458753;
                                    }
                                    z5 = z3;
                                    function210 = function22;
                                    function211 = function23;
                                    function215 = function24;
                                    function216 = function25;
                                    function212 = function27;
                                    function213 = function28;
                                    textFieldColorsColors2 = textFieldColors;
                                    paddingValues2 = paddingValues;
                                    function217 = function29;
                                    i15 = i17;
                                    function218 = function26;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-350442135, i4, i15, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                                }
                                int i18 = i4 << 3;
                                int i19 = i4 >> 3;
                                int i20 = i4 >> 9;
                                int i21 = i15 << 21;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function210, function211, function215, function216, function218, function212, function213, z2, z8, z5, interactionSource2, paddingValues2, textFieldColorsColors2, function217, composerStartRestartGroup, (i18 & 896) | (i18 & 112) | 6 | (i19 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), (i4 & 896) | ((i15 >> 9) & 14) | ((i4 >> 6) & 112) | (i20 & 7168) | (57344 & i19) | (458752 & i15) | ((i15 << 6) & 3670016) | ((i15 << 3) & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function219 = function216;
                                function220 = function212;
                                textFieldColors2 = textFieldColorsColors2;
                                function221 = function211;
                                function222 = function213;
                                function223 = function217;
                                function224 = function215;
                                function225 = function218;
                                function226 = function210;
                                z6 = z5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z6 = z3;
                                function226 = function22;
                                function221 = function23;
                                function224 = function24;
                                function219 = function25;
                                function225 = function26;
                                function220 = function27;
                                function222 = function28;
                                textFieldColors2 = textFieldColors;
                                paddingValues2 = paddingValues;
                                function223 = function29;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
                                    public final /* synthetic */ int $$changed;
                                    public final /* synthetic */ int $$changed1;
                                    public final /* synthetic */ int $$default;
                                    public final /* synthetic */ TextFieldColors $colors;
                                    public final /* synthetic */ Function2<Composer, Integer, Unit> $container;
                                    public final /* synthetic */ PaddingValues $contentPadding;
                                    public final /* synthetic */ boolean $enabled;
                                    public final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
                                    public final /* synthetic */ InteractionSource $interactionSource;
                                    public final /* synthetic */ boolean $isError;
                                    public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                    public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                    public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                    public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                    public final /* synthetic */ boolean $singleLine;
                                    public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                    public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                    public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                    public final /* synthetic */ String $value;
                                    public final /* synthetic */ VisualTransformation $visualTransformation;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public C15362(String str2, Function2<? super Composer, ? super Integer, Unit> function233, boolean z8, boolean z22, VisualTransformation visualTransformation2, InteractionSource interactionSource2, boolean z62, Function2<? super Composer, ? super Integer, Unit> function2262, Function2<? super Composer, ? super Integer, Unit> function2212, Function2<? super Composer, ? super Integer, Unit> function2242, Function2<? super Composer, ? super Integer, Unit> function2192, Function2<? super Composer, ? super Integer, Unit> function2252, Function2<? super Composer, ? super Integer, Unit> function2202, Function2<? super Composer, ? super Integer, Unit> function2222, TextFieldColors textFieldColors22, PaddingValues paddingValues22, Function2<? super Composer, ? super Integer, Unit> function2232, int i22, int i23, int i32) {
                                        super(2);
                                        str = str2;
                                        function2 = function233;
                                        z = z8;
                                        z = z22;
                                        visualTransformation = visualTransformation2;
                                        interactionSource = interactionSource2;
                                        z = z62;
                                        function2 = function2262;
                                        function2 = function2212;
                                        function2 = function2242;
                                        function2 = function2192;
                                        function2 = function2252;
                                        function2 = function2202;
                                        function2 = function2222;
                                        textFieldColors = textFieldColors22;
                                        paddingValues = paddingValues22;
                                        function2 = function2232;
                                        i = i22;
                                        i = i23;
                                        i = i32;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer2, int i22) {
                                        OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, function2, function2, function2, textFieldColors, paddingValues, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i17 |= 3072;
                        if ((i23 & CpioConstants.C_ISBLK) == 0) {
                        }
                        if ((i23 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        }
                        i14 = i32 & 65536;
                        if (i14 == 0) {
                        }
                        if ((i32 & 131072) == 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i22 & 1) != 0) {
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if ((i32 & 16384) == 0) {
                                }
                                if ((i32 & 32768) == 0) {
                                }
                                Function2<? super Composer, ? super Integer, Unit> function2302 = function227;
                                if (i14 == 0) {
                                }
                                i15 = i17;
                                z5 = z4;
                                paddingValues22 = paddingValuesM9624contentPaddinga9UjIt4$default;
                                function218 = function214;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i182 = i4 << 3;
                                int i192 = i4 >> 3;
                                int i202 = i4 >> 9;
                                int i212 = i15 << 21;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str2, function233, visualTransformation2, function210, function211, function215, function216, function218, function212, function213, z22, z8, z5, interactionSource2, paddingValues22, textFieldColorsColors2, function217, composerStartRestartGroup, (i182 & 896) | (i182 & 112) | 6 | (i192 & 7168) | (i202 & 57344) | (i202 & 458752) | (i202 & 3670016) | (i212 & 29360128) | (i212 & 234881024) | (i212 & 1879048192), (i4 & 896) | ((i15 >> 9) & 14) | ((i4 >> 6) & 112) | (i202 & 7168) | (57344 & i192) | (458752 & i15) | ((i15 << 6) & 3670016) | ((i15 << 3) & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function2192 = function216;
                                function2202 = function212;
                                textFieldColors22 = textFieldColorsColors2;
                                function2212 = function211;
                                function2222 = function213;
                                function2232 = function217;
                                function2242 = function215;
                                function2252 = function218;
                                function2262 = function210;
                                z62 = z5;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i13 = i32 & 8192;
                    if (i13 == 0) {
                    }
                    if ((i23 & CpioConstants.C_ISBLK) == 0) {
                    }
                    if ((i23 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    }
                    i14 = i32 & 65536;
                    if (i14 == 0) {
                    }
                    if ((i32 & 131072) == 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i32 & 32) == 0) {
                }
                i5 = i32 & 64;
                if (i5 == 0) {
                }
                i6 = i32 & 128;
                if (i6 == 0) {
                }
                i7 = i32 & 256;
                if (i7 == 0) {
                }
                i8 = i32 & 512;
                if (i8 == 0) {
                }
                i9 = i32 & 1024;
                if (i9 == 0) {
                }
                i11 = i32 & 2048;
                if (i11 == 0) {
                }
                int i172 = i10;
                i12 = i32 & 4096;
                if (i12 == 0) {
                }
                i13 = i32 & 8192;
                if (i13 == 0) {
                }
                if ((i23 & CpioConstants.C_ISBLK) == 0) {
                }
                if ((i23 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                }
                i14 = i32 & 65536;
                if (i14 == 0) {
                }
                if ((i32 & 131072) == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            int i162 = 8192;
            if ((i32 & 16) != 0) {
            }
            if ((i32 & 32) == 0) {
            }
            i5 = i32 & 64;
            if (i5 == 0) {
            }
            i6 = i32 & 128;
            if (i6 == 0) {
            }
            i7 = i32 & 256;
            if (i7 == 0) {
            }
            i8 = i32 & 512;
            if (i8 == 0) {
            }
            i9 = i32 & 1024;
            if (i9 == 0) {
            }
            i11 = i32 & 2048;
            if (i11 == 0) {
            }
            int i1722 = i10;
            i12 = i32 & 4096;
            if (i12 == 0) {
            }
            i13 = i32 & 8192;
            if (i13 == 0) {
            }
            if ((i23 & CpioConstants.C_ISBLK) == 0) {
            }
            if ((i23 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            }
            i14 = i32 & 65536;
            if (i14 == 0) {
            }
            if ((i32 & 131072) == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i32 & 4) == 0) {
        }
        if ((i32 & 8) == 0) {
        }
        int i1622 = 8192;
        if ((i32 & 16) != 0) {
        }
        if ((i32 & 32) == 0) {
        }
        i5 = i32 & 64;
        if (i5 == 0) {
        }
        i6 = i32 & 128;
        if (i6 == 0) {
        }
        i7 = i32 & 256;
        if (i7 == 0) {
        }
        i8 = i32 & 512;
        if (i8 == 0) {
        }
        i9 = i32 & 1024;
        if (i9 == 0) {
        }
        i11 = i32 & 2048;
        if (i11 == 0) {
        }
        int i17222 = i10;
        i12 = i32 & 4096;
        if (i12 == 0) {
        }
        i13 = i32 & 8192;
        if (i13 == 0) {
        }
        if ((i23 & CpioConstants.C_ISBLK) == 0) {
        }
        if ((i23 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
        }
        i14 = i32 & 65536;
        if (i14 == 0) {
        }
        if ((i32 & 131072) == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
