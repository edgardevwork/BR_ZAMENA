package ru.rustore.sdk.review.errors;

import kotlin.Metadata;
import ru.rustore.sdk.core.exception.RuStoreException;

@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lru/rustore/sdk/review/errors/RuStoreInvalidReviewInfo;", "Lru/rustore/sdk/core/exception/RuStoreException;", "()V", "sdk-public-review_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class RuStoreInvalidReviewInfo extends RuStoreException {
    public RuStoreInvalidReviewInfo() {
        super("Review can't be started with the passed ReviewInfo instance");
    }
}
