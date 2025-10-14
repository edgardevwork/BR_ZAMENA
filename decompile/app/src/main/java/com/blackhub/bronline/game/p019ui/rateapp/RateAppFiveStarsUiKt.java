package com.blackhub.bronline.game.p019ui.rateapp;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
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
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RateAppFiveStarsUi.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a>\u0010\t\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00070\u000eH\u0007¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m7105d2 = {"FIFTH_STAR", "", "FIRST_STAR", "FOURTH_STAR", "SECOND_STAR", "THIRD_STAR", "PreviewRateAppFiveStarsUi", "", "(Landroidx/compose/runtime/Composer;I)V", "RateAppFiveStarsUi", "listOFCheckedItems", "", "", "onStarClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRateAppFiveStarsUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RateAppFiveStarsUi.kt\ncom/blackhub/bronline/game/ui/rateapp/RateAppFiveStarsUiKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,98:1\n68#2,6:99\n74#2:133\n78#2:208\n79#3,11:105\n79#3,11:140\n92#3:202\n92#3:207\n456#4,8:116\n464#4,3:130\n456#4,8:151\n464#4,3:165\n467#4,3:199\n467#4,3:204\n3737#5,6:124\n3737#5,6:159\n87#6,6:134\n93#6:168\n97#6:203\n1116#7,6:169\n1116#7,6:175\n1116#7,6:181\n1116#7,6:187\n1116#7,6:193\n*S KotlinDebug\n*F\n+ 1 RateAppFiveStarsUi.kt\ncom/blackhub/bronline/game/ui/rateapp/RateAppFiveStarsUiKt\n*L\n32#1:99,6\n32#1:133\n32#1:208\n32#1:105,11\n41#1:140,11\n41#1:202\n32#1:207\n32#1:116,8\n32#1:130,3\n41#1:151,8\n41#1:165,3\n41#1:199,3\n32#1:204,3\n32#1:124,6\n41#1:159,6\n41#1:134,6\n41#1:168\n41#1:203\n48#1:169,6\n57#1:175,6\n65#1:181,6\n73#1:187,6\n81#1:193,6\n*E\n"})
/* loaded from: classes2.dex */
public final class RateAppFiveStarsUiKt {
    public static final int FIFTH_STAR = 4;
    public static final int FIRST_STAR = 0;
    public static final int FOURTH_STAR = 3;
    public static final int SECOND_STAR = 1;
    public static final int THIRD_STAR = 2;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RateAppFiveStarsUi(@NotNull final List<Boolean> listOFCheckedItems, @NotNull final Function1<? super Integer, Unit> onStarClick, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(listOFCheckedItems, "listOFCheckedItems");
        Intrinsics.checkNotNullParameter(onStarClick, "onStarClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2073877482);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2073877482, i, -1, "com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUi (RateAppFiveStarsUi.kt:29)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.rate_app_question_to_player, composerStartRestartGroup, 6), PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getTopCenter()), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14796montserratBold17spOr13ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13), composerStartRestartGroup, 0, 0, 65532);
        Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(boxScopeInstance.align(companion, companion2.getCenter()), PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6), 0.0f, 2, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(759999968);
        int i2 = (i & 112) ^ 48;
        boolean z = (i2 > 32 && composerStartRestartGroup.changed(onStarClick)) || (i & 48) == 32;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUiKt$RateAppFiveStarsUi$1$1$1$1
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
                    onStarClick.invoke(0);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierWeight$default, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 217294479, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUiKt$RateAppFiveStarsUi$1$1$2
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
            public final void invoke(@Nullable Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(217294479, i3, -1, "com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUi.<anonymous>.<anonymous>.<anonymous> (RateAppFiveStarsUi.kt:48)");
                    }
                    RateAppStarItemKt.RateAppStarItem(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), listOFCheckedItems.get(0).booleanValue(), composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 0, 3072, 4094);
        Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(760000310);
        boolean z2 = (i2 > 32 && composerStartRestartGroup.changed(onStarClick)) || (i & 48) == 32;
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUiKt$RateAppFiveStarsUi$1$1$3$1
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
                    onStarClick.invoke(1);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierWeight$default2, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2112119866, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUiKt$RateAppFiveStarsUi$1$1$4
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
            public final void invoke(@Nullable Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2112119866, i3, -1, "com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUi.<anonymous>.<anonymous>.<anonymous> (RateAppFiveStarsUi.kt:57)");
                    }
                    RateAppStarItemKt.RateAppStarItem(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), listOFCheckedItems.get(1).booleanValue(), composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 0, 3072, 4094);
        Modifier modifierWeight$default3 = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(760000648);
        boolean z3 = (i2 > 32 && composerStartRestartGroup.changed(onStarClick)) || (i & 48) == 32;
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUiKt$RateAppFiveStarsUi$1$1$5$1
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
                    onStarClick.invoke(2);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierWeight$default3, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1614875207, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUiKt$RateAppFiveStarsUi$1$1$6
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
            public final void invoke(@Nullable Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1614875207, i3, -1, "com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUi.<anonymous>.<anonymous>.<anonymous> (RateAppFiveStarsUi.kt:65)");
                    }
                    RateAppStarItemKt.RateAppStarItem(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), listOFCheckedItems.get(2).booleanValue(), composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 0, 3072, 4094);
        Modifier modifierWeight$default4 = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(760000984);
        boolean z4 = (i2 > 32 && composerStartRestartGroup.changed(onStarClick)) || (i & 48) == 32;
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUiKt$RateAppFiveStarsUi$1$1$7$1
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
                    onStarClick.invoke(3);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierWeight$default4, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1046902984, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUiKt$RateAppFiveStarsUi$1$1$8
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
            public final void invoke(@Nullable Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1046902984, i3, -1, "com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUi.<anonymous>.<anonymous>.<anonymous> (RateAppFiveStarsUi.kt:73)");
                    }
                    RateAppStarItemKt.RateAppStarItem(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), listOFCheckedItems.get(3).booleanValue(), composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 0, 3072, 4094);
        Modifier modifierWeight$default5 = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(760001322);
        boolean z5 = (i2 > 32 && composerStartRestartGroup.changed(onStarClick)) || (i & 48) == 32;
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (z5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUiKt$RateAppFiveStarsUi$1$1$9$1
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
                    onStarClick.invoke(4);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierWeight$default5, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue5, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 478930761, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUiKt$RateAppFiveStarsUi$1$1$10
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
            public final void invoke(@Nullable Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(478930761, i3, -1, "com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUi.<anonymous>.<anonymous>.<anonymous> (RateAppFiveStarsUi.kt:81)");
                    }
                    RateAppStarItemKt.RateAppStarItem(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), listOFCheckedItems.get(4).booleanValue(), composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 0, 3072, 4094);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUiKt.RateAppFiveStarsUi.2
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
                    RateAppFiveStarsUiKt.RateAppFiveStarsUi(listOFCheckedItems, onStarClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewRateAppFiveStarsUi(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1192105793);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1192105793, i, -1, "com.blackhub.bronline.game.ui.rateapp.PreviewRateAppFiveStarsUi (RateAppFiveStarsUi.kt:93)");
            }
            Boolean bool = Boolean.TRUE;
            RateAppFiveStarsUi(CollectionsKt__CollectionsKt.listOf((Object[]) new Boolean[]{bool, bool, bool, bool, Boolean.FALSE}), new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUiKt.PreviewRateAppFiveStarsUi.1
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppFiveStarsUiKt.PreviewRateAppFiveStarsUi.2
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
                    RateAppFiveStarsUiKt.PreviewRateAppFiveStarsUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
