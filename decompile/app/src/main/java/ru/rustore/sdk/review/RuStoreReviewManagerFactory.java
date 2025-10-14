package ru.rustore.sdk.review;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bH\u0007¨\u0006\n"}, m7105d2 = {"Lru/rustore/sdk/review/RuStoreReviewManagerFactory;", "", "()V", "create", "Lru/rustore/sdk/review/RuStoreReviewManager;", "context", "Landroid/content/Context;", "internalConfig", "", "", "sdk-public-review_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class RuStoreReviewManagerFactory {
    public static final RuStoreReviewManagerFactory INSTANCE = new RuStoreReviewManagerFactory();

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RuStoreReviewManager create$default(RuStoreReviewManagerFactory ruStoreReviewManagerFactory, Context context, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return ruStoreReviewManagerFactory.create(context, map);
    }

    public final RuStoreReviewManager create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return create$default(this, context, null, 2, null);
    }

    public final RuStoreReviewManager create(Context context, Map<String, ? extends Object> internalConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        return new RuStoreReviewManager(applicationContext, internalConfig);
    }
}
