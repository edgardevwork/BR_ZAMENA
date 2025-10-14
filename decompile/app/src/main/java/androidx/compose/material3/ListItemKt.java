package androidx.compose.material3;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ListItemType;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.AlignmentLineKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p003ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.LayoutDirection;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
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

/* compiled from: ListItem.kt */
@Metadata(m7104d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a©\u0001\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010\u001e\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001at\u0010'\u001a\u00020\u00172\u0013\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001a2\u0013\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0013\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001aH\u0003¢\u0006\u0002\u0010-\u001a5\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001aH\u0003ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a`\u00106\u001a\u000207*\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:2\b\u0010<\u001a\u0004\u0018\u00010:2\b\u0010=\u001a\u0004\u0018\u00010:2\b\u0010>\u001a\u0004\u0018\u00010:2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a`\u0010G\u001a\u000207*\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:2\b\u0010<\u001a\u0004\u0018\u00010:2\b\u0010=\u001a\u0004\u0018\u00010:2\b\u0010>\u001a\u0004\u0018\u00010:2\u0006\u0010H\u001a\u00020I2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0002ø\u0001\u0000¢\u0006\u0004\bJ\u0010K\u001af\u0010L\u001a\u00020M*\u0002082\u0006\u0010N\u001a\u0002072\u0006\u0010O\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:2\b\u0010<\u001a\u0004\u0018\u00010:2\b\u0010=\u001a\u0004\u0018\u00010:2\b\u0010>\u001a\u0004\u0018\u00010:2\u0006\u0010P\u001a\u00020Q2\u0006\u0010H\u001a\u00020I2\u0006\u0010A\u001a\u00020BH\u0002\"\u001e\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001e\u0010\u0007\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\u0005\"\u001e\u0010\n\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\u0005\"\u001e\u0010\r\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0005\"\u001e\u0010\u0010\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0005\"\u001e\u0010\u0013\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006R"}, m7105d2 = {"LeadingContentEndPadding", "Landroidx/compose/ui/unit/Dp;", "getLeadingContentEndPadding$annotations", "()V", "getLeadingContentEndPadding", "()F", "F", "ListItemEndPadding", "getListItemEndPadding$annotations", "getListItemEndPadding", "ListItemStartPadding", "getListItemStartPadding$annotations", "getListItemStartPadding", "ListItemThreeLineVerticalPadding", "getListItemThreeLineVerticalPadding$annotations", "getListItemThreeLineVerticalPadding", "ListItemVerticalPadding", "getListItemVerticalPadding$annotations", "getListItemVerticalPadding", "TrailingContentStartPadding", "getTrailingContentStartPadding$annotations", "getTrailingContentStartPadding", "ListItem", "", "headlineContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "overlineContent", "supportingContent", "leadingContent", "trailingContent", "colors", "Landroidx/compose/material3/ListItemColors;", "tonalElevation", "shadowElevation", "ListItem-HXNGIdc", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;FFLandroidx/compose/runtime/Composer;II)V", "ListItemLayout", "leading", "trailing", "headline", "overline", "supporting", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ProvideTextStyleFromToken", "color", "Landroidx/compose/ui/graphics/Color;", "textToken", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "content", "ProvideTextStyleFromToken-3J-VO9M", "(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "calculateHeight", "", "Landroidx/compose/ui/layout/MeasureScope;", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "headlinePlaceable", "overlinePlaceable", "supportingPlaceable", "listItemType", "Landroidx/compose/material3/ListItemType;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "calculateHeight-N4Jib3Y", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ILandroidx/compose/foundation/layout/PaddingValues;J)I", "calculateWidth", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateWidth-xygx4p4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/layout/PaddingValues;J)I", "place", "Landroidx/compose/ui/layout/MeasureResult;", "width", "height", "isThreeLine", "", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,581:1\n74#2:582\n1116#3,6:583\n1116#3,6:597\n166#4,7:589\n78#4,11:603\n91#4:634\n174#4:635\n36#5:596\n456#5,8:614\n464#5,6:628\n3737#6,6:622\n51#7:636\n51#7:637\n154#8:638\n154#8:639\n154#8:640\n154#8:641\n154#8:642\n154#8:643\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt\n*L\n169#1:582\n178#1:583,6\n170#1:597,6\n170#1:589,7\n170#1:603,11\n170#1:634\n170#1:635\n170#1:596\n170#1:614,8\n170#1:628,6\n170#1:622,6\n289#1:636\n320#1:637\n561#1:638\n564#1:639\n567#1:640\n570#1:641\n575#1:642\n580#1:643\n*E\n"})
/* loaded from: classes4.dex */
public final class ListItemKt {
    private static final float LeadingContentEndPadding;
    private static final float ListItemEndPadding;
    private static final float ListItemStartPadding;
    private static final float TrailingContentStartPadding;
    private static final float ListItemVerticalPadding = C2046Dp.m13666constructorimpl(8);
    private static final float ListItemThreeLineVerticalPadding = C2046Dp.m13666constructorimpl(12);

    @VisibleForTesting
    public static /* synthetic */ void getLeadingContentEndPadding$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getListItemEndPadding$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getListItemStartPadding$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getListItemThreeLineVerticalPadding$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getListItemVerticalPadding$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTrailingContentStartPadding$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ListItem-HXNGIdc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9538ListItemHXNGIdc(@NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, @Nullable Function2<? super Composer, ? super Integer, Unit> function25, @Nullable ListItemColors listItemColors, float f, float f2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        int i5;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f3;
        Modifier modifier2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        int i12;
        int i13;
        ListItemColors listItemColorsM9536colorsJ08w3E;
        float fM9537getElevationD9Ej5fM;
        float fM9537getElevationD9Ej5fM2;
        int i14;
        final ListItemColors listItemColors2;
        Function2<? super Composer, ? super Integer, Unit> function211;
        ComposableLambda composableLambda;
        Function2<? super Composer, ? super Integer, Unit> function212;
        ComposableLambda composableLambda2;
        Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        ListItemColors listItemColors3;
        float f4;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1647707763);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function26 = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function26) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function27 = function23;
                        i3 |= composerStartRestartGroup.changedInstance(function27) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= CpioConstants.C_ISBLK;
                    } else {
                        if ((i & CpioConstants.C_ISBLK) == 0) {
                            function28 = function24;
                            i3 |= composerStartRestartGroup.changedInstance(function28) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        } else {
                            if ((196608 & i) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function25) ? 131072 : 65536;
                            }
                            if ((i & 1572864) == 0) {
                                i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(listItemColors)) ? 1048576 : 524288;
                            }
                            i8 = i2 & 128;
                            if (i8 == 0) {
                                i3 |= 12582912;
                            } else {
                                if ((i & 12582912) == 0) {
                                    i9 = i8;
                                    i3 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
                                }
                                i10 = i2 & 256;
                                if (i10 == 0) {
                                    if ((i & 100663296) == 0) {
                                        i11 = i10;
                                        f3 = f2;
                                        i3 |= composerStartRestartGroup.changed(f3) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                                    }
                                    if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        ComposableLambda composableLambda3 = null;
                                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            modifier2 = i15 == 0 ? Modifier.INSTANCE : modifier;
                                            if (i4 != 0) {
                                                function26 = null;
                                            }
                                            if (i5 != 0) {
                                                function27 = null;
                                            }
                                            function29 = i6 == 0 ? null : function28;
                                            function210 = i7 == 0 ? null : function25;
                                            if ((i2 & 64) == 0) {
                                                i12 = i9;
                                                i13 = i11;
                                                listItemColorsM9536colorsJ08w3E = ListItemDefaults.INSTANCE.m9536colorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, 511);
                                                i3 &= -3670017;
                                            } else {
                                                i12 = i9;
                                                i13 = i11;
                                                listItemColorsM9536colorsJ08w3E = listItemColors;
                                            }
                                            fM9537getElevationD9Ej5fM = i12 == 0 ? ListItemDefaults.INSTANCE.m9537getElevationD9Ej5fM() : f;
                                            fM9537getElevationD9Ej5fM2 = i13 == 0 ? ListItemDefaults.INSTANCE.m9537getElevationD9Ej5fM() : f2;
                                            ListItemColors listItemColors4 = listItemColorsM9536colorsJ08w3E;
                                            i14 = i3;
                                            listItemColors2 = listItemColors4;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i2 & 64) != 0) {
                                                i3 &= -3670017;
                                            }
                                            modifier2 = modifier;
                                            function210 = function25;
                                            fM9537getElevationD9Ej5fM = f;
                                            i14 = i3;
                                            function29 = function28;
                                            fM9537getElevationD9Ej5fM2 = f3;
                                            listItemColors2 = listItemColors;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1647707763, i14, -1, "androidx.compose.material3.ListItem (ListItem.kt:92)");
                                        }
                                        final ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -403249643, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
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
                                            public final void invoke(@Nullable Composer composer2, int i16) {
                                                if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-403249643, i16, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:94)");
                                                    }
                                                    ListItemKt.m9539ProvideTextStyleFromToken3JVO9M(listItemColors2.m9531headlineColorvNxB06k$material3_release(true), ListTokens.INSTANCE.getListItemLabelTextFont(), function2, composer2, 48);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        });
                                        ComposableLambda composableLambda5 = function27 == null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1020860251, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedSupportingContent$1$1
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
                                            public final void invoke(@Nullable Composer composer2, int i16) {
                                                if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1020860251, i16, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:102)");
                                                    }
                                                    ListItemKt.m9539ProvideTextStyleFromToken3JVO9M(listItemColors2.m9534supportingColor0d7_KjU$material3_release(), ListTokens.INSTANCE.getListItemSupportingTextFont(), function27, composer2, 48);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        }) : null;
                                        if (function26 == null) {
                                            function211 = function26;
                                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -764441232, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedOverlineContent$1$1
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
                                                public final void invoke(@Nullable Composer composer2, int i16) {
                                                    if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-764441232, i16, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:111)");
                                                        }
                                                        ListItemKt.m9539ProvideTextStyleFromToken3JVO9M(listItemColors2.m9533overlineColor0d7_KjU$material3_release(), ListTokens.INSTANCE.getListItemOverlineFont(), function26, composer2, 48);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer2.skipToGroupEnd();
                                                }
                                            });
                                        } else {
                                            function211 = function26;
                                            composableLambda = null;
                                        }
                                        if (function29 == null) {
                                            function212 = function29;
                                            composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1400509200, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedLeadingContent$1$1
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
                                                public final void invoke(@Nullable Composer composer2, int i16) {
                                                    if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1400509200, i16, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:120)");
                                                        }
                                                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, ListItemKt.getLeadingContentEndPadding(), 0.0f, 11, null);
                                                        ListItemColors listItemColors5 = listItemColors2;
                                                        Function2<Composer, Integer, Unit> function217 = function29;
                                                        composer2.startReplaceableGroup(733328855);
                                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                                        composer2.startReplaceableGroup(-1323940314);
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                                                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(listItemColors5.m9532leadingIconColorvNxB06k$material3_release(true))), function217, composer2, ProvidedValue.$stable);
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
                                            });
                                        } else {
                                            function212 = function29;
                                            composableLambda2 = null;
                                        }
                                        if (function210 == null) {
                                            function213 = function210;
                                            composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1512306332, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedTrailingContent$1$1
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
                                                public final void invoke(@Nullable Composer composer2, int i16) {
                                                    if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1512306332, i16, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:130)");
                                                        }
                                                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, ListItemKt.getTrailingContentStartPadding(), 0.0f, 0.0f, 0.0f, 14, null);
                                                        ListItemColors listItemColors5 = listItemColors2;
                                                        Function2<Composer, Integer, Unit> function217 = function210;
                                                        composer2.startReplaceableGroup(733328855);
                                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                                        composer2.startReplaceableGroup(-1323940314);
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                                                        ListItemKt.m9539ProvideTextStyleFromToken3JVO9M(listItemColors5.m9535trailingIconColorvNxB06k$material3_release(true), ListTokens.INSTANCE.getListItemTrailingSupportingTextFont(), function217, composer2, 48);
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
                                            });
                                        } else {
                                            function213 = function210;
                                        }
                                        final ComposableLambda composableLambda6 = composableLambda2;
                                        final ComposableLambda composableLambda7 = composableLambda3;
                                        final ComposableLambda composableLambda8 = composableLambda;
                                        final ComposableLambda composableLambda9 = composableLambda5;
                                        int i16 = i14 >> 9;
                                        SurfaceKt.m9876SurfaceT9BRK9s(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$1
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                invoke2(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }
                                        }).then(modifier2), ListItemDefaults.INSTANCE.getShape(composerStartRestartGroup, 6), listItemColors2.getContainerColor(), listItemColors2.m9531headlineColorvNxB06k$material3_release(true), fM9537getElevationD9Ej5fM, fM9537getElevationD9Ej5fM2, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1502590376, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$2
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
                                            public final void invoke(@Nullable Composer composer2, int i17) {
                                                if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1502590376, i17, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:150)");
                                                    }
                                                    ListItemKt.ListItemLayout(composableLambda6, composableLambda7, composableLambda4, composableLambda8, composableLambda9, composer2, 384);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        }), composerStartRestartGroup, (57344 & i16) | 12582912 | (i16 & 458752), 64);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        function26 = function211;
                                        function214 = function213;
                                        f3 = fM9537getElevationD9Ej5fM2;
                                        function215 = function27;
                                        listItemColors3 = listItemColors2;
                                        f4 = fM9537getElevationD9Ej5fM;
                                        function216 = function212;
                                        modifier3 = modifier2;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        modifier3 = modifier;
                                        function214 = function25;
                                        listItemColors3 = listItemColors;
                                        function215 = function27;
                                        function216 = function28;
                                        f4 = f;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        final Modifier modifier4 = modifier3;
                                        final Function2<? super Composer, ? super Integer, Unit> function217 = function26;
                                        final ListItemColors listItemColors5 = listItemColors3;
                                        final float f5 = f4;
                                        final float f6 = f3;
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$3
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

                                            public final void invoke(@Nullable Composer composer2, int i17) {
                                                ListItemKt.m9538ListItemHXNGIdc(function2, modifier4, function217, function215, function216, function214, listItemColors5, f5, f6, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i3 |= 100663296;
                                i11 = i10;
                                f3 = f2;
                                if ((i3 & 38347923) == 38347922) {
                                    composerStartRestartGroup.startDefaults();
                                    ComposableLambda composableLambda32 = null;
                                    if ((i & 1) != 0) {
                                        if (i15 == 0) {
                                        }
                                        if (i4 != 0) {
                                        }
                                        if (i5 != 0) {
                                        }
                                        if (i6 == 0) {
                                        }
                                        if (i7 == 0) {
                                        }
                                        if ((i2 & 64) == 0) {
                                        }
                                        if (i12 == 0) {
                                        }
                                        if (i13 == 0) {
                                        }
                                        ListItemColors listItemColors42 = listItemColorsM9536colorsJ08w3E;
                                        i14 = i3;
                                        listItemColors2 = listItemColors42;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        final Function2<? super Composer, ? super Integer, Unit> composableLambda42 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -403249643, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
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
                                            public final void invoke(@Nullable Composer composer2, int i162) {
                                                if ((i162 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-403249643, i162, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:94)");
                                                    }
                                                    ListItemKt.m9539ProvideTextStyleFromToken3JVO9M(listItemColors2.m9531headlineColorvNxB06k$material3_release(true), ListTokens.INSTANCE.getListItemLabelTextFont(), function2, composer2, 48);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        });
                                        if (function27 == null) {
                                        }
                                        if (function26 == null) {
                                        }
                                        if (function29 == null) {
                                        }
                                        if (function210 == null) {
                                        }
                                        final Function2<? super Composer, ? super Integer, Unit> composableLambda62 = composableLambda2;
                                        final Function2<? super Composer, ? super Integer, Unit> composableLambda72 = composableLambda32;
                                        final Function2<? super Composer, ? super Integer, Unit> composableLambda82 = composableLambda;
                                        final Function2<? super Composer, ? super Integer, Unit> composableLambda92 = composableLambda5;
                                        int i162 = i14 >> 9;
                                        SurfaceKt.m9876SurfaceT9BRK9s(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$1
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                invoke2(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }
                                        }).then(modifier2), ListItemDefaults.INSTANCE.getShape(composerStartRestartGroup, 6), listItemColors2.getContainerColor(), listItemColors2.m9531headlineColorvNxB06k$material3_release(true), fM9537getElevationD9Ej5fM, fM9537getElevationD9Ej5fM2, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1502590376, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$2
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
                                            public final void invoke(@Nullable Composer composer2, int i17) {
                                                if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1502590376, i17, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:150)");
                                                    }
                                                    ListItemKt.ListItemLayout(composableLambda62, composableLambda72, composableLambda42, composableLambda82, composableLambda92, composer2, 384);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        }), composerStartRestartGroup, (57344 & i162) | 12582912 | (i162 & 458752), 64);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        function26 = function211;
                                        function214 = function213;
                                        f3 = fM9537getElevationD9Ej5fM2;
                                        function215 = function27;
                                        listItemColors3 = listItemColors2;
                                        f4 = fM9537getElevationD9Ej5fM;
                                        function216 = function212;
                                        modifier3 = modifier2;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i9 = i8;
                            i10 = i2 & 256;
                            if (i10 == 0) {
                            }
                            i11 = i10;
                            f3 = f2;
                            if ((i3 & 38347923) == 38347922) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        if ((i & 1572864) == 0) {
                        }
                        i8 = i2 & 128;
                        if (i8 == 0) {
                        }
                        i9 = i8;
                        i10 = i2 & 256;
                        if (i10 == 0) {
                        }
                        i11 = i10;
                        f3 = f2;
                        if ((i3 & 38347923) == 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function28 = function24;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((i & 1572864) == 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    i10 = i2 & 256;
                    if (i10 == 0) {
                    }
                    i11 = i10;
                    f3 = f2;
                    if ((i3 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function27 = function23;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function28 = function24;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((i & 1572864) == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i2 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                f3 = f2;
                if ((i3 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function26 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function27 = function23;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function28 = function24;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i2 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            f3 = f2;
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function26 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function27 = function23;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function28 = function24;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i2 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        f3 = f2;
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    public static final void ListItemLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2052297037);
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
            i2 |= composerStartRestartGroup.changedInstance(function24) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function25) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2052297037, i2, -1, "androidx.compose.material3.ListItemLayout (ListItem.kt:167)");
            }
            final LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Function2[]{function23, function24 == null ? ComposableSingletons$ListItemKt.INSTANCE.m9321getLambda1$material3_release() : function24, function25 == null ? ComposableSingletons$ListItemKt.INSTANCE.m9322getLambda2$material3_release() : function25, function2 == null ? ComposableSingletons$ListItemKt.INSTANCE.m9323getLambda3$material3_release() : function2, function22 == null ? ComposableSingletons$ListItemKt.INSTANCE.m9324getLambda4$material3_release() : function22});
            composerStartRestartGroup.startReplaceableGroup(1361340338);
            boolean zChanged = composerStartRestartGroup.changed(layoutDirection);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.ListItemKt$ListItemLayout$1$1
                    @Override // androidx.compose.p003ui.layout.MultiContentMeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s, reason: not valid java name */
                    public final MeasureResult mo9545measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends List<? extends Measurable>> list, long j) {
                        List<? extends Measurable> list2 = list.get(0);
                        List<? extends Measurable> list3 = list.get(1);
                        List<? extends Measurable> list4 = list.get(2);
                        List<? extends Measurable> list5 = list.get(3);
                        List<? extends Measurable> list6 = list.get(4);
                        long jM13638offsetNN6EwU = ConstraintsKt.m13638offsetNN6EwU(Constraints.m13613copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null), -measureScope.mo7868roundToPx0680j_4(C2046Dp.m13666constructorimpl(ListItemKt.getListItemStartPadding() + ListItemKt.getListItemEndPadding())), -measureScope.mo7868roundToPx0680j_4(C2046Dp.m13666constructorimpl(ListItemKt.getListItemVerticalPadding() * 2)));
                        Measurable measurable = (Measurable) CollectionsKt___CollectionsKt.firstOrNull((List) list5);
                        Placeable placeableMo12610measureBRTryo0 = measurable != null ? measurable.mo12610measureBRTryo0(jM13638offsetNN6EwU) : null;
                        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo12610measureBRTryo0);
                        Measurable measurable2 = (Measurable) CollectionsKt___CollectionsKt.firstOrNull((List) list6);
                        Placeable placeableMo12610measureBRTryo02 = measurable2 != null ? measurable2.mo12610measureBRTryo0(ConstraintsKt.m13639offsetNN6EwU$default(jM13638offsetNN6EwU, -iWidthOrZero, 0, 2, null)) : null;
                        int iWidthOrZero2 = iWidthOrZero + TextFieldImplKt.widthOrZero(placeableMo12610measureBRTryo02);
                        Measurable measurable3 = (Measurable) CollectionsKt___CollectionsKt.firstOrNull((List) list2);
                        Placeable placeableMo12610measureBRTryo03 = measurable3 != null ? measurable3.mo12610measureBRTryo0(ConstraintsKt.m13639offsetNN6EwU$default(jM13638offsetNN6EwU, -iWidthOrZero2, 0, 2, null)) : null;
                        int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo03);
                        Measurable measurable4 = (Measurable) CollectionsKt___CollectionsKt.firstOrNull((List) list4);
                        Placeable placeableMo12610measureBRTryo04 = measurable4 != null ? measurable4.mo12610measureBRTryo0(ConstraintsKt.m13638offsetNN6EwU(jM13638offsetNN6EwU, -iWidthOrZero2, -iHeightOrZero)) : null;
                        int iHeightOrZero2 = iHeightOrZero + TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo04);
                        boolean z = (placeableMo12610measureBRTryo04 == null || placeableMo12610measureBRTryo04.get(AlignmentLineKt.getFirstBaseline()) == placeableMo12610measureBRTryo04.get(AlignmentLineKt.getLastBaseline())) ? false : true;
                        Measurable measurable5 = (Measurable) CollectionsKt___CollectionsKt.firstOrNull((List) list3);
                        Placeable placeableMo12610measureBRTryo05 = measurable5 != null ? measurable5.mo12610measureBRTryo0(ConstraintsKt.m13638offsetNN6EwU(jM13638offsetNN6EwU, -iWidthOrZero2, -iHeightOrZero2)) : null;
                        ListItemType.Companion companion = ListItemType.INSTANCE;
                        int iM9555getListItemTypeZLSjz4$material3_release = companion.m9555getListItemTypeZLSjz4$material3_release(placeableMo12610measureBRTryo05 != null, placeableMo12610measureBRTryo04 != null, z);
                        boolean zM9550equalsimpl0 = ListItemType.m9550equalsimpl0(iM9555getListItemTypeZLSjz4$material3_release, companion.m9557getThreeLineAlXitO8());
                        PaddingValues paddingValuesM8119PaddingValuesa9UjIt4 = PaddingKt.m8119PaddingValuesa9UjIt4(ListItemKt.getListItemStartPadding(), zM9550equalsimpl0 ? ListItemKt.getListItemThreeLineVerticalPadding() : ListItemKt.getListItemVerticalPadding(), ListItemKt.getListItemEndPadding(), zM9550equalsimpl0 ? ListItemKt.getListItemThreeLineVerticalPadding() : ListItemKt.getListItemVerticalPadding());
                        Placeable placeable = placeableMo12610measureBRTryo0;
                        Placeable placeable2 = placeableMo12610measureBRTryo02;
                        Placeable placeable3 = placeableMo12610measureBRTryo03;
                        Placeable placeable4 = placeableMo12610measureBRTryo05;
                        Placeable placeable5 = placeableMo12610measureBRTryo04;
                        return ListItemKt.place(measureScope, ListItemKt.m9544calculateWidthxygx4p4(measureScope, placeable, placeable2, placeable3, placeable4, placeable5, layoutDirection, paddingValuesM8119PaddingValuesa9UjIt4, j), ListItemKt.m9543calculateHeightN4Jib3Y(measureScope, placeable, placeable2, placeable3, placeable4, placeable5, iM9555getListItemTypeZLSjz4$material3_release, paddingValuesM8119PaddingValuesa9UjIt4, j), placeableMo12610measureBRTryo0, placeableMo12610measureBRTryo02, placeableMo12610measureBRTryo03, placeableMo12610measureBRTryo05, placeableMo12610measureBRTryo04, zM9550equalsimpl0, layoutDirection, paddingValuesM8119PaddingValuesa9UjIt4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1399185516);
            Modifier.Companion companion = Modifier.INSTANCE;
            Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listListOf);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(multiContentMeasurePolicy);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            function2CombineAsVirtualLayouts.invoke(composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt.ListItemLayout.2
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
                    ListItemKt.ListItemLayout(function2, function22, function23, function24, function25, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-xygx4p4, reason: not valid java name */
    public static final int m9544calculateWidthxygx4p4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, LayoutDirection layoutDirection, PaddingValues paddingValues, long j) {
        if (Constraints.m13618getHasBoundedWidthimpl(j)) {
            return Constraints.m13622getMaxWidthimpl(j);
        }
        int iMo7868roundToPx0680j_4 = measureScope.mo7868roundToPx0680j_4(C2046Dp.m13666constructorimpl(paddingValues.mo8074calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.mo8075calculateRightPaddingu2uoSUM(layoutDirection)));
        return iMo7868roundToPx0680j_4 + TextFieldImplKt.widthOrZero(placeable) + Math.max(TextFieldImplKt.widthOrZero(placeable3), Math.max(TextFieldImplKt.widthOrZero(placeable4), TextFieldImplKt.widthOrZero(placeable5))) + TextFieldImplKt.widthOrZero(placeable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-N4Jib3Y, reason: not valid java name */
    public static final int m9543calculateHeightN4Jib3Y(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, int i, PaddingValues paddingValues, long j) {
        float fM10514getListItemTwoLineContainerHeightD9Ej5fM;
        ListItemType.Companion companion = ListItemType.INSTANCE;
        if (ListItemType.m9550equalsimpl0(i, companion.m9556getOneLineAlXitO8())) {
            fM10514getListItemTwoLineContainerHeightD9Ej5fM = ListTokens.INSTANCE.m10510getListItemOneLineContainerHeightD9Ej5fM();
        } else {
            fM10514getListItemTwoLineContainerHeightD9Ej5fM = ListItemType.m9550equalsimpl0(i, companion.m9558getTwoLineAlXitO8()) ? ListTokens.INSTANCE.m10514getListItemTwoLineContainerHeightD9Ej5fM() : ListTokens.INSTANCE.m10512getListItemThreeLineContainerHeightD9Ej5fM();
        }
        return RangesKt___RangesKt.coerceAtMost(Math.max(Math.max(Constraints.m13623getMinHeightimpl(j), measureScope.mo7868roundToPx0680j_4(fM10514getListItemTwoLineContainerHeightD9Ej5fM)), measureScope.mo7868roundToPx0680j_4(C2046Dp.m13666constructorimpl(paddingValues.getTop() + paddingValues.getBottom())) + Math.max(TextFieldImplKt.heightOrZero(placeable), Math.max(TextFieldImplKt.heightOrZero(placeable3) + TextFieldImplKt.heightOrZero(placeable4) + TextFieldImplKt.heightOrZero(placeable5), TextFieldImplKt.heightOrZero(placeable2)))), Constraints.m13621getMaxHeightimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult place(final MeasureScope measureScope, final int i, final int i2, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, final Placeable placeable5, final boolean z, final LayoutDirection layoutDirection, final PaddingValues paddingValues) {
        return MeasureScope.layout$default(measureScope, i, i2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ListItemKt.place.1
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
                int iMo7868roundToPx0680j_4 = measureScope.mo7868roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, layoutDirection));
                int iMo7868roundToPx0680j_42 = measureScope.mo7868roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, layoutDirection));
                int iMo7868roundToPx0680j_43 = measureScope.mo7868roundToPx0680j_4(paddingValues.getTop());
                Placeable placeable6 = placeable;
                if (placeable6 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, iMo7868roundToPx0680j_4, z ? iMo7868roundToPx0680j_43 : Alignment.INSTANCE.getCenterVertically().align(placeable6.getHeight(), i2), 0.0f, 4, null);
                }
                Placeable placeable7 = placeable2;
                if (placeable7 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i - iMo7868roundToPx0680j_42) - placeable7.getWidth(), z ? iMo7868roundToPx0680j_43 : Alignment.INSTANCE.getCenterVertically().align(placeable7.getHeight(), i2), 0.0f, 4, null);
                }
                int iWidthOrZero = iMo7868roundToPx0680j_4 + TextFieldImplKt.widthOrZero(placeable);
                if (!z) {
                    iMo7868roundToPx0680j_43 = Alignment.INSTANCE.getCenterVertically().align(TextFieldImplKt.heightOrZero(placeable3) + TextFieldImplKt.heightOrZero(placeable4) + TextFieldImplKt.heightOrZero(placeable5), i2);
                }
                Placeable placeable8 = placeable4;
                if (placeable8 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, iWidthOrZero, iMo7868roundToPx0680j_43, 0.0f, 4, null);
                }
                int iHeightOrZero = iMo7868roundToPx0680j_43 + TextFieldImplKt.heightOrZero(placeable4);
                Placeable placeable9 = placeable3;
                if (placeable9 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, iWidthOrZero, iHeightOrZero, 0.0f, 4, null);
                }
                int iHeightOrZero2 = iHeightOrZero + TextFieldImplKt.heightOrZero(placeable3);
                Placeable placeable10 = placeable5;
                if (placeable10 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable10, iWidthOrZero, iHeightOrZero2, 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: ProvideTextStyleFromToken-3J-VO9M, reason: not valid java name */
    public static final void m9539ProvideTextStyleFromToken3JVO9M(final long j, final TypographyKeyTokens typographyKeyTokens, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1133967795);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(typographyKeyTokens) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133967795, i2, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:518)");
            }
            ProvideContentColorTextStyleKt.m9663ProvideContentColorTextStyle3JVO9M(j, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), typographyKeyTokens), function2, composerStartRestartGroup, i2 & 910);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ProvideTextStyleFromToken$1
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
                    ListItemKt.m9539ProvideTextStyleFromToken3JVO9M(j, typographyKeyTokens, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float getListItemVerticalPadding() {
        return ListItemVerticalPadding;
    }

    public static final float getListItemThreeLineVerticalPadding() {
        return ListItemThreeLineVerticalPadding;
    }

    public static final float getListItemStartPadding() {
        return ListItemStartPadding;
    }

    public static final float getListItemEndPadding() {
        return ListItemEndPadding;
    }

    public static final float getLeadingContentEndPadding() {
        return LeadingContentEndPadding;
    }

    public static final float getTrailingContentStartPadding() {
        return TrailingContentStartPadding;
    }

    static {
        float f = 16;
        ListItemStartPadding = C2046Dp.m13666constructorimpl(f);
        ListItemEndPadding = C2046Dp.m13666constructorimpl(f);
        LeadingContentEndPadding = C2046Dp.m13666constructorimpl(f);
        TrailingContentStartPadding = C2046Dp.m13666constructorimpl(f);
    }
}
