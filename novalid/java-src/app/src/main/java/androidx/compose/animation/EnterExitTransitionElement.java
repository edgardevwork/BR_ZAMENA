package androidx.compose.animation;

import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.Transition;
import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EnterExitTransition.kt */
@Metadata(m7104d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008b\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J!\u0010+\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J!\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J!\u0010-\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\t\u00100\u001a\u00020\u0012HÆ\u0003J\u009d\u0001\u00101\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u00042 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u00042 \b\u0002\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\b\u00102\u001a\u00020\u0002H\u0016J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0002H\u0016J\f\u0010>\u001a\u00020<*\u00020?H\u0016R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR2\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R2\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R2\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006@"}, m7105d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/EnterExitTransitionModifierNode;", AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "offsetAnimation", "Landroidx/compose/ui/unit/IntOffset;", "slideAnimation", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "graphicsLayerBlock", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "getEnter", "()Landroidx/compose/animation/EnterTransition;", "setEnter", "(Landroidx/compose/animation/EnterTransition;)V", "getExit", "()Landroidx/compose/animation/ExitTransition;", "setExit", "(Landroidx/compose/animation/ExitTransition;)V", "getGraphicsLayerBlock", "()Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "setGraphicsLayerBlock", "(Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "getOffsetAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "setOffsetAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "getSizeAnimation", "setSizeAnimation", "getSlideAnimation", "setSlideAnimation", "getTransition", "()Landroidx/compose/animation/core/Transition;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "animation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
final /* data */ class EnterExitTransitionElement extends ModifierNodeElement<EnterExitTransitionModifierNode> {

    @NotNull
    public EnterTransition enter;

    @NotNull
    public ExitTransition exit;

    @NotNull
    public GraphicsLayerBlockForEnterExit graphicsLayerBlock;

    @Nullable
    public Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;

    @Nullable
    public Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;

    @Nullable
    public Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;

    @NotNull
    public final Transition<EnterExitState> transition;

    public static /* synthetic */ EnterExitTransitionElement copy$default(EnterExitTransitionElement enterExitTransitionElement, Transition transition, Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition.DeferredAnimation deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit, int i, Object obj) {
        if ((i & 1) != 0) {
            transition = enterExitTransitionElement.transition;
        }
        if ((i & 2) != 0) {
            deferredAnimation = enterExitTransitionElement.sizeAnimation;
        }
        Transition.DeferredAnimation deferredAnimation4 = deferredAnimation;
        if ((i & 4) != 0) {
            deferredAnimation2 = enterExitTransitionElement.offsetAnimation;
        }
        Transition.DeferredAnimation deferredAnimation5 = deferredAnimation2;
        if ((i & 8) != 0) {
            deferredAnimation3 = enterExitTransitionElement.slideAnimation;
        }
        Transition.DeferredAnimation deferredAnimation6 = deferredAnimation3;
        if ((i & 16) != 0) {
            enterTransition = enterExitTransitionElement.enter;
        }
        EnterTransition enterTransition2 = enterTransition;
        if ((i & 32) != 0) {
            exitTransition = enterExitTransitionElement.exit;
        }
        ExitTransition exitTransition2 = exitTransition;
        if ((i & 64) != 0) {
            graphicsLayerBlockForEnterExit = enterExitTransitionElement.graphicsLayerBlock;
        }
        return enterExitTransitionElement.copy(transition, deferredAnimation4, deferredAnimation5, deferredAnimation6, enterTransition2, exitTransition2, graphicsLayerBlockForEnterExit);
    }

    @NotNull
    public final Transition<EnterExitState> component1() {
        return this.transition;
    }

    @Nullable
    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> component2() {
        return this.sizeAnimation;
    }

    @Nullable
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> component3() {
        return this.offsetAnimation;
    }

    @Nullable
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> component4() {
        return this.slideAnimation;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final EnterTransition getEnter() {
        return this.enter;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ExitTransition getExit() {
        return this.exit;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final GraphicsLayerBlockForEnterExit getGraphicsLayerBlock() {
        return this.graphicsLayerBlock;
    }

    @NotNull
    public final EnterExitTransitionElement copy(@NotNull Transition<EnterExitState> transition, @Nullable Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, @Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation, @Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation, @NotNull EnterTransition enter, @NotNull ExitTransition exit, @NotNull GraphicsLayerBlockForEnterExit graphicsLayerBlock) {
        return new EnterExitTransitionElement(transition, sizeAnimation, offsetAnimation, slideAnimation, enter, exit, graphicsLayerBlock);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) other;
        return Intrinsics.areEqual(this.transition, enterExitTransitionElement.transition) && Intrinsics.areEqual(this.sizeAnimation, enterExitTransitionElement.sizeAnimation) && Intrinsics.areEqual(this.offsetAnimation, enterExitTransitionElement.offsetAnimation) && Intrinsics.areEqual(this.slideAnimation, enterExitTransitionElement.slideAnimation) && Intrinsics.areEqual(this.enter, enterExitTransitionElement.enter) && Intrinsics.areEqual(this.exit, enterExitTransitionElement.exit) && Intrinsics.areEqual(this.graphicsLayerBlock, enterExitTransitionElement.graphicsLayerBlock);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = this.transition.hashCode() * 31;
        Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
        int iHashCode2 = (iHashCode + (deferredAnimation == null ? 0 : deferredAnimation.hashCode())) * 31;
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2 = this.offsetAnimation;
        int iHashCode3 = (iHashCode2 + (deferredAnimation2 == null ? 0 : deferredAnimation2.hashCode())) * 31;
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3 = this.slideAnimation;
        return ((((((iHashCode3 + (deferredAnimation3 != null ? deferredAnimation3.hashCode() : 0)) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.graphicsLayerBlock.hashCode();
    }

    @NotNull
    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.transition + ", sizeAnimation=" + this.sizeAnimation + ", offsetAnimation=" + this.offsetAnimation + ", slideAnimation=" + this.slideAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", graphicsLayerBlock=" + this.graphicsLayerBlock + ')';
    }

    @NotNull
    public final Transition<EnterExitState> getTransition() {
        return this.transition;
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

    public EnterExitTransitionElement(@NotNull Transition<EnterExitState> transition, @Nullable Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, @Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, @Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, @NotNull EnterTransition enterTransition, @NotNull ExitTransition exitTransition, @NotNull GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    @NotNull
    public EnterExitTransitionModifierNode create() {
        return new EnterExitTransitionModifierNode(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.graphicsLayerBlock);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void update(@NotNull EnterExitTransitionModifierNode node) {
        node.setTransition(this.transition);
        node.setSizeAnimation(this.sizeAnimation);
        node.setOffsetAnimation(this.offsetAnimation);
        node.setSlideAnimation(this.slideAnimation);
        node.setEnter(this.enter);
        node.setExit(this.exit);
        node.setGraphicsLayerBlock(this.graphicsLayerBlock);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("enterExitTransition");
        inspectorInfo.getProperties().set(AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, this.transition);
        inspectorInfo.getProperties().set("sizeAnimation", this.sizeAnimation);
        inspectorInfo.getProperties().set("offsetAnimation", this.offsetAnimation);
        inspectorInfo.getProperties().set("slideAnimation", this.slideAnimation);
        inspectorInfo.getProperties().set("enter", this.enter);
        inspectorInfo.getProperties().set("exit", this.exit);
        inspectorInfo.getProperties().set("graphicsLayerBlock", this.graphicsLayerBlock);
    }
}
