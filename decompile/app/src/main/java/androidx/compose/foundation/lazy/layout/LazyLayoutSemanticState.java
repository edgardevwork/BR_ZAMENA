package androidx.compose.foundation.lazy.layout;

import androidx.compose.p003ui.semantics.CollectionInfo;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyLayoutSemantics.kt */
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u0017R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m7105d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "", "canScrollForward", "", "getCanScrollForward", "()Z", "firstVisibleItemIndex", "", "getFirstVisibleItemIndex", "()I", "firstVisibleItemScrollOffset", "getFirstVisibleItemScrollOffset", "animateScrollBy", "", "delta", "", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectionInfo", "Landroidx/compose/ui/semantics/CollectionInfo;", "pseudoMaxScrollOffset", "pseudoScrollOffset", "scrollToItem", FirebaseAnalytics.Param.INDEX, "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface LazyLayoutSemanticState {
    @Nullable
    Object animateScrollBy(float f, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    CollectionInfo collectionInfo();

    boolean getCanScrollForward();

    int getFirstVisibleItemIndex();

    int getFirstVisibleItemScrollOffset();

    @Nullable
    Object scrollToItem(int i, @NotNull Continuation<? super Unit> continuation);

    default float pseudoScrollOffset() {
        return getFirstVisibleItemScrollOffset() + (getFirstVisibleItemIndex() * 500);
    }

    default float pseudoMaxScrollOffset() {
        if (getCanScrollForward()) {
            return pseudoScrollOffset() + 100;
        }
        return pseudoScrollOffset();
    }
}
