package com.blackhub.bronline.game.p019ui.clicker;

import android.graphics.Bitmap;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.ContentScale;
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
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ClickerContent.kt */
@SourceDebugExtension({"SMAP\nClickerContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickerContent.kt\ncom/blackhub/bronline/game/ui/clicker/ClickerContentKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,262:1\n487#2,4:263\n491#2,2:271\n495#2:277\n25#3:267\n1116#4,3:268\n1119#4,3:274\n1116#4,6:278\n1116#4,6:284\n1116#4,6:290\n1116#4,6:296\n1116#4,6:303\n1116#4,6:309\n1116#4,6:315\n487#5:273\n75#6:302\n81#7:321\n107#7,2:322\n81#7:324\n107#7,2:325\n81#7:330\n107#7,2:331\n75#8:327\n108#8,2:328\n*S KotlinDebug\n*F\n+ 1 ClickerContent.kt\ncom/blackhub/bronline/game/ui/clicker/ClickerContentKt\n*L\n74#1:263,4\n74#1:271,2\n74#1:277\n74#1:267\n74#1:268,3\n74#1:274,3\n76#1:278,6\n78#1:284,6\n80#1:290,6\n81#1:296,6\n86#1:303,6\n88#1:309,6\n110#1:315,6\n74#1:273\n84#1:302\n76#1:321\n76#1:322,2\n78#1:324\n78#1:325,2\n81#1:330\n81#1:331,2\n80#1:327\n80#1:328,2\n*E\n"})

public final class ClickerContentKt {
    public static final long DELAY_HUNDRED_MS = 100;
    public static final int DURATION_MOUSE_MS = 50;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClickerContent(@Nullable final Bitmap bitmap, @Nullable final Bitmap bitmap2, @NotNull final String textMainHint, final int i, @NotNull final String myNick, @NotNull final String opponentNick, final int i2, @NotNull final Function0<Unit> onCloseClick, @NotNull final Function0<Unit> onTapScreen, @NotNull final Function0<Unit> onFinishTimer, @Nullable Composer composer, final int i3) {
        int i4;
        final Animatable animatable;
        Intrinsics.checkNotNullParameter(textMainHint, "textMainHint");
        Intrinsics.checkNotNullParameter(myNick, "myNick");
        Intrinsics.checkNotNullParameter(opponentNick, "opponentNick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onTapScreen, "onTapScreen");
        Intrinsics.checkNotNullParameter(onFinishTimer, "onFinishTimer");
        Composer composerStartRestartGroup = composer.startRestartGroup(1380516270);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1380516270, i3, -1, "com.blackhub.bronline.game.ui.clicker.ClickerContent (ClickerContent.kt:71)");
        }
        final Mutex mutexMutex$default = MutexKt.Mutex$default(false, 1, null);
        composerStartRestartGroup.startReplaceableGroup(773894976);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composerStartRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(505108604);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final MutableState mutableState = (MutableState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(505108672);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        final MutableState mutableState2 = (MutableState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(505108737);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotIntStateKt.mutableIntStateOf(0);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        MutableIntState mutableIntState = (MutableIntState) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(505108806);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        final MutableState mutableState3 = (MutableState) objRememberedValue5;
        composerStartRestartGroup.endReplaceableGroup();
        final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._146wdp, composerStartRestartGroup, 6);
        final float fM13666constructorimpl = C2046Dp.m13666constructorimpl(fDimensionResource / 2);
        composerStartRestartGroup.startReplaceableGroup(505108986);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        Animatable animatable2 = (Animatable) objRememberedValue6;
        composerStartRestartGroup.endReplaceableGroup();
        Integer numValueOf = Integer.valueOf(i);
        composerStartRestartGroup.startReplaceableGroup(505109058);
        boolean z = (((i3 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(i)) || (i3 & 3072) == 2048;
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (z || objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new ClickerContentKt$ClickerContent$1$1(i, mutableIntState, mutableState3, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, ((i3 >> 9) & 14) | 64);
        EffectsKt.LaunchedEffect(ClickerContent$lambda$1(mutableState), new C53402(animatable2, null), composerStartRestartGroup, 64);
        Boolean boolValueOf = Boolean.valueOf(ClickerContent$lambda$4(mutableState2));
        composerStartRestartGroup.startReplaceableGroup(505109702);
        boolean z2 = (((1879048192 & i3) ^ 805306368) > 536870912 && composerStartRestartGroup.changed(onFinishTimer)) || (i3 & 805306368) == 536870912;
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue8 == companion.getEmpty()) {
            i4 = 64;
            animatable = animatable2;
            ClickerContentKt$ClickerContent$3$1 clickerContentKt$ClickerContent$3$1 = new ClickerContentKt$ClickerContent$3$1(onFinishTimer, mutableState2, mutableIntState, mutableState3, null);
            composerStartRestartGroup.updateRememberedValue(clickerContentKt$ClickerContent$3$1);
            objRememberedValue8 = clickerContentKt$ClickerContent$3$1;
        } else {
            i4 = 64;
            animatable = animatable2;
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, i4);
        SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, Color.INSTANCE.m11375getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 620832713, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.clicker.ClickerContentKt.ClickerContent.4
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
            public final void invoke(@Nullable Composer composer2, int i5) {
                Modifier.Companion companion2;
                if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(620832713, i5, -1, "com.blackhub.bronline.game.ui.clicker.ClickerContent.<anonymous> (ClickerContent.kt:126)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                    Bitmap bitmap3 = bitmap;
                    final Function0<Unit> function0 = onCloseClick;
                    MutableState<String> mutableState4 = mutableState3;
                    int i6 = i2;
                    String str = myNick;
                    String str2 = opponentNick;
                    CoroutineScope coroutineScope2 = coroutineScope;
                    Mutex mutex = mutexMutex$default;
                    Function0<Unit> function02 = onTapScreen;
                    MutableState<Offset> mutableState5 = mutableState;
                    MutableState<Boolean> mutableState6 = mutableState2;
                    String str3 = textMainHint;
                    Bitmap bitmap4 = bitmap2;
                    float f = fDimensionResource;
                    final float f2 = fM13666constructorimpl;
                    Animatable<Float, AnimationVector1D> animatable3 = animatable;
                    composer2.startReplaceableGroup(733328855);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap3, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composer2, 3128, 116);
                    Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._13wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composer2, 6), 0.0f, 9, null), companion4.getTopEnd());
                    Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, 6));
                    composer2.startReplaceableGroup(726752470);
                    boolean zChanged = composer2.changed(function0);
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.clicker.ClickerContentKt$ClickerContent$4$1$1$1
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
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    composer2.endReplaceableGroup();
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierAlign, modifierM8172size3ABfNKs, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue9, ComposableSingletons$ClickerContentKt.INSTANCE.m14949getLambda1$app_siteRelease(), composer2, 0, 3072, 4092);
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String strClickerContent$lambda$10 = ClickerContentKt.ClickerContent$lambda$10(mutableState4);
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    TextKt.m10024Text4IGK_g(strClickerContent$lambda$10, PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._13wdp, composer2, 6), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._22wsp, ColorResources_androidKt.colorResource(R.color.white, composer2, 6), 0, 0L, 0.0f, null, null, composer2, 12582918, 124), composer2, 0, 0, 65532);
                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._49wdp, composer2, 6), 0.0f, 0.0f, 13, null);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ClickerProgressBarWithNicknamesKt.ClickerProgressBarWithNicknames(i6, str, str2, composer2, 0);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), Unit.INSTANCE, new ClickerContentKt$ClickerContent$4$1$2$2(coroutineScope2, mutex, function02, mutableState5, mutableState6, null));
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierPointerInput);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    long jColorResource = ColorResources_androidKt.colorResource(R.color.white, composer2, 6);
                    Offset.Companion companion6 = Offset.INSTANCE;
                    TextKt.m10024Text4IGK_g(str3, boxScopeInstance.align(companion3, companion4.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._20wsp, jColorResource, 0, companion6.m11115getZeroF1C5BW0(), 0.0f, composer2, 224262, 4), composer2, 0, 0, 65532);
                    Offset offsetClickerContent$lambda$1 = ClickerContentKt.ClickerContent$lambda$1(mutableState5);
                    composer2.startReplaceableGroup(-1314865933);
                    if (offsetClickerContent$lambda$1 == null) {
                        companion2 = companion3;
                    } else {
                        final long packedValue = offsetClickerContent$lambda$1.getPackedValue();
                        composer2.startReplaceableGroup(-1314865873);
                        if (bitmap4 == null) {
                            companion2 = companion3;
                        } else {
                            companion2 = companion3;
                            Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(companion2, f);
                            composer2.startReplaceableGroup(823881149);
                            boolean zChanged2 = composer2.changed(packedValue) | composer2.changed(f2);
                            Object objRememberedValue10 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue10 = new Function1<Density, IntOffset>() { // from class: com.blackhub.bronline.game.ui.clicker.ClickerContentKt$ClickerContent$4$1$2$3$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                        return IntOffset.m13785boximpl(m14948invokeBjo55l4(density));
                                    }

                                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m14948invokeBjo55l4(@NotNull Density offset) {
                                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                        return IntOffsetKt.IntOffset(MathKt__MathJVMKt.roundToInt(Offset.m11099getXimpl(packedValue)) - offset.mo7868roundToPx0680j_4(f2), MathKt__MathJVMKt.roundToInt(Offset.m11100getYimpl(packedValue)) - offset.mo7868roundToPx0680j_4(f2));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue10);
                            }
                            composer2.endReplaceableGroup();
                            ImageKt.m7827Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap4), null, AlphaKt.alpha(OffsetKt.offset(modifierM8172size3ABfNKs2, (Function1) objRememberedValue10), animatable3.getValue().floatValue()), null, null, 0.0f, null, 0, composer2, 56, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER);
                        }
                        composer2.endReplaceableGroup();
                    }
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(30460484);
                    if (!ClickerContentKt.ClickerContent$lambda$4(mutableState6)) {
                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.mini_game_clicker_hint, composer2, 6), boxScopeInstance.align(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._22wdp, composer2, 6), 7, null), companion4.getBottomCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._9wsp, ColorResources_androidKt.colorResource(R.color.white_40, composer2, 6), 0, companion6.m11115getZeroF1C5BW0(), 0.0f, composer2, 224262, 4), composer2, 0, 0, 65532);
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
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
        }), composerStartRestartGroup, 12583302, 122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.clicker.ClickerContentKt.ClickerContent.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    ClickerContentKt.ClickerContent(bitmap, bitmap2, textMainHint, i, myNick, opponentNick, i2, onCloseClick, onTapScreen, onFinishTimer, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                }
            });
        }
    }

    public static final void ClickerContent$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: ClickerContent.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.clicker.ClickerContentKt$ClickerContent$2", m7120f = "ClickerContent.kt", m7121i = {}, m7122l = {94, 101}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.clicker.ClickerContentKt$ClickerContent$2 */
    /* loaded from: classes7.dex */
    public static final class C53402 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $bgAnimatedFloat;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53402(Animatable<Float, AnimationVector1D> animatable, Continuation<? super C53402> continuation) {
            super(2, continuation);
            this.$bgAnimatedFloat = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C53402(this.$bgAnimatedFloat, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C53402) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVector1D> animatable = this.$bgAnimatedFloat;
                Float fBoxFloat = Boxing.boxFloat(1.0f);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(50, 0, EasingKt.getLinearEasing(), 2, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            Animatable<Float, AnimationVector1D> animatable2 = this.$bgAnimatedFloat;
            Float fBoxFloat2 = Boxing.boxFloat(0.0f);
            TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(50, 0, EasingKt.getLinearEasing(), 2, null);
            this.label = 2;
            if (Animatable.animateTo$default(animatable2, fBoxFloat2, tweenSpecTween$default2, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewClickerContent(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(960060551);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(960060551, i, -1, "com.blackhub.bronline.game.ui.clicker.PreviewClickerContent (ClickerContent.kt:248)");
            }
            ClickerContent(null, null, "Тапай", 20, "Вы", "Оно", 40, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.clicker.ClickerContentKt.PreviewClickerContent.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.clicker.ClickerContentKt.PreviewClickerContent.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.clicker.ClickerContentKt.PreviewClickerContent.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 920350134);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.clicker.ClickerContentKt.PreviewClickerContent.4
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
                    ClickerContentKt.PreviewClickerContent(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Offset ClickerContent$lambda$1(MutableState<Offset> mutableState) {
        return mutableState.getValue();
    }

    public static final boolean ClickerContent$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final String ClickerContent$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }
}

