package com.blackhub.bronline.game.repository;

import com.blackhub.bronline.game.model.remote.response.gifts.GiftsResponse;
import com.blackhub.bronline.game.repository.base.Repository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* compiled from: GiftsRepository.kt */
/* loaded from: classes3.dex */
public interface GiftsRepository extends Repository {
    @Nullable
    Object getGifts(@NotNull Continuation<? super Response<GiftsResponse>> continuation);
}

