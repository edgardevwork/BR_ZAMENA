package com.blackhub.bronline.game.p019ui.cases.uiblock;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import coil.compose.SingletonAsyncImageKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.widget.shape.TrapezoidShapeKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesRewardBlock.kt */
@SourceDebugExtension({"SMAP\nCasesRewardBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesRewardBlock.kt\ncom/blackhub/bronline/game/ui/cases/uiblock/CasesRewardBlockKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,120:1\n68#2,6:121\n74#2:155\n78#2:192\n79#3,11:127\n92#3:191\n456#4,8:138\n464#4,3:152\n25#4:161\n467#4,3:188\n3737#5,6:146\n72#6,5:156\n77#6,20:168\n955#7,6:162\n74#8:193\n*S KotlinDebug\n*F\n+ 1 CasesRewardBlock.kt\ncom/blackhub/bronline/game/ui/cases/uiblock/CasesRewardBlockKt\n*L\n43#1:121,6\n43#1:155\n43#1:192\n43#1:127,11\n43#1:191\n43#1:138,8\n43#1:152,3\n45#1:161\n43#1:188,3\n43#1:146,6\n45#1:156,5\n45#1:168,20\n45#1:162,6\n115#1:193\n*E\n"})

public final class CasesRewardBlockKt {
    public static final float SCALE_Y_FOR_OVAL = 0.23f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CasesRewardBlock(@Nullable Modifier modifier, @Nullable final Bitmap bitmap, @Nullable final Integer num, @Nullable Composer composer, final int i, final int i2) {
        float fDimensionResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(1797530325);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1797530325, i, -1, "com.blackhub.bronline.game.ui.cases.uiblock.CasesRewardBlock (CasesRewardBlock.kt:36)");
        }
        if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 0)) {
            composerStartRestartGroup.startReplaceableGroup(-488658161);
            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._130wdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-488658106);
            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._170wdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        }
        final float f = fDimensionResource;
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-270267587);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Measurer();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Measurer measurer = (Measurer) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new ConstraintLayoutScope();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue3, measurer, composerStartRestartGroup, 4544);
        MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
        final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
        final int i3 = 0;
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(companion2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesRewardBlockKt$CasesRewardBlock$lambda$3$$inlined$ConstraintLayout$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                ToolingUtilsKt.setDesignInfoProvider(semantics, measurer);
            }
        }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesRewardBlockKt$CasesRewardBlock$lambda$3$$inlined$ConstraintLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                invoke(composer2, num2.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer2, int i4) {
                if (((i4 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                    final ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM13954createGuidelineFromTop0680j_4 = constraintLayoutScope2.m13954createGuidelineFromTop0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._192wdp, composer2, 6));
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    TrapezoidShapeKt.TrapezoidShape(constraintLayoutScope2.constrainAs(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._224wdp, composer2, 6)), constrainedLayoutReferenceComponent1, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesRewardBlockKt$CasesRewardBlock$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                            invoke2(constrainScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                        }
                    }), null, null, composer2, 0, 6);
                    Modifier modifierBackground$default = BackgroundKt.background$default(ScaleKt.scale(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 1.0f, false, 2, null), 1.0f, 0.23f), Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white_80, composer2, 6)), Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU())}), 0L, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                    composer2.startReplaceableGroup(622749287);
                    boolean zChanged = composer2.changed(constrainedLayoutReferenceComponent1);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesRewardBlockKt$CasesRewardBlock$1$1$2$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    BoxKt.Box(constraintLayoutScope2.constrainAs(modifierBackground$default, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue4), composer2, 0);
                    Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, f), PrimitiveResources_androidKt.dimensionResource(R.dimen._210wdp, composer2, 6));
                    composer2.startReplaceableGroup(622749768);
                    boolean zChanged2 = composer2.changed(horizontalAnchorM13954createGuidelineFromTop0680j_4);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesRewardBlockKt$CasesRewardBlock$1$1$3$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), horizontalAnchorM13954createGuidelineFromTop0680j_4, 0.0f, 0.0f, 6, null);
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), horizontalAnchorM13954createGuidelineFromTop0680j_4, 0.0f, 0.0f, 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    SingletonAsyncImageKt.m14279AsyncImage3HmZ8SU(bitmap, null, constraintLayoutScope2.constrainAs(modifierM8177width3ABfNKs, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue5), null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, composer2, 1572920, 952);
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        function0Component2.invoke();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), measurePolicyComponent1, composerStartRestartGroup, 48, 0);
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
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesRewardBlockKt.CasesRewardBlock.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                    invoke(composer2, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    CasesRewardBlockKt.CasesRewardBlock(modifier3, bitmap, num, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCasesRewardBlockUI(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1528468364);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1528468364, i, -1, "com.blackhub.bronline.game.ui.cases.uiblock.PreviewCasesRewardBlockUI (CasesRewardBlock.kt:107)");
            }
            Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._270wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._287wdp, composerStartRestartGroup, 6));
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            CasesRewardBlock(modifierM8174sizeVpY3zN4, BitmapUtilsKt.getBitmap(resources, R.drawable.img_car_award_id_2402), null, composerStartRestartGroup, 448, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesRewardBlockKt.PreviewCasesRewardBlockUI.1
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
                    CasesRewardBlockKt.PreviewCasesRewardBlockUI(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

