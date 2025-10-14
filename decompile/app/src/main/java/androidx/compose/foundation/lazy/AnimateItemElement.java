package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode;
import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyItemScopeImpl.kt */
@Metadata(m7104d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0001J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\f\u0010\u001b\u001a\u00020\u0019*\u00020\u001cH\u0016R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u001d"}, m7105d2 = {"Landroidx/compose/foundation/lazy/AnimateItemElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;", "appearanceSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "placementSpec", "Landroidx/compose/ui/unit/IntOffset;", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "getAppearanceSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "getPlacementSpec", "component1", "component2", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
final /* data */ class AnimateItemElement extends ModifierNodeElement<LazyLayoutAnimationSpecsNode> {

    @Nullable
    public final FiniteAnimationSpec<Float> appearanceSpec;

    @Nullable
    public final FiniteAnimationSpec<IntOffset> placementSpec;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnimateItemElement copy$default(AnimateItemElement animateItemElement, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = animateItemElement.appearanceSpec;
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec2 = animateItemElement.placementSpec;
        }
        return animateItemElement.copy(finiteAnimationSpec, finiteAnimationSpec2);
    }

    @Nullable
    public final FiniteAnimationSpec<Float> component1() {
        return this.appearanceSpec;
    }

    @Nullable
    public final FiniteAnimationSpec<IntOffset> component2() {
        return this.placementSpec;
    }

    @NotNull
    public final AnimateItemElement copy(@Nullable FiniteAnimationSpec<Float> appearanceSpec, @Nullable FiniteAnimationSpec<IntOffset> placementSpec) {
        return new AnimateItemElement(appearanceSpec, placementSpec);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimateItemElement)) {
            return false;
        }
        AnimateItemElement animateItemElement = (AnimateItemElement) other;
        return Intrinsics.areEqual(this.appearanceSpec, animateItemElement.appearanceSpec) && Intrinsics.areEqual(this.placementSpec, animateItemElement.placementSpec);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.appearanceSpec;
        int iHashCode = (finiteAnimationSpec == null ? 0 : finiteAnimationSpec.hashCode()) * 31;
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec2 = this.placementSpec;
        return iHashCode + (finiteAnimationSpec2 != null ? finiteAnimationSpec2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AnimateItemElement(appearanceSpec=" + this.appearanceSpec + ", placementSpec=" + this.placementSpec + ')';
    }

    @Nullable
    public final FiniteAnimationSpec<Float> getAppearanceSpec() {
        return this.appearanceSpec;
    }

    @Nullable
    public final FiniteAnimationSpec<IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    public AnimateItemElement(@Nullable FiniteAnimationSpec<Float> finiteAnimationSpec, @Nullable FiniteAnimationSpec<IntOffset> finiteAnimationSpec2) {
        this.appearanceSpec = finiteAnimationSpec;
        this.placementSpec = finiteAnimationSpec2;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    @NotNull
    public LazyLayoutAnimationSpecsNode create() {
        return new LazyLayoutAnimationSpecsNode(this.appearanceSpec, this.placementSpec);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void update(@NotNull LazyLayoutAnimationSpecsNode node) {
        node.setAppearanceSpec(this.appearanceSpec);
        node.setPlacementSpec(this.placementSpec);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateItemPlacement");
        inspectorInfo.setValue(this.placementSpec);
    }
}
