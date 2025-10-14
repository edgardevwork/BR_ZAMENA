package coil.util;

import android.content.Context;
import android.view.View;
import coil.request.ImageResult;
import com.caverock.androidsvg.SVG;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import okhttp3.Cache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoilUtils.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m7105d2 = {"Lcoil/util/CoilUtils;", "", "()V", "createDefaultCache", "Lokhttp3/Cache;", "context", "Landroid/content/Context;", "dispose", "", SVG.View.NODE_NAME, "Landroid/view/View;", "result", "Lcoil/request/ImageResult;", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class CoilUtils {

    @NotNull
    public static final CoilUtils INSTANCE = new CoilUtils();

    @JvmStatic
    public static final void dispose(@NotNull View view) {
        Utils.getRequestManager(view).dispose();
    }

    @JvmStatic
    @Nullable
    public static final ImageResult result(@NotNull View view) {
        return Utils.getRequestManager(view).getResult();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "ImageLoaders no longer (and should not) use OkHttp's disk cache. Use 'ImageLoader.Builder.diskCache' to configure a custom disk cache.")
    @JvmStatic
    @NotNull
    public static final Cache createDefaultCache(@NotNull Context context) {
        Utils.unsupported();
        throw new KotlinNothingValueException();
    }
}
