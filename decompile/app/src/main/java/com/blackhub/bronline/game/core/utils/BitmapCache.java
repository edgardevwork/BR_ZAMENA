package com.blackhub.bronline.game.core.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BitmapUtils.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/BitmapCache;", "", "()V", "cache", "Landroid/util/LruCache;", "", "Landroid/graphics/Bitmap;", "getBitmap", "key", "initialize", "", "context", "Landroid/content/Context;", "putBitmap", "bitmap", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class BitmapCache {
    public static LruCache<String, Bitmap> cache;

    @NotNull
    public static final BitmapCache INSTANCE = new BitmapCache();
    public static final int $stable = 8;

    public final void initialize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        cache = new LruCache<>((((ActivityManager) systemService).getMemoryClass() / 8) * 1048576);
    }

    @Nullable
    public final Bitmap getBitmap(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        LruCache<String, Bitmap> lruCache = cache;
        if (lruCache == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cache");
            lruCache = null;
        }
        return lruCache.get(key);
    }

    public final void putBitmap(@NotNull String key, @Nullable Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(key, "key");
        LruCache<String, Bitmap> lruCache = cache;
        if (lruCache == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cache");
            lruCache = null;
        }
        lruCache.put(key, bitmap);
    }
}
