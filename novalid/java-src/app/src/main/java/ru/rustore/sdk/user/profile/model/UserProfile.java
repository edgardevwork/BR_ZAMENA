package ru.rustore.sdk.user.profile.model;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.ivy.osgi.core.BundleInfo;
import org.jetbrains.annotations.NotNull;

/* compiled from: UserProfile.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\f"}, m7105d2 = {"Lru/rustore/sdk/user/profile/model/UserProfile;", "", BundleInfo.BUNDLE_TYPE, "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", UserProfile.KEY_USER_ID, "", "getUserId", "()J", UserProfile.KEY_VK_ID, "getVkId", "Companion", "sdk-public-user-profile_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class UserProfile {

    @Deprecated
    @NotNull
    public static final String KEY_USER_ID = "userId";

    @Deprecated
    @NotNull
    public static final String KEY_VK_ID = "vkId";

    @NotNull
    public final Bundle bundle;

    public UserProfile(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.bundle = bundle;
    }

    public final long getUserId() {
        return this.bundle.getLong(KEY_USER_ID);
    }

    public final long getVkId() {
        return this.bundle.getLong(KEY_VK_ID);
    }
}
