package androidx.compose.material;

import androidx.media3.extractor.p007ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Swipeable.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.compose.material.SwipeableState", m7120f = "Swipeable.kt", m7121i = {1, 1, 1, 2, 2, 2}, m7122l = {164, TsExtractor.TS_PACKET_SIZE, 191}, m7123m = "processNewAnchors$material_release", m7124n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, m7125s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
/* loaded from: classes4.dex */
public final class SwipeableState$processNewAnchors$1 extends ContinuationImpl {
    public float F$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SwipeableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$processNewAnchors$1(SwipeableState<T> swipeableState, Continuation<? super SwipeableState$processNewAnchors$1> continuation) {
        super(continuation);
        this.this$0 = swipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processNewAnchors$material_release(null, null, this);
    }
}
