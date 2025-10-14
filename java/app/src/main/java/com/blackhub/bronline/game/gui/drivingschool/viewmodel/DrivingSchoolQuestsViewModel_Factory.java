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

public final class DrivingSchoolQuestsViewModel_Factory implements Factory<DrivingSchoolQuestsViewModel> {
    public final Provider<DrivingSchoolActionsWithJSON> actionsWithJsonProvider;

    public DrivingSchoolQuestsViewModel_Factory(Provider<DrivingSchoolActionsWithJSON> actionsWithJsonProvider) {
        this.actionsWithJsonProvider = actionsWithJsonProvider;
    }

    @Override // javax.inject.Provider
    public DrivingSchoolQuestsViewModel get() {
        return newInstance(this.actionsWithJsonProvider.get());
    }

    public static DrivingSchoolQuestsViewModel_Factory create(Provider<DrivingSchoolActionsWithJSON> actionsWithJsonProvider) {
        return new DrivingSchoolQuestsViewModel_Factory(actionsWithJsonProvider);
    }

    public static DrivingSchoolQuestsViewModel newInstance(DrivingSchoolActionsWithJSON actionsWithJson) {
        return new DrivingSchoolQuestsViewModel(actionsWithJson);
    }
}
