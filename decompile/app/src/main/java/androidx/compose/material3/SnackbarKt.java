package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Snackbar.kt */
@Metadata(m7104d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001ae\u0010\n\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001ag\u0010\u0018\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017\u001aj\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00142\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0099\u0001\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020 2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00142\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, m7105d2 = {"ContainerMaxWidth", "Landroidx/compose/ui/unit/Dp;", "F", "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "LongButtonVerticalOffset", "SeparateButtonExtraY", "SnackbarVerticalPadding", "TextEndExtraSpacing", "NewLineButtonSnackbar", "", "text", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "action", "dismissAction", "actionTextStyle", "Landroidx/compose/ui/text/TextStyle;", "actionContentColor", "Landroidx/compose/ui/graphics/Color;", "dismissActionContentColor", "NewLineButtonSnackbar-kKq0p4A", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V", "OneRowSnackbar", "actionTextColor", "dismissActionColor", "OneRowSnackbar-kKq0p4A", "Snackbar", "snackbarData", "Landroidx/compose/material3/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", "actionOnNewLine", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "contentColor", "actionColor", "Snackbar-sDKtq54", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJJJLandroidx/compose/runtime/Composer;II)V", "content", "Snackbar-eQBnUkQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,437:1\n154#2:438\n154#2:514\n154#2:601\n154#2:760\n154#2:761\n154#2:762\n154#2:763\n154#2:764\n154#2:765\n154#2:766\n154#2:767\n74#3,6:439\n80#3:473\n84#3:600\n78#4,11:445\n78#4,11:480\n91#4:512\n78#4,11:521\n78#4,11:557\n91#4:589\n91#4:594\n91#4:599\n78#4,11:608\n78#4,11:642\n91#4:674\n78#4,11:682\n91#4:714\n78#4,11:722\n91#4:754\n91#4:759\n456#5,8:456\n464#5,3:470\n456#5,8:491\n464#5,3:505\n467#5,3:509\n456#5,8:532\n464#5,3:546\n456#5,8:568\n464#5,3:582\n467#5,3:586\n467#5,3:591\n467#5,3:596\n456#5,8:619\n464#5,3:633\n456#5,8:653\n464#5,3:667\n467#5,3:671\n456#5,8:693\n464#5,3:707\n467#5,3:711\n456#5,8:733\n464#5,3:747\n467#5,3:751\n467#5,3:756\n3737#6,6:464\n3737#6,6:499\n3737#6,6:540\n3737#6,6:576\n3737#6,6:627\n3737#6,6:661\n3737#6,6:701\n3737#6,6:741\n68#7,6:474\n74#7:508\n78#7:513\n68#7,6:515\n74#7:549\n78#7:595\n68#7,6:636\n74#7:670\n78#7:675\n68#7,6:676\n74#7:710\n78#7:715\n68#7,6:716\n74#7:750\n78#7:755\n86#8,7:550\n93#8:585\n97#8:590\n1116#9,6:602\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n*L\n240#1:438\n279#1:514\n333#1:601\n429#1:760\n430#1:761\n431#1:762\n432#1:763\n433#1:764\n434#1:765\n435#1:766\n436#1:767\n262#1:439,6\n262#1:473\n262#1:600\n262#1:445,11\n272#1:480,11\n272#1:512\n277#1:521,11\n281#1:557,11\n281#1:589\n277#1:594\n262#1:599\n310#1:608,11\n312#1:642,11\n312#1:674\n314#1:682,11\n314#1:714\n323#1:722,11\n323#1:754\n310#1:759\n262#1:456,8\n262#1:470,3\n272#1:491,8\n272#1:505,3\n272#1:509,3\n277#1:532,8\n277#1:546,3\n281#1:568,8\n281#1:582,3\n281#1:586,3\n277#1:591,3\n262#1:596,3\n310#1:619,8\n310#1:633,3\n312#1:653,8\n312#1:667,3\n312#1:671,3\n314#1:693,8\n314#1:707,3\n314#1:711,3\n323#1:733,8\n323#1:747,3\n323#1:751,3\n310#1:756,3\n262#1:464,6\n272#1:499,6\n277#1:540,6\n281#1:576,6\n310#1:627,6\n312#1:661,6\n314#1:701,6\n323#1:741,6\n272#1:474,6\n272#1:508\n272#1:513\n277#1:515,6\n277#1:549\n277#1:595\n312#1:636,6\n312#1:670\n312#1:675\n314#1:676,6\n314#1:710\n314#1:715\n323#1:716,6\n323#1:750\n323#1:755\n281#1:550,7\n281#1:585\n281#1:590\n335#1:602,6\n*E\n"})
/* loaded from: classes2.dex */
public final class SnackbarKt {
    private static final float HorizontalSpacingButtonSide;
    private static final float TextEndExtraSpacing;
    private static final float ContainerMaxWidth = C2046Dp.m13666constructorimpl(600);
    private static final float HeightToFirstLine = C2046Dp.m13666constructorimpl(30);
    private static final float HorizontalSpacing = C2046Dp.m13666constructorimpl(16);
    private static final float SeparateButtonExtraY = C2046Dp.m13666constructorimpl(2);
    private static final float SnackbarVerticalPadding = C2046Dp.m13666constructorimpl(6);
    private static final float LongButtonVerticalOffset = C2046Dp.m13666constructorimpl(12);

    /* JADX WARN: Removed duplicated region for block: B:100:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0103  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Snackbar-eQBnUkQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9792SnackbareQBnUkQ(@Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, boolean z, @Nullable Shape shape, long j, long j2, long j3, long j4, @NotNull final Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i5;
        long color;
        long dismissActionContentColor;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function26;
        boolean z2;
        Shape shape2;
        long contentColor;
        long actionContentColor;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        long j5;
        final long j6;
        final long j7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1235788955);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function24 = function2;
                i3 |= composerStartRestartGroup.changedInstance(function24) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function25 = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function25) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                    }
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        i3 |= ((i2 & 16) == 0 && composerStartRestartGroup.changed(shape)) ? 16384 : 8192;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            color = j;
                            int i8 = composerStartRestartGroup.changed(color) ? 131072 : 65536;
                            i3 |= i8;
                        } else {
                            color = j;
                        }
                        i3 |= i8;
                    } else {
                        color = j;
                    }
                    if ((i & 1572864) == 0) {
                        i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(j2)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(j3)) ? 8388608 : 4194304;
                    }
                    if ((100663296 & i) != 0) {
                        dismissActionContentColor = j4;
                        i3 |= ((i2 & 256) == 0 && composerStartRestartGroup.changed(dismissActionContentColor)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    } else {
                        dismissActionContentColor = j4;
                    }
                    if ((i2 & 512) != 0) {
                        if ((i & 805306368) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
                        }
                        if ((i3 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i6 == 0 ? Modifier.INSTANCE : modifier;
                                if (i7 != 0) {
                                    function24 = null;
                                }
                                function26 = i4 == 0 ? function25 : null;
                                z2 = i5 == 0 ? false : z;
                                if ((i2 & 16) == 0) {
                                    shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                    i3 &= -57345;
                                } else {
                                    shape2 = shape;
                                }
                                if ((i2 & 32) != 0) {
                                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) == 0) {
                                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    contentColor = j2;
                                }
                                if ((i2 & 128) == 0) {
                                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    actionContentColor = j3;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                                }
                            } else {
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
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                modifier2 = modifier;
                                z2 = z;
                                shape2 = shape;
                                contentColor = j2;
                                actionContentColor = j3;
                                function26 = function25;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                            }
                            final Function2<? super Composer, ? super Integer, Unit> function28 = function24;
                            final Function2<? super Composer, ? super Integer, Unit> function29 = function26;
                            final long j8 = actionContentColor;
                            final long j9 = dismissActionContentColor;
                            final boolean z4 = z2;
                            Function2<? super Composer, ? super Integer, Unit> function210 = function26;
                            int i9 = (i3 & 14) | 12779520;
                            int i10 = i3 >> 9;
                            SurfaceKt.m9876SurfaceT9BRK9s(modifier2, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m10696getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
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
                                public final void invoke(@Nullable Composer composer2, int i11) {
                                    if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1829663446, i11, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                        }
                                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                        Typography typography = materialTheme.getTypography(composer2, 6);
                                        SnackbarTokens snackbarTokens = SnackbarTokens.INSTANCE;
                                        TextStyle textStyleFromToken = TypographyKt.fromToken(typography, snackbarTokens.getSupportingTextFont());
                                        final TextStyle textStyleFromToken2 = TypographyKt.fromToken(materialTheme.getTypography(composer2, 6), snackbarTokens.getActionLabelTextFont());
                                        ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                        final Function2<Composer, Integer, Unit> function211 = function28;
                                        final Function2<Composer, Integer, Unit> function212 = function23;
                                        final Function2<Composer, Integer, Unit> function213 = function29;
                                        final long j10 = j8;
                                        final long j11 = j9;
                                        final boolean z5 = z4;
                                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
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

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i12) {
                                                if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(835891690, i12, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                                    }
                                                    if (function211 == null) {
                                                        composer3.startReplaceableGroup(-2104362406);
                                                        SnackbarKt.m9791OneRowSnackbarkKq0p4A(function212, null, function213, textStyleFromToken2, j10, j11, composer3, 48);
                                                        composer3.endReplaceableGroup();
                                                    } else if (z5) {
                                                        composer3.startReplaceableGroup(-2104362092);
                                                        SnackbarKt.m9790NewLineButtonSnackbarkKq0p4A(function212, function211, function213, textStyleFromToken2, j10, j11, composer3, 0);
                                                        composer3.endReplaceableGroup();
                                                    } else {
                                                        composer3.startReplaceableGroup(-2104361812);
                                                        SnackbarKt.m9791OneRowSnackbarkKq0p4A(function212, function211, function213, textStyleFromToken2, j10, j11, composer3, 0);
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
                            }), composerStartRestartGroup, (i10 & 7168) | i9 | (i10 & 112) | (i10 & 896), 80);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function27 = function210;
                            modifier3 = modifier2;
                            z3 = z2;
                            shape3 = shape2;
                            j5 = dismissActionContentColor;
                            j6 = contentColor;
                            j7 = actionContentColor;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z3 = z;
                            shape3 = shape;
                            function27 = function25;
                            j5 = dismissActionContentColor;
                            j6 = j2;
                            j7 = j3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier3;
                            final Function2<? super Composer, ? super Integer, Unit> function211 = function24;
                            final long j10 = color;
                            final long j11 = j5;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                                public final void invoke(@Nullable Composer composer2, int i11) {
                                    SnackbarKt.m9792SnackbareQBnUkQ(modifier4, function211, function27, z3, shape3, j10, j6, j7, j11, function23, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 805306368;
                    if ((i3 & 306783379) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i6 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if ((i2 & 16) == 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if ((i2 & 64) == 0) {
                            }
                            if ((i2 & 128) == 0) {
                            }
                            if ((i2 & 256) != 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final Function2<? super Composer, ? super Integer, Unit> function282 = function24;
                            final Function2<? super Composer, ? super Integer, Unit> function292 = function26;
                            final long j82 = actionContentColor;
                            final long j92 = dismissActionContentColor;
                            final boolean z42 = z2;
                            Function2<? super Composer, ? super Integer, Unit> function2102 = function26;
                            int i92 = (i3 & 14) | 12779520;
                            int i102 = i3 >> 9;
                            SurfaceKt.m9876SurfaceT9BRK9s(modifier2, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m10696getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
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
                                public final void invoke(@Nullable Composer composer2, int i11) {
                                    if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1829663446, i11, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                        }
                                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                        Typography typography = materialTheme.getTypography(composer2, 6);
                                        SnackbarTokens snackbarTokens = SnackbarTokens.INSTANCE;
                                        TextStyle textStyleFromToken = TypographyKt.fromToken(typography, snackbarTokens.getSupportingTextFont());
                                        final TextStyle textStyleFromToken2 = TypographyKt.fromToken(materialTheme.getTypography(composer2, 6), snackbarTokens.getActionLabelTextFont());
                                        ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                        final Function2<? super Composer, ? super Integer, Unit> function2112 = function282;
                                        final Function2<? super Composer, ? super Integer, Unit> function212 = function23;
                                        final Function2<? super Composer, ? super Integer, Unit> function213 = function292;
                                        final long j102 = j82;
                                        final long j112 = j92;
                                        final boolean z5 = z42;
                                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
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

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i12) {
                                                if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(835891690, i12, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                                    }
                                                    if (function2112 == null) {
                                                        composer3.startReplaceableGroup(-2104362406);
                                                        SnackbarKt.m9791OneRowSnackbarkKq0p4A(function212, null, function213, textStyleFromToken2, j102, j112, composer3, 48);
                                                        composer3.endReplaceableGroup();
                                                    } else if (z5) {
                                                        composer3.startReplaceableGroup(-2104362092);
                                                        SnackbarKt.m9790NewLineButtonSnackbarkKq0p4A(function212, function2112, function213, textStyleFromToken2, j102, j112, composer3, 0);
                                                        composer3.endReplaceableGroup();
                                                    } else {
                                                        composer3.startReplaceableGroup(-2104361812);
                                                        SnackbarKt.m9791OneRowSnackbarkKq0p4A(function212, function2112, function213, textStyleFromToken2, j102, j112, composer3, 0);
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
                            }), composerStartRestartGroup, (i102 & 7168) | i92 | (i102 & 112) | (i102 & 896), 80);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function27 = function2102;
                            modifier3 = modifier2;
                            z3 = z2;
                            shape3 = shape2;
                            j5 = dismissActionContentColor;
                            j6 = contentColor;
                            j7 = actionContentColor;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                }
                if ((196608 & i) != 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((100663296 & i) != 0) {
                }
                if ((i2 & 512) != 0) {
                }
                if ((i3 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function25 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((i & CpioConstants.C_ISBLK) == 0) {
            }
            if ((196608 & i) != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((100663296 & i) != 0) {
            }
            if ((i2 & 512) != 0) {
            }
            if ((i3 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function24 = function2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function25 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((100663296 & i) != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        if ((i3 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00fc  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Snackbar-sDKtq54, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9793SnackbarsDKtq54(@NotNull final SnackbarData snackbarData, @Nullable Modifier modifier, boolean z, @Nullable Shape shape, long j, long j2, long j3, long j4, long j5, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        long j6;
        long j7;
        Modifier modifier3;
        boolean z3;
        Shape shape3;
        long color;
        long contentColor;
        final long actionColor;
        long actionContentColor;
        long dismissActionContentColor;
        long j8;
        final String actionLabel;
        final SnackbarData snackbarData2;
        long j9;
        boolean z4;
        ComposableLambda composableLambda;
        long j10;
        final boolean z5;
        final Shape shape4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(274621471);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(snackbarData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        int i6 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i3 |= i6;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i6;
                } else {
                    shape2 = shape;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        j6 = j;
                        int i7 = composerStartRestartGroup.changed(j6) ? 16384 : 8192;
                        i3 |= i7;
                    } else {
                        j6 = j;
                    }
                    i3 |= i7;
                } else {
                    j6 = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j7 = j2;
                        int i8 = composerStartRestartGroup.changed(j7) ? 131072 : 65536;
                        i3 |= i8;
                    } else {
                        j7 = j2;
                    }
                    i3 |= i8;
                } else {
                    j7 = j2;
                }
                if ((1572864 & i) == 0) {
                    i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(j3)) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(j4)) ? 8388608 : 4194304;
                }
                if ((100663296 & i) == 0) {
                    i3 |= ((i2 & 256) == 0 && composerStartRestartGroup.changed(j5)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        z3 = i4 == 0 ? false : z2;
                        if ((i2 & 8) == 0) {
                            shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -7169;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i2 & 16) == 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            color = j6;
                        }
                        if ((i2 & 32) == 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        } else {
                            contentColor = j7;
                        }
                        if ((i2 & 64) == 0) {
                            actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            actionColor = j3;
                        }
                        if ((i2 & 128) == 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j4;
                        }
                        if ((i2 & 256) == 0) {
                            i3 &= -234881025;
                            j8 = actionContentColor;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        } else {
                            dismissActionContentColor = j5;
                            j8 = actionContentColor;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                        }
                        j8 = j4;
                        dismissActionContentColor = j5;
                        modifier3 = modifier2;
                        z3 = z2;
                        shape3 = shape2;
                        color = j6;
                        contentColor = j7;
                        actionColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(274621471, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:209)");
                    }
                    actionLabel = snackbarData.getVisuals().getActionLabel();
                    if (actionLabel == null) {
                        snackbarData2 = snackbarData;
                        Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            public final void invoke(@Nullable Composer composer2, int i9) {
                                if ((i9 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1378313599, i9, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:213)");
                                    }
                                    ButtonColors buttonColorsM9177textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m9177textButtonColorsro_MJ88(0L, actionColor, 0L, 0L, composer2, CpioConstants.C_ISBLK, 13);
                                    composer2.startReplaceableGroup(-2057496839);
                                    boolean zChanged = composer2.changed(snackbarData2);
                                    final SnackbarData snackbarData3 = snackbarData2;
                                    Object objRememberedValue = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
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
                                                snackbarData3.performAction();
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue;
                                    composer2.endReplaceableGroup();
                                    final String str = actionLabel;
                                    ButtonKt.TextButton(function0, null, false, null, buttonColorsM9177textButtonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.composableLambda(composer2, 521110564, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                            invoke(rowScope, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer3, int i10) {
                                            if ((i10 & 17) == 16 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(521110564, i10, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:216)");
                                            }
                                            TextKt.m10024Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer2, 805306368, 494);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        };
                        j9 = actionColor;
                        z4 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1378313599, true, function2);
                    } else {
                        snackbarData2 = snackbarData;
                        j9 = actionColor;
                        z4 = true;
                        composableLambda = null;
                    }
                    int i9 = i3 << 3;
                    m9792SnackbareQBnUkQ(PaddingKt.m8123padding3ABfNKs(modifier3, C2046Dp.m13666constructorimpl(12)), composableLambda, !snackbarData.getVisuals().getWithDismissAction() ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1812633777, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
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
                        public final void invoke(@Nullable Composer composer2, int i10) {
                            if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1812633777, i10, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:225)");
                                }
                                composer2.startReplaceableGroup(-2057496502);
                                boolean zChanged = composer2.changed(snackbarData2);
                                final SnackbarData snackbarData3 = snackbarData2;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
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
                                            snackbarData3.dismiss();
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$SnackbarKt.INSTANCE.m9334getLambda1$material3_release(), composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 30);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }) : null, z3, shape3, color, contentColor, j8, dismissActionContentColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1266389126, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
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
                        public final void invoke(@Nullable Composer composer2, int i10) {
                            if ((i10 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1266389126, i10, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:248)");
                            }
                            TextKt.m10024Text4IGK_g(snackbarData2.getVisuals().getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 3670016) | (i9 & 7168) | 805306368 | (57344 & i9) | (458752 & i9) | (29360128 & i3) | (i3 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j10 = j9;
                    z5 = z3;
                    shape4 = shape3;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    j8 = j4;
                    dismissActionContentColor = j5;
                    z5 = z2;
                    shape4 = shape2;
                    color = j6;
                    contentColor = j7;
                    j10 = j3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    final long j11 = color;
                    final long j12 = contentColor;
                    final long j13 = j10;
                    final long j14 = j8;
                    final long j15 = dismissActionContentColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$4
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
                            SnackbarKt.m9793SnackbarsDKtq54(snackbarData, modifier4, z5, shape4, j11, j12, j13, j14, j15, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & CpioConstants.C_ISBLK) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((100663296 & i) == 0) {
            }
            if ((38347923 & i3) != 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) == 0) {
                    }
                    if ((i2 & 16) == 0) {
                    }
                    if ((i2 & 32) == 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    if ((i2 & 256) == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    actionLabel = snackbarData.getVisuals().getActionLabel();
                    if (actionLabel == null) {
                    }
                    int i92 = i3 << 3;
                    m9792SnackbareQBnUkQ(PaddingKt.m8123padding3ABfNKs(modifier3, C2046Dp.m13666constructorimpl(12)), composableLambda, !snackbarData.getVisuals().getWithDismissAction() ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1812633777, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
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
                        public final void invoke(@Nullable Composer composer2, int i10) {
                            if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1812633777, i10, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:225)");
                                }
                                composer2.startReplaceableGroup(-2057496502);
                                boolean zChanged = composer2.changed(snackbarData2);
                                final SnackbarData snackbarData3 = snackbarData2;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
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
                                            snackbarData3.dismiss();
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$SnackbarKt.INSTANCE.m9334getLambda1$material3_release(), composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 30);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }) : null, z3, shape3, color, contentColor, j8, dismissActionContentColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1266389126, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
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
                        public final void invoke(@Nullable Composer composer2, int i10) {
                            if ((i10 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1266389126, i10, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:248)");
                            }
                            TextKt.m10024Text4IGK_g(snackbarData2.getVisuals().getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i92 & 3670016) | (i92 & 7168) | 805306368 | (57344 & i92) | (458752 & i92) | (29360128 & i3) | (i3 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    j10 = j9;
                    z5 = z3;
                    shape4 = shape3;
                    modifier2 = modifier3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((100663296 & i) == 0) {
        }
        if ((38347923 & i3) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NewLineButtonSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m9790NewLineButtonSnackbarkKq0p4A(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final TextStyle textStyle, final long j, final long j2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1332496681);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1332496681, i2, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:260)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.m8179widthInVpY3zN4$default(companion, 0.0f, ContainerMaxWidth, 1, null), 0.0f, 1, null), HorizontalSpacing, 0.0f, 0.0f, SeparateButtonExtraY, 6, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM8006paddingFromBaselineVpY3zN4 = AlignmentLineKt.m8006paddingFromBaselineVpY3zN4(companion, HeightToFirstLine, LongButtonVerticalOffset);
            float f = HorizontalSpacingButtonSide;
            Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(modifierM8006paddingFromBaselineVpY3zN4, 0.0f, 0.0f, f, 0.0f, 11, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i2 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM8127paddingqDBjuR0$default3 = PaddingKt.m8127paddingqDBjuR0$default(columnScopeInstance.align(companion, companion2.getEnd()), 0.0f, 0.0f, function23 == null ? f : C2046Dp.m13666constructorimpl(0), 0.0f, 11, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(j)), TextKt.getLocalTextStyle().provides(textStyle)}, function22, composerStartRestartGroup, i2 & 112);
            composerStartRestartGroup.startReplaceableGroup(302367084);
            if (function23 != null) {
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(j2)), function23, composerStartRestartGroup, ((i2 >> 3) & 112) | ProvidedValue.$stable);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$NewLineButtonSnackbar$2
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
                    SnackbarKt.m9790NewLineButtonSnackbarkKq0p4A(function2, function22, function23, textStyle, j, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: OneRowSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m9791OneRowSnackbarkKq0p4A(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final TextStyle textStyle, final long j, final long j2, Composer composer, final int i) {
        int i2;
        float fM13666constructorimpl;
        Composer composerStartRestartGroup = composer.startRestartGroup(-903235475);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903235475, i2, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:305)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = HorizontalSpacing;
            if (function23 == null) {
                fM13666constructorimpl = HorizontalSpacingButtonSide;
            } else {
                fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
            }
            Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion, f, 0.0f, fM13666constructorimpl, 0.0f, 10, null);
            composerStartRestartGroup.startReplaceableGroup(44739392);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            final String str = "text";
            final String str2 = "action";
            final String str3 = "dismissAction";
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1
                    @Override // androidx.compose.p003ui.layout.MeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo7599measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j3) {
                        Measurable measurable;
                        Measurable measurable2;
                        Placeable placeable;
                        final int i3;
                        final int height;
                        int iMax;
                        int iMin = Math.min(Constraints.m13622getMaxWidthimpl(j3), measureScope.mo7868roundToPx0680j_4(SnackbarKt.ContainerMaxWidth));
                        String str4 = str2;
                        int size = list.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size) {
                                measurable = null;
                                break;
                            }
                            measurable = list.get(i4);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), str4)) {
                                break;
                            }
                            i4++;
                        }
                        Measurable measurable3 = measurable;
                        Placeable placeableMo12610measureBRTryo0 = measurable3 != null ? measurable3.mo12610measureBRTryo0(j3) : null;
                        String str5 = str3;
                        int size2 = list.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size2) {
                                measurable2 = null;
                                break;
                            }
                            measurable2 = list.get(i5);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), str5)) {
                                break;
                            }
                            i5++;
                        }
                        Measurable measurable4 = measurable2;
                        final Placeable placeableMo12610measureBRTryo02 = measurable4 != null ? measurable4.mo12610measureBRTryo0(j3) : null;
                        int width = placeableMo12610measureBRTryo0 != null ? placeableMo12610measureBRTryo0.getWidth() : 0;
                        int height2 = placeableMo12610measureBRTryo0 != null ? placeableMo12610measureBRTryo0.getHeight() : 0;
                        int width2 = placeableMo12610measureBRTryo02 != null ? placeableMo12610measureBRTryo02.getWidth() : 0;
                        int height3 = placeableMo12610measureBRTryo02 != null ? placeableMo12610measureBRTryo02.getHeight() : 0;
                        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(((iMin - width) - width2) - (width2 == 0 ? measureScope.mo7868roundToPx0680j_4(SnackbarKt.TextEndExtraSpacing) : 0), Constraints.m13624getMinWidthimpl(j3));
                        String str6 = str;
                        int size3 = list.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            Measurable measurable5 = list.get(i6);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable5), str6)) {
                                Placeable placeable2 = placeableMo12610measureBRTryo0;
                                int i7 = height3;
                                final Placeable placeableMo12610measureBRTryo03 = measurable5.mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j3, 0, iCoerceAtLeast, 0, 0, 9, null));
                                int i8 = placeableMo12610measureBRTryo03.get(androidx.compose.p003ui.layout.AlignmentLineKt.getFirstBaseline());
                                if (i8 == Integer.MIN_VALUE) {
                                    throw new IllegalArgumentException("No baselines for text".toString());
                                }
                                int i9 = placeableMo12610measureBRTryo03.get(androidx.compose.p003ui.layout.AlignmentLineKt.getLastBaseline());
                                if (i9 == Integer.MIN_VALUE) {
                                    throw new IllegalArgumentException("No baselines for text".toString());
                                }
                                boolean z = i8 == i9;
                                final int i10 = iMin - width2;
                                final int i11 = i10 - width;
                                if (!z) {
                                    placeable = placeable2;
                                    int iMo7868roundToPx0680j_4 = measureScope.mo7868roundToPx0680j_4(SnackbarKt.HeightToFirstLine) - i8;
                                    int iMax2 = Math.max(measureScope.mo7868roundToPx0680j_4(SnackbarTokens.INSTANCE.m10699getTwoLinesContainerHeightD9Ej5fM()), placeableMo12610measureBRTryo03.getHeight() + iMo7868roundToPx0680j_4);
                                    i3 = iMo7868roundToPx0680j_4;
                                    height = placeable != null ? (iMax2 - placeable.getHeight()) / 2 : 0;
                                    iMax = iMax2;
                                } else {
                                    iMax = Math.max(measureScope.mo7868roundToPx0680j_4(SnackbarTokens.INSTANCE.m10698getSingleLineContainerHeightD9Ej5fM()), Math.max(height2, i7));
                                    int height4 = (iMax - placeableMo12610measureBRTryo03.getHeight()) / 2;
                                    if (placeable2 != null) {
                                        placeable = placeable2;
                                        int i12 = placeable.get(androidx.compose.p003ui.layout.AlignmentLineKt.getFirstBaseline());
                                        int i13 = i12 != Integer.MIN_VALUE ? (i8 + height4) - i12 : 0;
                                        height = i13;
                                        i3 = height4;
                                    } else {
                                        placeable = placeable2;
                                    }
                                    height = i13;
                                    i3 = height4;
                                }
                                final int height5 = placeableMo12610measureBRTryo02 != null ? (iMax - placeableMo12610measureBRTryo02.getHeight()) / 2 : 0;
                                final Placeable placeable3 = placeable;
                                return MeasureScope.layout$default(measureScope, iMin, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1.4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo03, 0, i3, 0.0f, 4, null);
                                        Placeable placeable4 = placeableMo12610measureBRTryo02;
                                        if (placeable4 != null) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i10, height5, 0.0f, 4, null);
                                        }
                                        Placeable placeable5 = placeable3;
                                        if (placeable5 != null) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i11, height, 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                            i6++;
                            placeableMo12610measureBRTryo0 = placeableMo12610measureBRTryo0;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8125paddingVpY3zN4$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i2 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-167734260);
            if (function22 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "action");
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierLayoutId);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(j)), TextKt.getLocalTextStyle().provides(textStyle)}, function22, composerStartRestartGroup, i2 & 112);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(44738899);
            if (function23 != null) {
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, "dismissAction");
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierLayoutId2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(j2)), function23, composerStartRestartGroup, ((i2 >> 3) & 112) | ProvidedValue.$stable);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$3
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
                    SnackbarKt.m9791OneRowSnackbarkKq0p4A(function2, function22, function23, textStyle, j, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    static {
        float f = 8;
        HorizontalSpacingButtonSide = C2046Dp.m13666constructorimpl(f);
        TextEndExtraSpacing = C2046Dp.m13666constructorimpl(f);
    }
}
