package io.appmetrica.analytics.coreapi.internal.system;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m7105d2 = {"Lio/appmetrica/analytics/coreapi/internal/system/PermissionExtractor;", "", "hasPermission", "", "context", "Landroid/content/Context;", "permission", "", "core-api_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface PermissionExtractor {
    boolean hasPermission(@NotNull Context context, @NotNull String permission);
}
