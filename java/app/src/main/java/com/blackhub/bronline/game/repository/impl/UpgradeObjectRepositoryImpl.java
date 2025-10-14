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

