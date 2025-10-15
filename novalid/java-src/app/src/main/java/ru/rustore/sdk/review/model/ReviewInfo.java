package ru.rustore.sdk.review.model;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.ivy.osgi.core.BundleInfo;

@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\n\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u000bJ\u0014\u0010\f\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m7105d2 = {"Lru/rustore/sdk/review/model/ReviewInfo;", "", BundleInfo.BUNDLE_TYPE, "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "appDescription", "", "appIconUrl", "appName", "sessionId", "toBundle", "toBundle$sdk_public_review_release", "getStringOrEmpty", "key", "Companion", "sdk-public-review_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class ReviewInfo {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_APP_DESCRIPTION = "KEY_APP_DESCRIPTION";

    @Deprecated
    public static final String KEY_APP_ICON_URL = "KEY_APP_ICON_URL";

    @Deprecated
    public static final String KEY_APP_NAME = "KEY_APP_NAME";

    @Deprecated
    public static final String KEY_SESSION_ID = "KEY_SESSION_ID";
    private final String appDescription;
    private final String appIconUrl;
    private final String appName;
    private final String sessionId;

    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m7105d2 = {"Lru/rustore/sdk/review/model/ReviewInfo$Companion;", "", "()V", ReviewInfo.KEY_APP_DESCRIPTION, "", ReviewInfo.KEY_APP_ICON_URL, ReviewInfo.KEY_APP_NAME, ReviewInfo.KEY_SESSION_ID, "sdk-public-review_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ReviewInfo(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.sessionId = getStringOrEmpty(bundle, KEY_SESSION_ID);
        this.appName = getStringOrEmpty(bundle, KEY_APP_NAME);
        this.appDescription = getStringOrEmpty(bundle, KEY_APP_DESCRIPTION);
        this.appIconUrl = getStringOrEmpty(bundle, KEY_APP_ICON_URL);
    }

    private final String getStringOrEmpty(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? "" : string;
    }

    public final Bundle toBundle$sdk_public_review_release() {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_SESSION_ID, this.sessionId);
        bundle.putString(KEY_APP_NAME, this.appName);
        bundle.putString(KEY_APP_DESCRIPTION, this.appDescription);
        bundle.putString(KEY_APP_ICON_URL, this.appIconUrl);
        return bundle;
    }
}
