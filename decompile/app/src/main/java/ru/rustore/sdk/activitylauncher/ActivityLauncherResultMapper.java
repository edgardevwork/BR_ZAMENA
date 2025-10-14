package ru.rustore.sdk.activitylauncher;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.activitylauncher.ActivityLauncherResult;

/* compiled from: ActivityLauncherResultMapper.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m7105d2 = {"Lru/rustore/sdk/activitylauncher/ActivityLauncherResultMapper;", "", "()V", "toActivityLauncherResult", "Lru/rustore/sdk/activitylauncher/ActivityLauncherResult;", "resultCode", "", "sdk-public-activitylauncher_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class ActivityLauncherResultMapper {
    @NotNull
    public final ActivityLauncherResult toActivityLauncherResult(int resultCode) {
        if (resultCode == -1) {
            return ActivityLauncherResult.ActivityResultOk.INSTANCE;
        }
        if (resultCode == 0) {
            return ActivityLauncherResult.ActivityResultCanceled.INSTANCE;
        }
        if (resultCode == 2) {
            return ActivityLauncherResult.ActivityNotFound.INSTANCE;
        }
        if (resultCode == 9901) {
            return ActivityLauncherResult.ActivitySendIntentError.INSTANCE;
        }
        if (resultCode == 9902) {
            return ActivityLauncherResult.ActivityUnknownError.INSTANCE;
        }
        return new ActivityLauncherResult.ActivityResultUnknown(resultCode);
    }
}
