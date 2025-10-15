package coil.decode;

import androidx.annotation.DrawableRes;
import coil.annotation.ExperimentalCoilApi;
import coil.decode.ImageSource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImageSource.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, m7105d2 = {"Lcoil/decode/ResourceMetadata;", "Lcoil/decode/ImageSource$Metadata;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "resId", "", "density", "(Ljava/lang/String;II)V", "getDensity", "()I", "getPackageName", "()Ljava/lang/String;", "getResId", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@ExperimentalCoilApi
/* loaded from: classes3.dex */
public final class ResourceMetadata extends ImageSource.Metadata {
    public final int density;

    @NotNull
    public final String packageName;
    public final int resId;

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public final int getResId() {
        return this.resId;
    }

    public final int getDensity() {
        return this.density;
    }

    public ResourceMetadata(@NotNull String str, @DrawableRes int i, int i2) {
        this.packageName = str;
        this.resId = i;
        this.density = i2;
    }
}
