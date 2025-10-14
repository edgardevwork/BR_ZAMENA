package androidx.compose.p003ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.PointerInteropFilter;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: PointerInteropFilter.android.kt */
@Metadata(m7104d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\tH\u0016J*\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\tH\u0002R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m7105d2 = {"androidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "shareWithSiblings", "", "getShareWithSiblings", "()Z", "state", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "dispatchToView", "", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "onCancel", "onPointerEvent", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "reset", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,352:1\n101#2,2:353\n33#2,6:355\n103#2:361\n86#2,2:362\n33#2,6:364\n88#2:370\n101#2,2:371\n33#2,6:373\n103#2:379\n33#2,6:380\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n*L\n223#1:353,2\n223#1:355,6\n223#1:361\n238#1:362,2\n238#1:364,6\n238#1:370\n280#1:371,2\n280#1:373,6\n280#1:379\n314#1:380,6\n*E\n"})
/* loaded from: classes.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {

    @NotNull
    private PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.Unknown;
    final /* synthetic */ PointerInteropFilter this$0;

    @Override // androidx.compose.p003ui.input.pointer.PointerInputFilter
    public boolean getShareWithSiblings() {
        return true;
    }

    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.this$0 = pointerInteropFilter;
    }

    @Override // androidx.compose.p003ui.input.pointer.PointerInputFilter
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo12508onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        boolean z;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        if (this.this$0.getDisallowIntercept()) {
            z = true;
            break;
        }
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = changes.get(i);
            if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange) || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                z = true;
                break;
            }
        }
        z = false;
        if (this.state != PointerInteropFilter.DispatchToViewState.NotDispatching) {
            if (pass == PointerEventPass.Initial && z) {
                dispatchToView(pointerEvent);
            }
            if (pass == PointerEventPass.Final && !z) {
                dispatchToView(pointerEvent);
            }
        }
        if (pass == PointerEventPass.Final) {
            int size2 = changes.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i2))) {
                    return;
                }
            }
            reset();
        }
    }

    @Override // androidx.compose.p003ui.input.pointer.PointerInputFilter
    public void onCancel() {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            final PointerInteropFilter pointerInteropFilter = this.this$0;
            PointerInteropUtils_androidKt.emptyCancelMotionEventScope(jUptimeMillis, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                    invoke2(motionEvent);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MotionEvent motionEvent) {
                    pointerInteropFilter.getOnTouchEvent().invoke(motionEvent);
                }
            });
            reset();
        }
    }

    private final void reset() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.this$0.setDisallowIntercept$ui_release(false);
    }

    private final void dispatchToView(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (changes.get(i).isConsumed()) {
                if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                    LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        long jMo12619localToRootMKHz9U = layoutCoordinates.mo12619localToRootMKHz9U(Offset.INSTANCE.m11115getZeroF1C5BW0());
                        final PointerInteropFilter pointerInteropFilter = this.this$0;
                        PointerInteropUtils_androidKt.m12543toCancelMotionEventScoped4ec7I(pointerEvent, jMo12619localToRootMKHz9U, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                                invoke2(motionEvent);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull MotionEvent motionEvent) {
                                pointerInteropFilter.getOnTouchEvent().invoke(motionEvent);
                            }
                        });
                    } else {
                        throw new IllegalStateException("layoutCoordinates not set".toString());
                    }
                }
                this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
                return;
            }
        }
        LayoutCoordinates layoutCoordinates2 = getLayoutCoordinates();
        if (layoutCoordinates2 != null) {
            long jMo12619localToRootMKHz9U2 = layoutCoordinates2.mo12619localToRootMKHz9U(Offset.INSTANCE.m11115getZeroF1C5BW0());
            final PointerInteropFilter pointerInteropFilter2 = this.this$0;
            PointerInteropUtils_androidKt.m12544toMotionEventScoped4ec7I(pointerEvent, jMo12619localToRootMKHz9U2, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                    invoke2(motionEvent);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MotionEvent motionEvent) {
                    PointerInteropFilter.DispatchToViewState dispatchToViewState;
                    if (motionEvent.getActionMasked() == 0) {
                        PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1 = this.this$0;
                        if (pointerInteropFilter2.getOnTouchEvent().invoke(motionEvent).booleanValue()) {
                            dispatchToViewState = PointerInteropFilter.DispatchToViewState.Dispatching;
                        } else {
                            dispatchToViewState = PointerInteropFilter.DispatchToViewState.NotDispatching;
                        }
                        pointerInteropFilter$pointerInputFilter$1.state = dispatchToViewState;
                        return;
                    }
                    pointerInteropFilter2.getOnTouchEvent().invoke(motionEvent);
                }
            });
            if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                int size2 = changes.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    changes.get(i2).consume();
                }
                InternalPointerEvent internalPointerEvent = pointerEvent.getInternalPointerEvent();
                if (internalPointerEvent == null) {
                    return;
                }
                internalPointerEvent.setSuppressMovementConsumption(!this.this$0.getDisallowIntercept());
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set".toString());
    }
}
