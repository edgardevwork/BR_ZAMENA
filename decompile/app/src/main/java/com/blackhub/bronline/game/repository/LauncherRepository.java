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
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\t\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH¦@¢\u0006\u0002\u0010\fR\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/repository/LauncherRepository;", "Lcom/blackhub/bronline/game/repository/base/Repository;", "_appConfig", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/blackhub/bronline/game/model/local/AppConfigModel;", "get_appConfig", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "appConfig", "Lkotlinx/coroutines/flow/StateFlow;", "getAppConfig", "()Lkotlinx/coroutines/flow/StateFlow;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemoteAppVersion", "Lretrofit2/Response;", "Lcom/blackhub/bronline/game/model/remote/response/app/AppVersionResponse;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
