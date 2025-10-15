package androidx.compose.material3;

import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SwipeToDismissBox.kt */
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\f\u0010\u0012\u001a\u00020\u0010*\u00020\u0013H\u0016R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m7105d2 = {"Landroidx/compose/material3/SwipeToDismissAnchorsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/SwipeToDismissAnchorsNode;", "state", "Landroidx/compose/material3/SwipeToDismissBoxState;", "enableDismissFromStartToEnd", "", "enableDismissFromEndToStart", "(Landroidx/compose/material3/SwipeToDismissBoxState;ZZ)V", "create", "equals", "other", "", "hashCode", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissAnchorsElement\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,480:1\n135#2:481\n*S KotlinDebug\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissAnchorsElement\n*L\n427#1:481\n*E\n"})
/* loaded from: classes4.dex */
final class SwipeToDismissAnchorsElement extends ModifierNodeElement<SwipeToDismissAnchorsNode> {
    public final boolean enableDismissFromEndToStart;
    public final boolean enableDismissFromStartToEnd;

    @NotNull
    public final SwipeToDismissBoxState state;

    public SwipeToDismissAnchorsElement(@NotNull SwipeToDismissBoxState swipeToDismissBoxState, boolean z, boolean z2) {
        this.state = swipeToDismissBoxState;
        this.enableDismissFromStartToEnd = z;
        this.enableDismissFromEndToStart = z2;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    @NotNull
    public SwipeToDismissAnchorsNode create() {
        return new SwipeToDismissAnchorsNode(this.state, this.enableDismissFromStartToEnd, this.enableDismissFromEndToStart);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void update(@NotNull SwipeToDismissAnchorsNode node) {
        node.setState(this.state);
        node.setEnableDismissFromStartToEnd(this.enableDismissFromStartToEnd);
        node.setEnableDismissFromEndToStart(this.enableDismissFromEndToStart);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.compose.material3.SwipeToDismissAnchorsElement");
        SwipeToDismissAnchorsElement swipeToDismissAnchorsElement = (SwipeToDismissAnchorsElement) other;
        return Intrinsics.areEqual(this.state, swipeToDismissAnchorsElement.state) && this.enableDismissFromStartToEnd == swipeToDismissAnchorsElement.enableDismissFromStartToEnd && this.enableDismissFromEndToStart == swipeToDismissAnchorsElement.enableDismissFromEndToStart;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.state.hashCode() * 31) + Boolean.hashCode(this.enableDismissFromStartToEnd)) * 31) + Boolean.hashCode(this.enableDismissFromEndToStart);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.SwipeToDismissAnchorsElement$inspectableProperties$$inlined$debugInspectorInfo$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo2) {
                    invoke2(inspectorInfo2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InspectorInfo inspectorInfo2) {
                    inspectorInfo2.getProperties().set("state", this.this$0.state);
                    inspectorInfo2.getProperties().set("enableDismissFromStartToEnd", Boolean.valueOf(this.this$0.enableDismissFromStartToEnd));
                    inspectorInfo2.getProperties().set("enableDismissFromEndToStart", Boolean.valueOf(this.this$0.enableDismissFromEndToStart));
                }
            };
        } else {
            InspectableValueKt.getNoInspectorInfo();
        }
    }
}
