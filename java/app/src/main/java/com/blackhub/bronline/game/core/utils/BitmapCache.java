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

