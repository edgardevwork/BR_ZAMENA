package com.blackhub.bronline.game.p019ui.blackpass;

import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.C2046Dp;
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
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.blackpass.BlackPassMainUIState;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.p019ui.widget.other.GradientSphereKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassBoostHintUI.kt */
@SourceDebugExtension({"SMAP\nBlackPassBoostHintUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassBoostHintUI.kt\ncom/blackhub/bronline/game/ui/blackpass/BlackPassBoostHintUIKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,242:1\n74#2:243\n154#3:244\n154#3:246\n174#3:247\n88#4:245\n72#5,5:248\n77#5,20:260\n25#6:253\n955#7,6:254\n*S KotlinDebug\n*F\n+ 1 BlackPassBoostHintUI.kt\ncom/blackhub/bronline/game/ui/blackpass/BlackPassBoostHintUIKt\n*L\n85#1:243\n86#1:244\n87#1:246\n91#1:247\n86#1:245\n99#1:248,5\n99#1:260,20\n99#1:253\n99#1:254,6\n*E\n"})
/* loaded from: classes.dex */
public final class BlackPassBoostHintUIKt {
    public static final float BOX_HEIGHT = 0.7f;
    public static final float BOX_WIDTH = 0.75f;
    public static final float RADIUS_ORANGE_SHADOW = 2300.0f;
    public static final float SCALE_Y = 0.7f;
    public static final float SCALE_Y_COEFF = 1.3f;
    public static final float VIEW_HEIGHT = 0.35f;
    public static final float VIEW_WIDTH = 0.3f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BlackPassBoostHintUI(@NotNull final BlackPassMainViewModel blackPassMainViewModel, @NotNull final DonateMainViewModel donateMainViewModel, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(blackPassMainViewModel, "blackPassMainViewModel");
        Intrinsics.checkNotNullParameter(donateMainViewModel, "donateMainViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(577399471);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(577399471, i, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUI (BlackPassBoostHintUI.kt:67)");
        }
        BlackPassBoostHintContent(null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt.BlackPassBoostHintUI.1
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
                donateMainViewModel.setShowBoostLevelsHintBPView(false);
            }
        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt.BlackPassBoostHintUI.2
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
                donateMainViewModel.setShowLastChanceBPBoostView(true);
            }
        }, ((BlackPassMainUIState) FlowExtKt.collectAsStateWithLifecycle(blackPassMainViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue()).getTimerDaysAndHours().getDays(), composerStartRestartGroup, 0, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt.BlackPassBoostHintUI.3
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
                    BlackPassBoostHintUIKt.BlackPassBoostHintUI(blackPassMainViewModel, donateMainViewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BlackPassBoostHintContent(@Nullable Modifier modifier, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, final int i, @Nullable Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        Function0<Unit> function03;
        int i5;
        Function0<Unit> function04;
        final int i6;
        Modifier modifier3;
        Function0<Unit> function05;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final Function0<Unit> function06;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1555557665);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                function03 = function0;
                i4 |= composerStartRestartGroup.changedInstance(function03) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 896) == 0) {
                    function04 = function02;
                    i4 |= composerStartRestartGroup.changedInstance(function04) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i2 & 7168) == 0) {
                    i4 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
                }
                i6 = i4;
                if ((i6 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    function05 = i8 == 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt.BlackPassBoostHintContent.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    } : function03;
                    Function0<Unit> function07 = i5 == 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt.BlackPassBoostHintContent.2
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    } : function04;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1555557665, i6, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintContent (BlackPassBoostHintUI.kt:83)");
                    }
                    Configuration configuration = (Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                    final float fM13666constructorimpl = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(configuration.screenHeightDp) * 1.3f);
                    float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(configuration.screenWidthDp);
                    final float fM14409dpToPx8Feqmps = (0 - ComposeExtensionKt.m14409dpToPx8Feqmps(fM13666constructorimpl2, composerStartRestartGroup, 0)) + (ComposeExtensionKt.m14409dpToPx8Feqmps(fM13666constructorimpl2, composerStartRestartGroup, 0) / 2);
                    final float fM13666constructorimpl3 = C2046Dp.m13666constructorimpl(0.5f);
                    final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composerStartRestartGroup, 6));
                    final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._7sdp, composerStartRestartGroup, 6));
                    final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._40sdp, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-270267587);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Measurer();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final Measurer measurer = (Measurer) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ConstraintLayoutScope();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue3, measurer, composerStartRestartGroup, 4544);
                    MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
                    final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
                    final int i9 = 0;
                    final float f = 0.5f;
                    final Function0<Unit> function08 = function07;
                    final Modifier modifier4 = modifier3;
                    final Function0<Unit> function09 = function05;
                    LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(companion2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$$inlined$ConstraintLayout$1
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
                    }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$$inlined$ConstraintLayout$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i10) {
                            if (((i10 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                constraintLayoutScope.reset();
                                ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent5 = constrainedLayoutReferencesCreateRefs.component5();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent6 = constrainedLayoutReferencesCreateRefs.component6();
                                final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart = constraintLayoutScope2.createGuidelineFromStart(f);
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion3, constrainedLayoutReferenceComponent1, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$3$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                        invoke2(constrainScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                    }
                                });
                                long jColorResource = ColorResources_androidKt.colorResource(R.color.black_90, composer2, 6);
                                final Modifier modifier5 = modifier4;
                                final float f2 = fM14409dpToPx8Feqmps;
                                final float f3 = fM13666constructorimpl;
                                final Function0 function010 = function09;
                                FakeDialogKt.m15089FakeDialog3IgeMak(modifierConstrainAs, jColorResource, ComposableLambdaKt.composableLambda(composer2, -573761952, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$3$2
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
                                                ComposerKt.traceEventStart(-573761952, i11, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintContent.<anonymous>.<anonymous> (BlackPassBoostHintUI.kt:108)");
                                            }
                                            Modifier modifierScale = ScaleKt.scale(Modifier.INSTANCE, 1.0f, 0.7f);
                                            Alignment.Companion companion4 = Alignment.INSTANCE;
                                            Alignment center = companion4.getCenter();
                                            Modifier modifier6 = modifier5;
                                            float f4 = f2;
                                            float f5 = f3;
                                            final Function0<Unit> function011 = function010;
                                            composer3.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierScale);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            Modifier modifierM8083offsetVpY3zN4 = OffsetKt.m8083offsetVpY3zN4(SizeKt.fillMaxSize$default(BoxScopeInstance.INSTANCE.align(modifier6, companion4.getBottomCenter()), 0.0f, 1, null), ComposeExtensionKt.pxToDp((int) f4, composer3, 0), f5);
                                            composer3.startReplaceableGroup(-1346191265);
                                            boolean zChanged = composer3.changed(function011);
                                            Object objRememberedValue4 = composer3.rememberedValue();
                                            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$3$2$1$1$1
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
                                                        function011.invoke();
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue4);
                                            }
                                            composer3.endReplaceableGroup();
                                            Modifier modifierM7805clickableXHw0xAI$default = ClickableKt.m7805clickableXHw0xAI$default(modifierM8083offsetVpY3zN4, false, null, null, (Function0) objRememberedValue4, 7, null);
                                            Color colorM11330boximpl = Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composer3, 6));
                                            Color.Companion companion6 = Color.INSTANCE;
                                            GradientSphereKt.GradientSphere(modifierM7805clickableXHw0xAI$default, null, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{colorM11330boximpl, Color.m11330boximpl(companion6.m11366getBlack0d7_KjU()), Color.m11330boximpl(companion6.m11375getTransparent0d7_KjU())}), new Pair[0], 0.5f, 2300.0f, composer3, 225280, 2);
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 384, 0);
                                Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(BorderKt.border(BackgroundKt.m7770backgroundbw27NRU(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(companion3, 0.75f), 0.7f), ColorResources_androidKt.colorResource(R.color.black_40, composer2, 6), roundedCornerShapeM8392RoundedCornerShape0680j_4), BorderStrokeKt.m7798BorderStrokecXLIe8U(fM13666constructorimpl3, Color.INSTANCE.m11377getWhite0d7_KjU()), roundedCornerShapeM8392RoundedCornerShape0680j_4), constrainedLayoutReferenceComponent2, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$3$3
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                        invoke2(constrainScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                    }
                                });
                                composer2.startReplaceableGroup(733328855);
                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierConstrainAs2);
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
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(2071929788);
                                boolean zChanged = composer2.changed(constrainedLayoutReferenceComponent2);
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$3$5$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent2.getTop(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent2.getStart(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent2.getEnd(), 0.0f, 0.0f, 6, null);
                                            constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(constraintLayoutScope2.constrainAs(companion3, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue4), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composer2, 6), 0.0f, 0.0f, 13, null);
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                Modifier modifierAlign = boxScopeInstance.align(AlignmentLineKt.m8007paddingFromBaselineVpY3zN4$default(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composer2, 6), 0.0f, 2, null), companion4.getCenter());
                                StringResourceCompose stringResourceCompose = StringResourceCompose.INSTANCE;
                                TextKt.m10025TextIbK3jfQ(stringResourceCompose.bpBoostHintTitle(i, composer2, ((i6 >> 9) & 14) | 48), modifierAlign, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14795montserratBold16spOr13ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15), composer2, 0, 0, 131068);
                                Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(companion3, companion4.getTopEnd()), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composer2, 6), 0.0f, 11, null);
                                Function0 function011 = function09;
                                ComposableSingletons$BlackPassBoostHintUIKt composableSingletons$BlackPassBoostHintUIKt = ComposableSingletons$BlackPassBoostHintUIKt.INSTANCE;
                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8127paddingqDBjuR0$default2, null, false, null, false, false, false, false, null, 0, 0L, null, function011, composableSingletons$BlackPassBoostHintUIKt.m14892getLambda1$app_siteRelease(), composer2, 0, ((i6 << 3) & 896) | 3072, 4094);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(2071931095);
                                boolean zChanged2 = composer2.changed(constrainedLayoutReferenceComponent3) | composer2.changed(constrainedLayoutReferenceComponent4) | composer2.changed(constrainedLayoutReferenceComponent2) | composer2.changed(verticalAnchorCreateGuidelineFromStart);
                                Object objRememberedValue5 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$3$7$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent3.getBottom(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent4.getTop(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent2.getStart(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), verticalAnchorCreateGuidelineFromStart, 0.0f, 0.0f, 6, null);
                                            Dimension.Companion companion6 = Dimension.INSTANCE;
                                            constrainAs.setWidth(companion6.percent(0.3f));
                                            constrainAs.setHeight(companion6.percent(0.35f));
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue5);
                                }
                                composer2.endReplaceableGroup();
                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_boost_hint, composer2, 6), (String) null, ClipKt.clip(constraintLayoutScope2.constrainAs(companion3, constrainedLayoutReferenceComponent5, (Function1) objRememberedValue5), roundedCornerShapeM8392RoundedCornerShape0680j_42), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                                composer2.startReplaceableGroup(2071931688);
                                boolean zChanged3 = composer2.changed(verticalAnchorCreateGuidelineFromStart) | composer2.changed(constrainedLayoutReferenceComponent2) | composer2.changed(fDimensionResource) | composer2.changed(constrainedLayoutReferenceComponent5);
                                Object objRememberedValue6 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    final float f4 = fDimensionResource;
                                    objRememberedValue6 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$3$8$1
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
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), verticalAnchorCreateGuidelineFromStart, 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent2.getEnd(), f4, 0.0f, 4, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent5.getBottom(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent5.getTop(), 0.0f, 0.0f, 6, null);
                                            Dimension.Companion companion6 = Dimension.INSTANCE;
                                            constrainAs.setWidth(companion6.percent(0.3f));
                                            constrainAs.setHeight(companion6.percent(0.35f));
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue6);
                                }
                                composer2.endReplaceableGroup();
                                TextKt.m10025TextIbK3jfQ(stringResourceCompose.bpBoostHintText(composer2, 6), constraintLayoutScope2.constrainAs(companion3, constrainedLayoutReferenceComponent6, (Function1) objRememberedValue6), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262140);
                                composer2.startReplaceableGroup(2071932164);
                                boolean zChanged4 = composer2.changed(constrainedLayoutReferenceComponent2);
                                Object objRememberedValue7 = composer2.rememberedValue();
                                if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$3$9$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent2.getBottom(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent2.getBottom(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent2.getStart(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent2.getEnd(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue7);
                                }
                                composer2.endReplaceableGroup();
                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(constraintLayoutScope2.constrainAs(companion3, constrainedLayoutReferenceComponent4, (Function1) objRememberedValue7), null, false, null, false, false, false, false, null, 0, 0L, null, function08, composableSingletons$BlackPassBoostHintUIKt.m14893getLambda2$app_siteRelease(), composer2, 0, (i6 & 896) | 3072, 4094);
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
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function06 = function07;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function05 = function03;
                    function06 = function04;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier3;
                    final Function0<Unit> function010 = function05;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt.BlackPassBoostHintContent.4
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
                            BlackPassBoostHintUIKt.BlackPassBoostHintContent(modifier5, function010, function06, i, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 384;
            function04 = function02;
            if ((i3 & 8) != 0) {
            }
            i6 = i4;
            if ((i6 & 5851) != 1170) {
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Configuration configuration2 = (Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                final float fM13666constructorimpl4 = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(configuration2.screenHeightDp) * 1.3f);
                float fM13666constructorimpl22 = C2046Dp.m13666constructorimpl(configuration2.screenWidthDp);
                final float fM14409dpToPx8Feqmps2 = (0 - ComposeExtensionKt.m14409dpToPx8Feqmps(fM13666constructorimpl22, composerStartRestartGroup, 0)) + (ComposeExtensionKt.m14409dpToPx8Feqmps(fM13666constructorimpl22, composerStartRestartGroup, 0) / 2);
                final float fM13666constructorimpl32 = C2046Dp.m13666constructorimpl(0.5f);
                final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_43 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composerStartRestartGroup, 6));
                final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._7sdp, composerStartRestartGroup, 6));
                final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._40sdp, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-270267587);
                Modifier.Companion companion22 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                final Measurer measurer2 = (Measurer) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy2 = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope2, (MutableState<Boolean>) objRememberedValue3, measurer2, composerStartRestartGroup, 4544);
                MeasurePolicy measurePolicyComponent12 = pairRememberConstraintLayoutMeasurePolicy2.component1();
                final Function0 function0Component22 = pairRememberConstraintLayoutMeasurePolicy2.component2();
                final int i92 = 0;
                final float f2 = 0.5f;
                final Function0 function082 = function07;
                final Modifier modifier42 = modifier3;
                final Function0 function092 = function05;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(companion22, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$$inlined$ConstraintLayout$1
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
                        ToolingUtilsKt.setDesignInfoProvider(semantics, measurer2);
                    }
                }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$$inlined$ConstraintLayout$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i10) {
                        if (((i10 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                            int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                            constraintLayoutScope2.reset();
                            ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent5 = constrainedLayoutReferencesCreateRefs.component5();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent6 = constrainedLayoutReferencesCreateRefs.component6();
                            final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart = constraintLayoutScope22.createGuidelineFromStart(f2);
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(companion3, constrainedLayoutReferenceComponent1, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$3$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                    invoke2(constrainScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                }
                            });
                            long jColorResource = ColorResources_androidKt.colorResource(R.color.black_90, composer2, 6);
                            final Modifier modifier52 = modifier42;
                            final float f22 = fM14409dpToPx8Feqmps2;
                            final float f3 = fM13666constructorimpl4;
                            final Function0<Unit> function0102 = function092;
                            FakeDialogKt.m15089FakeDialog3IgeMak(modifierConstrainAs, jColorResource, ComposableLambdaKt.composableLambda(composer2, -573761952, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$3$2
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
                                            ComposerKt.traceEventStart(-573761952, i11, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintContent.<anonymous>.<anonymous> (BlackPassBoostHintUI.kt:108)");
                                        }
                                        Modifier modifierScale = ScaleKt.scale(Modifier.INSTANCE, 1.0f, 0.7f);
                                        Alignment.Companion companion4 = Alignment.INSTANCE;
                                        Alignment center = companion4.getCenter();
                                        Modifier modifier6 = modifier52;
                                        float f4 = f22;
                                        float f5 = f3;
                                        final Function0<Unit> function011 = function0102;
                                        composer3.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                        composer3.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierScale);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        Modifier modifierM8083offsetVpY3zN4 = OffsetKt.m8083offsetVpY3zN4(SizeKt.fillMaxSize$default(BoxScopeInstance.INSTANCE.align(modifier6, companion4.getBottomCenter()), 0.0f, 1, null), ComposeExtensionKt.pxToDp((int) f4, composer3, 0), f5);
                                        composer3.startReplaceableGroup(-1346191265);
                                        boolean zChanged = composer3.changed(function011);
                                        Object objRememberedValue4 = composer3.rememberedValue();
                                        if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$3$2$1$1$1
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
                                                    function011.invoke();
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer3.endReplaceableGroup();
                                        Modifier modifierM7805clickableXHw0xAI$default = ClickableKt.m7805clickableXHw0xAI$default(modifierM8083offsetVpY3zN4, false, null, null, (Function0) objRememberedValue4, 7, null);
                                        Color colorM11330boximpl = Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composer3, 6));
                                        Color.Companion companion6 = Color.INSTANCE;
                                        GradientSphereKt.GradientSphere(modifierM7805clickableXHw0xAI$default, null, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{colorM11330boximpl, Color.m11330boximpl(companion6.m11366getBlack0d7_KjU()), Color.m11330boximpl(companion6.m11375getTransparent0d7_KjU())}), new Pair[0], 0.5f, 2300.0f, composer3, 225280, 2);
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, 384, 0);
                            Modifier modifierConstrainAs2 = constraintLayoutScope22.constrainAs(BorderKt.border(BackgroundKt.m7770backgroundbw27NRU(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(companion3, 0.75f), 0.7f), ColorResources_androidKt.colorResource(R.color.black_40, composer2, 6), roundedCornerShapeM8392RoundedCornerShape0680j_43), BorderStrokeKt.m7798BorderStrokecXLIe8U(fM13666constructorimpl32, Color.INSTANCE.m11377getWhite0d7_KjU()), roundedCornerShapeM8392RoundedCornerShape0680j_43), constrainedLayoutReferenceComponent2, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$3$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                    invoke2(constrainScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                }
                            });
                            composer2.startReplaceableGroup(733328855);
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion5.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierConstrainAs2);
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
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(2071929788);
                            boolean zChanged = composer2.changed(constrainedLayoutReferenceComponent2);
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$3$5$1
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
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent2.getTop(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent2.getStart(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent2.getEnd(), 0.0f, 0.0f, 6, null);
                                        constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(constraintLayoutScope22.constrainAs(companion3, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue4), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composer2, 6), 0.0f, 0.0f, 13, null);
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            Modifier modifierAlign = boxScopeInstance.align(AlignmentLineKt.m8007paddingFromBaselineVpY3zN4$default(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composer2, 6), 0.0f, 2, null), companion4.getCenter());
                            StringResourceCompose stringResourceCompose = StringResourceCompose.INSTANCE;
                            TextKt.m10025TextIbK3jfQ(stringResourceCompose.bpBoostHintTitle(i, composer2, ((i6 >> 9) & 14) | 48), modifierAlign, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14795montserratBold16spOr13ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15), composer2, 0, 0, 131068);
                            Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(companion3, companion4.getTopEnd()), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composer2, 6), 0.0f, 11, null);
                            Function0 function011 = function092;
                            ComposableSingletons$BlackPassBoostHintUIKt composableSingletons$BlackPassBoostHintUIKt = ComposableSingletons$BlackPassBoostHintUIKt.INSTANCE;
                            ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8127paddingqDBjuR0$default2, null, false, null, false, false, false, false, null, 0, 0L, null, function011, composableSingletons$BlackPassBoostHintUIKt.m14892getLambda1$app_siteRelease(), composer2, 0, ((i6 << 3) & 896) | 3072, 4094);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(2071931095);
                            boolean zChanged2 = composer2.changed(constrainedLayoutReferenceComponent3) | composer2.changed(constrainedLayoutReferenceComponent4) | composer2.changed(constrainedLayoutReferenceComponent2) | composer2.changed(verticalAnchorCreateGuidelineFromStart);
                            Object objRememberedValue5 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$3$7$1
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
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent3.getBottom(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent4.getTop(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent2.getStart(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), verticalAnchorCreateGuidelineFromStart, 0.0f, 0.0f, 6, null);
                                        Dimension.Companion companion6 = Dimension.INSTANCE;
                                        constrainAs.setWidth(companion6.percent(0.3f));
                                        constrainAs.setHeight(companion6.percent(0.35f));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue5);
                            }
                            composer2.endReplaceableGroup();
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_boost_hint, composer2, 6), (String) null, ClipKt.clip(constraintLayoutScope22.constrainAs(companion3, constrainedLayoutReferenceComponent5, (Function1) objRememberedValue5), roundedCornerShapeM8392RoundedCornerShape0680j_422), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                            composer2.startReplaceableGroup(2071931688);
                            boolean zChanged3 = composer2.changed(verticalAnchorCreateGuidelineFromStart) | composer2.changed(constrainedLayoutReferenceComponent2) | composer2.changed(fDimensionResource2) | composer2.changed(constrainedLayoutReferenceComponent5);
                            Object objRememberedValue6 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                final float f4 = fDimensionResource2;
                                objRememberedValue6 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$3$8$1
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
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), verticalAnchorCreateGuidelineFromStart, 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent2.getEnd(), f4, 0.0f, 4, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent5.getBottom(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent5.getTop(), 0.0f, 0.0f, 6, null);
                                        Dimension.Companion companion6 = Dimension.INSTANCE;
                                        constrainAs.setWidth(companion6.percent(0.3f));
                                        constrainAs.setHeight(companion6.percent(0.35f));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue6);
                            }
                            composer2.endReplaceableGroup();
                            TextKt.m10025TextIbK3jfQ(stringResourceCompose.bpBoostHintText(composer2, 6), constraintLayoutScope22.constrainAs(companion3, constrainedLayoutReferenceComponent6, (Function1) objRememberedValue6), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262140);
                            composer2.startReplaceableGroup(2071932164);
                            boolean zChanged4 = composer2.changed(constrainedLayoutReferenceComponent2);
                            Object objRememberedValue7 = composer2.rememberedValue();
                            if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt$BlackPassBoostHintContent$3$9$1
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
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent2.getBottom(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent2.getBottom(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent2.getStart(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent2.getEnd(), 0.0f, 0.0f, 6, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue7);
                            }
                            composer2.endReplaceableGroup();
                            ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(constraintLayoutScope22.constrainAs(companion3, constrainedLayoutReferenceComponent4, (Function1) objRememberedValue7), null, false, null, false, false, false, false, null, 0, 0L, null, function082, composableSingletons$BlackPassBoostHintUIKt.m14893getLambda2$app_siteRelease(), composer2, 0, (i6 & 896) | 3072, 4094);
                            if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                function0Component22.invoke();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), measurePolicyComponent12, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                function06 = function07;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function03 = function0;
        i5 = i3 & 4;
        if (i5 != 0) {
        }
        function04 = function02;
        if ((i3 & 8) != 0) {
        }
        i6 = i4;
        if ((i6 & 5851) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewTableFigma(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(906339292);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(906339292, i, -1, "com.blackhub.bronline.game.ui.blackpass.PreviewTableFigma (BlackPassBoostHintUI.kt:239)");
            }
            BlackPassBoostHintContent(null, null, null, 14, composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt.PreviewTableFigma.1
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
                    BlackPassBoostHintUIKt.PreviewTableFigma(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

