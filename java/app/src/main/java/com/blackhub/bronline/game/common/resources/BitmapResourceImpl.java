package com.blackhub.bronline.game.common.resources;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.resources.BitmapResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BitmapResourceImpl.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class BitmapResourceImpl implements BitmapResource {
    public static final int $stable = 8;

    @NotNull
    public WeakReference<Context> contextRef = new WeakReference<>(null);

    public final Context getContext() {
        Context context = this.contextRef.get();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // com.blackhub.bronline.game.core.resources.BitmapResource
    @NotNull
    public Bitmap getBitmap(@DrawableRes int drawableId) {
        Resources resources = getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return BitmapUtilsKt.getBitmap(resources, drawableId);
    }

    @NotNull
    public final BitmapResourceImpl setupContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.contextRef.clear();
        this.contextRef = new WeakReference<>(context);
        return this;
    }
}

