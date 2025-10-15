package io.appmetrica.analytics.coreutils.internal.asserts;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0007"}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/asserts/DebugAssert;", "", "value", "", "errorMessage", "", "assertNotNull", "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class DebugAssert {

    @NotNull
    public static final DebugAssert INSTANCE = new DebugAssert();

    private DebugAssert() {
    }

    @JvmStatic
    public static final void assertNotNull(@Nullable Object value, @NotNull String errorMessage) {
    }
}
