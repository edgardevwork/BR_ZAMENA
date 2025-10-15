package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: SelectionController.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¨\u0006\b"}, m7105d2 = {"makeSelectionModifier", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectableId", "", "layoutCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class SelectionControllerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier makeSelectionModifier(final SelectionRegistrar selectionRegistrar, final long j, final Function0<? extends LayoutCoordinates> function0) {
        TextDragObserver textDragObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1
            private long dragTotalDistance;
            private long lastPosition;

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo8464onDownk4lQ0M(long point) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                Offset.Companion companion = Offset.INSTANCE;
                this.lastPosition = companion.m11115getZeroF1C5BW0();
                this.dragTotalDistance = companion.m11115getZeroF1C5BW0();
            }

            public final long getLastPosition() {
                return this.lastPosition;
            }

            public final void setLastPosition(long j2) {
                this.lastPosition = j2;
            }

            public final long getDragTotalDistance() {
                return this.dragTotalDistance;
            }

            public final void setDragTotalDistance(long j2) {
                this.dragTotalDistance = j2;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo8466onStartk4lQ0M(long startPoint) {
                LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                if (layoutCoordinatesInvoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (!layoutCoordinatesInvoke.isAttached()) {
                        return;
                    }
                    selectionRegistrar2.mo8611notifySelectionUpdateStartubNVwUQ(layoutCoordinatesInvoke, startPoint, SelectionAdjustment.INSTANCE.getWord(), true);
                    this.lastPosition = startPoint;
                }
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    this.dragTotalDistance = Offset.INSTANCE.m11115getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo8465onDragk4lQ0M(long delta) {
                LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                if (layoutCoordinatesInvoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j2 = j;
                    if (layoutCoordinatesInvoke.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2)) {
                        long jM11104plusMKHz9U = Offset.m11104plusMKHz9U(this.dragTotalDistance, delta);
                        this.dragTotalDistance = jM11104plusMKHz9U;
                        long jM11104plusMKHz9U2 = Offset.m11104plusMKHz9U(this.lastPosition, jM11104plusMKHz9U);
                        if (selectionRegistrar2.mo8610notifySelectionUpdatenjBpvok(layoutCoordinatesInvoke, jM11104plusMKHz9U2, this.lastPosition, false, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate(), true)) {
                            this.lastPosition = jM11104plusMKHz9U2;
                            this.dragTotalDistance = Offset.INSTANCE.m11115getZeroF1C5BW0();
                        }
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }
        };
        return SelectionGesturesKt.selectionGestureInput(Modifier.INSTANCE, new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1
            private long lastPosition = Offset.INSTANCE.m11115getZeroF1C5BW0();

            public final long getLastPosition() {
                return this.lastPosition;
            }

            public final void setLastPosition(long j2) {
                this.lastPosition = j2;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M, reason: not valid java name */
            public boolean mo8538onExtendk4lQ0M(long downPosition) {
                LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                if (layoutCoordinatesInvoke == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j2 = j;
                if (!layoutCoordinatesInvoke.isAttached()) {
                    return false;
                }
                if (selectionRegistrar2.mo8610notifySelectionUpdatenjBpvok(layoutCoordinatesInvoke, downPosition, this.lastPosition, false, SelectionAdjustment.INSTANCE.getNone(), false)) {
                    this.lastPosition = downPosition;
                }
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
            public boolean mo8539onExtendDragk4lQ0M(long dragPosition) {
                LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                if (layoutCoordinatesInvoke == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j2 = j;
                if (!layoutCoordinatesInvoke.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2)) {
                    return false;
                }
                if (!selectionRegistrar2.mo8610notifySelectionUpdatenjBpvok(layoutCoordinatesInvoke, dragPosition, this.lastPosition, false, SelectionAdjustment.INSTANCE.getNone(), false)) {
                    return true;
                }
                this.lastPosition = dragPosition;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k, reason: not valid java name */
            public boolean mo8540onStart3MmeM6k(long downPosition, @NotNull SelectionAdjustment adjustment) {
                LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                if (layoutCoordinatesInvoke == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j2 = j;
                if (!layoutCoordinatesInvoke.isAttached()) {
                    return false;
                }
                selectionRegistrar2.mo8611notifySelectionUpdateStartubNVwUQ(layoutCoordinatesInvoke, downPosition, adjustment, false);
                this.lastPosition = downPosition;
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k, reason: not valid java name */
            public boolean mo8537onDrag3MmeM6k(long dragPosition, @NotNull SelectionAdjustment adjustment) {
                LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                if (layoutCoordinatesInvoke == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j2 = j;
                if (!layoutCoordinatesInvoke.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2)) {
                    return false;
                }
                if (!selectionRegistrar2.mo8610notifySelectionUpdatenjBpvok(layoutCoordinatesInvoke, dragPosition, this.lastPosition, false, adjustment, false)) {
                    return true;
                }
                this.lastPosition = dragPosition;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
                selectionRegistrar.notifySelectionUpdateEnd();
            }
        }, textDragObserver);
    }
}
