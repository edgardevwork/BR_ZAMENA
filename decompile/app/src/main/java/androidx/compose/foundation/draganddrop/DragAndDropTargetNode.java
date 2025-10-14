package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p003ui.draganddrop.DragAndDropEvent;
import androidx.compose.p003ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.p003ui.draganddrop.DragAndDropTarget;
import androidx.compose.p003ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: DragAndDropTarget.kt */
@ExperimentalFoundationApi
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B0\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR5\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m7105d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;", "Landroidx/compose/ui/node/DelegatingNode;", "shouldStartDragAndDrop", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Lkotlin/ParameterName;", "name", "event", "", "target", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V", "getShouldStartDragAndDrop", "()Lkotlin/jvm/functions/Function1;", "setShouldStartDragAndDrop", "(Lkotlin/jvm/functions/Function1;)V", "getTarget", "()Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "setTarget", "(Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class DragAndDropTargetNode extends DelegatingNode {

    @NotNull
    public Function1<? super DragAndDropEvent, Boolean> shouldStartDragAndDrop;

    @NotNull
    public DragAndDropTarget target;

    @NotNull
    public final Function1<DragAndDropEvent, Boolean> getShouldStartDragAndDrop() {
        return this.shouldStartDragAndDrop;
    }

    public final void setShouldStartDragAndDrop(@NotNull Function1<? super DragAndDropEvent, Boolean> function1) {
        this.shouldStartDragAndDrop = function1;
    }

    @NotNull
    public final DragAndDropTarget getTarget() {
        return this.target;
    }

    public final void setTarget(@NotNull DragAndDropTarget dragAndDropTarget) {
        this.target = dragAndDropTarget;
    }

    public DragAndDropTargetNode(@NotNull Function1<? super DragAndDropEvent, Boolean> function1, @NotNull DragAndDropTarget dragAndDropTarget) {
        this.shouldStartDragAndDrop = function1;
        this.target = dragAndDropTarget;
        delegate(DragAndDropNodeKt.DragAndDropModifierNode(function1, dragAndDropTarget));
    }
}
