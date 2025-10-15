package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode;
import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyGridItemScopeImpl.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\f\u0010\u0017\u001a\u00020\u0015*\u00020\u0018H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m7105d2 = {"Landroidx/compose/foundation/lazy/grid/AnimateItemElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;", "placementSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "getPlacementSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "component1", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
final /* data */ class AnimateItemElement extends ModifierNodeElement<LazyLayoutAnimationSpecsNode> {

    @NotNull
    public final FiniteAnimationSpec<IntOffset> placementSpec;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnimateItemElement copy$default(AnimateItemElement animateItemElement, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = animateItemElement.placementSpec;
        }
        return animateItemElement.copy(finiteAnimationSpec);
    }

    @NotNull
    public final FiniteAnimationSpec<IntOffset> component1() {
        return this.placementSpec;
    }

    @NotNull
    public final AnimateItemElement copy(@NotNull FiniteAnimationSpec<IntOffset> placementSpec) {
        return new AnimateItemElement(placementSpec);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AnimateItemElement) && Intrinsics.areEqual(this.placementSpec, ((AnimateItemElement) other).placementSpec);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        return this.placementSpec.hashCode();
    }

    @NotNull
    public String toString() {
        return "AnimateItemElement(placementSpec=" + this.placementSpec + ')';
    }

    @NotNull
    public final FiniteAnimationSpec<IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    public AnimateItemElement(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    @NotNull
    public LazyLayoutAnimationSpecsNode create() {
        return new LazyLayoutAnimationSpecsNode(null, this.placementSpec);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void update(@NotNull LazyLayoutAnimationSpecsNode node) {
        node.setPlacementSpec(this.placementSpec);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateItemPlacement");
        inspectorInfo.setValue(this.placementSpec);
    }
}
