package com.blackhub.bronline.game.p019ui.panelinfo;

import android.graphics.Bitmap;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PanelInfoContent.kt */
@SourceDebugExtension({"SMAP\nPanelInfoContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanelInfoContent.kt\ncom/blackhub/bronline/game/ui/panelinfo/PanelInfoContentKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,83:1\n91#2,2:84\n93#2:114\n97#2:159\n79#3,11:86\n79#3,11:121\n92#3:153\n92#3:158\n456#4,8:97\n464#4,3:111\n456#4,8:132\n464#4,3:146\n467#4,3:150\n467#4,3:155\n3737#5,6:105\n3737#5,6:140\n74#6,6:115\n80#6:149\n84#6:154\n*S KotlinDebug\n*F\n+ 1 PanelInfoContent.kt\ncom/blackhub/bronline/game/ui/panelinfo/PanelInfoContentKt\n*L\n35#1:84,2\n35#1:114\n35#1:159\n35#1:86,11\n55#1:121,11\n55#1:153\n35#1:158\n35#1:97,8\n35#1:111,3\n55#1:132,8\n55#1:146,3\n55#1:150,3\n35#1:155,3\n35#1:105,6\n55#1:140,6\n55#1:115,6\n55#1:149\n55#1:154\n*E\n"})
/* loaded from: classes3.dex */
public final class PanelInfoContentKt {
    public static final float BLOCK_HEIGHT_PERCENT = 0.86f;
    public static final float IMAGE_WIDTH_PERCENT = 0.4f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PanelInfoContent(@Nullable final Bitmap bitmap, @NotNull final AnnotatedString descText, @Nullable AnnotatedString annotatedString, @Nullable Composer composer, final int i, final int i2) {
        Arrangement arrangement;
        Modifier.Companion companion;
        Intrinsics.checkNotNullParameter(descText, "descText");
        Composer composerStartRestartGroup = composer.startRestartGroup(1738398521);
        final AnnotatedString annotatedString2 = (i2 & 4) != 0 ? null : annotatedString;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1738398521, i, -1, "com.blackhub.bronline.game.ui.panelinfo.PanelInfoContent (PanelInfoContent.kt:31)");
        }
        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.86f), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._18sdp, composerStartRestartGroup, 6), 5, null);
        Arrangement arrangement2 = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = arrangement2.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._19sdp, composerStartRestartGroup, 6));
        Alignment.Companion companion3 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_4, centerVertically, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(127953580);
        if (bitmap == null) {
            arrangement = arrangement2;
            companion = companion2;
        } else {
            arrangement = arrangement2;
            companion = companion2;
            ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap, SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth(companion2, 0.4f), 0.0f, 1, null), null, null, 0.0f, null, 0, composerStartRestartGroup, 56, 124);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, scrollStateRememberScrollState, false, null, false, 14, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
        TextKt.m10025TextIbK3jfQ(descText, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14850montserratSemiBold12spOr9ssp67j0QOw(0L, 0, 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15), composerStartRestartGroup, (i >> 3) & 14, 0, 131070);
        composerStartRestartGroup.startReplaceableGroup(127954046);
        if (annotatedString2 != null) {
            TextKt.m10025TextIbK3jfQ(annotatedString2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14849montserratSemiBold10spOr8ssp67j0QOw(0L, 0, 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15), composerStartRestartGroup, (i >> 6) & 14, 0, 131070);
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
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.panelinfo.PanelInfoContentKt.PanelInfoContent.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    PanelInfoContentKt.PanelInfoContent(bitmap, descText, annotatedString2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(device = "spec:width=360dp,height=640dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Phone 360 x 640 Android small")
    public static final void PreviewPanelInfoContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1185540828);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1185540828, i, -1, "com.blackhub.bronline.game.ui.panelinfo.PreviewPanelInfoContent (PanelInfoContent.kt:76)");
            }
            PanelInfoContent(null, StringExtensionKt.htmlTextToAnnotatedString("Каждый час по карте разбрасываются подарки, которые можно собрать.\n\nТолько это не так просто, ведь все любят подарки.\n\nКак только Вы увидите что подарки были разбросаны по карте, сразу отправляйтесь на поиски и найдите их первым как можно больше. "), StringExtensionKt.htmlTextToAnnotatedString("-Проходить сюжетный квест\n(Меню - Навигатор - Новый Год 2024 - Пройти квест)\n- Выполнять ежедневные задания у Cиняка\n(Меню - Навигатор - Новый Год 2024 - Синяк | Ежедневные задания)\n- Собирать и открывать подарки, которые появляются\nпо всей карте раз в час.\n- Играть в снежки c другими игроками\n(Меню - Навигатор - Новый Год 2024 - Ближайшее место игры\nв снежки)\n- Выигрывать в мини-играх\n(Меню - Навигатор - Новый Год 2024 - Мини игры) Проходить сюжетный квест\n(Меню - Навигатор - Новый Год 2024 - Пройти квест)\n- Выполнять ежедневные задания у Cиняка\n(Меню - Навигатор - Новый Год 2024 - Синяк | Ежедневные задания)\n- Собирать и открывать подарки, которые появляются\nпо всей карте раз в час.\n- Играть в снежки c другими игроками\n(Меню - Навигатор - Новый Год 2024 - Ближайшее место игры\nв снежки)\n- Выигрывать в мини-играх\n(Меню - Навигатор - Новый Год 2024 - Мини игры)"), composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.panelinfo.PanelInfoContentKt.PreviewPanelInfoContent.1
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
                    PanelInfoContentKt.PreviewPanelInfoContent(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

