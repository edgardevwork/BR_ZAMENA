package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DragGestureDetector.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m7120f = "DragGestureDetector.kt", m7121i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m7122l = {884, 926}, m7123m = "awaitTouchSlopOrCancellation-jO51t88", m7124n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, m7125s = {"L$0", "L$2", "L$3", "F$0", "J$0", "L$0", "L$2", "L$3", "L$4", "F$0", "J$0"})
/* loaded from: classes4.dex */
public final class DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 extends ContinuationImpl {
    public float F$0;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(Continuation<? super DragGestureDetectorKt$awaitTouchSlopOrCancellation$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m7903awaitTouchSlopOrCancellationjO51t88(null, 0L, null, this);
    }
}
