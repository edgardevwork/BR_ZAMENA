package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.rating.RatingActionWithJson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideRatingActionWithJsonFactory implements Factory<RatingActionWithJson> {
    public final NetworkModule module;

    public NetworkModule_ProvideRatingActionWithJsonFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public RatingActionWithJson get() {
        return provideRatingActionWithJson(this.module);
    }

    public static NetworkModule_ProvideRatingActionWithJsonFactory create(NetworkModule module) {
        return new NetworkModule_ProvideRatingActionWithJsonFactory(module);
    }

    public static RatingActionWithJson provideRatingActionWithJson(NetworkModule instance) {
        return (RatingActionWithJson) Preconditions.checkNotNullFromProvides(instance.provideRatingActionWithJson());
    }
}
