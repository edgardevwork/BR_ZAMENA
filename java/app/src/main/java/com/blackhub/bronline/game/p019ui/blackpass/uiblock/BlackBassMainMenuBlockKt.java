package com.blackhub.bronline.game.p019ui.blackpass.uiblock;

import androidx.annotation.ColorRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackBassMainMenuBlock.kt */
@SourceDebugExtension({"SMAP\nBlackBassMainMenuBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackBassMainMenuBlock.kt\ncom/blackhub/bronline/game/ui/blackpass/uiblock/BlackBassMainMenuBlockKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,111:1\n88#2,5:112\n93#2:145\n97#2:168\n79#3,11:117\n92#3:167\n456#4,8:128\n464#4,3:142\n467#4,3:164\n3737#5,6:136\n1116#6,6:146\n1116#6,6:152\n1116#6,6:158\n*S KotlinDebug\n*F\n+ 1 BlackBassMainMenuBlock.kt\ncom/blackhub/bronline/game/ui/blackpass/uiblock/BlackBassMainMenuBlockKt\n*L\n38#1:112,5\n38#1:145\n38#1:168\n38#1:117,11\n38#1:167\n38#1:128,8\n38#1:142,3\n38#1:164,3\n38#1:136,6\n51#1:146,6\n69#1:152,6\n86#1:158,6\n*E\n"})
/* loaded from: classes.dex */
public final class BlackBassMainMenuBlockKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BlackBassMainMenuBlock(@ColorRes final int i, @ColorRes final int i2, @ColorRes final int i3, @ColorRes final int i4, @ColorRes final int i5, @ColorRes final int i6, @NotNull final Function1<? super Integer, Unit> onClick, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1548294188);
        if ((i7 & 14) == 0) {
            i8 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 112) == 0) {
            i8 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i7 & 896) == 0) {
            i8 |= composerStartRestartGroup.changed(i3) ? 256 : 128;
        }
        if ((i7 & 7168) == 0) {
            i8 |= composerStartRestartGroup.changed(i4) ? 2048 : 1024;
        }
        if ((57344 & i7) == 0) {
            i8 |= composerStartRestartGroup.changed(i5) ? 16384 : 8192;
        }
        if ((458752 & i7) == 0) {
            i8 |= composerStartRestartGroup.changed(i6) ? 131072 : 65536;
        }
        if ((i7 & 3670016) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onClick) ? 1048576 : 524288;
        }
        int i9 = i8;
        if ((2995931 & i9) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548294188, i9, -1, "com.blackhub.bronline.game.ui.blackpass.uiblock.BlackBassMainMenuBlock (BlackBassMainMenuBlock.kt:36)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._33wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._139wdp, composerStartRestartGroup, 6));
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(BackgroundKt.m7770backgroundbw27NRU(companion, ColorResources_androidKt.colorResource(i2, composerStartRestartGroup, (i9 >> 3) & 14), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6))), PrimitiveResources_androidKt.dimensionResource(R.dimen._33wdp, composerStartRestartGroup, 6));
            composerStartRestartGroup.startReplaceableGroup(1442932350);
            int i10 = i9 & 3670016;
            boolean z = i10 == 1048576;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackBassMainMenuBlockKt$BlackBassMainMenuBlock$1$1$1
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
                        onClick.invoke(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1628250919, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackBassMainMenuBlockKt$BlackBassMainMenuBlock$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                public final void invoke(@Nullable Composer composer3, int i11) {
                    if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1628250919, i11, -1, "com.blackhub.bronline.game.ui.blackpass.uiblock.BlackBassMainMenuBlock.<anonymous>.<anonymous> (BlackBassMainMenuBlock.kt:52)");
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_bp, composer3, 6), (String) null, SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composer3, 6)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m11381tintxETnrds$default(ColorFilter.INSTANCE, ColorResources_androidKt.colorResource(i, composer3, 0), 0, 2, null), composer3, 56, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 0, 3072, 4094);
            Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(BackgroundKt.m7770backgroundbw27NRU(companion, ColorResources_androidKt.colorResource(i4, composerStartRestartGroup, (i9 >> 9) & 14), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6))), PrimitiveResources_androidKt.dimensionResource(R.dimen._33wdp, composerStartRestartGroup, 6));
            composerStartRestartGroup.startReplaceableGroup(1442933067);
            boolean z2 = i10 == 1048576;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackBassMainMenuBlockKt$BlackBassMainMenuBlock$1$3$1
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
                        onClick.invoke(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs2, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 648207810, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackBassMainMenuBlockKt$BlackBassMainMenuBlock$1$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                public final void invoke(@Nullable Composer composer3, int i11) {
                    if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(648207810, i11, -1, "com.blackhub.bronline.game.ui.blackpass.uiblock.BlackBassMainMenuBlock.<anonymous>.<anonymous> (BlackBassMainMenuBlock.kt:70)");
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_checklist, composer3, 6), (String) null, SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composer3, 6)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m11381tintxETnrds$default(ColorFilter.INSTANCE, ColorResources_androidKt.colorResource(i3, composer3, 0), 0, 2, null), composer3, 56, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 0, 3072, 4094);
            Modifier modifierM8172size3ABfNKs3 = SizeKt.m8172size3ABfNKs(BackgroundKt.m7770backgroundbw27NRU(companion, ColorResources_androidKt.colorResource(i6, composerStartRestartGroup, (i9 >> 15) & 14), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6))), PrimitiveResources_androidKt.dimensionResource(R.dimen._33wdp, composerStartRestartGroup, 6));
            composerStartRestartGroup.startReplaceableGroup(1442933775);
            boolean z3 = i10 == 1048576;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackBassMainMenuBlockKt$BlackBassMainMenuBlock$1$5$1
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
                        onClick.invoke(3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs3, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1798040097, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackBassMainMenuBlockKt$BlackBassMainMenuBlock$1$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                public final void invoke(@Nullable Composer composer3, int i11) {
                    if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1798040097, i11, -1, "com.blackhub.bronline.game.ui.blackpass.uiblock.BlackBassMainMenuBlock.<anonymous>.<anonymous> (BlackBassMainMenuBlock.kt:87)");
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_rating, composer3, 6), (String) null, SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composer3, 6)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m11381tintxETnrds$default(ColorFilter.INSTANCE, ColorResources_androidKt.colorResource(i5, composer3, 0), 0, 2, null), composer3, 56, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, 0, 3072, 4094);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackBassMainMenuBlockKt.BlackBassMainMenuBlock.2
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

                public final void invoke(@Nullable Composer composer3, int i11) {
                    BlackBassMainMenuBlockKt.BlackBassMainMenuBlock(i, i2, i3, i4, i5, i6, onClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i7 | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void BlackBassMainMenuBlockPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1902718199);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1902718199, i, -1, "com.blackhub.bronline.game.ui.blackpass.uiblock.BlackBassMainMenuBlockPreview (BlackBassMainMenuBlock.kt:99)");
            }
            BlackBassMainMenuBlock(R.color.white, R.color.transparent, R.color.white, R.color.transparent, R.color.black, R.color.white, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackBassMainMenuBlockKt.BlackBassMainMenuBlockPreview.1
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 1797558);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackBassMainMenuBlockKt.BlackBassMainMenuBlockPreview.2
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
                    BlackBassMainMenuBlockKt.BlackBassMainMenuBlockPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

