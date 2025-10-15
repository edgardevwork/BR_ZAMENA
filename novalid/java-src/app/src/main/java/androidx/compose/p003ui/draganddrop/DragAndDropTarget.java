package androidx.compose.p003ui.draganddrop;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DragAndDrop.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m7105d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "", "onChanged", "", "event", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "onDrop", "", "onEnded", "onEntered", "onExited", "onMoved", "onStarted", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public interface DragAndDropTarget {
    default void onChanged(@NotNull DragAndDropEvent event) {
    }

    boolean onDrop(@NotNull DragAndDropEvent event);

    default void onEnded(@NotNull DragAndDropEvent event) {
    }

    default void onEntered(@NotNull DragAndDropEvent event) {
    }

    default void onExited(@NotNull DragAndDropEvent event) {
    }

    default void onMoved(@NotNull DragAndDropEvent event) {
    }

    default void onStarted(@NotNull DragAndDropEvent event) {
    }
}
