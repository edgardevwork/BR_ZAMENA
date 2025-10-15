package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.Bundleable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* loaded from: classes3.dex */
public abstract class Rating implements Bundleable {
    public static final int RATING_TYPE_HEART = 0;
    public static final int RATING_TYPE_PERCENTAGE = 1;
    public static final int RATING_TYPE_STAR = 2;
    public static final int RATING_TYPE_THUMB = 3;
    public static final int RATING_TYPE_UNSET = -1;
    public static final float RATING_UNSET = -1.0f;
    public static final String FIELD_RATING_TYPE = Util.intToStringMaxRadix(0);

    @UnstableApi
    @Deprecated
    public static final Bundleable.Creator<Rating> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.Rating$$ExternalSyntheticLambda0
        @Override // androidx.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return Rating.fromBundle(bundle);
        }
    };

    public abstract boolean isRated();

    @UnstableApi
    public static Rating fromBundle(Bundle bundle) {
        int i = bundle.getInt(FIELD_RATING_TYPE, -1);
        if (i == 0) {
            return HeartRating.fromBundle(bundle);
        }
        if (i == 1) {
            return PercentageRating.fromBundle(bundle);
        }
        if (i == 2) {
            return StarRating.fromBundle(bundle);
        }
        if (i == 3) {
            return ThumbRating.fromBundle(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i);
    }
}
