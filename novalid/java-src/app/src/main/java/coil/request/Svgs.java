package coil.request;

import coil.decode.SvgDecoder;
import coil.request.ImageRequest;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Svgs.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0002*\u00020\u0003¨\u0006\u0004"}, m7105d2 = {"css", "Lcoil/request/ImageRequest$Builder;", "", "Lcoil/request/Parameters;", "coil-svg_release"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@JvmName(name = "Svgs")
/* loaded from: classes2.dex */
public final class Svgs {
    @NotNull
    public static final ImageRequest.Builder css(@NotNull ImageRequest.Builder builder, @NotNull String str) {
        return ImageRequest.Builder.setParameter$default(builder, SvgDecoder.CSS_KEY, str, null, 4, null);
    }

    @Nullable
    public static final String css(@NotNull Parameters parameters) {
        return (String) parameters.value(SvgDecoder.CSS_KEY);
    }
}
