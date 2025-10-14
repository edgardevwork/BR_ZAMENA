package com.blackhub.bronline.game.gui.drivingschool.viewmodel;

import com.blackhub.bronline.game.gui.drivingschool.network.DrivingSchoolActionsWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class DrivingSchoolViewModel_Factory implements Factory<DrivingSchoolViewModel> {
    public final Provider<DrivingSchoolActionsWithJSON> actionsWithJsonProvider;

    public DrivingSchoolViewModel_Factory(Provider<DrivingSchoolActionsWithJSON> actionsWithJsonProvider) {
        this.actionsWithJsonProvider = actionsWithJsonProvider;
    }

    @Override // javax.inject.Provider
    public DrivingSchoolViewModel get() {
        return newInstance(this.actionsWithJsonProvider.get());
    }

    public static DrivingSchoolViewModel_Factory create(Provider<DrivingSchoolActionsWithJSON> actionsWithJsonProvider) {
        return new DrivingSchoolViewModel_Factory(actionsWithJsonProvider);
    }

    public static DrivingSchoolViewModel newInstance(DrivingSchoolActionsWithJSON actionsWithJson) {
        return new DrivingSchoolViewModel(actionsWithJson);
    }
}
