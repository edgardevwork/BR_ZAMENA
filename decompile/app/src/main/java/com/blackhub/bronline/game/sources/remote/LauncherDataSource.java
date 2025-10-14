package com.blackhub.bronline.game.sources.remote;

import com.blackhub.bronline.game.model.remote.response.app.AppConfigResponse;
import com.blackhub.bronline.game.model.remote.response.app.AppVersionResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* compiled from: LauncherDataSource.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H¦@¢\u0006\u0002\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/sources/remote/LauncherDataSource;", "", "getAppConfigResponse", "Lretrofit2/Response;", "Lcom/blackhub/bronline/game/model/remote/response/app/AppConfigResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemoteAppVersion", "Lcom/blackhub/bronline/game/model/remote/response/app/AppVersionResponse;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public interface LauncherDataSource {
    @Nullable
    Object getAppConfigResponse(@NotNull Continuation<? super Response<AppConfigResponse>> continuation);

    @Nullable
    Object getRemoteAppVersion(@NotNull Continuation<? super Response<AppVersionResponse>> continuation);
}
