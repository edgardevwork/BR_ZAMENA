package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.LayoutIdParentData;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.TextStyleKt;
import androidx.compose.p003ui.text.input.TransformedText;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldImpl.kt */
@Metadata(m7104d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aß\u0001\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\f2\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020 0%¢\u0006\u0002\b&2\u0006\u0010'\u001a\u00020(2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&H\u0001¢\u0006\u0002\u00108\u001aT\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2 \u0010@\u001a\u001c\u0012\u0004\u0012\u00020 0%¢\u0006\u0002\b&¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\u0003\u0010\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a\u0012\u0010E\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010GH\u0000\u001a\u0012\u0010H\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010GH\u0000\u001a\u001c\u0010I\u001a\u00020\b*\u00020\b2\u0006\u00100\u001a\u00020.2\u0006\u0010J\u001a\u00020\fH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0012\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0013\u0010\u0005\"\u000e\u0010\u0014\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0015\u001a\u00020\u0016X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006K"}, m7105d2 = {"AnimationDuration", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "", "LeadingId", "PlaceholderAnimationDelayOrDuration", "PlaceholderAnimationDuration", "PlaceholderId", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", "type", "Landroidx/compose/material/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material/TextFieldColors;", OutlinedTextFieldKt.BorderId, "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "content", "Landroidx/compose/runtime/ComposableOpenTarget;", FirebaseAnalytics.Param.INDEX, "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "defaultErrorSemantics", "defaultErrorMessage", "material_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,369:1\n50#2:370\n49#2:371\n1116#3,6:372\n658#4:378\n646#4:379\n658#4:380\n646#4:381\n154#5:382\n154#5:383\n154#5:384\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n*L\n80#1:370\n80#1:371\n80#1:372,6\n111#1:378\n111#1:379\n114#1:380\n114#1:381\n365#1:382\n366#1:383\n368#1:384\n*E\n"})
/* loaded from: classes2.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;

    @NotNull
    private static final Modifier IconDefaultSizeModifier;

    @NotNull
    public static final String LabelId = "Label";

    @NotNull
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;

    @NotNull
    public static final String PlaceholderId = "Hint";

    @NotNull
    public static final String TextFieldId = "TextField";

    @NotNull
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float TextFieldPadding = C2046Dp.m13666constructorimpl(16);
    private static final float HorizontalIconPadding = C2046Dp.m13666constructorimpl(12);

    /* JADX WARN: Removed duplicated region for block: B:106:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonDecorationBox(@NotNull final TextFieldType textFieldType, @NotNull final String str, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final VisualTransformation visualTransformation, @Nullable final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, @Nullable Function2<? super Composer, ? super Integer, Unit> function25, boolean z, boolean z2, boolean z3, @NotNull final InteractionSource interactionSource, @NotNull final PaddingValues paddingValues, @NotNull final TextFieldColors textFieldColors, @Nullable Function2<? super Composer, ? super Integer, Unit> function26, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean zChanged;
        Object objRememberedValue;
        InputPhase inputPhase;
        InputPhase inputPhase2;
        final boolean z4;
        InputPhase inputPhase3;
        boolean z5;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final boolean z7;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-712568069);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(textFieldType) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i & 896) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                i4 |= composerStartRestartGroup.changed(visualTransformation) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else if ((57344 & i) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i & 458752) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((i & 3670016) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288;
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
            } else if ((i & 29360128) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function25) ? 8388608 : 4194304;
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
            } else if ((i & 234881024) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
            }
            i9 = i3 & 512;
            if (i9 == 0) {
                i4 |= 805306368;
            } else if ((i & 1879048192) == 0) {
                i4 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
                i11 = i2 | 6;
            } else if ((i2 & 14) == 0) {
                i11 = i2 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
            } else {
                i11 = i2;
            }
            if ((i3 & 2048) == 0) {
                i11 |= 48;
            } else if ((i2 & 112) == 0) {
                i11 |= composerStartRestartGroup.changed(interactionSource) ? 32 : 16;
            }
            int i13 = i11;
            if ((i3 & 4096) != 0) {
                if ((i2 & 896) == 0) {
                    i13 |= composerStartRestartGroup.changed(paddingValues) ? 256 : 128;
                }
                if ((i3 & 8192) != 0) {
                    i13 |= 3072;
                } else if ((i2 & 7168) == 0) {
                    i13 |= composerStartRestartGroup.changed(textFieldColors) ? 2048 : 1024;
                }
                i12 = i3 & 16384;
                if (i12 != 0) {
                    i13 |= CpioConstants.C_ISBLK;
                } else if ((i2 & 57344) == 0) {
                    i13 |= composerStartRestartGroup.changedInstance(function26) ? 16384 : 8192;
                }
                if ((i4 & 1533916891) != 306783378 || (46811 & i13) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Function2<? super Composer, ? super Integer, Unit> function211 = i5 == 0 ? null : function23;
                    Function2<? super Composer, ? super Integer, Unit> function212 = i6 == 0 ? null : function24;
                    Function2<? super Composer, ? super Integer, Unit> function213 = i7 == 0 ? null : function25;
                    boolean z9 = i8 == 0 ? false : z;
                    final boolean z10 = i9 == 0 ? true : z2;
                    final boolean z11 = i10 == 0 ? false : z3;
                    Function2<? super Composer, ? super Integer, Unit> function214 = i12 == 0 ? null : function26;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-712568069, i4, i13, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:78)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(visualTransformation);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final String text = ((TransformedText) objRememberedValue).getText().getText();
                    if (!FocusInteractionKt.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i13 >> 3) & 14).getValue().booleanValue()) {
                        inputPhase = InputPhase.Focused;
                    } else {
                        inputPhase = text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                    }
                    inputPhase2 = inputPhase;
                    Function3<InputPhase, Composer, Integer, Color> function3 = new Function3<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase4, Composer composer3, Integer num) {
                            return Color.m11330boximpl(m9078invokeXeAY9LY(inputPhase4, composer3, num.intValue()));
                        }

                        @Composable
                        /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                        public final long m9078invokeXeAY9LY(@NotNull InputPhase inputPhase4, @Nullable Composer composer3, int i14) {
                            composer3.startReplaceableGroup(697243846);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(697243846, i14, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
                            }
                            long jM11350unboximpl = textFieldColors.labelColor(z10, inputPhase4 == InputPhase.UnfocusedEmpty ? false : z11, interactionSource, composer3, 0).getValue().m11350unboximpl();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceableGroup();
                            return jM11350unboximpl;
                        }
                    };
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    Typography typography = materialTheme.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle1 = typography.getSubtitle1();
                    TextStyle caption = typography.getCaption();
                    long jM13195getColor0d7_KjU = subtitle1.m13195getColor0d7_KjU();
                    Color.Companion companion = Color.INSTANCE;
                    z4 = !(Color.m11341equalsimpl0(jM13195getColor0d7_KjU, companion.m11376getUnspecified0d7_KjU()) || Color.m11341equalsimpl0(caption.m13195getColor0d7_KjU(), companion.m11376getUnspecified0d7_KjU())) || (!Color.m11341equalsimpl0(subtitle1.m13195getColor0d7_KjU(), companion.m11376getUnspecified0d7_KjU()) && Color.m11341equalsimpl0(caption.m13195getColor0d7_KjU(), companion.m11376getUnspecified0d7_KjU()));
                    TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(2129140935);
                    long jM13195getColor0d7_KjU2 = materialTheme.getTypography(composerStartRestartGroup, 6).getCaption().m13195getColor0d7_KjU();
                    if (z4 && jM13195getColor0d7_KjU2 == companion.m11376getUnspecified0d7_KjU()) {
                        inputPhase3 = inputPhase2;
                        jM13195getColor0d7_KjU2 = function3.invoke(inputPhase3, composerStartRestartGroup, 0).m11350unboximpl();
                    } else {
                        inputPhase3 = inputPhase2;
                    }
                    long j = jM13195getColor0d7_KjU2;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(2129141126);
                    long jM13195getColor0d7_KjU3 = materialTheme.getTypography(composerStartRestartGroup, 6).getSubtitle1().m13195getColor0d7_KjU();
                    if (z4 || jM13195getColor0d7_KjU3 != companion.m11376getUnspecified0d7_KjU()) {
                        z5 = false;
                    } else {
                        z5 = false;
                        jM13195getColor0d7_KjU3 = function3.invoke(inputPhase3, composerStartRestartGroup, 0).m11350unboximpl();
                    }
                    long j2 = jM13195getColor0d7_KjU3;
                    composerStartRestartGroup.endReplaceableGroup();
                    final Function2<? super Composer, ? super Integer, Unit> function215 = function211;
                    final boolean z12 = z10;
                    final boolean z13 = z11;
                    final Function2<? super Composer, ? super Integer, Unit> function216 = function212;
                    composer2 = composerStartRestartGroup;
                    final Function2<? super Composer, ? super Integer, Unit> function217 = function213;
                    final boolean z14 = z9;
                    final Function2<? super Composer, ? super Integer, Unit> function218 = function214;
                    textFieldTransitionScope.m9083TransitionDTcfvLk(inputPhase3, j, j2, function3, function22 == null ? true : z5, ComposableLambdaKt.composableLambda(composer2, 341865432, true, new Function6<Float, Color, Color, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt.CommonDecorationBox.3

                        /* compiled from: TextFieldImpl.kt */
                        @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                        /* renamed from: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[TextFieldType.values().length];
                                try {
                                    iArr[TextFieldType.Filled.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[TextFieldType.Outlined.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(6);
                        }

                        @Override // kotlin.jvm.functions.Function6
                        public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Composer composer3, Integer num) {
                            m9076invokeRIQooxk(f.floatValue(), color.m11350unboximpl(), color2.m11350unboximpl(), f2.floatValue(), composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        /* renamed from: invoke-RIQooxk, reason: not valid java name */
                        public final void m9076invokeRIQooxk(final float f, final long j3, final long j4, final float f2, @Nullable Composer composer3, int i14) {
                            int i15;
                            ComposableLambda composableLambda;
                            ComposableLambda composableLambda2;
                            if ((i14 & 14) == 0) {
                                i15 = (composer3.changed(f) ? 4 : 2) | i14;
                            } else {
                                i15 = i14;
                            }
                            if ((i14 & 112) == 0) {
                                i15 |= composer3.changed(j3) ? 32 : 16;
                            }
                            if ((i14 & 896) == 0) {
                                i15 |= composer3.changed(j4) ? 256 : 128;
                            }
                            if ((i14 & 7168) == 0) {
                                i15 |= composer3.changed(f2) ? 2048 : 1024;
                            }
                            int i16 = i15;
                            if ((46811 & i16) != 9362 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(341865432, i16, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:119)");
                                }
                                final Function2<Composer, Integer, Unit> function219 = function22;
                                if (function219 != null) {
                                    final boolean z15 = z4;
                                    composableLambda = ComposableLambdaKt.composableLambda(composer3, 362863774, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i17) {
                                            TextStyle textStyleM13191copyp1EtxEg;
                                            if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(362863774, i17, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:121)");
                                                }
                                                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                TextStyle textStyleLerp = TextStyleKt.lerp(materialTheme2.getTypography(composer4, 6).getSubtitle1(), materialTheme2.getTypography(composer4, 6).getCaption(), f);
                                                boolean z16 = z15;
                                                long j5 = j3;
                                                if (z16) {
                                                    textStyleM13191copyp1EtxEg = textStyleLerp.m13191copyp1EtxEg((15695871 & 1) != 0 ? textStyleLerp.spanStyle.m13124getColor0d7_KjU() : j5, (15695871 & 2) != 0 ? textStyleLerp.spanStyle.getFontSize() : 0L, (15695871 & 4) != 0 ? textStyleLerp.spanStyle.getFontWeight() : null, (15695871 & 8) != 0 ? textStyleLerp.spanStyle.getFontStyle() : null, (15695871 & 16) != 0 ? textStyleLerp.spanStyle.getFontSynthesis() : null, (15695871 & 32) != 0 ? textStyleLerp.spanStyle.getFontFamily() : null, (15695871 & 64) != 0 ? textStyleLerp.spanStyle.getFontFeatureSettings() : null, (15695871 & 128) != 0 ? textStyleLerp.spanStyle.getLetterSpacing() : 0L, (15695871 & 256) != 0 ? textStyleLerp.spanStyle.getBaselineShift() : null, (15695871 & 512) != 0 ? textStyleLerp.spanStyle.getTextGeometricTransform() : null, (15695871 & 1024) != 0 ? textStyleLerp.spanStyle.getLocaleList() : null, (15695871 & 2048) != 0 ? textStyleLerp.spanStyle.getBackground() : 0L, (15695871 & 4096) != 0 ? textStyleLerp.spanStyle.getTextDecoration() : null, (15695871 & 8192) != 0 ? textStyleLerp.spanStyle.getShadow() : null, (15695871 & 16384) != 0 ? textStyleLerp.spanStyle.getDrawStyle() : null, (15695871 & 32768) != 0 ? textStyleLerp.paragraphStyle.getTextAlign() : 0, (15695871 & 65536) != 0 ? textStyleLerp.paragraphStyle.getTextDirection() : 0, (15695871 & 131072) != 0 ? textStyleLerp.paragraphStyle.getLineHeight() : 0L, (15695871 & 262144) != 0 ? textStyleLerp.paragraphStyle.getTextIndent() : null, (15695871 & 524288) != 0 ? textStyleLerp.platformStyle : null, (15695871 & 1048576) != 0 ? textStyleLerp.paragraphStyle.getLineHeightStyle() : null, (15695871 & 2097152) != 0 ? textStyleLerp.paragraphStyle.getLineBreak() : 0, (15695871 & 4194304) != 0 ? textStyleLerp.paragraphStyle.getHyphens() : 0, (15695871 & 8388608) != 0 ? textStyleLerp.paragraphStyle.getTextMotion() : null);
                                                } else {
                                                    textStyleM13191copyp1EtxEg = textStyleLerp;
                                                }
                                                TextFieldImplKt.m9075DecorationeuL9pac(j4, textStyleM13191copyp1EtxEg, null, function219, composer4, 384, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    });
                                } else {
                                    composableLambda = null;
                                }
                                if (function215 == null || text.length() != 0 || f2 <= 0.0f) {
                                    composableLambda2 = null;
                                } else {
                                    final TextFieldColors textFieldColors2 = textFieldColors;
                                    final boolean z16 = z12;
                                    final Function2<Composer, Integer, Unit> function220 = function215;
                                    composableLambda2 = ComposableLambdaKt.composableLambda(composer3, 1120552650, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer4, Integer num) {
                                            invoke(modifier, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@NotNull Modifier modifier, @Nullable Composer composer4, int i17) {
                                            if ((i17 & 14) == 0) {
                                                i17 |= composer4.changed(modifier) ? 4 : 2;
                                            }
                                            if ((i17 & 91) != 18 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1120552650, i17, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:137)");
                                                }
                                                Modifier modifierAlpha = AlphaKt.alpha(modifier, f2);
                                                TextFieldColors textFieldColors3 = textFieldColors2;
                                                boolean z17 = z16;
                                                Function2<Composer, Integer, Unit> function221 = function220;
                                                composer4.startReplaceableGroup(733328855);
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                                composer4.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlpha);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                TextFieldImplKt.m9075DecorationeuL9pac(textFieldColors3.placeholderColor(z17, composer4, 0).getValue().m11350unboximpl(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), null, function221, composer4, 0, 4);
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    });
                                }
                                final long jM11350unboximpl = textFieldColors.leadingIconColor(z12, z13, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                final Function2<Composer, Integer, Unit> function221 = function216;
                                ComposableLambda composableLambda3 = function221 != null ? ComposableLambdaKt.composableLambda(composer3, 1505327088, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i17) {
                                        if ((i17 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1505327088, i17, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:150)");
                                        }
                                        TextFieldImplKt.m9075DecorationeuL9pac(jM11350unboximpl, null, null, function221, composer4, 0, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }) : null;
                                final long jM11350unboximpl2 = textFieldColors.trailingIconColor(z12, z13, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                final Function2<Composer, Integer, Unit> function222 = function217;
                                ComposableLambda composableLambda4 = function222 != null ? ComposableLambdaKt.composableLambda(composer3, -1894727196, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i17) {
                                        if ((i17 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1894727196, i17, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:157)");
                                        }
                                        TextFieldImplKt.m9075DecorationeuL9pac(jM11350unboximpl2, null, null, function222, composer4, 0, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }) : null;
                                int i17 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                if (i17 == 1) {
                                    composer3.startReplaceableGroup(-1083197552);
                                    TextFieldKt.TextFieldLayout(Modifier.INSTANCE, function2, composableLambda, composableLambda2, composableLambda3, composableLambda4, z14, f, paddingValues, composer3, ((i16 << 21) & 29360128) | 6);
                                    composer3.endReplaceableGroup();
                                } else if (i17 == 2) {
                                    composer3.startReplaceableGroup(-1083197009);
                                    composer3.startReplaceableGroup(-492369756);
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    Composer.Companion companion2 = Composer.INSTANCE;
                                    if (objRememberedValue2 == companion2.getEmpty()) {
                                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m11156boximpl(Size.INSTANCE.m11177getZeroNHjbRc()), null, 2, null);
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer3.endReplaceableGroup();
                                    final MutableState mutableState = (MutableState) objRememberedValue2;
                                    final PaddingValues paddingValues2 = paddingValues;
                                    final Function2<Composer, Integer, Unit> function223 = function218;
                                    ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composer3, 139886979, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i18) {
                                            if ((i18 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(139886979, i18, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:179)");
                                                }
                                                Modifier modifierM8967outlineCutout12SF9DM = OutlinedTextFieldKt.m8967outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.INSTANCE, OutlinedTextFieldKt.BorderId), mutableState.getValue().getPackedValue(), paddingValues2);
                                                Function2<Composer, Integer, Unit> function224 = function223;
                                                composer4.startReplaceableGroup(733328855);
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
                                                composer4.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8967outlineCutout12SF9DM);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer4.startReplaceableGroup(1661575907);
                                                if (function224 != null) {
                                                    function224.invoke(composer4, 0);
                                                }
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    });
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    Function2<Composer, Integer, Unit> function224 = function2;
                                    boolean z17 = z14;
                                    composer3.startReplaceableGroup(-1034527843);
                                    boolean zChanged2 = composer3.changed(f) | composer3.changed(mutableState);
                                    Object objRememberedValue3 = composer3.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == companion2.getEmpty()) {
                                        objRememberedValue3 = new Function1<Size, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                                m9077invokeuvyYCjk(size.getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                            public final void m9077invokeuvyYCjk(long j5) {
                                                float fM11168getWidthimpl = Size.m11168getWidthimpl(j5) * f;
                                                float fM11165getHeightimpl = Size.m11165getHeightimpl(j5) * f;
                                                if (Size.m11168getWidthimpl(mutableState.getValue().getPackedValue()) == fM11168getWidthimpl && Size.m11165getHeightimpl(mutableState.getValue().getPackedValue()) == fM11165getHeightimpl) {
                                                    return;
                                                }
                                                mutableState.setValue(Size.m11156boximpl(SizeKt.Size(fM11168getWidthimpl, fM11165getHeightimpl)));
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer3.endReplaceableGroup();
                                    OutlinedTextFieldKt.OutlinedTextFieldLayout(companion3, function224, composableLambda2, composableLambda, composableLambda3, composableLambda4, z17, f, (Function1) objRememberedValue3, composableLambda5, paddingValues, composer3, ((i16 << 21) & 29360128) | 805306374, 0);
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(-1083195535);
                                    composer3.endReplaceableGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 1769472);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function27 = function211;
                    function28 = function212;
                    function29 = function213;
                    z6 = z9;
                    function210 = function214;
                    z7 = z12;
                    z8 = z13;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function27 = function23;
                    function28 = function24;
                    function29 = function25;
                    z6 = z;
                    z7 = z2;
                    z8 = z3;
                    function210 = function26;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt.CommonDecorationBox.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i14) {
                            TextFieldImplKt.CommonDecorationBox(textFieldType, str, function2, visualTransformation, function22, function27, function28, function29, z6, z7, z8, interactionSource, paddingValues, textFieldColors, function210, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i13 |= 384;
            if ((i3 & 8192) != 0) {
            }
            i12 = i3 & 16384;
            if (i12 != 0) {
            }
            if ((i4 & 1533916891) != 306783378) {
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
                if (i12 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(visualTransformation);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceableGroup();
                    final String text2 = ((TransformedText) objRememberedValue).getText().getText();
                    if (!FocusInteractionKt.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i13 >> 3) & 14).getValue().booleanValue()) {
                    }
                    inputPhase2 = inputPhase;
                    Function3<InputPhase, Composer, Integer, Color> function32 = new Function3<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase4, Composer composer3, Integer num) {
                            return Color.m11330boximpl(m9078invokeXeAY9LY(inputPhase4, composer3, num.intValue()));
                        }

                        @Composable
                        /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                        public final long m9078invokeXeAY9LY(@NotNull InputPhase inputPhase4, @Nullable Composer composer3, int i14) {
                            composer3.startReplaceableGroup(697243846);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(697243846, i14, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
                            }
                            long jM11350unboximpl = textFieldColors.labelColor(z10, inputPhase4 == InputPhase.UnfocusedEmpty ? false : z11, interactionSource, composer3, 0).getValue().m11350unboximpl();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceableGroup();
                            return jM11350unboximpl;
                        }
                    };
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    Typography typography2 = materialTheme2.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle12 = typography2.getSubtitle1();
                    TextStyle caption2 = typography2.getCaption();
                    long jM13195getColor0d7_KjU4 = subtitle12.m13195getColor0d7_KjU();
                    Color.Companion companion2 = Color.INSTANCE;
                    if (Color.m11341equalsimpl0(jM13195getColor0d7_KjU4, companion2.m11376getUnspecified0d7_KjU())) {
                        TextFieldTransitionScope textFieldTransitionScope2 = TextFieldTransitionScope.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(2129140935);
                        long jM13195getColor0d7_KjU22 = materialTheme2.getTypography(composerStartRestartGroup, 6).getCaption().m13195getColor0d7_KjU();
                        if (z4) {
                            inputPhase3 = inputPhase2;
                            long j3 = jM13195getColor0d7_KjU22;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(2129141126);
                            long jM13195getColor0d7_KjU32 = materialTheme2.getTypography(composerStartRestartGroup, 6).getSubtitle1().m13195getColor0d7_KjU();
                            if (z4) {
                                z5 = false;
                                long j22 = jM13195getColor0d7_KjU32;
                                composerStartRestartGroup.endReplaceableGroup();
                                final Function2<? super Composer, ? super Integer, Unit> function2152 = function211;
                                final boolean z122 = z10;
                                final boolean z132 = z11;
                                final Function2<? super Composer, ? super Integer, Unit> function2162 = function212;
                                composer2 = composerStartRestartGroup;
                                final Function2<? super Composer, ? super Integer, Unit> function2172 = function213;
                                final boolean z142 = z9;
                                final Function2<? super Composer, ? super Integer, Unit> function2182 = function214;
                                textFieldTransitionScope2.m9083TransitionDTcfvLk(inputPhase3, j3, j22, function32, function22 == null ? true : z5, ComposableLambdaKt.composableLambda(composer2, 341865432, true, new Function6<Float, Color, Color, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt.CommonDecorationBox.3

                                    /* compiled from: TextFieldImpl.kt */
                                    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                    /* renamed from: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$WhenMappings */
                                    public /* synthetic */ class WhenMappings {
                                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                        static {
                                            int[] iArr = new int[TextFieldType.values().length];
                                            try {
                                                iArr[TextFieldType.Filled.ordinal()] = 1;
                                            } catch (NoSuchFieldError unused) {
                                            }
                                            try {
                                                iArr[TextFieldType.Outlined.ordinal()] = 2;
                                            } catch (NoSuchFieldError unused2) {
                                            }
                                            $EnumSwitchMapping$0 = iArr;
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(6);
                                    }

                                    @Override // kotlin.jvm.functions.Function6
                                    public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Composer composer3, Integer num) {
                                        m9076invokeRIQooxk(f.floatValue(), color.m11350unboximpl(), color2.m11350unboximpl(), f2.floatValue(), composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    /* renamed from: invoke-RIQooxk, reason: not valid java name */
                                    public final void m9076invokeRIQooxk(final float f, final long j32, final long j4, final float f2, @Nullable Composer composer3, int i14) {
                                        int i15;
                                        ComposableLambda composableLambda;
                                        ComposableLambda composableLambda2;
                                        if ((i14 & 14) == 0) {
                                            i15 = (composer3.changed(f) ? 4 : 2) | i14;
                                        } else {
                                            i15 = i14;
                                        }
                                        if ((i14 & 112) == 0) {
                                            i15 |= composer3.changed(j32) ? 32 : 16;
                                        }
                                        if ((i14 & 896) == 0) {
                                            i15 |= composer3.changed(j4) ? 256 : 128;
                                        }
                                        if ((i14 & 7168) == 0) {
                                            i15 |= composer3.changed(f2) ? 2048 : 1024;
                                        }
                                        int i16 = i15;
                                        if ((46811 & i16) != 9362 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(341865432, i16, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:119)");
                                            }
                                            final Function2<? super Composer, ? super Integer, Unit> function219 = function22;
                                            if (function219 != null) {
                                                final boolean z15 = z4;
                                                composableLambda = ComposableLambdaKt.composableLambda(composer3, 362863774, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                    @Composable
                                                    public final void invoke(@Nullable Composer composer4, int i17) {
                                                        TextStyle textStyleM13191copyp1EtxEg;
                                                        if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(362863774, i17, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:121)");
                                                            }
                                                            MaterialTheme materialTheme22 = MaterialTheme.INSTANCE;
                                                            TextStyle textStyleLerp = TextStyleKt.lerp(materialTheme22.getTypography(composer4, 6).getSubtitle1(), materialTheme22.getTypography(composer4, 6).getCaption(), f);
                                                            boolean z16 = z15;
                                                            long j5 = j32;
                                                            if (z16) {
                                                                textStyleM13191copyp1EtxEg = textStyleLerp.m13191copyp1EtxEg((15695871 & 1) != 0 ? textStyleLerp.spanStyle.m13124getColor0d7_KjU() : j5, (15695871 & 2) != 0 ? textStyleLerp.spanStyle.getFontSize() : 0L, (15695871 & 4) != 0 ? textStyleLerp.spanStyle.getFontWeight() : null, (15695871 & 8) != 0 ? textStyleLerp.spanStyle.getFontStyle() : null, (15695871 & 16) != 0 ? textStyleLerp.spanStyle.getFontSynthesis() : null, (15695871 & 32) != 0 ? textStyleLerp.spanStyle.getFontFamily() : null, (15695871 & 64) != 0 ? textStyleLerp.spanStyle.getFontFeatureSettings() : null, (15695871 & 128) != 0 ? textStyleLerp.spanStyle.getLetterSpacing() : 0L, (15695871 & 256) != 0 ? textStyleLerp.spanStyle.getBaselineShift() : null, (15695871 & 512) != 0 ? textStyleLerp.spanStyle.getTextGeometricTransform() : null, (15695871 & 1024) != 0 ? textStyleLerp.spanStyle.getLocaleList() : null, (15695871 & 2048) != 0 ? textStyleLerp.spanStyle.getBackground() : 0L, (15695871 & 4096) != 0 ? textStyleLerp.spanStyle.getTextDecoration() : null, (15695871 & 8192) != 0 ? textStyleLerp.spanStyle.getShadow() : null, (15695871 & 16384) != 0 ? textStyleLerp.spanStyle.getDrawStyle() : null, (15695871 & 32768) != 0 ? textStyleLerp.paragraphStyle.getTextAlign() : 0, (15695871 & 65536) != 0 ? textStyleLerp.paragraphStyle.getTextDirection() : 0, (15695871 & 131072) != 0 ? textStyleLerp.paragraphStyle.getLineHeight() : 0L, (15695871 & 262144) != 0 ? textStyleLerp.paragraphStyle.getTextIndent() : null, (15695871 & 524288) != 0 ? textStyleLerp.platformStyle : null, (15695871 & 1048576) != 0 ? textStyleLerp.paragraphStyle.getLineHeightStyle() : null, (15695871 & 2097152) != 0 ? textStyleLerp.paragraphStyle.getLineBreak() : 0, (15695871 & 4194304) != 0 ? textStyleLerp.paragraphStyle.getHyphens() : 0, (15695871 & 8388608) != 0 ? textStyleLerp.paragraphStyle.getTextMotion() : null);
                                                            } else {
                                                                textStyleM13191copyp1EtxEg = textStyleLerp;
                                                            }
                                                            TextFieldImplKt.m9075DecorationeuL9pac(j4, textStyleM13191copyp1EtxEg, null, function219, composer4, 384, 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                });
                                            } else {
                                                composableLambda = null;
                                            }
                                            if (function2152 == null || text2.length() != 0 || f2 <= 0.0f) {
                                                composableLambda2 = null;
                                            } else {
                                                final TextFieldColors textFieldColors2 = textFieldColors;
                                                final boolean z16 = z122;
                                                final Function2<? super Composer, ? super Integer, Unit> function220 = function2152;
                                                composableLambda2 = ComposableLambdaKt.composableLambda(composer3, 1120552650, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer4, Integer num) {
                                                        invoke(modifier, composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                    @Composable
                                                    public final void invoke(@NotNull Modifier modifier, @Nullable Composer composer4, int i17) {
                                                        if ((i17 & 14) == 0) {
                                                            i17 |= composer4.changed(modifier) ? 4 : 2;
                                                        }
                                                        if ((i17 & 91) != 18 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1120552650, i17, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:137)");
                                                            }
                                                            Modifier modifierAlpha = AlphaKt.alpha(modifier, f2);
                                                            TextFieldColors textFieldColors3 = textFieldColors2;
                                                            boolean z17 = z16;
                                                            Function2<Composer, Integer, Unit> function221 = function220;
                                                            composer4.startReplaceableGroup(733328855);
                                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                                            composer4.startReplaceableGroup(-1323940314);
                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor = companion22.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlpha);
                                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer4.startReusableNode();
                                                            if (composer4.getInserting()) {
                                                                composer4.createNode(constructor);
                                                            } else {
                                                                composer4.useNode();
                                                            }
                                                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion22.getSetMeasurePolicy());
                                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion22.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                            composer4.startReplaceableGroup(2058660585);
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            TextFieldImplKt.m9075DecorationeuL9pac(textFieldColors3.placeholderColor(z17, composer4, 0).getValue().m11350unboximpl(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), null, function221, composer4, 0, 4);
                                                            composer4.endReplaceableGroup();
                                                            composer4.endNode();
                                                            composer4.endReplaceableGroup();
                                                            composer4.endReplaceableGroup();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                });
                                            }
                                            final long jM11350unboximpl = textFieldColors.leadingIconColor(z122, z132, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                            final Function2<? super Composer, ? super Integer, Unit> function221 = function2162;
                                            ComposableLambda composableLambda3 = function221 != null ? ComposableLambdaKt.composableLambda(composer3, 1505327088, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer4, int i17) {
                                                    if ((i17 & 11) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1505327088, i17, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:150)");
                                                    }
                                                    TextFieldImplKt.m9075DecorationeuL9pac(jM11350unboximpl, null, null, function221, composer4, 0, 6);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }) : null;
                                            final long jM11350unboximpl2 = textFieldColors.trailingIconColor(z122, z132, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                            final Function2<? super Composer, ? super Integer, Unit> function222 = function2172;
                                            ComposableLambda composableLambda4 = function222 != null ? ComposableLambdaKt.composableLambda(composer3, -1894727196, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer4, int i17) {
                                                    if ((i17 & 11) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1894727196, i17, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:157)");
                                                    }
                                                    TextFieldImplKt.m9075DecorationeuL9pac(jM11350unboximpl2, null, null, function222, composer4, 0, 6);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }) : null;
                                            int i17 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                            if (i17 == 1) {
                                                composer3.startReplaceableGroup(-1083197552);
                                                TextFieldKt.TextFieldLayout(Modifier.INSTANCE, function2, composableLambda, composableLambda2, composableLambda3, composableLambda4, z142, f, paddingValues, composer3, ((i16 << 21) & 29360128) | 6);
                                                composer3.endReplaceableGroup();
                                            } else if (i17 == 2) {
                                                composer3.startReplaceableGroup(-1083197009);
                                                composer3.startReplaceableGroup(-492369756);
                                                Object objRememberedValue2 = composer3.rememberedValue();
                                                Composer.Companion companion22 = Composer.INSTANCE;
                                                if (objRememberedValue2 == companion22.getEmpty()) {
                                                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m11156boximpl(Size.INSTANCE.m11177getZeroNHjbRc()), null, 2, null);
                                                    composer3.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer3.endReplaceableGroup();
                                                final MutableState<Size> mutableState = (MutableState) objRememberedValue2;
                                                final PaddingValues paddingValues2 = paddingValues;
                                                final Function2<? super Composer, ? super Integer, Unit> function223 = function2182;
                                                ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composer3, 139886979, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                    @Composable
                                                    public final void invoke(@Nullable Composer composer4, int i18) {
                                                        if ((i18 & 11) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(139886979, i18, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:179)");
                                                            }
                                                            Modifier modifierM8967outlineCutout12SF9DM = OutlinedTextFieldKt.m8967outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.INSTANCE, OutlinedTextFieldKt.BorderId), mutableState.getValue().getPackedValue(), paddingValues2);
                                                            Function2<Composer, Integer, Unit> function224 = function223;
                                                            composer4.startReplaceableGroup(733328855);
                                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
                                                            composer4.startReplaceableGroup(-1323940314);
                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8967outlineCutout12SF9DM);
                                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer4.startReusableNode();
                                                            if (composer4.getInserting()) {
                                                                composer4.createNode(constructor);
                                                            } else {
                                                                composer4.useNode();
                                                            }
                                                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                            composer4.startReplaceableGroup(2058660585);
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            composer4.startReplaceableGroup(1661575907);
                                                            if (function224 != null) {
                                                                function224.invoke(composer4, 0);
                                                            }
                                                            composer4.endReplaceableGroup();
                                                            composer4.endReplaceableGroup();
                                                            composer4.endNode();
                                                            composer4.endReplaceableGroup();
                                                            composer4.endReplaceableGroup();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                });
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                Function2<Composer, Integer, Unit> function224 = function2;
                                                boolean z17 = z142;
                                                composer3.startReplaceableGroup(-1034527843);
                                                boolean zChanged2 = composer3.changed(f) | composer3.changed(mutableState);
                                                Object objRememberedValue3 = composer3.rememberedValue();
                                                if (zChanged2 || objRememberedValue3 == companion22.getEmpty()) {
                                                    objRememberedValue3 = new Function1<Size, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                                            m9077invokeuvyYCjk(size.getPackedValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                                        public final void m9077invokeuvyYCjk(long j5) {
                                                            float fM11168getWidthimpl = Size.m11168getWidthimpl(j5) * f;
                                                            float fM11165getHeightimpl = Size.m11165getHeightimpl(j5) * f;
                                                            if (Size.m11168getWidthimpl(mutableState.getValue().getPackedValue()) == fM11168getWidthimpl && Size.m11165getHeightimpl(mutableState.getValue().getPackedValue()) == fM11165getHeightimpl) {
                                                                return;
                                                            }
                                                            mutableState.setValue(Size.m11156boximpl(SizeKt.Size(fM11168getWidthimpl, fM11165getHeightimpl)));
                                                        }
                                                    };
                                                    composer3.updateRememberedValue(objRememberedValue3);
                                                }
                                                composer3.endReplaceableGroup();
                                                OutlinedTextFieldKt.OutlinedTextFieldLayout(companion3, function224, composableLambda2, composableLambda, composableLambda3, composableLambda4, z17, f, (Function1) objRememberedValue3, composableLambda5, paddingValues, composer3, ((i16 << 21) & 29360128) | 805306374, 0);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(-1083195535);
                                                composer3.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 1769472);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function27 = function211;
                                function28 = function212;
                                function29 = function213;
                                z6 = z9;
                                function210 = function214;
                                z7 = z122;
                                z8 = z132;
                            }
                        }
                    } else {
                        TextFieldTransitionScope textFieldTransitionScope22 = TextFieldTransitionScope.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(2129140935);
                        long jM13195getColor0d7_KjU222 = materialTheme2.getTypography(composerStartRestartGroup, 6).getCaption().m13195getColor0d7_KjU();
                        if (z4) {
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        int i132 = i11;
        if ((i3 & 4096) != 0) {
        }
        if ((i3 & 8192) != 0) {
        }
        i12 = i3 & 16384;
        if (i12 != 0) {
        }
        if ((i4 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableOpenTarget(index = 0)
    /* renamed from: Decoration-euL9pac, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9075DecorationeuL9pac(final long j, @Nullable TextStyle textStyle, @Nullable Float f, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        TextStyle textStyle2;
        int i4;
        final Float f2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-399493340);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                textStyle2 = textStyle;
                i3 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    f2 = f;
                    i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
                }
                if ((i3 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i5 != 0) {
                        textStyle2 = null;
                    }
                    if (i4 != 0) {
                        f2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-399493340, i3, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:223)");
                    }
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
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

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i6) {
                            if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(494684590, i6, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:225)");
                                }
                                ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(j));
                                final Float f3 = f2;
                                final Function2<Composer, Integer, Unit> function22 = function2;
                                final long j2 = j;
                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i7) {
                                        if ((i7 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1132188434, i7, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:226)");
                                            }
                                            if (f3 != null) {
                                                composer3.startReplaceableGroup(-452622690);
                                                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(f3), function22, composer3, ProvidedValue.$stable);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(-452622510);
                                                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m11342getAlphaimpl(j2))), function22, composer3, ProvidedValue.$stable);
                                                composer3.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    });
                    if (textStyle2 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-2009953423);
                        TextKt.ProvideTextStyle(textStyle2, composableLambda, composerStartRestartGroup, ((i3 >> 3) & 14) | 48);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-2009953371);
                        composableLambda.invoke(composerStartRestartGroup, 6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                final Float f3 = f2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final TextStyle textStyle3 = textStyle2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
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

                        public final void invoke(@Nullable Composer composer2, int i6) {
                            TextFieldImplKt.m9075DecorationeuL9pac(j, textStyle3, f3, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            f2 = f;
            if ((i2 & 8) != 0) {
            }
            if ((i3 & 5851) != 1170) {
                if (i5 != 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
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

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i6) {
                        if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(494684590, i6, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:225)");
                            }
                            ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(j));
                            final Float f32 = f2;
                            final Function2<? super Composer, ? super Integer, Unit> function22 = function2;
                            final long j2 = j;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i7) {
                                    if ((i7 & 11) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1132188434, i7, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:226)");
                                        }
                                        if (f32 != null) {
                                            composer3.startReplaceableGroup(-452622690);
                                            CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(f32), function22, composer3, ProvidedValue.$stable);
                                            composer3.endReplaceableGroup();
                                        } else {
                                            composer3.startReplaceableGroup(-452622510);
                                            CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m11342getAlphaimpl(j2))), function22, composer3, ProvidedValue.$stable);
                                            composer3.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                });
                if (textStyle2 == null) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            final Float f32 = f2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        textStyle2 = textStyle;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        f2 = f;
        if ((i2 & 8) != 0) {
        }
        if ((i3 & 5851) != 1170) {
        }
        final Float f322 = f2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @NotNull
    public static final Modifier defaultErrorSemantics(@NotNull Modifier modifier, boolean z, @NotNull final String str) {
        return z ? SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.TextFieldImplKt.defaultErrorSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                SemanticsPropertiesKt.error(semanticsPropertyReceiver, str);
            }
        }, 1, null) : modifier;
    }

    public static final int widthOrZero(@Nullable Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static final int heightOrZero(@Nullable Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    @Nullable
    public static final Object getLayoutId(@NotNull IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    static {
        float f = 48;
        IconDefaultSizeModifier = androidx.compose.foundation.layout.SizeKt.m8156defaultMinSizeVpY3zN4(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(f), C2046Dp.m13666constructorimpl(f));
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    @NotNull
    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }
}
