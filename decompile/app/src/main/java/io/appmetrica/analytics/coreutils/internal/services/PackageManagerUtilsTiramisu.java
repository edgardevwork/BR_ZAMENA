package io.appmetrica.analytics.coreutils.internal.services;

import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import kotlin.Metadata;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DoNotInline
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/PackageManagerUtilsTiramisu;", "", "Landroid/content/pm/PackageManager;", "packageManager", "", "uri", "Landroid/content/pm/ProviderInfo;", "resolveContentProvider", "a", "Ljava/lang/String;", "tag", SegmentConstantPool.INITSTRING, "()V", "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0})
@TargetApi(33)
/* loaded from: classes7.dex */
public final class PackageManagerUtilsTiramisu {

    @NotNull
    public static final PackageManagerUtilsTiramisu INSTANCE = new PackageManagerUtilsTiramisu();

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String tag = "[PackageManagerUtilsTiramisu]";

    private PackageManagerUtilsTiramisu() {
    }

    @Nullable
    public final ProviderInfo resolveContentProvider(@NotNull PackageManager packageManager, @NotNull String uri) {
        try {
            return packageManager.resolveContentProvider(uri, PackageManager.ComponentInfoFlags.of(8L));
        } catch (Throwable unused) {
            return null;
        }
    }
}
