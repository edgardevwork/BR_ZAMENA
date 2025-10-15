package androidx.compose.material;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.p003ui.ComposedModifierKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldDefaults.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JP\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%J×\u0001\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u0002042\u0013\b\u0002\u00105\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+H\u0007¢\u0006\u0002\u00106JÂ\u0001\u00107\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u000204H\u0007¢\u0006\u0002\u00108Jä\u0001\u00109\u001a\u00020 2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020;2\b\b\u0002\u0010?\u001a\u00020;2\b\b\u0002\u0010@\u001a\u00020;2\b\b\u0002\u0010A\u001a\u00020;2\b\b\u0002\u0010B\u001a\u00020;2\b\b\u0002\u0010C\u001a\u00020;2\b\b\u0002\u0010D\u001a\u00020;2\b\b\u0002\u0010E\u001a\u00020;2\b\b\u0002\u0010F\u001a\u00020;2\b\b\u0002\u0010G\u001a\u00020;2\b\b\u0002\u0010H\u001a\u00020;2\b\b\u0002\u0010I\u001a\u00020;2\b\b\u0002\u0010J\u001a\u00020;2\b\b\u0002\u0010K\u001a\u00020;2\b\b\u0002\u0010L\u001a\u00020;2\b\b\u0002\u0010M\u001a\u00020;2\b\b\u0002\u0010N\u001a\u00020;2\b\b\u0002\u0010O\u001a\u00020;H\u0007ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ:\u0010R\u001a\u0002042\b\b\u0002\u0010S\u001a\u00020\u00062\b\b\u0002\u0010T\u001a\u00020\u00062\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\bW\u0010XJä\u0001\u0010Y\u001a\u00020 2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020;2\b\b\u0002\u0010?\u001a\u00020;2\b\b\u0002\u0010Z\u001a\u00020;2\b\b\u0002\u0010[\u001a\u00020;2\b\b\u0002\u0010\\\u001a\u00020;2\b\b\u0002\u0010]\u001a\u00020;2\b\b\u0002\u0010D\u001a\u00020;2\b\b\u0002\u0010E\u001a\u00020;2\b\b\u0002\u0010F\u001a\u00020;2\b\b\u0002\u0010G\u001a\u00020;2\b\b\u0002\u0010H\u001a\u00020;2\b\b\u0002\u0010I\u001a\u00020;2\b\b\u0002\u0010J\u001a\u00020;2\b\b\u0002\u0010K\u001a\u00020;2\b\b\u0002\u0010L\u001a\u00020;2\b\b\u0002\u0010M\u001a\u00020;2\b\b\u0002\u0010N\u001a\u00020;2\b\b\u0002\u0010O\u001a\u00020;H\u0007ø\u0001\u0000¢\u0006\u0004\b^\u0010QJ:\u0010_\u001a\u0002042\b\b\u0002\u0010S\u001a\u00020\u00062\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010T\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b`\u0010XJ:\u0010a\u001a\u0002042\b\b\u0002\u0010S\u001a\u00020\u00062\b\b\u0002\u0010T\u001a\u00020\u00062\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\bb\u0010XJJ\u0010c\u001a\u00020d*\u00020d2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010e\u001a\u00020\u00062\b\b\u0002\u0010f\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\bg\u0010hR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\f\u0010\bR\u0019\u0010\r\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\u0015\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0016\u0010\bR\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, m7105d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "()V", "BackgroundOpacity", "", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "IconOpacity", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "OutlinedTextFieldShape", "Landroidx/compose/ui/graphics/Shape;", "getOutlinedTextFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "TextFieldShape", "getTextFieldShape", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedIndicatorLineOpacity", "BorderBox", "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "BorderBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "OutlinedTextFieldDecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", OutlinedTextFieldKt.BorderId, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "outlinedTextFieldColors", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "outlinedTextFieldPadding", TtmlNode.START, "top", "end", "bottom", "outlinedTextFieldPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-dx8h9Zs", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "indicatorLine", "Landroidx/compose/ui/Modifier;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,906:1\n135#2:907\n74#3:908\n74#3:909\n154#4:910\n154#4:911\n154#4:912\n154#4:913\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n*L\n291#1:907\n396#1:908\n454#1:909\n214#1:910\n220#1:911\n249#1:912\n255#1:913\n*E\n"})
/* loaded from: classes2.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    public static final float BackgroundOpacity = 0.12f;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;

    @NotNull
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = C2046Dp.m13666constructorimpl(56);
    private static final float MinWidth = C2046Dp.m13666constructorimpl(280);
    private static final float UnfocusedBorderThickness = C2046Dp.m13666constructorimpl(1);
    private static final float FocusedBorderThickness = C2046Dp.m13666constructorimpl(2);

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$2 */
    public static final class C12342 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $border;
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12342(String str, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function26, int i, int i2, int i3) {
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
            textFieldColors = textFieldColors;
            paddingValues = paddingValues;
            function2 = function26;
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
            TextFieldDefaults.this.OutlinedTextFieldDecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, textFieldColors, paddingValues, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1 */
    public static final class C12351 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12351(String str, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, TextFieldColors textFieldColors, PaddingValues paddingValues, int i, int i2, int i3) {
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
            textFieldColors = textFieldColors;
            paddingValues = paddingValues;
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
            TextFieldDefaults.this.TextFieldDecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, textFieldColors, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    private TextFieldDefaults() {
    }

    /* renamed from: getMinHeight-D9Ej5fM */
    public final float m9064getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM */
    public final float m9065getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @JvmName(name = "getTextFieldShape")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public final Shape getTextFieldShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1117199624, i, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:233)");
        }
        CornerBasedShape cornerBasedShapeCopy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cornerBasedShapeCopy$default;
    }

    @JvmName(name = "getOutlinedTextFieldShape")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public final Shape getOutlinedTextFieldShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899109048, i, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:242)");
        }
        CornerBasedShape small = MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return small;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM */
    public final float m9066getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM */
    public final float m9063getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX WARN: Removed duplicated region for block: B:220:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    /* renamed from: BorderBox-nbWgWpA */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9062BorderBoxnbWgWpA(final boolean z, final boolean z2, @NotNull final InteractionSource interactionSource, @NotNull final TextFieldColors textFieldColors, @Nullable Shape shape, float f, float f2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Shape outlinedTextFieldShape;
        float f3;
        float f4;
        Shape shape2;
        float f5;
        float f6;
        final Shape shape3;
        final float f7;
        final float f8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(943754022);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(textFieldColors) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            if ((i2 & 16) == 0) {
                outlinedTextFieldShape = shape;
                int i5 = composerStartRestartGroup.changed(outlinedTextFieldShape) ? 16384 : 8192;
                i3 |= i5;
            } else {
                outlinedTextFieldShape = shape;
            }
            i3 |= i5;
        } else {
            outlinedTextFieldShape = shape;
        }
        if ((i & 458752) == 0) {
            if ((i2 & 32) == 0) {
                f3 = f;
                int i6 = composerStartRestartGroup.changed(f3) ? 131072 : 65536;
                i3 |= i6;
            } else {
                f3 = f;
            }
            i3 |= i6;
        } else {
            f3 = f;
        }
        if ((3670016 & i) == 0) {
            if ((i2 & 64) == 0) {
                f4 = f2;
                int i7 = composerStartRestartGroup.changed(f4) ? 1048576 : 524288;
                i3 |= i7;
            } else {
                f4 = f2;
            }
            i3 |= i7;
        } else {
            f4 = f2;
        }
        if ((i2 & 128) == 0) {
            i4 = (29360128 & i) == 0 ? composerStartRestartGroup.changed(this) ? 8388608 : 4194304 : 12582912;
            if ((23967451 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
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
                } else {
                    if ((i2 & 16) != 0) {
                        outlinedTextFieldShape = getOutlinedTextFieldShape(composerStartRestartGroup, (i3 >> 21) & 14);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        f3 = FocusedBorderThickness;
                    }
                    if ((i2 & 64) == 0) {
                        i3 &= -3670017;
                        shape2 = outlinedTextFieldShape;
                        f5 = UnfocusedBorderThickness;
                        f6 = f3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(943754022, i3, -1, "androidx.compose.material.TextFieldDefaults.BorderBox (TextFieldDefaults.kt:335)");
                    }
                    int i8 = i3 & 8190;
                    int i9 = i3 >> 3;
                    Shape shape4 = shape2;
                    BoxKt.Box(BorderKt.border(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m9074animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, textFieldColors, f6, f5, composerStartRestartGroup, i8 | (57344 & i9) | (i9 & 458752)).getValue(), shape4), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = shape4;
                    f7 = f6;
                    f8 = f5;
                }
                shape2 = outlinedTextFieldShape;
                f6 = f3;
                f5 = f4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i82 = i3 & 8190;
                int i92 = i3 >> 3;
                Shape shape42 = shape2;
                BoxKt.Box(BorderKt.border(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m9074animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, textFieldColors, f6, f5, composerStartRestartGroup, i82 | (57344 & i92) | (i92 & 458752)).getValue(), shape42), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                shape3 = shape42;
                f7 = f6;
                f8 = f5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                f7 = f3;
                f8 = f4;
                shape3 = outlinedTextFieldShape;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$BorderBox$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i10) {
                        this.$tmp0_rcvr.m9062BorderBoxnbWgWpA(z, z2, interactionSource, textFieldColors, shape3, f7, f8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= i4;
        if ((23967451 & i3) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) == 0) {
                    shape2 = outlinedTextFieldShape;
                    f6 = f3;
                    f5 = f4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i822 = i3 & 8190;
                int i922 = i3 >> 3;
                Shape shape422 = shape2;
                BoxKt.Box(BorderKt.border(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m9074animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, textFieldColors, f6, f5, composerStartRestartGroup, i822 | (57344 & i922) | (i922 & 458752)).getValue(), shape422), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                shape3 = shape422;
                f7 = f6;
                f8 = f5;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m9060textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m9071textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @ExperimentalMaterialApi
    @NotNull
    /* renamed from: textFieldWithLabelPadding-a9UjIt4 */
    public final PaddingValues m9071textFieldWithLabelPaddinga9UjIt4(float f, float end, float top, float bottom) {
        return PaddingKt.m8119PaddingValuesa9UjIt4(f, top, end, bottom);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m9061textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return textFieldDefaults.m9072textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @ExperimentalMaterialApi
    @NotNull
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4 */
    public final PaddingValues m9072textFieldWithoutLabelPaddinga9UjIt4(float f, float top, float end, float bottom) {
        return PaddingKt.m8119PaddingValuesa9UjIt4(f, top, end, bottom);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m9059outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return textFieldDefaults.m9069outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    @ExperimentalMaterialApi
    @NotNull
    /* renamed from: outlinedTextFieldPadding-a9UjIt4 */
    public final PaddingValues m9069outlinedTextFieldPaddinga9UjIt4(float f, float top, float end, float bottom) {
        return PaddingKt.m8119PaddingValuesa9UjIt4(f, top, end, bottom);
    }

    @Composable
    @NotNull
    /* renamed from: textFieldColors-dx8h9Zs */
    public final TextFieldColors m9070textFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, @Nullable Composer composer, int i, int i2, int i3, int i4) {
        composer.startReplaceableGroup(231892599);
        long jM11339copywmQWz5c$default = (i4 & 1) != 0 ? Color.m11339copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        long jM11339copywmQWz5c$default2 = (i4 & 2) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM11339copywmQWz5c$default3 = (i4 & 4) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM8846getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8846getPrimary0d7_KjU() : j4;
        long jM8840getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8840getError0d7_KjU() : j5;
        long jM11339copywmQWz5c$default4 = (i4 & 32) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8846getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM11339copywmQWz5c$default5 = (i4 & 64) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long jM11339copywmQWz5c$default6 = (i4 & 128) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long jM8840getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8840getError0d7_KjU() : j9;
        long jM11339copywmQWz5c$default7 = (i4 & 512) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jM11339copywmQWz5c$default8 = (i4 & 1024) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j22 = (i4 & 2048) != 0 ? jM11339copywmQWz5c$default7 : j12;
        long jM11339copywmQWz5c$default9 = (i4 & 4096) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jM11339copywmQWz5c$default10 = (i4 & 8192) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jM8840getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8840getError0d7_KjU() : j15;
        long jM11339copywmQWz5c$default11 = (32768 & i4) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8846getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long jM11339copywmQWz5c$default12 = (65536 & i4) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jM11339copywmQWz5c$default13 = (131072 & i4) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long jM8840getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8840getError0d7_KjU() : j19;
        long jM11339copywmQWz5c$default14 = (524288 & i4) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long jM11339copywmQWz5c$default15 = (i4 & 1048576) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231892599, i, i2, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:422)");
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(jM11339copywmQWz5c$default, jM11339copywmQWz5c$default2, jM8846getPrimary0d7_KjU, jM8840getError0d7_KjU, jM11339copywmQWz5c$default4, jM11339copywmQWz5c$default5, jM8840getError0d7_KjU2, jM11339copywmQWz5c$default6, jM11339copywmQWz5c$default7, jM11339copywmQWz5c$default8, j22, jM11339copywmQWz5c$default9, jM11339copywmQWz5c$default10, jM8840getError0d7_KjU3, jM11339copywmQWz5c$default3, jM11339copywmQWz5c$default11, jM11339copywmQWz5c$default12, jM11339copywmQWz5c$default13, jM8840getError0d7_KjU4, jM11339copywmQWz5c$default14, jM11339copywmQWz5c$default15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    @Composable
    @NotNull
    /* renamed from: outlinedTextFieldColors-dx8h9Zs */
    public final TextFieldColors m9068outlinedTextFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, @Nullable Composer composer, int i, int i2, int i3, int i4) {
        composer.startReplaceableGroup(1762667317);
        long jM11339copywmQWz5c$default = (i4 & 1) != 0 ? Color.m11339copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        long jM11339copywmQWz5c$default2 = (i4 & 2) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM11375getTransparent0d7_KjU = (i4 & 4) != 0 ? Color.INSTANCE.m11375getTransparent0d7_KjU() : j3;
        long jM8846getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8846getPrimary0d7_KjU() : j4;
        long jM8840getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8840getError0d7_KjU() : j5;
        long jM11339copywmQWz5c$default3 = (i4 & 32) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8846getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM11339copywmQWz5c$default4 = (i4 & 64) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long jM11339copywmQWz5c$default5 = (i4 & 128) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long jM8840getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8840getError0d7_KjU() : j9;
        long jM11339copywmQWz5c$default6 = (i4 & 512) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jM11339copywmQWz5c$default7 = (i4 & 1024) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default6, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j22 = (i4 & 2048) != 0 ? jM11339copywmQWz5c$default6 : j12;
        long jM11339copywmQWz5c$default8 = (i4 & 4096) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jM11339copywmQWz5c$default9 = (i4 & 8192) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jM8840getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8840getError0d7_KjU() : j15;
        long jM11339copywmQWz5c$default10 = (32768 & i4) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8846getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long jM11339copywmQWz5c$default11 = (65536 & i4) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jM11339copywmQWz5c$default12 = (131072 & i4) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default11, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long jM8840getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8840getError0d7_KjU() : j19;
        long jM11339copywmQWz5c$default13 = (524288 & i4) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long jM11339copywmQWz5c$default14 = (i4 & 1048576) != 0 ? Color.m11339copywmQWz5c$default(jM11339copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1762667317, i, i2, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:480)");
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(jM11339copywmQWz5c$default, jM11339copywmQWz5c$default2, jM8846getPrimary0d7_KjU, jM8840getError0d7_KjU, jM11339copywmQWz5c$default3, jM11339copywmQWz5c$default4, jM8840getError0d7_KjU2, jM11339copywmQWz5c$default5, jM11339copywmQWz5c$default6, jM11339copywmQWz5c$default7, j22, jM11339copywmQWz5c$default8, jM11339copywmQWz5c$default9, jM8840getError0d7_KjU3, jM11375getTransparent0d7_KjU, jM11339copywmQWz5c$default10, jM11339copywmQWz5c$default11, jM11339copywmQWz5c$default12, jM8840getError0d7_KjU4, jM11339copywmQWz5c$default13, jM11339copywmQWz5c$default14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:415:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void TextFieldDecorationBox(@NotNull String str, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, boolean z, boolean z2, @NotNull VisualTransformation visualTransformation, @NotNull InteractionSource interactionSource, boolean z3, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, @Nullable Function2<? super Composer, ? super Integer, Unit> function25, @Nullable TextFieldColors textFieldColors, @Nullable PaddingValues paddingValues, @Nullable Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        TextFieldColors textFieldColorsM9070textFieldColorsdx8h9Zs;
        PaddingValues paddingValuesM9060textFieldWithLabelPaddinga9UjIt4$default;
        TextFieldColors textFieldColors2;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        PaddingValues paddingValues2;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1171040065);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 112) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i & 896) == 0) {
                    i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i4 |= CpioConstants.C_ISBLK;
                    } else if ((i & 57344) == 0) {
                        i4 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                    }
                    if ((i3 & 32) == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i & 458752) == 0) {
                        i4 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i5 = i3 & 64;
                    if (i5 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i6 = i3 & 128;
                    if (i6 == 0) {
                        i4 |= 12582912;
                        function26 = function22;
                    } else {
                        function26 = function22;
                        if ((i & 29360128) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                        }
                    }
                    i7 = i3 & 256;
                    if (i7 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                    }
                    i9 = i3 & 1024;
                    if (i9 == 0) {
                        i10 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i10 = i2 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                    } else {
                        i10 = i2;
                    }
                    if ((i2 & 112) == 0) {
                        i10 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 32 : 16;
                    }
                    if ((i2 & 896) == 0) {
                        i10 |= ((i3 & 4096) == 0 && composerStartRestartGroup.changed(paddingValues)) ? 256 : 128;
                    }
                    int i11 = i10;
                    if ((i3 & 8192) != 0) {
                        if ((i2 & 7168) == 0) {
                            i11 |= composerStartRestartGroup.changed(this) ? 2048 : 1024;
                        }
                        if ((i4 & 1533916891) != 306783378 || (i11 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 2048) != 0) {
                                    i11 &= -113;
                                }
                                if ((i3 & 4096) != 0) {
                                    i11 &= -897;
                                }
                                z4 = z3;
                                function27 = function23;
                                function28 = function24;
                                function29 = function25;
                                textFieldColorsM9070textFieldColorsdx8h9Zs = textFieldColors;
                            } else {
                                z4 = i5 == 0 ? false : z3;
                                if (i6 != 0) {
                                    function26 = null;
                                }
                                function27 = i7 == 0 ? null : function23;
                                function28 = i8 == 0 ? null : function24;
                                function29 = i9 == 0 ? function25 : null;
                                if ((i3 & 2048) == 0) {
                                    textFieldColorsM9070textFieldColorsdx8h9Zs = m9070textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i11 >> 6) & 112, 2097151);
                                    i11 &= -113;
                                } else {
                                    textFieldColorsM9070textFieldColorsdx8h9Zs = textFieldColors;
                                }
                                if ((i3 & 4096) == 0) {
                                    if (function26 == null) {
                                        paddingValuesM9060textFieldWithLabelPaddinga9UjIt4$default = m9061textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        paddingValuesM9060textFieldWithLabelPaddinga9UjIt4$default = m9060textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i11 &= -897;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1171040065, i4, i11, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:579)");
                                }
                                int i12 = i4 << 3;
                                int i13 = i4 >> 9;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, str, function2, visualTransformation, function26, function27, function28, function29, z2, z, z4, interactionSource, paddingValuesM9060textFieldWithLabelPaddinga9UjIt4$default, textFieldColorsM9070textFieldColorsdx8h9Zs, null, composerStartRestartGroup, (i12 & 896) | (i12 & 112) | 6 | ((i4 >> 3) & 7168) | (i13 & 57344) | (i13 & 458752) | (i13 & 3670016) | ((i11 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i11 & 896) | ((i11 << 6) & 7168), 16384);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                textFieldColors2 = textFieldColorsM9070textFieldColorsdx8h9Zs;
                                z5 = z4;
                                function210 = function29;
                                function211 = function26;
                                paddingValues2 = paddingValuesM9060textFieldWithLabelPaddinga9UjIt4$default;
                                function212 = function28;
                                function213 = function27;
                            }
                            paddingValuesM9060textFieldWithLabelPaddinga9UjIt4$default = paddingValues;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i122 = i4 << 3;
                            int i132 = i4 >> 9;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, str, function2, visualTransformation, function26, function27, function28, function29, z2, z, z4, interactionSource, paddingValuesM9060textFieldWithLabelPaddinga9UjIt4$default, textFieldColorsM9070textFieldColorsdx8h9Zs, null, composerStartRestartGroup, (i122 & 896) | (i122 & 112) | 6 | ((i4 >> 3) & 7168) | (i132 & 57344) | (i132 & 458752) | (i132 & 3670016) | ((i11 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i11 & 896) | ((i11 << 6) & 7168), 16384);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            textFieldColors2 = textFieldColorsM9070textFieldColorsdx8h9Zs;
                            z5 = z4;
                            function210 = function29;
                            function211 = function26;
                            paddingValues2 = paddingValuesM9060textFieldWithLabelPaddinga9UjIt4$default;
                            function212 = function28;
                            function213 = function27;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z5 = z3;
                            function212 = function24;
                            function210 = function25;
                            textFieldColors2 = textFieldColors;
                            paddingValues2 = paddingValues;
                            function211 = function26;
                            function213 = function23;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox.1
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$changed1;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ TextFieldColors $colors;
                                public final /* synthetic */ PaddingValues $contentPadding;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
                                public final /* synthetic */ InteractionSource $interactionSource;
                                public final /* synthetic */ boolean $isError;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                public final /* synthetic */ boolean $singleLine;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                public final /* synthetic */ String $value;
                                public final /* synthetic */ VisualTransformation $visualTransformation;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C12351(String str2, Function2<? super Composer, ? super Integer, Unit> function214, boolean z6, boolean z22, VisualTransformation visualTransformation2, InteractionSource interactionSource2, boolean z52, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function2102, TextFieldColors textFieldColors22, PaddingValues paddingValues22, int i14, int i22, int i32) {
                                    super(2);
                                    str = str2;
                                    function2 = function214;
                                    z = z6;
                                    z = z22;
                                    visualTransformation = visualTransformation2;
                                    interactionSource = interactionSource2;
                                    z = z52;
                                    function2 = function2112;
                                    function2 = function2132;
                                    function2 = function2122;
                                    function2 = function2102;
                                    textFieldColors = textFieldColors22;
                                    paddingValues = paddingValues22;
                                    i = i14;
                                    i = i22;
                                    i = i32;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i14) {
                                    TextFieldDefaults.this.TextFieldDecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, textFieldColors, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i11 |= 3072;
                    if ((i4 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i14 & 1) == 0) {
                            if (i5 == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if ((i32 & 2048) == 0) {
                            }
                            if ((i32 & 4096) == 0) {
                                paddingValuesM9060textFieldWithLabelPaddinga9UjIt4$default = paddingValues;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i1222 = i4 << 3;
                            int i1322 = i4 >> 9;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, str2, function214, visualTransformation2, function26, function27, function28, function29, z22, z6, z4, interactionSource2, paddingValuesM9060textFieldWithLabelPaddinga9UjIt4$default, textFieldColorsM9070textFieldColorsdx8h9Zs, null, composerStartRestartGroup, (i1222 & 896) | (i1222 & 112) | 6 | ((i4 >> 3) & 7168) | (i1322 & 57344) | (i1322 & 458752) | (i1322 & 3670016) | ((i11 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i11 & 896) | ((i11 << 6) & 7168), 16384);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            textFieldColors22 = textFieldColorsM9070textFieldColorsdx8h9Zs;
                            z52 = z4;
                            function2102 = function29;
                            function2112 = function26;
                            paddingValues22 = paddingValuesM9060textFieldWithLabelPaddinga9UjIt4$default;
                            function2122 = function28;
                            function2132 = function27;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i32 & 16) == 0) {
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
                if ((i22 & 112) == 0) {
                }
                if ((i22 & 896) == 0) {
                }
                int i112 = i10;
                if ((i32 & 8192) != 0) {
                }
                if ((i4 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i32 & 8) != 0) {
            }
            if ((i32 & 16) == 0) {
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
            if ((i22 & 112) == 0) {
            }
            if ((i22 & 896) == 0) {
            }
            int i1122 = i10;
            if ((i32 & 8192) != 0) {
            }
            if ((i4 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i32 & 4) == 0) {
        }
        if ((i32 & 8) != 0) {
        }
        if ((i32 & 16) == 0) {
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
        if ((i22 & 112) == 0) {
        }
        if ((i22 & 896) == 0) {
        }
        int i11222 = i10;
        if ((i32 & 8192) != 0) {
        }
        if ((i4 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$1 */
    public static final class C12331 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12331(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors) {
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
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261916269, i, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:667)");
            }
            TextFieldDefaults.INSTANCE.m9062BorderBoxnbWgWpA(z, z, interactionSource, textFieldColors, null, 0.0f, 0.0f, composer, 12582912, 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:264:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:435:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OutlinedTextFieldDecorationBox(@NotNull String str, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, boolean z, boolean z2, @NotNull VisualTransformation visualTransformation, @NotNull InteractionSource interactionSource, boolean z3, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, @Nullable Function2<? super Composer, ? super Integer, Unit> function25, @Nullable TextFieldColors textFieldColors, @Nullable PaddingValues paddingValues, @Nullable Function2<? super Composer, ? super Integer, Unit> function26, @Nullable Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        TextFieldColors textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs;
        PaddingValues paddingValuesM9059outlinedTextFieldPaddinga9UjIt4$default;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        Function2<? super Composer, ? super Integer, Unit> function2ComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function210;
        TextFieldColors textFieldColors3;
        Composer composer2;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        TextFieldColors textFieldColors4;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function215;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1280721485);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else {
            if ((i & 7168) == 0) {
                i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else if ((i & 57344) == 0) {
                i4 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i5 = ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else {
                if ((i & 458752) == 0) {
                    i5 = composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i & 1879048192) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i11 = i2 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                } else {
                    i11 = i2;
                }
                if ((i2 & 112) == 0) {
                    i11 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 32 : 16;
                }
                if ((i2 & 896) == 0) {
                    i11 |= ((i3 & 4096) == 0 && composerStartRestartGroup.changed(paddingValues)) ? 256 : 128;
                }
                int i13 = i11;
                i12 = i3 & 8192;
                if (i12 != 0) {
                    i13 |= 3072;
                } else {
                    if ((i2 & 7168) == 0) {
                        i13 |= composerStartRestartGroup.changedInstance(function26) ? 2048 : 1024;
                    }
                    if ((i3 & 16384) != 0) {
                        if ((i2 & 57344) == 0) {
                            i13 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                        }
                        if ((i4 & 1533916891) != 306783378 || (46811 & i13) != 9362 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                boolean z6 = i6 == 0 ? false : z3;
                                Function2<? super Composer, ? super Integer, Unit> function216 = i7 == 0 ? null : function22;
                                Function2<? super Composer, ? super Integer, Unit> function217 = i8 == 0 ? null : function23;
                                Function2<? super Composer, ? super Integer, Unit> function218 = i9 == 0 ? null : function24;
                                Function2<? super Composer, ? super Integer, Unit> function219 = i10 == 0 ? function25 : null;
                                if ((i3 & 2048) == 0) {
                                    textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs = m9068outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i13 >> 9) & 112, 2097151);
                                    i13 &= -113;
                                } else {
                                    textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function220 = function218;
                                if ((i3 & 4096) == 0) {
                                    paddingValuesM9059outlinedTextFieldPaddinga9UjIt4$default = m9059outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i13 &= -897;
                                } else {
                                    paddingValuesM9059outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i12 == 0) {
                                    textFieldColors2 = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs;
                                    paddingValues2 = paddingValuesM9059outlinedTextFieldPaddinga9UjIt4$default;
                                    function27 = function220;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.1
                                        public final /* synthetic */ TextFieldColors $colors;
                                        public final /* synthetic */ boolean $enabled;
                                        public final /* synthetic */ InteractionSource $interactionSource;
                                        public final /* synthetic */ boolean $isError;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C12331(boolean z7, boolean z62, InteractionSource interactionSource2, TextFieldColors textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2) {
                                            super(2);
                                            z = z7;
                                            z = z62;
                                            interactionSource = interactionSource2;
                                            textFieldColors = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer3, int i14) {
                                            if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1261916269, i14, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:667)");
                                            }
                                            TextFieldDefaults.INSTANCE.m9062BorderBoxnbWgWpA(z, z, interactionSource, textFieldColors, null, 0.0f, 0.0f, composer3, 12582912, 112);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    });
                                } else {
                                    textFieldColors2 = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2;
                                    paddingValues2 = paddingValuesM9059outlinedTextFieldPaddinga9UjIt4$default;
                                    function2ComposableLambda = function26;
                                    function27 = function220;
                                }
                                function28 = function216;
                                function29 = function217;
                                z4 = z62;
                                function210 = function219;
                                textFieldColors3 = textFieldColors2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 2048) != 0) {
                                    i13 &= -113;
                                }
                                if ((i3 & 4096) != 0) {
                                    i13 &= -897;
                                }
                                z4 = z3;
                                function28 = function22;
                                function29 = function23;
                                function27 = function24;
                                function210 = function25;
                                textFieldColors3 = textFieldColors;
                                paddingValues2 = paddingValues;
                                function2ComposableLambda = function26;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1280721485, i4, i13, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:669)");
                            }
                            int i14 = i4 << 3;
                            int i15 = i4 >> 9;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function28, function29, function27, function210, z2, z7, z4, interactionSource2, paddingValues2, textFieldColors3, function2ComposableLambda, composer2, (i14 & 896) | (i14 & 112) | 6 | ((i4 >> 3) & 7168) | (i15 & 57344) | (458752 & i15) | (i15 & 3670016) | ((i13 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i13 & 896) | ((i13 << 6) & 7168) | ((i13 << 3) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function211 = function28;
                            function212 = function29;
                            function213 = function27;
                            function214 = function210;
                            textFieldColors4 = textFieldColors3;
                            paddingValues3 = paddingValues2;
                            function215 = function2ComposableLambda;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z5 = z3;
                            function211 = function22;
                            function213 = function24;
                            function214 = function25;
                            textFieldColors4 = textFieldColors;
                            paddingValues3 = paddingValues;
                            function215 = function26;
                            composer2 = composerStartRestartGroup;
                            function212 = function23;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.2
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$changed1;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $border;
                                public final /* synthetic */ TextFieldColors $colors;
                                public final /* synthetic */ PaddingValues $contentPadding;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
                                public final /* synthetic */ InteractionSource $interactionSource;
                                public final /* synthetic */ boolean $isError;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                public final /* synthetic */ boolean $singleLine;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                public final /* synthetic */ String $value;
                                public final /* synthetic */ VisualTransformation $visualTransformation;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C12342(String str2, Function2<? super Composer, ? super Integer, Unit> function221, boolean z7, boolean z22, VisualTransformation visualTransformation2, InteractionSource interactionSource2, boolean z52, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2142, TextFieldColors textFieldColors42, PaddingValues paddingValues32, Function2<? super Composer, ? super Integer, Unit> function2152, int i16, int i22, int i32) {
                                    super(2);
                                    str = str2;
                                    function2 = function221;
                                    z = z7;
                                    z = z22;
                                    visualTransformation = visualTransformation2;
                                    interactionSource = interactionSource2;
                                    z = z52;
                                    function2 = function2112;
                                    function2 = function2122;
                                    function2 = function2132;
                                    function2 = function2142;
                                    textFieldColors = textFieldColors42;
                                    paddingValues = paddingValues32;
                                    function2 = function2152;
                                    i = i16;
                                    i = i22;
                                    i = i32;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i16) {
                                    TextFieldDefaults.this.OutlinedTextFieldDecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, textFieldColors, paddingValues, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i13 |= CpioConstants.C_ISBLK;
                    if ((i4 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i16 & 1) != 0) {
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if ((i32 & 2048) == 0) {
                            }
                            Function2<? super Composer, ? super Integer, Unit> function2202 = function218;
                            if ((i32 & 4096) == 0) {
                            }
                            if (i12 == 0) {
                            }
                            function28 = function216;
                            function29 = function217;
                            z4 = z62;
                            function210 = function219;
                            textFieldColors3 = textFieldColors2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i142 = i4 << 3;
                            int i152 = i4 >> 9;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str2, function221, visualTransformation2, function28, function29, function27, function210, z22, z7, z4, interactionSource2, paddingValues2, textFieldColors3, function2ComposableLambda, composer2, (i142 & 896) | (i142 & 112) | 6 | ((i4 >> 3) & 7168) | (i152 & 57344) | (458752 & i152) | (i152 & 3670016) | ((i13 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), ((i4 >> 12) & 112) | ((i4 >> 18) & 14) | (i13 & 896) | ((i13 << 6) & 7168) | ((i13 << 3) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z52 = z4;
                            function2112 = function28;
                            function2122 = function29;
                            function2132 = function27;
                            function2142 = function210;
                            textFieldColors42 = textFieldColors3;
                            paddingValues32 = paddingValues2;
                            function2152 = function2ComposableLambda;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i32 & 16384) != 0) {
                }
                if ((i4 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i4 |= i5;
            i6 = i32 & 64;
            if (i6 != 0) {
            }
            i7 = i32 & 128;
            if (i7 != 0) {
            }
            i8 = i32 & 256;
            if (i8 != 0) {
            }
            i9 = i32 & 512;
            if (i9 != 0) {
            }
            i10 = i32 & 1024;
            if (i10 != 0) {
            }
            if ((i22 & 112) == 0) {
            }
            if ((i22 & 896) == 0) {
            }
            int i132 = i11;
            i12 = i32 & 8192;
            if (i12 != 0) {
            }
            if ((i32 & 16384) != 0) {
            }
            if ((i4 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i32 & 16) == 0) {
        }
        if ((i32 & 32) == 0) {
        }
        i4 |= i5;
        i6 = i32 & 64;
        if (i6 != 0) {
        }
        i7 = i32 & 128;
        if (i7 != 0) {
        }
        i8 = i32 & 256;
        if (i8 != 0) {
        }
        i9 = i32 & 512;
        if (i9 != 0) {
        }
        i10 = i32 & 1024;
        if (i10 != 0) {
        }
        if ((i22 & 112) == 0) {
        }
        if ((i22 & 896) == 0) {
        }
        int i1322 = i11;
        i12 = i32 & 8192;
        if (i12 != 0) {
        }
        if ((i32 & 16384) != 0) {
        }
        if ((i4 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ExperimentalMaterialApi
    @NotNull
    /* renamed from: indicatorLine-gv0btCI */
    public final Modifier m9067indicatorLinegv0btCI(@NotNull Modifier modifier, final boolean z, final boolean z2, @NotNull final InteractionSource interactionSource, @NotNull final TextFieldColors textFieldColors, final float f, final float f2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", textFieldColors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", C2046Dp.m13664boximpl(f));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", C2046Dp.m13664boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                composer.startReplaceableGroup(1398930845);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1398930845, i, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:299)");
                }
                Modifier modifierDrawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m9074animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, textFieldColors, f, f2, composer, 0).getValue());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierDrawIndicatorLine;
            }
        });
    }
}
