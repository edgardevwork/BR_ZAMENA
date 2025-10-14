package com.blackhub.bronline.game.repository;

import com.blackhub.bronline.game.model.remote.response.upgradeobjectevent.UpgradeObjectAwardsResponse;
import com.blackhub.bronline.game.repository.base.Repository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* compiled from: UpgradeObjectRepository.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/repository/UpgradeObjectRepository;", "Lcom/blackhub/bronline/game/repository/base/Repository;", "getNewYearAwards", "Lretrofit2/Response;", "Lcom/blackhub/bronline/game/model/remote/response/upgradeobjectevent/UpgradeObjectAwardsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface UpgradeObjectRepository extends Repository {
    @Nullable
    Object getNewYearAwards(@NotNull Continuation<? super Response<UpgradeObjectAwardsResponse>> continuation);
}
