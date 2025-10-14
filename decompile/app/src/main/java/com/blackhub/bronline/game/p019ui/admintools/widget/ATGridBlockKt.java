package com.blackhub.bronline.game.p019ui.admintools.widget;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.OverscrollConfiguration_androidKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.admintools.model.ATTemplateModel;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.ScrollSilverThumbCarouselGridKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ATGridBlock.kt */
@Metadata(m7104d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aË\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00070\u00192#\b\u0002\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00070\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u001fH\u0007¢\u0006\u0002\u0010 \u001a\r\u0010!\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006#²\u0006\n\u0010$\u001a\u00020\u0001X\u008a\u008e\u0002"}, m7105d2 = {"COUNT_COLUMNS", "", "MAX_LINES_FOR_BUTTON", "VERTICAL_PERCENT", "WIDTH_FOR_GRID", "", "ATGridBlock", "", "modifier", "Landroidx/compose/ui/Modifier;", "tableTitle", "", "templatesList", "", "Lcom/blackhub/bronline/game/gui/admintools/model/ATTemplateModel;", "buttonTextLeft", "buttonTextCenter", "buttonTextRight", "buttonTextMaxLine", "isCustomReport", "", "isButtonLeftEnable", "isButtonCenterVisible", "isButtonCenterEnable", "onButtonLeftClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "buttonId", "onButtonCenterClick", "onButtonRightClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "PreviewATGridBlock", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "selectButtonId"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nATGridBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ATGridBlock.kt\ncom/blackhub/bronline/game/ui/admintools/widget/ATGridBlockKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,320:1\n1116#2,6:321\n1116#2,6:551\n1116#2,6:557\n68#3,6:327\n74#3:361\n68#3,6:397\n74#3:431\n78#3:516\n78#3:577\n79#4,11:333\n79#4,11:368\n79#4,11:403\n79#4,11:438\n79#4,11:473\n92#4:505\n92#4:510\n92#4:515\n79#4,11:522\n92#4:566\n92#4:571\n92#4:576\n456#5,8:344\n464#5,3:358\n456#5,8:379\n464#5,3:393\n456#5,8:414\n464#5,3:428\n456#5,8:449\n464#5,3:463\n456#5,8:484\n464#5,3:498\n467#5,3:502\n467#5,3:507\n467#5,3:512\n456#5,8:533\n464#5,3:547\n467#5,3:563\n467#5,3:568\n467#5,3:573\n3737#6,6:352\n3737#6,6:387\n3737#6,6:422\n3737#6,6:457\n3737#6,6:492\n3737#6,6:541\n74#7,6:362\n80#7:396\n74#7,6:432\n80#7:466\n84#7:511\n84#7:572\n87#8,6:467\n93#8:501\n97#8:506\n88#8,5:517\n93#8:550\n97#8:567\n75#9:578\n108#9,2:579\n*S KotlinDebug\n*F\n+ 1 ATGridBlock.kt\ncom/blackhub/bronline/game/ui/admintools/widget/ATGridBlockKt\n*L\n87#1:321,6\n198#1:551,6\n228#1:557,6\n91#1:327,6\n91#1:361\n100#1:397,6\n100#1:431\n100#1:516\n91#1:577\n91#1:333,11\n94#1:368,11\n100#1:403,11\n123#1:438,11\n135#1:473,11\n135#1:505\n123#1:510\n100#1:515\n182#1:522,11\n182#1:566\n94#1:571\n91#1:576\n91#1:344,8\n91#1:358,3\n94#1:379,8\n94#1:393,3\n100#1:414,8\n100#1:428,3\n123#1:449,8\n123#1:463,3\n135#1:484,8\n135#1:498,3\n135#1:502,3\n123#1:507,3\n100#1:512,3\n182#1:533,8\n182#1:547,3\n182#1:563,3\n94#1:568,3\n91#1:573,3\n91#1:352,6\n94#1:387,6\n100#1:422,6\n123#1:457,6\n135#1:492,6\n182#1:541,6\n94#1:362,6\n94#1:396\n123#1:432,6\n123#1:466\n123#1:511\n94#1:572\n135#1:467,6\n135#1:501\n135#1:506\n182#1:517,5\n182#1:550\n182#1:567\n87#1:578\n87#1:579,2\n*E\n"})
/* loaded from: classes.dex */
public final class ATGridBlockKt {
    public static final int COUNT_COLUMNS = 5;
    public static final int MAX_LINES_FOR_BUTTON = 3;
    public static final int VERTICAL_PERCENT = 70;
    public static final float WIDTH_FOR_GRID = 0.97f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ATGridBlock(@Nullable Modifier modifier, @NotNull final String tableTitle, @NotNull final List<ATTemplateModel> templatesList, @NotNull final String buttonTextLeft, @Nullable String str, @NotNull final String buttonTextRight, int i, final boolean z, final boolean z2, boolean z3, boolean z4, @NotNull final Function1<? super Integer, Unit> onButtonLeftClick, @Nullable Function1<? super Integer, Unit> function1, @NotNull final Function0<Unit> onButtonRightClick, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        String strEmpty;
        int i5;
        Intrinsics.checkNotNullParameter(tableTitle, "tableTitle");
        Intrinsics.checkNotNullParameter(templatesList, "templatesList");
        Intrinsics.checkNotNullParameter(buttonTextLeft, "buttonTextLeft");
        Intrinsics.checkNotNullParameter(buttonTextRight, "buttonTextRight");
        Intrinsics.checkNotNullParameter(onButtonLeftClick, "onButtonLeftClick");
        Intrinsics.checkNotNullParameter(onButtonRightClick, "onButtonRightClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(449896826);
        Modifier modifier2 = (i4 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if ((i4 & 16) != 0) {
            strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            i5 = i2 & (-57345);
        } else {
            strEmpty = str;
            i5 = i2;
        }
        final int i6 = (i4 & 64) != 0 ? 3 : i;
        boolean z5 = (i4 & 512) != 0 ? false : z3;
        boolean z6 = (i4 & 1024) != 0 ? false : z4;
        Function1<? super Integer, Unit> function12 = (i4 & 4096) != 0 ? new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt.ATGridBlock.1
            public final void invoke(int i7) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }
        } : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(449896826, i5, i3, "com.blackhub.bronline.game.ui.admintools.widget.ATGridBlock (ATGridBlock.kt:80)");
        }
        final LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
        float verticalPercentSwDp = ComposeExtensionKt.toVerticalPercentSwDp(70, composerStartRestartGroup, 6);
        Integer numValueOf = z ? Integer.valueOf(R.drawable.ic_pencil) : null;
        composerStartRestartGroup.startReplaceableGroup(-525471188);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(-1);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        final Modifier modifier3 = modifier2;
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion4 = Modifier.INSTANCE;
        Modifier modifierAlign = boxScopeInstance.align(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._480sdp, composerStartRestartGroup, 6)), companion2.getCenter());
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        final String str2 = strEmpty;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAlign);
        final boolean z7 = z5;
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierBorder = BorderKt.border(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.m8160heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, verticalPercentSwDp, 1, null), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6))), ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6), null, 2, null), BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._05sdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.light_gray_blue, composerStartRestartGroup, 6)), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6)));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierBorder);
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
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_br_logo, composerStartRestartGroup, 6), (String) null, boxScopeInstance.align(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._101sdp, composerStartRestartGroup, 6)), companion2.getCenter()), companion2.getCenter(), (ContentScale) null, 0.1f, (ColorFilter) null, composerStartRestartGroup, 199736, 80);
        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(companion4, companion2.getTopCenter()), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._24sdp, composerStartRestartGroup, 6), 7, null);
        Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(companion4, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null);
        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
        int i7 = i5 >> 3;
        TextKt.m10024Text4IGK_g(tableTitle, modifierM8127paddingqDBjuR0$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14850montserratSemiBold12spOr9ssp67j0QOw(0L, 0, 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15), composerStartRestartGroup, i7 & 14, 0, 65532);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor5);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        CompositionLocalKt.CompositionLocalProvider(OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration().provides(null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1377823198, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt$ATGridBlock$2$1$1$1$1$1
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
            public final void invoke(@Nullable Composer composer2, int i8) {
                if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1377823198, i8, -1, "com.blackhub.bronline.game.ui.admintools.widget.ATGridBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ATGridBlock.kt:138)");
                    }
                    GridCells.Fixed fixed = new GridCells.Fixed(5);
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion5, 0.97f);
                    LazyGridState lazyGridState = lazyGridStateRememberLazyGridState;
                    final List<ATTemplateModel> list = templatesList;
                    final int i9 = i6;
                    final MutableIntState mutableIntState2 = mutableIntState;
                    LazyGridDslKt.LazyVerticalGrid(fixed, modifierFillMaxWidth, lazyGridState, null, false, null, null, null, false, new Function1<LazyGridScope, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt$ATGridBlock$2$1$1$1$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LazyGridScope lazyGridScope) {
                            invoke2(lazyGridScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull LazyGridScope LazyVerticalGrid) {
                            Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
                            final List<ATTemplateModel> list2 = list;
                            final int i10 = i9;
                            final MutableIntState mutableIntState3 = mutableIntState2;
                            final C4850x2f8a93fe c4850x2f8a93fe = new Function1() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt$ATGridBlock$2$1$1$1$1$1$1$invoke$$inlined$items$default$1
                                @Override // kotlin.jvm.functions.Function1
                                @Nullable
                                public final Void invoke(ATTemplateModel aTTemplateModel) {
                                    return null;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke((ATTemplateModel) obj);
                                }
                            };
                            LazyVerticalGrid.items(list2.size(), null, null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt$ATGridBlock$2$1$1$1$1$1$1$invoke$$inlined$items$default$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                    return invoke(num.intValue());
                                }

                                @Nullable
                                public final Object invoke(int i11) {
                                    return c4850x2f8a93fe.invoke(list2.get(i11));
                                }
                            }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt$ATGridBlock$2$1$1$1$1$1$1$invoke$$inlined$items$default$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer3, Integer num2) {
                                    invoke(lazyGridItemScope, num.intValue(), composer3, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull LazyGridItemScope lazyGridItemScope, int i11, @Nullable Composer composer3, int i12) {
                                    int i13;
                                    if ((i12 & 14) == 0) {
                                        i13 = (composer3.changed(lazyGridItemScope) ? 4 : 2) | i12;
                                    } else {
                                        i13 = i12;
                                    }
                                    if ((i12 & 112) == 0) {
                                        i13 |= composer3.changed(i11) ? 32 : 16;
                                    }
                                    if ((i13 & 731) == 146 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(699646206, i13, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:461)");
                                    }
                                    final ATTemplateModel aTTemplateModel = (ATTemplateModel) list2.get(i11);
                                    String templateTitle = aTTemplateModel.getTemplateTitle();
                                    int i14 = i10;
                                    boolean z8 = mutableIntState3.getIntValue() == aTTemplateModel.getTemplateId();
                                    composer3.startReplaceableGroup(-1631212351);
                                    boolean zChanged = composer3.changed(aTTemplateModel);
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        final MutableIntState mutableIntState4 = mutableIntState3;
                                        objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt$ATGridBlock$2$1$1$1$1$1$1$1$1$1
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
                                                mutableIntState4.setIntValue(aTTemplateModel.getTemplateId());
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer3.endReplaceableGroup();
                                    ATSelectButtonKt.ATSelectButton(null, templateTitle, i14, z8, (Function0) objRememberedValue2, composer3, 0, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                        }
                    }, composer2, 48, 504);
                    Modifier modifierM8127paddingqDBjuR0$default3 = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion5, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer2, 6)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._16sdp, composer2, 6), 0.0f, 0.0f, 13, null);
                    Brush.Companion companion6 = Brush.INSTANCE;
                    Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion6, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.light_gray_blue_25, composer2, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.light_gray_blue_25, composer2, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                    ScrollSilverThumbCarouselGridKt.ScrollSilverThumbCarouselGrid(modifierM8127paddingqDBjuR0$default3, lazyGridStateRememberLazyGridState, 5, 0.0f, 0.0f, Brush.Companion.m11289horizontalGradient8A3gB4$default(companion6, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(Color.INSTANCE.m11377getWhite0d7_KjU()), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composer2, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), brushM11297verticalGradient8A3gB4$default, composer2, 384, 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, ProvidedValue.$stable | 48);
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
        Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._minus17sdp, composerStartRestartGroup, 6), 1, null);
        Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceEvenly, companion2.getTop(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor6);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
        }
        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._108sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._34sdp, composerStartRestartGroup, 6));
        TextStyle textStyleM14791montserratBold12spOr9ssp67j0QOw = typographyStyle.m14791montserratBold12spOr9ssp67j0QOw(0L, 0, 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
        boolean z8 = z2 && IntExtensionKt.isNotNegativeCommand(Integer.valueOf(mutableIntState.getIntValue()));
        composerStartRestartGroup.startReplaceableGroup(-1933582416);
        boolean z9 = (((i3 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(onButtonLeftClick)) || (i3 & 48) == 32;
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z9 || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt$ATGridBlock$2$1$2$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    onButtonLeftClick.invoke(Integer.valueOf(mutableIntState.getIntValue()));
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN4, null, buttonTextLeft, textStyleM14791montserratBold12spOr9ssp67j0QOw, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, z8, true, false, null, (Function0) objRememberedValue2, composerStartRestartGroup, i7 & 896, 100663296, 48, 13369330);
        final Integer num = numValueOf;
        final boolean z10 = z6;
        final Function1<? super Integer, Unit> function13 = function12;
        ComposeExtensionKt.IfTrue(Boolean.valueOf(z7 && str2.length() > 0), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -309506494, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt$ATGridBlock$2$1$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                invoke(composer2, num2.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i8) {
                if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-309506494, i8, -1, "com.blackhub.bronline.game.ui.admintools.widget.ATGridBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ATGridBlock.kt:201)");
                    }
                    Modifier modifierM8156defaultMinSizeVpY3zN42 = SizeKt.m8156defaultMinSizeVpY3zN4(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._108sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._34sdp, composer2, 6));
                    String str3 = str2;
                    TextStyle textStyleM14791montserratBold12spOr9ssp67j0QOw2 = TypographyStyle.INSTANCE.m14791montserratBold12spOr9ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15);
                    Integer num2 = num;
                    Boolean boolValueOf = Boolean.valueOf(z10 && IntExtensionKt.isNotNegativeCommand(Integer.valueOf(mutableIntState.getIntValue())));
                    if (!AnyExtensionKt.isNull(num)) {
                        boolValueOf = null;
                    }
                    boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : z10;
                    composer2.startReplaceableGroup(-1489424916);
                    boolean zChanged = composer2.changed(function13);
                    final Function1<Integer, Unit> function14 = function13;
                    final MutableIntState mutableIntState2 = mutableIntState;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt$ATGridBlock$2$1$2$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                function14.invoke(Integer.valueOf(mutableIntState2.getIntValue()));
                                mutableIntState2.setIntValue(-1);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN42, null, str3, textStyleM14791montserratBold12spOr9ssp67j0QOw2, 0.0f, 0, num2, null, null, 0.0f, 0L, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, zBooleanValue, true, false, null, (Function0) objRememberedValue3, composer2, 0, 100663296, 48, 13369266);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 48);
        Modifier modifierM8156defaultMinSizeVpY3zN42 = SizeKt.m8156defaultMinSizeVpY3zN4(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._108sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._34sdp, composerStartRestartGroup, 6));
        TextStyle textStyleM14791montserratBold12spOr9ssp67j0QOw2 = typographyStyle.m14791montserratBold12spOr9ssp67j0QOw(0L, 0, 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
        long jColorResource = ColorResources_androidKt.colorResource(R.color.light_gray_blue, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1933580825);
        boolean z11 = (((i3 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(onButtonRightClick)) || (i3 & 3072) == 2048;
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (z11 || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt$ATGridBlock$2$1$2$3$1
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
                    onButtonRightClick.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN42, null, buttonTextRight, textStyleM14791montserratBold12spOr9ssp67j0QOw2, 0.0f, 0, null, null, null, 0.0f, jColorResource, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue3, composerStartRestartGroup, (i5 >> 9) & 896, 100663296, 0, 16514034);
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i8 = i6;
            final boolean z12 = z6;
            final Function1<? super Integer, Unit> function14 = function12;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt.ATGridBlock.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                    invoke(composer2, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    ATGridBlockKt.ATGridBlock(modifier3, tableTitle, templatesList, buttonTextLeft, str2, buttonTextRight, i8, z, z2, z7, z12, onButtonLeftClick, function14, onButtonRightClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewATGridBlock(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1367353084);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1367353084, i, -1, "com.blackhub.bronline.game.ui.admintools.widget.PreviewATGridBlock (ATGridBlock.kt:237)");
            }
            composer2 = composerStartRestartGroup;
            ATGridBlock(null, StringResources_androidKt.stringResource(R.string.admin_tools_select_the_reason_for_the_punishment, composerStartRestartGroup, 6), CollectionsKt__CollectionsKt.listOf((Object[]) new ATTemplateModel[]{new ATTemplateModel(1, "ШаблонШаблоннннн", null, null, 12, null), new ATTemplateModel(0, "asfvsavasvasvsafasfasfaswasgvsavbvzdxvzdxvadaasv", null, null, 13, null), new ATTemplateModel(0, "name 3", null, null, 13, null), new ATTemplateModel(0, "name 4", null, null, 13, null), new ATTemplateModel(0, "name 5", null, null, 13, null), new ATTemplateModel(0, "name 6", null, null, 13, null), new ATTemplateModel(0, "name 7", null, null, 13, null), new ATTemplateModel(0, "name 8", null, null, 13, null), new ATTemplateModel(0, "name 9", null, null, 13, null), new ATTemplateModel(0, "name 10", null, null, 13, null), new ATTemplateModel(0, "name 11", null, null, 13, null), new ATTemplateModel(0, "name 12", null, null, 13, null), new ATTemplateModel(0, "name 13", null, null, 13, null), new ATTemplateModel(0, "name 4", null, null, 13, null), new ATTemplateModel(0, "name 5", null, null, 13, null), new ATTemplateModel(0, "name 9", null, null, 13, null), new ATTemplateModel(0, "name 10", null, null, 13, null), new ATTemplateModel(0, "name 11", null, null, 13, null), new ATTemplateModel(0, "name 12", null, null, 13, null), new ATTemplateModel(0, "name 13", null, null, 13, null), new ATTemplateModel(0, "name 4", null, null, 13, null), new ATTemplateModel(0, "name 5", null, null, 13, null)}), "Выбрать", "Свой отчет", "Назад", 0, true, false, false, true, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt.PreviewATGridBlock.1
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt.PreviewATGridBlock.2
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt.PreviewATGridBlock.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composer2, 113470464, 3510, 577);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt.PreviewATGridBlock.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) {
                    ATGridBlockKt.PreviewATGridBlock(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
