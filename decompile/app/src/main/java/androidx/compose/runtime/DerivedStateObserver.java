package androidx.compose.runtime;

import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DerivedState.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H&J\u0014\u0010\u0006\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m7105d2 = {"Landroidx/compose/runtime/DerivedStateObserver;", "", "done", "", "derivedState", "Landroidx/compose/runtime/DerivedState;", TtmlNode.START, "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public interface DerivedStateObserver {
    void done(@NotNull DerivedState<?> derivedState);

    void start(@NotNull DerivedState<?> derivedState);
}
