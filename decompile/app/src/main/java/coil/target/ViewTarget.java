package coil.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewTarget.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, m7105d2 = {"Lcoil/target/ViewTarget;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "Lcoil/target/Target;", SVG.View.NODE_NAME, "getView", "()Landroid/view/View;", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public interface ViewTarget<T extends View> extends Target {
    @NotNull
    T getView();

    /* compiled from: ViewTarget.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @MainThread
        @Deprecated
        public static <T extends View> void onError(@NotNull ViewTarget<T> viewTarget, @Nullable Drawable drawable) {
            ViewTarget.super.onError(drawable);
        }

        @MainThread
        @Deprecated
        public static <T extends View> void onStart(@NotNull ViewTarget<T> viewTarget, @Nullable Drawable drawable) {
            ViewTarget.super.onStart(drawable);
        }

        @MainThread
        @Deprecated
        public static <T extends View> void onSuccess(@NotNull ViewTarget<T> viewTarget, @NotNull Drawable drawable) {
            ViewTarget.super.onSuccess(drawable);
        }
    }
}
