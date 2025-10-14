package androidx.media3.common;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes4.dex */
public interface AdViewProvider {
    @Nullable
    ViewGroup getAdViewGroup();

    default List<AdOverlayInfo> getAdOverlayInfos() {
        return ImmutableList.m1171of();
    }
}
