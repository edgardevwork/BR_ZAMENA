package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DragGestureDetector.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
@DebugMetadata(m7119c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m7120f = "DragGestureDetector.kt", m7121i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m7122l = {667, 693}, m7123m = "awaitPointerSlopOrCancellation-pn7EDYM", m7124n = {"$this$awaitPointerSlopOrCancellation_u2dpn7EDYM", "pointerDirectionConfig", "onPointerSlopReached", "pointer", "touchSlop", "totalPositionChange", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM", "pointerDirectionConfig", "onPointerSlopReached", "pointer", "dragEvent", "touchSlop", "totalPositionChange"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "F$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0", "J$0"})
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1\n*L\n1#1,875:1\n*E\n"})
/* loaded from: classes4.dex */
public final class DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 extends ContinuationImpl {
    public float F$0;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(Continuation<? super DragGestureDetectorKt$awaitPointerSlopOrCancellation$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m7901awaitPointerSlopOrCancellationpn7EDYM(null, 0L, 0, null, null, this);
    }
}
