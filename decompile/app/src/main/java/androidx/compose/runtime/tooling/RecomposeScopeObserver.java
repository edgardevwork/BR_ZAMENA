package androidx.compose.runtime.tooling;

import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.RecomposeScope;
import kotlin.Metadata;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompositionObserver.kt */
@ExperimentalComposeRuntimeApi
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m7105d2 = {"Landroidx/compose/runtime/tooling/RecomposeScopeObserver;", "", "onBeginScopeComposition", "", PomReader.SCOPE, "Landroidx/compose/runtime/RecomposeScope;", "onEndScopeComposition", "onScopeDisposed", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public interface RecomposeScopeObserver {
    void onBeginScopeComposition(@NotNull RecomposeScope scope);

    void onEndScopeComposition(@NotNull RecomposeScope scope);

    void onScopeDisposed(@NotNull RecomposeScope scope);
}
