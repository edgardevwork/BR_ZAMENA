package androidx.compose.p003ui.draganddrop;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.p003ui.geometry.OffsetKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DragAndDrop.android.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m7105d2 = {"positionInRoot", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "getPositionInRoot", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)J", "mimeTypes", "", "", "toAndroidDragEvent", "Landroid/view/DragEvent;", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class DragAndDrop_androidKt {
    @NotNull
    public static final DragEvent toAndroidDragEvent(@NotNull DragAndDropEvent dragAndDropEvent) {
        return dragAndDropEvent.getDragEvent();
    }

    @NotNull
    public static final Set<String> mimeTypes(@NotNull DragAndDropEvent dragAndDropEvent) {
        ClipDescription clipDescription = dragAndDropEvent.getDragEvent().getClipDescription();
        if (clipDescription == null) {
            return SetsKt__SetsKt.emptySet();
        }
        Set setCreateSetBuilder = SetsKt__SetsJVMKt.createSetBuilder(clipDescription.getMimeTypeCount());
        int mimeTypeCount = clipDescription.getMimeTypeCount();
        for (int i = 0; i < mimeTypeCount; i++) {
            setCreateSetBuilder.add(clipDescription.getMimeType(i));
        }
        return SetsKt__SetsJVMKt.build(setCreateSetBuilder);
    }

    public static final long getPositionInRoot(@NotNull DragAndDropEvent dragAndDropEvent) {
        return OffsetKt.Offset(dragAndDropEvent.getDragEvent().getX(), dragAndDropEvent.getDragEvent().getY());
    }
}
