package com.blackhub.bronline.game.p019ui.widget.scroll;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt__RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SliderHorizontalScroller.kt */
@SourceDebugExtension({"SMAP\nSliderHorizontalScroller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SliderHorizontalScroller.kt\ncom/blackhub/bronline/game/ui/widget/scroll/SliderHorizontalScrollerKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,133:1\n68#2,6:134\n74#2:168\n78#2:188\n79#3,11:140\n92#3:187\n456#4,8:151\n464#4,3:165\n25#4:173\n467#4,3:184\n3737#5,6:159\n487#6,4:169\n491#6,2:177\n495#6:183\n1116#7,3:174\n1119#7,3:180\n487#8:179\n*S KotlinDebug\n*F\n+ 1 SliderHorizontalScroller.kt\ncom/blackhub/bronline/game/ui/widget/scroll/SliderHorizontalScrollerKt\n*L\n55#1:134,6\n55#1:168\n55#1:188\n55#1:140,11\n55#1:187\n55#1:151,8\n55#1:165,3\n58#1:173\n55#1:184,3\n55#1:159,6\n58#1:169,4\n58#1:177,2\n58#1:183\n58#1:174,3\n58#1:180,3\n58#1:179\n*E\n"})
/* loaded from: classes3.dex */
public final class SliderHorizontalScrollerKt {
    public static final int FADE_IN_MILLIS = 200;
    public static final int FADE_OUT_MILLIS = 2000;

    /* JADX WARN: Removed duplicated region for block: B:115:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: SliderHorizontalScroller-tw_glAc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15107SliderHorizontalScrollertw_glAc(@Nullable Modifier modifier, @NotNull final CarouselScrollState scrollState, float f, float f2, @Nullable Brush brush, @Nullable Shape shape, float f3, final boolean z, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float fDimensionResource;
        float fDimensionResource2;
        Brush brushM11289horizontalGradient8A3gB4$default;
        Shape shapeM8392RoundedCornerShape0680j_4;
        float f4;
        Modifier modifier3;
        float f5;
        float f6;
        float f7;
        Brush brush2;
        Shape shape2;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier4;
        final float f8;
        final float f9;
        final Brush brush3;
        final Shape shape3;
        final float f10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2048127879);
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
            i3 |= composerStartRestartGroup.changed(scrollState) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                fDimensionResource = f;
                int i5 = composerStartRestartGroup.changed(fDimensionResource) ? 256 : 128;
                i3 |= i5;
            } else {
                fDimensionResource = f;
            }
            i3 |= i5;
        } else {
            fDimensionResource = f;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                fDimensionResource2 = f2;
                int i6 = composerStartRestartGroup.changed(fDimensionResource2) ? 2048 : 1024;
                i3 |= i6;
            } else {
                fDimensionResource2 = f2;
            }
            i3 |= i6;
        } else {
            fDimensionResource2 = f2;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                brushM11289horizontalGradient8A3gB4$default = brush;
                int i7 = composerStartRestartGroup.changed(brushM11289horizontalGradient8A3gB4$default) ? 16384 : 8192;
                i3 |= i7;
            } else {
                brushM11289horizontalGradient8A3gB4$default = brush;
            }
            i3 |= i7;
        } else {
            brushM11289horizontalGradient8A3gB4$default = brush;
        }
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                shapeM8392RoundedCornerShape0680j_4 = shape;
                int i8 = composerStartRestartGroup.changed(shapeM8392RoundedCornerShape0680j_4) ? 131072 : 65536;
                i3 |= i8;
            } else {
                shapeM8392RoundedCornerShape0680j_4 = shape;
            }
            i3 |= i8;
        } else {
            shapeM8392RoundedCornerShape0680j_4 = shape;
        }
        int i9 = i2 & 64;
        if (i9 != 0) {
            i3 |= 1572864;
        } else {
            if ((3670016 & i) == 0) {
                f4 = f3;
                i3 |= composerStartRestartGroup.changed(f4) ? 1048576 : 524288;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    i3 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
                }
                if ((i3 & 23967451) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._150wdp, composerStartRestartGroup, 6);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                        }
                        if ((i2 & 32) != 0) {
                            shapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6));
                            i3 = (-458753) & i3;
                        }
                        if (i9 == 0) {
                            modifier3 = modifier5;
                            f5 = 1.0f;
                            f6 = fDimensionResource;
                            f7 = fDimensionResource2;
                            brush2 = brushM11289horizontalGradient8A3gB4$default;
                            shape2 = shapeM8392RoundedCornerShape0680j_4;
                            int i10 = i3;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2048127879, i10, -1, "com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScroller (SliderHorizontalScroller.kt:52)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
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
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(773894976);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            final float f11 = f5;
                            final Shape shape4 = shape2;
                            final float f12 = f7;
                            final float f13 = f6;
                            final Brush brush4 = brush2;
                            composer2 = composerStartRestartGroup;
                            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(2000, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1862901289, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScrollerKt$SliderHorizontalScroller$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                    invoke(animatedVisibilityScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer3, int i11) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1862901289, i11, -1, "com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScroller.<anonymous>.<anonymous> (SliderHorizontalScroller.kt:63)");
                                    }
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Modifier modifierM11501graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, f11, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
                                    Alignment centerStart = Alignment.INSTANCE.getCenterStart();
                                    final CarouselScrollState carouselScrollState = scrollState;
                                    final Shape shape5 = shape4;
                                    final float f14 = f12;
                                    final CoroutineScope coroutineScope2 = coroutineScope;
                                    final float f15 = f13;
                                    final Brush brush5 = brush4;
                                    composer3.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composer3, 6);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM11501graphicsLayerAp8cVGQ$default);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    SliderKt.Slider(carouselScrollState.getValue(), new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScrollerKt$SliderHorizontalScroller$1$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Float f16) {
                                            invoke(f16.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* compiled from: SliderHorizontalScroller.kt */
                                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                                        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScrollerKt$SliderHorizontalScroller$1$1$1$1$1", m7120f = "SliderHorizontalScroller.kt", m7121i = {}, m7122l = {76}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                        /* renamed from: com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScrollerKt$SliderHorizontalScroller$1$1$1$1$1 */
                                        /* loaded from: classes8.dex */
                                        public static final class C64751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ float $newPosition;
                                            public final /* synthetic */ CarouselScrollState $scrollState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C64751(CarouselScrollState carouselScrollState, float f, Continuation<? super C64751> continuation) {
                                                super(2, continuation);
                                                this.$scrollState = carouselScrollState;
                                                this.$newPosition = f;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C64751(this.$scrollState, this.$newPosition, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C64751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    CarouselScrollState carouselScrollState = this.$scrollState;
                                                    int i2 = (int) this.$newPosition;
                                                    this.label = 1;
                                                    if (CarouselScrollState.animateScrollTo$default(carouselScrollState, i2, null, this, 2, null) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }

                                        public final void invoke(float f16) {
                                            carouselScrollState.setValue((int) f16);
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C64751(carouselScrollState, f16, null), 3, null);
                                        }
                                    }, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), false, null, null, null, 0, ComposableLambdaKt.composableLambda(composer3, -1175532263, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScrollerKt$SliderHorizontalScroller$1$1$1$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer4, Integer num) {
                                            invoke(sliderState, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@NotNull SliderState it, @Nullable Composer composer4, int i12) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            if ((i12 & 81) != 16 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1175532263, i12, -1, "com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScroller.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SliderHorizontalScroller.kt:82)");
                                                }
                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion4, f15);
                                                Alignment centerStart2 = Alignment.INSTANCE.getCenterStart();
                                                float f16 = f15;
                                                float f17 = f14;
                                                Brush brush6 = brush5;
                                                Shape shape6 = shape5;
                                                composer4.startReplaceableGroup(733328855);
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(centerStart2, false, composer4, 6);
                                                composer4.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor3);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer4);
                                                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion5.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                }
                                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                                BoxKt.Box(BackgroundKt.background$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, f16), f17), brush6, shape6, 0.0f, 4, null), composer4, 0);
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), ComposableLambdaKt.composableLambda(composer3, -1157105510, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScrollerKt$SliderHorizontalScroller$1$1$1$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer4, Integer num) {
                                            invoke(sliderState, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@NotNull SliderState it, @Nullable Composer composer4, int i12) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            if ((i12 & 81) != 16 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1157105510, i12, -1, "com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScroller.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SliderHorizontalScroller.kt:99)");
                                                }
                                                BoxKt.Box(SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, f14), 0.0f, 1, null), composer4, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), RangesKt__RangesKt.rangeTo(0.0f, carouselScrollState.getMaxValue()), composer3, 905970048, 0, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER);
                                    BoxKt.Box(SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(BackgroundKt.m7770backgroundbw27NRU(companion2, ColorResources_androidKt.colorResource(R.color.white_25, composer3, 6), shape5), f14), 0.0f, 1, null), composer3, 0);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, ((i10 >> 21) & 14) | 200064, 18);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            f8 = f6;
                            f9 = f7;
                            brush3 = brush2;
                            shape3 = shape2;
                            f10 = f5;
                        } else {
                            modifier3 = modifier5;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        modifier3 = modifier2;
                    }
                    f6 = fDimensionResource;
                    f7 = fDimensionResource2;
                    brush2 = brushM11289horizontalGradient8A3gB4$default;
                    shape2 = shapeM8392RoundedCornerShape0680j_4;
                    f5 = f4;
                    int i102 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting()) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        final float f112 = f5;
                        final Shape shape42 = shape2;
                        final float f122 = f7;
                        final float f132 = f6;
                        final Brush brush42 = brush2;
                        composer2 = composerStartRestartGroup;
                        AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(2000, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1862901289, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScrollerKt$SliderHorizontalScroller$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                invoke(animatedVisibilityScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer3, int i11) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1862901289, i11, -1, "com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScroller.<anonymous>.<anonymous> (SliderHorizontalScroller.kt:63)");
                                }
                                Modifier.Companion companion22 = Modifier.INSTANCE;
                                Modifier modifierM11501graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), 0.0f, 0.0f, f112, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
                                Alignment centerStart = Alignment.INSTANCE.getCenterStart();
                                final CarouselScrollState carouselScrollState = scrollState;
                                final Shape shape5 = shape42;
                                final float f14 = f122;
                                final CoroutineScope coroutineScope22 = coroutineScope2;
                                final float f15 = f132;
                                final Brush brush5 = brush42;
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor22 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM11501graphicsLayerAp8cVGQ$default);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor22);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy22, companion3.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                SliderKt.Slider(carouselScrollState.getValue(), new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScrollerKt$SliderHorizontalScroller$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Float f16) {
                                        invoke(f16.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* compiled from: SliderHorizontalScroller.kt */
                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                                    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScrollerKt$SliderHorizontalScroller$1$1$1$1$1", m7120f = "SliderHorizontalScroller.kt", m7121i = {}, m7122l = {76}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                    /* renamed from: com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScrollerKt$SliderHorizontalScroller$1$1$1$1$1 */
                                    /* loaded from: classes8.dex */
                                    public static final class C64751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        public final /* synthetic */ float $newPosition;
                                        public final /* synthetic */ CarouselScrollState $scrollState;
                                        public int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C64751(CarouselScrollState carouselScrollState, float f, Continuation<? super C64751> continuation) {
                                            super(2, continuation);
                                            this.$scrollState = carouselScrollState;
                                            this.$newPosition = f;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                            return new C64751(this.$scrollState, this.$newPosition, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        @Nullable
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                            return ((C64751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                CarouselScrollState carouselScrollState = this.$scrollState;
                                                int i2 = (int) this.$newPosition;
                                                this.label = 1;
                                                if (CarouselScrollState.animateScrollTo$default(carouselScrollState, i2, null, this, 2, null) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    public final void invoke(float f16) {
                                        carouselScrollState.setValue((int) f16);
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new C64751(carouselScrollState, f16, null), 3, null);
                                    }
                                }, SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), false, null, null, null, 0, ComposableLambdaKt.composableLambda(composer3, -1175532263, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScrollerKt$SliderHorizontalScroller$1$1$1$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer4, Integer num) {
                                        invoke(sliderState, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull SliderState it, @Nullable Composer composer4, int i12) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        if ((i12 & 81) != 16 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1175532263, i12, -1, "com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScroller.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SliderHorizontalScroller.kt:82)");
                                            }
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion4, f15);
                                            Alignment centerStart2 = Alignment.INSTANCE.getCenterStart();
                                            float f16 = f15;
                                            float f17 = f14;
                                            Brush brush6 = brush5;
                                            Shape shape6 = shape5;
                                            composer4.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(centerStart2, false, composer4, 6);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor3);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer4);
                                            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion5.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                            BoxKt.Box(BackgroundKt.background$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, f16), f17), brush6, shape6, 0.0f, 4, null), composer4, 0);
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), ComposableLambdaKt.composableLambda(composer3, -1157105510, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScrollerKt$SliderHorizontalScroller$1$1$1$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer4, Integer num) {
                                        invoke(sliderState, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull SliderState it, @Nullable Composer composer4, int i12) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        if ((i12 & 81) != 16 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1157105510, i12, -1, "com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScroller.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SliderHorizontalScroller.kt:99)");
                                            }
                                            BoxKt.Box(SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, f14), 0.0f, 1, null), composer4, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), RangesKt__RangesKt.rangeTo(0.0f, carouselScrollState.getMaxValue()), composer3, 905970048, 0, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER);
                                BoxKt.Box(SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(BackgroundKt.m7770backgroundbw27NRU(companion22, ColorResources_androidKt.colorResource(R.color.white_25, composer3, 6), shape5), f14), 0.0f, 1, null), composer3, 0);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, ((i102 >> 21) & 14) | 200064, 18);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        f8 = f6;
                        f9 = f7;
                        brush3 = brush2;
                        shape3 = shape2;
                        f10 = f5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    f8 = fDimensionResource;
                    f9 = fDimensionResource2;
                    brush3 = brushM11289horizontalGradient8A3gB4$default;
                    shape3 = shapeM8392RoundedCornerShape0680j_4;
                    f10 = f4;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScrollerKt$SliderHorizontalScroller$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i11) {
                            SliderHorizontalScrollerKt.m15107SliderHorizontalScrollertw_glAc(modifier4, scrollState, f8, f9, brush3, shape3, f10, z, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 12582912;
            if ((i3 & 23967451) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 == 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i9 == 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        f4 = f3;
        if ((i2 & 128) != 0) {
        }
        if ((i3 & 23967451) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 33)
    public static final void PreviewBlockDialog(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(989598413);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(989598413, i, -1, "com.blackhub.bronline.game.ui.widget.scroll.PreviewBlockDialog (SliderHorizontalScroller.kt:124)");
            }
            m15107SliderHorizontalScrollertw_glAc(SizeKt.fillMaxWidth$default(PaddingKt.m8125paddingVpY3zN4$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composerStartRestartGroup, 6), 0.0f, 2, null), 0.0f, 1, null), ScrollKt.rememberCarouselScrollState(0, composerStartRestartGroup, 0, 1), 0.0f, 0.0f, null, null, 0.0f, true, composerStartRestartGroup, 12582912, 124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderHorizontalScrollerKt.PreviewBlockDialog.1
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
                    SliderHorizontalScrollerKt.PreviewBlockDialog(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

