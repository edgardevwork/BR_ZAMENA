package com.blackhub.bronline.game.sources.remote;

import com.blackhub.bronline.game.model.remote.response.app.AppConfigResponse;
import com.blackhub.bronline.game.model.remote.response.app.AppVersionResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* compiled from: LauncherDataSource.kt */
/* loaded from: classes.dex */
public interface LauncherDataSource {
    @Nullable
    Object getAppConfigResponse(@NotNull Continuation<? super Response<AppConfigResponse>> continuation);

    @Nullable
    Object getRemoteAppVersion(@NotNull Continuation<? super Response<AppVersionResponse>> continuation);
}

