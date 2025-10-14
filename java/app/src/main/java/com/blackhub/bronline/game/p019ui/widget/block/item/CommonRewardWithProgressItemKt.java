package com.blackhub.bronline.game.p019ui.widget.block.item;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
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
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
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
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.p019ui.blackpass.uiblock.BlackPassProgressBarKt;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonRewardWithProgressItem.kt */
@SourceDebugExtension({"SMAP\nCommonRewardWithProgressItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRewardWithProgressItem.kt\ncom/blackhub/bronline/game/ui/widget/block/item/CommonRewardWithProgressItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 8 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,196:1\n1116#2,6:197\n1116#2,6:203\n1116#2,6:209\n1116#2,6:215\n955#2,6:261\n68#3,6:221\n74#3:255\n78#3:291\n79#4,11:227\n92#4:290\n456#5,8:238\n464#5,3:252\n25#5:260\n467#5,3:287\n3737#6,6:246\n73#7,4:256\n77#7,20:267\n75#8:292\n81#9:293\n81#9:294\n81#9:295\n*S KotlinDebug\n*F\n+ 1 CommonRewardWithProgressItem.kt\ncom/blackhub/bronline/game/ui/widget/block/item/CommonRewardWithProgressItemKt\n*L\n55#1:197,6\n59#1:203,6\n63#1:209,6\n67#1:215,6\n88#1:261,6\n82#1:221,6\n82#1:255\n82#1:291\n82#1:227,11\n82#1:290\n82#1:238,8\n82#1:252,3\n88#1:260\n82#1:287,3\n82#1:246,6\n88#1:256,4\n88#1:267,20\n55#1:292\n59#1:293\n63#1:294\n67#1:295\n*E\n"})
/* loaded from: classes3.dex */
public final class CommonRewardWithProgressItemKt {
    /* JADX WARN: Removed duplicated region for block: B:123:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CommonPrizeWithProgressItem-wn8IZOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15058CommonPrizeWithProgressItemwn8IZOc(@Nullable Modifier modifier, @NotNull final CommonRewardModel topRewardModel, @Nullable CommonRewardModel commonRewardModel, @Nullable final Bitmap bitmap, final int i, final int i2, final int i3, final boolean z, float f, @NotNull final Function0<Unit> onPlusBtnClick, @NotNull final Function1<? super Bitmap, Unit> onTopItemClick, @Nullable Function1<? super Bitmap, Unit> function1, @Nullable Composer composer, final int i4, final int i5, final int i6) {
        float f2;
        int i7;
        float fDimensionResource;
        int i8;
        final int i9;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object obj;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        float fDimensionResource2;
        Intrinsics.checkNotNullParameter(topRewardModel, "topRewardModel");
        Intrinsics.checkNotNullParameter(onPlusBtnClick, "onPlusBtnClick");
        Intrinsics.checkNotNullParameter(onTopItemClick, "onTopItemClick");
        final Composer composerStartRestartGroup = composer.startRestartGroup(1001857532);
        Modifier modifier2 = (i6 & 1) != 0 ? Modifier.INSTANCE : modifier;
        CommonRewardModel commonRewardModel2 = (i6 & 4) != 0 ? null : commonRewardModel;
        if ((i6 & 256) != 0) {
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(731521327);
                fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._228wdp, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(731521376);
                fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._131wdp, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            }
            i7 = (-234881025) & i4;
            f2 = fDimensionResource2;
        } else {
            f2 = f;
            i7 = i4;
        }
        Function1<? super Bitmap, Unit> function12 = (i6 & 2048) != 0 ? new Function1<Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Bitmap bitmap2) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap2) {
                invoke2(bitmap2);
                return Unit.INSTANCE;
            }
        } : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1001857532, i7, i5, "com.blackhub.bronline.game.ui.widget.block.item.CommonPrizeWithProgressItem (CommonRewardWithProgressItem.kt:46)");
        }
        if (topRewardModel.isSuperReward() || (commonRewardModel2 != null && commonRewardModel2.isSuperReward())) {
            composerStartRestartGroup.startReplaceableGroup(731521693);
            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._103wdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(731521762);
            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._85wdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.startReplaceableGroup(731521833);
        int i10 = (57344 & i4) ^ CpioConstants.C_ISBLK;
        boolean z2 = (i10 > 16384 && composerStartRestartGroup.changed(i)) || (i4 & CpioConstants.C_ISBLK) == 16384;
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = SnapshotIntStateKt.mutableIntStateOf(i + 1);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        final MutableIntState mutableIntState = (MutableIntState) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        int intValue = mutableIntState.getIntValue();
        composerStartRestartGroup.startReplaceableGroup(731521925);
        int i11 = (3670016 & i4) ^ 1572864;
        boolean zChanged = ((i11 > 1048576 && composerStartRestartGroup.changed(i3)) || (i4 & 1572864) == 1048576) | composerStartRestartGroup.changed(intValue);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(i3 == mutableIntState.getIntValue()), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
            objRememberedValue5 = mutableStateMutableStateOf$default;
        }
        final MutableState mutableState = (MutableState) objRememberedValue5;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(731522037);
        boolean z3 = ((i11 > 1048576 && composerStartRestartGroup.changed(i3)) || (i4 & 1572864) == 1048576) | ((i10 > 16384 && composerStartRestartGroup.changed(i)) || (i4 & CpioConstants.C_ISBLK) == 16384) | ((((458752 & i4) ^ ProfileVerifier.CompilationStatus.f342xf2722a21) > 131072 && composerStartRestartGroup.changed(i2)) || (i4 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 131072);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
            MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(i3 == i && i < i2), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
            objRememberedValue6 = mutableStateMutableStateOf$default2;
        }
        final MutableState mutableState2 = (MutableState) objRememberedValue6;
        composerStartRestartGroup.endReplaceableGroup();
        int intValue2 = mutableIntState.getIntValue();
        composerStartRestartGroup.startReplaceableGroup(731522180);
        boolean zChanged2 = composerStartRestartGroup.changed(intValue2);
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
            MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(mutableIntState.getIntValue() < i2), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default3);
            objRememberedValue7 = mutableStateMutableStateOf$default3;
        }
        MutableState mutableState3 = (MutableState) objRememberedValue7;
        composerStartRestartGroup.endReplaceableGroup();
        if (CommonPrizeWithProgressItem_wn8IZOc$lambda$7(mutableState3) || !CommonPrizeWithProgressItem_wn8IZOc$lambda$3(mutableState)) {
            if (i3 != 0) {
                if (CommonPrizeWithProgressItem_wn8IZOc$lambda$5(mutableState2) && CommonPrizeWithProgressItem_wn8IZOc$lambda$7(mutableState3)) {
                    i8 = 5;
                } else if (i3 >= mutableIntState.getIntValue()) {
                    i8 = 100;
                }
            }
            i9 = 0;
            final float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composerStartRestartGroup, 6);
            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(modifier2, fDimensionResource), f2);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
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
            if (objRememberedValue3 != companion.getEmpty()) {
                obj = null;
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                obj = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            final float f3 = f2;
            final Modifier modifier3 = modifier2;
            Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue3, measurer, composerStartRestartGroup, 4544);
            MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
            final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem_wn8IZOc$lambda$16$$inlined$ConstraintLayout$1
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
            }, 1, obj);
            final int i12 = 6;
            final CommonRewardModel commonRewardModel3 = commonRewardModel2;
            final Function1<? super Bitmap, Unit> function13 = function12;
            LayoutKt.MultiMeasureLayout(modifierSemantics$default, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem_wn8IZOc$lambda$16$$inlined$ConstraintLayout$2
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
                public final void invoke(@Nullable Composer composer2, int i13) {
                    Modifier.Companion companion3;
                    ConstrainedLayoutReference constrainedLayoutReference;
                    ConstraintLayoutScope constraintLayoutScope2;
                    boolean z4;
                    if (((i13 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                        constraintLayoutScope.reset();
                        ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
                        final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                        final ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                        ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(constraintLayoutScope3.constrainAs(companion4, constrainedLayoutReferenceComponent1, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem$2$1$1
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
                        }), PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composer2, 6));
                        Alignment.Companion companion5 = Alignment.INSTANCE;
                        Alignment center = companion5.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs2);
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
                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier modifierM8158height3ABfNKs3 = SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(topRewardModel.getHeightOfRewardItemBPOrEvents(), composer2, 0));
                        float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(topRewardModel.getWidthOfRewardItemBPOrEvents(), composer2, 0);
                        String upperCase = StringResources_androidKt.stringResource(R.string.common_get, composer2, 6).toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer2, 6);
                        float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(topRewardModel.getHeightOfGetButtonBPOrEvents(), composer2, 0);
                        long jColorResource = ColorResources_androidKt.colorResource(R.color.white, composer2, 6);
                        CommonRewardModel commonRewardModel4 = topRewardModel;
                        composer2.startReplaceableGroup(2079086923);
                        boolean z5 = (((i5 & 14) ^ 6) > 4 && composerStartRestartGroup.changed(onTopItemClick)) || (i5 & 6) == 4;
                        Object objRememberedValue8 = composer2.rememberedValue();
                        if (z5 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            final Function1 function14 = onTopItemClick;
                            objRememberedValue8 = new Function1<Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem$2$1$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap2) {
                                    invoke2(bitmap2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Bitmap bitmap2) {
                                    function14.invoke(bitmap2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue8);
                        }
                        composer2.endReplaceableGroup();
                        CommonRewardItemKt.m15055CommonPrizeItemBFw8Yg(modifierM8158height3ABfNKs3, fDimensionResource4, commonRewardModel4, fDimensionResource5, fDimensionResource6, false, 0.0f, null, upperCase, null, 0.0f, null, null, null, null, null, false, jColorResource, (Function1) objRememberedValue8, composer2, 197120, 0, 130752);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-537807876);
                        if (!z || commonRewardModel3 == null) {
                            companion3 = companion4;
                            constrainedLayoutReference = constrainedLayoutReferenceComponent2;
                            constraintLayoutScope2 = constraintLayoutScope3;
                            z4 = false;
                        } else {
                            composer2.startReplaceableGroup(-537807714);
                            boolean zChanged3 = composer2.changed(constrainedLayoutReferenceComponent2) | composer2.changed(fDimensionResource3);
                            Object objRememberedValue9 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                final float f4 = fDimensionResource3;
                                objRememberedValue9 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem$2$1$3$1
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
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent2.getBottom(), C2046Dp.m13666constructorimpl(-f4), 0.0f, 4, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue9);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierM8158height3ABfNKs4 = SizeKt.m8158height3ABfNKs(constraintLayoutScope3.constrainAs(companion4, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue9), PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composer2, 6));
                            Alignment center2 = companion5.getCenter();
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs4);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion6.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            Modifier modifierM8158height3ABfNKs5 = SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(commonRewardModel3.getHeightOfRewardItemBPOrEvents(), composer2, 0));
                            float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(commonRewardModel3.getWidthOfRewardItemBPOrEvents(), composer2, 0);
                            CommonRewardModel commonRewardModel5 = commonRewardModel3;
                            float fDimensionResource8 = PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer2, 6);
                            float fDimensionResource9 = PrimitiveResources_androidKt.dimensionResource(commonRewardModel3.getHeightOfGetButtonBPOrEvents(), composer2, 0);
                            long jColorResource2 = ColorResources_androidKt.colorResource(R.color.white, composer2, 6);
                            composer2.startReplaceableGroup(2079088240);
                            boolean z6 = (((i5 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(function13)) || (i5 & 48) == 32;
                            Object objRememberedValue10 = composer2.rememberedValue();
                            if (z6 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                final Function1 function15 = function13;
                                objRememberedValue10 = new Function1<Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem$2$1$4$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap2) {
                                        invoke2(bitmap2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Bitmap bitmap2) {
                                        function15.invoke(bitmap2);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue10);
                            }
                            composer2.endReplaceableGroup();
                            z4 = false;
                            companion3 = companion4;
                            constraintLayoutScope2 = constraintLayoutScope3;
                            constrainedLayoutReference = constrainedLayoutReferenceComponent2;
                            CommonRewardItemKt.m15055CommonPrizeItemBFw8Yg(modifierM8158height3ABfNKs5, fDimensionResource7, commonRewardModel5, fDimensionResource8, fDimensionResource9, false, 0.0f, null, null, null, 0.0f, null, null, null, null, null, false, jColorResource2, (Function1) objRememberedValue10, composer2, 197120, 0, 131008);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-537806427);
                        boolean zChanged4 = composer2.changed(constrainedLayoutReferenceComponent1) | composer2.changed(fDimensionResource3);
                        Object objRememberedValue11 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            final float f5 = fDimensionResource3;
                            objRememberedValue11 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem$2$1$5$1
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
                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getBottom(), C2046Dp.m13666constructorimpl(-f5), 0.0f, 4, null);
                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue11);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierM8158height3ABfNKs6 = SizeKt.m8158height3ABfNKs(constraintLayoutScope2.constrainAs(companion3, constrainedLayoutReference, (Function1) objRememberedValue11), PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer2, 6));
                        int intValue3 = mutableIntState.getIntValue();
                        boolean zCommonPrizeWithProgressItem_wn8IZOc$lambda$3 = CommonRewardWithProgressItemKt.CommonPrizeWithProgressItem_wn8IZOc$lambda$3(mutableState);
                        boolean zCommonPrizeWithProgressItem_wn8IZOc$lambda$5 = CommonRewardWithProgressItemKt.CommonPrizeWithProgressItem_wn8IZOc$lambda$5(mutableState2);
                        float fDimensionResource10 = PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer2, 6);
                        float fDimensionResource11 = PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer2, 6);
                        Bitmap bitmap2 = bitmap;
                        int i14 = i9;
                        composer2.startReplaceableGroup(-537805688);
                        boolean z7 = ((((i4 & 1879048192) ^ 805306368) <= 536870912 || !composerStartRestartGroup.changed(onPlusBtnClick)) && (i4 & 805306368) != 536870912) ? z4 : true;
                        Object objRememberedValue12 = composer2.rememberedValue();
                        if (z7 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            final Function0 function0 = onPlusBtnClick;
                            objRememberedValue12 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem$2$1$6$1
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
                                    function0.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue12);
                        }
                        composer2.endReplaceableGroup();
                        BlackPassProgressBarKt.m14899BlackPassProgressBarBXK5RNM(modifierM8158height3ABfNKs6, intValue3, bitmap2, zCommonPrizeWithProgressItem_wn8IZOc$lambda$3, zCommonPrizeWithProgressItem_wn8IZOc$lambda$5, R.color.yellow, i14, fDimensionResource10, fDimensionResource11, false, (Function0) objRememberedValue12, composer2, 805503488, 0, 0);
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
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final CommonRewardModel commonRewardModel4 = commonRewardModel2;
                final Function1<? super Bitmap, Unit> function14 = function12;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem$3
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

                    public final void invoke(@Nullable Composer composer2, int i13) {
                        CommonRewardWithProgressItemKt.m15058CommonPrizeWithProgressItemwn8IZOc(modifier3, topRewardModel, commonRewardModel4, bitmap, i, i2, i3, z, f3, onPlusBtnClick, onTopItemClick, function14, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                    }
                });
                return;
            }
            return;
        }
        i8 = 50;
        i9 = i8;
        final float fDimensionResource32 = PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composerStartRestartGroup, 6);
        Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(modifier2, fDimensionResource), f2);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
        }
        composerStartRestartGroup.startReusableNode();
        if (!composerStartRestartGroup.getInserting()) {
        }
        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
        if (!composerM10870constructorimpl.getInserting()) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
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
        if (objRememberedValue3 != companion.getEmpty()) {
        }
        composerStartRestartGroup.endReplaceableGroup();
        final float f32 = f2;
        final Modifier modifier32 = modifier2;
        Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy2 = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope2, (MutableState<Boolean>) objRememberedValue3, measurer2, composerStartRestartGroup, 4544);
        MeasurePolicy measurePolicyComponent12 = pairRememberConstraintLayoutMeasurePolicy2.component1();
        final Function0 function0Component22 = pairRememberConstraintLayoutMeasurePolicy2.component2();
        Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifierFillMaxSize$default2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem_wn8IZOc$lambda$16$$inlined$ConstraintLayout$1
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
        }, 1, obj);
        final int i122 = 6;
        final CommonRewardModel commonRewardModel32 = commonRewardModel2;
        final Function1 function132 = function12;
        LayoutKt.MultiMeasureLayout(modifierSemantics$default2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem_wn8IZOc$lambda$16$$inlined$ConstraintLayout$2
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
            public final void invoke(@Nullable Composer composer2, int i13) {
                Modifier.Companion companion3;
                ConstrainedLayoutReference constrainedLayoutReference;
                ConstraintLayoutScope constraintLayoutScope22;
                boolean z4;
                if (((i13 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                    int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                    constraintLayoutScope2.reset();
                    ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope2;
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierM8158height3ABfNKs22 = SizeKt.m8158height3ABfNKs(constraintLayoutScope3.constrainAs(companion4, constrainedLayoutReferenceComponent1, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem$2$1$1
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
                    }), PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composer2, 6));
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    Alignment center = companion5.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor22 = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs22);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor22);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy22, companion6.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    Modifier modifierM8158height3ABfNKs3 = SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(topRewardModel.getHeightOfRewardItemBPOrEvents(), composer2, 0));
                    float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(topRewardModel.getWidthOfRewardItemBPOrEvents(), composer2, 0);
                    String upperCase = StringResources_androidKt.stringResource(R.string.common_get, composer2, 6).toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer2, 6);
                    float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(topRewardModel.getHeightOfGetButtonBPOrEvents(), composer2, 0);
                    long jColorResource = ColorResources_androidKt.colorResource(R.color.white, composer2, 6);
                    CommonRewardModel commonRewardModel42 = topRewardModel;
                    composer2.startReplaceableGroup(2079086923);
                    boolean z5 = (((i5 & 14) ^ 6) > 4 && composerStartRestartGroup.changed(onTopItemClick)) || (i5 & 6) == 4;
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (z5 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        final Function1<? super Bitmap, Unit> function142 = onTopItemClick;
                        objRememberedValue8 = new Function1<Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem$2$1$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap2) {
                                invoke2(bitmap2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Bitmap bitmap2) {
                                function142.invoke(bitmap2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    composer2.endReplaceableGroup();
                    CommonRewardItemKt.m15055CommonPrizeItemBFw8Yg(modifierM8158height3ABfNKs3, fDimensionResource4, commonRewardModel42, fDimensionResource5, fDimensionResource6, false, 0.0f, null, upperCase, null, 0.0f, null, null, null, null, null, false, jColorResource, (Function1) objRememberedValue8, composer2, 197120, 0, 130752);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-537807876);
                    if (!z || commonRewardModel32 == null) {
                        companion3 = companion4;
                        constrainedLayoutReference = constrainedLayoutReferenceComponent2;
                        constraintLayoutScope22 = constraintLayoutScope3;
                        z4 = false;
                    } else {
                        composer2.startReplaceableGroup(-537807714);
                        boolean zChanged3 = composer2.changed(constrainedLayoutReferenceComponent2) | composer2.changed(fDimensionResource32);
                        Object objRememberedValue9 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            final float f4 = fDimensionResource32;
                            objRememberedValue9 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem$2$1$3$1
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
                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent2.getBottom(), C2046Dp.m13666constructorimpl(-f4), 0.0f, 4, null);
                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue9);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierM8158height3ABfNKs4 = SizeKt.m8158height3ABfNKs(constraintLayoutScope3.constrainAs(companion4, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue9), PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composer2, 6));
                        Alignment center2 = companion5.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs4);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion6.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        Modifier modifierM8158height3ABfNKs5 = SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(commonRewardModel32.getHeightOfRewardItemBPOrEvents(), composer2, 0));
                        float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(commonRewardModel32.getWidthOfRewardItemBPOrEvents(), composer2, 0);
                        CommonRewardModel commonRewardModel5 = commonRewardModel32;
                        float fDimensionResource8 = PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer2, 6);
                        float fDimensionResource9 = PrimitiveResources_androidKt.dimensionResource(commonRewardModel32.getHeightOfGetButtonBPOrEvents(), composer2, 0);
                        long jColorResource2 = ColorResources_androidKt.colorResource(R.color.white, composer2, 6);
                        composer2.startReplaceableGroup(2079088240);
                        boolean z6 = (((i5 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(function132)) || (i5 & 48) == 32;
                        Object objRememberedValue10 = composer2.rememberedValue();
                        if (z6 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            final Function1<? super Bitmap, Unit> function15 = function132;
                            objRememberedValue10 = new Function1<Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem$2$1$4$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap2) {
                                    invoke2(bitmap2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Bitmap bitmap2) {
                                    function15.invoke(bitmap2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue10);
                        }
                        composer2.endReplaceableGroup();
                        z4 = false;
                        companion3 = companion4;
                        constraintLayoutScope22 = constraintLayoutScope3;
                        constrainedLayoutReference = constrainedLayoutReferenceComponent2;
                        CommonRewardItemKt.m15055CommonPrizeItemBFw8Yg(modifierM8158height3ABfNKs5, fDimensionResource7, commonRewardModel5, fDimensionResource8, fDimensionResource9, false, 0.0f, null, null, null, 0.0f, null, null, null, null, null, false, jColorResource2, (Function1) objRememberedValue10, composer2, 197120, 0, 131008);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-537806427);
                    boolean zChanged4 = composer2.changed(constrainedLayoutReferenceComponent1) | composer2.changed(fDimensionResource32);
                    Object objRememberedValue11 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        final float f5 = fDimensionResource32;
                        objRememberedValue11 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem$2$1$5$1
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
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getBottom(), C2046Dp.m13666constructorimpl(-f5), 0.0f, 4, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue11);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierM8158height3ABfNKs6 = SizeKt.m8158height3ABfNKs(constraintLayoutScope22.constrainAs(companion3, constrainedLayoutReference, (Function1) objRememberedValue11), PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer2, 6));
                    int intValue3 = mutableIntState.getIntValue();
                    boolean zCommonPrizeWithProgressItem_wn8IZOc$lambda$3 = CommonRewardWithProgressItemKt.CommonPrizeWithProgressItem_wn8IZOc$lambda$3(mutableState);
                    boolean zCommonPrizeWithProgressItem_wn8IZOc$lambda$5 = CommonRewardWithProgressItemKt.CommonPrizeWithProgressItem_wn8IZOc$lambda$5(mutableState2);
                    float fDimensionResource10 = PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer2, 6);
                    float fDimensionResource11 = PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer2, 6);
                    Bitmap bitmap2 = bitmap;
                    int i14 = i9;
                    composer2.startReplaceableGroup(-537805688);
                    boolean z7 = ((((i4 & 1879048192) ^ 805306368) <= 536870912 || !composerStartRestartGroup.changed(onPlusBtnClick)) && (i4 & 805306368) != 536870912) ? z4 : true;
                    Object objRememberedValue12 = composer2.rememberedValue();
                    if (z7 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        final Function0<Unit> function0 = onPlusBtnClick;
                        objRememberedValue12 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt$CommonPrizeWithProgressItem$2$1$6$1
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
                                function0.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue12);
                    }
                    composer2.endReplaceableGroup();
                    BlackPassProgressBarKt.m14899BlackPassProgressBarBXK5RNM(modifierM8158height3ABfNKs6, intValue3, bitmap2, zCommonPrizeWithProgressItem_wn8IZOc$lambda$3, zCommonPrizeWithProgressItem_wn8IZOc$lambda$5, R.color.yellow, i14, fDimensionResource10, fDimensionResource11, false, (Function0) objRememberedValue12, composer2, 805503488, 0, 0);
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
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CommonPrizeWithProgressItemPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-360351305);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-360351305, i, -1, "com.blackhub.bronline.game.ui.widget.block.item.CommonPrizeWithProgressItemPreview (CommonRewardWithProgressItem.kt:173)");
            }
            m15058CommonPrizeWithProgressItemwn8IZOc(null, new CommonRewardModel(0, "322", null, "Получить", null, 0, 0, null, false, false, 0, CommonRewardState.NORM_AVAILABLE, null, false, false, null, 0, null, 251893, null), new CommonRewardModel(0, "322", null, null, null, 0, 0, null, false, false, 0, CommonRewardState.NORM_NOT_RECEIVED, null, false, false, null, 0, null, 251901, null), null, 0, 12, 0, true, 0.0f, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt.CommonPrizeWithProgressItemPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt.CommonPrizeWithProgressItemPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Bitmap bitmap) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
                    invoke2(bitmap);
                    return Unit.INSTANCE;
                }
            }, null, composerStartRestartGroup, 819686976, 6, 2305);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardWithProgressItemKt.CommonPrizeWithProgressItemPreview.3
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
                    CommonRewardWithProgressItemKt.CommonPrizeWithProgressItemPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean CommonPrizeWithProgressItem_wn8IZOc$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean CommonPrizeWithProgressItem_wn8IZOc$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean CommonPrizeWithProgressItem_wn8IZOc$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}

