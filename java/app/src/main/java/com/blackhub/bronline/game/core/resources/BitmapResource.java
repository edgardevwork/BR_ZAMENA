package com.blackhub.bronline.game.core.resources;

import android.graphics.Bitmap;
import androidx.annotation.DrawableRes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: BitmapResource.kt */

public interface BitmapResource extends BaseResource {
    @NotNull
    Bitmap getBitmap(@DrawableRes int drawableId);
}

