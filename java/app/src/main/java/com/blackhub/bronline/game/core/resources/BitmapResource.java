package com.blackhub.bronline.game.core.resources;

import android.graphics.Bitmap;
import androidx.annotation.DrawableRes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: BitmapResource.kt */
/* loaded from: classes2.dex */
public interface BitmapResource extends BaseResource {
    @NotNull
    Bitmap getBitmap(@DrawableRes int drawableId);
}

