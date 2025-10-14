package androidx.compose.p003ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: DepthSortedSet.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\u000e\u001a\u00020\u0003J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\u000bJC\u0010\u0011\u001a\u00020\t28\b\u0004\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\t0\u0013H\u0086\bJ\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0016\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m7105d2 = {"Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "", "extraAssertions", "", "(Z)V", "lookaheadSet", "Landroidx/compose/ui/node/DepthSortedSet;", "set", "add", "", "node", "Landroidx/compose/ui/node/LayoutNode;", "affectsLookahead", "contains", "isEmpty", "isNotEmpty", "pop", "popEach", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "remove", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 2 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n1#1,184:1\n96#2:185\n96#2:186\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n*L\n160#1:185\n172#1:186\n*E\n"})
/* loaded from: classes4.dex */
public final class DepthSortedSetsForDifferentPasses {
    public static final int $stable = 8;

    @NotNull
    private final DepthSortedSet lookaheadSet;

    @NotNull
    private final DepthSortedSet set;

    public DepthSortedSetsForDifferentPasses(boolean z) {
        this.lookaheadSet = new DepthSortedSet(z);
        this.set = new DepthSortedSet(z);
    }

    public final boolean contains(@NotNull LayoutNode node, boolean affectsLookahead) {
        boolean zContains = this.lookaheadSet.contains(node);
        return affectsLookahead ? zContains : zContains || this.set.contains(node);
    }

    public final boolean contains(@NotNull LayoutNode node) {
        return this.lookaheadSet.contains(node) || this.set.contains(node);
    }

    public final void add(@NotNull LayoutNode node, boolean affectsLookahead) {
        if (affectsLookahead) {
            this.lookaheadSet.add(node);
        } else {
            if (this.lookaheadSet.contains(node)) {
                return;
            }
            this.set.add(node);
        }
    }

    public final boolean remove(@NotNull LayoutNode node, boolean affectsLookahead) {
        if (affectsLookahead) {
            return this.lookaheadSet.remove(node);
        }
        return this.set.remove(node);
    }

    public final boolean remove(@NotNull LayoutNode node) {
        return this.set.remove(node) || this.lookaheadSet.remove(node);
    }

    @NotNull
    public final LayoutNode pop() {
        if (!this.lookaheadSet.isEmpty()) {
            return this.lookaheadSet.pop();
        }
        return this.set.pop();
    }

    public final void popEach(@NotNull Function2<? super LayoutNode, ? super Boolean, Unit> block) {
        while (isNotEmpty()) {
            boolean z = !this.lookaheadSet.isEmpty();
            block.invoke((z ? this.lookaheadSet : this.set).pop(), Boolean.valueOf(z));
        }
    }

    public final boolean isEmpty() {
        return this.set.isEmpty() && this.lookaheadSet.isEmpty();
    }

    public final boolean isEmpty(boolean affectsLookahead) {
        return (affectsLookahead ? this.lookaheadSet : this.set).isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }
}
