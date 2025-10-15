package androidx.window.layout;

import androidx.annotation.RestrictTo;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowMetricsCalculator.kt */
@ExperimentalWindowApi
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H'¨\u0006\u0005"}, m7105d2 = {"Landroidx/window/layout/WindowMetricsCalculatorDecorator;", "", "decorate", "Landroidx/window/layout/WindowMetricsCalculator;", "calculator", "window_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
@RestrictTo({RestrictTo.Scope.TESTS})
/* loaded from: classes4.dex */
public interface WindowMetricsCalculatorDecorator {
    @ExperimentalWindowApi
    @RestrictTo({RestrictTo.Scope.TESTS})
    @NotNull
    WindowMetricsCalculator decorate(@NotNull WindowMetricsCalculator calculator);
}
