package com.blackhub.bronline.game.p019ui.bprewards;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
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
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.bless.client.R;
import com.google.firebase.perf.util.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BpRewardsFilterButtonItem.kt */
@SourceDebugExtension({"SMAP\nBpRewardsFilterButtonItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsFilterButtonItem.kt\ncom/blackhub/bronline/game/ui/bprewards/BpRewardsFilterButtonItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,117:1\n1116#2,6:118\n1116#2,6:159\n1116#2,6:170\n68#3,6:124\n74#3:158\n78#3:169\n79#4,11:130\n92#4:168\n456#5,8:141\n464#5,3:155\n467#5,3:165\n3737#6,6:149\n81#7:176\n*S KotlinDebug\n*F\n+ 1 BpRewardsFilterButtonItem.kt\ncom/blackhub/bronline/game/ui/bprewards/BpRewardsFilterButtonItemKt\n*L\n60#1:118,6\n82#1:159,6\n112#1:170,6\n73#1:124,6\n73#1:158\n73#1:169\n73#1:130,11\n73#1:168\n73#1:141,8\n73#1:155,3\n73#1:165,3\n73#1:149,6\n60#1:176\n*E\n"})

public final class BpRewardsFilterButtonItemKt {
    public static final float HALF_ALPHA = 0.5f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BpRewardsFilterButtonItem(@Nullable Modifier modifier, @Nullable final Bitmap bitmap, final boolean z, @NotNull final MutableState<Boolean> isEnabledState, boolean z2, float f, final int i, @NotNull final Function0<Unit> onStartBtnClick, @Nullable Composer composer, final int i2, final int i3) {
        final float f2;
        int i4;
        boolean z3;
        int i5;
        Composer composer2;
        Intrinsics.checkNotNullParameter(isEnabledState, "isEnabledState");
        Intrinsics.checkNotNullParameter(onStartBtnClick, "onStartBtnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1806643002);
        Modifier modifier2 = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        boolean z4 = (i3 & 16) != 0 ? true : z2;
        if ((i3 & 32) != 0) {
            f2 = z ? 1.0f : 0.5f;
            i4 = (-458753) & i2;
        } else {
            f2 = f;
            i4 = i2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1806643002, i4, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsFilterButtonItem (BpRewardsFilterButtonItem.kt:46)");
        }
        final Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6));
        final BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.darker_gray_blue, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(1785371828);
        boolean z5 = (((i2 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(z)) || (i2 & 384) == 256;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            z3 = false;
            final Modifier modifier3 = modifier2;
            i5 = 6;
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Modifier>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsFilterButtonItemKt$BpRewardsFilterButtonItem$tempModifier$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Modifier invoke() {
                    if (z) {
                        return BorderKt.border(BackgroundKt.background$default(modifier3, brushM11297verticalGradient8A3gB4$default, roundedCornerShapeM8392RoundedCornerShape0680j_4, 0.0f, 4, null), borderStrokeM7798BorderStrokecXLIe8U, roundedCornerShapeM8392RoundedCornerShape0680j_4);
                    }
                    return modifier3;
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        } else {
            z3 = false;
            i5 = 6;
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(BpRewardsFilterButtonItem$lambda$1((State) objRememberedValue), PrimitiveResources_androidKt.dimensionResource(R.dimen._38wdp, composerStartRestartGroup, i5));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), z3, composerStartRestartGroup, z3 ? 1 : 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, z3 ? 1 : 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(z3 ? 1 : 0));
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(506033350);
        if ((((29360128 & i2) ^ 12582912) > 8388608 && composerStartRestartGroup.changed(onStartBtnClick)) || (i2 & 12582912) == 8388608) {
            z3 = true;
        }
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsFilterButtonItemKt$BpRewardsFilterButtonItem$1$1$1
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
                    onStartBtnClick.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final float f3 = f2;
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierFillMaxSize$default, null, z4, isEnabledState, true, false, false, false, null, 0, 0L, (Function0) objRememberedValue2, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -376396325, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsFilterButtonItemKt$BpRewardsFilterButtonItem$1$2
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
            public final void invoke(@Nullable Composer composer3, int i6) {
                if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-376396325, i6, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsFilterButtonItem.<anonymous>.<anonymous> (BpRewardsFilterButtonItem.kt:83)");
                    }
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap, AlphaKt.alpha(SizeKt.m8172size3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), PrimitiveResources_androidKt.dimensionResource(R.dimen._22wdp, composer3, 6)), f2), null, null, 0.0f, ColorFilter.Companion.m11381tintxETnrds$default(ColorFilter.INSTANCE, ColorResources_androidKt.colorResource(R.color.white, composer3, 6), 0, 2, null), 0, composer3, 8, 92);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composerStartRestartGroup, ((i4 >> 6) & 896) | 24582 | (i4 & 7168), 3072, 6114);
        composerStartRestartGroup.startReplaceableGroup(1785372849);
        if (i > 0) {
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6)), companion.getTopEnd());
            composer2 = composerStartRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_alarm, composerStartRestartGroup, 6), (String) null, modifierAlign, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
        } else {
            composer2 = composerStartRestartGroup;
        }
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final boolean z6 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsFilterButtonItemKt.BpRewardsFilterButtonItem.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i6) {
                    BpRewardsFilterButtonItemKt.BpRewardsFilterButtonItem(modifier4, bitmap, z, isEnabledState, z6, f3, i, onStartBtnClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void BpRewardsButtonItemPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(809832718);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(809832718, i, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsButtonItemPreview (BpRewardsFilterButtonItem.kt:108)");
            }
            composerStartRestartGroup.startReplaceableGroup(1875364410);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BpRewardsFilterButtonItem(null, null, true, (MutableState) objRememberedValue, false, 0.0f, 1, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsFilterButtonItemKt.BpRewardsButtonItemPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 14159280, 49);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsFilterButtonItemKt.BpRewardsButtonItemPreview.3
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
                    BpRewardsFilterButtonItemKt.BpRewardsButtonItemPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Modifier BpRewardsFilterButtonItem$lambda$1(State<? extends Modifier> state) {
        return state.getValue();
    }
}

