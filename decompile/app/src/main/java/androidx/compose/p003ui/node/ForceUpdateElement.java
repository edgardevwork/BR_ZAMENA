package androidx.compose.p003ui.node;

import androidx.compose.p003ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NodeChain.kt */
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0002\u0010\u0004J\r\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0001HÆ\u0003J\u0017\u0010\b\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001HÆ\u0001J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, m7105d2 = {"Landroidx/compose/ui/node/ForceUpdateElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/Modifier$Node;", "original", "(Landroidx/compose/ui/node/ModifierNodeElement;)V", "getOriginal", "()Landroidx/compose/ui/node/ModifierNodeElement;", "component1", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "", "node", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
final /* data */ class ForceUpdateElement extends ModifierNodeElement<Modifier.Node> {

    @NotNull
    public final ModifierNodeElement<?> original;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ForceUpdateElement copy$default(ForceUpdateElement forceUpdateElement, ModifierNodeElement modifierNodeElement, int i, Object obj) {
        if ((i & 1) != 0) {
            modifierNodeElement = forceUpdateElement.original;
        }
        return forceUpdateElement.copy(modifierNodeElement);
    }

    @NotNull
    public final ModifierNodeElement<?> component1() {
        return this.original;
    }

    @NotNull
    public final ForceUpdateElement copy(@NotNull ModifierNodeElement<?> original) {
        return new ForceUpdateElement(original);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ForceUpdateElement) && Intrinsics.areEqual(this.original, ((ForceUpdateElement) other).original);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        return this.original.hashCode();
    }

    @NotNull
    public String toString() {
        return "ForceUpdateElement(original=" + this.original + ')';
    }

    @NotNull
    public final ModifierNodeElement<?> getOriginal() {
        return this.original;
    }

    public ForceUpdateElement(@NotNull ModifierNodeElement<?> modifierNodeElement) {
        this.original = modifierNodeElement;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    @NotNull
    public Modifier.Node create() {
        throw new IllegalStateException("Shouldn't be called");
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void update(@NotNull Modifier.Node node) {
        throw new IllegalStateException("Shouldn't be called");
    }
}
