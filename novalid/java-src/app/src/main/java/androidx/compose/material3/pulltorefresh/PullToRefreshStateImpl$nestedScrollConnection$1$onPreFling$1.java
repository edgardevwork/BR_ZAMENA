package androidx.compose.material3.pulltorefresh;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PullToRefresh.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$nestedScrollConnection$1", m7120f = "PullToRefresh.kt", m7121i = {}, m7122l = {341}, m7123m = "onPreFling-QWom1Mo", m7124n = {}, m7125s = {})
/* loaded from: classes3.dex */
public final class PullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1 extends ContinuationImpl {
    public float F$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PullToRefreshStateImpl$nestedScrollConnection$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1(PullToRefreshStateImpl$nestedScrollConnection$1 pullToRefreshStateImpl$nestedScrollConnection$1, Continuation<? super PullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1> continuation) {
        super(continuation);
        this.this$0 = pullToRefreshStateImpl$nestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8201onPreFlingQWom1Mo(0L, this);
    }
}
