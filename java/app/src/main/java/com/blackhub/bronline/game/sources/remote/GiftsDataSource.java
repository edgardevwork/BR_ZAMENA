package com.blackhub.bronline.game.sources.remote;

import com.blackhub.bronline.game.model.remote.response.gifts.GiftsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* compiled from: GiftsDataSource.kt */
/* loaded from: classes.dex */
public interface GiftsDataSource {
    @Nullable
    Object getGifts(@NotNull Continuation<? super Response<GiftsResponse>> continuation);
}

