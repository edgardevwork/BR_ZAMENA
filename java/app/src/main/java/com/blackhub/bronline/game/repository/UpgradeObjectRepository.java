package com.blackhub.bronline.game.repository;

import com.blackhub.bronline.game.model.remote.response.upgradeobjectevent.UpgradeObjectAwardsResponse;
import com.blackhub.bronline.game.repository.base.Repository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* compiled from: UpgradeObjectRepository.kt */
/* loaded from: classes3.dex */
public interface UpgradeObjectRepository extends Repository {
    @Nullable
    Object getNewYearAwards(@NotNull Continuation<? super Response<UpgradeObjectAwardsResponse>> continuation);
}

