package com.blackhub.bronline.game.p019ui.upgradeobjectevent;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.geometry.CornerRadiusKt;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.RectangleShapeKt;
import androidx.compose.p003ui.graphics.StrokeJoin;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.tooling.preview.Preview;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.p019ui.widget.block.cloud.CloudArrowTopBlockKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
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
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UpgradeObjectEventLevel.kt */
@SourceDebugExtension({"SMAP\nUpgradeObjectEventLevel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeObjectEventLevel.kt\ncom/blackhub/bronline/game/ui/upgradeobjectevent/UpgradeObjectEventLevelKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,349:1\n73#2,4:350\n77#2,20:361\n25#3:354\n955#4,6:355\n154#5:381\n81#6:382\n*S KotlinDebug\n*F\n+ 1 UpgradeObjectEventLevel.kt\ncom/blackhub/bronline/game/ui/upgradeobjectevent/UpgradeObjectEventLevelKt\n*L\n97#1:350,4\n97#1:361,20\n97#1:354\n97#1:355,6\n339#1:381\n74#1:382\n*E\n"})
/* loaded from: classes3.dex */
public final class UpgradeObjectEventLevelKt {
    public static final int BOTTOM_MARGIN_FOR_POINTS = 2;
    public static final int END_MARGIN_FOR_LEVEL = 6;
    public static final float LEFT_LEVEL_HORIZONTAL_BIAS = 0.43f;
    public static final float PROGRESS_BAR_VERTICAL_BIAS = 0.7f;
    public static final int START_END_MARGIN_FOR_POINTS = 7;

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0112  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UpgradeObjectEventLevel(@Nullable Modifier modifier, final boolean z, final int i, final int i2, final int i3, final int i4, @DrawableRes final int i5, @StringRes final int i6, final boolean z2, @Nullable Composer composer, final int i7, final int i8) {
        Modifier modifier2;
        int i9;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-447630234);
        int i10 = i8 & 1;
        if (i10 != 0) {
            i9 = i7 | 6;
            modifier2 = modifier;
        } else if ((i7 & 14) == 0) {
            modifier2 = modifier;
            i9 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i7;
        } else {
            modifier2 = modifier;
            i9 = i7;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else if ((i7 & 112) == 0) {
            i9 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i8 & 4) != 0) {
            i9 |= 384;
        } else if ((i7 & 896) == 0) {
            i9 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i8 & 8) != 0) {
            i9 |= 3072;
        } else if ((i7 & 7168) == 0) {
            i9 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
        }
        if ((i8 & 16) != 0) {
            i9 |= CpioConstants.C_ISBLK;
        } else {
            if ((57344 & i7) == 0) {
                i9 |= composerStartRestartGroup.changed(i3) ? 16384 : 8192;
            }
            if ((i8 & 32) == 0) {
                i9 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((458752 & i7) == 0) {
                i9 |= composerStartRestartGroup.changed(i4) ? 131072 : 65536;
            }
            if ((i8 & 64) == 0) {
                i9 |= 1572864;
            } else if ((3670016 & i7) == 0) {
                i9 |= composerStartRestartGroup.changed(i5) ? 1048576 : 524288;
            }
            if ((i8 & 128) == 0) {
                i9 |= 12582912;
            } else if ((29360128 & i7) == 0) {
                i9 |= composerStartRestartGroup.changed(i6) ? 8388608 : 4194304;
            }
            if ((i8 & 256) != 0) {
                if ((234881024 & i7) == 0) {
                    i9 |= composerStartRestartGroup.changed(z2) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                if ((i9 & 191739611) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-447630234, i9, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevel (UpgradeObjectEventLevel.kt:68)");
                    }
                    final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(i / i2, ProgressIndicatorDefaults.INSTANCE.getProgressAnimationSpec(), 0.0f, AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, composerStartRestartGroup, 0, 20);
                    StringResourceCompose stringResourceCompose = StringResourceCompose.INSTANCE;
                    final String optionThousand = stringResourceCompose.getOptionThousand(i, !z, composerStartRestartGroup, ((i9 >> 6) & 14) | 384);
                    final String optionThousand2 = stringResourceCompose.getOptionThousand(i2, !z, composerStartRestartGroup, ((i9 >> 9) & 14) | 384);
                    final String optionThousand3 = stringResourceCompose.getOptionThousand(i2 - i, !z, composerStartRestartGroup, 384);
                    final long jColorResource = ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6);
                    final long jColorResource2 = ColorResources_androidKt.colorResource(R.color.light_yellow, composerStartRestartGroup, 6);
                    final long jColorResource3 = ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6);
                    final int i11 = i9 & 14;
                    composerStartRestartGroup.startReplaceableGroup(-270267587);
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
                    LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$$inlined$ConstraintLayout$1
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
                    }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$$inlined$ConstraintLayout$2
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
                        public final void invoke(@Nullable Composer composer2, int i12) {
                            final ConstrainedLayoutReference constrainedLayoutReference;
                            ConstrainedLayoutReference constrainedLayoutReference2;
                            ConstrainedLayoutReference constrainedLayoutReference3;
                            ConstrainedLayoutReference constrainedLayoutReference4;
                            if (((i12 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                constraintLayoutScope.reset();
                                ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent5 = constrainedLayoutReferencesCreateRefs.component5();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent6 = constrainedLayoutReferencesCreateRefs.component6();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent7 = constrainedLayoutReferencesCreateRefs.component7();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent8 = constrainedLayoutReferencesCreateRefs.component8();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent9 = constrainedLayoutReferencesCreateRefs.component9();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent10 = constrainedLayoutReferencesCreateRefs.component10();
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer2, 6)), 0.0f, 1, null);
                                composer2.startReplaceableGroup(132289278);
                                boolean zChanged = composer2.changed(constrainedLayoutReferenceComponent1);
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$1$1
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
                                            constrainAs.centerVerticallyTo(constrainedLayoutReferenceComponent1, 0.7f);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierClip = ClipKt.clip(constraintLayoutScope2.constrainAs(modifierFillMaxWidth$default, constrainedLayoutReferenceComponent5, (Function1) objRememberedValue4), RectangleShapeKt.getRectangleShape());
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierClip);
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
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 1, null);
                                composer2.startReplaceableGroup(-747824377);
                                boolean zChanged2 = composer2.changed(jColorResource) | composer2.changed(stateAnimateFloatAsState) | composer2.changed(jColorResource2) | composer2.changed(jColorResource3);
                                Object objRememberedValue5 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    constrainedLayoutReference = constrainedLayoutReferenceComponent5;
                                    final long j = jColorResource;
                                    final long j2 = jColorResource2;
                                    constrainedLayoutReference2 = constrainedLayoutReferenceComponent8;
                                    constrainedLayoutReference3 = constrainedLayoutReferenceComponent7;
                                    final long j3 = jColorResource3;
                                    constrainedLayoutReference4 = constrainedLayoutReferenceComponent9;
                                    final State state = stateAnimateFloatAsState;
                                    objRememberedValue5 = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                            invoke2(drawScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull DrawScope Canvas) {
                                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                            float f = 2;
                                            DrawScope.m11886drawRoundRectuAw5IA$default(Canvas, j, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())), CornerRadiusKt.CornerRadius(Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / f), null, 0.0f, null, 0, 242, null);
                                            DrawScope.m11885drawRoundRectZuiqVtQ$default(Canvas, Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(j2), Color.m11330boximpl(j3)}), 0.0f, 0.0f, 0, 14, (Object) null), 0L, androidx.compose.p003ui.geometry.SizeKt.Size(UpgradeObjectEventLevelKt.UpgradeObjectEventLevel$lambda$0(state) * Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())), CornerRadiusKt.CornerRadius(Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / f), 0.0f, null, null, 0, 242, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue5);
                                } else {
                                    constrainedLayoutReference4 = constrainedLayoutReferenceComponent9;
                                    constrainedLayoutReference2 = constrainedLayoutReferenceComponent8;
                                    constrainedLayoutReference3 = constrainedLayoutReferenceComponent7;
                                    constrainedLayoutReference = constrainedLayoutReferenceComponent5;
                                }
                                composer2.endReplaceableGroup();
                                CanvasKt.Canvas(modifierFillMaxHeight$default, (Function1) objRememberedValue5, composer2, 6);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composer2, 6));
                                composer2.startReplaceableGroup(132290779);
                                boolean zChanged3 = composer2.changed(constrainedLayoutReference);
                                Object objRememberedValue6 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$3$1
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
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference.getStart(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference.getStart(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue6);
                                }
                                composer2.endReplaceableGroup();
                                ConstrainedLayoutReference constrainedLayoutReference5 = constrainedLayoutReference4;
                                ConstrainedLayoutReference constrainedLayoutReference6 = constrainedLayoutReference2;
                                ConstrainedLayoutReference constrainedLayoutReference7 = constrainedLayoutReference3;
                                final ConstrainedLayoutReference constrainedLayoutReference8 = constrainedLayoutReference;
                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_rainbow_star, composer2, 6), (String) null, constraintLayoutScope2.constrainAs(modifierM8172size3ABfNKs, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue6), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                                Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(companion2, null, true, 1, null);
                                composer2.startReplaceableGroup(132291202);
                                boolean zChanged4 = composer2.changed(constrainedLayoutReferenceComponent1);
                                Object objRememberedValue7 = composer2.rememberedValue();
                                if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$4$1
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
                                            constrainAs.centerHorizontallyTo(constrainedLayoutReferenceComponent1, 0.43f);
                                            ConstrainScope.centerVerticallyTo$default(constrainAs, constrainedLayoutReferenceComponent1, 0.0f, 2, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue7);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifierWrapContentSize$default, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue7);
                                String strValueOf = String.valueOf(i3);
                                TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                long jColorResource4 = ColorResources_androidKt.colorResource(R.color.dark_brown, composer2, 6);
                                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                                int iM13558getCentere0LSkKk = companion4.m13558getCentere0LSkKk();
                                long jOffset = OffsetKt.Offset(0.0f, 0.0f);
                                float fM14409dpToPx8Feqmps = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6), composer2, 0);
                                StrokeJoin.Companion companion5 = StrokeJoin.INSTANCE;
                                TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._13wsp, jColorResource4, iM13558getCentere0LSkKk, jOffset, 0.0f, null, new Stroke(fM14409dpToPx8Feqmps, 0.0f, 0, companion5.m11704getRoundLxFBmk8(), null, 22, null), composer2, 14707718, 32);
                                FontStyle.Companion companion6 = FontStyle.INSTANCE;
                                TextKt.m10024Text4IGK_g(strValueOf, modifierConstrainAs, 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14811montserratBoldCustomSpIzzofJo, composer2, 0, 0, 65516);
                                Modifier modifierWrapContentSize$default2 = SizeKt.wrapContentSize$default(companion2, null, true, 1, null);
                                composer2.startReplaceableGroup(132292072);
                                boolean zChanged5 = composer2.changed(constrainedLayoutReferenceComponent1);
                                Object objRememberedValue8 = composer2.rememberedValue();
                                if (zChanged5 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue8 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$5$1
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
                                            constrainAs.centerHorizontallyTo(constrainedLayoutReferenceComponent1, 0.43f);
                                            ConstrainScope.centerVerticallyTo$default(constrainAs, constrainedLayoutReferenceComponent1, 0.0f, 2, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue8);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(modifierWrapContentSize$default2, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue8);
                                TextKt.m10024Text4IGK_g(String.valueOf(i3), modifierConstrainAs2, 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._14wsp, 0L, companion4.m13558getCentere0LSkKk(), OffsetKt.Offset(0.0f, 0.0f), 0.0f, null, null, composer2, 12610566, 98), composer2, 0, 0, 65516);
                                Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer2, 6));
                                composer2.startReplaceableGroup(132292716);
                                boolean zChanged6 = composer2.changed(constrainedLayoutReference8);
                                Object objRememberedValue9 = composer2.rememberedValue();
                                if (zChanged6 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue9 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$6$1
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
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference8.getEnd(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference8.getEnd(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue9);
                                }
                                composer2.endReplaceableGroup();
                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_rainbow_star, composer2, 6), (String) null, constraintLayoutScope2.constrainAs(modifierM8172size3ABfNKs2, constrainedLayoutReferenceComponent6, (Function1) objRememberedValue9), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                                composer2.startReplaceableGroup(132293068);
                                boolean zChanged7 = composer2.changed(constrainedLayoutReferenceComponent6);
                                Object objRememberedValue10 = composer2.rememberedValue();
                                if (zChanged7 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue10 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$7$1
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
                                            constrainAs.centerHorizontallyTo(constrainedLayoutReferenceComponent6, 0.43f);
                                            ConstrainScope.centerVerticallyTo$default(constrainAs, constrainedLayoutReferenceComponent6, 0.0f, 2, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue10);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierConstrainAs3 = constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReference6, (Function1) objRememberedValue10);
                                TextKt.m10024Text4IGK_g(String.valueOf(i4), modifierConstrainAs3, 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._14wsp, ColorResources_androidKt.colorResource(R.color.dark_brown, composer2, 6), companion4.m13558getCentere0LSkKk(), OffsetKt.Offset(0.0f, 0.0f), 0.0f, null, new Stroke(ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6), composer2, 0), 0.0f, 0, companion5.m11704getRoundLxFBmk8(), null, 22, null), composer2, 14707718, 32), composer2, 0, 0, 65516);
                                composer2.startReplaceableGroup(132293858);
                                boolean zChanged8 = composer2.changed(constrainedLayoutReferenceComponent6);
                                Object objRememberedValue11 = composer2.rememberedValue();
                                if (zChanged8 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$8$1
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
                                            constrainAs.centerHorizontallyTo(constrainedLayoutReferenceComponent6, 0.43f);
                                            ConstrainScope.centerVerticallyTo$default(constrainAs, constrainedLayoutReferenceComponent6, 0.0f, 2, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue11);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierConstrainAs4 = constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReference7, (Function1) objRememberedValue11);
                                TextKt.m10024Text4IGK_g(String.valueOf(i4), modifierConstrainAs4, 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._14wsp, 0L, companion4.m13558getCentere0LSkKk(), OffsetKt.Offset(0.0f, 0.0f), 0.0f, null, null, composer2, 12610566, 98), composer2, 0, 0, 65516);
                                composer2.startReplaceableGroup(132294411);
                                boolean zChanged9 = composer2.changed(constrainedLayoutReference8) | composer2.changed(constrainedLayoutReferenceComponent1);
                                Object objRememberedValue12 = composer2.rememberedValue();
                                if (zChanged9 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue12 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$9$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference8.getTop(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference8.getBottom(), C2046Dp.m13666constructorimpl(2), 0.0f, 4, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent1.getEnd(), C2046Dp.m13666constructorimpl(7), 0.0f, 4, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue12);
                                }
                                composer2.endReplaceableGroup();
                                TextKt.m10024Text4IGK_g(optionThousand, constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent4, (Function1) objRememberedValue12), 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, 0L, 0, OffsetKt.Offset(0.0f, 1.0f), 0.0f, null, null, composer2, 12585990, 118), composer2, 0, 0, 65516);
                                composer2.startReplaceableGroup(132295034);
                                boolean zChanged10 = composer2.changed(constrainedLayoutReferenceComponent4) | composer2.changed(constrainedLayoutReferenceComponent6);
                                Object objRememberedValue13 = composer2.rememberedValue();
                                if (zChanged10 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue13 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$10$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent4.getTop(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent4.getBottom(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent6.getStart(), C2046Dp.m13666constructorimpl(7), 0.0f, 4, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue13);
                                }
                                composer2.endReplaceableGroup();
                                TextKt.m10024Text4IGK_g(optionThousand2, constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReference5, (Function1) objRememberedValue13), 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, 0L, 0, OffsetKt.Offset(0.0f, 1.0f), 0.0f, null, null, composer2, 12585990, 118), composer2, 0, 0, 65516);
                                if (z2) {
                                    composer2.startReplaceableGroup(132295586);
                                    Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._200wdp, composer2, 6));
                                    composer2.startReplaceableGroup(132295832);
                                    boolean zChanged11 = composer2.changed(constrainedLayoutReference8);
                                    Object objRememberedValue14 = composer2.rememberedValue();
                                    if (zChanged11 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue14 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$11$1
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
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference8.getBottom(), 0.0f, 0.0f, 6, null);
                                                ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue14);
                                    }
                                    composer2.endReplaceableGroup();
                                    Modifier modifierConstrainAs5 = constraintLayoutScope2.constrainAs(modifierM8177width3ABfNKs, constrainedLayoutReferenceComponent10, (Function1) objRememberedValue14);
                                    final int i13 = i6;
                                    CloudArrowTopBlockKt.CloudArrowTopBlock(modifierConstrainAs5, null, ComposableLambdaKt.composableLambda(composer2, -559141221, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$12
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
                                        public final void invoke(@Nullable Composer composer3, int i14) {
                                            if ((i14 & 11) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-559141221, i14, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevel.<anonymous>.<anonymous> (UpgradeObjectEventLevel.kt:291)");
                                                }
                                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(i13, composer3, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._10wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer3, 196614, 26), composer3, 0, 3072, 57342);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }), composer2, 384, 2);
                                    composer2.endReplaceableGroup();
                                } else {
                                    composer2.startReplaceableGroup(132296349);
                                    Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._61wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composer2, 6));
                                    composer2.startReplaceableGroup(132296615);
                                    boolean zChanged12 = composer2.changed(constrainedLayoutReference8);
                                    Object objRememberedValue15 = composer2.rememberedValue();
                                    if (zChanged12 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue15 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$13$1
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
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference8.getBottom(), 0.0f, 0.0f, 6, null);
                                                ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue15);
                                    }
                                    composer2.endReplaceableGroup();
                                    Modifier modifierConstrainAs6 = constraintLayoutScope2.constrainAs(modifierM8174sizeVpY3zN4, constrainedLayoutReferenceComponent10, (Function1) objRememberedValue15);
                                    final int i14 = i5;
                                    final String str = optionThousand3;
                                    CloudArrowTopBlockKt.CloudArrowTopBlock(modifierConstrainAs6, null, ComposableLambdaKt.composableLambda(composer2, -124444750, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$14
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
                                        public final void invoke(@Nullable Composer composer3, int i15) {
                                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-124444750, i15, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevel.<anonymous>.<anonymous> (UpgradeObjectEventLevel.kt:311)");
                                                }
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                int i16 = i14;
                                                String str2 = str;
                                                composer3.startReplaceableGroup(693286680);
                                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                                composer3.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor2 = companion8.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion7);
                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor2);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion8.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion8.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion8.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                ImageKt.Image(PainterResources_androidKt.painterResource(i16, composer3, 0), (String) null, SizeKt.fillMaxHeight$default(SizeKt.m8174sizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(companion7, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer3, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._19wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer3, 6)), 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                                TextKt.m10024Text4IGK_g(str2, (Modifier) null, 0L, 0L, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126), composer3, 0, 0, 65518);
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
                                    }), composer2, 384, 2);
                                    composer2.endReplaceableGroup();
                                }
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
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier3 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt.UpgradeObjectEventLevel.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            UpgradeObjectEventLevelKt.UpgradeObjectEventLevel(modifier3, z, i, i2, i3, i4, i5, i6, z2, composer2, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), i8);
                        }
                    });
                    return;
                }
                return;
            }
            i9 |= 100663296;
            if ((i9 & 191739611) != 38347922) {
                if (i10 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final State stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(i / i2, ProgressIndicatorDefaults.INSTANCE.getProgressAnimationSpec(), 0.0f, AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, composerStartRestartGroup, 0, 20);
                StringResourceCompose stringResourceCompose2 = StringResourceCompose.INSTANCE;
                final String optionThousand4 = stringResourceCompose2.getOptionThousand(i, !z, composerStartRestartGroup, ((i9 >> 6) & 14) | 384);
                final String optionThousand22 = stringResourceCompose2.getOptionThousand(i2, !z, composerStartRestartGroup, ((i9 >> 9) & 14) | 384);
                final String optionThousand32 = stringResourceCompose2.getOptionThousand(i2 - i, !z, composerStartRestartGroup, 384);
                final long jColorResource4 = ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6);
                final long jColorResource22 = ColorResources_androidKt.colorResource(R.color.light_yellow, composerStartRestartGroup, 6);
                final long jColorResource32 = ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6);
                final int i112 = i9 & 14;
                composerStartRestartGroup.startReplaceableGroup(-270267587);
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
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$$inlined$ConstraintLayout$1
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
                }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$$inlined$ConstraintLayout$2
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
                    public final void invoke(@Nullable Composer composer2, int i12) {
                        final ConstrainedLayoutReference constrainedLayoutReference;
                        ConstrainedLayoutReference constrainedLayoutReference2;
                        ConstrainedLayoutReference constrainedLayoutReference3;
                        ConstrainedLayoutReference constrainedLayoutReference4;
                        if (((i12 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                            int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                            constraintLayoutScope2.reset();
                            ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent5 = constrainedLayoutReferencesCreateRefs.component5();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent6 = constrainedLayoutReferencesCreateRefs.component6();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent7 = constrainedLayoutReferencesCreateRefs.component7();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent8 = constrainedLayoutReferencesCreateRefs.component8();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent9 = constrainedLayoutReferencesCreateRefs.component9();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent10 = constrainedLayoutReferencesCreateRefs.component10();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer2, 6)), 0.0f, 1, null);
                            composer2.startReplaceableGroup(132289278);
                            boolean zChanged = composer2.changed(constrainedLayoutReferenceComponent1);
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$1$1
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
                                        constrainAs.centerVerticallyTo(constrainedLayoutReferenceComponent1, 0.7f);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierClip = ClipKt.clip(constraintLayoutScope22.constrainAs(modifierFillMaxWidth$default, constrainedLayoutReferenceComponent5, (Function1) objRememberedValue4), RectangleShapeKt.getRectangleShape());
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierClip);
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
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 1, null);
                            composer2.startReplaceableGroup(-747824377);
                            boolean zChanged2 = composer2.changed(jColorResource4) | composer2.changed(stateAnimateFloatAsState2) | composer2.changed(jColorResource22) | composer2.changed(jColorResource32);
                            Object objRememberedValue5 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                constrainedLayoutReference = constrainedLayoutReferenceComponent5;
                                final long j = jColorResource4;
                                final long j2 = jColorResource22;
                                constrainedLayoutReference2 = constrainedLayoutReferenceComponent8;
                                constrainedLayoutReference3 = constrainedLayoutReferenceComponent7;
                                final long j3 = jColorResource32;
                                constrainedLayoutReference4 = constrainedLayoutReferenceComponent9;
                                final State<Float> state = stateAnimateFloatAsState2;
                                objRememberedValue5 = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                        invoke2(drawScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull DrawScope Canvas) {
                                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                        float f = 2;
                                        DrawScope.m11886drawRoundRectuAw5IA$default(Canvas, j, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())), CornerRadiusKt.CornerRadius(Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / f), null, 0.0f, null, 0, 242, null);
                                        DrawScope.m11885drawRoundRectZuiqVtQ$default(Canvas, Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(j2), Color.m11330boximpl(j3)}), 0.0f, 0.0f, 0, 14, (Object) null), 0L, androidx.compose.p003ui.geometry.SizeKt.Size(UpgradeObjectEventLevelKt.UpgradeObjectEventLevel$lambda$0(state) * Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())), CornerRadiusKt.CornerRadius(Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / f), 0.0f, null, null, 0, 242, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue5);
                            } else {
                                constrainedLayoutReference4 = constrainedLayoutReferenceComponent9;
                                constrainedLayoutReference2 = constrainedLayoutReferenceComponent8;
                                constrainedLayoutReference3 = constrainedLayoutReferenceComponent7;
                                constrainedLayoutReference = constrainedLayoutReferenceComponent5;
                            }
                            composer2.endReplaceableGroup();
                            CanvasKt.Canvas(modifierFillMaxHeight$default, (Function1) objRememberedValue5, composer2, 6);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composer2, 6));
                            composer2.startReplaceableGroup(132290779);
                            boolean zChanged3 = composer2.changed(constrainedLayoutReference);
                            Object objRememberedValue6 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$3$1
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
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference.getStart(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference.getStart(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue6);
                            }
                            composer2.endReplaceableGroup();
                            ConstrainedLayoutReference constrainedLayoutReference5 = constrainedLayoutReference4;
                            ConstrainedLayoutReference constrainedLayoutReference6 = constrainedLayoutReference2;
                            ConstrainedLayoutReference constrainedLayoutReference7 = constrainedLayoutReference3;
                            final ConstrainedLayoutReference constrainedLayoutReference8 = constrainedLayoutReference;
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_rainbow_star, composer2, 6), (String) null, constraintLayoutScope22.constrainAs(modifierM8172size3ABfNKs, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue6), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(companion2, null, true, 1, null);
                            composer2.startReplaceableGroup(132291202);
                            boolean zChanged4 = composer2.changed(constrainedLayoutReferenceComponent1);
                            Object objRememberedValue7 = composer2.rememberedValue();
                            if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$4$1
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
                                        constrainAs.centerHorizontallyTo(constrainedLayoutReferenceComponent1, 0.43f);
                                        ConstrainScope.centerVerticallyTo$default(constrainAs, constrainedLayoutReferenceComponent1, 0.0f, 2, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue7);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(modifierWrapContentSize$default, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue7);
                            String strValueOf = String.valueOf(i3);
                            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                            long jColorResource42 = ColorResources_androidKt.colorResource(R.color.dark_brown, composer2, 6);
                            TextAlign.Companion companion4 = TextAlign.INSTANCE;
                            int iM13558getCentere0LSkKk = companion4.m13558getCentere0LSkKk();
                            long jOffset = OffsetKt.Offset(0.0f, 0.0f);
                            float fM14409dpToPx8Feqmps = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6), composer2, 0);
                            StrokeJoin.Companion companion5 = StrokeJoin.INSTANCE;
                            TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._13wsp, jColorResource42, iM13558getCentere0LSkKk, jOffset, 0.0f, null, new Stroke(fM14409dpToPx8Feqmps, 0.0f, 0, companion5.m11704getRoundLxFBmk8(), null, 22, null), composer2, 14707718, 32);
                            FontStyle.Companion companion6 = FontStyle.INSTANCE;
                            TextKt.m10024Text4IGK_g(strValueOf, modifierConstrainAs, 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14811montserratBoldCustomSpIzzofJo, composer2, 0, 0, 65516);
                            Modifier modifierWrapContentSize$default2 = SizeKt.wrapContentSize$default(companion2, null, true, 1, null);
                            composer2.startReplaceableGroup(132292072);
                            boolean zChanged5 = composer2.changed(constrainedLayoutReferenceComponent1);
                            Object objRememberedValue8 = composer2.rememberedValue();
                            if (zChanged5 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue8 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$5$1
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
                                        constrainAs.centerHorizontallyTo(constrainedLayoutReferenceComponent1, 0.43f);
                                        ConstrainScope.centerVerticallyTo$default(constrainAs, constrainedLayoutReferenceComponent1, 0.0f, 2, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue8);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierConstrainAs2 = constraintLayoutScope22.constrainAs(modifierWrapContentSize$default2, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue8);
                            TextKt.m10024Text4IGK_g(String.valueOf(i3), modifierConstrainAs2, 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._14wsp, 0L, companion4.m13558getCentere0LSkKk(), OffsetKt.Offset(0.0f, 0.0f), 0.0f, null, null, composer2, 12610566, 98), composer2, 0, 0, 65516);
                            Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer2, 6));
                            composer2.startReplaceableGroup(132292716);
                            boolean zChanged6 = composer2.changed(constrainedLayoutReference8);
                            Object objRememberedValue9 = composer2.rememberedValue();
                            if (zChanged6 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue9 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$6$1
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
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference8.getEnd(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference8.getEnd(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue9);
                            }
                            composer2.endReplaceableGroup();
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_rainbow_star, composer2, 6), (String) null, constraintLayoutScope22.constrainAs(modifierM8172size3ABfNKs2, constrainedLayoutReferenceComponent6, (Function1) objRememberedValue9), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                            composer2.startReplaceableGroup(132293068);
                            boolean zChanged7 = composer2.changed(constrainedLayoutReferenceComponent6);
                            Object objRememberedValue10 = composer2.rememberedValue();
                            if (zChanged7 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue10 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$7$1
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
                                        constrainAs.centerHorizontallyTo(constrainedLayoutReferenceComponent6, 0.43f);
                                        ConstrainScope.centerVerticallyTo$default(constrainAs, constrainedLayoutReferenceComponent6, 0.0f, 2, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue10);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierConstrainAs3 = constraintLayoutScope22.constrainAs(companion2, constrainedLayoutReference6, (Function1) objRememberedValue10);
                            TextKt.m10024Text4IGK_g(String.valueOf(i4), modifierConstrainAs3, 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._14wsp, ColorResources_androidKt.colorResource(R.color.dark_brown, composer2, 6), companion4.m13558getCentere0LSkKk(), OffsetKt.Offset(0.0f, 0.0f), 0.0f, null, new Stroke(ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6), composer2, 0), 0.0f, 0, companion5.m11704getRoundLxFBmk8(), null, 22, null), composer2, 14707718, 32), composer2, 0, 0, 65516);
                            composer2.startReplaceableGroup(132293858);
                            boolean zChanged8 = composer2.changed(constrainedLayoutReferenceComponent6);
                            Object objRememberedValue11 = composer2.rememberedValue();
                            if (zChanged8 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue11 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$8$1
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
                                        constrainAs.centerHorizontallyTo(constrainedLayoutReferenceComponent6, 0.43f);
                                        ConstrainScope.centerVerticallyTo$default(constrainAs, constrainedLayoutReferenceComponent6, 0.0f, 2, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue11);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierConstrainAs4 = constraintLayoutScope22.constrainAs(companion2, constrainedLayoutReference7, (Function1) objRememberedValue11);
                            TextKt.m10024Text4IGK_g(String.valueOf(i4), modifierConstrainAs4, 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._14wsp, 0L, companion4.m13558getCentere0LSkKk(), OffsetKt.Offset(0.0f, 0.0f), 0.0f, null, null, composer2, 12610566, 98), composer2, 0, 0, 65516);
                            composer2.startReplaceableGroup(132294411);
                            boolean zChanged9 = composer2.changed(constrainedLayoutReference8) | composer2.changed(constrainedLayoutReferenceComponent1);
                            Object objRememberedValue12 = composer2.rememberedValue();
                            if (zChanged9 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue12 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$9$1
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
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference8.getTop(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference8.getBottom(), C2046Dp.m13666constructorimpl(2), 0.0f, 4, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent1.getEnd(), C2046Dp.m13666constructorimpl(7), 0.0f, 4, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue12);
                            }
                            composer2.endReplaceableGroup();
                            TextKt.m10024Text4IGK_g(optionThousand4, constraintLayoutScope22.constrainAs(companion2, constrainedLayoutReferenceComponent4, (Function1) objRememberedValue12), 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, 0L, 0, OffsetKt.Offset(0.0f, 1.0f), 0.0f, null, null, composer2, 12585990, 118), composer2, 0, 0, 65516);
                            composer2.startReplaceableGroup(132295034);
                            boolean zChanged10 = composer2.changed(constrainedLayoutReferenceComponent4) | composer2.changed(constrainedLayoutReferenceComponent6);
                            Object objRememberedValue13 = composer2.rememberedValue();
                            if (zChanged10 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue13 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$10$1
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
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent4.getTop(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent4.getBottom(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent6.getStart(), C2046Dp.m13666constructorimpl(7), 0.0f, 4, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue13);
                            }
                            composer2.endReplaceableGroup();
                            TextKt.m10024Text4IGK_g(optionThousand22, constraintLayoutScope22.constrainAs(companion2, constrainedLayoutReference5, (Function1) objRememberedValue13), 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, 0L, 0, OffsetKt.Offset(0.0f, 1.0f), 0.0f, null, null, composer2, 12585990, 118), composer2, 0, 0, 65516);
                            if (z2) {
                                composer2.startReplaceableGroup(132295586);
                                Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._200wdp, composer2, 6));
                                composer2.startReplaceableGroup(132295832);
                                boolean zChanged11 = composer2.changed(constrainedLayoutReference8);
                                Object objRememberedValue14 = composer2.rememberedValue();
                                if (zChanged11 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue14 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$11$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference8.getBottom(), 0.0f, 0.0f, 6, null);
                                            ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue14);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierConstrainAs5 = constraintLayoutScope22.constrainAs(modifierM8177width3ABfNKs, constrainedLayoutReferenceComponent10, (Function1) objRememberedValue14);
                                final int i13 = i6;
                                CloudArrowTopBlockKt.CloudArrowTopBlock(modifierConstrainAs5, null, ComposableLambdaKt.composableLambda(composer2, -559141221, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$12
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
                                    public final void invoke(@Nullable Composer composer3, int i14) {
                                        if ((i14 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-559141221, i14, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevel.<anonymous>.<anonymous> (UpgradeObjectEventLevel.kt:291)");
                                            }
                                            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(i13, composer3, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._10wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer3, 196614, 26), composer3, 0, 3072, 57342);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 384, 2);
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(132296349);
                                Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._61wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composer2, 6));
                                composer2.startReplaceableGroup(132296615);
                                boolean zChanged12 = composer2.changed(constrainedLayoutReference8);
                                Object objRememberedValue15 = composer2.rememberedValue();
                                if (zChanged12 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue15 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$13$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference8.getBottom(), 0.0f, 0.0f, 6, null);
                                            ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue15);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierConstrainAs6 = constraintLayoutScope22.constrainAs(modifierM8174sizeVpY3zN4, constrainedLayoutReferenceComponent10, (Function1) objRememberedValue15);
                                final int i14 = i5;
                                final String str = optionThousand32;
                                CloudArrowTopBlockKt.CloudArrowTopBlock(modifierConstrainAs6, null, ComposableLambdaKt.composableLambda(composer2, -124444750, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt$UpgradeObjectEventLevel$1$14
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
                                    public final void invoke(@Nullable Composer composer3, int i15) {
                                        if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-124444750, i15, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevel.<anonymous>.<anonymous> (UpgradeObjectEventLevel.kt:311)");
                                            }
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            int i16 = i14;
                                            String str2 = str;
                                            composer3.startReplaceableGroup(693286680);
                                            Modifier.Companion companion7 = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor2 = companion8.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion7);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor2);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion8.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion8.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion8.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            ImageKt.Image(PainterResources_androidKt.painterResource(i16, composer3, 0), (String) null, SizeKt.fillMaxHeight$default(SizeKt.m8174sizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(companion7, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer3, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._19wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer3, 6)), 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                            TextKt.m10024Text4IGK_g(str2, (Modifier) null, 0L, 0L, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126), composer3, 0, 0, 65518);
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
                                }), composer2, 384, 2);
                                composer2.endReplaceableGroup();
                            }
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
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i8 & 32) == 0) {
        }
        if ((i8 & 64) == 0) {
        }
        if ((i8 & 128) == 0) {
        }
        if ((i8 & 256) != 0) {
        }
        if ((i9 & 191739611) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void UpgradeObjectEventLevelPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1826253707);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1826253707, i, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPreview (UpgradeObjectEventLevel.kt:336)");
            }
            UpgradeObjectEventLevel(PaddingKt.m8125paddingVpY3zN4$default(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(24), 0.0f, 2, null), true, 500, 2000, 11, 12, R.drawable.ic_christmas_tree_energy, R.string.christmas_tree_hint_level, true, composerStartRestartGroup, 115043766, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelKt.UpgradeObjectEventLevelPreview.1
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
                    UpgradeObjectEventLevelKt.UpgradeObjectEventLevelPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float UpgradeObjectEventLevel$lambda$0(State<Float> state) {
        return state.getValue().floatValue();
    }
}

