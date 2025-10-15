package com.blackhub.bronline.game.repository.impl;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.model.remote.response.upgradeobjectevent.UpgradeObjectAwardsResponse;
import com.blackhub.bronline.game.repository.UpgradeObjectRepository;
import com.blackhub.bronline.game.sources.remote.UpgradeObjectEventDataSource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* compiled from: UpgradeObjectRepositoryImpl.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/repository/impl/UpgradeObjectRepositoryImpl;", "Lcom/blackhub/bronline/game/repository/UpgradeObjectRepository;", "upgradeObjectEventDataSource", "Lcom/blackhub/bronline/game/sources/remote/UpgradeObjectEventDataSource;", "(Lcom/blackhub/bronline/game/sources/remote/UpgradeObjectEventDataSource;)V", "getNewYearAwards", "Lretrofit2/Response;", "Lcom/blackhub/bronline/game/model/remote/response/upgradeobjectevent/UpgradeObjectAwardsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class UpgradeObjectRepositoryImpl implements UpgradeObjectRepository {
    public static final int $stable = 8;

    @NotNull
    public final UpgradeObjectEventDataSource upgradeObjectEventDataSource;

    @Inject
    public UpgradeObjectRepositoryImpl(@NotNull UpgradeObjectEventDataSource upgradeObjectEventDataSource) {
        Intrinsics.checkNotNullParameter(upgradeObjectEventDataSource, "upgradeObjectEventDataSource");
        this.upgradeObjectEventDataSource = upgradeObjectEventDataSource;
    }

    @Override // com.blackhub.bronline.game.repository.UpgradeObjectRepository
    @Nullable
    public Object getNewYearAwards(@NotNull Continuation<? super Response<UpgradeObjectAwardsResponse>> continuation) {
        return this.upgradeObjectEventDataSource.getNewYearAwards(continuation);
    }
}
