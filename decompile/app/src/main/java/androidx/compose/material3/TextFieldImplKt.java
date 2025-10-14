package androidx.compose.material3;

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
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldImpl.kt */
@Metadata(m7104d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0002\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00032\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b42\u0006\u00105\u001a\u0002062\u0013\u00107\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u00108\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u00109\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010:\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010;\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010<\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010=\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0011\u0010H\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0001¢\u0006\u0002\u0010I\u001a9\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020L2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N2\u0011\u0010O\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a\u0012\u0010R\u001a\u00020\u00012\b\u0010S\u001a\u0004\u0018\u00010TH\u0000\u001a\u0012\u0010U\u001a\u00020\u00012\b\u0010S\u001a\u0004\u0018\u00010TH\u0000\u001a\u001c\u0010V\u001a\u00020\n*\u00020\n2\u0006\u0010A\u001a\u00020?2\u0006\u0010W\u001a\u00020\u0003H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u000e\u0010\r\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u000f\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007\"\u0016\u0010\u0011\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007\"\u0016\u0010\u0013\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0014\u0010\u0007\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0019\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001a\u0010\u0007\"\u000e\u0010\u001b\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u001d\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001e\u0010\u0007\"\u000e\u0010\u001f\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010 \u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b!\u0010\u0007\"\u000e\u0010\"\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010#\u001a\u00020$X\u0080\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&\"\u001a\u0010(\u001a\u0004\u0018\u00010)*\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006X"}, m7105d2 = {"AnimationDuration", "", "ContainerId", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "LeadingId", "MinFocusedLabelLineHeight", "getMinFocusedLabelLineHeight", "MinSupportingTextLineHeight", "getMinSupportingTextLineHeight", "MinTextLineHeight", "getMinTextLineHeight", "PlaceholderAnimationDelayOrDuration", "PlaceholderAnimationDuration", "PlaceholderId", "PrefixId", "PrefixSuffixTextPadding", "getPrefixSuffixTextPadding", "SuffixId", "SupportingId", "SupportingTopPadding", "getSupportingTopPadding", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", "type", "Landroidx/compose/material3/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material3/TextFieldColors;", TtmlNode.RUBY_CONTAINER, "(Landroidx/compose/material3/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "Landroidx/compose/ui/text/TextStyle;", "content", "Decoration-KTwxG1Y", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "defaultErrorSemantics", "defaultErrorMessage", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,433:1\n1116#2,6:434\n658#3:440\n646#3:441\n658#3:442\n646#3:443\n154#4:444\n154#4:445\n154#4:446\n154#4:447\n154#4:448\n154#4:449\n154#4:450\n154#4:451\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt\n*L\n81#1:434,6\n106#1:440\n106#1:441\n109#1:442\n109#1:443\n424#1:444\n425#1:445\n426#1:446\n427#1:447\n428#1:448\n429#1:449\n430#1:450\n432#1:451\n*E\n"})
/* loaded from: classes2.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;

    @NotNull
    public static final String ContainerId = "Container";

    @NotNull
    private static final Modifier IconDefaultSizeModifier;

    @NotNull
    public static final String LabelId = "Label";

    @NotNull
    public static final String LeadingId = "Leading";
    private static final float MinFocusedLabelLineHeight;
    private static final float MinSupportingTextLineHeight;
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;

    @NotNull
    public static final String PlaceholderId = "Hint";

    @NotNull
    public static final String PrefixId = "Prefix";

    @NotNull
    public static final String SuffixId = "Suffix";

    @NotNull
    public static final String SupportingId = "Supporting";

    @NotNull
    public static final String TextFieldId = "TextField";
    private static final float TextFieldPadding;

    @NotNull
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float HorizontalIconPadding = C2046Dp.m13666constructorimpl(12);
    private static final float SupportingTopPadding = C2046Dp.m13666constructorimpl(4);
    private static final float PrefixSuffixTextPadding = C2046Dp.m13666constructorimpl(2);
    private static final float MinTextLineHeight = C2046Dp.m13666constructorimpl(24);

    /* JADX WARN: Removed duplicated region for block: B:106:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonDecorationBox(@NotNull final TextFieldType textFieldType, @NotNull final String str, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final VisualTransformation visualTransformation, @Nullable final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, @Nullable Function2<? super Composer, ? super Integer, Unit> function25, @Nullable Function2<? super Composer, ? super Integer, Unit> function26, @Nullable Function2<? super Composer, ? super Integer, Unit> function27, @Nullable Function2<? super Composer, ? super Integer, Unit> function28, boolean z, boolean z2, boolean z3, @NotNull final InteractionSource interactionSource, @NotNull final PaddingValues paddingValues, @NotNull final TextFieldColors textFieldColors, @NotNull final Function2<? super Composer, ? super Integer, Unit> function29, @Nullable Composer composer, final int i, final int i2, final int i3) {
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
        boolean z4;
        Object objRememberedValue;
        InputPhase inputPhase;
        InputPhase inputPhase2;
        Function3<InputPhase, Composer, Integer, Color> function3;
        final boolean z5;
        long jM13195getColor0d7_KjU;
        long jM13195getColor0d7_KjU2;
        Composer composer2;
        final boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final boolean z7;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-947035500);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(textFieldType) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(visualTransformation) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else if ((i & CpioConstants.C_ISBLK) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288;
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function25) ? 8388608 : 4194304;
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function26) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
            }
            i9 = i3 & 512;
            if (i9 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function27) ? 536870912 : 268435456;
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i11 = i2 | (composerStartRestartGroup.changedInstance(function28) ? 4 : 2);
            } else {
                i11 = i2;
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
                i11 |= 48;
            } else if ((i2 & 48) == 0) {
                i11 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            int i15 = i11;
            i13 = i3 & 4096;
            if (i13 == 0) {
                i15 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i15 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i14 = i3 & 8192;
                if (i14 != 0) {
                    i15 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i15 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                    }
                    if ((i3 & 16384) == 0) {
                        i15 |= CpioConstants.C_ISBLK;
                    } else if ((i2 & CpioConstants.C_ISBLK) == 0) {
                        i15 |= composerStartRestartGroup.changed(interactionSource) ? 16384 : 8192;
                    }
                    if ((32768 & i3) != 0) {
                        if ((i2 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                            i15 |= composerStartRestartGroup.changed(paddingValues) ? 131072 : 65536;
                        }
                        if ((i3 & 65536) != 0) {
                            i15 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i15 |= composerStartRestartGroup.changed(textFieldColors) ? 1048576 : 524288;
                        }
                        if ((i3 & 131072) != 0) {
                            i15 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i15 |= composerStartRestartGroup.changedInstance(function29) ? 8388608 : 4194304;
                        }
                        if ((i4 & 306783379) != 306783378 || (4793491 & i15) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            Function2<? super Composer, ? super Integer, Unit> function216 = i5 == 0 ? null : function23;
                            Function2<? super Composer, ? super Integer, Unit> function217 = i6 == 0 ? null : function24;
                            Function2<? super Composer, ? super Integer, Unit> function218 = i7 == 0 ? null : function25;
                            Function2<? super Composer, ? super Integer, Unit> function219 = i8 == 0 ? null : function26;
                            Function2<? super Composer, ? super Integer, Unit> function220 = i9 == 0 ? null : function27;
                            Function2<? super Composer, ? super Integer, Unit> function221 = i10 == 0 ? function28 : null;
                            boolean z9 = i12 == 0 ? false : z;
                            final boolean z10 = i13 == 0 ? true : z2;
                            final boolean z11 = i14 == 0 ? false : z3;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-947035500, i4, i15, "androidx.compose.material3.CommonDecorationBox (TextFieldImpl.kt:79)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-646389284);
                            z4 = ((i4 & 7168) != 2048) | ((i4 & 112) != 32);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final String text = ((TransformedText) objRememberedValue).getText().getText();
                            if (!FocusInteractionKt.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i15 >> 12) & 14).getValue().booleanValue()) {
                                inputPhase = InputPhase.Focused;
                            } else {
                                inputPhase = text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                            }
                            inputPhase2 = inputPhase;
                            function3 = new Function3<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$labelColor$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase3, Composer composer3, Integer num) {
                                    return Color.m11330boximpl(m10017invokeXeAY9LY(inputPhase3, composer3, num.intValue()));
                                }

                                @Composable
                                /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                                public final long m10017invokeXeAY9LY(@NotNull InputPhase inputPhase3, @Nullable Composer composer3, int i16) {
                                    composer3.startReplaceableGroup(-502832279);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-502832279, i16, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:92)");
                                    }
                                    long jM11350unboximpl = textFieldColors.labelColor$material3_release(z10, z11, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer3.endReplaceableGroup();
                                    return jM11350unboximpl;
                                }
                            };
                            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                            Typography typography = materialTheme.getTypography(composerStartRestartGroup, 6);
                            final TextStyle bodyLarge = typography.getBodyLarge();
                            final TextStyle bodySmall = typography.getBodySmall();
                            long jM13195getColor0d7_KjU3 = bodyLarge.m13195getColor0d7_KjU();
                            Color.Companion companion = Color.INSTANCE;
                            z5 = !(Color.m11341equalsimpl0(jM13195getColor0d7_KjU3, companion.m11376getUnspecified0d7_KjU()) || Color.m11341equalsimpl0(bodySmall.m13195getColor0d7_KjU(), companion.m11376getUnspecified0d7_KjU())) || (!Color.m11341equalsimpl0(bodyLarge.m13195getColor0d7_KjU(), companion.m11376getUnspecified0d7_KjU()) && Color.m11341equalsimpl0(bodySmall.m13195getColor0d7_KjU(), companion.m11376getUnspecified0d7_KjU()));
                            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(-646388325);
                            jM13195getColor0d7_KjU = materialTheme.getTypography(composerStartRestartGroup, 6).getBodySmall().m13195getColor0d7_KjU();
                            composerStartRestartGroup.startReplaceableGroup(-646388264);
                            if (z5 && jM13195getColor0d7_KjU == companion.m11376getUnspecified0d7_KjU()) {
                                jM13195getColor0d7_KjU = function3.invoke(inputPhase2, composerStartRestartGroup, 0).m11350unboximpl();
                            }
                            long j = jM13195getColor0d7_KjU;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-646388132);
                            jM13195getColor0d7_KjU2 = materialTheme.getTypography(composerStartRestartGroup, 6).getBodyLarge().m13195getColor0d7_KjU();
                            composerStartRestartGroup.startReplaceableGroup(-646388071);
                            if (z5 && jM13195getColor0d7_KjU2 == companion.m11376getUnspecified0d7_KjU()) {
                                jM13195getColor0d7_KjU2 = function3.invoke(inputPhase2, composerStartRestartGroup, 0).m11350unboximpl();
                            }
                            long j2 = jM13195getColor0d7_KjU2;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            final boolean z12 = z10;
                            final boolean z13 = z11;
                            final Function2<? super Composer, ? super Integer, Unit> function222 = function216;
                            boolean z14 = z10;
                            final Function2<? super Composer, ? super Integer, Unit> function223 = function219;
                            composer2 = composerStartRestartGroup;
                            final Function2<? super Composer, ? super Integer, Unit> function224 = function220;
                            boolean z15 = z11;
                            final Function2<? super Composer, ? super Integer, Unit> function225 = function217;
                            final Function2<? super Composer, ? super Integer, Unit> function226 = function218;
                            final Function2<? super Composer, ? super Integer, Unit> function227 = function221;
                            final boolean z16 = z9;
                            textFieldTransitionScope.m10022TransitionDTcfvLk(inputPhase2, j, j2, function3, function22 != null, ComposableLambdaKt.composableLambda(composer2, 1290853831, true, new Function7<Float, Color, Color, Float, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt.CommonDecorationBox.3

                                /* compiled from: TextFieldImpl.kt */
                                @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                /* renamed from: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$WhenMappings */
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
                                    super(7);
                                }

                                @Override // kotlin.jvm.functions.Function7
                                public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Float f3, Composer composer3, Integer num) {
                                    m10015invokeeopBjH0(f.floatValue(), color.m11350unboximpl(), color2.m11350unboximpl(), f2.floatValue(), f3.floatValue(), composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                /* renamed from: invoke-eopBjH0, reason: not valid java name */
                                public final void m10015invokeeopBjH0(final float f, final long j3, final long j4, final float f2, final float f3, @Nullable Composer composer3, int i16) {
                                    int i17;
                                    boolean z17;
                                    ComposableLambda composableLambda;
                                    ComposableLambda composableLambda2;
                                    ComposableLambda composableLambda3;
                                    ComposableLambda composableLambda4;
                                    ComposableLambda composableLambda5;
                                    if ((i16 & 6) == 0) {
                                        i17 = (composer3.changed(f) ? 4 : 2) | i16;
                                    } else {
                                        i17 = i16;
                                    }
                                    if ((i16 & 48) == 0) {
                                        i17 |= composer3.changed(j3) ? 32 : 16;
                                    }
                                    if ((i16 & 384) == 0) {
                                        i17 |= composer3.changed(j4) ? 256 : 128;
                                    }
                                    if ((i16 & 3072) == 0) {
                                        i17 |= composer3.changed(f2) ? 2048 : 1024;
                                    }
                                    if ((i16 & CpioConstants.C_ISBLK) == 0) {
                                        i17 |= composer3.changed(f3) ? 16384 : 8192;
                                    }
                                    int i18 = i17;
                                    if ((74899 & i18) != 74898 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1290853831, i18, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:115)");
                                        }
                                        final Function2<Composer, Integer, Unit> function228 = function22;
                                        if (function228 != null) {
                                            final boolean z18 = z5;
                                            z17 = true;
                                            composableLambda = ComposableLambdaKt.composableLambda(composer3, -382297919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
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
                                                public final void invoke(@Nullable Composer composer4, int i19) {
                                                    TextStyle textStyleM13191copyp1EtxEg;
                                                    if ((i19 & 3) != 2 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-382297919, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:117)");
                                                        }
                                                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                        TextStyle textStyleLerp = TextStyleKt.lerp(materialTheme2.getTypography(composer4, 6).getBodyLarge(), materialTheme2.getTypography(composer4, 6).getBodySmall(), f);
                                                        boolean z19 = z18;
                                                        long j5 = j3;
                                                        if (z19) {
                                                            textStyleM13191copyp1EtxEg = textStyleLerp.m13191copyp1EtxEg((15695871 & 1) != 0 ? textStyleLerp.spanStyle.m13124getColor0d7_KjU() : j5, (15695871 & 2) != 0 ? textStyleLerp.spanStyle.getFontSize() : 0L, (15695871 & 4) != 0 ? textStyleLerp.spanStyle.getFontWeight() : null, (15695871 & 8) != 0 ? textStyleLerp.spanStyle.getFontStyle() : null, (15695871 & 16) != 0 ? textStyleLerp.spanStyle.getFontSynthesis() : null, (15695871 & 32) != 0 ? textStyleLerp.spanStyle.getFontFamily() : null, (15695871 & 64) != 0 ? textStyleLerp.spanStyle.getFontFeatureSettings() : null, (15695871 & 128) != 0 ? textStyleLerp.spanStyle.getLetterSpacing() : 0L, (15695871 & 256) != 0 ? textStyleLerp.spanStyle.getBaselineShift() : null, (15695871 & 512) != 0 ? textStyleLerp.spanStyle.getTextGeometricTransform() : null, (15695871 & 1024) != 0 ? textStyleLerp.spanStyle.getLocaleList() : null, (15695871 & 2048) != 0 ? textStyleLerp.spanStyle.getBackground() : 0L, (15695871 & 4096) != 0 ? textStyleLerp.spanStyle.getTextDecoration() : null, (15695871 & 8192) != 0 ? textStyleLerp.spanStyle.getShadow() : null, (15695871 & 16384) != 0 ? textStyleLerp.spanStyle.getDrawStyle() : null, (15695871 & 32768) != 0 ? textStyleLerp.paragraphStyle.getTextAlign() : 0, (15695871 & 65536) != 0 ? textStyleLerp.paragraphStyle.getTextDirection() : 0, (15695871 & 131072) != 0 ? textStyleLerp.paragraphStyle.getLineHeight() : 0L, (15695871 & 262144) != 0 ? textStyleLerp.paragraphStyle.getTextIndent() : null, (15695871 & 524288) != 0 ? textStyleLerp.platformStyle : null, (15695871 & 1048576) != 0 ? textStyleLerp.paragraphStyle.getLineHeightStyle() : null, (15695871 & 2097152) != 0 ? textStyleLerp.paragraphStyle.getLineBreak() : 0, (15695871 & 4194304) != 0 ? textStyleLerp.paragraphStyle.getHyphens() : 0, (15695871 & 8388608) != 0 ? textStyleLerp.paragraphStyle.getTextMotion() : null);
                                                        } else {
                                                            textStyleM13191copyp1EtxEg = textStyleLerp;
                                                        }
                                                        TextFieldImplKt.m10014DecorationKTwxG1Y(j4, textStyleM13191copyp1EtxEg, function228, composer4, 0, 0);
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
                                            z17 = true;
                                            composableLambda = null;
                                        }
                                        final long jM11350unboximpl = textFieldColors.placeholderColor$material3_release(z12, z13, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                        if (function222 == null || text.length() != 0 || f2 <= 0.0f) {
                                            composableLambda2 = null;
                                        } else {
                                            final Function2<Composer, Integer, Unit> function229 = function222;
                                            composableLambda2 = ComposableLambdaKt.composableLambda(composer3, -524658155, z17, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
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
                                                public final void invoke(@NotNull Modifier modifier, @Nullable Composer composer4, int i19) {
                                                    if ((i19 & 6) == 0) {
                                                        i19 |= composer4.changed(modifier) ? 4 : 2;
                                                    }
                                                    if ((i19 & 19) != 18 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-524658155, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:135)");
                                                        }
                                                        Modifier modifierAlpha = AlphaKt.alpha(modifier, f2);
                                                        long j5 = jM11350unboximpl;
                                                        Function2<Composer, Integer, Unit> function230 = function229;
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
                                                        TextFieldImplKt.m10014DecorationKTwxG1Y(j5, MaterialTheme.INSTANCE.getTypography(composer4, 6).getBodyLarge(), function230, composer4, 0, 0);
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
                                        final long jM11350unboximpl2 = textFieldColors.prefixColor$material3_release(z12, z13, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                        final Function2<Composer, Integer, Unit> function230 = function223;
                                        if (function230 == null || f3 <= 0.0f) {
                                            composableLambda3 = null;
                                        } else {
                                            final TextStyle textStyle = bodyLarge;
                                            composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 1824482619, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1
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
                                                public final void invoke(@Nullable Composer composer4, int i19) {
                                                    if ((i19 & 3) != 2 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1824482619, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:149)");
                                                        }
                                                        Modifier modifierAlpha = AlphaKt.alpha(Modifier.INSTANCE, f3);
                                                        long j5 = jM11350unboximpl2;
                                                        TextStyle textStyle2 = textStyle;
                                                        Function2<Composer, Integer, Unit> function231 = function230;
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
                                                        TextFieldImplKt.m10014DecorationKTwxG1Y(j5, textStyle2, function231, composer4, 0, 0);
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
                                        final long jM11350unboximpl3 = textFieldColors.suffixColor$material3_release(z12, z13, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                        final Function2<Composer, Integer, Unit> function231 = function224;
                                        if (function231 == null || f3 <= 0.0f) {
                                            composableLambda4 = null;
                                        } else {
                                            final TextStyle textStyle2 = bodyLarge;
                                            composableLambda4 = ComposableLambdaKt.composableLambda(composer3, 907456412, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1
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
                                                public final void invoke(@Nullable Composer composer4, int i19) {
                                                    if ((i19 & 3) != 2 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(907456412, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:163)");
                                                        }
                                                        Modifier modifierAlpha = AlphaKt.alpha(Modifier.INSTANCE, f3);
                                                        long j5 = jM11350unboximpl3;
                                                        TextStyle textStyle3 = textStyle2;
                                                        Function2<Composer, Integer, Unit> function232 = function231;
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
                                                        TextFieldImplKt.m10014DecorationKTwxG1Y(j5, textStyle3, function232, composer4, 0, 0);
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
                                        final long jM11350unboximpl4 = textFieldColors.leadingIconColor$material3_release(z12, z13, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                        final Function2<Composer, Integer, Unit> function232 = function225;
                                        ComposableLambda composableLambda6 = function232 != null ? ComposableLambdaKt.composableLambda(composer3, 90769583, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
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
                                            public final void invoke(@Nullable Composer composer4, int i19) {
                                                if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(90769583, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:176)");
                                                }
                                                TextFieldImplKt.m10014DecorationKTwxG1Y(jM11350unboximpl4, null, function232, composer4, 0, 2);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }) : null;
                                        final long jM11350unboximpl5 = textFieldColors.trailingIconColor$material3_release(z12, z13, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                        final Function2<Composer, Integer, Unit> function233 = function226;
                                        ComposableLambda composableLambda7 = function233 != null ? ComposableLambdaKt.composableLambda(composer3, 2077796155, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
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
                                            public final void invoke(@Nullable Composer composer4, int i19) {
                                                if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(2077796155, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:183)");
                                                }
                                                TextFieldImplKt.m10014DecorationKTwxG1Y(jM11350unboximpl5, null, function233, composer4, 0, 2);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }) : null;
                                        final long jM11350unboximpl6 = textFieldColors.supportingTextColor$material3_release(z12, z13, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                        final Function2<Composer, Integer, Unit> function234 = function227;
                                        if (function234 != null) {
                                            final TextStyle textStyle3 = bodySmall;
                                            composableLambda5 = ComposableLambdaKt.composableLambda(composer3, -1531019900, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
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
                                                public final void invoke(@Nullable Composer composer4, int i19) {
                                                    if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1531019900, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:191)");
                                                    }
                                                    TextFieldImplKt.m10014DecorationKTwxG1Y(jM11350unboximpl6, textStyle3, function234, composer4, 0, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            });
                                        } else {
                                            composableLambda5 = null;
                                        }
                                        int i19 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                        if (i19 == z17) {
                                            composer3.startReplaceableGroup(404042583);
                                            final Function2<Composer, Integer, Unit> function235 = function29;
                                            TextFieldKt.TextFieldLayout(Modifier.INSTANCE, function2, composableLambda, composableLambda2, composableLambda6, composableLambda7, composableLambda3, composableLambda4, z16, f, ComposableLambdaKt.composableLambda(composer3, -2124779163, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
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
                                                public final void invoke(@Nullable Composer composer4, int i20) {
                                                    if ((i20 & 3) != 2 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-2124779163, i20, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:198)");
                                                        }
                                                        Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.ContainerId);
                                                        Function2<Composer, Integer, Unit> function236 = function235;
                                                        composer4.startReplaceableGroup(733328855);
                                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
                                                        composer4.startReplaceableGroup(-1323940314);
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierLayoutId);
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
                                                        function236.invoke(composer4, 0);
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
                                            }), composableLambda5, paddingValues, composer3, ((i18 << 27) & 1879048192) | 6, 6);
                                            composer3.endReplaceableGroup();
                                        } else if (i19 == 2) {
                                            composer3.startReplaceableGroup(404043576);
                                            composer3.startReplaceableGroup(404043645);
                                            Object objRememberedValue2 = composer3.rememberedValue();
                                            Composer.Companion companion2 = Composer.INSTANCE;
                                            if (objRememberedValue2 == companion2.getEmpty()) {
                                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m11156boximpl(Size.INSTANCE.m11177getZeroNHjbRc()), null, 2, null);
                                                composer3.updateRememberedValue(objRememberedValue2);
                                            }
                                            final MutableState mutableState = (MutableState) objRememberedValue2;
                                            composer3.endReplaceableGroup();
                                            final PaddingValues paddingValues2 = paddingValues;
                                            final Function2<Composer, Integer, Unit> function236 = function29;
                                            ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composer3, 1902535592, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
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
                                                public final void invoke(@Nullable Composer composer4, int i20) {
                                                    if ((i20 & 3) != 2 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1902535592, i20, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:224)");
                                                        }
                                                        Modifier modifierM9636outlineCutout12SF9DM = OutlinedTextFieldKt.m9636outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.ContainerId), mutableState.getValue().getPackedValue(), paddingValues2);
                                                        Function2<Composer, Integer, Unit> function237 = function236;
                                                        composer4.startReplaceableGroup(733328855);
                                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
                                                        composer4.startReplaceableGroup(-1323940314);
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM9636outlineCutout12SF9DM);
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
                                                        function237.invoke(composer4, 0);
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
                                            Function2<Composer, Integer, Unit> function237 = function2;
                                            boolean z19 = z16;
                                            composer3.startReplaceableGroup(404044653);
                                            boolean z20 = (i18 & 14) == 4;
                                            Object objRememberedValue3 = composer3.rememberedValue();
                                            if (z20 || objRememberedValue3 == companion2.getEmpty()) {
                                                objRememberedValue3 = new Function1<Size, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                                        m10016invokeuvyYCjk(size.getPackedValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                                    public final void m10016invokeuvyYCjk(long j5) {
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
                                            OutlinedTextFieldKt.OutlinedTextFieldLayout(companion3, function237, composableLambda2, composableLambda, composableLambda6, composableLambda7, composableLambda3, composableLambda4, z19, f, (Function1) objRememberedValue3, composableLambda8, composableLambda5, paddingValues, composer3, ((i18 << 27) & 1879048192) | 6, 48);
                                            composer3.endReplaceableGroup();
                                        } else {
                                            composer3.startReplaceableGroup(404045277);
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
                            z6 = z15;
                            function210 = function221;
                            function211 = function216;
                            function212 = function217;
                            function213 = function218;
                            function214 = function219;
                            function215 = function220;
                            z7 = z9;
                            z8 = z14;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function211 = function23;
                            function212 = function24;
                            function213 = function25;
                            function214 = function26;
                            function215 = function27;
                            function210 = function28;
                            z7 = z;
                            z6 = z3;
                            composer2 = composerStartRestartGroup;
                            z8 = z2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt.CommonDecorationBox.4
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

                                public final void invoke(@Nullable Composer composer3, int i16) {
                                    TextFieldImplKt.CommonDecorationBox(textFieldType, str, function2, visualTransformation, function22, function211, function212, function213, function214, function215, function210, z7, z8, z6, interactionSource, paddingValues, textFieldColors, function29, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i15 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    if ((i3 & 65536) != 0) {
                    }
                    if ((i3 & 131072) != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
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
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(-646389284);
                        if ((i4 & 112) != 32) {
                        }
                        z4 = ((i4 & 7168) != 2048) | ((i4 & 112) != 32);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z4) {
                            objRememberedValue = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            final String text2 = ((TransformedText) objRememberedValue).getText().getText();
                            if (!FocusInteractionKt.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i15 >> 12) & 14).getValue().booleanValue()) {
                            }
                            inputPhase2 = inputPhase;
                            function3 = new Function3<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$labelColor$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase3, Composer composer3, Integer num) {
                                    return Color.m11330boximpl(m10017invokeXeAY9LY(inputPhase3, composer3, num.intValue()));
                                }

                                @Composable
                                /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                                public final long m10017invokeXeAY9LY(@NotNull InputPhase inputPhase3, @Nullable Composer composer3, int i16) {
                                    composer3.startReplaceableGroup(-502832279);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-502832279, i16, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:92)");
                                    }
                                    long jM11350unboximpl = textFieldColors.labelColor$material3_release(z10, z11, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer3.endReplaceableGroup();
                                    return jM11350unboximpl;
                                }
                            };
                            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                            Typography typography2 = materialTheme2.getTypography(composerStartRestartGroup, 6);
                            final TextStyle bodyLarge2 = typography2.getBodyLarge();
                            final TextStyle bodySmall2 = typography2.getBodySmall();
                            long jM13195getColor0d7_KjU32 = bodyLarge2.m13195getColor0d7_KjU();
                            Color.Companion companion2 = Color.INSTANCE;
                            if (Color.m11341equalsimpl0(jM13195getColor0d7_KjU32, companion2.m11376getUnspecified0d7_KjU())) {
                                TextFieldTransitionScope textFieldTransitionScope2 = TextFieldTransitionScope.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(-646388325);
                                jM13195getColor0d7_KjU = materialTheme2.getTypography(composerStartRestartGroup, 6).getBodySmall().m13195getColor0d7_KjU();
                                composerStartRestartGroup.startReplaceableGroup(-646388264);
                                if (z5) {
                                    jM13195getColor0d7_KjU = function3.invoke(inputPhase2, composerStartRestartGroup, 0).m11350unboximpl();
                                }
                                long j3 = jM13195getColor0d7_KjU;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(-646388132);
                                jM13195getColor0d7_KjU2 = materialTheme2.getTypography(composerStartRestartGroup, 6).getBodyLarge().m13195getColor0d7_KjU();
                                composerStartRestartGroup.startReplaceableGroup(-646388071);
                                if (z5) {
                                    jM13195getColor0d7_KjU2 = function3.invoke(inputPhase2, composerStartRestartGroup, 0).m11350unboximpl();
                                }
                                long j22 = jM13195getColor0d7_KjU2;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                final boolean z122 = z10;
                                final boolean z132 = z11;
                                final Function2<? super Composer, ? super Integer, Unit> function2222 = function216;
                                boolean z142 = z10;
                                final Function2<? super Composer, ? super Integer, Unit> function2232 = function219;
                                composer2 = composerStartRestartGroup;
                                final Function2<? super Composer, ? super Integer, Unit> function2242 = function220;
                                boolean z152 = z11;
                                final Function2<? super Composer, ? super Integer, Unit> function2252 = function217;
                                final Function2<? super Composer, ? super Integer, Unit> function2262 = function218;
                                final Function2<? super Composer, ? super Integer, Unit> function2272 = function221;
                                final boolean z162 = z9;
                                textFieldTransitionScope2.m10022TransitionDTcfvLk(inputPhase2, j3, j22, function3, function22 != null, ComposableLambdaKt.composableLambda(composer2, 1290853831, true, new Function7<Float, Color, Color, Float, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt.CommonDecorationBox.3

                                    /* compiled from: TextFieldImpl.kt */
                                    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                    /* renamed from: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$WhenMappings */
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
                                        super(7);
                                    }

                                    @Override // kotlin.jvm.functions.Function7
                                    public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Float f3, Composer composer3, Integer num) {
                                        m10015invokeeopBjH0(f.floatValue(), color.m11350unboximpl(), color2.m11350unboximpl(), f2.floatValue(), f3.floatValue(), composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    /* renamed from: invoke-eopBjH0, reason: not valid java name */
                                    public final void m10015invokeeopBjH0(final float f, final long j32, final long j4, final float f2, final float f3, @Nullable Composer composer3, int i16) {
                                        int i17;
                                        boolean z17;
                                        ComposableLambda composableLambda;
                                        ComposableLambda composableLambda2;
                                        ComposableLambda composableLambda3;
                                        ComposableLambda composableLambda4;
                                        ComposableLambda composableLambda5;
                                        if ((i16 & 6) == 0) {
                                            i17 = (composer3.changed(f) ? 4 : 2) | i16;
                                        } else {
                                            i17 = i16;
                                        }
                                        if ((i16 & 48) == 0) {
                                            i17 |= composer3.changed(j32) ? 32 : 16;
                                        }
                                        if ((i16 & 384) == 0) {
                                            i17 |= composer3.changed(j4) ? 256 : 128;
                                        }
                                        if ((i16 & 3072) == 0) {
                                            i17 |= composer3.changed(f2) ? 2048 : 1024;
                                        }
                                        if ((i16 & CpioConstants.C_ISBLK) == 0) {
                                            i17 |= composer3.changed(f3) ? 16384 : 8192;
                                        }
                                        int i18 = i17;
                                        if ((74899 & i18) != 74898 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1290853831, i18, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:115)");
                                            }
                                            final Function2<? super Composer, ? super Integer, Unit> function228 = function22;
                                            if (function228 != null) {
                                                final boolean z18 = z5;
                                                z17 = true;
                                                composableLambda = ComposableLambdaKt.composableLambda(composer3, -382297919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
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
                                                    public final void invoke(@Nullable Composer composer4, int i19) {
                                                        TextStyle textStyleM13191copyp1EtxEg;
                                                        if ((i19 & 3) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-382297919, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:117)");
                                                            }
                                                            MaterialTheme materialTheme22 = MaterialTheme.INSTANCE;
                                                            TextStyle textStyleLerp = TextStyleKt.lerp(materialTheme22.getTypography(composer4, 6).getBodyLarge(), materialTheme22.getTypography(composer4, 6).getBodySmall(), f);
                                                            boolean z19 = z18;
                                                            long j5 = j32;
                                                            if (z19) {
                                                                textStyleM13191copyp1EtxEg = textStyleLerp.m13191copyp1EtxEg((15695871 & 1) != 0 ? textStyleLerp.spanStyle.m13124getColor0d7_KjU() : j5, (15695871 & 2) != 0 ? textStyleLerp.spanStyle.getFontSize() : 0L, (15695871 & 4) != 0 ? textStyleLerp.spanStyle.getFontWeight() : null, (15695871 & 8) != 0 ? textStyleLerp.spanStyle.getFontStyle() : null, (15695871 & 16) != 0 ? textStyleLerp.spanStyle.getFontSynthesis() : null, (15695871 & 32) != 0 ? textStyleLerp.spanStyle.getFontFamily() : null, (15695871 & 64) != 0 ? textStyleLerp.spanStyle.getFontFeatureSettings() : null, (15695871 & 128) != 0 ? textStyleLerp.spanStyle.getLetterSpacing() : 0L, (15695871 & 256) != 0 ? textStyleLerp.spanStyle.getBaselineShift() : null, (15695871 & 512) != 0 ? textStyleLerp.spanStyle.getTextGeometricTransform() : null, (15695871 & 1024) != 0 ? textStyleLerp.spanStyle.getLocaleList() : null, (15695871 & 2048) != 0 ? textStyleLerp.spanStyle.getBackground() : 0L, (15695871 & 4096) != 0 ? textStyleLerp.spanStyle.getTextDecoration() : null, (15695871 & 8192) != 0 ? textStyleLerp.spanStyle.getShadow() : null, (15695871 & 16384) != 0 ? textStyleLerp.spanStyle.getDrawStyle() : null, (15695871 & 32768) != 0 ? textStyleLerp.paragraphStyle.getTextAlign() : 0, (15695871 & 65536) != 0 ? textStyleLerp.paragraphStyle.getTextDirection() : 0, (15695871 & 131072) != 0 ? textStyleLerp.paragraphStyle.getLineHeight() : 0L, (15695871 & 262144) != 0 ? textStyleLerp.paragraphStyle.getTextIndent() : null, (15695871 & 524288) != 0 ? textStyleLerp.platformStyle : null, (15695871 & 1048576) != 0 ? textStyleLerp.paragraphStyle.getLineHeightStyle() : null, (15695871 & 2097152) != 0 ? textStyleLerp.paragraphStyle.getLineBreak() : 0, (15695871 & 4194304) != 0 ? textStyleLerp.paragraphStyle.getHyphens() : 0, (15695871 & 8388608) != 0 ? textStyleLerp.paragraphStyle.getTextMotion() : null);
                                                            } else {
                                                                textStyleM13191copyp1EtxEg = textStyleLerp;
                                                            }
                                                            TextFieldImplKt.m10014DecorationKTwxG1Y(j4, textStyleM13191copyp1EtxEg, function228, composer4, 0, 0);
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
                                                z17 = true;
                                                composableLambda = null;
                                            }
                                            final long jM11350unboximpl = textFieldColors.placeholderColor$material3_release(z122, z132, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                            if (function2222 == null || text2.length() != 0 || f2 <= 0.0f) {
                                                composableLambda2 = null;
                                            } else {
                                                final Function2<? super Composer, ? super Integer, Unit> function229 = function2222;
                                                composableLambda2 = ComposableLambdaKt.composableLambda(composer3, -524658155, z17, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
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
                                                    public final void invoke(@NotNull Modifier modifier, @Nullable Composer composer4, int i19) {
                                                        if ((i19 & 6) == 0) {
                                                            i19 |= composer4.changed(modifier) ? 4 : 2;
                                                        }
                                                        if ((i19 & 19) != 18 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-524658155, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:135)");
                                                            }
                                                            Modifier modifierAlpha = AlphaKt.alpha(modifier, f2);
                                                            long j5 = jM11350unboximpl;
                                                            Function2<Composer, Integer, Unit> function230 = function229;
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
                                                            TextFieldImplKt.m10014DecorationKTwxG1Y(j5, MaterialTheme.INSTANCE.getTypography(composer4, 6).getBodyLarge(), function230, composer4, 0, 0);
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
                                            final long jM11350unboximpl2 = textFieldColors.prefixColor$material3_release(z122, z132, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                            final Function2<? super Composer, ? super Integer, Unit> function230 = function2232;
                                            if (function230 == null || f3 <= 0.0f) {
                                                composableLambda3 = null;
                                            } else {
                                                final TextStyle textStyle = bodyLarge2;
                                                composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 1824482619, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1
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
                                                    public final void invoke(@Nullable Composer composer4, int i19) {
                                                        if ((i19 & 3) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1824482619, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:149)");
                                                            }
                                                            Modifier modifierAlpha = AlphaKt.alpha(Modifier.INSTANCE, f3);
                                                            long j5 = jM11350unboximpl2;
                                                            TextStyle textStyle2 = textStyle;
                                                            Function2<Composer, Integer, Unit> function231 = function230;
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
                                                            TextFieldImplKt.m10014DecorationKTwxG1Y(j5, textStyle2, function231, composer4, 0, 0);
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
                                            final long jM11350unboximpl3 = textFieldColors.suffixColor$material3_release(z122, z132, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                            final Function2<? super Composer, ? super Integer, Unit> function231 = function2242;
                                            if (function231 == null || f3 <= 0.0f) {
                                                composableLambda4 = null;
                                            } else {
                                                final TextStyle textStyle2 = bodyLarge2;
                                                composableLambda4 = ComposableLambdaKt.composableLambda(composer3, 907456412, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1
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
                                                    public final void invoke(@Nullable Composer composer4, int i19) {
                                                        if ((i19 & 3) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(907456412, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:163)");
                                                            }
                                                            Modifier modifierAlpha = AlphaKt.alpha(Modifier.INSTANCE, f3);
                                                            long j5 = jM11350unboximpl3;
                                                            TextStyle textStyle3 = textStyle2;
                                                            Function2<Composer, Integer, Unit> function232 = function231;
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
                                                            TextFieldImplKt.m10014DecorationKTwxG1Y(j5, textStyle3, function232, composer4, 0, 0);
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
                                            final long jM11350unboximpl4 = textFieldColors.leadingIconColor$material3_release(z122, z132, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                            final Function2<? super Composer, ? super Integer, Unit> function232 = function2252;
                                            ComposableLambda composableLambda6 = function232 != null ? ComposableLambdaKt.composableLambda(composer3, 90769583, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
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
                                                public final void invoke(@Nullable Composer composer4, int i19) {
                                                    if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(90769583, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:176)");
                                                    }
                                                    TextFieldImplKt.m10014DecorationKTwxG1Y(jM11350unboximpl4, null, function232, composer4, 0, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }) : null;
                                            final long jM11350unboximpl5 = textFieldColors.trailingIconColor$material3_release(z122, z132, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                            final Function2<? super Composer, ? super Integer, Unit> function233 = function2262;
                                            ComposableLambda composableLambda7 = function233 != null ? ComposableLambdaKt.composableLambda(composer3, 2077796155, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
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
                                                public final void invoke(@Nullable Composer composer4, int i19) {
                                                    if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(2077796155, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:183)");
                                                    }
                                                    TextFieldImplKt.m10014DecorationKTwxG1Y(jM11350unboximpl5, null, function233, composer4, 0, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }) : null;
                                            final long jM11350unboximpl6 = textFieldColors.supportingTextColor$material3_release(z122, z132, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                            final Function2<? super Composer, ? super Integer, Unit> function234 = function2272;
                                            if (function234 != null) {
                                                final TextStyle textStyle3 = bodySmall2;
                                                composableLambda5 = ComposableLambdaKt.composableLambda(composer3, -1531019900, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
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
                                                    public final void invoke(@Nullable Composer composer4, int i19) {
                                                        if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1531019900, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:191)");
                                                        }
                                                        TextFieldImplKt.m10014DecorationKTwxG1Y(jM11350unboximpl6, textStyle3, function234, composer4, 0, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                });
                                            } else {
                                                composableLambda5 = null;
                                            }
                                            int i19 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                            if (i19 == z17) {
                                                composer3.startReplaceableGroup(404042583);
                                                final Function2<? super Composer, ? super Integer, Unit> function235 = function29;
                                                TextFieldKt.TextFieldLayout(Modifier.INSTANCE, function2, composableLambda, composableLambda2, composableLambda6, composableLambda7, composableLambda3, composableLambda4, z162, f, ComposableLambdaKt.composableLambda(composer3, -2124779163, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
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
                                                    public final void invoke(@Nullable Composer composer4, int i20) {
                                                        if ((i20 & 3) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-2124779163, i20, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:198)");
                                                            }
                                                            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.ContainerId);
                                                            Function2<Composer, Integer, Unit> function236 = function235;
                                                            composer4.startReplaceableGroup(733328855);
                                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
                                                            composer4.startReplaceableGroup(-1323940314);
                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor = companion22.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierLayoutId);
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
                                                            function236.invoke(composer4, 0);
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
                                                }), composableLambda5, paddingValues, composer3, ((i18 << 27) & 1879048192) | 6, 6);
                                                composer3.endReplaceableGroup();
                                            } else if (i19 == 2) {
                                                composer3.startReplaceableGroup(404043576);
                                                composer3.startReplaceableGroup(404043645);
                                                Object objRememberedValue2 = composer3.rememberedValue();
                                                Composer.Companion companion22 = Composer.INSTANCE;
                                                if (objRememberedValue2 == companion22.getEmpty()) {
                                                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m11156boximpl(Size.INSTANCE.m11177getZeroNHjbRc()), null, 2, null);
                                                    composer3.updateRememberedValue(objRememberedValue2);
                                                }
                                                final MutableState<Size> mutableState = (MutableState) objRememberedValue2;
                                                composer3.endReplaceableGroup();
                                                final PaddingValues paddingValues2 = paddingValues;
                                                final Function2<? super Composer, ? super Integer, Unit> function236 = function29;
                                                ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composer3, 1902535592, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
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
                                                    public final void invoke(@Nullable Composer composer4, int i20) {
                                                        if ((i20 & 3) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1902535592, i20, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:224)");
                                                            }
                                                            Modifier modifierM9636outlineCutout12SF9DM = OutlinedTextFieldKt.m9636outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.ContainerId), mutableState.getValue().getPackedValue(), paddingValues2);
                                                            Function2<Composer, Integer, Unit> function237 = function236;
                                                            composer4.startReplaceableGroup(733328855);
                                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
                                                            composer4.startReplaceableGroup(-1323940314);
                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM9636outlineCutout12SF9DM);
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
                                                            function237.invoke(composer4, 0);
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
                                                Function2<Composer, Integer, Unit> function237 = function2;
                                                boolean z19 = z162;
                                                composer3.startReplaceableGroup(404044653);
                                                boolean z20 = (i18 & 14) == 4;
                                                Object objRememberedValue3 = composer3.rememberedValue();
                                                if (z20 || objRememberedValue3 == companion22.getEmpty()) {
                                                    objRememberedValue3 = new Function1<Size, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                                            m10016invokeuvyYCjk(size.getPackedValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                                        public final void m10016invokeuvyYCjk(long j5) {
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
                                                OutlinedTextFieldKt.OutlinedTextFieldLayout(companion3, function237, composableLambda2, composableLambda, composableLambda6, composableLambda7, composableLambda3, composableLambda4, z19, f, (Function1) objRememberedValue3, composableLambda8, composableLambda5, paddingValues, composer3, ((i18 << 27) & 1879048192) | 6, 48);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(404045277);
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
                                z6 = z152;
                                function210 = function221;
                                function211 = function216;
                                function212 = function217;
                                function213 = function218;
                                function214 = function219;
                                function215 = function220;
                                z7 = z9;
                                z8 = z142;
                            } else {
                                TextFieldTransitionScope textFieldTransitionScope22 = TextFieldTransitionScope.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(-646388325);
                                jM13195getColor0d7_KjU = materialTheme2.getTypography(composerStartRestartGroup, 6).getBodySmall().m13195getColor0d7_KjU();
                                composerStartRestartGroup.startReplaceableGroup(-646388264);
                                if (z5) {
                                }
                                long j32 = jM13195getColor0d7_KjU;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(-646388132);
                                jM13195getColor0d7_KjU2 = materialTheme2.getTypography(composerStartRestartGroup, 6).getBodyLarge().m13195getColor0d7_KjU();
                                composerStartRestartGroup.startReplaceableGroup(-646388071);
                                if (z5) {
                                }
                                long j222 = jM13195getColor0d7_KjU2;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                final boolean z1222 = z10;
                                final boolean z1322 = z11;
                                final Function2<? super Composer, ? super Integer, Unit> function22222 = function216;
                                boolean z1422 = z10;
                                final Function2<? super Composer, ? super Integer, Unit> function22322 = function219;
                                composer2 = composerStartRestartGroup;
                                final Function2<? super Composer, ? super Integer, Unit> function22422 = function220;
                                boolean z1522 = z11;
                                final Function2<? super Composer, ? super Integer, Unit> function22522 = function217;
                                final Function2<? super Composer, ? super Integer, Unit> function22622 = function218;
                                final Function2<? super Composer, ? super Integer, Unit> function22722 = function221;
                                final boolean z1622 = z9;
                                textFieldTransitionScope22.m10022TransitionDTcfvLk(inputPhase2, j32, j222, function3, function22 != null, ComposableLambdaKt.composableLambda(composer2, 1290853831, true, new Function7<Float, Color, Color, Float, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt.CommonDecorationBox.3

                                    /* compiled from: TextFieldImpl.kt */
                                    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                    /* renamed from: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$WhenMappings */
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
                                        super(7);
                                    }

                                    @Override // kotlin.jvm.functions.Function7
                                    public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Float f3, Composer composer3, Integer num) {
                                        m10015invokeeopBjH0(f.floatValue(), color.m11350unboximpl(), color2.m11350unboximpl(), f2.floatValue(), f3.floatValue(), composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    /* renamed from: invoke-eopBjH0, reason: not valid java name */
                                    public final void m10015invokeeopBjH0(final float f, final long j322, final long j4, final float f2, final float f3, @Nullable Composer composer3, int i16) {
                                        int i17;
                                        boolean z17;
                                        ComposableLambda composableLambda;
                                        ComposableLambda composableLambda2;
                                        ComposableLambda composableLambda3;
                                        ComposableLambda composableLambda4;
                                        ComposableLambda composableLambda5;
                                        if ((i16 & 6) == 0) {
                                            i17 = (composer3.changed(f) ? 4 : 2) | i16;
                                        } else {
                                            i17 = i16;
                                        }
                                        if ((i16 & 48) == 0) {
                                            i17 |= composer3.changed(j322) ? 32 : 16;
                                        }
                                        if ((i16 & 384) == 0) {
                                            i17 |= composer3.changed(j4) ? 256 : 128;
                                        }
                                        if ((i16 & 3072) == 0) {
                                            i17 |= composer3.changed(f2) ? 2048 : 1024;
                                        }
                                        if ((i16 & CpioConstants.C_ISBLK) == 0) {
                                            i17 |= composer3.changed(f3) ? 16384 : 8192;
                                        }
                                        int i18 = i17;
                                        if ((74899 & i18) != 74898 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1290853831, i18, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:115)");
                                            }
                                            final Function2<? super Composer, ? super Integer, Unit> function228 = function22;
                                            if (function228 != null) {
                                                final boolean z18 = z5;
                                                z17 = true;
                                                composableLambda = ComposableLambdaKt.composableLambda(composer3, -382297919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
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
                                                    public final void invoke(@Nullable Composer composer4, int i19) {
                                                        TextStyle textStyleM13191copyp1EtxEg;
                                                        if ((i19 & 3) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-382297919, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:117)");
                                                            }
                                                            MaterialTheme materialTheme22 = MaterialTheme.INSTANCE;
                                                            TextStyle textStyleLerp = TextStyleKt.lerp(materialTheme22.getTypography(composer4, 6).getBodyLarge(), materialTheme22.getTypography(composer4, 6).getBodySmall(), f);
                                                            boolean z19 = z18;
                                                            long j5 = j322;
                                                            if (z19) {
                                                                textStyleM13191copyp1EtxEg = textStyleLerp.m13191copyp1EtxEg((15695871 & 1) != 0 ? textStyleLerp.spanStyle.m13124getColor0d7_KjU() : j5, (15695871 & 2) != 0 ? textStyleLerp.spanStyle.getFontSize() : 0L, (15695871 & 4) != 0 ? textStyleLerp.spanStyle.getFontWeight() : null, (15695871 & 8) != 0 ? textStyleLerp.spanStyle.getFontStyle() : null, (15695871 & 16) != 0 ? textStyleLerp.spanStyle.getFontSynthesis() : null, (15695871 & 32) != 0 ? textStyleLerp.spanStyle.getFontFamily() : null, (15695871 & 64) != 0 ? textStyleLerp.spanStyle.getFontFeatureSettings() : null, (15695871 & 128) != 0 ? textStyleLerp.spanStyle.getLetterSpacing() : 0L, (15695871 & 256) != 0 ? textStyleLerp.spanStyle.getBaselineShift() : null, (15695871 & 512) != 0 ? textStyleLerp.spanStyle.getTextGeometricTransform() : null, (15695871 & 1024) != 0 ? textStyleLerp.spanStyle.getLocaleList() : null, (15695871 & 2048) != 0 ? textStyleLerp.spanStyle.getBackground() : 0L, (15695871 & 4096) != 0 ? textStyleLerp.spanStyle.getTextDecoration() : null, (15695871 & 8192) != 0 ? textStyleLerp.spanStyle.getShadow() : null, (15695871 & 16384) != 0 ? textStyleLerp.spanStyle.getDrawStyle() : null, (15695871 & 32768) != 0 ? textStyleLerp.paragraphStyle.getTextAlign() : 0, (15695871 & 65536) != 0 ? textStyleLerp.paragraphStyle.getTextDirection() : 0, (15695871 & 131072) != 0 ? textStyleLerp.paragraphStyle.getLineHeight() : 0L, (15695871 & 262144) != 0 ? textStyleLerp.paragraphStyle.getTextIndent() : null, (15695871 & 524288) != 0 ? textStyleLerp.platformStyle : null, (15695871 & 1048576) != 0 ? textStyleLerp.paragraphStyle.getLineHeightStyle() : null, (15695871 & 2097152) != 0 ? textStyleLerp.paragraphStyle.getLineBreak() : 0, (15695871 & 4194304) != 0 ? textStyleLerp.paragraphStyle.getHyphens() : 0, (15695871 & 8388608) != 0 ? textStyleLerp.paragraphStyle.getTextMotion() : null);
                                                            } else {
                                                                textStyleM13191copyp1EtxEg = textStyleLerp;
                                                            }
                                                            TextFieldImplKt.m10014DecorationKTwxG1Y(j4, textStyleM13191copyp1EtxEg, function228, composer4, 0, 0);
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
                                                z17 = true;
                                                composableLambda = null;
                                            }
                                            final long jM11350unboximpl = textFieldColors.placeholderColor$material3_release(z1222, z1322, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                            if (function22222 == null || text2.length() != 0 || f2 <= 0.0f) {
                                                composableLambda2 = null;
                                            } else {
                                                final Function2<? super Composer, ? super Integer, Unit> function229 = function22222;
                                                composableLambda2 = ComposableLambdaKt.composableLambda(composer3, -524658155, z17, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
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
                                                    public final void invoke(@NotNull Modifier modifier, @Nullable Composer composer4, int i19) {
                                                        if ((i19 & 6) == 0) {
                                                            i19 |= composer4.changed(modifier) ? 4 : 2;
                                                        }
                                                        if ((i19 & 19) != 18 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-524658155, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:135)");
                                                            }
                                                            Modifier modifierAlpha = AlphaKt.alpha(modifier, f2);
                                                            long j5 = jM11350unboximpl;
                                                            Function2<Composer, Integer, Unit> function230 = function229;
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
                                                            TextFieldImplKt.m10014DecorationKTwxG1Y(j5, MaterialTheme.INSTANCE.getTypography(composer4, 6).getBodyLarge(), function230, composer4, 0, 0);
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
                                            final long jM11350unboximpl2 = textFieldColors.prefixColor$material3_release(z1222, z1322, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                            final Function2<? super Composer, ? super Integer, Unit> function230 = function22322;
                                            if (function230 == null || f3 <= 0.0f) {
                                                composableLambda3 = null;
                                            } else {
                                                final TextStyle textStyle = bodyLarge2;
                                                composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 1824482619, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1
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
                                                    public final void invoke(@Nullable Composer composer4, int i19) {
                                                        if ((i19 & 3) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1824482619, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:149)");
                                                            }
                                                            Modifier modifierAlpha = AlphaKt.alpha(Modifier.INSTANCE, f3);
                                                            long j5 = jM11350unboximpl2;
                                                            TextStyle textStyle2 = textStyle;
                                                            Function2<Composer, Integer, Unit> function231 = function230;
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
                                                            TextFieldImplKt.m10014DecorationKTwxG1Y(j5, textStyle2, function231, composer4, 0, 0);
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
                                            final long jM11350unboximpl3 = textFieldColors.suffixColor$material3_release(z1222, z1322, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                            final Function2<? super Composer, ? super Integer, Unit> function231 = function22422;
                                            if (function231 == null || f3 <= 0.0f) {
                                                composableLambda4 = null;
                                            } else {
                                                final TextStyle textStyle2 = bodyLarge2;
                                                composableLambda4 = ComposableLambdaKt.composableLambda(composer3, 907456412, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1
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
                                                    public final void invoke(@Nullable Composer composer4, int i19) {
                                                        if ((i19 & 3) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(907456412, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:163)");
                                                            }
                                                            Modifier modifierAlpha = AlphaKt.alpha(Modifier.INSTANCE, f3);
                                                            long j5 = jM11350unboximpl3;
                                                            TextStyle textStyle3 = textStyle2;
                                                            Function2<Composer, Integer, Unit> function232 = function231;
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
                                                            TextFieldImplKt.m10014DecorationKTwxG1Y(j5, textStyle3, function232, composer4, 0, 0);
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
                                            final long jM11350unboximpl4 = textFieldColors.leadingIconColor$material3_release(z1222, z1322, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                            final Function2<? super Composer, ? super Integer, Unit> function232 = function22522;
                                            ComposableLambda composableLambda6 = function232 != null ? ComposableLambdaKt.composableLambda(composer3, 90769583, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
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
                                                public final void invoke(@Nullable Composer composer4, int i19) {
                                                    if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(90769583, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:176)");
                                                    }
                                                    TextFieldImplKt.m10014DecorationKTwxG1Y(jM11350unboximpl4, null, function232, composer4, 0, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }) : null;
                                            final long jM11350unboximpl5 = textFieldColors.trailingIconColor$material3_release(z1222, z1322, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                            final Function2<? super Composer, ? super Integer, Unit> function233 = function22622;
                                            ComposableLambda composableLambda7 = function233 != null ? ComposableLambdaKt.composableLambda(composer3, 2077796155, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
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
                                                public final void invoke(@Nullable Composer composer4, int i19) {
                                                    if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(2077796155, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:183)");
                                                    }
                                                    TextFieldImplKt.m10014DecorationKTwxG1Y(jM11350unboximpl5, null, function233, composer4, 0, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }) : null;
                                            final long jM11350unboximpl6 = textFieldColors.supportingTextColor$material3_release(z1222, z1322, interactionSource, composer3, 0).getValue().m11350unboximpl();
                                            final Function2<? super Composer, ? super Integer, Unit> function234 = function22722;
                                            if (function234 != null) {
                                                final TextStyle textStyle3 = bodySmall2;
                                                composableLambda5 = ComposableLambdaKt.composableLambda(composer3, -1531019900, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
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
                                                    public final void invoke(@Nullable Composer composer4, int i19) {
                                                        if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1531019900, i19, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:191)");
                                                        }
                                                        TextFieldImplKt.m10014DecorationKTwxG1Y(jM11350unboximpl6, textStyle3, function234, composer4, 0, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                });
                                            } else {
                                                composableLambda5 = null;
                                            }
                                            int i19 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                            if (i19 == z17) {
                                                composer3.startReplaceableGroup(404042583);
                                                final Function2<? super Composer, ? super Integer, Unit> function235 = function29;
                                                TextFieldKt.TextFieldLayout(Modifier.INSTANCE, function2, composableLambda, composableLambda2, composableLambda6, composableLambda7, composableLambda3, composableLambda4, z1622, f, ComposableLambdaKt.composableLambda(composer3, -2124779163, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
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
                                                    public final void invoke(@Nullable Composer composer4, int i20) {
                                                        if ((i20 & 3) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-2124779163, i20, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:198)");
                                                            }
                                                            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.ContainerId);
                                                            Function2<Composer, Integer, Unit> function236 = function235;
                                                            composer4.startReplaceableGroup(733328855);
                                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
                                                            composer4.startReplaceableGroup(-1323940314);
                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor = companion22.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierLayoutId);
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
                                                            function236.invoke(composer4, 0);
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
                                                }), composableLambda5, paddingValues, composer3, ((i18 << 27) & 1879048192) | 6, 6);
                                                composer3.endReplaceableGroup();
                                            } else if (i19 == 2) {
                                                composer3.startReplaceableGroup(404043576);
                                                composer3.startReplaceableGroup(404043645);
                                                Object objRememberedValue2 = composer3.rememberedValue();
                                                Composer.Companion companion22 = Composer.INSTANCE;
                                                if (objRememberedValue2 == companion22.getEmpty()) {
                                                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m11156boximpl(Size.INSTANCE.m11177getZeroNHjbRc()), null, 2, null);
                                                    composer3.updateRememberedValue(objRememberedValue2);
                                                }
                                                final MutableState<Size> mutableState = (MutableState) objRememberedValue2;
                                                composer3.endReplaceableGroup();
                                                final PaddingValues paddingValues2 = paddingValues;
                                                final Function2<? super Composer, ? super Integer, Unit> function236 = function29;
                                                ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composer3, 1902535592, z17, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
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
                                                    public final void invoke(@Nullable Composer composer4, int i20) {
                                                        if ((i20 & 3) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1902535592, i20, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:224)");
                                                            }
                                                            Modifier modifierM9636outlineCutout12SF9DM = OutlinedTextFieldKt.m9636outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.ContainerId), mutableState.getValue().getPackedValue(), paddingValues2);
                                                            Function2<Composer, Integer, Unit> function237 = function236;
                                                            composer4.startReplaceableGroup(733328855);
                                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
                                                            composer4.startReplaceableGroup(-1323940314);
                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM9636outlineCutout12SF9DM);
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
                                                            function237.invoke(composer4, 0);
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
                                                Function2<Composer, Integer, Unit> function237 = function2;
                                                boolean z19 = z1622;
                                                composer3.startReplaceableGroup(404044653);
                                                boolean z20 = (i18 & 14) == 4;
                                                Object objRememberedValue3 = composer3.rememberedValue();
                                                if (z20 || objRememberedValue3 == companion22.getEmpty()) {
                                                    objRememberedValue3 = new Function1<Size, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                                            m10016invokeuvyYCjk(size.getPackedValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                                        public final void m10016invokeuvyYCjk(long j5) {
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
                                                OutlinedTextFieldKt.OutlinedTextFieldLayout(companion3, function237, composableLambda2, composableLambda, composableLambda6, composableLambda7, composableLambda3, composableLambda4, z19, f, (Function1) objRememberedValue3, composableLambda8, composableLambda5, paddingValues, composer3, ((i18 << 27) & 1879048192) | 6, 48);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(404045277);
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
                                z6 = z1522;
                                function210 = function221;
                                function211 = function216;
                                function212 = function217;
                                function213 = function218;
                                function214 = function219;
                                function215 = function220;
                                z7 = z9;
                                z8 = z1422;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 16384) == 0) {
                }
                if ((32768 & i3) != 0) {
                }
                if ((i3 & 65536) != 0) {
                }
                if ((i3 & 131072) != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i14 = i3 & 8192;
            if (i14 != 0) {
            }
            if ((i3 & 16384) == 0) {
            }
            if ((32768 & i3) != 0) {
            }
            if ((i3 & 65536) != 0) {
            }
            if ((i3 & 131072) != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
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
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        int i152 = i11;
        i13 = i3 & 4096;
        if (i13 == 0) {
        }
        i14 = i3 & 8192;
        if (i14 != 0) {
        }
        if ((i3 & 16384) == 0) {
        }
        if ((32768 & i3) != 0) {
        }
        if ((i3 & 65536) != 0) {
        }
        if ((i3 & 131072) != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: Decoration-KTwxG1Y, reason: not valid java name */
    public static final void m10014DecorationKTwxG1Y(final long j, @Nullable TextStyle textStyle, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1520066345);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                textStyle = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520066345, i3, -1, "androidx.compose.material3.Decoration (TextFieldImpl.kt:271)");
            }
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1449369305, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$Decoration$contentWithColor$1
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
                public final void invoke(@Nullable Composer composer2, int i5) {
                    if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1449369305, i5, -1, "androidx.compose.material3.Decoration.<anonymous> (TextFieldImpl.kt:273)");
                        }
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(j)), function2, composer2, ProvidedValue.$stable);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            });
            if (textStyle != null) {
                composerStartRestartGroup.startReplaceableGroup(1830467586);
                ProvideContentColorTextStyleKt.m9663ProvideContentColorTextStyle3JVO9M(j, textStyle, function2, composerStartRestartGroup, i3 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(1830467667);
                composableLambda.invoke(composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final TextStyle textStyle2 = textStyle;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$Decoration$1
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

                public final void invoke(@Nullable Composer composer2, int i5) {
                    TextFieldImplKt.m10014DecorationKTwxG1Y(j, textStyle2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @NotNull
    public static final Modifier defaultErrorSemantics(@NotNull Modifier modifier, boolean z, @NotNull final String str) {
        return z ? SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt.defaultErrorSemantics.1
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
        float f = 16;
        TextFieldPadding = C2046Dp.m13666constructorimpl(f);
        MinFocusedLabelLineHeight = C2046Dp.m13666constructorimpl(f);
        MinSupportingTextLineHeight = C2046Dp.m13666constructorimpl(f);
        float f2 = 48;
        IconDefaultSizeModifier = androidx.compose.foundation.layout.SizeKt.m8156defaultMinSizeVpY3zN4(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(f2), C2046Dp.m13666constructorimpl(f2));
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

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getPrefixSuffixTextPadding() {
        return PrefixSuffixTextPadding;
    }

    public static final float getMinTextLineHeight() {
        return MinTextLineHeight;
    }

    public static final float getMinFocusedLabelLineHeight() {
        return MinFocusedLabelLineHeight;
    }

    public static final float getMinSupportingTextLineHeight() {
        return MinSupportingTextLineHeight;
    }

    @NotNull
    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }
}
