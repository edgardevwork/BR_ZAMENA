package com.blackhub.bronline.game.sources.remote;

import com.blackhub.bronline.game.model.remote.response.upgradeobjectevent.UpgradeObjectAwardsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* compiled from: UpgradeObjectEventDataSource.kt */
/* loaded from: classes.dex */
public interface UpgradeObjectEventDataSource {
    @Nullable
    Object getNewYearAwards(@NotNull Continuation<? super Response<UpgradeObjectAwardsResponse>> continuation);
}

