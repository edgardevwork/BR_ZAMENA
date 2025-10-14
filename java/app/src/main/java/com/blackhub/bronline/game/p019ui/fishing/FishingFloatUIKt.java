package com.blackhub.bronline.game.p019ui.fishing;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.RotateKt;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FishingFloatUI.kt */
@SourceDebugExtension({"SMAP\nFishingFloatUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FishingFloatUI.kt\ncom/blackhub/bronline/game/ui/fishing/FishingFloatUIKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,141:1\n1116#2,6:142\n67#3,7:148\n74#3:183\n78#3:229\n79#4,11:155\n79#4,11:191\n92#4:223\n92#4:228\n456#5,8:166\n464#5,3:180\n456#5,8:202\n464#5,3:216\n467#5,3:220\n467#5,3:225\n3737#6,6:174\n3737#6,6:210\n86#7,7:184\n93#7:219\n97#7:224\n81#8:230\n81#8:231\n*S KotlinDebug\n*F\n+ 1 FishingFloatUI.kt\ncom/blackhub/bronline/game/ui/fishing/FishingFloatUIKt\n*L\n68#1:142,6\n87#1:148,7\n87#1:183\n87#1:229\n87#1:155,11\n95#1:191,11\n95#1:223\n87#1:228\n87#1:166,8\n87#1:180,3\n95#1:202,8\n95#1:216,3\n95#1:220,3\n87#1:225,3\n87#1:174,6\n95#1:210,6\n95#1:184,7\n95#1:219\n95#1:224\n48#1:230\n58#1:231\n*E\n"})
/* loaded from: classes3.dex */
public final class FishingFloatUIKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FishingFloatUI(@NotNull final MutableState<Boolean> animState, long j, @Nullable Function0<Unit> function0, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        int i4;
        Function0<Unit> function02;
        long j3;
        Function0<Unit> function03;
        boolean z;
        Object objRememberedValue;
        int i5;
        Composer composer2;
        final long j4;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(animState, "animState");
        Composer composerStartRestartGroup = composer.startRestartGroup(650878459);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(animState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                j2 = j;
                i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
                }
                if ((i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
                    if (i6 != 0) {
                        j2 = 0;
                    }
                    j3 = j2;
                    function03 = i4 == 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingFloatUIKt.FishingFloatUI.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    } : function02;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(650878459, i3, -1, "com.blackhub.bronline.game.ui.fishing.FishingFloatUI (FishingFloatUI.kt:36)");
                    }
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                    float fM14409dpToPx8Feqmps = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._minus33sdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
                    ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._minus10sdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
                    float fM14409dpToPx8Feqmps2 = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                    RepeatMode repeatMode = RepeatMode.Reverse;
                    InfiniteRepeatableSpec infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(tweenSpecTween$default, repeatMode, 0L, 4, null);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String strEmpty = AnyExtensionKt.empty(stringCompanionObject);
                    int i7 = InfiniteTransition.$stable;
                    int i8 = InfiniteRepeatableSpec.$stable;
                    State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 8.0f, -8.0f, infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default, strEmpty, composerStartRestartGroup, i7 | 432 | (i8 << 9), 0);
                    State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, fM14409dpToPx8Feqmps, fM14409dpToPx8Feqmps2, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, null, 6, null), repeatMode, 0L, 4, null), AnyExtensionKt.empty(stringCompanionObject), composerStartRestartGroup, i7 | (i8 << 9), 0);
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-892605961);
                    z = ((i3 & 896) != 256) | ((i3 & 112) != 32) | ((i3 & 14) != 4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        i5 = 0;
                        composer2 = composerStartRestartGroup;
                        FishingFloatUIKt$FishingFloatUI$2$1 fishingFloatUIKt$FishingFloatUI$2$1 = new FishingFloatUIKt$FishingFloatUI$2$1(j3, function03, animState, null);
                        composer2.updateRememberedValue(fishingFloatUIKt$FishingFloatUI$2$1);
                        objRememberedValue = fishingFloatUIKt$FishingFloatUI$2$1;
                    } else {
                        i5 = 0;
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 70);
                    if (animState.getValue().booleanValue()) {
                        fM14409dpToPx8Feqmps = FishingFloatUI$lambda$1(stateAnimateFloat2);
                    }
                    FishingFloatContent(FishingFloatUI$lambda$0(stateAnimateFloat), fM14409dpToPx8Feqmps, composer2, i5, i5);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j4 = j3;
                    function04 = function03;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    j4 = j2;
                    function04 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingFloatUIKt.FishingFloatUI.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i9) {
                            FishingFloatUIKt.FishingFloatUI(animState, j4, function04, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            function02 = function0;
            if ((i3 & 731) != 146) {
                if (i6 != 0) {
                }
                j3 = j2;
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                InfiniteTransition infiniteTransitionRememberInfiniteTransition3 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition22 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                float fM14409dpToPx8Feqmps3 = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._minus33sdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
                ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._minus10sdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
                float fM14409dpToPx8Feqmps22 = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
                TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                RepeatMode repeatMode2 = RepeatMode.Reverse;
                InfiniteRepeatableSpec infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(tweenSpecTween$default2, repeatMode2, 0L, 4, null);
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String strEmpty2 = AnyExtensionKt.empty(stringCompanionObject2);
                int i72 = InfiniteTransition.$stable;
                int i82 = InfiniteRepeatableSpec.$stable;
                State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 8.0f, -8.0f, infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default2, strEmpty2, composerStartRestartGroup, i72 | 432 | (i82 << 9), 0);
                State<Float> stateAnimateFloat22 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition22, fM14409dpToPx8Feqmps3, fM14409dpToPx8Feqmps22, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(500, 0, null, 6, null), repeatMode2, 0L, 4, null), AnyExtensionKt.empty(stringCompanionObject2), composerStartRestartGroup, i72 | (i82 << 9), 0);
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-892605961);
                if ((i3 & 112) != 32) {
                }
                z = ((i3 & 896) != 256) | ((i3 & 112) != 32) | ((i3 & 14) != 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                    i5 = 0;
                    composer2 = composerStartRestartGroup;
                    FishingFloatUIKt$FishingFloatUI$2$1 fishingFloatUIKt$FishingFloatUI$2$12 = new FishingFloatUIKt$FishingFloatUI$2$1(j3, function03, animState, null);
                    composer2.updateRememberedValue(fishingFloatUIKt$FishingFloatUI$2$12);
                    objRememberedValue = fishingFloatUIKt$FishingFloatUI$2$12;
                    composer2.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 70);
                    if (animState.getValue().booleanValue()) {
                    }
                    FishingFloatContent(FishingFloatUI$lambda$0(stateAnimateFloat3), fM14409dpToPx8Feqmps3, composer2, i5, i5);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    j4 = j3;
                    function04 = function03;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        j2 = j;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 731) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FishingFloatContent(float f, float f2, Composer composer, final int i, final int i2) {
        float f3;
        int i3;
        float f4;
        final float f5;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final float f6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1912665341);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f3 = f;
        } else if ((i & 14) == 0) {
            f3 = f;
            i3 = (composerStartRestartGroup.changed(f3) ? 4 : 2) | i;
        } else {
            f3 = f;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                f4 = f2;
                i3 |= composerStartRestartGroup.changed(f4) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                f5 = i4 == 0 ? 0.0f : f3;
                float f7 = i5 == 0 ? 0.0f : f4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1912665341, i3, -1, "com.blackhub.bronline.game.ui.fishing.FishingFloatContent (FishingFloatUI.kt:85)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment bottomCenter = companion.getBottomCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
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
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._80sdp, composerStartRestartGroup, 6);
                float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._50sdp, composerStartRestartGroup, 6);
                float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6);
                float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._66sdp, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                f6 = f7;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_water, composerStartRestartGroup, 6), (String) null, SizeKt.m8174sizeVpY3zN4(companion2, fDimensionResource, fDimensionResource2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_float_in_fishing, composerStartRestartGroup, 6), (String) null, RotateKt.rotate(OffsetKt.m8084offsetVpY3zN4$default(SizeKt.m8174sizeVpY3zN4(companion2, fDimensionResource3, fDimensionResource4), 0.0f, ComposeExtensionKt.pxToDp((int) f6, composerStartRestartGroup, 0), 1, null), f5), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_water, composerStartRestartGroup, 6), (String) null, SizeKt.m8174sizeVpY3zN4(companion2, fDimensionResource, fDimensionResource2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
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
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                f5 = f3;
                f6 = f4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingFloatUIKt.FishingFloatContent.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i6) {
                        FishingFloatUIKt.FishingFloatContent(f5, f6, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        f4 = f2;
        if ((i3 & 91) == 18) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment bottomCenter2 = companion4.getBottomCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion22 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(bottomCenter2, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion22);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM10870constructorimpl.getInserting()) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._80sdp, composerStartRestartGroup, 6);
                float fDimensionResource22 = PrimitiveResources_androidKt.dimensionResource(R.dimen._50sdp, composerStartRestartGroup, 6);
                float fDimensionResource32 = PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6);
                float fDimensionResource42 = PrimitiveResources_androidKt.dimensionResource(R.dimen._66sdp, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion22);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl2.getInserting()) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    f6 = f7;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_water, composerStartRestartGroup, 6), (String) null, SizeKt.m8174sizeVpY3zN4(companion22, fDimensionResource5, fDimensionResource22), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_float_in_fishing, composerStartRestartGroup, 6), (String) null, RotateKt.rotate(OffsetKt.m8084offsetVpY3zN4$default(SizeKt.m8174sizeVpY3zN4(companion22, fDimensionResource32, fDimensionResource42), 0.0f, ComposeExtensionKt.pxToDp((int) f6, composerStartRestartGroup, 0), 1, null), f5), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_water, composerStartRestartGroup, 6), (String) null, SizeKt.m8174sizeVpY3zN4(companion22, fDimensionResource5, fDimensionResource22), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(heightDp = 390, name = "FishingWaterUI", widthDp = 844)
    public static final void PreviewFishingFloatUI(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1932206606);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1932206606, i, -1, "com.blackhub.bronline.game.ui.fishing.PreviewFishingFloatUI (FishingFloatUI.kt:138)");
            }
            FishingFloatContent(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingFloatUIKt.PreviewFishingFloatUI.1
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
                    FishingFloatUIKt.PreviewFishingFloatUI(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float FishingFloatUI$lambda$0(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float FishingFloatUI$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }
}

