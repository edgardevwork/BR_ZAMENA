package androidx.compose.material3.pulltorefresh;

import androidx.annotation.FloatRange;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PullToRefresh.kt */
@Stable
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0014H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0018\u0010\u0005\u001a\u00020\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m7105d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "", "isRefreshing", "", "()Z", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setNestedScrollConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "positionalThreshold", "", "getPositionalThreshold", "()F", "progress", "getProgress", "verticalOffset", "getVerticalOffset", "endRefresh", "", "startRefresh", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface PullToRefreshState {
    void endRefresh();

    @NotNull
    NestedScrollConnection getNestedScrollConnection();

    float getPositionalThreshold();

    @FloatRange(from = 0.0d)
    float getProgress();

    @FloatRange(from = 0.0d)
    float getVerticalOffset();

    boolean isRefreshing();

    void setNestedScrollConnection(@NotNull NestedScrollConnection nestedScrollConnection);

    void startRefresh();
}
