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
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/resources/BitmapResourceImpl;", "Lcom/blackhub/bronline/game/core/resources/BitmapResource;", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "contextRef", "Ljava/lang/ref/WeakReference;", "getBitmap", "Landroid/graphics/Bitmap;", "drawableId", "", "setupContext", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
