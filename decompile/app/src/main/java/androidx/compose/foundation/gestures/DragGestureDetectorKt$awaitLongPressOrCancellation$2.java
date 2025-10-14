package androidx.compose.foundation.gestures;

import androidx.compose.p003ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerEventKt;
import androidx.compose.p003ui.input.pointer.PointerEventPass;
import androidx.compose.p003ui.input.pointer.PointerId;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DragGestureDetector.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", m7120f = "DragGestureDetector.kt", m7121i = {0, 0, 1, 1, 1}, m7122l = {812, 829}, m7123m = "invokeSuspend", m7124n = {"$this$withTimeout", "finished", "$this$withTimeout", "event", "finished"}, m7125s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,875:1\n86#2,2:876\n33#2,6:878\n88#2:884\n101#2,2:885\n33#2,6:887\n103#2:893\n101#2,2:894\n33#2,6:896\n103#2:902\n116#2,2:903\n33#2,6:905\n118#2:911\n116#2,2:912\n33#2,6:914\n118#2:920\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n*L\n813#1:876,2\n813#1:878,6\n813#1:884\n819#1:885,2\n819#1:887,6\n819#1:893\n830#1:894,2\n830#1:896,6\n830#1:902\n834#1:903,2\n834#1:905,6\n834#1:911\n844#1:912,2\n844#1:914,6\n844#1:920\n*E\n"})
/* loaded from: classes3.dex */
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.ObjectRef<PointerInputChange> $currentDown;
    public final /* synthetic */ Ref.ObjectRef<PointerInputChange> $longPress;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref.ObjectRef<PointerInputChange> objectRef, Ref.ObjectRef<PointerInputChange> objectRef2, Continuation<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> continuation) {
        super(2, continuation);
        this.$currentDown = objectRef;
        this.$longPress = objectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$currentDown, this.$longPress, continuation);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ce A[EDGE_INSN: B:65:0x00ce->B:41:0x00ce BREAK  A[LOOP:0: B:36:0x00bb->B:40:0x00cb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [T, androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ad -> B:35:0x00b0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        AwaitPointerEventScope awaitPointerEventScope;
        int i;
        Object objAwaitPointerEvent;
        int size;
        int i2;
        int size2;
        int i3;
        Object objAwaitPointerEvent2;
        T t;
        PointerInputChange pointerInputChange;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        Object obj2 = null;
        int i5 = 1;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            i = 0;
            if (i == 0) {
            }
        } else if (i4 == 1) {
            i = this.I$0;
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            objAwaitPointerEvent = obj;
            PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            size = changes.size();
            i2 = 0;
            while (true) {
                if (i2 >= size) {
                }
                i2++;
            }
            List<PointerInputChange> changes2 = pointerEvent.getChanges();
            size2 = changes2.size();
            while (i3 < size2) {
            }
            PointerEventPass pointerEventPass = PointerEventPass.Final;
            this.L$0 = awaitPointerEventScope;
            this.L$1 = pointerEvent;
            this.I$0 = i;
            this.label = 2;
            objAwaitPointerEvent2 = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, this);
            if (objAwaitPointerEvent2 != coroutine_suspended) {
            }
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            PointerEvent pointerEvent2 = (PointerEvent) this.L$1;
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            objAwaitPointerEvent2 = obj;
            List<PointerInputChange> changes3 = ((PointerEvent) objAwaitPointerEvent2).getChanges();
            int size3 = changes3.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size3) {
                    break;
                }
                if (changes3.get(i6).isConsumed()) {
                    i = i5;
                    break;
                }
                i6++;
            }
            if (!DragGestureDetectorKt.m7911isPointerUpDmW0f2w(pointerEvent2, this.$currentDown.element.getId())) {
                List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                int size4 = changes4.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size4) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes4.get(i7);
                    if (pointerInputChange.getPressed()) {
                        break;
                    }
                    i7++;
                }
                PointerInputChange pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != 0) {
                    this.$currentDown.element = pointerInputChange2;
                    this.$longPress.element = pointerInputChange2;
                } else {
                    i = i5;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    obj2 = null;
                    if (i == 0) {
                        PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = obj2;
                        this.I$0 = i;
                        this.label = i5;
                        objAwaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, this);
                        if (objAwaitPointerEvent == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        PointerEvent pointerEvent3 = (PointerEvent) objAwaitPointerEvent;
                        List<PointerInputChange> changes5 = pointerEvent3.getChanges();
                        size = changes5.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                i = i5;
                                break;
                            }
                            if (!PointerEventKt.changedToUpIgnoreConsumed(changes5.get(i2))) {
                                break;
                            }
                            i2++;
                        }
                        List<PointerInputChange> changes22 = pointerEvent3.getChanges();
                        size2 = changes22.size();
                        for (i3 = 0; i3 < size2; i3++) {
                            PointerInputChange pointerInputChange3 = changes22.get(i3);
                            if (pointerInputChange3.isConsumed() || PointerEventKt.m12429isOutOfBoundsjwHxaWs(pointerInputChange3, awaitPointerEventScope.mo12396getSizeYbymL2g(), awaitPointerEventScope.mo12395getExtendedTouchPaddingNHjbRc())) {
                                break;
                            }
                        }
                        PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = pointerEvent3;
                        this.I$0 = i;
                        this.label = 2;
                        objAwaitPointerEvent2 = awaitPointerEventScope.awaitPointerEvent(pointerEventPass3, this);
                        if (objAwaitPointerEvent2 != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        pointerEvent2 = pointerEvent3;
                        List<PointerInputChange> changes32 = ((PointerEvent) objAwaitPointerEvent2).getChanges();
                        int size32 = changes32.size();
                        int i62 = 0;
                        while (true) {
                            if (i62 >= size32) {
                            }
                            i62++;
                        }
                        if (!DragGestureDetectorKt.m7911isPointerUpDmW0f2w(pointerEvent2, this.$currentDown.element.getId())) {
                            Ref.ObjectRef<PointerInputChange> objectRef = this.$longPress;
                            List<PointerInputChange> changes6 = pointerEvent2.getChanges();
                            Ref.ObjectRef<PointerInputChange> objectRef2 = this.$currentDown;
                            int size5 = changes6.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size5) {
                                    t = 0;
                                    break;
                                }
                                t = changes6.get(i8);
                                Ref.ObjectRef<PointerInputChange> objectRef3 = objectRef2;
                                if (PointerId.m12466equalsimpl0(((PointerInputChange) t).getId(), objectRef2.element.getId())) {
                                    break;
                                }
                                i8++;
                                objectRef2 = objectRef3;
                            }
                            objectRef.element = t;
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                }
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj2 = null;
            i5 = 1;
            if (i == 0) {
            }
        }
    }
}
