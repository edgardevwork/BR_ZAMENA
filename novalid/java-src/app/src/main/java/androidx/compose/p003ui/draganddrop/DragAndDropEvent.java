package androidx.compose.p003ui.draganddrop;

import android.view.DragEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DragAndDrop.android.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "", "dragEvent", "Landroid/view/DragEvent;", "(Landroid/view/DragEvent;)V", "getDragEvent$ui_release", "()Landroid/view/DragEvent;", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class DragAndDropEvent {
    public static final int $stable = 8;

    @NotNull
    private final DragEvent dragEvent;

    public DragAndDropEvent(@NotNull DragEvent dragEvent) {
        this.dragEvent = dragEvent;
    }

    @NotNull
    /* renamed from: getDragEvent$ui_release, reason: from getter */
    public final DragEvent getDragEvent() {
        return this.dragEvent;
    }
}
