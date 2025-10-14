package com.blackhub.bronline.game.repository;

import com.blackhub.bronline.game.model.local.AppConfigModel;
import com.blackhub.bronline.game.model.remote.response.app.AppVersionResponse;
import com.blackhub.bronline.game.repository.base.Repository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* compiled from: LauncherRepository.kt */
/* loaded from: classes3.dex */
public interface LauncherRepository extends Repository {
    @Nullable
    Object getAppConfig(@NotNull Continuation<? super Unit> continuation);

    @NotNull
    StateFlow<AppConfigModel> getAppConfig();

    @Nullable
    Object getRemoteAppVersion(@NotNull Continuation<? super Response<AppVersionResponse>> continuation);

    @NotNull
    MutableStateFlow<AppConfigModel> get_appConfig();
}

