package androidx.compose.foundation.text2;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HeightInLinesModifierKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.TextFieldSizeKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text2.input.CodepointTransformation;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.SingleLineCodepointTransformation;
import androidx.compose.foundation.text2.input.TextFieldLineLimits;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.foundation.text2.input.internal.StateSyncingModifierKt;
import androidx.compose.foundation.text2.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifier;
import androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.foundation.text2.input.internal.TextLayoutState;
import androidx.compose.foundation.text2.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.hapticfeedback.HapticFeedback;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.ClipboardManager;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.TextToolbar;
import androidx.compose.p003ui.platform.WindowInfo;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BasicTextField2.kt */
@Metadata(m7104d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001aÙ\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u001628\b\u0002\u0010\u0017\u001a2\u0012\u0004\u0012\u00020\u0019\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0018¢\u0006\u0002\b\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)\u001aí\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00050-2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u001628\b\u0002\u0010\u0017\u001a2\u0012\u0004\u0012\u00020\u0019\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0018¢\u0006\u0002\b\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010.\u001a\u0015\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\u00102\u001a\u0015\u00103\u001a\u00020\u00052\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\u00102\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u00064²\u0006\n\u00105\u001a\u000206X\u008a\u008e\u0002"}, m7105d2 = {"DefaultTextFieldDecorator", "Landroidx/compose/foundation/text2/TextFieldDecorator;", "getDefaultTextFieldDecorator$annotations", "()V", "BasicTextField2", "", "state", "Landroidx/compose/foundation/text2/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "inputTransformation", "Landroidx/compose/foundation/text2/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "lineLimits", "Landroidx/compose/foundation/text2/input/TextFieldLineLimits;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", "Lkotlin/ExtensionFunctionType;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "codepointTransformation", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "decorator", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/text2/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text2/input/CodepointTransformation;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "value", "", "onValueChange", "Lkotlin/Function1;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/text2/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text2/input/CodepointTransformation;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "TextFieldCursorHandle", "selectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V", "TextFieldSelectionHandles", "foundation_release", "valueWithSelection", "Landroidx/compose/ui/text/input/TextFieldValue;"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBasicTextField2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,543:1\n25#2:544\n25#2:551\n25#2:567\n67#2,3:574\n66#2:577\n36#2:585\n36#2:592\n456#2,8:619\n464#2,3:633\n467#2,3:637\n1116#3,6:545\n1116#3,6:552\n1116#3,6:558\n1116#3,6:568\n1116#3,3:578\n1119#3,3:582\n1116#3,6:586\n1116#3,6:593\n1116#3,6:642\n74#4:564\n74#4:565\n74#4:566\n74#4:599\n74#4:600\n74#4:601\n1#5:581\n68#6,6:602\n74#6:636\n78#6:641\n79#7,11:608\n92#7:640\n3737#8,6:627\n81#9:648\n107#9,2:649\n*S KotlinDebug\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt\n*L\n191#1:544\n201#1:551\n342#1:567\n347#1:574,3\n347#1:577\n358#1:585\n360#1:592\n424#1:619,8\n424#1:633,3\n424#1:637,3\n191#1:545,6\n201#1:552,6\n216#1:558,6\n342#1:568,6\n347#1:578,3\n347#1:582,3\n358#1:586,6\n360#1:593,6\n494#1:642,6\n336#1:564\n337#1:565\n338#1:566\n370#1:599\n371#1:600\n372#1:601\n424#1:602,6\n424#1:636\n424#1:641\n424#1:608,11\n424#1:640\n424#1:627,6\n201#1:648\n201#1:649,2\n*E\n"})
/* loaded from: classes3.dex */
public final class BasicTextField2Kt {

    @NotNull
    private static final TextFieldDecorator DefaultTextFieldDecorator = BasicTextField2Kt$DefaultTextFieldDecorator$1.INSTANCE;

    private static /* synthetic */ void getDefaultTextFieldDecorator$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b  */
    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField2(@NotNull final String str, @NotNull final Function1<? super String, Unit> function1, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable InputTransformation inputTransformation, @Nullable TextStyle textStyle, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, @Nullable TextFieldLineLimits textFieldLineLimits, @Nullable Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Brush brush, @Nullable CodepointTransformation codepointTransformation, @Nullable TextFieldDecorator textFieldDecorator, @Nullable ScrollState scrollState, @Nullable Composer composer, final int i, final int i2, final int i3) {
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
        int i15;
        int i16;
        int i17;
        Modifier modifier2;
        KeyboardOptions keyboardOptions2;
        MutableInteractionSource mutableInteractionSource2;
        Brush solidColor;
        ScrollState scrollStateRememberScrollState;
        TextFieldDecorator textFieldDecorator2;
        TextFieldLineLimits textFieldLineLimits2;
        CodepointTransformation codepointTransformation2;
        int i18;
        Brush brush2;
        boolean z3;
        InputTransformation inputTransformation2;
        MutableInteractionSource mutableInteractionSource3;
        KeyboardActions keyboardActions2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        boolean z4;
        TextStyle textStyle2;
        Object objRememberedValue;
        Composer.Companion companion;
        TextFieldLineLimits textFieldLineLimits3;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23;
        MutableInteractionSource mutableInteractionSource4;
        Object objRememberedValue2;
        final MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue3;
        final KeyboardActions keyboardActions3;
        Brush brush3;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24;
        MutableInteractionSource mutableInteractionSource5;
        final TextFieldLineLimits textFieldLineLimits4;
        Modifier modifier3;
        InputTransformation inputTransformation3;
        TextStyle textStyle3;
        final ScrollState scrollState2;
        boolean z5;
        boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-797091052);
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
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= 384;
        } else {
            if ((i & 896) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= CpioConstants.C_ISBLK;
                } else if ((i & 57344) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i & 458752) == 0) {
                    i4 |= composerStartRestartGroup.changed(inputTransformation) ? 131072 : 65536;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i4 |= composerStartRestartGroup.changed(textStyle) ? 1048576 : 524288;
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= composerStartRestartGroup.changed(keyboardOptions) ? 8388608 : 4194304;
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i4 |= composerStartRestartGroup.changed(keyboardActions) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i11 = i3 & 512;
                if (i11 != 0) {
                    i4 |= 805306368;
                } else if ((i & 1879048192) == 0) {
                    i4 |= composerStartRestartGroup.changed(textFieldLineLimits) ? 536870912 : 268435456;
                }
                i12 = i3 & 1024;
                if (i12 != 0) {
                    i13 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i13 = i2 | (composerStartRestartGroup.changedInstance(function2) ? 4 : 2);
                } else {
                    i13 = i2;
                }
                i14 = i3 & 2048;
                if (i14 != 0) {
                    i13 |= 48;
                } else if ((i2 & 112) == 0) {
                    i13 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                }
                int i20 = i13;
                i15 = i3 & 4096;
                if (i15 != 0) {
                    i20 |= 384;
                } else {
                    if ((i2 & 896) == 0) {
                        i20 |= composerStartRestartGroup.changed(brush) ? 256 : 128;
                    }
                    i16 = i3 & 8192;
                    if (i16 != 0) {
                        if ((i2 & 7168) == 0) {
                            i20 |= composerStartRestartGroup.changed(codepointTransformation) ? 2048 : 1024;
                        }
                        i17 = i3 & 16384;
                        if (i17 != 0) {
                            i20 |= CpioConstants.C_ISBLK;
                        } else if ((i2 & 57344) == 0) {
                            i20 |= composerStartRestartGroup.changed(textFieldDecorator) ? 16384 : 8192;
                        }
                        if ((i2 & 458752) == 0) {
                            i20 |= ((i3 & 32768) == 0 && composerStartRestartGroup.changed(scrollState)) ? 131072 : 65536;
                        }
                        if ((i4 & 1533916891) != 306783378 || (374491 & i20) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i19 == 0 ? Modifier.INSTANCE : modifier;
                                boolean z7 = i5 == 0 ? true : z;
                                boolean z8 = i6 == 0 ? false : z2;
                                InputTransformation inputTransformation4 = i7 == 0 ? null : inputTransformation;
                                TextStyle textStyle4 = i8 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                keyboardOptions2 = i9 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                KeyboardActions keyboardActions4 = i10 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                TextFieldLineLimits textFieldLineLimits5 = i11 == 0 ? TextFieldLineLimits.INSTANCE.getDefault() : textFieldLineLimits;
                                Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25 = i12 == 0 ? null : function2;
                                MutableInteractionSource mutableInteractionSource6 = i14 == 0 ? null : mutableInteractionSource;
                                if (i15 == 0) {
                                    mutableInteractionSource2 = mutableInteractionSource6;
                                    solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource6;
                                    solidColor = brush;
                                }
                                CodepointTransformation codepointTransformation3 = i16 == 0 ? null : codepointTransformation;
                                TextFieldDecorator textFieldDecorator3 = i17 == 0 ? null : textFieldDecorator;
                                if ((i3 & 32768) == 0) {
                                    textFieldDecorator2 = textFieldDecorator3;
                                    textFieldLineLimits2 = textFieldLineLimits5;
                                    codepointTransformation2 = codepointTransformation3;
                                    i18 = i20 & (-458753);
                                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                    z3 = z8;
                                    inputTransformation2 = inputTransformation4;
                                    keyboardActions2 = keyboardActions4;
                                    function22 = function25;
                                    brush2 = solidColor;
                                    z4 = z7;
                                    textStyle2 = textStyle4;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                } else {
                                    scrollStateRememberScrollState = scrollState;
                                    textFieldDecorator2 = textFieldDecorator3;
                                    textFieldLineLimits2 = textFieldLineLimits5;
                                    codepointTransformation2 = codepointTransformation3;
                                    i18 = i20;
                                    brush2 = solidColor;
                                    z3 = z8;
                                    inputTransformation2 = inputTransformation4;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    keyboardActions2 = keyboardActions4;
                                    function22 = function25;
                                    z4 = z7;
                                    textStyle2 = textStyle4;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 32768) != 0) {
                                    i20 &= -458753;
                                }
                                modifier2 = modifier;
                                z4 = z;
                                z3 = z2;
                                inputTransformation2 = inputTransformation;
                                textStyle2 = textStyle;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActions2 = keyboardActions;
                                textFieldLineLimits2 = textFieldLineLimits;
                                mutableInteractionSource3 = mutableInteractionSource;
                                brush2 = brush;
                                codepointTransformation2 = codepointTransformation;
                                textFieldDecorator2 = textFieldDecorator;
                                scrollStateRememberScrollState = scrollState;
                                i18 = i20;
                                function22 = function2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-797091052, i4, i18, "androidx.compose.foundation.text2.BasicTextField2 (BasicTextField2.kt:189)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            Brush brush4 = brush2;
                            if (objRememberedValue != companion.getEmpty()) {
                                function23 = function22;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                textFieldLineLimits3 = textFieldLineLimits2;
                                objRememberedValue = new TextFieldState(str, TextRangeKt.TextRange(str.length()), (DefaultConstructorMarker) null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                textFieldLineLimits3 = textFieldLineLimits2;
                                function23 = function22;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            TextFieldState textFieldState = (TextFieldState) objRememberedValue;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue2;
                            mutableState.setValue(TextFieldValue.m13399copy3r_uNRQ$default(BasicTextField2$lambda$2(mutableState), str, 0L, (TextRange) null, 6, (Object) null));
                            TextFieldValue textFieldValueBasicTextField2$lambda$2 = BasicTextField2$lambda$2(mutableState);
                            composerStartRestartGroup.startReplaceableGroup(-949375112);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(function1);
                            KeyboardActions keyboardActions5 = keyboardActions2;
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$1$1
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
                                        if (!Intrinsics.areEqual(textFieldValue.getText(), BasicTextField2Kt.BasicTextField2$lambda$2(mutableState).getText())) {
                                            function1.invoke(textFieldValue.getText());
                                        }
                                        mutableState.setValue(textFieldValue);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i21 = i4 >> 3;
                            BasicTextField2(textFieldState, StateSyncingModifierKt.syncTextFieldState(modifier2, textFieldState, textFieldValueBasicTextField2$lambda$2, (Function1) objRememberedValue3, false), z4, z3, inputTransformation2, textStyle2, keyboardOptions2, keyboardActions5, textFieldLineLimits3, function23, mutableInteractionSource4, brush4, codepointTransformation2, textFieldDecorator2, scrollStateRememberScrollState, composerStartRestartGroup, (i21 & 234881024) | (i21 & 896) | 6 | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (3670016 & i21) | (29360128 & i21) | ((i18 << 27) & 1879048192), (i18 >> 3) & 65534, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            keyboardActions3 = keyboardActions5;
                            brush3 = brush4;
                            function24 = function23;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            textFieldLineLimits4 = textFieldLineLimits3;
                            modifier3 = modifier2;
                            inputTransformation3 = inputTransformation2;
                            textStyle3 = textStyle2;
                            scrollState2 = scrollStateRememberScrollState;
                            z5 = z4;
                            z6 = z3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z5 = z;
                            z6 = z2;
                            inputTransformation3 = inputTransformation;
                            textStyle3 = textStyle;
                            keyboardOptions2 = keyboardOptions;
                            keyboardActions3 = keyboardActions;
                            textFieldLineLimits4 = textFieldLineLimits;
                            function24 = function2;
                            mutableInteractionSource5 = mutableInteractionSource;
                            brush3 = brush;
                            codepointTransformation2 = codepointTransformation;
                            textFieldDecorator2 = textFieldDecorator;
                            scrollState2 = scrollState;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier3;
                            final boolean z9 = z5;
                            final boolean z10 = z6;
                            final InputTransformation inputTransformation5 = inputTransformation3;
                            final TextStyle textStyle5 = textStyle3;
                            final KeyboardOptions keyboardOptions3 = keyboardOptions2;
                            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function26 = function24;
                            final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource5;
                            final Brush brush5 = brush3;
                            final CodepointTransformation codepointTransformation4 = codepointTransformation2;
                            final TextFieldDecorator textFieldDecorator4 = textFieldDecorator2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt.BasicTextField2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i22) {
                                    BasicTextField2Kt.BasicTextField2(str, function1, modifier4, z9, z10, inputTransformation5, textStyle5, keyboardOptions3, keyboardActions3, textFieldLineLimits4, function26, mutableInteractionSource7, brush5, codepointTransformation4, textFieldDecorator4, scrollState2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i20 |= 3072;
                    i17 = i3 & 16384;
                    if (i17 != 0) {
                    }
                    if ((i2 & 458752) == 0) {
                    }
                    if ((i4 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i19 == 0) {
                            }
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
                            if (i10 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if ((i3 & 32768) == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            Brush brush42 = brush2;
                            if (objRememberedValue != companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            TextFieldState textFieldState2 = (TextFieldState) objRememberedValue;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue2;
                            mutableState.setValue(TextFieldValue.m13399copy3r_uNRQ$default(BasicTextField2$lambda$2(mutableState), str, 0L, (TextRange) null, 6, (Object) null));
                            TextFieldValue textFieldValueBasicTextField2$lambda$22 = BasicTextField2$lambda$2(mutableState);
                            composerStartRestartGroup.startReplaceableGroup(-949375112);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(function1);
                            KeyboardActions keyboardActions52 = keyboardActions2;
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$1$1
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
                                        if (!Intrinsics.areEqual(textFieldValue.getText(), BasicTextField2Kt.BasicTextField2$lambda$2(mutableState).getText())) {
                                            function1.invoke(textFieldValue.getText());
                                        }
                                        mutableState.setValue(textFieldValue);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceableGroup();
                                int i212 = i4 >> 3;
                                BasicTextField2(textFieldState2, StateSyncingModifierKt.syncTextFieldState(modifier2, textFieldState2, textFieldValueBasicTextField2$lambda$22, (Function1) objRememberedValue3, false), z4, z3, inputTransformation2, textStyle2, keyboardOptions2, keyboardActions52, textFieldLineLimits3, function23, mutableInteractionSource4, brush42, codepointTransformation2, textFieldDecorator2, scrollStateRememberScrollState, composerStartRestartGroup, (i212 & 234881024) | (i212 & 896) | 6 | (i212 & 7168) | (i212 & 57344) | (i212 & 458752) | (3670016 & i212) | (29360128 & i212) | ((i18 << 27) & 1879048192), (i18 >> 3) & 65534, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                keyboardActions3 = keyboardActions52;
                                brush3 = brush42;
                                function24 = function23;
                                mutableInteractionSource5 = mutableInteractionSource4;
                                textFieldLineLimits4 = textFieldLineLimits3;
                                modifier3 = modifier2;
                                inputTransformation3 = inputTransformation2;
                                textStyle3 = textStyle2;
                                scrollState2 = scrollStateRememberScrollState;
                                z5 = z4;
                                z6 = z3;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i16 = i3 & 8192;
                if (i16 != 0) {
                }
                i17 = i3 & 16384;
                if (i17 != 0) {
                }
                if ((i2 & 458752) == 0) {
                }
                if ((i4 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            i14 = i3 & 2048;
            if (i14 != 0) {
            }
            int i202 = i13;
            i15 = i3 & 4096;
            if (i15 != 0) {
            }
            i16 = i3 & 8192;
            if (i16 != 0) {
            }
            i17 = i3 & 16384;
            if (i17 != 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            if ((i4 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        i14 = i3 & 2048;
        if (i14 != 0) {
        }
        int i2022 = i13;
        i15 = i3 & 4096;
        if (i15 != 0) {
        }
        i16 = i3 & 8192;
        if (i16 != 0) {
        }
        i17 = i3 & 16384;
        if (i17 != 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        if ((i4 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:295:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [androidx.compose.foundation.text2.TextFieldDecorator] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v35, types: [androidx.compose.foundation.text2.TextFieldDecorator] */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r47v0, types: [androidx.compose.foundation.text2.TextFieldDecorator, java.lang.Object] */
    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField2(@NotNull final TextFieldState textFieldState, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable InputTransformation inputTransformation, @Nullable TextStyle textStyle, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, @Nullable TextFieldLineLimits textFieldLineLimits, @Nullable Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Brush brush, @Nullable CodepointTransformation codepointTransformation, @Nullable TextFieldDecorator textFieldDecorator, @Nullable ScrollState scrollState, @Nullable Composer composer, final int i, final int i2, final int i3) {
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
        int i15;
        int i16;
        int i17;
        Modifier modifier2;
        boolean z3;
        boolean z4;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        TextFieldLineLimits textFieldLineLimits2;
        CodepointTransformation codepointTransformation2;
        Brush solidColor;
        ScrollState scrollStateRememberScrollState;
        int i18;
        CodepointTransformation codepointTransformation3;
        MutableInteractionSource mutableInteractionSource2;
        CodepointTransformation codepointTransformation4;
        TextFieldLineLimits textFieldLineLimits3;
        Brush brush2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        InputTransformation inputTransformation2;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource4;
        boolean zChanged;
        LayoutDirection layoutDirection;
        CodepointTransformation codepointTransformation5;
        final TransformedTextFieldState transformedTextFieldState;
        boolean zChanged2;
        Object objRememberedValue;
        final TextLayoutState textLayoutState;
        boolean zChanged3;
        Object objRememberedValue2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final boolean z5;
        final boolean z6;
        final KeyboardActions keyboardActions3;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final ScrollState scrollState2;
        final Brush brush3;
        final MutableInteractionSource mutableInteractionSource5;
        final TextFieldLineLimits textFieldLineLimits4;
        final CodepointTransformation codepointTransformation6;
        final ?? r14;
        final InputTransformation inputTransformation3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(437246650);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i19 = i3 & 2;
        if (i19 != 0) {
            i4 |= 48;
        } else {
            if ((i & 112) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 896) == 0) {
                    i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    int i20 = 8192;
                    if (i7 == 0) {
                        i4 |= CpioConstants.C_ISBLK;
                    } else if ((i & 57344) == 0) {
                        i4 |= composerStartRestartGroup.changed(inputTransformation) ? 16384 : 8192;
                    }
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i & 458752) == 0) {
                        i4 |= composerStartRestartGroup.changed(textStyle) ? 131072 : 65536;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= composerStartRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i4 |= composerStartRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                    }
                    i11 = i3 & 256;
                    if (i11 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i4 |= composerStartRestartGroup.changed(textFieldLineLimits) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i12 = i3 & 512;
                    if (i12 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
                    }
                    i13 = i3 & 1024;
                    if (i13 == 0) {
                        i14 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i14 = i2 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                    } else {
                        i14 = i2;
                    }
                    i15 = i3 & 2048;
                    if (i15 == 0) {
                        i14 |= 48;
                    } else if ((i2 & 112) == 0) {
                        i14 |= composerStartRestartGroup.changed(brush) ? 32 : 16;
                    }
                    int i21 = i14;
                    i16 = i3 & 4096;
                    if (i16 == 0) {
                        i21 |= 384;
                    } else {
                        if ((i2 & 896) == 0) {
                            i21 |= composerStartRestartGroup.changed(codepointTransformation) ? 256 : 128;
                        }
                        i17 = i3 & 8192;
                        if (i17 == 0) {
                            if ((i2 & 7168) == 0) {
                                i21 |= composerStartRestartGroup.changed((Object) textFieldDecorator) ? 2048 : 1024;
                            }
                            if ((i2 & 57344) == 0) {
                                if ((i3 & 16384) == 0 && composerStartRestartGroup.changed(scrollState)) {
                                    i20 = 16384;
                                }
                                i21 |= i20;
                            }
                            if ((i4 & 1533916891) == 306783378 || (46811 & i21) != 9362 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier2 = i19 == 0 ? Modifier.INSTANCE : modifier;
                                    z3 = i5 == 0 ? true : z;
                                    z4 = i6 == 0 ? false : z2;
                                    InputTransformation inputTransformation4 = i7 == 0 ? null : inputTransformation;
                                    textStyle2 = i8 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                    keyboardOptions2 = i9 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                    keyboardActions2 = i10 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                    TextFieldLineLimits textFieldLineLimits5 = i11 == 0 ? TextFieldLineLimits.INSTANCE.getDefault() : textFieldLineLimits;
                                    Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24 = i12 == 0 ? null : function2;
                                    MutableInteractionSource mutableInteractionSource6 = i13 == 0 ? null : mutableInteractionSource;
                                    if (i15 == 0) {
                                        textFieldLineLimits2 = textFieldLineLimits5;
                                        codepointTransformation2 = null;
                                        solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
                                    } else {
                                        textFieldLineLimits2 = textFieldLineLimits5;
                                        codepointTransformation2 = null;
                                        solidColor = brush;
                                    }
                                    CodepointTransformation codepointTransformation7 = i16 == 0 ? codepointTransformation2 : codepointTransformation;
                                    CodepointTransformation codepointTransformation8 = i17 == 0 ? codepointTransformation2 : textFieldDecorator;
                                    if ((i3 & 16384) == 0) {
                                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                        i21 &= -57345;
                                    } else {
                                        scrollStateRememberScrollState = scrollState;
                                    }
                                    i18 = i21;
                                    codepointTransformation3 = codepointTransformation8;
                                    mutableInteractionSource2 = mutableInteractionSource6;
                                    codepointTransformation4 = codepointTransformation7;
                                    textFieldLineLimits3 = textFieldLineLimits2;
                                    brush2 = solidColor;
                                    function22 = function24;
                                    inputTransformation2 = inputTransformation4;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16384) != 0) {
                                        i21 &= -57345;
                                    }
                                    modifier2 = modifier;
                                    z3 = z;
                                    z4 = z2;
                                    inputTransformation2 = inputTransformation;
                                    textStyle2 = textStyle;
                                    keyboardOptions2 = keyboardOptions;
                                    keyboardActions2 = keyboardActions;
                                    textFieldLineLimits3 = textFieldLineLimits;
                                    function22 = function2;
                                    brush2 = brush;
                                    codepointTransformation4 = codepointTransformation;
                                    codepointTransformation3 = textFieldDecorator;
                                    scrollStateRememberScrollState = scrollState;
                                    i18 = i21;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(437246650, i4, i18, "androidx.compose.foundation.text2.BasicTextField2 (BasicTextField2.kt:334)");
                                }
                                final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                WindowInfo windowInfo = (WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo());
                                final boolean zAreEqual = Intrinsics.areEqual(textFieldLineLimits3, TextFieldLineLimits.SingleLine.INSTANCE);
                                final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25 = function22;
                                composerStartRestartGroup.startReplaceableGroup(-957633428);
                                if (mutableInteractionSource2 != null) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource4 = (MutableInteractionSource) objRememberedValue3;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Orientation orientation = !zAreEqual ? Orientation.Horizontal : Orientation.Vertical;
                                final Brush brush4 = brush2;
                                final boolean zBooleanValue = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composerStartRestartGroup, 0).getValue().booleanValue();
                                final boolean zIsWindowFocused = windowInfo.isWindowFocused();
                                final TextFieldLineLimits textFieldLineLimits6 = textFieldLineLimits3;
                                composerStartRestartGroup.startReplaceableGroup(1618982084);
                                zChanged = composerStartRestartGroup.changed(textFieldState) | composerStartRestartGroup.changed(inputTransformation2) | composerStartRestartGroup.changed(codepointTransformation4);
                                CodepointTransformation codepointTransformation9 = codepointTransformation3;
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    layoutDirection = layoutDirection2;
                                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    transformedTextFieldState = (TransformedTextFieldState) objRememberedValue4;
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    zChanged2 = composerStartRestartGroup.changed(transformedTextFieldState);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new TextLayoutState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    textLayoutState = (TextLayoutState) objRememberedValue;
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    zChanged3 = composerStartRestartGroup.changed(transformedTextFieldState);
                                    CodepointTransformation codepointTransformation10 = codepointTransformation4;
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new TextFieldSelectionState(transformedTextFieldState, textLayoutState, density, z3, z4, !zBooleanValue && zIsWindowFocused);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    final TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) objRememberedValue2;
                                    final HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                                    final ClipboardManager clipboardManager = (ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager());
                                    final TextToolbar textToolbar = (TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar());
                                    final Orientation orientation2 = orientation;
                                    final boolean z7 = z3;
                                    final boolean z8 = z4;
                                    EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt.BasicTextField2.3
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
                                            textFieldSelectionState.update(hapticFeedback, clipboardManager, textToolbar, density, z7, z8);
                                        }
                                    }, composerStartRestartGroup, 0);
                                    EffectsKt.DisposableEffect(textFieldSelectionState, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt.BasicTextField2.4
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        @NotNull
                                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                                            final TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4$invoke$$inlined$onDispose$1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    textFieldSelectionState2.dispose();
                                                }
                                            };
                                        }
                                    }, composerStartRestartGroup, 8);
                                    modifier3 = modifier2;
                                    Modifier modifierScrollable$default = ScrollableKt.scrollable$default(FocusableKt.focusable(modifier2.then(new TextFieldDecoratorModifier(transformedTextFieldState, textLayoutState, textFieldSelectionState, inputTransformation2, z3, z4, keyboardOptions2, keyboardActions2, zAreEqual)), z3, mutableInteractionSource4), scrollStateRememberScrollState, orientation2, !z3 && scrollStateRememberScrollState.getMaxValue() > 0 && textFieldSelectionState.getDraggingHandle() == null, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation2, false), null, mutableInteractionSource4, 16, null);
                                    composerStartRestartGroup.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composerStartRestartGroup, 48);
                                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierScrollable$default);
                                    InputTransformation inputTransformation5 = inputTransformation2;
                                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    final TextStyle textStyle4 = textStyle2;
                                    final boolean z9 = z3;
                                    final boolean z10 = z4;
                                    final ScrollState scrollState3 = scrollStateRememberScrollState;
                                    (codepointTransformation9 != null ? DefaultTextFieldDecorator : codepointTransformation9).Decoration(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1476233751, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$5$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer2, int i22) {
                                            int minHeightInLines;
                                            int maxHeightInLines;
                                            if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1476233751, i22, -1, "androidx.compose.foundation.text2.BasicTextField2.<anonymous>.<anonymous> (BasicTextField2.kt:426)");
                                                }
                                                TextFieldLineLimits textFieldLineLimits7 = textFieldLineLimits6;
                                                if (textFieldLineLimits7 instanceof TextFieldLineLimits.MultiLine) {
                                                    minHeightInLines = ((TextFieldLineLimits.MultiLine) textFieldLineLimits7).getMinHeightInLines();
                                                    maxHeightInLines = ((TextFieldLineLimits.MultiLine) textFieldLineLimits6).getMaxHeightInLines();
                                                } else {
                                                    minHeightInLines = 1;
                                                    maxHeightInLines = 1;
                                                }
                                                Modifier modifierThen = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m8160heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState.m8702getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle4, minHeightInLines, maxHeightInLines), textStyle4)).then(new TextFieldCoreModifier(zBooleanValue && zIsWindowFocused, textLayoutState, transformedTextFieldState, textFieldSelectionState, brush4, z9 && !z10, scrollState3, orientation2));
                                                TextLayoutState textLayoutState2 = textLayoutState;
                                                TransformedTextFieldState transformedTextFieldState2 = transformedTextFieldState;
                                                TextStyle textStyle5 = textStyle4;
                                                boolean z11 = zAreEqual;
                                                Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function25;
                                                boolean z12 = z9;
                                                boolean z13 = zBooleanValue;
                                                boolean z14 = zIsWindowFocused;
                                                TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                                                boolean z15 = z10;
                                                composer2.startReplaceableGroup(733328855);
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                                composer2.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierThen);
                                                if (!(composer2.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                    composer2.createNode(constructor2);
                                                } else {
                                                    composer2.useNode();
                                                }
                                                Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                                composer2.startReplaceableGroup(2058660585);
                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                BoxKt.Box(new TextFieldTextLayoutModifier(textLayoutState2, transformedTextFieldState2, textStyle5, z11, function26), composer2, 0);
                                                composer2.startReplaceableGroup(-39277302);
                                                if (z12 && z13 && z14 && textFieldSelectionState2.isInTouchMode()) {
                                                    BasicTextField2Kt.TextFieldSelectionHandles(textFieldSelectionState2, composer2, 8);
                                                    if (!z15) {
                                                        BasicTextField2Kt.TextFieldCursorHandle(textFieldSelectionState2, composer2, 8);
                                                    }
                                                }
                                                composer2.endReplaceableGroup();
                                                composer2.endReplaceableGroup();
                                                composer2.endNode();
                                                composer2.endReplaceableGroup();
                                                composer2.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }), composerStartRestartGroup, 6);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    z5 = z3;
                                    z6 = z4;
                                    keyboardActions3 = keyboardActions2;
                                    function23 = function25;
                                    textStyle3 = textStyle2;
                                    keyboardOptions3 = keyboardOptions2;
                                    scrollState2 = scrollStateRememberScrollState;
                                    brush3 = brush4;
                                    mutableInteractionSource5 = mutableInteractionSource3;
                                    textFieldLineLimits4 = textFieldLineLimits6;
                                    codepointTransformation6 = codepointTransformation10;
                                    r14 = codepointTransformation9;
                                    inputTransformation3 = inputTransformation5;
                                } else {
                                    layoutDirection = layoutDirection2;
                                }
                                if (codepointTransformation4 != null) {
                                    codepointTransformation5 = zAreEqual ? SingleLineCodepointTransformation.INSTANCE : null;
                                } else {
                                    codepointTransformation5 = codepointTransformation4;
                                }
                                TransformedTextFieldState transformedTextFieldState2 = new TransformedTextFieldState(textFieldState, inputTransformation2, codepointTransformation5);
                                composerStartRestartGroup.updateRememberedValue(transformedTextFieldState2);
                                objRememberedValue4 = transformedTextFieldState2;
                                composerStartRestartGroup.endReplaceableGroup();
                                transformedTextFieldState = (TransformedTextFieldState) objRememberedValue4;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(transformedTextFieldState);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue = new TextLayoutState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    textLayoutState = (TextLayoutState) objRememberedValue;
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    zChanged3 = composerStartRestartGroup.changed(transformedTextFieldState);
                                    CodepointTransformation codepointTransformation102 = codepointTransformation4;
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged3) {
                                        if (zBooleanValue) {
                                            objRememberedValue2 = new TextFieldSelectionState(transformedTextFieldState, textLayoutState, density, z3, z4, !zBooleanValue && zIsWindowFocused);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            final TextFieldSelectionState textFieldSelectionState2 = (TextFieldSelectionState) objRememberedValue2;
                                            final HapticFeedback hapticFeedback2 = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                                            final ClipboardManager clipboardManager2 = (ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager());
                                            final TextToolbar textToolbar2 = (TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar());
                                            final Orientation orientation22 = orientation;
                                            final boolean z72 = z3;
                                            final boolean z82 = z4;
                                            EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt.BasicTextField2.3
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
                                                    textFieldSelectionState2.update(hapticFeedback2, clipboardManager2, textToolbar2, density, z72, z82);
                                                }
                                            }, composerStartRestartGroup, 0);
                                            EffectsKt.DisposableEffect(textFieldSelectionState2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt.BasicTextField2.4
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                @NotNull
                                                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                                                    final TextFieldSelectionState textFieldSelectionState22 = textFieldSelectionState2;
                                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4$invoke$$inlined$onDispose$1
                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                        public void dispose() {
                                                            textFieldSelectionState22.dispose();
                                                        }
                                                    };
                                                }
                                            }, composerStartRestartGroup, 8);
                                            if (z3) {
                                                modifier3 = modifier2;
                                                Modifier modifierScrollable$default2 = ScrollableKt.scrollable$default(FocusableKt.focusable(modifier2.then(new TextFieldDecoratorModifier(transformedTextFieldState, textLayoutState, textFieldSelectionState2, inputTransformation2, z3, z4, keyboardOptions2, keyboardActions2, zAreEqual)), z3, mutableInteractionSource4), scrollStateRememberScrollState, orientation22, !z3 && scrollStateRememberScrollState.getMaxValue() > 0 && textFieldSelectionState2.getDraggingHandle() == null, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation22, false), null, mutableInteractionSource4, 16, null);
                                                composerStartRestartGroup.startReplaceableGroup(733328855);
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composerStartRestartGroup, 48);
                                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierScrollable$default2);
                                                InputTransformation inputTransformation52 = inputTransformation2;
                                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                                }
                                                composerStartRestartGroup.startReusableNode();
                                                if (!composerStartRestartGroup.getInserting()) {
                                                }
                                                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                if (!composerM10870constructorimpl.getInserting()) {
                                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                    final TextStyle textStyle42 = textStyle2;
                                                    final boolean z92 = z3;
                                                    final boolean z102 = z4;
                                                    final ScrollState scrollState32 = scrollStateRememberScrollState;
                                                    (codepointTransformation9 != null ? DefaultTextFieldDecorator : codepointTransformation9).Decoration(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1476233751, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$5$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                            invoke(composer2, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer2, int i22) {
                                                            int minHeightInLines;
                                                            int maxHeightInLines;
                                                            if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1476233751, i22, -1, "androidx.compose.foundation.text2.BasicTextField2.<anonymous>.<anonymous> (BasicTextField2.kt:426)");
                                                                }
                                                                TextFieldLineLimits textFieldLineLimits7 = textFieldLineLimits6;
                                                                if (textFieldLineLimits7 instanceof TextFieldLineLimits.MultiLine) {
                                                                    minHeightInLines = ((TextFieldLineLimits.MultiLine) textFieldLineLimits7).getMinHeightInLines();
                                                                    maxHeightInLines = ((TextFieldLineLimits.MultiLine) textFieldLineLimits6).getMaxHeightInLines();
                                                                } else {
                                                                    minHeightInLines = 1;
                                                                    maxHeightInLines = 1;
                                                                }
                                                                Modifier modifierThen = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m8160heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState.m8702getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle42, minHeightInLines, maxHeightInLines), textStyle42)).then(new TextFieldCoreModifier(zBooleanValue && zIsWindowFocused, textLayoutState, transformedTextFieldState, textFieldSelectionState2, brush4, z92 && !z102, scrollState32, orientation22));
                                                                TextLayoutState textLayoutState2 = textLayoutState;
                                                                TransformedTextFieldState transformedTextFieldState22 = transformedTextFieldState;
                                                                TextStyle textStyle5 = textStyle42;
                                                                boolean z11 = zAreEqual;
                                                                Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function25;
                                                                boolean z12 = z92;
                                                                boolean z13 = zBooleanValue;
                                                                boolean z14 = zIsWindowFocused;
                                                                TextFieldSelectionState textFieldSelectionState22 = textFieldSelectionState2;
                                                                boolean z15 = z102;
                                                                composer2.startReplaceableGroup(733328855);
                                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                                                composer2.startReplaceableGroup(-1323940314);
                                                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                                                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                                                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierThen);
                                                                if (!(composer2.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer2.startReusableNode();
                                                                if (composer2.getInserting()) {
                                                                    composer2.createNode(constructor22);
                                                                } else {
                                                                    composer2.useNode();
                                                                }
                                                                Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                                                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                                                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                }
                                                                function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                                                composer2.startReplaceableGroup(2058660585);
                                                                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                                                BoxKt.Box(new TextFieldTextLayoutModifier(textLayoutState2, transformedTextFieldState22, textStyle5, z11, function26), composer2, 0);
                                                                composer2.startReplaceableGroup(-39277302);
                                                                if (z12 && z13 && z14 && textFieldSelectionState22.isInTouchMode()) {
                                                                    BasicTextField2Kt.TextFieldSelectionHandles(textFieldSelectionState22, composer2, 8);
                                                                    if (!z15) {
                                                                        BasicTextField2Kt.TextFieldCursorHandle(textFieldSelectionState22, composer2, 8);
                                                                    }
                                                                }
                                                                composer2.endReplaceableGroup();
                                                                composer2.endReplaceableGroup();
                                                                composer2.endNode();
                                                                composer2.endReplaceableGroup();
                                                                composer2.endReplaceableGroup();
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer2.skipToGroupEnd();
                                                        }
                                                    }), composerStartRestartGroup, 6);
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    composerStartRestartGroup.endNode();
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    z5 = z3;
                                                    z6 = z4;
                                                    keyboardActions3 = keyboardActions2;
                                                    function23 = function25;
                                                    textStyle3 = textStyle2;
                                                    keyboardOptions3 = keyboardOptions2;
                                                    scrollState2 = scrollStateRememberScrollState;
                                                    brush3 = brush4;
                                                    mutableInteractionSource5 = mutableInteractionSource3;
                                                    textFieldLineLimits4 = textFieldLineLimits6;
                                                    codepointTransformation6 = codepointTransformation102;
                                                    r14 = codepointTransformation9;
                                                    inputTransformation3 = inputTransformation52;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                z5 = z;
                                z6 = z2;
                                inputTransformation3 = inputTransformation;
                                textStyle3 = textStyle;
                                keyboardOptions3 = keyboardOptions;
                                keyboardActions3 = keyboardActions;
                                textFieldLineLimits4 = textFieldLineLimits;
                                function23 = function2;
                                mutableInteractionSource5 = mutableInteractionSource;
                                brush3 = brush;
                                codepointTransformation6 = codepointTransformation;
                                r14 = textFieldDecorator;
                                scrollState2 = scrollState;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final Modifier modifier4 = modifier3;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt.BasicTextField2.6
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer2, int i22) {
                                        BasicTextField2Kt.BasicTextField2(textFieldState, modifier4, z5, z6, inputTransformation3, textStyle3, keyboardOptions3, keyboardActions3, textFieldLineLimits4, function23, mutableInteractionSource5, brush3, codepointTransformation6, r14, scrollState2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i21 |= 3072;
                        if ((i2 & 57344) == 0) {
                        }
                        if ((i4 & 1533916891) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i19 == 0) {
                                }
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
                                if (i10 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if ((i3 & 16384) == 0) {
                                }
                                i18 = i21;
                                codepointTransformation3 = codepointTransformation8;
                                mutableInteractionSource2 = mutableInteractionSource6;
                                codepointTransformation4 = codepointTransformation7;
                                textFieldLineLimits3 = textFieldLineLimits2;
                                brush2 = solidColor;
                                function22 = function24;
                                inputTransformation2 = inputTransformation4;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection22 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                WindowInfo windowInfo2 = (WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo());
                                final boolean zAreEqual2 = Intrinsics.areEqual(textFieldLineLimits3, TextFieldLineLimits.SingleLine.INSTANCE);
                                final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function252 = function22;
                                composerStartRestartGroup.startReplaceableGroup(-957633428);
                                if (mutableInteractionSource2 != null) {
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                if (!zAreEqual2) {
                                }
                                final Brush brush42 = brush2;
                                final boolean zBooleanValue2 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composerStartRestartGroup, 0).getValue().booleanValue();
                                final boolean zIsWindowFocused2 = windowInfo2.isWindowFocused();
                                final TextFieldLineLimits textFieldLineLimits62 = textFieldLineLimits3;
                                composerStartRestartGroup.startReplaceableGroup(1618982084);
                                zChanged = composerStartRestartGroup.changed(textFieldState) | composerStartRestartGroup.changed(inputTransformation2) | composerStartRestartGroup.changed(codepointTransformation4);
                                CodepointTransformation codepointTransformation92 = codepointTransformation3;
                                Object objRememberedValue42 = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                }
                                if (codepointTransformation4 != null) {
                                }
                                TransformedTextFieldState transformedTextFieldState22 = new TransformedTextFieldState(textFieldState, inputTransformation2, codepointTransformation5);
                                composerStartRestartGroup.updateRememberedValue(transformedTextFieldState22);
                                objRememberedValue42 = transformedTextFieldState22;
                                composerStartRestartGroup.endReplaceableGroup();
                                transformedTextFieldState = (TransformedTextFieldState) objRememberedValue42;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(transformedTextFieldState);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i17 = i3 & 8192;
                    if (i17 == 0) {
                    }
                    if ((i2 & 57344) == 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i7 = i3 & 16;
                int i202 = 8192;
                if (i7 == 0) {
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i11 = i3 & 256;
                if (i11 == 0) {
                }
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                i13 = i3 & 1024;
                if (i13 == 0) {
                }
                i15 = i3 & 2048;
                if (i15 == 0) {
                }
                int i212 = i14;
                i16 = i3 & 4096;
                if (i16 == 0) {
                }
                i17 = i3 & 8192;
                if (i17 == 0) {
                }
                if ((i2 & 57344) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            int i2022 = 8192;
            if (i7 == 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i11 = i3 & 256;
            if (i11 == 0) {
            }
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            i13 = i3 & 1024;
            if (i13 == 0) {
            }
            i15 = i3 & 2048;
            if (i15 == 0) {
            }
            int i2122 = i14;
            i16 = i3 & 4096;
            if (i16 == 0) {
            }
            i17 = i3 & 8192;
            if (i17 == 0) {
            }
            if ((i2 & 57344) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        int i20222 = 8192;
        if (i7 == 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i3 & 256;
        if (i11 == 0) {
        }
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        i13 = i3 & 1024;
        if (i13 == 0) {
        }
        i15 = i3 & 2048;
        if (i15 == 0) {
        }
        int i21222 = i14;
        i16 = i3 & 4096;
        if (i16 == 0) {
        }
        i17 = i3 & 8192;
        if (i17 == 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldCursorHandle(@NotNull final TextFieldSelectionState textFieldSelectionState, @Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(773754631);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(773754631, i, -1, "androidx.compose.foundation.text2.TextFieldCursorHandle (BasicTextField2.kt:487)");
        }
        final TextFieldHandleState cursorHandle = textFieldSelectionState.getCursorHandle();
        if (cursorHandle.getVisible()) {
            long jM8727getPositionF1C5BW0 = cursorHandle.m8727getPositionF1C5BW0();
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-949361180);
            boolean zChanged = composerStartRestartGroup.changed(cursorHandle);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldCursorHandle$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, cursorHandle.m8727getPositionF1C5BW0(), SelectionHandleAnchor.Middle, true, null));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidCursorHandle_androidKt.m8395CursorHandleULxng0E(jM8727getPositionF1C5BW0, SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), textFieldSelectionState, new C09282(textFieldSelectionState, null)), null, composerStartRestartGroup, 384);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldCursorHandle.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    BasicTextField2Kt.TextFieldCursorHandle(textFieldSelectionState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: BasicTextField2.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldCursorHandle$2", m7120f = "BasicTextField2.kt", m7121i = {}, m7122l = {503}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nBasicTextField2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldCursorHandle$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
    /* renamed from: androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldCursorHandle$2 */
    /* loaded from: classes2.dex */
    public static final class C09282 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ TextFieldSelectionState $selectionState;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09282(TextFieldSelectionState textFieldSelectionState, Continuation<? super C09282> continuation) {
            super(2, continuation);
            this.$selectionState = textFieldSelectionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C09282 c09282 = new C09282(this.$selectionState, continuation);
            c09282.L$0 = obj;
            return c09282;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C09282) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                TextFieldSelectionState textFieldSelectionState = this.$selectionState;
                this.label = 1;
                if (textFieldSelectionState.cursorHandleGestures(pointerInputScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldSelectionHandles(@NotNull final TextFieldSelectionState textFieldSelectionState, @Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1194626330);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1194626330, i, -1, "androidx.compose.foundation.text2.TextFieldSelectionHandles (BasicTextField2.kt:512)");
        }
        TextFieldHandleState startSelectionHandle = textFieldSelectionState.getStartSelectionHandle();
        composerStartRestartGroup.startReplaceableGroup(-1453543870);
        if (startSelectionHandle.getVisible()) {
            AndroidSelectionHandles_androidKt.SelectionHandle(new OffsetProvider() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldSelectionHandles.1
                @Override // androidx.compose.foundation.text.selection.OffsetProvider
                /* renamed from: provide-F1C5BW0 */
                public final long mo8396provideF1C5BW0() {
                    return textFieldSelectionState.getStartSelectionHandle().m8727getPositionF1C5BW0();
                }
            }, true, startSelectionHandle.getDirection(), startSelectionHandle.getHandlesCrossed(), SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textFieldSelectionState, new C09312(textFieldSelectionState, null)), composerStartRestartGroup, 48);
        }
        composerStartRestartGroup.endReplaceableGroup();
        TextFieldHandleState endSelectionHandle = textFieldSelectionState.getEndSelectionHandle();
        if (endSelectionHandle.getVisible()) {
            AndroidSelectionHandles_androidKt.SelectionHandle(new OffsetProvider() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldSelectionHandles.3
                @Override // androidx.compose.foundation.text.selection.OffsetProvider
                /* renamed from: provide-F1C5BW0 */
                public final long mo8396provideF1C5BW0() {
                    return textFieldSelectionState.getEndSelectionHandle().m8727getPositionF1C5BW0();
                }
            }, false, endSelectionHandle.getDirection(), endSelectionHandle.getHandlesCrossed(), SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textFieldSelectionState, new C09334(textFieldSelectionState, null)), composerStartRestartGroup, 48);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt.TextFieldSelectionHandles.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    BasicTextField2Kt.TextFieldSelectionHandles(textFieldSelectionState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: BasicTextField2.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$2", m7120f = "BasicTextField2.kt", m7121i = {}, m7122l = {522}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nBasicTextField2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldSelectionHandles$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
    /* renamed from: androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$2 */
    /* loaded from: classes2.dex */
    public static final class C09312 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ TextFieldSelectionState $selectionState;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09312(TextFieldSelectionState textFieldSelectionState, Continuation<? super C09312> continuation) {
            super(2, continuation);
            this.$selectionState = textFieldSelectionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C09312 c09312 = new C09312(this.$selectionState, continuation);
            c09312.L$0 = obj;
            return c09312;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C09312) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                TextFieldSelectionState textFieldSelectionState = this.$selectionState;
                this.label = 1;
                if (textFieldSelectionState.selectionHandleGestures(pointerInputScope, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: BasicTextField2.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$4", m7120f = "BasicTextField2.kt", m7121i = {}, m7122l = {535}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nBasicTextField2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldSelectionHandles$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
    /* renamed from: androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$4 */
    /* loaded from: classes2.dex */
    public static final class C09334 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ TextFieldSelectionState $selectionState;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09334(TextFieldSelectionState textFieldSelectionState, Continuation<? super C09334> continuation) {
            super(2, continuation);
            this.$selectionState = textFieldSelectionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C09334 c09334 = new C09334(this.$selectionState, continuation);
            c09334.L$0 = obj;
            return c09334;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C09334) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                TextFieldSelectionState textFieldSelectionState = this.$selectionState;
                this.label = 1;
                if (textFieldSelectionState.selectionHandleGestures(pointerInputScope, false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField2$lambda$2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }
}
