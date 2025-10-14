package androidx.window.layout;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowBackend.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¨\u0006\f"}, m7105d2 = {"Landroidx/window/layout/WindowBackend;", "", "registerLayoutChangeCallback", "", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "executor", "Ljava/util/concurrent/Executor;", "callback", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "unregisterLayoutChangeCallback", "window_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface WindowBackend {
    void registerLayoutChangeCallback(@NotNull Activity activity, @NotNull Executor executor, @NotNull Consumer<WindowLayoutInfo> callback);

    void unregisterLayoutChangeCallback(@NotNull Consumer<WindowLayoutInfo> callback);
}
