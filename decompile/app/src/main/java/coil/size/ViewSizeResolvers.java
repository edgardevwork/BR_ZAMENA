package coil.size;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewSizeResolver.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m7105d2 = {"ViewSizeResolver", "Lcoil/size/ViewSizeResolver;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", SVG.View.NODE_NAME, "subtractPadding", "", "create", "(Landroid/view/View;Z)Lcoil/size/ViewSizeResolver;", "coil-base_release"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@JvmName(name = "ViewSizeResolvers")
/* loaded from: classes4.dex */
public final class ViewSizeResolvers {
    @JvmOverloads
    @JvmName(name = "create")
    @NotNull
    public static final <T extends View> ViewSizeResolver<T> create(@NotNull T t) {
        return create$default(t, false, 2, null);
    }

    public static /* synthetic */ ViewSizeResolver create$default(View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return create(view, z);
    }

    @JvmOverloads
    @JvmName(name = "create")
    @NotNull
    public static final <T extends View> ViewSizeResolver<T> create(@NotNull T t, boolean z) {
        return new RealViewSizeResolver(t, z);
    }
}
