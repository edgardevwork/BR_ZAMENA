package coil.key;

import android.net.Uri;
import androidx.media3.datasource.DefaultDataSource;
import coil.request.Options;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UriKeyer.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m7105d2 = {"Lcoil/key/UriKeyer;", "Lcoil/key/Keyer;", "Landroid/net/Uri;", "()V", "key", "", "data", "options", "Lcoil/request/Options;", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class UriKeyer implements Keyer<Uri> {
    @Override // coil.key.Keyer
    @NotNull
    public String key(@NotNull Uri data, @NotNull Options options) {
        if (Intrinsics.areEqual(data.getScheme(), DefaultDataSource.SCHEME_ANDROID_RESOURCE)) {
            StringBuilder sb = new StringBuilder();
            sb.append(data);
            sb.append('-');
            sb.append(Utils.getNightMode(options.getContext().getResources().getConfiguration()));
            return sb.toString();
        }
        return data.toString();
    }
}
