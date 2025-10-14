package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.input.ImeOptions;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BasicTextField.kt */
@Metadata(m7104d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aâ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010\"\u001aì\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010$\u001aâ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020%2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010&\u001aì\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020%2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010'¨\u0006(²\u0006\n\u0010)\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020%X\u008a\u008e\u0002"}, m7105d2 = {"BasicTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "foundation_release", "textFieldValueState", "lastTextValue"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,400:1\n25#2:401\n25#2:408\n36#2:421\n25#2:434\n25#2:447\n25#2:454\n1116#3,6:402\n1116#3,6:409\n1116#3,6:415\n1116#3,6:422\n1116#3,6:428\n1116#3,6:435\n1116#3,6:441\n1116#3,6:448\n1116#3,6:455\n81#4:461\n107#4,2:462\n81#4:464\n107#4,2:465\n*S KotlinDebug\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n*L\n142#1:401\n149#1:408\n164#1:421\n292#1:434\n336#1:447\n376#1:454\n142#1:402,6\n149#1:409,6\n155#1:415,6\n164#1:422,6\n168#1:428,6\n292#1:435,6\n299#1:441,6\n336#1:448,6\n376#1:455,6\n149#1:461\n149#1:462,2\n164#1:464\n164#1:465,2\n*E\n"})
/* loaded from: classes2.dex */
public final class BasicTextFieldKt {

    /* compiled from: BasicTextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$12 */
    /* loaded from: classes.dex */
    public static final class C078912 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Brush $cursorBrush;
        public final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> $decorationBox;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ KeyboardActions $keyboardActions;
        public final /* synthetic */ KeyboardOptions $keyboardOptions;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
        public final /* synthetic */ Function1<String, Unit> $onValueChange;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ TextStyle $textStyle;
        public final /* synthetic */ String $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C078912(String str, Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, int i2, int i3, int i4) {
            super(2);
            str = str;
            function1 = function1;
            modifier = modifier;
            z = z;
            z = z2;
            textStyle = textStyle;
            keyboardOptions = keyboardOptions;
            keyboardActions = keyboardActions;
            z = z3;
            i = i;
            visualTransformation = visualTransformation;
            function1 = function12;
            mutableInteractionSource = mutableInteractionSource;
            brush = brush;
            function3 = function3;
            i = i2;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            BasicTextFieldKt.BasicTextField(str, function1, modifier, z, z, textStyle, keyboardOptions, keyboardActions, z, i, visualTransformation, function1, mutableInteractionSource, brush, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$15 */
    /* loaded from: classes.dex */
    public static final class C079115 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Brush $cursorBrush;
        public final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> $decorationBox;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ KeyboardActions $keyboardActions;
        public final /* synthetic */ KeyboardOptions $keyboardOptions;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
        public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ TextStyle $textStyle;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C079115(Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, int i2, int i3, int i4) {
            super(2);
            function1 = function1;
            modifier = modifier;
            z = z;
            z = z2;
            textStyle = textStyle;
            keyboardOptions = keyboardOptions;
            keyboardActions = keyboardActions;
            z = z3;
            i = i;
            visualTransformation = visualTransformation;
            function1 = function12;
            mutableInteractionSource = mutableInteractionSource;
            brush = brush;
            function3 = function3;
            i = i2;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier, z, z, textStyle, keyboardOptions, keyboardActions, z, i, visualTransformation, function1, mutableInteractionSource, brush, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5 */
    /* loaded from: classes.dex */
    public static final class C07925 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Brush $cursorBrush;
        public final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> $decorationBox;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ KeyboardActions $keyboardActions;
        public final /* synthetic */ KeyboardOptions $keyboardOptions;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ int $minLines;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
        public final /* synthetic */ Function1<String, Unit> $onValueChange;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ TextStyle $textStyle;
        public final /* synthetic */ String $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07925(String str, Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, int i3, int i4, int i5) {
            super(2);
            str = str;
            function1 = function1;
            modifier = modifier;
            z = z;
            z = z2;
            textStyle = textStyle;
            keyboardOptions = keyboardOptions;
            keyboardActions = keyboardActions;
            z = z3;
            i = i;
            i = i2;
            visualTransformation = visualTransformation;
            function1 = function12;
            mutableInteractionSource = mutableInteractionSource;
            brush = brush;
            function3 = function3;
            i = i3;
            i = i4;
            i = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            BasicTextFieldKt.BasicTextField(str, function1, modifier, z, z, textStyle, keyboardOptions, keyboardActions, z, i, i, visualTransformation, function1, mutableInteractionSource, brush, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9 */
    /* loaded from: classes.dex */
    public static final class C07949 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Brush $cursorBrush;
        public final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> $decorationBox;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ KeyboardActions $keyboardActions;
        public final /* synthetic */ KeyboardOptions $keyboardOptions;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ int $minLines;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
        public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ TextStyle $textStyle;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07949(Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, int i3, int i4, int i5) {
            super(2);
            function1 = function1;
            modifier = modifier;
            z = z;
            z = z2;
            textStyle = textStyle;
            keyboardOptions = keyboardOptions;
            keyboardActions = keyboardActions;
            z = z3;
            i = i;
            i = i2;
            visualTransformation = visualTransformation;
            function1 = function12;
            mutableInteractionSource = mutableInteractionSource;
            brush = brush;
            function3 = function3;
            i = i3;
            i = i4;
            i = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier, z, z, textStyle, keyboardOptions, keyboardActions, z, i, i, visualTransformation, function1, mutableInteractionSource, brush, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1 */
    /* loaded from: classes.dex */
    public static final class C07871 extends Lambda implements Function1<TextLayoutResult, Unit> {
        public static final C07871 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
            invoke2(textLayoutResult);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:310:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:547:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(@NotNull String str, @NotNull final Function1<? super String, Unit> function1, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable TextStyle textStyle, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, boolean z3, int i, int i2, @Nullable VisualTransformation visualTransformation, @Nullable Function1<? super TextLayoutResult, Unit> function12, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Brush brush, @Nullable Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Modifier modifier2;
        boolean z4;
        KeyboardActions keyboardActions2;
        int i20;
        boolean z5;
        MutableInteractionSource mutableInteractionSource2;
        int i21;
        int i22;
        Brush solidColor;
        int i23;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3M8410getLambda1$foundation_release;
        MutableInteractionSource mutableInteractionSource3;
        Function1<? super TextLayoutResult, Unit> function13;
        Brush brush2;
        boolean z6;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        int i24;
        VisualTransformation visualTransformation2;
        boolean z7;
        int i25;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z8;
        final MutableState mutableState;
        final TextFieldValue textFieldValueM13399copy3r_uNRQ$default;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChanged2;
        Object objRememberedValue3;
        final MutableState mutableState2;
        boolean zChanged3;
        Object objRememberedValue4;
        boolean z9;
        KeyboardOptions keyboardOptions3;
        int i26;
        boolean z10;
        TextStyle textStyle3;
        VisualTransformation visualTransformation3;
        Function1<? super TextLayoutResult, Unit> function14;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        boolean z11;
        int i27;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(945255183);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i28 = i5 & 4;
        if (i28 != 0) {
            i6 |= 384;
        } else {
            if ((i3 & 896) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else {
                if ((i3 & 7168) == 0) {
                    i6 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                }
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= CpioConstants.C_ISBLK;
                } else if ((i3 & 57344) == 0) {
                    i6 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i3 & 458752) == 0) {
                    i6 |= composerStartRestartGroup.changed(textStyle) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i6 |= composerStartRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i6 |= composerStartRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i6 |= composerStartRestartGroup.changed(z3) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                if ((i3 & 1879048192) == 0) {
                    i6 |= ((i5 & 512) == 0 && composerStartRestartGroup.changed(i)) ? 536870912 : 268435456;
                }
                i13 = i5 & 1024;
                if (i13 != 0) {
                    i14 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i14 = i4 | (composerStartRestartGroup.changed(i2) ? 4 : 2);
                } else {
                    i14 = i4;
                }
                i15 = i5 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i4 & 112) == 0) {
                    i14 |= composerStartRestartGroup.changed(visualTransformation) ? 32 : 16;
                }
                int i29 = i14;
                i16 = i5 & 4096;
                if (i16 != 0) {
                    i29 |= 384;
                } else {
                    if ((i4 & 896) == 0) {
                        i29 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
                    }
                    i17 = i5 & 8192;
                    if (i17 != 0) {
                        if ((i4 & 7168) == 0) {
                            i29 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
                        }
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                            i29 |= CpioConstants.C_ISBLK;
                        } else if ((i4 & 57344) == 0) {
                            i29 |= composerStartRestartGroup.changed(brush) ? 16384 : 8192;
                        }
                        i19 = i5 & 32768;
                        if (i19 != 0) {
                            i29 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        } else if ((i4 & 458752) == 0) {
                            i29 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if ((i6 & 1533916891) != 306783378 || (374491 & i29) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i28 == 0 ? Modifier.INSTANCE : modifier;
                                z4 = i7 == 0 ? true : z;
                                boolean z12 = i8 == 0 ? false : z2;
                                TextStyle textStyle4 = i9 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                KeyboardOptions keyboardOptions4 = i10 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                keyboardActions2 = i11 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                boolean z13 = i12 == 0 ? false : z3;
                                if ((i5 & 512) == 0) {
                                    i20 = z13 ? 1 : Integer.MAX_VALUE;
                                    i6 &= -1879048193;
                                } else {
                                    i20 = i;
                                }
                                int i30 = i13 == 0 ? 1 : i2;
                                VisualTransformation none = i15 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                Function1<? super TextLayoutResult, Unit> function15 = i16 == 0 ? C07871.INSTANCE : function12;
                                if (i17 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    z5 = z13;
                                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue5;
                                } else {
                                    z5 = z13;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if (i18 == 0) {
                                    i21 = i6;
                                    i22 = i30;
                                    solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
                                } else {
                                    i21 = i6;
                                    i22 = i30;
                                    solidColor = brush;
                                }
                                if (i19 == 0) {
                                    i23 = i22;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    function3M8410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m8410getLambda1$foundation_release();
                                } else {
                                    i23 = i22;
                                    function3M8410getLambda1$foundation_release = function3;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                function13 = function15;
                                brush2 = solidColor;
                                z6 = z12;
                                textStyle2 = textStyle4;
                                keyboardOptions2 = keyboardOptions4;
                                i24 = i21;
                                visualTransformation2 = none;
                                z7 = z5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i5 & 512) != 0) {
                                    i6 &= -1879048193;
                                }
                                modifier2 = modifier;
                                z4 = z;
                                z6 = z2;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActions2 = keyboardActions;
                                z7 = z3;
                                i20 = i;
                                i23 = i2;
                                visualTransformation2 = visualTransformation;
                                function13 = function12;
                                mutableInteractionSource3 = mutableInteractionSource;
                                brush2 = brush;
                                function3M8410getLambda1$foundation_release = function3;
                                i24 = i6;
                                textStyle2 = textStyle;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                i25 = i20;
                            } else {
                                i25 = i20;
                                ComposerKt.traceEventStart(945255183, i24, i29, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:145)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue != companion.getEmpty()) {
                                z8 = z6;
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                z8 = z6;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            textFieldValueM13399copy3r_uNRQ$default = TextFieldValue.m13399copy3r_uNRQ$default(BasicTextField$lambda$2(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                            composerStartRestartGroup.startReplaceableGroup(223633121);
                            zChanged = composerStartRestartGroup.changed(textFieldValueM13399copy3r_uNRQ$default) | composerStartRestartGroup.changed(mutableState);
                            boolean z14 = z4;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (TextRange.m13158equalsimpl0(textFieldValueM13399copy3r_uNRQ$default.getSelection(), BasicTextFieldKt.BasicTextField$lambda$2(mutableState).getSelection()) && Intrinsics.areEqual(textFieldValueM13399copy3r_uNRQ$default.getComposition(), BasicTextFieldKt.BasicTextField$lambda$2(mutableState).getComposition())) {
                                            return;
                                        }
                                        mutableState.setValue(textFieldValueM13399copy3r_uNRQ$default);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(str);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState2 = (MutableState) objRememberedValue3;
                            ImeOptions imeOptions$foundation_release = keyboardOptions2.toImeOptions$foundation_release(z7);
                            boolean z15 = !z7;
                            int i31 = !z7 ? 1 : i23;
                            int i32 = !z7 ? 1 : i25;
                            composerStartRestartGroup.startReplaceableGroup(223633776);
                            KeyboardOptions keyboardOptions5 = keyboardOptions2;
                            zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changedInstance(function1);
                            boolean z16 = z7;
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                        invoke2(textFieldValue);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                                        mutableState.setValue(textFieldValue);
                                        boolean z17 = !Intrinsics.areEqual(BasicTextFieldKt.BasicTextField$lambda$6(mutableState2), textFieldValue.getText());
                                        mutableState2.setValue(textFieldValue.getText());
                                        if (z17) {
                                            function1.invoke(textFieldValue.getText());
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i33 = i29 << 9;
                            CoreTextFieldKt.CoreTextField(textFieldValueM13399copy3r_uNRQ$default, (Function1) objRememberedValue4, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource3, brush2, z15, i32, i31, imeOptions$foundation_release, keyboardActions2, z14, z8, function3M8410getLambda1$foundation_release, composerStartRestartGroup, (i24 & 896) | ((i24 >> 6) & 7168) | (i33 & 57344) | (i33 & 458752) | (3670016 & i33) | (i33 & 29360128), ((i24 >> 15) & 896) | (i24 & 7168) | (i24 & 57344) | (i29 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z9 = z14;
                            keyboardOptions3 = keyboardOptions5;
                            i26 = i23;
                            z10 = z8;
                            textStyle3 = textStyle2;
                            visualTransformation3 = visualTransformation2;
                            function14 = function13;
                            function32 = function3M8410getLambda1$foundation_release;
                            z11 = z16;
                            i27 = i25;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z9 = z;
                            z10 = z2;
                            textStyle3 = textStyle;
                            keyboardOptions3 = keyboardOptions;
                            keyboardActions2 = keyboardActions;
                            z11 = z3;
                            i27 = i;
                            i26 = i2;
                            visualTransformation3 = visualTransformation;
                            function14 = function12;
                            mutableInteractionSource3 = mutableInteractionSource;
                            brush2 = brush;
                            function32 = function3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$changed1;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ Brush $cursorBrush;
                                public final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> $decorationBox;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                public final /* synthetic */ KeyboardActions $keyboardActions;
                                public final /* synthetic */ KeyboardOptions $keyboardOptions;
                                public final /* synthetic */ int $maxLines;
                                public final /* synthetic */ int $minLines;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
                                public final /* synthetic */ Function1<String, Unit> $onValueChange;
                                public final /* synthetic */ boolean $readOnly;
                                public final /* synthetic */ boolean $singleLine;
                                public final /* synthetic */ TextStyle $textStyle;
                                public final /* synthetic */ String $value;
                                public final /* synthetic */ VisualTransformation $visualTransformation;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C07925(String str2, final Function1<? super String, Unit> function16, Modifier modifier32, boolean z92, boolean z102, TextStyle textStyle32, KeyboardOptions keyboardOptions32, KeyboardActions keyboardActions22, boolean z112, int i272, int i262, VisualTransformation visualTransformation32, Function1<? super TextLayoutResult, Unit> function142, MutableInteractionSource mutableInteractionSource32, Brush brush22, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function322, int i34, int i42, int i52) {
                                    super(2);
                                    str = str2;
                                    function1 = function16;
                                    modifier = modifier32;
                                    z = z92;
                                    z = z102;
                                    textStyle = textStyle32;
                                    keyboardOptions = keyboardOptions32;
                                    keyboardActions = keyboardActions22;
                                    z = z112;
                                    i = i272;
                                    i = i262;
                                    visualTransformation = visualTransformation32;
                                    function1 = function142;
                                    mutableInteractionSource = mutableInteractionSource32;
                                    brush = brush22;
                                    function3 = function322;
                                    i = i34;
                                    i = i42;
                                    i = i52;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i34) {
                                    BasicTextFieldKt.BasicTextField(str, function1, modifier, z, z, textStyle, keyboardOptions, keyboardActions, z, i, i, visualTransformation, function1, mutableInteractionSource, brush, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i29 |= 3072;
                    i18 = i52 & 16384;
                    if (i18 != 0) {
                    }
                    i19 = i52 & 32768;
                    if (i19 != 0) {
                    }
                    if ((i6 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i34 & 1) != 0) {
                            if (i28 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if ((i52 & 512) == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            function13 = function15;
                            brush22 = solidColor;
                            z6 = z12;
                            textStyle2 = textStyle4;
                            keyboardOptions2 = keyboardOptions4;
                            i24 = i21;
                            visualTransformation2 = none;
                            z7 = z5;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue != companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            textFieldValueM13399copy3r_uNRQ$default = TextFieldValue.m13399copy3r_uNRQ$default(BasicTextField$lambda$2(mutableState), str2, 0L, (TextRange) null, 6, (Object) null);
                            composerStartRestartGroup.startReplaceableGroup(223633121);
                            zChanged = composerStartRestartGroup.changed(textFieldValueM13399copy3r_uNRQ$default) | composerStartRestartGroup.changed(mutableState);
                            boolean z142 = z4;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (TextRange.m13158equalsimpl0(textFieldValueM13399copy3r_uNRQ$default.getSelection(), BasicTextFieldKt.BasicTextField$lambda$2(mutableState).getSelection()) && Intrinsics.areEqual(textFieldValueM13399copy3r_uNRQ$default.getComposition(), BasicTextFieldKt.BasicTextField$lambda$2(mutableState).getComposition())) {
                                            return;
                                        }
                                        mutableState.setValue(textFieldValueM13399copy3r_uNRQ$default);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(str2);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str2, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableState2 = (MutableState) objRememberedValue3;
                                    ImeOptions imeOptions$foundation_release2 = keyboardOptions2.toImeOptions$foundation_release(z7);
                                    boolean z152 = !z7;
                                    if (!z7) {
                                    }
                                    if (!z7) {
                                    }
                                    composerStartRestartGroup.startReplaceableGroup(223633776);
                                    KeyboardOptions keyboardOptions52 = keyboardOptions2;
                                    zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changedInstance(function16);
                                    boolean z162 = z7;
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged3) {
                                        objRememberedValue4 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                                invoke2(textFieldValue);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                                                mutableState.setValue(textFieldValue);
                                                boolean z17 = !Intrinsics.areEqual(BasicTextFieldKt.BasicTextField$lambda$6(mutableState2), textFieldValue.getText());
                                                mutableState2.setValue(textFieldValue.getText());
                                                if (z17) {
                                                    function16.invoke(textFieldValue.getText());
                                                }
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        int i332 = i29 << 9;
                                        CoreTextFieldKt.CoreTextField(textFieldValueM13399copy3r_uNRQ$default, (Function1) objRememberedValue4, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource32, brush22, z152, i32, i31, imeOptions$foundation_release2, keyboardActions22, z142, z8, function3M8410getLambda1$foundation_release, composerStartRestartGroup, (i24 & 896) | ((i24 >> 6) & 7168) | (i332 & 57344) | (i332 & 458752) | (3670016 & i332) | (i332 & 29360128), ((i24 >> 15) & 896) | (i24 & 7168) | (i24 & 57344) | (i29 & 458752), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        z92 = z142;
                                        keyboardOptions32 = keyboardOptions52;
                                        i262 = i23;
                                        z102 = z8;
                                        textStyle32 = textStyle2;
                                        visualTransformation32 = visualTransformation2;
                                        function142 = function13;
                                        function322 = function3M8410getLambda1$foundation_release;
                                        z112 = z162;
                                        i272 = i25;
                                        modifier32 = modifier2;
                                    }
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i17 = i52 & 8192;
                if (i17 != 0) {
                }
                i18 = i52 & 16384;
                if (i18 != 0) {
                }
                i19 = i52 & 32768;
                if (i19 != 0) {
                }
                if ((i6 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i8 = i52 & 16;
            if (i8 != 0) {
            }
            i9 = i52 & 32;
            if (i9 != 0) {
            }
            i10 = i52 & 64;
            if (i10 != 0) {
            }
            i11 = i52 & 128;
            if (i11 != 0) {
            }
            i12 = i52 & 256;
            if (i12 != 0) {
            }
            if ((i34 & 1879048192) == 0) {
            }
            i13 = i52 & 1024;
            if (i13 != 0) {
            }
            i15 = i52 & 2048;
            if (i15 != 0) {
            }
            int i292 = i14;
            i16 = i52 & 4096;
            if (i16 != 0) {
            }
            i17 = i52 & 8192;
            if (i17 != 0) {
            }
            i18 = i52 & 16384;
            if (i18 != 0) {
            }
            i19 = i52 & 32768;
            if (i19 != 0) {
            }
            if ((i6 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i52 & 8;
        if (i7 == 0) {
        }
        i8 = i52 & 16;
        if (i8 != 0) {
        }
        i9 = i52 & 32;
        if (i9 != 0) {
        }
        i10 = i52 & 64;
        if (i10 != 0) {
        }
        i11 = i52 & 128;
        if (i11 != 0) {
        }
        i12 = i52 & 256;
        if (i12 != 0) {
        }
        if ((i34 & 1879048192) == 0) {
        }
        i13 = i52 & 1024;
        if (i13 != 0) {
        }
        i15 = i52 & 2048;
        if (i15 != 0) {
        }
        int i2922 = i14;
        i16 = i52 & 4096;
        if (i16 != 0) {
        }
        i17 = i52 & 8192;
        if (i17 != 0) {
        }
        i18 = i52 & 16384;
        if (i18 != 0) {
        }
        i19 = i52 & 32768;
        if (i19 != 0) {
        }
        if ((i6 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6 */
    /* loaded from: classes.dex */
    public static final class C07936 extends Lambda implements Function1<TextLayoutResult, Unit> {
        public static final C07936 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
            invoke2(textLayoutResult);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:294:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:515:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(@NotNull final TextFieldValue textFieldValue, @NotNull final Function1<? super TextFieldValue, Unit> function1, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable TextStyle textStyle, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, boolean z3, int i, int i2, @Nullable VisualTransformation visualTransformation, @Nullable Function1<? super TextLayoutResult, Unit> function12, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Brush brush, @Nullable Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z4;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        int i21;
        Brush solidColor;
        int i22;
        MutableInteractionSource mutableInteractionSource4;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3M8411getLambda2$foundation_release;
        int i23;
        VisualTransformation visualTransformation2;
        Modifier modifier2;
        Function1<? super TextLayoutResult, Unit> function13;
        KeyboardActions keyboardActions2;
        Brush brush2;
        boolean z5;
        int i24;
        boolean z6;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        boolean z7;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        Modifier modifier3;
        boolean z8;
        boolean z9;
        TextStyle textStyle3;
        boolean z10;
        KeyboardActions keyboardActions3;
        int i25;
        int i26;
        VisualTransformation visualTransformation3;
        Function1<? super TextLayoutResult, Unit> function14;
        KeyboardOptions keyboardOptions3;
        MutableInteractionSource mutableInteractionSource5;
        Brush brush3;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1804514146);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i27 = i5 & 4;
        if (i27 != 0) {
            i6 |= 384;
        } else {
            if ((i3 & 896) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else {
                if ((i3 & 7168) == 0) {
                    i6 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                }
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= CpioConstants.C_ISBLK;
                } else if ((i3 & 57344) == 0) {
                    i6 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i3 & 458752) == 0) {
                    i6 |= composerStartRestartGroup.changed(textStyle) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i6 |= composerStartRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i6 |= composerStartRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i6 |= composerStartRestartGroup.changed(z3) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                if ((i3 & 1879048192) == 0) {
                    i6 |= ((i5 & 512) == 0 && composerStartRestartGroup.changed(i)) ? 536870912 : 268435456;
                }
                i13 = i5 & 1024;
                if (i13 != 0) {
                    i14 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i14 = i4 | (composerStartRestartGroup.changed(i2) ? 4 : 2);
                } else {
                    i14 = i4;
                }
                i15 = i5 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i4 & 112) == 0) {
                    i14 |= composerStartRestartGroup.changed(visualTransformation) ? 32 : 16;
                }
                int i28 = i14;
                i16 = i5 & 4096;
                if (i16 != 0) {
                    i28 |= 384;
                } else {
                    if ((i4 & 896) == 0) {
                        i28 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
                    }
                    i17 = i5 & 8192;
                    if (i17 != 0) {
                        if ((i4 & 7168) == 0) {
                            i28 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
                        }
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                            i28 |= CpioConstants.C_ISBLK;
                        } else if ((i4 & 57344) == 0) {
                            i28 |= composerStartRestartGroup.changed(brush) ? 16384 : 8192;
                        }
                        i19 = i5 & 32768;
                        if (i19 != 0) {
                            i28 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        } else if ((i4 & 458752) == 0) {
                            i28 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if ((i6 & 1533916891) != 306783378 || (374491 & i28) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i27 == 0 ? Modifier.INSTANCE : modifier;
                                boolean z11 = i7 == 0 ? true : z;
                                boolean z12 = i8 == 0 ? false : z2;
                                TextStyle textStyle4 = i9 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                KeyboardOptions keyboardOptions4 = i10 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                KeyboardActions keyboardActions4 = i11 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                boolean z13 = i12 == 0 ? false : z3;
                                if ((i5 & 512) == 0) {
                                    i20 = z13 ? 1 : Integer.MAX_VALUE;
                                    i6 &= -1879048193;
                                } else {
                                    i20 = i;
                                }
                                int i29 = i13 == 0 ? 1 : i2;
                                VisualTransformation none = i15 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                Function1<? super TextLayoutResult, Unit> function15 = i16 == 0 ? C07936.INSTANCE : function12;
                                if (i17 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    z4 = z13;
                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                                } else {
                                    z4 = z13;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if (i18 == 0) {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    i21 = i6;
                                    solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    i21 = i6;
                                    solidColor = brush;
                                }
                                if (i19 == 0) {
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    function3M8411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m8411getLambda2$foundation_release();
                                    i23 = i29;
                                    visualTransformation2 = none;
                                    modifier2 = modifier4;
                                    function13 = function15;
                                    keyboardActions2 = keyboardActions4;
                                    brush2 = solidColor;
                                    z5 = z11;
                                    i24 = i20;
                                    z6 = z12;
                                    textStyle2 = textStyle4;
                                    keyboardOptions2 = keyboardOptions4;
                                    z7 = z4;
                                    i22 = i21;
                                } else {
                                    i22 = i21;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    function3M8411getLambda2$foundation_release = function3;
                                    i23 = i29;
                                    visualTransformation2 = none;
                                    modifier2 = modifier4;
                                    function13 = function15;
                                    keyboardActions2 = keyboardActions4;
                                    brush2 = solidColor;
                                    z5 = z11;
                                    i24 = i20;
                                    z6 = z12;
                                    textStyle2 = textStyle4;
                                    keyboardOptions2 = keyboardOptions4;
                                    z7 = z4;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i5 & 512) != 0) {
                                    i6 &= -1879048193;
                                }
                                modifier2 = modifier;
                                z5 = z;
                                z6 = z2;
                                textStyle2 = textStyle;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActions2 = keyboardActions;
                                z7 = z3;
                                i24 = i;
                                i23 = i2;
                                visualTransformation2 = visualTransformation;
                                function13 = function12;
                                mutableInteractionSource4 = mutableInteractionSource;
                                brush2 = brush;
                                function3M8411getLambda2$foundation_release = function3;
                                i22 = i6;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1804514146, i22, i28, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:295)");
                            }
                            ImeOptions imeOptions$foundation_release = keyboardOptions2.toImeOptions$foundation_release(z7);
                            boolean z14 = !z7;
                            int i30 = !z7 ? 1 : i23;
                            int i31 = !z7 ? 1 : i24;
                            composerStartRestartGroup.startReplaceableGroup(223641526);
                            zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changedInstance(function1);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                        invoke2(textFieldValue2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                        if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                            return;
                                        }
                                        function1.invoke(textFieldValue2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i32 = i28 << 9;
                            composer2 = composerStartRestartGroup;
                            boolean z15 = z7;
                            KeyboardOptions keyboardOptions5 = keyboardOptions2;
                            CoreTextFieldKt.CoreTextField(textFieldValue, (Function1) objRememberedValue, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource4, brush2, z14, i31, i30, imeOptions$foundation_release, keyboardActions2, z5, z6, function3M8411getLambda2$foundation_release, composer2, (i22 & 910) | ((i22 >> 6) & 7168) | (i32 & 57344) | (i32 & 458752) | (3670016 & i32) | (i32 & 29360128), (i22 & 57344) | ((i22 >> 15) & 896) | (i22 & 7168) | (i28 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            z8 = z5;
                            z9 = z6;
                            textStyle3 = textStyle2;
                            z10 = z15;
                            keyboardActions3 = keyboardActions2;
                            i25 = i24;
                            i26 = i23;
                            visualTransformation3 = visualTransformation2;
                            function14 = function13;
                            keyboardOptions3 = keyboardOptions5;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            brush3 = brush2;
                            function32 = function3M8411getLambda2$foundation_release;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z8 = z;
                            z9 = z2;
                            textStyle3 = textStyle;
                            keyboardOptions3 = keyboardOptions;
                            keyboardActions3 = keyboardActions;
                            z10 = z3;
                            i26 = i2;
                            visualTransformation3 = visualTransformation;
                            function14 = function12;
                            mutableInteractionSource5 = mutableInteractionSource;
                            brush3 = brush;
                            function32 = function3;
                            composer2 = composerStartRestartGroup;
                            i25 = i;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.9
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$changed1;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ Brush $cursorBrush;
                                public final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> $decorationBox;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                public final /* synthetic */ KeyboardActions $keyboardActions;
                                public final /* synthetic */ KeyboardOptions $keyboardOptions;
                                public final /* synthetic */ int $maxLines;
                                public final /* synthetic */ int $minLines;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
                                public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
                                public final /* synthetic */ boolean $readOnly;
                                public final /* synthetic */ boolean $singleLine;
                                public final /* synthetic */ TextStyle $textStyle;
                                public final /* synthetic */ VisualTransformation $visualTransformation;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C07949(final Function1<? super TextFieldValue, Unit> function16, Modifier modifier32, boolean z82, boolean z92, TextStyle textStyle32, KeyboardOptions keyboardOptions32, KeyboardActions keyboardActions32, boolean z102, int i252, int i262, VisualTransformation visualTransformation32, Function1<? super TextLayoutResult, Unit> function142, MutableInteractionSource mutableInteractionSource52, Brush brush32, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function322, int i33, int i42, int i52) {
                                    super(2);
                                    function1 = function16;
                                    modifier = modifier32;
                                    z = z82;
                                    z = z92;
                                    textStyle = textStyle32;
                                    keyboardOptions = keyboardOptions32;
                                    keyboardActions = keyboardActions32;
                                    z = z102;
                                    i = i252;
                                    i = i262;
                                    visualTransformation = visualTransformation32;
                                    function1 = function142;
                                    mutableInteractionSource = mutableInteractionSource52;
                                    brush = brush32;
                                    function3 = function322;
                                    i = i33;
                                    i = i42;
                                    i = i52;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i33) {
                                    BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier, z, z, textStyle, keyboardOptions, keyboardActions, z, i, i, visualTransformation, function1, mutableInteractionSource, brush, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i28 |= 3072;
                    i18 = i52 & 16384;
                    if (i18 != 0) {
                    }
                    i19 = i52 & 32768;
                    if (i19 != 0) {
                    }
                    if ((i6 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i33 & 1) != 0) {
                            if (i27 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if ((i52 & 512) == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ImeOptions imeOptions$foundation_release2 = keyboardOptions2.toImeOptions$foundation_release(z7);
                            boolean z142 = !z7;
                            if (!z7) {
                            }
                            if (!z7) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(223641526);
                            zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changedInstance(function16);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                        invoke2(textFieldValue2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                        if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                            return;
                                        }
                                        function16.invoke(textFieldValue2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceableGroup();
                                int i322 = i28 << 9;
                                composer2 = composerStartRestartGroup;
                                boolean z152 = z7;
                                KeyboardOptions keyboardOptions52 = keyboardOptions2;
                                CoreTextFieldKt.CoreTextField(textFieldValue, (Function1) objRememberedValue, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource4, brush2, z142, i31, i30, imeOptions$foundation_release2, keyboardActions2, z5, z6, function3M8411getLambda2$foundation_release, composer2, (i22 & 910) | ((i22 >> 6) & 7168) | (i322 & 57344) | (i322 & 458752) | (3670016 & i322) | (i322 & 29360128), (i22 & 57344) | ((i22 >> 15) & 896) | (i22 & 7168) | (i28 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier32 = modifier2;
                                z82 = z5;
                                z92 = z6;
                                textStyle32 = textStyle2;
                                z102 = z152;
                                keyboardActions32 = keyboardActions2;
                                i252 = i24;
                                i262 = i23;
                                visualTransformation32 = visualTransformation2;
                                function142 = function13;
                                keyboardOptions32 = keyboardOptions52;
                                mutableInteractionSource52 = mutableInteractionSource4;
                                brush32 = brush2;
                                function322 = function3M8411getLambda2$foundation_release;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i17 = i52 & 8192;
                if (i17 != 0) {
                }
                i18 = i52 & 16384;
                if (i18 != 0) {
                }
                i19 = i52 & 32768;
                if (i19 != 0) {
                }
                if ((i6 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i8 = i52 & 16;
            if (i8 != 0) {
            }
            i9 = i52 & 32;
            if (i9 != 0) {
            }
            i10 = i52 & 64;
            if (i10 != 0) {
            }
            i11 = i52 & 128;
            if (i11 != 0) {
            }
            i12 = i52 & 256;
            if (i12 != 0) {
            }
            if ((i33 & 1879048192) == 0) {
            }
            i13 = i52 & 1024;
            if (i13 != 0) {
            }
            i15 = i52 & 2048;
            if (i15 != 0) {
            }
            int i282 = i14;
            i16 = i52 & 4096;
            if (i16 != 0) {
            }
            i17 = i52 & 8192;
            if (i17 != 0) {
            }
            i18 = i52 & 16384;
            if (i18 != 0) {
            }
            i19 = i52 & 32768;
            if (i19 != 0) {
            }
            if ((i6 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i52 & 8;
        if (i7 == 0) {
        }
        i8 = i52 & 16;
        if (i8 != 0) {
        }
        i9 = i52 & 32;
        if (i9 != 0) {
        }
        i10 = i52 & 64;
        if (i10 != 0) {
        }
        i11 = i52 & 128;
        if (i11 != 0) {
        }
        i12 = i52 & 256;
        if (i12 != 0) {
        }
        if ((i33 & 1879048192) == 0) {
        }
        i13 = i52 & 1024;
        if (i13 != 0) {
        }
        i15 = i52 & 2048;
        if (i15 != 0) {
        }
        int i2822 = i14;
        i16 = i52 & 4096;
        if (i16 != 0) {
        }
        i17 = i52 & 8192;
        if (i17 != 0) {
        }
        i18 = i52 & 16384;
        if (i18 != 0) {
        }
        i19 = i52 & 32768;
        if (i19 != 0) {
        }
        if ((i6 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$10 */
    /* loaded from: classes.dex */
    public static final class C078810 extends Lambda implements Function1<TextLayoutResult, Unit> {
        public static final C078810 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
            invoke2(textLayoutResult);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:246:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void BasicTextField(String str, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, int i2, int i3, int i4) {
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
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Brush solidColor;
        Function3 function32;
        VisualTransformation visualTransformation2;
        Brush brush2;
        Modifier modifier2;
        KeyboardActions keyboardActions2;
        boolean z4;
        TextStyle textStyle2;
        boolean z5;
        int i20;
        MutableInteractionSource mutableInteractionSource3;
        KeyboardOptions keyboardOptions2;
        Function1 function13;
        boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-454732590);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 896) == 0) {
                    i5 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 7168) == 0) {
                        i5 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= CpioConstants.C_ISBLK;
                    } else if ((i2 & 57344) == 0) {
                        i5 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    i9 = i4 & 32;
                    if (i9 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i2 & 458752) == 0) {
                        i5 |= composerStartRestartGroup.changed(textStyle) ? 131072 : 65536;
                    }
                    i10 = i4 & 64;
                    if (i10 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i5 |= composerStartRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                    }
                    i11 = i4 & 128;
                    if (i11 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        i5 |= composerStartRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                    }
                    i12 = i4 & 256;
                    if (i12 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 234881024) == 0) {
                        i5 |= composerStartRestartGroup.changed(z3) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i13 = i4 & 512;
                    if (i13 == 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 1879048192) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 536870912 : 268435456;
                    }
                    i14 = i4 & 1024;
                    if (i14 == 0) {
                        i15 = i3 | 6;
                    } else if ((i3 & 14) == 0) {
                        i15 = i3 | (composerStartRestartGroup.changed(visualTransformation) ? 4 : 2);
                    } else {
                        i15 = i3;
                    }
                    i16 = i4 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                    } else if ((i3 & 112) == 0) {
                        i15 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
                    }
                    int i21 = i15;
                    i17 = i4 & 4096;
                    if (i17 == 0) {
                        i21 |= 384;
                    } else {
                        if ((i3 & 896) == 0) {
                            i21 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                        }
                        i18 = i4 & 8192;
                        if (i18 == 0) {
                            if ((i3 & 7168) == 0) {
                                i21 |= composerStartRestartGroup.changed(brush) ? 2048 : 1024;
                            }
                            i19 = i4 & 16384;
                            if (i19 == 0) {
                                i21 |= CpioConstants.C_ISBLK;
                            } else if ((i3 & 57344) == 0) {
                                i21 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
                            }
                            if ((i5 & 1533916891) == 306783378 || (46811 & i21) != 9362 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier;
                                boolean z7 = i7 == 0 ? true : z;
                                boolean z8 = i8 == 0 ? false : z2;
                                TextStyle textStyle3 = i9 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                KeyboardOptions keyboardOptions3 = i10 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                KeyboardActions keyboardActions3 = i11 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                boolean z9 = i12 == 0 ? false : z3;
                                int i22 = i13 == 0 ? Integer.MAX_VALUE : i;
                                VisualTransformation none = i14 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                Function1 function14 = i16 == 0 ? C078810.INSTANCE : function12;
                                if (i17 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if (i18 == 0) {
                                    composer2 = composerStartRestartGroup;
                                    solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    solidColor = brush;
                                }
                                Function3 function3M8412getLambda3$foundation_release = i19 == 0 ? ComposableSingletons$BasicTextFieldKt.INSTANCE.m8412getLambda3$foundation_release() : function3;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-454732590, i5, i21, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:339)");
                                }
                                int i23 = i5 & 2147483646;
                                int i24 = i21 << 3;
                                BasicTextField(str, (Function1<? super String, Unit>) function1, modifier3, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) function14, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3M8412getLambda3$foundation_release, composer2, i23, (i24 & 112) | 6 | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function32 = function3M8412getLambda3$foundation_release;
                                visualTransformation2 = none;
                                brush2 = solidColor;
                                modifier2 = modifier3;
                                keyboardActions2 = keyboardActions3;
                                z4 = z8;
                                textStyle2 = textStyle3;
                                z5 = z9;
                                i20 = i22;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                keyboardOptions2 = keyboardOptions3;
                                boolean z10 = z7;
                                function13 = function14;
                                z6 = z10;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                z6 = z;
                                z4 = z2;
                                textStyle2 = textStyle;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActions2 = keyboardActions;
                                z5 = z3;
                                i20 = i;
                                visualTransformation2 = visualTransformation;
                                function13 = function12;
                                mutableInteractionSource3 = mutableInteractionSource;
                                brush2 = brush;
                                function32 = function3;
                                composer2 = composerStartRestartGroup;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.12
                                    public final /* synthetic */ int $$changed;
                                    public final /* synthetic */ int $$changed1;
                                    public final /* synthetic */ int $$default;
                                    public final /* synthetic */ Brush $cursorBrush;
                                    public final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> $decorationBox;
                                    public final /* synthetic */ boolean $enabled;
                                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                                    public final /* synthetic */ KeyboardActions $keyboardActions;
                                    public final /* synthetic */ KeyboardOptions $keyboardOptions;
                                    public final /* synthetic */ int $maxLines;
                                    public final /* synthetic */ Modifier $modifier;
                                    public final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
                                    public final /* synthetic */ Function1<String, Unit> $onValueChange;
                                    public final /* synthetic */ boolean $readOnly;
                                    public final /* synthetic */ boolean $singleLine;
                                    public final /* synthetic */ TextStyle $textStyle;
                                    public final /* synthetic */ String $value;
                                    public final /* synthetic */ VisualTransformation $visualTransformation;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public C078912(String str2, Function1<? super String, Unit> function15, Modifier modifier22, boolean z62, boolean z42, TextStyle textStyle22, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z52, int i202, VisualTransformation visualTransformation22, Function1<? super TextLayoutResult, Unit> function132, MutableInteractionSource mutableInteractionSource32, Brush brush22, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function322, int i25, int i32, int i42) {
                                        super(2);
                                        str = str2;
                                        function1 = function15;
                                        modifier = modifier22;
                                        z = z62;
                                        z = z42;
                                        textStyle = textStyle22;
                                        keyboardOptions = keyboardOptions22;
                                        keyboardActions = keyboardActions22;
                                        z = z52;
                                        i = i202;
                                        visualTransformation = visualTransformation22;
                                        function1 = function132;
                                        mutableInteractionSource = mutableInteractionSource32;
                                        brush = brush22;
                                        function3 = function322;
                                        i = i25;
                                        i = i32;
                                        i = i42;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer3, int i25) {
                                        BasicTextFieldKt.BasicTextField(str, function1, modifier, z, z, textStyle, keyboardOptions, keyboardActions, z, i, visualTransformation, function1, mutableInteractionSource, brush, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i21 |= 3072;
                        i19 = i42 & 16384;
                        if (i19 == 0) {
                        }
                        if ((i5 & 1533916891) == 306783378) {
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
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i232 = i5 & 2147483646;
                            int i242 = i21 << 3;
                            BasicTextField(str2, (Function1<? super String, Unit>) function15, modifier3, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) function14, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3M8412getLambda3$foundation_release, composer2, i232, (i242 & 112) | 6 | (i242 & 896) | (i242 & 7168) | (i242 & 57344) | (i242 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function322 = function3M8412getLambda3$foundation_release;
                            visualTransformation22 = none;
                            brush22 = solidColor;
                            modifier22 = modifier3;
                            keyboardActions22 = keyboardActions3;
                            z42 = z8;
                            textStyle22 = textStyle3;
                            z52 = z9;
                            i202 = i22;
                            mutableInteractionSource32 = mutableInteractionSource2;
                            keyboardOptions22 = keyboardOptions3;
                            boolean z102 = z7;
                            function132 = function14;
                            z62 = z102;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i18 = i42 & 8192;
                    if (i18 == 0) {
                    }
                    i19 = i42 & 16384;
                    if (i19 == 0) {
                    }
                    if ((i5 & 1533916891) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i8 = i42 & 16;
                if (i8 == 0) {
                }
                i9 = i42 & 32;
                if (i9 == 0) {
                }
                i10 = i42 & 64;
                if (i10 == 0) {
                }
                i11 = i42 & 128;
                if (i11 == 0) {
                }
                i12 = i42 & 256;
                if (i12 == 0) {
                }
                i13 = i42 & 512;
                if (i13 == 0) {
                }
                i14 = i42 & 1024;
                if (i14 == 0) {
                }
                i16 = i42 & 2048;
                if (i16 == 0) {
                }
                int i212 = i15;
                i17 = i42 & 4096;
                if (i17 == 0) {
                }
                i18 = i42 & 8192;
                if (i18 == 0) {
                }
                i19 = i42 & 16384;
                if (i19 == 0) {
                }
                if ((i5 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i7 = i42 & 8;
            if (i7 != 0) {
            }
            i8 = i42 & 16;
            if (i8 == 0) {
            }
            i9 = i42 & 32;
            if (i9 == 0) {
            }
            i10 = i42 & 64;
            if (i10 == 0) {
            }
            i11 = i42 & 128;
            if (i11 == 0) {
            }
            i12 = i42 & 256;
            if (i12 == 0) {
            }
            i13 = i42 & 512;
            if (i13 == 0) {
            }
            i14 = i42 & 1024;
            if (i14 == 0) {
            }
            i16 = i42 & 2048;
            if (i16 == 0) {
            }
            int i2122 = i15;
            i17 = i42 & 4096;
            if (i17 == 0) {
            }
            i18 = i42 & 8192;
            if (i18 == 0) {
            }
            i19 = i42 & 16384;
            if (i19 == 0) {
            }
            if ((i5 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i6 = i42 & 4;
        if (i6 == 0) {
        }
        i7 = i42 & 8;
        if (i7 != 0) {
        }
        i8 = i42 & 16;
        if (i8 == 0) {
        }
        i9 = i42 & 32;
        if (i9 == 0) {
        }
        i10 = i42 & 64;
        if (i10 == 0) {
        }
        i11 = i42 & 128;
        if (i11 == 0) {
        }
        i12 = i42 & 256;
        if (i12 == 0) {
        }
        i13 = i42 & 512;
        if (i13 == 0) {
        }
        i14 = i42 & 1024;
        if (i14 == 0) {
        }
        i16 = i42 & 2048;
        if (i16 == 0) {
        }
        int i21222 = i15;
        i17 = i42 & 4096;
        if (i17 == 0) {
        }
        i18 = i42 & 8192;
        if (i18 == 0) {
        }
        i19 = i42 & 16384;
        if (i19 == 0) {
        }
        if ((i5 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$13 */
    /* loaded from: classes.dex */
    public static final class C079013 extends Lambda implements Function1<TextLayoutResult, Unit> {
        public static final C079013 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
            invoke2(textLayoutResult);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:246:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void BasicTextField(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, int i2, int i3, int i4) {
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
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Brush solidColor;
        Function3 function32;
        VisualTransformation visualTransformation2;
        Brush brush2;
        Modifier modifier2;
        KeyboardActions keyboardActions2;
        boolean z4;
        TextStyle textStyle2;
        boolean z5;
        int i20;
        MutableInteractionSource mutableInteractionSource3;
        KeyboardOptions keyboardOptions2;
        Function1 function13;
        boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-560482651);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 896) == 0) {
                    i5 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 7168) == 0) {
                        i5 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= CpioConstants.C_ISBLK;
                    } else if ((i2 & 57344) == 0) {
                        i5 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    i9 = i4 & 32;
                    if (i9 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i2 & 458752) == 0) {
                        i5 |= composerStartRestartGroup.changed(textStyle) ? 131072 : 65536;
                    }
                    i10 = i4 & 64;
                    if (i10 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i5 |= composerStartRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                    }
                    i11 = i4 & 128;
                    if (i11 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        i5 |= composerStartRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                    }
                    i12 = i4 & 256;
                    if (i12 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 234881024) == 0) {
                        i5 |= composerStartRestartGroup.changed(z3) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i13 = i4 & 512;
                    if (i13 == 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 1879048192) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 536870912 : 268435456;
                    }
                    i14 = i4 & 1024;
                    if (i14 == 0) {
                        i15 = i3 | 6;
                    } else if ((i3 & 14) == 0) {
                        i15 = i3 | (composerStartRestartGroup.changed(visualTransformation) ? 4 : 2);
                    } else {
                        i15 = i3;
                    }
                    i16 = i4 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                    } else if ((i3 & 112) == 0) {
                        i15 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
                    }
                    int i21 = i15;
                    i17 = i4 & 4096;
                    if (i17 == 0) {
                        i21 |= 384;
                    } else {
                        if ((i3 & 896) == 0) {
                            i21 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                        }
                        i18 = i4 & 8192;
                        if (i18 == 0) {
                            if ((i3 & 7168) == 0) {
                                i21 |= composerStartRestartGroup.changed(brush) ? 2048 : 1024;
                            }
                            i19 = i4 & 16384;
                            if (i19 == 0) {
                                i21 |= CpioConstants.C_ISBLK;
                            } else if ((i3 & 57344) == 0) {
                                i21 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
                            }
                            if ((i5 & 1533916891) == 306783378 || (46811 & i21) != 9362 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier;
                                boolean z7 = i7 == 0 ? true : z;
                                boolean z8 = i8 == 0 ? false : z2;
                                TextStyle textStyle3 = i9 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                KeyboardOptions keyboardOptions3 = i10 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                KeyboardActions keyboardActions3 = i11 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                boolean z9 = i12 == 0 ? false : z3;
                                int i22 = i13 == 0 ? Integer.MAX_VALUE : i;
                                VisualTransformation none = i14 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                Function1 function14 = i16 == 0 ? C079013.INSTANCE : function12;
                                if (i17 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if (i18 == 0) {
                                    composer2 = composerStartRestartGroup;
                                    solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    solidColor = brush;
                                }
                                Function3 function3M8413getLambda4$foundation_release = i19 == 0 ? ComposableSingletons$BasicTextFieldKt.INSTANCE.m8413getLambda4$foundation_release() : function3;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-560482651, i5, i21, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:379)");
                                }
                                int i23 = i5 & 2147483646;
                                int i24 = i21 << 3;
                                BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier3, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) function14, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3M8413getLambda4$foundation_release, composer2, i23, (i24 & 112) | 6 | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function32 = function3M8413getLambda4$foundation_release;
                                visualTransformation2 = none;
                                brush2 = solidColor;
                                modifier2 = modifier3;
                                keyboardActions2 = keyboardActions3;
                                z4 = z8;
                                textStyle2 = textStyle3;
                                z5 = z9;
                                i20 = i22;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                keyboardOptions2 = keyboardOptions3;
                                boolean z10 = z7;
                                function13 = function14;
                                z6 = z10;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                z6 = z;
                                z4 = z2;
                                textStyle2 = textStyle;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActions2 = keyboardActions;
                                z5 = z3;
                                i20 = i;
                                visualTransformation2 = visualTransformation;
                                function13 = function12;
                                mutableInteractionSource3 = mutableInteractionSource;
                                brush2 = brush;
                                function32 = function3;
                                composer2 = composerStartRestartGroup;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.15
                                    public final /* synthetic */ int $$changed;
                                    public final /* synthetic */ int $$changed1;
                                    public final /* synthetic */ int $$default;
                                    public final /* synthetic */ Brush $cursorBrush;
                                    public final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> $decorationBox;
                                    public final /* synthetic */ boolean $enabled;
                                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                                    public final /* synthetic */ KeyboardActions $keyboardActions;
                                    public final /* synthetic */ KeyboardOptions $keyboardOptions;
                                    public final /* synthetic */ int $maxLines;
                                    public final /* synthetic */ Modifier $modifier;
                                    public final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
                                    public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
                                    public final /* synthetic */ boolean $readOnly;
                                    public final /* synthetic */ boolean $singleLine;
                                    public final /* synthetic */ TextStyle $textStyle;
                                    public final /* synthetic */ VisualTransformation $visualTransformation;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public C079115(Function1<? super TextFieldValue, Unit> function15, Modifier modifier22, boolean z62, boolean z42, TextStyle textStyle22, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z52, int i202, VisualTransformation visualTransformation22, Function1<? super TextLayoutResult, Unit> function132, MutableInteractionSource mutableInteractionSource32, Brush brush22, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function322, int i25, int i32, int i42) {
                                        super(2);
                                        function1 = function15;
                                        modifier = modifier22;
                                        z = z62;
                                        z = z42;
                                        textStyle = textStyle22;
                                        keyboardOptions = keyboardOptions22;
                                        keyboardActions = keyboardActions22;
                                        z = z52;
                                        i = i202;
                                        visualTransformation = visualTransformation22;
                                        function1 = function132;
                                        mutableInteractionSource = mutableInteractionSource32;
                                        brush = brush22;
                                        function3 = function322;
                                        i = i25;
                                        i = i32;
                                        i = i42;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer3, int i25) {
                                        BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier, z, z, textStyle, keyboardOptions, keyboardActions, z, i, visualTransformation, function1, mutableInteractionSource, brush, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i21 |= 3072;
                        i19 = i42 & 16384;
                        if (i19 == 0) {
                        }
                        if ((i5 & 1533916891) == 306783378) {
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
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i232 = i5 & 2147483646;
                            int i242 = i21 << 3;
                            BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function15, modifier3, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) function14, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3M8413getLambda4$foundation_release, composer2, i232, (i242 & 112) | 6 | (i242 & 896) | (i242 & 7168) | (i242 & 57344) | (i242 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function322 = function3M8413getLambda4$foundation_release;
                            visualTransformation22 = none;
                            brush22 = solidColor;
                            modifier22 = modifier3;
                            keyboardActions22 = keyboardActions3;
                            z42 = z8;
                            textStyle22 = textStyle3;
                            z52 = z9;
                            i202 = i22;
                            mutableInteractionSource32 = mutableInteractionSource2;
                            keyboardOptions22 = keyboardOptions3;
                            boolean z102 = z7;
                            function132 = function14;
                            z62 = z102;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i18 = i42 & 8192;
                    if (i18 == 0) {
                    }
                    i19 = i42 & 16384;
                    if (i19 == 0) {
                    }
                    if ((i5 & 1533916891) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i8 = i42 & 16;
                if (i8 == 0) {
                }
                i9 = i42 & 32;
                if (i9 == 0) {
                }
                i10 = i42 & 64;
                if (i10 == 0) {
                }
                i11 = i42 & 128;
                if (i11 == 0) {
                }
                i12 = i42 & 256;
                if (i12 == 0) {
                }
                i13 = i42 & 512;
                if (i13 == 0) {
                }
                i14 = i42 & 1024;
                if (i14 == 0) {
                }
                i16 = i42 & 2048;
                if (i16 == 0) {
                }
                int i212 = i15;
                i17 = i42 & 4096;
                if (i17 == 0) {
                }
                i18 = i42 & 8192;
                if (i18 == 0) {
                }
                i19 = i42 & 16384;
                if (i19 == 0) {
                }
                if ((i5 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i7 = i42 & 8;
            if (i7 != 0) {
            }
            i8 = i42 & 16;
            if (i8 == 0) {
            }
            i9 = i42 & 32;
            if (i9 == 0) {
            }
            i10 = i42 & 64;
            if (i10 == 0) {
            }
            i11 = i42 & 128;
            if (i11 == 0) {
            }
            i12 = i42 & 256;
            if (i12 == 0) {
            }
            i13 = i42 & 512;
            if (i13 == 0) {
            }
            i14 = i42 & 1024;
            if (i14 == 0) {
            }
            i16 = i42 & 2048;
            if (i16 == 0) {
            }
            int i2122 = i15;
            i17 = i42 & 4096;
            if (i17 == 0) {
            }
            i18 = i42 & 8192;
            if (i18 == 0) {
            }
            i19 = i42 & 16384;
            if (i19 == 0) {
            }
            if ((i5 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i6 = i42 & 4;
        if (i6 == 0) {
        }
        i7 = i42 & 8;
        if (i7 != 0) {
        }
        i8 = i42 & 16;
        if (i8 == 0) {
        }
        i9 = i42 & 32;
        if (i9 == 0) {
        }
        i10 = i42 & 64;
        if (i10 == 0) {
        }
        i11 = i42 & 128;
        if (i11 == 0) {
        }
        i12 = i42 & 256;
        if (i12 == 0) {
        }
        i13 = i42 & 512;
        if (i13 == 0) {
        }
        i14 = i42 & 1024;
        if (i14 == 0) {
        }
        i16 = i42 & 2048;
        if (i16 == 0) {
        }
        int i21222 = i15;
        i17 = i42 & 4096;
        if (i17 == 0) {
        }
        i18 = i42 & 8192;
        if (i18 == 0) {
        }
        i19 = i42 & 16384;
        if (i19 == 0) {
        }
        if ((i5 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final TextFieldValue BasicTextField$lambda$2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    public static final String BasicTextField$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }
}
