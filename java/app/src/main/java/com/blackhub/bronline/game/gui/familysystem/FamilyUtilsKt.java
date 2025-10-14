package com.blackhub.bronline.game.gui.familysystem;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.JNIActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FamilyUtils.kt */
/* loaded from: classes3.dex */
public final class FamilyUtilsKt {
    public static final void renderShopItem(int i, final int i2, @NotNull final ImageView thisObject, @NotNull final ArrayMap<Integer, Bitmap> renderItem, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(thisObject, "thisObject");
        Intrinsics.checkNotNullParameter(renderItem, "renderItem");
        GameRender.getInstance().RequestRender(0, i, i2, 3, 3, f, f2, f3, 0.9f, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.gui.familysystem.FamilyUtilsKt$$ExternalSyntheticLambda0
            @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
            public final void OnRenderComplete(int i3, Bitmap bitmap) {
                FamilyUtilsKt.renderShopItem$lambda$3(thisObject, renderItem, i2, i3, bitmap);
            }
        });
    }

    public static final void renderShopItem$lambda$3(final ImageView thisObject, final ArrayMap renderItem, final int i, int i2, final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(thisObject, "$thisObject");
        Intrinsics.checkNotNullParameter(renderItem, "$renderItem");
        JNIActivity.getContext().runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.gui.familysystem.FamilyUtilsKt$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                FamilyUtilsKt.renderShopItem$lambda$3$lambda$2$lambda$1(thisObject, bitmap, renderItem, i);
            }
        });
    }

    public static final void renderShopItem$lambda$3$lambda$2$lambda$1(ImageView thisObject, Bitmap bitmap, ArrayMap renderItem, int i) {
        Intrinsics.checkNotNullParameter(thisObject, "$thisObject");
        Intrinsics.checkNotNullParameter(renderItem, "$renderItem");
        thisObject.setImageBitmap(bitmap);
        renderItem.put(Integer.valueOf(i), bitmap);
    }
}

