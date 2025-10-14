package com.blackhub.bronline.game.gui.drivingschool.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata

public final class DrivingSchoolMainViewModel_Factory implements Factory<DrivingSchoolMainViewModel> {

    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        public static final DrivingSchoolMainViewModel_Factory INSTANCE = new DrivingSchoolMainViewModel_Factory();
    }

    @Override // javax.inject.Provider
    public DrivingSchoolMainViewModel get() {
        return newInstance();
    }

    public static DrivingSchoolMainViewModel_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DrivingSchoolMainViewModel newInstance() {
        return new DrivingSchoolMainViewModel();
    }
}
