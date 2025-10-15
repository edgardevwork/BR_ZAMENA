package androidx.compose.animation;

import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EnterExitTransition.kt */
@Metadata(m7104d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\b\u0010E\u001a\u00020FH\u0016J \u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ \u0010L\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010KJ \u0010N\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bO\u0010KJ&\u0010P\u001a\u00020Q*\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\bV\u0010WR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0016\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R&\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020(@BX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\"\u0004\b*\u0010+R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010/\u001a\u00020\u0007X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010,R2\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R2\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00101\"\u0004\b5\u00103R.\u00106\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000408\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070907¢\u0006\u0002\b:¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R2\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00101\"\u0004\b>\u00103R.\u0010?\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000408\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0907¢\u0006\u0002\b:¢\u0006\b\n\u0000\u001a\u0004\b@\u0010<R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, m7105d2 = {"Landroidx/compose/animation/EnterExitTransitionModifierNode;", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "offsetAnimation", "Landroidx/compose/ui/unit/IntOffset;", "slideAnimation", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "graphicsLayerBlock", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "alignment", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "currentAlignment", "getCurrentAlignment", "setCurrentAlignment", "(Landroidx/compose/ui/Alignment;)V", "getEnter", "()Landroidx/compose/animation/EnterTransition;", "setEnter", "(Landroidx/compose/animation/EnterTransition;)V", "getExit", "()Landroidx/compose/animation/ExitTransition;", "setExit", "(Landroidx/compose/animation/ExitTransition;)V", "getGraphicsLayerBlock", "()Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "setGraphicsLayerBlock", "(Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "value", "Landroidx/compose/ui/unit/Constraints;", "lookaheadConstraints", "setLookaheadConstraints-BRTryo0", "(J)V", "J", "lookaheadConstraintsAvailable", "", "lookaheadSize", "getOffsetAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "setOffsetAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "getSizeAnimation", "setSizeAnimation", "sizeTransitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "getSizeTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "getSlideAnimation", "setSlideAnimation", "slideSpec", "getSlideSpec", "getTransition", "()Landroidx/compose/animation/core/Transition;", "setTransition", "(Landroidx/compose/animation/core/Transition;)V", "onAttach", "", "sizeByState", "targetState", "fullSize", "sizeByState-Uzc_VyU", "(Landroidx/compose/animation/EnterExitState;J)J", "slideTargetValueByState", "slideTargetValueByState-oFUgxo0", "targetOffsetByState", "targetOffsetByState-oFUgxo0", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionModifierNode\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1246:1\n79#2:1247\n86#2:1248\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionModifierNode\n*L\n1128#1:1247\n1170#1:1248\n*E\n"})
/* loaded from: classes2.dex */
public final class EnterExitTransitionModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {

    @Nullable
    public Alignment currentAlignment;

    @NotNull
    public EnterTransition enter;

    @NotNull
    public ExitTransition exit;

    @NotNull
    public GraphicsLayerBlockForEnterExit graphicsLayerBlock;
    public boolean lookaheadConstraintsAvailable;

    @Nullable
    public Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;

    @Nullable
    public Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;

    @Nullable
    public Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;

    @NotNull
    public Transition<EnterExitState> transition;
    public long lookaheadSize = AnimationModifierKt.getInvalidSize();
    public long lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    @NotNull
    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> sizeTransitionSpec = new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final FiniteAnimationSpec<IntSize> invoke(@NotNull Transition.Segment<EnterExitState> segment) {
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            FiniteAnimationSpec<IntSize> animationSpec = null;
            if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                ChangeSize changeSize = this.this$0.getEnter().getData().getChangeSize();
                if (changeSize != null) {
                    animationSpec = changeSize.getAnimationSpec();
                }
            } else if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                animationSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
            } else {
                ChangeSize changeSize2 = this.this$0.getExit().getData().getChangeSize();
                if (changeSize2 != null) {
                    animationSpec = changeSize2.getAnimationSpec();
                }
            }
            return animationSpec == null ? EnterExitTransitionKt.DefaultSizeAnimationSpec : animationSpec;
        }
    };

    @NotNull
    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> slideSpec = new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final FiniteAnimationSpec<IntOffset> invoke(@NotNull Transition.Segment<EnterExitState> segment) {
            FiniteAnimationSpec<IntOffset> animationSpec;
            FiniteAnimationSpec<IntOffset> animationSpec2;
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                Slide slide = this.this$0.getEnter().getData().getSlide();
                return (slide == null || (animationSpec2 = slide.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultOffsetAnimationSpec : animationSpec2;
            }
            if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            }
            Slide slide2 = this.this$0.getExit().getData().getSlide();
            return (slide2 == null || (animationSpec = slide2.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultOffsetAnimationSpec : animationSpec;
        }
    };

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public final void setTransition(@NotNull Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    @Nullable
    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    public final void setSizeAnimation(@Nullable Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation) {
        this.sizeAnimation = deferredAnimation;
    }

    @Nullable
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    public final void setOffsetAnimation(@Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.offsetAnimation = deferredAnimation;
    }

    @Nullable
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getSlideAnimation() {
        return this.slideAnimation;
    }

    public final void setSlideAnimation(@Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.slideAnimation = deferredAnimation;
    }

    @NotNull
    public final EnterTransition getEnter() {
        return this.enter;
    }

    public final void setEnter(@NotNull EnterTransition enterTransition) {
        this.enter = enterTransition;
    }

    @NotNull
    public final ExitTransition getExit() {
        return this.exit;
    }

    public final void setExit(@NotNull ExitTransition exitTransition) {
        this.exit = exitTransition;
    }

    @NotNull
    public final GraphicsLayerBlockForEnterExit getGraphicsLayerBlock() {
        return this.graphicsLayerBlock;
    }

    public final void setGraphicsLayerBlock(@NotNull GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public EnterExitTransitionModifierNode(@NotNull Transition<EnterExitState> transition, @Nullable Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, @Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, @Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, @NotNull EnterTransition enterTransition, @NotNull ExitTransition exitTransition, @NotNull GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    /* renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    public final void m7651setLookaheadConstraintsBRTryo0(long j) {
        this.lookaheadConstraintsAvailable = true;
        this.lookaheadConstraints = j;
    }

    @Nullable
    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    public final void setCurrentAlignment(@Nullable Alignment alignment) {
        this.currentAlignment = alignment;
    }

    @Nullable
    public final Alignment getAlignment() {
        Alignment alignment;
        if (this.transition.getSegment().isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
            ChangeSize changeSize = this.enter.getData().getChangeSize();
            if (changeSize == null || (alignment = changeSize.getAlignment()) == null) {
                ChangeSize changeSize2 = this.exit.getData().getChangeSize();
                if (changeSize2 != null) {
                    return changeSize2.getAlignment();
                }
                return null;
            }
        } else {
            ChangeSize changeSize3 = this.exit.getData().getChangeSize();
            if (changeSize3 == null || (alignment = changeSize3.getAlignment()) == null) {
                ChangeSize changeSize4 = this.enter.getData().getChangeSize();
                if (changeSize4 != null) {
                    return changeSize4.getAlignment();
                }
                return null;
            }
        }
        return alignment;
    }

    @NotNull
    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    /* renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m7652sizeByStateUzc_VyU(@NotNull EnterExitState targetState, long fullSize) {
        Function1<IntSize, IntSize> size;
        Function1<IntSize, IntSize> size2;
        int i = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i == 1) {
            return fullSize;
        }
        if (i == 2) {
            ChangeSize changeSize = this.enter.getData().getChangeSize();
            return (changeSize == null || (size = changeSize.getSize()) == null) ? fullSize : size.invoke(IntSize.m13828boximpl(fullSize)).getPackedValue();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ChangeSize changeSize2 = this.exit.getData().getChangeSize();
        return (changeSize2 == null || (size2 = changeSize2.getSize()) == null) ? fullSize : size2.invoke(IntSize.m13828boximpl(fullSize)).getPackedValue();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.lookaheadConstraintsAvailable = false;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
    }

    /* renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m7654targetOffsetByStateoFUgxo0(@NotNull EnterExitState targetState, long fullSize) {
        if (this.currentAlignment != null && getAlignment() != null && !Intrinsics.areEqual(this.currentAlignment, getAlignment())) {
            int i = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
            if (i == 1) {
                return IntOffset.INSTANCE.m13804getZeronOccac();
            }
            if (i == 2) {
                return IntOffset.INSTANCE.m13804getZeronOccac();
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ChangeSize changeSize = this.exit.getData().getChangeSize();
            if (changeSize != null) {
                long packedValue = changeSize.getSize().invoke(IntSize.m13828boximpl(fullSize)).getPackedValue();
                Alignment alignment = getAlignment();
                Intrinsics.checkNotNull(alignment);
                LayoutDirection layoutDirection = LayoutDirection.Ltr;
                long jMo10976alignKFBX0sM = alignment.mo10976alignKFBX0sM(fullSize, packedValue, layoutDirection);
                Alignment alignment2 = this.currentAlignment;
                Intrinsics.checkNotNull(alignment2);
                long jMo10976alignKFBX0sM2 = alignment2.mo10976alignKFBX0sM(fullSize, packedValue, layoutDirection);
                return IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jMo10976alignKFBX0sM) - IntOffset.m13794getXimpl(jMo10976alignKFBX0sM2), IntOffset.m13795getYimpl(jMo10976alignKFBX0sM) - IntOffset.m13795getYimpl(jMo10976alignKFBX0sM2));
            }
            return IntOffset.INSTANCE.m13804getZeronOccac();
        }
        return IntOffset.INSTANCE.m13804getZeronOccac();
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo7650measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        State<IntOffset> stateAnimate;
        State<IntOffset> stateAnimate2;
        if (this.transition.getCurrentState() == this.transition.getTargetState()) {
            this.currentAlignment = null;
        } else if (this.currentAlignment == null) {
            Alignment alignment = getAlignment();
            if (alignment == null) {
                alignment = Alignment.INSTANCE.getTopStart();
            }
            this.currentAlignment = alignment;
        }
        if (measureScope.isLookingAhead()) {
            final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(j);
            long jIntSize = IntSizeKt.IntSize(placeableMo12610measureBRTryo0.getWidth(), placeableMo12610measureBRTryo0.getHeight());
            this.lookaheadSize = jIntSize;
            m7651setLookaheadConstraintsBRTryo0(j);
            return MeasureScope.layout$default(measureScope, IntSize.m13836getWidthimpl(jIntSize), IntSize.m13835getHeightimpl(jIntSize), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo12610measureBRTryo0, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        final Function1<GraphicsLayerScope, Unit> function1Init = this.graphicsLayerBlock.init();
        final Placeable placeableMo12610measureBRTryo02 = measurable.mo12610measureBRTryo0(j);
        long jIntSize2 = IntSizeKt.IntSize(placeableMo12610measureBRTryo02.getWidth(), placeableMo12610measureBRTryo02.getHeight());
        final long j2 = AnimationModifierKt.m7629isValidozmzZPI(this.lookaheadSize) ? this.lookaheadSize : jIntSize2;
        Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
        State<IntSize> stateAnimate3 = deferredAnimation != null ? deferredAnimation.animate(this.sizeTransitionSpec, new Function1<EnterExitState, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(EnterExitState enterExitState) {
                return IntSize.m13828boximpl(m7655invokeYEO4UFw(enterExitState));
            }

            /* renamed from: invoke-YEO4UFw, reason: not valid java name */
            public final long m7655invokeYEO4UFw(@NotNull EnterExitState enterExitState) {
                return this.this$0.m7652sizeByStateUzc_VyU(enterExitState, j2);
            }
        }) : null;
        if (stateAnimate3 != null) {
            jIntSize2 = stateAnimate3.getValue().getPackedValue();
        }
        long jM13633constrain4WqzIAM = ConstraintsKt.m13633constrain4WqzIAM(j, jIntSize2);
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2 = this.offsetAnimation;
        final long jM13804getZeronOccac = (deferredAnimation2 == null || (stateAnimate2 = deferredAnimation2.animate(new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final FiniteAnimationSpec<IntOffset> invoke(@NotNull Transition.Segment<EnterExitState> segment) {
                return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            }
        }, new Function1<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                return IntOffset.m13785boximpl(m7656invokeBjo55l4(enterExitState));
            }

            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
            public final long m7656invokeBjo55l4(@NotNull EnterExitState enterExitState) {
                return this.this$0.m7654targetOffsetByStateoFUgxo0(enterExitState, j2);
            }
        })) == null) ? IntOffset.INSTANCE.m13804getZeronOccac() : stateAnimate2.getValue().getPackedValue();
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3 = this.slideAnimation;
        long jM13804getZeronOccac2 = (deferredAnimation3 == null || (stateAnimate = deferredAnimation3.animate(this.slideSpec, new Function1<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$slideOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                return IntOffset.m13785boximpl(m7657invokeBjo55l4(enterExitState));
            }

            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
            public final long m7657invokeBjo55l4(@NotNull EnterExitState enterExitState) {
                return this.this$0.m7653slideTargetValueByStateoFUgxo0(enterExitState, j2);
            }
        })) == null) ? IntOffset.INSTANCE.m13804getZeronOccac() : stateAnimate.getValue().getPackedValue();
        Alignment alignment2 = this.currentAlignment;
        long jMo10976alignKFBX0sM = alignment2 != null ? alignment2.mo10976alignKFBX0sM(j2, jM13633constrain4WqzIAM, LayoutDirection.Ltr) : IntOffset.INSTANCE.m13804getZeronOccac();
        final long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jMo10976alignKFBX0sM) + IntOffset.m13794getXimpl(jM13804getZeronOccac2), IntOffset.m13795getYimpl(jMo10976alignKFBX0sM) + IntOffset.m13795getYimpl(jM13804getZeronOccac2));
        return MeasureScope.layout$default(measureScope, IntSize.m13836getWidthimpl(jM13633constrain4WqzIAM), IntSize.m13835getHeightimpl(jM13633constrain4WqzIAM), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                placementScope.placeWithLayer(placeableMo12610measureBRTryo02, IntOffset.m13794getXimpl(jM13804getZeronOccac) + IntOffset.m13794getXimpl(jIntOffset), IntOffset.m13795getYimpl(jM13804getZeronOccac) + IntOffset.m13795getYimpl(jIntOffset), 0.0f, function1Init);
            }
        }, 4, null);
    }

    @NotNull
    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> getSlideSpec() {
        return this.slideSpec;
    }

    /* renamed from: slideTargetValueByState-oFUgxo0, reason: not valid java name */
    public final long m7653slideTargetValueByStateoFUgxo0(@NotNull EnterExitState targetState, long fullSize) {
        Function1<IntSize, IntOffset> slideOffset;
        Function1<IntSize, IntOffset> slideOffset2;
        Slide slide = this.enter.getData().getSlide();
        long jM13804getZeronOccac = (slide == null || (slideOffset2 = slide.getSlideOffset()) == null) ? IntOffset.INSTANCE.m13804getZeronOccac() : slideOffset2.invoke(IntSize.m13828boximpl(fullSize)).getPackedValue();
        Slide slide2 = this.exit.getData().getSlide();
        long jM13804getZeronOccac2 = (slide2 == null || (slideOffset = slide2.getSlideOffset()) == null) ? IntOffset.INSTANCE.m13804getZeronOccac() : slideOffset.invoke(IntSize.m13828boximpl(fullSize)).getPackedValue();
        int i = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i == 1) {
            return IntOffset.INSTANCE.m13804getZeronOccac();
        }
        if (i == 2) {
            return jM13804getZeronOccac;
        }
        if (i == 3) {
            return jM13804getZeronOccac2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
