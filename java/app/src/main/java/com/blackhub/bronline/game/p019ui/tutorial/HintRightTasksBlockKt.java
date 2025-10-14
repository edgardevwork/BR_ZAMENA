package com.blackhub.bronline.game.p019ui.tutorial;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.gui.tutorialhints.HintQuestData;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.ColoredRectangleKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HintRightTasksBlock.kt */
@SourceDebugExtension({"SMAP\nHintRightTasksBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HintRightTasksBlock.kt\ncom/blackhub/bronline/game/ui/tutorial/HintRightTasksBlockKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,133:1\n1116#2,6:134\n*S KotlinDebug\n*F\n+ 1 HintRightTasksBlock.kt\ncom/blackhub/bronline/game/ui/tutorial/HintRightTasksBlockKt\n*L\n36#1:134,6\n*E\n"})

public final class HintRightTasksBlockKt {
    public static final int ON_CLICK_ANIMATION_DURATION = 500;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HintRightTasksBlock(@Nullable Modifier modifier, @NotNull final List<HintQuestData> tasksGeneralList, @NotNull final List<HintQuestData> tasksAdditionalList, @NotNull final Function0<Unit> onClickTask, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(tasksGeneralList, "tasksGeneralList");
        Intrinsics.checkNotNullParameter(tasksAdditionalList, "tasksAdditionalList");
        Intrinsics.checkNotNullParameter(onClickTask, "onClickTask");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1751508151);
        final Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1751508151, i, -1, "com.blackhub.bronline.game.ui.tutorial.HintRightTasksBlock (HintRightTasksBlock.kt:32)");
        }
        composerStartRestartGroup.startReplaceableGroup(277361192);
        boolean z = (((i & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(onClickTask)) || (i & 3072) == 2048;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.HintRightTasksBlockKt$HintRightTasksBlock$1$1
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
                    onClickTask.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Modifier modifier3 = modifier2;
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 500, 0L, null, (Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -287166694, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.HintRightTasksBlockKt.HintRightTasksBlock.2
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
                long jM11350unboximpl;
                long jM11350unboximpl2;
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-287166694, i3, -1, "com.blackhub.bronline.game.ui.tutorial.HintRightTasksBlock.<anonymous> (HintRightTasksBlock.kt:37)");
                    }
                    final List<HintQuestData> list = tasksGeneralList;
                    final List<HintQuestData> list2 = tasksAdditionalList;
                    Modifier modifier4 = modifier2;
                    composer2.startReplaceableGroup(-483455358);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String strStringResource = StringResources_androidKt.stringResource(R.string.tutorial_general_task, composer2, 6);
                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composer2, 6), 0.0f, 0.0f, 12, null);
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    HintQuestData hintQuestData = (HintQuestData) CollectionsKt___CollectionsKt.firstOrNull((List) list);
                    Color colorM11330boximpl = hintQuestData != null ? Color.m11330boximpl(hintQuestData.m14762getProgressBarColor0d7_KjU()) : null;
                    composer2.startReplaceableGroup(1272927368);
                    if (colorM11330boximpl != null) {
                        jM11350unboximpl = colorM11330boximpl.m11350unboximpl();
                    } else {
                        jM11350unboximpl = ColorResources_androidKt.colorResource(R.color.light_yellow, composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    TextKt.m10024Text4IGK_g(strStringResource, modifierM8127paddingqDBjuR0$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14860montserratSemiBold8spOr6ssp67j0QOw(jM11350unboximpl, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 14), composer2, 0, 0, 65532);
                    LazyDslKt.LazyColumn(PaddingKt.m8127paddingqDBjuR0$default(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composer2, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composer2, 6), 2, null), null, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.HintRightTasksBlockKt$HintRightTasksBlock$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                            invoke2(lazyListScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull LazyListScope LazyColumn) {
                            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                            final List<HintQuestData> list3 = list;
                            final C6096x8c4c4bca c6096x8c4c4bca = new Function1() { // from class: com.blackhub.bronline.game.ui.tutorial.HintRightTasksBlockKt$HintRightTasksBlock$2$1$1$invoke$$inlined$items$default$1
                                @Override // kotlin.jvm.functions.Function1
                                @Nullable
                                public final Void invoke(HintQuestData hintQuestData2) {
                                    return null;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke((HintQuestData) obj);
                                }
                            };
                            LazyColumn.items(list3.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.tutorial.HintRightTasksBlockKt$HintRightTasksBlock$2$1$1$invoke$$inlined$items$default$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                    return invoke(num.intValue());
                                }

                                @Nullable
                                public final Object invoke(int i4) {
                                    return c6096x8c4c4bca.invoke(list3.get(i4));
                                }
                            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.HintRightTasksBlockKt$HintRightTasksBlock$2$1$1$invoke$$inlined$items$default$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                    invoke(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull LazyItemScope lazyItemScope, int i4, @Nullable Composer composer3, int i5) {
                                    int i6;
                                    if ((i5 & 14) == 0) {
                                        i6 = (composer3.changed(lazyItemScope) ? 4 : 2) | i5;
                                    } else {
                                        i6 = i5;
                                    }
                                    if ((i5 & 112) == 0) {
                                        i6 |= composer3.changed(i4) ? 32 : 16;
                                    }
                                    if ((i6 & 731) == 146 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-632812321, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                    }
                                    TaskHintRightItemKt.TaskHintRightItem(null, (HintQuestData) list3.get(i4), composer3, 64, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                        }
                    }, composer2, 0, 254);
                    composer2.startReplaceableGroup(1455004542);
                    if (!list2.isEmpty()) {
                        ColoredRectangleKt.ColoredRectangle(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composer2, 6), 7, null), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6)), Brush.Companion.m11291linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composer2, 6)), Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU())}), 0L, 0L, 0, 14, (Object) null), composer2, 0, 0);
                        String strStringResource2 = StringResources_androidKt.stringResource(R.string.tutorial_additional_tasks, composer2, 6);
                        Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(modifier4, PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composer2, 6), 0.0f, 2, null);
                        HintQuestData hintQuestData2 = (HintQuestData) CollectionsKt___CollectionsKt.firstOrNull((List) list2);
                        Color colorM11330boximpl2 = hintQuestData2 != null ? Color.m11330boximpl(hintQuestData2.m14762getProgressBarColor0d7_KjU()) : null;
                        composer2.startReplaceableGroup(1272928892);
                        if (colorM11330boximpl2 != null) {
                            jM11350unboximpl2 = colorM11330boximpl2.m11350unboximpl();
                        } else {
                            jM11350unboximpl2 = ColorResources_androidKt.colorResource(R.color.light_yellow, composer2, 6);
                        }
                        long j = jM11350unboximpl2;
                        composer2.endReplaceableGroup();
                        TextKt.m10024Text4IGK_g(strStringResource2, modifierM8125paddingVpY3zN4$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14860montserratSemiBold8spOr6ssp67j0QOw(j, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 14), composer2, 0, 0, 65532);
                        LazyDslKt.LazyColumn(PaddingKt.m8127paddingqDBjuR0$default(modifier4, PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composer2, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composer2, 6), 2, null), null, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.HintRightTasksBlockKt$HintRightTasksBlock$2$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                                invoke2(lazyListScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull LazyListScope LazyColumn) {
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                final List<HintQuestData> list3 = list2;
                                final C6100xa2407cb c6100xa2407cb = new Function1() { // from class: com.blackhub.bronline.game.ui.tutorial.HintRightTasksBlockKt$HintRightTasksBlock$2$1$2$invoke$$inlined$items$default$1
                                    @Override // kotlin.jvm.functions.Function1
                                    @Nullable
                                    public final Void invoke(HintQuestData hintQuestData3) {
                                        return null;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke((HintQuestData) obj);
                                    }
                                };
                                LazyColumn.items(list3.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.tutorial.HintRightTasksBlockKt$HintRightTasksBlock$2$1$2$invoke$$inlined$items$default$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    @Nullable
                                    public final Object invoke(int i4) {
                                        return c6100xa2407cb.invoke(list3.get(i4));
                                    }
                                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.HintRightTasksBlockKt$HintRightTasksBlock$2$1$2$invoke$$inlined$items$default$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                        invoke(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@NotNull LazyItemScope lazyItemScope, int i4, @Nullable Composer composer3, int i5) {
                                        int i6;
                                        if ((i5 & 14) == 0) {
                                            i6 = (composer3.changed(lazyItemScope) ? 4 : 2) | i5;
                                        } else {
                                            i6 = i5;
                                        }
                                        if ((i5 & 112) == 0) {
                                            i6 |= composer3.changed(i4) ? 32 : 16;
                                        }
                                        if ((i6 & 731) == 146 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-632812321, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                        }
                                        TaskHintRightItemKt.TaskHintRightItem(null, (HintQuestData) list3.get(i4), composer3, 64, 1);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                            }
                        }, composer2, 0, 254);
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
        }), composerStartRestartGroup, 805306368, 3072, 3583);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.HintRightTasksBlockKt.HintRightTasksBlock.3
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
                    HintRightTasksBlockKt.HintRightTasksBlock(modifier3, tasksGeneralList, tasksAdditionalList, onClickTask, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "HintRightTasksBlock")
    public static final void PreviewHintRightTasksBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-946163374);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-946163374, i, -1, "com.blackhub.bronline.game.ui.tutorial.PreviewHintRightTasksBlock (HintRightTasksBlock.kt:103)");
            }
            HintRightTasksBlock(null, CollectionsKt__CollectionsJVMKt.listOf(new HintQuestData(StringExtensionKt.htmlStringToSpanned("Эвакуировать газовый балон в <font color=#FFBAFA>безопасную зону</font>.\nЗатушить бочку с горючим при помощи огнетушителя.\nПосрать."), 2, 3, ColorResources_androidKt.colorResource(R.color.light_yellow, composerStartRestartGroup, 6), false, null)), CollectionsKt__CollectionsKt.listOf((Object[]) new HintQuestData[]{new HintQuestData(StringExtensionKt.htmlStringToSpanned("Эвакуировать газовый балон в <font color=#384DF1>безопасную зону</font>.\nЗатушить бочку с горючим при помощи огнетушителя.\nПосрать."), 2, 6, ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6), false, null), new HintQuestData(StringExtensionKt.htmlStringToSpanned("Эвакуировать газовый балон в <font color=#FF990A>безопасную зону</font>.\nЗатушить бочку с горючим при помощи огнетушителя.\nПосрать."), 4, 9, ColorResources_androidKt.colorResource(R.color.light_green, composerStartRestartGroup, 6), false, null)}), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.HintRightTasksBlockKt.PreviewHintRightTasksBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 3648, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.HintRightTasksBlockKt.PreviewHintRightTasksBlock.2
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
                    HintRightTasksBlockKt.PreviewHintRightTasksBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

