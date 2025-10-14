package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
@Deprecated
/* loaded from: classes4.dex */
public interface Bundleable {

    @Deprecated
    public interface Creator<T extends Bundleable> {
        T fromBundle(Bundle bundle);
    }

    Bundle toBundle();
}
