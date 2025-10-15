package ru.rustore.sdk.appupdate.manager;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.listener.InstallStateUpdateListener;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import ru.rustore.sdk.appupdate.model.AppUpdateOptions;
import ru.rustore.sdk.core.tasks.Task;

@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\u0010"}, m7105d2 = {"Lru/rustore/sdk/appupdate/manager/RuStoreAppUpdateManager;", "", "completeUpdate", "Lru/rustore/sdk/core/tasks/Task;", "", "appUpdateOptions", "Lru/rustore/sdk/appupdate/model/AppUpdateOptions;", "getAppUpdateInfo", "Lru/rustore/sdk/appupdate/model/AppUpdateInfo;", "registerListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/rustore/sdk/appupdate/listener/InstallStateUpdateListener;", "startUpdateFlow", "", "appUpdateInfo", "unregisterListener", "sdk-public-appupdate_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface RuStoreAppUpdateManager {
    @NotNull
    Task<Unit> completeUpdate(@NotNull AppUpdateOptions appUpdateOptions);

    @NotNull
    Task<AppUpdateInfo> getAppUpdateInfo();

    void registerListener(@NotNull InstallStateUpdateListener listener);

    @NotNull
    Task<Integer> startUpdateFlow(@NotNull AppUpdateInfo appUpdateInfo, @NotNull AppUpdateOptions appUpdateOptions);

    void unregisterListener(@NotNull InstallStateUpdateListener listener);
}
