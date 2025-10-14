package com.blackhub.bronline.game.repository.impl;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.model.remote.response.gifts.GiftsResponse;
import com.blackhub.bronline.game.repository.GiftsRepository;
import com.blackhub.bronline.game.sources.remote.GiftsDataSource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* compiled from: GiftsRepositoryImpl.kt */
@StabilityInferred(parameters = 0)

public final class GiftsRepositoryImpl implements GiftsRepository {
    public static final int $stable = 8;

    @NotNull
    public final GiftsDataSource giftsDataSource;

    @Inject
    public GiftsRepositoryImpl(@NotNull GiftsDataSource giftsDataSource) {
        Intrinsics.checkNotNullParameter(giftsDataSource, "giftsDataSource");
        this.giftsDataSource = giftsDataSource;
    }

    @Override // com.blackhub.bronline.game.repository.GiftsRepository
    @Nullable
    public Object getGifts(@NotNull Continuation<? super Response<GiftsResponse>> continuation) {
        return this.giftsDataSource.getGifts(continuation);
    }
}

