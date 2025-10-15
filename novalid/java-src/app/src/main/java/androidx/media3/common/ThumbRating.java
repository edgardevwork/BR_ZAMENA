package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.Bundleable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Objects;

/* loaded from: classes4.dex */
public final class ThumbRating extends Rating {
    public static final int TYPE = 3;
    public final boolean isThumbsUp;
    public final boolean rated;
    public static final String FIELD_RATED = Util.intToStringMaxRadix(1);
    public static final String FIELD_IS_THUMBS_UP = Util.intToStringMaxRadix(2);

    @UnstableApi
    @Deprecated
    public static final Bundleable.Creator<ThumbRating> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.ThumbRating$$ExternalSyntheticLambda0
        @Override // androidx.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return ThumbRating.fromBundle(bundle);
        }
    };

    public ThumbRating() {
        this.rated = false;
        this.isThumbsUp = false;
    }

    public ThumbRating(boolean z) {
        this.rated = true;
        this.isThumbsUp = z;
    }

    @Override // androidx.media3.common.Rating
    public boolean isRated() {
        return this.rated;
    }

    public boolean isThumbsUp() {
        return this.isThumbsUp;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.rated), Boolean.valueOf(this.isThumbsUp));
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ThumbRating)) {
            return false;
        }
        ThumbRating thumbRating = (ThumbRating) obj;
        return this.isThumbsUp == thumbRating.isThumbsUp && this.rated == thumbRating.rated;
    }

    @Override // androidx.media3.common.Bundleable
    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Rating.FIELD_RATING_TYPE, 3);
        bundle.putBoolean(FIELD_RATED, this.rated);
        bundle.putBoolean(FIELD_IS_THUMBS_UP, this.isThumbsUp);
        return bundle;
    }

    @UnstableApi
    public static ThumbRating fromBundle(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(Rating.FIELD_RATING_TYPE, -1) == 3);
        if (bundle.getBoolean(FIELD_RATED, false)) {
            return new ThumbRating(bundle.getBoolean(FIELD_IS_THUMBS_UP, false));
        }
        return new ThumbRating();
    }
}
