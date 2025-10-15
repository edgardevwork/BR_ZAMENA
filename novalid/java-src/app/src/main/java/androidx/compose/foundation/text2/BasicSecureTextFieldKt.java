package androidx.compose.foundation.text2;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text2.input.CodepointTransformation;
import androidx.compose.foundation.text2.input.CodepointTransformationKt;
import androidx.compose.foundation.text2.input.ImeActionHandler;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.InputTransformationKt;
import androidx.compose.foundation.text2.input.TextFieldLineLimits;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.foundation.text2.input.TextObfuscationMode;
import androidx.compose.foundation.text2.input.internal.StateSyncingModifierKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.input.key.KeyEvent;
import androidx.compose.p003ui.input.key.KeyInputModifierKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.TextToolbar;
import androidx.compose.p003ui.platform.TextToolbarStatus;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.KeyboardType;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
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
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Typography;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BasicSecureTextField.kt */
@Metadata(m7104d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001aÔ\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u001928\b\u0002\u0010\u001a\u001a2\u0012\u0004\u0012\u00020\u001c\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b¢\u0006\u0002\b\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aè\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00030,2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u001928\b\u0002\u0010\u001a\u001a2\u0012\u0004\u0012\u00020\u001c\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b¢\u0006\u0002\b\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a \u0010/\u001a\u00020\u00032\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u00030\u001d¢\u0006\u0002\b1H\u0003¢\u0006\u0002\u00102\u001a\u0010\u00103\u001a\u0002042\u0006\u0010\b\u001a\u00020\tH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065²\u0006\n\u00106\u001a\u000207X\u008a\u008e\u0002"}, m7105d2 = {"LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS", "", "BasicSecureTextField", "", "state", "Landroidx/compose/foundation/text2/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "onSubmit", "Landroidx/compose/foundation/text2/input/ImeActionHandler;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "textObfuscationMode", "Landroidx/compose/foundation/text2/input/TextObfuscationMode;", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "enabled", "", "inputTransformation", "Landroidx/compose/foundation/text2/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", "Lkotlin/ExtensionFunctionType;", "decorator", "Landroidx/compose/foundation/text2/TextFieldDecorator;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "BasicSecureTextField-mMrxcSU", "(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text2/input/ImeActionHandler;IIIZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "value", "", "onValueChange", "Lkotlin/Function1;", "BasicSecureTextField-TLP4tmw", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text2/input/ImeActionHandler;IIIZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "DisableCutCopy", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "KeyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "foundation_release", "valueWithSelection", "Landroidx/compose/ui/text/input/TextFieldValue;"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text2/BasicSecureTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,523:1\n25#2:524\n25#2:531\n25#2:548\n36#2:559\n36#2:567\n1116#3,6:525\n1116#3,6:532\n1116#3,6:538\n1116#3,3:549\n1119#3,3:555\n1116#3,6:560\n1116#3,6:568\n487#4,4:544\n491#4,2:552\n495#4:558\n487#5:554\n74#6:566\n81#7:574\n107#7,2:575\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text2/BasicSecureTextFieldKt\n*L\n159#1:524\n169#1:531\n282#1:548\n283#1:559\n493#1:567\n159#1:525,6\n169#1:532,6\n184#1:538,6\n282#1:549,3\n282#1:555,3\n283#1:560,6\n493#1:568,6\n282#1:544,4\n282#1:552,2\n282#1:558\n282#1:554\n492#1:566\n169#1:574\n169#1:575,2\n*E\n"})
/* loaded from: classes3.dex */
public final class BasicSecureTextFieldKt {
    private static final long LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS = 1500;

    /* JADX WARN: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
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
    /* renamed from: BasicSecureTextField-TLP4tmw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8630BasicSecureTextFieldTLP4tmw(@NotNull final String str, @NotNull final Function1<? super String, Unit> function1, @Nullable Modifier modifier, @Nullable ImeActionHandler imeActionHandler, int i, int i2, int i3, boolean z, @Nullable InputTransformation inputTransformation, @Nullable TextStyle textStyle, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Brush brush, @Nullable Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, @Nullable TextFieldDecorator textFieldDecorator, @Nullable ScrollState scrollState, @Nullable Composer composer, final int i4, final int i5, final int i6) {
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
        ImeActionHandler imeActionHandler2;
        boolean z2;
        InputTransformation inputTransformation2;
        Brush solidColor;
        ScrollState scrollStateRememberScrollState;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        Brush brush2;
        int i20;
        TextFieldDecorator textFieldDecorator2;
        int i21;
        InputTransformation inputTransformation3;
        TextStyle textStyle2;
        MutableInteractionSource mutableInteractionSource2;
        int i22;
        int i23;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23;
        TextFieldDecorator textFieldDecorator3;
        Object objRememberedValue;
        Composer.Companion companion;
        TextStyle textStyle3;
        MutableInteractionSource mutableInteractionSource3;
        Object objRememberedValue2;
        final MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue3;
        final InputTransformation inputTransformation4;
        TextFieldDecorator textFieldDecorator4;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24;
        Brush brush3;
        final TextStyle textStyle4;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier3;
        int i24;
        final int i25;
        final int i26;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(917546540);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i7 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i4 & 112) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i27 = i6 & 4;
        if (i27 != 0) {
            i7 |= 384;
        } else {
            if ((i4 & 896) == 0) {
                i7 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i4 & 7168) == 0) {
                    i7 |= composerStartRestartGroup.changed(imeActionHandler) ? 2048 : 1024;
                }
                i9 = i6 & 16;
                int i28 = 8192;
                if (i9 != 0) {
                    i7 |= CpioConstants.C_ISBLK;
                } else if ((i4 & 57344) == 0) {
                    i7 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
                }
                i10 = i6 & 32;
                if (i10 != 0) {
                    i7 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i4 & 458752) == 0) {
                    i7 |= composerStartRestartGroup.changed(i2) ? 131072 : 65536;
                }
                i11 = i6 & 64;
                if (i11 != 0) {
                    i7 |= 1572864;
                } else if ((i4 & 3670016) == 0) {
                    i7 |= composerStartRestartGroup.changed(i3) ? 1048576 : 524288;
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 29360128) == 0) {
                    i7 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
                }
                i13 = i6 & 256;
                if (i13 != 0) {
                    i7 |= 100663296;
                } else if ((i4 & 234881024) == 0) {
                    i7 |= composerStartRestartGroup.changed(inputTransformation) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i14 = i6 & 512;
                if (i14 != 0) {
                    i7 |= 805306368;
                } else if ((i4 & 1879048192) == 0) {
                    i7 |= composerStartRestartGroup.changed(textStyle) ? 536870912 : 268435456;
                }
                i15 = i6 & 1024;
                if (i15 != 0) {
                    i16 = i5 | 6;
                } else if ((i5 & 14) == 0) {
                    i16 = i5 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                } else {
                    i16 = i5;
                }
                i17 = i6 & 2048;
                if (i17 != 0) {
                    i16 |= 48;
                } else if ((i5 & 112) == 0) {
                    i16 |= composerStartRestartGroup.changed(brush) ? 32 : 16;
                }
                int i29 = i16;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i29 |= 384;
                } else {
                    if ((i5 & 896) == 0) {
                        i29 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
                    }
                    i19 = i6 & 8192;
                    if (i19 != 0) {
                        if ((i5 & 7168) == 0) {
                            i29 |= composerStartRestartGroup.changed(textFieldDecorator) ? 2048 : 1024;
                        }
                        if ((i5 & 57344) == 0) {
                            if ((i6 & 16384) == 0 && composerStartRestartGroup.changed(scrollState)) {
                                i28 = 16384;
                            }
                            i29 |= i28;
                        }
                        if ((i7 & 1533916891) != 306783378 || (46811 & i29) != 9362 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i4 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i27 == 0 ? Modifier.INSTANCE : modifier;
                                imeActionHandler2 = i8 == 0 ? null : imeActionHandler;
                                int iM13341getDefaulteUduSuo = i9 == 0 ? ImeAction.INSTANCE.m13341getDefaulteUduSuo() : i;
                                int iM8660getRevealLastTypedpyid5Pk = i10 == 0 ? TextObfuscationMode.INSTANCE.m8660getRevealLastTypedpyid5Pk() : i2;
                                int iM13394getPasswordPjHm6EE = i11 == 0 ? KeyboardType.INSTANCE.m13394getPasswordPjHm6EE() : i3;
                                z2 = i12 == 0 ? true : z;
                                InputTransformation inputTransformation5 = i13 == 0 ? null : inputTransformation;
                                TextStyle textStyle5 = i14 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                MutableInteractionSource mutableInteractionSource5 = i15 == 0 ? null : mutableInteractionSource;
                                if (i17 == 0) {
                                    inputTransformation2 = inputTransformation5;
                                    solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
                                } else {
                                    inputTransformation2 = inputTransformation5;
                                    solidColor = brush;
                                }
                                Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25 = i18 == 0 ? null : function2;
                                TextFieldDecorator textFieldDecorator5 = i19 == 0 ? null : textFieldDecorator;
                                if ((i6 & 16384) == 0) {
                                    brush2 = solidColor;
                                    i20 = i29 & (-57345);
                                    textFieldDecorator2 = textFieldDecorator5;
                                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                    inputTransformation3 = inputTransformation2;
                                    function22 = function25;
                                    textStyle2 = textStyle5;
                                    mutableInteractionSource2 = mutableInteractionSource5;
                                    i21 = iM13341getDefaulteUduSuo;
                                } else {
                                    scrollStateRememberScrollState = scrollState;
                                    function22 = function25;
                                    brush2 = solidColor;
                                    i20 = i29;
                                    textFieldDecorator2 = textFieldDecorator5;
                                    i21 = iM13341getDefaulteUduSuo;
                                    inputTransformation3 = inputTransformation2;
                                    textStyle2 = textStyle5;
                                    mutableInteractionSource2 = mutableInteractionSource5;
                                }
                                i22 = iM8660getRevealLastTypedpyid5Pk;
                                i23 = iM13394getPasswordPjHm6EE;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i6 & 16384) != 0) {
                                    i29 &= -57345;
                                }
                                modifier2 = modifier;
                                imeActionHandler2 = imeActionHandler;
                                i21 = i;
                                i22 = i2;
                                i23 = i3;
                                z2 = z;
                                inputTransformation3 = inputTransformation;
                                mutableInteractionSource2 = mutableInteractionSource;
                                brush2 = brush;
                                function22 = function2;
                                textFieldDecorator2 = textFieldDecorator;
                                scrollStateRememberScrollState = scrollState;
                                i20 = i29;
                                textStyle2 = textStyle;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                function23 = function22;
                                textFieldDecorator3 = textFieldDecorator2;
                            } else {
                                textFieldDecorator3 = textFieldDecorator2;
                                function23 = function22;
                                ComposerKt.traceEventStart(917546540, i7, i20, "androidx.compose.foundation.text2.BasicSecureTextField (BasicSecureTextField.kt:157)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            Brush brush4 = brush2;
                            if (objRememberedValue != companion.getEmpty()) {
                                textStyle3 = textStyle2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                objRememberedValue = new TextFieldState(str, TextRangeKt.TextRange(str.length()), (DefaultConstructorMarker) null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                textStyle3 = textStyle2;
                                mutableInteractionSource3 = mutableInteractionSource2;
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
                            mutableState.setValue(TextFieldValue.m13399copy3r_uNRQ$default(BasicSecureTextField_TLP4tmw$lambda$2(mutableState), str, 0L, (TextRange) null, 6, (Object) null));
                            TextFieldValue textFieldValueBasicSecureTextField_TLP4tmw$lambda$2 = BasicSecureTextField_TLP4tmw$lambda$2(mutableState);
                            composerStartRestartGroup.startReplaceableGroup(2147337007);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(function1);
                            InputTransformation inputTransformation6 = inputTransformation3;
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$1$1
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
                                        if (!Intrinsics.areEqual(textFieldValue.getText(), BasicSecureTextFieldKt.BasicSecureTextField_TLP4tmw$lambda$2(mutableState).getText())) {
                                            function1.invoke(textFieldValue.getText());
                                        }
                                        mutableState.setValue(textFieldValue);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i30 = i7 >> 3;
                            m8631BasicSecureTextFieldmMrxcSU(textFieldState, StateSyncingModifierKt.syncTextFieldState(modifier2, textFieldState, textFieldValueBasicSecureTextField_TLP4tmw$lambda$2, (Function1) objRememberedValue3, false), imeActionHandler2, i21, i22, i23, z2, inputTransformation6, textStyle3, mutableInteractionSource3, brush4, function23, textFieldDecorator3, scrollStateRememberScrollState, composerStartRestartGroup, (i30 & 234881024) | (i30 & 896) | 6 | (i30 & 7168) | (i30 & 57344) | (458752 & i30) | (3670016 & i30) | (29360128 & i30) | ((i20 << 27) & 1879048192), (i20 >> 3) & 8190, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            inputTransformation4 = inputTransformation6;
                            textFieldDecorator4 = textFieldDecorator3;
                            function24 = function23;
                            brush3 = brush4;
                            textStyle4 = textStyle3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier3 = modifier2;
                            i24 = i23;
                            i25 = i22;
                            i26 = i21;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            imeActionHandler2 = imeActionHandler;
                            i26 = i;
                            i25 = i2;
                            i24 = i3;
                            z2 = z;
                            inputTransformation4 = inputTransformation;
                            textStyle4 = textStyle;
                            mutableInteractionSource4 = mutableInteractionSource;
                            brush3 = brush;
                            function24 = function2;
                            textFieldDecorator4 = textFieldDecorator;
                            scrollStateRememberScrollState = scrollState;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier3;
                            final ImeActionHandler imeActionHandler3 = imeActionHandler2;
                            final int i31 = i24;
                            final boolean z3 = z2;
                            final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                            final Brush brush5 = brush3;
                            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function26 = function24;
                            final TextFieldDecorator textFieldDecorator6 = textFieldDecorator4;
                            final ScrollState scrollState2 = scrollStateRememberScrollState;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$2
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

                                public final void invoke(@Nullable Composer composer2, int i32) {
                                    BasicSecureTextFieldKt.m8630BasicSecureTextFieldTLP4tmw(str, function1, modifier4, imeActionHandler3, i26, i25, i31, z3, inputTransformation4, textStyle4, mutableInteractionSource6, brush5, function26, textFieldDecorator6, scrollState2, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i29 |= 3072;
                    if ((i5 & 57344) == 0) {
                    }
                    if ((i7 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i4 & 1) != 0) {
                            if (i27 == 0) {
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
                            if (i15 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if ((i6 & 16384) == 0) {
                            }
                            i22 = iM8660getRevealLastTypedpyid5Pk;
                            i23 = iM13394getPasswordPjHm6EE;
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
                            mutableState.setValue(TextFieldValue.m13399copy3r_uNRQ$default(BasicSecureTextField_TLP4tmw$lambda$2(mutableState), str, 0L, (TextRange) null, 6, (Object) null));
                            TextFieldValue textFieldValueBasicSecureTextField_TLP4tmw$lambda$22 = BasicSecureTextField_TLP4tmw$lambda$2(mutableState);
                            composerStartRestartGroup.startReplaceableGroup(2147337007);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(function1);
                            InputTransformation inputTransformation62 = inputTransformation3;
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$1$1
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
                                        if (!Intrinsics.areEqual(textFieldValue.getText(), BasicSecureTextFieldKt.BasicSecureTextField_TLP4tmw$lambda$2(mutableState).getText())) {
                                            function1.invoke(textFieldValue.getText());
                                        }
                                        mutableState.setValue(textFieldValue);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceableGroup();
                                int i302 = i7 >> 3;
                                m8631BasicSecureTextFieldmMrxcSU(textFieldState2, StateSyncingModifierKt.syncTextFieldState(modifier2, textFieldState2, textFieldValueBasicSecureTextField_TLP4tmw$lambda$22, (Function1) objRememberedValue3, false), imeActionHandler2, i21, i22, i23, z2, inputTransformation62, textStyle3, mutableInteractionSource3, brush42, function23, textFieldDecorator3, scrollStateRememberScrollState, composerStartRestartGroup, (i302 & 234881024) | (i302 & 896) | 6 | (i302 & 7168) | (i302 & 57344) | (458752 & i302) | (3670016 & i302) | (29360128 & i302) | ((i20 << 27) & 1879048192), (i20 >> 3) & 8190, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                inputTransformation4 = inputTransformation62;
                                textFieldDecorator4 = textFieldDecorator3;
                                function24 = function23;
                                brush3 = brush42;
                                textStyle4 = textStyle3;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier3 = modifier2;
                                i24 = i23;
                                i25 = i22;
                                i26 = i21;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i19 = i6 & 8192;
                if (i19 != 0) {
                }
                if ((i5 & 57344) == 0) {
                }
                if ((i7 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i9 = i6 & 16;
            int i282 = 8192;
            if (i9 != 0) {
            }
            i10 = i6 & 32;
            if (i10 != 0) {
            }
            i11 = i6 & 64;
            if (i11 != 0) {
            }
            i12 = i6 & 128;
            if (i12 != 0) {
            }
            i13 = i6 & 256;
            if (i13 != 0) {
            }
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i6 & 1024;
            if (i15 != 0) {
            }
            i17 = i6 & 2048;
            if (i17 != 0) {
            }
            int i292 = i16;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            i19 = i6 & 8192;
            if (i19 != 0) {
            }
            if ((i5 & 57344) == 0) {
            }
            if ((i7 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        i9 = i6 & 16;
        int i2822 = 8192;
        if (i9 != 0) {
        }
        i10 = i6 & 32;
        if (i10 != 0) {
        }
        i11 = i6 & 64;
        if (i11 != 0) {
        }
        i12 = i6 & 128;
        if (i12 != 0) {
        }
        i13 = i6 & 256;
        if (i13 != 0) {
        }
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i6 & 1024;
        if (i15 != 0) {
        }
        i17 = i6 & 2048;
        if (i17 != 0) {
        }
        int i2922 = i16;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        i19 = i6 & 8192;
        if (i19 != 0) {
        }
        if ((i5 & 57344) == 0) {
        }
        if ((i7 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012e  */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v8, types: [androidx.compose.foundation.text2.TextFieldDecorator] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r31v0, types: [androidx.compose.foundation.text2.TextFieldDecorator] */
    /* JADX WARN: Type inference failed for: r49v0, types: [androidx.compose.foundation.text2.TextFieldDecorator, java.lang.Object] */
    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /* renamed from: BasicSecureTextField-mMrxcSU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8631BasicSecureTextFieldmMrxcSU(@NotNull final TextFieldState textFieldState, @Nullable Modifier modifier, @Nullable ImeActionHandler imeActionHandler, int i, int i2, int i3, boolean z, @Nullable InputTransformation inputTransformation, @Nullable TextStyle textStyle, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Brush brush, @Nullable Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, @Nullable TextFieldDecorator textFieldDecorator, @Nullable ScrollState scrollState, @Nullable Composer composer, final int i4, final int i5, final int i6) {
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
        ImeActionHandler imeActionHandler2;
        int iM13341getDefaulteUduSuo;
        TextStyle textStyle2;
        InputTransformation inputTransformation2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        Brush solidColor;
        ScrollState scrollStateRememberScrollState;
        MutableInteractionSource mutableInteractionSource2;
        Brush brush2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23;
        int i20;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24;
        int i21;
        int i22;
        boolean z2;
        InputTransformation inputTransformation3;
        TextStyle textStyle3;
        Object objRememberedValue;
        Composer.Companion companion;
        CoroutineScope coroutineScope;
        boolean zChanged;
        Object objRememberedValue2;
        final boolean zM8655equalsimpl0;
        final CodepointTransformation codepointTransformation;
        CodepointTransformation codepointTransformationMask;
        Modifier focusChangeModifier;
        final int i23;
        final Modifier modifier3;
        final ?? r13;
        final ScrollState scrollState2;
        final int i24;
        final ImeActionHandler imeActionHandler3;
        final TextStyle textStyle4;
        final InputTransformation inputTransformation4;
        final boolean z3;
        final int i25;
        final MutableInteractionSource mutableInteractionSource3;
        final Brush brush3;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1073441926);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i7 = (composerStartRestartGroup.changed(textFieldState) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i26 = i6 & 2;
        if (i26 != 0) {
            i7 |= 48;
        } else {
            if ((i4 & 112) == 0) {
                i7 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else {
                if ((i4 & 896) == 0) {
                    i7 |= composerStartRestartGroup.changed(imeActionHandler) ? 256 : 128;
                }
                i9 = i6 & 8;
                int i27 = 1024;
                if (i9 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i4 & 7168) == 0) {
                        i7 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
                    }
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= CpioConstants.C_ISBLK;
                    } else if ((i4 & 57344) == 0) {
                        i7 |= composerStartRestartGroup.changed(i2) ? 16384 : 8192;
                    }
                    i11 = i6 & 32;
                    if (i11 == 0) {
                        i7 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i4 & 458752) == 0) {
                        i7 |= composerStartRestartGroup.changed(i3) ? 131072 : 65536;
                    }
                    i12 = i6 & 64;
                    if (i12 == 0) {
                        i7 |= 1572864;
                    } else if ((i4 & 3670016) == 0) {
                        i7 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
                    }
                    i13 = i6 & 128;
                    if (i13 == 0) {
                        i7 |= 12582912;
                    } else if ((i4 & 29360128) == 0) {
                        i7 |= composerStartRestartGroup.changed(inputTransformation) ? 8388608 : 4194304;
                    }
                    i14 = i6 & 256;
                    if (i14 == 0) {
                        i7 |= 100663296;
                    } else if ((i4 & 234881024) == 0) {
                        i7 |= composerStartRestartGroup.changed(textStyle) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i15 = i6 & 512;
                    if (i15 == 0) {
                        i7 |= 805306368;
                    } else if ((i4 & 1879048192) == 0) {
                        i7 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                    }
                    i16 = i6 & 1024;
                    if (i16 == 0) {
                        i17 = i5 | 6;
                    } else if ((i5 & 14) == 0) {
                        i17 = i5 | (composerStartRestartGroup.changed(brush) ? 4 : 2);
                    } else {
                        i17 = i5;
                    }
                    i18 = i6 & 2048;
                    if (i18 == 0) {
                        i17 |= 48;
                    } else if ((i5 & 112) == 0) {
                        i17 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
                    }
                    int i28 = i17;
                    i19 = i6 & 4096;
                    if (i19 != 0) {
                        if ((i5 & 896) == 0) {
                            i28 |= composerStartRestartGroup.changed((Object) textFieldDecorator) ? 256 : 128;
                        }
                        if ((i5 & 7168) == 0) {
                            if ((i6 & 8192) == 0 && composerStartRestartGroup.changed(scrollState)) {
                                i27 = 2048;
                            }
                            i28 |= i27;
                        }
                        if ((i7 & 1533916891) != 306783378 || (i28 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i4 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i26 == 0 ? Modifier.INSTANCE : modifier;
                                imeActionHandler2 = i8 == 0 ? null : imeActionHandler;
                                iM13341getDefaulteUduSuo = i9 == 0 ? ImeAction.INSTANCE.m13341getDefaulteUduSuo() : i;
                                int iM8660getRevealLastTypedpyid5Pk = i10 == 0 ? TextObfuscationMode.INSTANCE.m8660getRevealLastTypedpyid5Pk() : i2;
                                int iM13394getPasswordPjHm6EE = i11 == 0 ? KeyboardType.INSTANCE.m13394getPasswordPjHm6EE() : i3;
                                boolean z4 = i12 == 0 ? true : z;
                                InputTransformation inputTransformation5 = i13 == 0 ? null : inputTransformation;
                                TextStyle textStyle5 = i14 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                MutableInteractionSource mutableInteractionSource4 = i15 == 0 ? null : mutableInteractionSource;
                                if (i16 == 0) {
                                    inputTransformation2 = inputTransformation5;
                                    textStyle2 = textStyle5;
                                    function22 = null;
                                    solidColor = new SolidColor(Color.INSTANCE.m11366getBlack0d7_KjU(), null);
                                } else {
                                    textStyle2 = textStyle5;
                                    inputTransformation2 = inputTransformation5;
                                    function22 = null;
                                    solidColor = brush;
                                }
                                Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function26 = i18 == 0 ? function22 : function2;
                                Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function27 = i19 == 0 ? function22 : textFieldDecorator;
                                if ((i6 & 8192) == 0) {
                                    brush2 = solidColor;
                                    function23 = function26;
                                    i20 = i28 & (-7169);
                                    function24 = function27;
                                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                    i22 = iM13394getPasswordPjHm6EE;
                                    z2 = z4;
                                    inputTransformation3 = inputTransformation2;
                                    textStyle3 = textStyle2;
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                    i21 = iM8660getRevealLastTypedpyid5Pk;
                                } else {
                                    scrollStateRememberScrollState = scrollState;
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                    brush2 = solidColor;
                                    function23 = function26;
                                    i20 = i28;
                                    function24 = function27;
                                    i21 = iM8660getRevealLastTypedpyid5Pk;
                                    i22 = iM13394getPasswordPjHm6EE;
                                    z2 = z4;
                                    inputTransformation3 = inputTransformation2;
                                    textStyle3 = textStyle2;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i6 & 8192) != 0) {
                                    i28 &= -7169;
                                }
                                modifier2 = modifier;
                                imeActionHandler2 = imeActionHandler;
                                iM13341getDefaulteUduSuo = i;
                                i21 = i2;
                                i22 = i3;
                                z2 = z;
                                textStyle3 = textStyle;
                                mutableInteractionSource2 = mutableInteractionSource;
                                brush2 = brush;
                                function23 = function2;
                                function24 = textFieldDecorator;
                                scrollStateRememberScrollState = scrollState;
                                i20 = i28;
                                inputTransformation3 = inputTransformation;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1073441926, i7, i20, "androidx.compose.foundation.text2.BasicSecureTextField (BasicSecureTextField.kt:280)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(773894976);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(coroutineScope);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new SecureTextFieldController(coroutineScope);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final SecureTextFieldController secureTextFieldController = (SecureTextFieldController) objRememberedValue2;
                            TextObfuscationMode.Companion companion2 = TextObfuscationMode.INSTANCE;
                            zM8655equalsimpl0 = TextObfuscationMode.m8655equalsimpl0(i21, companion2.m8660getRevealLastTypedpyid5Pk());
                            if (!zM8655equalsimpl0) {
                                secureTextFieldController.getPasswordRevealFilter().hide();
                            }
                            if (!zM8655equalsimpl0) {
                                codepointTransformationMask = secureTextFieldController.getCodepointTransformation();
                            } else if (TextObfuscationMode.m8655equalsimpl0(i21, companion2.m8659getHiddenpyid5Pk())) {
                                codepointTransformationMask = CodepointTransformationKt.mask(CodepointTransformation.INSTANCE, Typography.bullet);
                            } else {
                                codepointTransformation = null;
                                Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                        SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                return Boolean.FALSE;
                                            }
                                        }, 1, null);
                                        SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                return Boolean.FALSE;
                                            }
                                        }, 1, null);
                                    }
                                });
                                if (zM8655equalsimpl0) {
                                    focusChangeModifier = secureTextFieldController.getFocusChangeModifier();
                                } else {
                                    focusChangeModifier = Modifier.INSTANCE;
                                }
                                final Modifier modifierThen = modifierSemantics.then(focusChangeModifier);
                                final InputTransformation inputTransformation6 = inputTransformation3;
                                final int i29 = i22;
                                final int i30 = iM13341getDefaulteUduSuo;
                                final ImeActionHandler imeActionHandler4 = imeActionHandler2;
                                final boolean z5 = z2;
                                final TextStyle textStyle6 = textStyle3;
                                final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function28 = function23;
                                final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                                final Brush brush4 = brush2;
                                final ?? r31 = function24;
                                final ScrollState scrollState3 = scrollStateRememberScrollState;
                                DisableCutCopy(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1415093334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3
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
                                    public final void invoke(@Nullable Composer composer2, int i31) {
                                        InputTransformation inputTransformationThenOrNull;
                                        KeyboardActions KeyboardActions;
                                        if ((i31 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1415093334, i31, -1, "androidx.compose.foundation.text2.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:323)");
                                            }
                                            if (zM8655equalsimpl0) {
                                                inputTransformationThenOrNull = InputTransformationKt.thenOrNull(inputTransformation6, secureTextFieldController.getPasswordRevealFilter());
                                            } else {
                                                inputTransformationThenOrNull = inputTransformation6;
                                            }
                                            InputTransformation inputTransformation7 = inputTransformationThenOrNull;
                                            TextFieldLineLimits.SingleLine singleLine = TextFieldLineLimits.SingleLine.INSTANCE;
                                            KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, i29, i30, null, 17, null);
                                            ImeActionHandler imeActionHandler5 = imeActionHandler4;
                                            if (imeActionHandler5 == null || (KeyboardActions = BasicSecureTextFieldKt.KeyboardActions(new BasicSecureTextFieldKt$BasicSecureTextField$3$1$1(imeActionHandler5))) == null) {
                                                KeyboardActions = KeyboardActions.INSTANCE.getDefault();
                                            }
                                            BasicTextField2Kt.BasicTextField2(textFieldState, modifierThen, z5, false, inputTransformation7, textStyle6, keyboardOptions, KeyboardActions, singleLine, function28, mutableInteractionSource5, brush4, codepointTransformation, r31, scrollState3, composer2, 100666368, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), composerStartRestartGroup, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                i23 = i21;
                                modifier3 = modifier2;
                                r13 = function24;
                                scrollState2 = scrollStateRememberScrollState;
                                i24 = i22;
                                imeActionHandler3 = imeActionHandler2;
                                textStyle4 = textStyle3;
                                inputTransformation4 = inputTransformation3;
                                z3 = z2;
                                i25 = iM13341getDefaulteUduSuo;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                brush3 = brush2;
                                function25 = function23;
                            }
                            codepointTransformation = codepointTransformationMask;
                            Modifier modifierSemantics2 = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                    SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            return Boolean.FALSE;
                                        }
                                    }, 1, null);
                                    SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            return Boolean.FALSE;
                                        }
                                    }, 1, null);
                                }
                            });
                            if (zM8655equalsimpl0) {
                            }
                            final Modifier modifierThen2 = modifierSemantics2.then(focusChangeModifier);
                            final InputTransformation inputTransformation62 = inputTransformation3;
                            final int i292 = i22;
                            final int i302 = iM13341getDefaulteUduSuo;
                            final ImeActionHandler imeActionHandler42 = imeActionHandler2;
                            final boolean z52 = z2;
                            final TextStyle textStyle62 = textStyle3;
                            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function282 = function23;
                            final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource2;
                            final Brush brush42 = brush2;
                            final TextFieldDecorator r312 = function24;
                            final ScrollState scrollState32 = scrollStateRememberScrollState;
                            DisableCutCopy(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1415093334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3
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
                                public final void invoke(@Nullable Composer composer2, int i31) {
                                    InputTransformation inputTransformationThenOrNull;
                                    KeyboardActions KeyboardActions;
                                    if ((i31 & 11) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1415093334, i31, -1, "androidx.compose.foundation.text2.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:323)");
                                        }
                                        if (zM8655equalsimpl0) {
                                            inputTransformationThenOrNull = InputTransformationKt.thenOrNull(inputTransformation62, secureTextFieldController.getPasswordRevealFilter());
                                        } else {
                                            inputTransformationThenOrNull = inputTransformation62;
                                        }
                                        InputTransformation inputTransformation7 = inputTransformationThenOrNull;
                                        TextFieldLineLimits.SingleLine singleLine = TextFieldLineLimits.SingleLine.INSTANCE;
                                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, i292, i302, null, 17, null);
                                        ImeActionHandler imeActionHandler5 = imeActionHandler42;
                                        if (imeActionHandler5 == null || (KeyboardActions = BasicSecureTextFieldKt.KeyboardActions(new BasicSecureTextFieldKt$BasicSecureTextField$3$1$1(imeActionHandler5))) == null) {
                                            KeyboardActions = KeyboardActions.INSTANCE.getDefault();
                                        }
                                        BasicTextField2Kt.BasicTextField2(textFieldState, modifierThen2, z52, false, inputTransformation7, textStyle62, keyboardOptions, KeyboardActions, singleLine, function282, mutableInteractionSource52, brush42, codepointTransformation, r312, scrollState32, composer2, 100666368, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, 6);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i23 = i21;
                            modifier3 = modifier2;
                            r13 = function24;
                            scrollState2 = scrollStateRememberScrollState;
                            i24 = i22;
                            imeActionHandler3 = imeActionHandler2;
                            textStyle4 = textStyle3;
                            inputTransformation4 = inputTransformation3;
                            z3 = z2;
                            i25 = iM13341getDefaulteUduSuo;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            brush3 = brush2;
                            function25 = function23;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            imeActionHandler3 = imeActionHandler;
                            i25 = i;
                            i23 = i2;
                            i24 = i3;
                            z3 = z;
                            inputTransformation4 = inputTransformation;
                            textStyle4 = textStyle;
                            mutableInteractionSource3 = mutableInteractionSource;
                            brush3 = brush;
                            function25 = function2;
                            r13 = textFieldDecorator;
                            scrollState2 = scrollState;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$4
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

                                public final void invoke(@Nullable Composer composer2, int i31) {
                                    BasicSecureTextFieldKt.m8631BasicSecureTextFieldmMrxcSU(textFieldState, modifier3, imeActionHandler3, i25, i23, i24, z3, inputTransformation4, textStyle4, mutableInteractionSource3, brush3, function25, r13, scrollState2, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i28 |= 384;
                    if ((i5 & 7168) == 0) {
                    }
                    if ((i7 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i4 & 1) != 0) {
                            if (i26 == 0) {
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
                            if (i15 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if ((i6 & 8192) == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(773894976);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(coroutineScope);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue2 = new SecureTextFieldController(coroutineScope);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceableGroup();
                                final SecureTextFieldController secureTextFieldController2 = (SecureTextFieldController) objRememberedValue2;
                                TextObfuscationMode.Companion companion22 = TextObfuscationMode.INSTANCE;
                                zM8655equalsimpl0 = TextObfuscationMode.m8655equalsimpl0(i21, companion22.m8660getRevealLastTypedpyid5Pk());
                                if (!zM8655equalsimpl0) {
                                }
                                if (!zM8655equalsimpl0) {
                                }
                                codepointTransformation = codepointTransformationMask;
                                Modifier modifierSemantics22 = SemanticsModifierKt.semantics(modifier2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                        SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                return Boolean.FALSE;
                                            }
                                        }, 1, null);
                                        SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                return Boolean.FALSE;
                                            }
                                        }, 1, null);
                                    }
                                });
                                if (zM8655equalsimpl0) {
                                }
                                final Modifier modifierThen22 = modifierSemantics22.then(focusChangeModifier);
                                final InputTransformation inputTransformation622 = inputTransformation3;
                                final int i2922 = i22;
                                final int i3022 = iM13341getDefaulteUduSuo;
                                final ImeActionHandler imeActionHandler422 = imeActionHandler2;
                                final boolean z522 = z2;
                                final TextStyle textStyle622 = textStyle3;
                                final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2822 = function23;
                                final MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource2;
                                final Brush brush422 = brush2;
                                final TextFieldDecorator r3122 = function24;
                                final ScrollState scrollState322 = scrollStateRememberScrollState;
                                DisableCutCopy(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1415093334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3
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
                                    public final void invoke(@Nullable Composer composer2, int i31) {
                                        InputTransformation inputTransformationThenOrNull;
                                        KeyboardActions KeyboardActions;
                                        if ((i31 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1415093334, i31, -1, "androidx.compose.foundation.text2.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:323)");
                                            }
                                            if (zM8655equalsimpl0) {
                                                inputTransformationThenOrNull = InputTransformationKt.thenOrNull(inputTransformation622, secureTextFieldController2.getPasswordRevealFilter());
                                            } else {
                                                inputTransformationThenOrNull = inputTransformation622;
                                            }
                                            InputTransformation inputTransformation7 = inputTransformationThenOrNull;
                                            TextFieldLineLimits.SingleLine singleLine = TextFieldLineLimits.SingleLine.INSTANCE;
                                            KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, i2922, i3022, null, 17, null);
                                            ImeActionHandler imeActionHandler5 = imeActionHandler422;
                                            if (imeActionHandler5 == null || (KeyboardActions = BasicSecureTextFieldKt.KeyboardActions(new BasicSecureTextFieldKt$BasicSecureTextField$3$1$1(imeActionHandler5))) == null) {
                                                KeyboardActions = KeyboardActions.INSTANCE.getDefault();
                                            }
                                            BasicTextField2Kt.BasicTextField2(textFieldState, modifierThen22, z522, false, inputTransformation7, textStyle622, keyboardOptions, KeyboardActions, singleLine, function2822, mutableInteractionSource522, brush422, codepointTransformation, r3122, scrollState322, composer2, 100666368, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), composerStartRestartGroup, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i23 = i21;
                                modifier3 = modifier2;
                                r13 = function24;
                                scrollState2 = scrollStateRememberScrollState;
                                i24 = i22;
                                imeActionHandler3 = imeActionHandler2;
                                textStyle4 = textStyle3;
                                inputTransformation4 = inputTransformation3;
                                z3 = z2;
                                i25 = iM13341getDefaulteUduSuo;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                brush3 = brush2;
                                function25 = function23;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                i11 = i6 & 32;
                if (i11 == 0) {
                }
                i12 = i6 & 64;
                if (i12 == 0) {
                }
                i13 = i6 & 128;
                if (i13 == 0) {
                }
                i14 = i6 & 256;
                if (i14 == 0) {
                }
                i15 = i6 & 512;
                if (i15 == 0) {
                }
                i16 = i6 & 1024;
                if (i16 == 0) {
                }
                i18 = i6 & 2048;
                if (i18 == 0) {
                }
                int i282 = i17;
                i19 = i6 & 4096;
                if (i19 != 0) {
                }
                if ((i5 & 7168) == 0) {
                }
                if ((i7 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i9 = i6 & 8;
            int i272 = 1024;
            if (i9 != 0) {
            }
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            i11 = i6 & 32;
            if (i11 == 0) {
            }
            i12 = i6 & 64;
            if (i12 == 0) {
            }
            i13 = i6 & 128;
            if (i13 == 0) {
            }
            i14 = i6 & 256;
            if (i14 == 0) {
            }
            i15 = i6 & 512;
            if (i15 == 0) {
            }
            i16 = i6 & 1024;
            if (i16 == 0) {
            }
            i18 = i6 & 2048;
            if (i18 == 0) {
            }
            int i2822 = i17;
            i19 = i6 & 4096;
            if (i19 != 0) {
            }
            if ((i5 & 7168) == 0) {
            }
            if ((i7 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        int i2722 = 1024;
        if (i9 != 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        i11 = i6 & 32;
        if (i11 == 0) {
        }
        i12 = i6 & 64;
        if (i12 == 0) {
        }
        i13 = i6 & 128;
        if (i13 == 0) {
        }
        i14 = i6 & 256;
        if (i14 == 0) {
        }
        i15 = i6 & 512;
        if (i15 == 0) {
        }
        i16 = i6 & 1024;
        if (i16 == 0) {
        }
        i18 = i6 & 2048;
        if (i18 == 0) {
        }
        int i28222 = i17;
        i19 = i6 & 4096;
        if (i19 != 0) {
        }
        if ((i5 & 7168) == 0) {
        }
        if ((i7 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardActions KeyboardActions(final ImeActionHandler imeActionHandler) {
        return new KeyboardActions(new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt.KeyboardActions.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                invoke2(keyboardActionScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull KeyboardActionScope keyboardActionScope) {
                ImeActionHandler imeActionHandler2 = imeActionHandler;
                ImeAction.Companion companion = ImeAction.INSTANCE;
                if (imeActionHandler2.mo8632onImeActionKlQnJC8(companion.m13342getDoneeUduSuo())) {
                    return;
                }
                keyboardActionScope.mo8421defaultKeyboardActionKlQnJC8(companion.m13342getDoneeUduSuo());
            }
        }, new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt.KeyboardActions.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                invoke2(keyboardActionScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull KeyboardActionScope keyboardActionScope) {
                ImeActionHandler imeActionHandler2 = imeActionHandler;
                ImeAction.Companion companion = ImeAction.INSTANCE;
                if (imeActionHandler2.mo8632onImeActionKlQnJC8(companion.m13343getGoeUduSuo())) {
                    return;
                }
                keyboardActionScope.mo8421defaultKeyboardActionKlQnJC8(companion.m13343getGoeUduSuo());
            }
        }, new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt.KeyboardActions.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                invoke2(keyboardActionScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull KeyboardActionScope keyboardActionScope) {
                ImeActionHandler imeActionHandler2 = imeActionHandler;
                ImeAction.Companion companion = ImeAction.INSTANCE;
                if (imeActionHandler2.mo8632onImeActionKlQnJC8(companion.m13344getNexteUduSuo())) {
                    return;
                }
                keyboardActionScope.mo8421defaultKeyboardActionKlQnJC8(companion.m13344getNexteUduSuo());
            }
        }, new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt.KeyboardActions.4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                invoke2(keyboardActionScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull KeyboardActionScope keyboardActionScope) {
                ImeActionHandler imeActionHandler2 = imeActionHandler;
                ImeAction.Companion companion = ImeAction.INSTANCE;
                if (imeActionHandler2.mo8632onImeActionKlQnJC8(companion.m13346getPreviouseUduSuo())) {
                    return;
                }
                keyboardActionScope.mo8421defaultKeyboardActionKlQnJC8(companion.m13346getPreviouseUduSuo());
            }
        }, new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt.KeyboardActions.5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                invoke2(keyboardActionScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull KeyboardActionScope keyboardActionScope) {
                ImeActionHandler imeActionHandler2 = imeActionHandler;
                ImeAction.Companion companion = ImeAction.INSTANCE;
                if (imeActionHandler2.mo8632onImeActionKlQnJC8(companion.m13347getSearcheUduSuo())) {
                    return;
                }
                keyboardActionScope.mo8421defaultKeyboardActionKlQnJC8(companion.m13347getSearcheUduSuo());
            }
        }, new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt.KeyboardActions.6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                invoke2(keyboardActionScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull KeyboardActionScope keyboardActionScope) {
                ImeActionHandler imeActionHandler2 = imeActionHandler;
                ImeAction.Companion companion = ImeAction.INSTANCE;
                if (imeActionHandler2.mo8632onImeActionKlQnJC8(companion.m13348getSendeUduSuo())) {
                    return;
                }
                keyboardActionScope.mo8421defaultKeyboardActionKlQnJC8(companion.m13348getSendeUduSuo());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DisableCutCopy(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(930154034);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(930154034, i2, -1, "androidx.compose.foundation.text2.DisableCutCopy (BasicSecureTextField.kt:490)");
            }
            final TextToolbar textToolbar = (TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(textToolbar);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new TextToolbar() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1
                    private final /* synthetic */ TextToolbar $$delegate_0;

                    @Override // androidx.compose.p003ui.platform.TextToolbar
                    @NotNull
                    public TextToolbarStatus getStatus() {
                        return this.$$delegate_0.getStatus();
                    }

                    @Override // androidx.compose.p003ui.platform.TextToolbar
                    public void hide() {
                        this.$$delegate_0.hide();
                    }

                    {
                        this.$$delegate_0 = this.$currentToolbar;
                    }

                    @Override // androidx.compose.p003ui.platform.TextToolbar
                    public void showMenu(@NotNull Rect rect, @Nullable Function0<Unit> onCopyRequested, @Nullable Function0<Unit> onPasteRequested, @Nullable Function0<Unit> onCutRequested, @Nullable Function0<Unit> onSelectAllRequested) {
                        this.$currentToolbar.showMenu(rect, null, onPasteRequested, null, onSelectAllRequested);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalTextToolbar().provides((BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1) objRememberedValue), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1741121166, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt.DisableCutCopy.1
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
                public final void invoke(@Nullable Composer composer2, int i3) {
                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1741121166, i3, -1, "androidx.compose.foundation.text2.DisableCutCopy.<anonymous> (BasicSecureTextField.kt:512)");
                        }
                        Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(Modifier.INSTANCE, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt.DisableCutCopy.1.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                return m8633invokeZmokQxo(keyEvent.m12337unboximpl());
                            }

                            @NotNull
                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m8633invokeZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
                                KeyCommand keyCommandMo8420mapZmokQxo = KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo8420mapZmokQxo(keyEvent);
                                return Boolean.valueOf(keyCommandMo8420mapZmokQxo == KeyCommand.COPY || keyCommandMo8420mapZmokQxo == KeyCommand.CUT);
                            }
                        });
                        Function2<Composer, Integer, Unit> function22 = function2;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOnPreviewKeyEvent);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function22.invoke(composer2, 0);
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
            }), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt.DisableCutCopy.2
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

                public final void invoke(@Nullable Composer composer2, int i3) {
                    BasicSecureTextFieldKt.DisableCutCopy(function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicSecureTextField_TLP4tmw$lambda$2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }
}
