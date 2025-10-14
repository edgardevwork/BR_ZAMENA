package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.drivingschool.network.DrivingSchoolActionsWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideDrivingSchoolActionWithJSONFactory implements Factory<DrivingSchoolActionsWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideDrivingSchoolActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public DrivingSchoolActionsWithJSON get() {
        return provideDrivingSchoolActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideDrivingSchoolActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideDrivingSchoolActionWithJSONFactory(module);
    }

    public static DrivingSchoolActionsWithJSON provideDrivingSchoolActionWithJSON(NetworkModule instance) {
        return (DrivingSchoolActionsWithJSON) Preconditions.checkNotNullFromProvides(instance.provideDrivingSchoolActionWithJSON());
    }
}
