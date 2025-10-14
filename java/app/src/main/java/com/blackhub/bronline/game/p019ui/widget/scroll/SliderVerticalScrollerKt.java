package com.blackhub.bronline.game.p019ui.widget.scroll;

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
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.TransformOriginKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.LayoutModifierKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt__RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SliderVerticalScroller.kt */
@SourceDebugExtension({"SMAP\nSliderVerticalScroller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SliderVerticalScroller.kt\ncom/blackhub/bronline/game/ui/widget/scroll/SliderVerticalScrollerKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,135:1\n487#2,4:136\n491#2,2:144\n495#2:150\n25#3:140\n456#3,8:167\n464#3,3:181\n467#3,3:191\n1116#4,3:141\n1119#4,3:147\n1116#4,6:185\n487#5:146\n69#6,5:151\n74#6:184\n78#6:195\n79#7,11:156\n92#7:194\n3737#8,6:175\n154#9:196\n154#9:197\n154#9:198\n*S KotlinDebug\n*F\n+ 1 SliderVerticalScroller.kt\ncom/blackhub/bronline/game/ui/widget/scroll/SliderVerticalScrollerKt\n*L\n57#1:136,4\n57#1:144,2\n57#1:150\n57#1:140\n59#1:167,8\n59#1:181,3\n59#1:191,3\n57#1:141,3\n57#1:147,3\n76#1:185,6\n57#1:146\n59#1:151,5\n59#1:184\n59#1:195\n59#1:156,11\n59#1:194\n59#1:175,6\n130#1:196\n131#1:197\n133#1:198\n*E\n"})
/* loaded from: classes3.dex */
public final class SliderVerticalScrollerKt {

    /* compiled from: SliderVerticalScroller.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$PreviewBlockDialog$1 */
    /* loaded from: classes6.dex */
    public static final class C64761 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64761(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            SliderVerticalScrollerKt.PreviewBlockDialog(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:311:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0356  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: SliderVerticalScroller-mcqpVzo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15108SliderVerticalScrollermcqpVzo(@Nullable Modifier modifier, @NotNull final CarouselScrollState scrollState, float f, long j, float f2, float f3, @Nullable Brush brush, @Nullable Shape shape, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final float fDimensionResource;
        long jColorResource;
        float fDimensionResource2;
        float fDimensionResource3;
        Brush brushM11289horizontalGradient8A3gB4$default;
        Shape shape2;
        Brush brush2;
        Shape shapeM8392RoundedCornerShape0680j_4;
        float f4;
        int i4;
        int i5;
        int i6;
        Object objRememberedValue;
        Composer.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue2;
        final float f5;
        final float f6;
        final Shape shape3;
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1560060840);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
                int i8 = composerStartRestartGroup.changed(fDimensionResource) ? 256 : 128;
                i3 |= i8;
            } else {
                fDimensionResource = f;
            }
            i3 |= i8;
        } else {
            fDimensionResource = f;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                jColorResource = j;
                int i9 = composerStartRestartGroup.changed(jColorResource) ? 2048 : 1024;
                i3 |= i9;
            } else {
                jColorResource = j;
            }
            i3 |= i9;
        } else {
            jColorResource = j;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                fDimensionResource2 = f2;
                int i10 = composerStartRestartGroup.changed(fDimensionResource2) ? 16384 : 8192;
                i3 |= i10;
            } else {
                fDimensionResource2 = f2;
            }
            i3 |= i10;
        } else {
            fDimensionResource2 = f2;
        }
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                fDimensionResource3 = f3;
                int i11 = composerStartRestartGroup.changed(fDimensionResource3) ? 131072 : 65536;
                i3 |= i11;
            } else {
                fDimensionResource3 = f3;
            }
            i3 |= i11;
        } else {
            fDimensionResource3 = f3;
        }
        if ((3670016 & i) == 0) {
            if ((i2 & 64) == 0) {
                brushM11289horizontalGradient8A3gB4$default = brush;
                int i12 = composerStartRestartGroup.changed(brushM11289horizontalGradient8A3gB4$default) ? 1048576 : 524288;
                i3 |= i12;
            } else {
                brushM11289horizontalGradient8A3gB4$default = brush;
            }
            i3 |= i12;
        } else {
            brushM11289horizontalGradient8A3gB4$default = brush;
        }
        if ((29360128 & i) == 0) {
            if ((i2 & 128) == 0) {
                shape2 = shape;
                int i13 = composerStartRestartGroup.changed(shape2) ? 8388608 : 4194304;
                i3 |= i13;
            } else {
                shape2 = shape;
            }
            i3 |= i13;
        } else {
            shape2 = shape;
        }
        if ((23967451 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
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
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    i3 &= -29360129;
                }
            } else {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composerStartRestartGroup, 6);
                }
                if ((i2 & 8) != 0) {
                    jColorResource = ColorResources_androidKt.colorResource(R.color.light_gray_blue_25, composerStartRestartGroup, 6);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composerStartRestartGroup, 6);
                }
                if ((i2 & 64) != 0) {
                    brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(Color.INSTANCE.m11377getWhite0d7_KjU()), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                    i3 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    int i14 = i3 & (-29360129);
                    brush2 = brushM11289horizontalGradient8A3gB4$default;
                    shapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composerStartRestartGroup, 6));
                    f4 = fDimensionResource3;
                    i4 = i14;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    i5 = 6;
                    i6 = R.dimen._15sdp;
                } else {
                    ComposerKt.traceEventStart(1560060840, i4, -1, "com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScroller (SliderVerticalScroller.kt:51)");
                    i6 = R.dimen._15sdp;
                    i5 = 6;
                }
                final float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(i6, composerStartRestartGroup, i5);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                composerStartRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(modifier2, jColorResource, shapeM8392RoundedCornerShape0680j_4);
                Modifier modifier3 = modifier2;
                Alignment center = Alignment.INSTANCE.getCenter();
                long j2 = jColorResource;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
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
                float value = scrollState.getValue();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1763302794);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    final float f7 = 90.0f;
                    objRememberedValue2 = new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$SliderVerticalScroller$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                            invoke2(graphicsLayerScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                            graphicsLayer.setRotationZ(f7);
                            graphicsLayer.mo11533setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.0f, 0.0f));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final float f8 = fDimensionResource2;
                final float f9 = f4;
                final Brush brush3 = brush2;
                final Shape shape4 = shapeM8392RoundedCornerShape0680j_4;
                SliderKt.Slider(value, new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$SliderVerticalScroller$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                        invoke(f10.floatValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: SliderVerticalScroller.kt */
                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$SliderVerticalScroller$1$3$1", m7120f = "SliderVerticalScroller.kt", m7121i = {}, m7122l = {72}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                    /* renamed from: com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$SliderVerticalScroller$1$3$1 */
                    /* loaded from: classes8.dex */
                    public static final class C64781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ float $newPosition;
                        public final /* synthetic */ CarouselScrollState $scrollState;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C64781(CarouselScrollState carouselScrollState, float f, Continuation<? super C64781> continuation) {
                            super(2, continuation);
                            this.$scrollState = carouselScrollState;
                            this.$newPosition = f;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new C64781(this.$scrollState, this.$newPosition, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((C64781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

                    public final void invoke(float f10) {
                        scrollState.setValue((int) f10);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C64781(scrollState, f10, null), 3, null);
                    }
                }, SizeKt.fillMaxWidth$default(LayoutModifierKt.layout(GraphicsLayerModifierKt.graphicsLayer(companion3, (Function1) objRememberedValue2), new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$SliderVerticalScroller$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return m15109invoke3p2s80s(measureScope, measurable, constraints.getValue());
                    }

                    @NotNull
                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                    public final MeasureResult m15109invoke3p2s80s(@NotNull MeasureScope layout, @NotNull Measurable measurable, long j3) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        Intrinsics.checkNotNullParameter(measurable, "measurable");
                        final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(ConstraintsKt.Constraints(Constraints.m13623getMinHeightimpl(j3), Constraints.m13621getMaxHeightimpl(j3), Constraints.m13624getMinWidthimpl(j3), Constraints.m13621getMaxHeightimpl(j3)));
                        return MeasureScope.layout$default(layout, placeableMo12610measureBRTryo0.getHeight(), placeableMo12610measureBRTryo0.getWidth(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$SliderVerticalScroller$1$2.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope layout2) {
                                Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                                Placeable placeable = placeableMo12610measureBRTryo0;
                                Placeable.PlacementScope.place$default(layout2, placeable, 0, -placeable.getHeight(), 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                }), 0.0f, 1, null), false, null, null, null, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 920760230, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$SliderVerticalScroller$1$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                        invoke(sliderState, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull SliderState it, @Nullable Composer composer2, int i15) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i15 & 81) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(920760230, i15, -1, "com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScroller.<anonymous>.<anonymous> (SliderVerticalScroller.kt:95)");
                            }
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, fDimensionResource4), f8);
                            Alignment center2 = Alignment.INSTANCE.getCenter();
                            float f10 = f8;
                            float f11 = f9;
                            Brush brush4 = brush3;
                            Shape shape5 = shape4;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
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
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            BoxKt.Box(BackgroundKt.background$default(SizeKt.m8174sizeVpY3zN4(companion4, f10, f11), brush4, shape5, 0.0f, 4, null), composer2, 0);
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
                }), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1366297541, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$SliderVerticalScroller$1$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                        invoke(sliderState, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull SliderState it, @Nullable Composer composer2, int i15) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i15 & 81) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1366297541, i15, -1, "com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScroller.<anonymous>.<anonymous> (SliderVerticalScroller.kt:112)");
                            }
                            BoxKt.Box(SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, fDimensionResource), 0.0f, 1, null), composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), RangesKt__RangesKt.rangeTo(0.0f, scrollState.getMaxValue()), composerStartRestartGroup, 905969664, 0, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                jColorResource = j2;
                fDimensionResource3 = f4;
                brushM11289horizontalGradient8A3gB4$default = brush2;
                f5 = fDimensionResource;
                f6 = fDimensionResource2;
                shape3 = shapeM8392RoundedCornerShape0680j_4;
            }
            f4 = fDimensionResource3;
            brush2 = brushM11289horizontalGradient8A3gB4$default;
            i4 = i3;
            shapeM8392RoundedCornerShape0680j_4 = shape2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final float fDimensionResource42 = PrimitiveResources_androidKt.dimensionResource(i6, composerStartRestartGroup, i5);
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM7770backgroundbw27NRU2 = BackgroundKt.m7770backgroundbw27NRU(modifier2, jColorResource, shapeM8392RoundedCornerShape0680j_4);
            Modifier modifier32 = modifier2;
            Alignment center2 = Alignment.INSTANCE.getCenter();
            long j22 = jColorResource;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU2);
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
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                float value2 = scrollState.getValue();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1763302794);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                final float f82 = fDimensionResource2;
                final float f92 = f4;
                final Brush brush32 = brush2;
                final Shape shape42 = shapeM8392RoundedCornerShape0680j_4;
                SliderKt.Slider(value2, new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$SliderVerticalScroller$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                        invoke(f10.floatValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: SliderVerticalScroller.kt */
                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$SliderVerticalScroller$1$3$1", m7120f = "SliderVerticalScroller.kt", m7121i = {}, m7122l = {72}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                    /* renamed from: com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$SliderVerticalScroller$1$3$1 */
                    /* loaded from: classes8.dex */
                    public static final class C64781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ float $newPosition;
                        public final /* synthetic */ CarouselScrollState $scrollState;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C64781(CarouselScrollState carouselScrollState, float f, Continuation<? super C64781> continuation) {
                            super(2, continuation);
                            this.$scrollState = carouselScrollState;
                            this.$newPosition = f;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new C64781(this.$scrollState, this.$newPosition, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((C64781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

                    public final void invoke(float f10) {
                        scrollState.setValue((int) f10);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C64781(scrollState, f10, null), 3, null);
                    }
                }, SizeKt.fillMaxWidth$default(LayoutModifierKt.layout(GraphicsLayerModifierKt.graphicsLayer(companion32, (Function1) objRememberedValue2), new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$SliderVerticalScroller$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return m15109invoke3p2s80s(measureScope, measurable, constraints.getValue());
                    }

                    @NotNull
                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                    public final MeasureResult m15109invoke3p2s80s(@NotNull MeasureScope layout, @NotNull Measurable measurable, long j3) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        Intrinsics.checkNotNullParameter(measurable, "measurable");
                        final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(ConstraintsKt.Constraints(Constraints.m13623getMinHeightimpl(j3), Constraints.m13621getMaxHeightimpl(j3), Constraints.m13624getMinWidthimpl(j3), Constraints.m13621getMaxHeightimpl(j3)));
                        return MeasureScope.layout$default(layout, placeableMo12610measureBRTryo0.getHeight(), placeableMo12610measureBRTryo0.getWidth(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$SliderVerticalScroller$1$2.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope layout2) {
                                Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                                Placeable placeable = placeableMo12610measureBRTryo0;
                                Placeable.PlacementScope.place$default(layout2, placeable, 0, -placeable.getHeight(), 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                }), 0.0f, 1, null), false, null, null, null, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 920760230, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$SliderVerticalScroller$1$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                        invoke(sliderState, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull SliderState it, @Nullable Composer composer2, int i15) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i15 & 81) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(920760230, i15, -1, "com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScroller.<anonymous>.<anonymous> (SliderVerticalScroller.kt:95)");
                            }
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, fDimensionResource42), f82);
                            Alignment center22 = Alignment.INSTANCE.getCenter();
                            float f10 = f82;
                            float f11 = f92;
                            Brush brush4 = brush32;
                            Shape shape5 = shape42;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor22 = companion5.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
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
                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy22, companion5.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion5.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                            BoxKt.Box(BackgroundKt.background$default(SizeKt.m8174sizeVpY3zN4(companion4, f10, f11), brush4, shape5, 0.0f, 4, null), composer2, 0);
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
                }), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1366297541, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$SliderVerticalScroller$1$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                        invoke(sliderState, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull SliderState it, @Nullable Composer composer2, int i15) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i15 & 81) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1366297541, i15, -1, "com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScroller.<anonymous>.<anonymous> (SliderVerticalScroller.kt:112)");
                            }
                            BoxKt.Box(SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, fDimensionResource), 0.0f, 1, null), composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), RangesKt__RangesKt.rangeTo(0.0f, scrollState.getMaxValue()), composerStartRestartGroup, 905969664, 0, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier32;
                jColorResource = j22;
                fDimensionResource3 = f4;
                brushM11289horizontalGradient8A3gB4$default = brush2;
                f5 = fDimensionResource;
                f6 = fDimensionResource2;
                shape3 = shapeM8392RoundedCornerShape0680j_4;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f5 = fDimensionResource;
            f6 = fDimensionResource2;
            shape3 = shape2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final long j3 = jColorResource;
            final float f10 = fDimensionResource3;
            final Brush brush4 = brushM11289horizontalGradient8A3gB4$default;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt$SliderVerticalScroller$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i15) {
                    SliderVerticalScrollerKt.m15108SliderVerticalScrollermcqpVzo(modifier4, scrollState, f5, j3, f6, f10, brush4, shape3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 34)
    public static final void PreviewBlockDialog(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1675181371);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1675181371, i, -1, "com.blackhub.bronline.game.ui.widget.scroll.PreviewBlockDialog (SliderVerticalScroller.kt:126)");
            }
            float f = 10;
            m15108SliderVerticalScrollermcqpVzo(SizeKt.m8177width3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C2046Dp.m13666constructorimpl(6), 0.0f, 11, null), C2046Dp.m13666constructorimpl(f)), ScrollKt.rememberCarouselScrollState(0, composerStartRestartGroup, 0, 1), 0.0f, 0L, 0.0f, C2046Dp.m13666constructorimpl(f), null, null, composerStartRestartGroup, 196614, 220);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.SliderVerticalScrollerKt.PreviewBlockDialog.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C64761(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    SliderVerticalScrollerKt.PreviewBlockDialog(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

