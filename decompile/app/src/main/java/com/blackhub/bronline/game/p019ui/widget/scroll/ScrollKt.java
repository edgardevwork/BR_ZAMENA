package com.blackhub.bronline.game.p019ui.widget.scroll;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.p003ui.ComposedModifierKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Outline;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.semantics.ScrollAxisRange;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scroll.kt */
@Metadata(m7104d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\u001e\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a2\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u000f\u001a6\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a2\u0010\u001b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m7105d2 = {"HorizontalScrollableClipModifier", "Landroidx/compose/ui/Modifier;", "MaxSupportedElevation", "Landroidx/compose/ui/unit/Dp;", "F", "VerticalScrollableClipModifier", "rememberCarouselScrollState", "Lcom/blackhub/bronline/game/ui/widget/scroll/CarouselScrollState;", "initial", "", "(ILandroidx/compose/runtime/Composer;II)Lcom/blackhub/bronline/game/ui/widget/scroll/CarouselScrollState;", "assertNotNestingScrollableContainers", "", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "", "assertNotNestingScrollableContainers-K40F9xA", "(JZ)V", "clipScrollableContainer", "horizontalScroll", "state", "enabled", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "reverseScrolling", "scroll", "isScrollable", "verticalScroll", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\ncom/blackhub/bronline/game/ui/widget/scroll/ScrollKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,450:1\n1116#2,6:451\n135#3:457\n154#4:458\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\ncom/blackhub/bronline/game/ui/widget/scroll/ScrollKt\n*L\n67#1:451,6\n312#1:457\n414#1:458\n*E\n"})
/* loaded from: classes3.dex */
public final class ScrollKt {

    @NotNull
    public static final Modifier HorizontalScrollableClipModifier;
    public static final float MaxSupportedElevation = C2046Dp.m13666constructorimpl(30);

    @NotNull
    public static final Modifier VerticalScrollableClipModifier;

    @Composable
    @NotNull
    public static final CarouselScrollState rememberCarouselScrollState(final int i, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1978721812);
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1978721812, i2, -1, "com.blackhub.bronline.game.ui.widget.scroll.rememberCarouselScrollState (Scroll.kt:65)");
        }
        Object[] objArr = new Object[0];
        Saver<CarouselScrollState, ?> saver = CarouselScrollState.INSTANCE.getSaver();
        composer.startReplaceableGroup(2030345802);
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(i)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<CarouselScrollState>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.ScrollKt$rememberCarouselScrollState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final CarouselScrollState invoke() {
                    return new CarouselScrollState(i);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        CarouselScrollState carouselScrollState = (CarouselScrollState) RememberSaveableKt.m10957rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return carouselScrollState;
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, CarouselScrollState carouselScrollState, boolean z, FlingBehavior flingBehavior, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            flingBehavior = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return verticalScroll(modifier, carouselScrollState, z, flingBehavior, z2);
    }

    @NotNull
    public static final Modifier verticalScroll(@NotNull Modifier modifier, @NotNull CarouselScrollState state, boolean z, @Nullable FlingBehavior flingBehavior, boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return scroll(modifier, state, z2, flingBehavior, z, true);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier modifier, CarouselScrollState carouselScrollState, boolean z, FlingBehavior flingBehavior, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            flingBehavior = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return horizontalScroll(modifier, carouselScrollState, z, flingBehavior, z2);
    }

    @NotNull
    public static final Modifier horizontalScroll(@NotNull Modifier modifier, @NotNull CarouselScrollState state, boolean z, @Nullable FlingBehavior flingBehavior, boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return scroll(modifier, state, z2, flingBehavior, z, false);
    }

    /* renamed from: assertNotNestingScrollableContainers-K40F9xA, reason: not valid java name */
    public static final void m15106assertNotNestingScrollableContainersK40F9xA(long j, boolean z) {
        if (z) {
            if (Constraints.m13621getMaxHeightimpl(j) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Nesting scrollable in the same direction layouts like LazyColumn and Column(Modifier.verticalScroll()) is not allowed. If you want to add a header before the list of items please take a look on LazyColumn component which has a DSL api which allows to first add a header via item() function and then the list of items via items().".toString());
            }
        } else if (Constraints.m13622getMaxWidthimpl(j) == Integer.MAX_VALUE) {
            throw new IllegalStateException("Nesting scrollable in the same direction layouts like LazyRow and Row(Modifier.horizontalScroll() is not allowed. If you want to add a header before the list of items please take a look on LazyRow component which has a DSL api which allows to first add a fixed element via item() function and then the list of items via items().".toString());
        }
    }

    @NotNull
    public static final Modifier clipScrollableContainer(@NotNull Modifier modifier, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(z ? VerticalScrollableClipModifier : HorizontalScrollableClipModifier);
    }

    public static final Modifier scroll(Modifier modifier, final CarouselScrollState carouselScrollState, final boolean z, final FlingBehavior flingBehavior, final boolean z2, final boolean z3) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.ScrollKt$scroll$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("scroll");
                inspectorInfo.getProperties().set("state", carouselScrollState);
                inspectorInfo.getProperties().set("reverseScrolling", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("flingBehavior", flingBehavior);
                inspectorInfo.getProperties().set("isScrollable", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("isVertical", Boolean.valueOf(z3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.ScrollKt.scroll.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1941675551);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1941675551, i, -1, "com.blackhub.bronline.game.ui.widget.scroll.scroll.<anonymous> (Scroll.kt:264)");
                }
                composer.startReplaceableGroup(773894976);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                composer.endReplaceableGroup();
                final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composer.endReplaceableGroup();
                boolean z4 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                final boolean z5 = z3;
                boolean z6 = (z5 || !z4) ? z : !z;
                Modifier.Companion companion = Modifier.INSTANCE;
                final boolean z7 = z2;
                final CarouselScrollState carouselScrollState2 = carouselScrollState;
                final boolean z8 = z6;
                Modifier modifierThen = ScrollKt.clipScrollableContainer(SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.ScrollKt$scroll$2$semantics$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        if (z7) {
                            final CarouselScrollState carouselScrollState3 = carouselScrollState2;
                            Function0<Float> function0 = new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(carouselScrollState3.getValue());
                                }
                            };
                            final CarouselScrollState carouselScrollState4 = carouselScrollState2;
                            ScrollAxisRange scrollAxisRange = new ScrollAxisRange(function0, new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(carouselScrollState4.getMaxValue());
                                }
                            }, z8);
                            if (z5) {
                                SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, scrollAxisRange);
                            } else {
                                SemanticsPropertiesKt.setHorizontalScrollAxisRange(semantics, scrollAxisRange);
                            }
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            final boolean z9 = z5;
                            final CarouselScrollState carouselScrollState5 = carouselScrollState2;
                            SemanticsPropertiesKt.scrollBy$default(semantics, null, new Function2<Float, Float, Boolean>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.ScrollKt$scroll$2$semantics$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Boolean invoke(Float f, Float f2) {
                                    return invoke(f.floatValue(), f2.floatValue());
                                }

                                /* compiled from: Scroll.kt */
                                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                                @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.scroll.ScrollKt$scroll$2$semantics$1$1$1", m7120f = "Scroll.kt", m7121i = {}, m7122l = {287, 289}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                /* renamed from: com.blackhub.bronline.game.ui.widget.scroll.ScrollKt$scroll$2$semantics$1$1$1, reason: invalid class name */
                                /* loaded from: classes8.dex */
                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ boolean $isVertical;
                                    public final /* synthetic */ CarouselScrollState $state;

                                    /* renamed from: $x */
                                    public final /* synthetic */ float f455$x;

                                    /* renamed from: $y */
                                    public final /* synthetic */ float f456$y;
                                    public int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(boolean z, CarouselScrollState carouselScrollState, float f, float f2, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.$isVertical = z;
                                        this.$state = carouselScrollState;
                                        this.f456$y = f;
                                        this.f455$x = f2;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        return new AnonymousClass1(this.$isVertical, this.$state, this.f456$y, this.f455$x, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            if (this.$isVertical) {
                                                CarouselScrollState carouselScrollState = this.$state;
                                                Intrinsics.checkNotNull(carouselScrollState, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                                float f = this.f456$y;
                                                this.label = 1;
                                                if (ScrollExtensionsKt.scrollBy(carouselScrollState, f, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                CarouselScrollState carouselScrollState2 = this.$state;
                                                Intrinsics.checkNotNull(carouselScrollState2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                                float f2 = this.f455$x;
                                                this.label = 2;
                                                if (ScrollExtensionsKt.scrollBy(carouselScrollState2, f2, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        } else {
                                            if (i != 1 && i != 2) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                @NotNull
                                public final Boolean invoke(float f, float f2) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(z9, carouselScrollState5, f2, f, null), 3, null);
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                        }
                    }
                }, 1, null).then(ScrollableKt.scrollable(companion, carouselScrollState, z3 ? Orientation.Vertical : Orientation.Horizontal, z2, !z6, flingBehavior, carouselScrollState.getInternalInteractionSource())), z3).then(new ScrollingLayoutModifier(carouselScrollState, z, z3));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        });
    }

    static {
        Modifier.Companion companion = Modifier.INSTANCE;
        HorizontalScrollableClipModifier = ClipKt.clip(companion, new Shape() { // from class: com.blackhub.bronline.game.ui.widget.scroll.ScrollKt$HorizontalScrollableClipModifier$1
            @Override // androidx.compose.p003ui.graphics.Shape
            @NotNull
            /* renamed from: createOutline-Pq9zytI */
            public Outline mo7821createOutlinePq9zytI(long size, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(density, "density");
                float fMo7868roundToPx0680j_4 = density.mo7868roundToPx0680j_4(ScrollKt.MaxSupportedElevation);
                return new Outline.Rectangle(new Rect(0.0f, -fMo7868roundToPx0680j_4, Size.m11168getWidthimpl(size), Size.m11165getHeightimpl(size) + fMo7868roundToPx0680j_4));
            }
        });
        VerticalScrollableClipModifier = ClipKt.clip(companion, new Shape() { // from class: com.blackhub.bronline.game.ui.widget.scroll.ScrollKt$VerticalScrollableClipModifier$1
            @Override // androidx.compose.p003ui.graphics.Shape
            @NotNull
            /* renamed from: createOutline-Pq9zytI */
            public Outline mo7821createOutlinePq9zytI(long size, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(density, "density");
                float fMo7868roundToPx0680j_4 = density.mo7868roundToPx0680j_4(ScrollKt.MaxSupportedElevation);
                return new Outline.Rectangle(new Rect(-fMo7868roundToPx0680j_4, 0.0f, Size.m11168getWidthimpl(size) + fMo7868roundToPx0680j_4, Size.m11165getHeightimpl(size)));
            }
        });
    }
}
