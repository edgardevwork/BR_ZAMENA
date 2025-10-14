package com.blackhub.bronline.game.gui.fractions;

import android.app.Activity;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.appcompat.widget.ActivityChooserModel;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.gui.fractions.data.FractionsShopItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FractionsUtils.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001aN\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f¨\u0006\u0010"}, m7105d2 = {"renderShopItem", "", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "id", "", "modelId", "thisObject", "Landroid/widget/ImageView;", "thisItem", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsShopItem;", "rotX", "", "rotY", "rotZ", "zoom", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class FractionsUtilsKt {
    public static final void renderShopItem(@NotNull final Activity activity, int i, int i2, @NotNull final ImageView thisObject, @NotNull final FractionsShopItem thisItem) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(thisObject, "thisObject");
        Intrinsics.checkNotNullParameter(thisItem, "thisItem");
        GameRender.getInstance().RequestRender(0, i, i2, 3, 3, 20.0f, 180.0f, 0.0f, 0.8f, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.gui.fractions.FractionsUtilsKt$$ExternalSyntheticLambda3
            @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
            public final void OnRenderComplete(int i3, Bitmap bitmap) {
                FractionsUtilsKt.renderShopItem$lambda$3(activity, thisObject, thisItem, i3, bitmap);
            }
        });
    }

    public static final void renderShopItem$lambda$3(Activity activity, final ImageView thisObject, final FractionsShopItem thisItem, int i, final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(thisObject, "$thisObject");
        Intrinsics.checkNotNullParameter(thisItem, "$thisItem");
        activity.runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.gui.fractions.FractionsUtilsKt$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                FractionsUtilsKt.renderShopItem$lambda$3$lambda$2$lambda$1(thisObject, bitmap, thisItem);
            }
        });
    }

    public static final void renderShopItem$lambda$3$lambda$2$lambda$1(ImageView thisObject, Bitmap bitmap, FractionsShopItem thisItem) {
        Intrinsics.checkNotNullParameter(thisObject, "$thisObject");
        Intrinsics.checkNotNullParameter(thisItem, "$thisItem");
        thisObject.setImageBitmap(bitmap);
        thisItem.setRender(bitmap);
    }

    public static final void renderShopItem(@NotNull final Activity activity, int i, int i2, @NotNull final ImageView thisObject, @NotNull final FractionsShopItem thisItem, float f, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(thisObject, "thisObject");
        Intrinsics.checkNotNullParameter(thisItem, "thisItem");
        GameRender.getInstance().RequestRender(0, i, i2, 3, 3, f, f2, f3, f4, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.gui.fractions.FractionsUtilsKt$$ExternalSyntheticLambda0
            @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
            public final void OnRenderComplete(int i3, Bitmap bitmap) {
                FractionsUtilsKt.renderShopItem$lambda$7(activity, thisObject, thisItem, i3, bitmap);
            }
        });
    }

    public static final void renderShopItem$lambda$7(Activity activity, final ImageView thisObject, final FractionsShopItem thisItem, int i, final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(thisObject, "$thisObject");
        Intrinsics.checkNotNullParameter(thisItem, "$thisItem");
        activity.runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.gui.fractions.FractionsUtilsKt$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                FractionsUtilsKt.renderShopItem$lambda$7$lambda$6$lambda$5(thisObject, bitmap, thisItem);
            }
        });
    }

    public static final void renderShopItem$lambda$7$lambda$6$lambda$5(ImageView thisObject, Bitmap bitmap, FractionsShopItem thisItem) {
        Intrinsics.checkNotNullParameter(thisObject, "$thisObject");
        Intrinsics.checkNotNullParameter(thisItem, "$thisItem");
        thisObject.setImageBitmap(bitmap);
        thisItem.setRender(bitmap);
    }
}
