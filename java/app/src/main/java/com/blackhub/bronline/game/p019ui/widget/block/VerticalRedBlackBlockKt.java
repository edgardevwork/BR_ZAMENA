package com.blackhub.bronline.game.p019ui.widget.block;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import com.blackhub.bronline.game.p019ui.widget.other.NarrowOvalWithGradientKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VerticalRedBlackBlock.kt */
/* loaded from: classes3.dex */
public final class VerticalRedBlackBlockKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void VerticalRedBlackBlock(@Nullable Modifier modifier, @NotNull final String title, @NotNull final Function0<Unit> onCloseClick, @NotNull final Function2<? super Composer, ? super Integer, Unit> bottomBlock, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(bottomBlock, "bottomBlock");
        Composer composerStartRestartGroup = composer.startRestartGroup(1612605445);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(bottomBlock) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1612605445, i3, -1, "com.blackhub.bronline.game.ui.widget.block.VerticalRedBlackBlock (VerticalRedBlackBlock.kt:37)");
            }
            final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composerStartRestartGroup, 6);
            final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._16sdp, composerStartRestartGroup, 6);
            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth(modifier4, 0.6f), PrimitiveResources_androidKt.dimensionResource(R.dimen._249sdp, composerStartRestartGroup, 6));
            RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._13sdp, composerStartRestartGroup, 6));
            Color.Companion companion = Color.INSTANCE;
            long jM11366getBlack0d7_KjU = companion.m11366getBlack0d7_KjU();
            BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composerStartRestartGroup, 6), companion.m11377getWhite0d7_KjU());
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 382365408, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.VerticalRedBlackBlockKt.VerticalRedBlackBlock.1
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
                public final void invoke(@Nullable Composer composer3, int i5) {
                    if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(382365408, i5, -1, "com.blackhub.bronline.game.ui.widget.block.VerticalRedBlackBlock.<anonymous> (VerticalRedBlackBlock.kt:53)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final String str = title;
                        final float f = fDimensionResource;
                        final float f2 = fDimensionResource2;
                        final Function0<Unit> function0 = onCloseClick;
                        final Function2<Composer, Integer, Unit> function2 = bottomBlock;
                        composer3.startReplaceableGroup(-270267587);
                        composer3.startReplaceableGroup(-3687241);
                        Object objRememberedValue = composer3.rememberedValue();
                        Composer.Companion companion2 = Composer.INSTANCE;
                        if (objRememberedValue == companion2.getEmpty()) {
                            objRememberedValue = new Measurer();
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceableGroup();
                        final Measurer measurer = (Measurer) objRememberedValue;
                        composer3.startReplaceableGroup(-3687241);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (objRememberedValue2 == companion2.getEmpty()) {
                            objRememberedValue2 = new ConstraintLayoutScope();
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                        composer3.startReplaceableGroup(-3687241);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (objRememberedValue3 == companion2.getEmpty()) {
                            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        composer3.endReplaceableGroup();
                        Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue3, measurer, composer3, 4544);
                        MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
                        final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
                        final int i6 = 6;
                        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.VerticalRedBlackBlockKt$VerticalRedBlackBlock$1$invoke$$inlined$ConstraintLayout$1
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
                        }, 1, null), ComposableLambdaKt.composableLambda(composer3, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.VerticalRedBlackBlockKt$VerticalRedBlackBlock$1$invoke$$inlined$ConstraintLayout$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i7) {
                                if (((i7 & 11) ^ 2) != 0 || !composer4.getSkipping()) {
                                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                    constraintLayoutScope.reset();
                                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                                    ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                                    ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                                    ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                                    String str2 = str;
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    TextKt.m10024Text4IGK_g(str2, constraintLayoutScope2.constrainAs(SizeKt.fillMaxWidth$default(PaddingKt.m8123padding3ABfNKs(BackgroundKt.m7771backgroundbw27NRU$default(companion3, ColorResources_androidKt.colorResource(R.color.red, composer4, 6), null, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._11sdp, composer4, 6)), 0.0f, 1, null), constrainedLayoutReferenceComponent1, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.VerticalRedBlackBlockKt$VerticalRedBlackBlock$1$1$1
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
                                    }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(TextAlign.INSTANCE.m13558getCentere0LSkKk()), 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14796montserratBold17spOr13ssp67j0QOw(0L, 0, 0L, 0.0f, composer4, CpioConstants.C_ISBLK, 15), composer4, 0, 3072, 56828);
                                    Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._231sdp, composer4, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composer4, 6));
                                    composer4.startReplaceableGroup(270045777);
                                    boolean zChanged = composer4.changed(f);
                                    Object objRememberedValue4 = composer4.rememberedValue();
                                    if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        final float f3 = f;
                                        objRememberedValue4 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.VerticalRedBlackBlockKt$VerticalRedBlackBlock$1$1$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f3, 0.0f, 4, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer4.endReplaceableGroup();
                                    NarrowOvalWithGradientKt.NarrowOvalWithGradient(constraintLayoutScope2.constrainAs(modifierM8174sizeVpY3zN4, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue4), null, composer4, 0, 2);
                                    composer4.startReplaceableGroup(270046082);
                                    boolean zChanged2 = composer4.changed(constrainedLayoutReferenceComponent1) | composer4.changed(f2);
                                    Object objRememberedValue5 = composer4.rememberedValue();
                                    if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        final float f4 = f2;
                                        objRememberedValue5 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.VerticalRedBlackBlockKt$VerticalRedBlackBlock$1$1$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getTop(), 0.0f, 0.0f, 6, null);
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), f4, 0.0f, 4, null);
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue5);
                                    }
                                    composer4.endReplaceableGroup();
                                    Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion3, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue5);
                                    composer4.startReplaceableGroup(270046325);
                                    boolean zChanged3 = composer4.changed(function0);
                                    Object objRememberedValue6 = composer4.rememberedValue();
                                    if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        final Function0 function02 = function0;
                                        objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.VerticalRedBlackBlockKt$VerticalRedBlackBlock$1$1$4$1
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
                                                function02.invoke();
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue6);
                                    }
                                    composer4.endReplaceableGroup();
                                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierConstrainAs, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue6, ComposableSingletons$VerticalRedBlackBlockKt.INSTANCE.m15046getLambda1$app_siteRelease(), composer4, 0, 3072, 4094);
                                    composer4.startReplaceableGroup(270046706);
                                    boolean zChanged4 = composer4.changed(constrainedLayoutReferenceComponent1);
                                    Object objRememberedValue7 = composer4.rememberedValue();
                                    if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue7 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.VerticalRedBlackBlockKt$VerticalRedBlackBlock$1$1$5$1
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
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                Dimension.Companion companion4 = Dimension.INSTANCE;
                                                constrainAs.setHeight(companion4.getFillToConstraints());
                                                constrainAs.setWidth(companion4.getFillToConstraints());
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue7);
                                    }
                                    composer4.endReplaceableGroup();
                                    Modifier modifierM8124paddingVpY3zN4 = PaddingKt.m8124paddingVpY3zN4(constraintLayoutScope2.constrainAs(companion3, constrainedLayoutReferenceComponent4, (Function1) objRememberedValue7), PrimitiveResources_androidKt.dimensionResource(R.dimen._11sdp, composer4, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._14sdp, composer4, 6));
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    composer4.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 6);
                                    composer4.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8124paddingVpY3zN4);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function2.invoke(composer4, 0);
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                        function0Component2.invoke();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), measurePolicyComponent1, composer3, 48, 0);
                        composer3.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            });
            composer2 = composerStartRestartGroup;
            Modifier modifier5 = modifier4;
            SurfaceKt.m9876SurfaceT9BRK9s(modifierM8158height3ABfNKs, roundedCornerShapeM8392RoundedCornerShape0680j_4, jM11366getBlack0d7_KjU, 0L, 0.0f, 0.0f, borderStrokeM7798BorderStrokecXLIe8U, composableLambda, composer2, 12583296, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.VerticalRedBlackBlockKt.VerticalRedBlackBlock.2
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

                public final void invoke(@Nullable Composer composer3, int i5) {
                    VerticalRedBlackBlockKt.VerticalRedBlackBlock(modifier3, title, onCloseClick, bottomBlock, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "VerticalRedBlackBlock")
    public static final void PreviewVerticalRedBlackBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1995354989);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1995354989, i, -1, "com.blackhub.bronline.game.ui.widget.block.PreviewVerticalRedBlackBlock (VerticalRedBlackBlock.kt:123)");
            }
            VerticalRedBlackBlock(SizeKt.m8174sizeVpY3zN4(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._383sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._249sdp, composerStartRestartGroup, 6)), "РЕГИСТРАЦИЯ В КОНКУРСЕ", new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.VerticalRedBlackBlockKt.PreviewVerticalRedBlackBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, ComposableSingletons$VerticalRedBlackBlockKt.INSTANCE.m15047getLambda2$app_siteRelease(), composerStartRestartGroup, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.VerticalRedBlackBlockKt.PreviewVerticalRedBlackBlock.2
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
                    VerticalRedBlackBlockKt.PreviewVerticalRedBlackBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

