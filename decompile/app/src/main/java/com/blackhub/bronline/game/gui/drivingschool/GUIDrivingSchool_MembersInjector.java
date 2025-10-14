package com.blackhub.bronline.game.gui.drivingschool;

import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolClassInfoViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolMainViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolQuestsViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class GUIDrivingSchool_MembersInjector implements MembersInjector<GUIDrivingSchool> {
    public final Provider<MainViewModelFactory<DrivingSchoolClassInfoViewModel>> drivingSchoolClassInfoFactoryProvider;
    public final Provider<MainViewModelFactory<DrivingSchoolViewModel>> drivingSchoolFactoryProvider;
    public final Provider<MainViewModelFactory<DrivingSchoolMainViewModel>> drivingSchoolMainFactoryProvider;
    public final Provider<MainViewModelFactory<DrivingSchoolQuestsViewModel>> drivingSchoolQuestionsFactoryProvider;

    public GUIDrivingSchool_MembersInjector(Provider<MainViewModelFactory<DrivingSchoolViewModel>> drivingSchoolFactoryProvider, Provider<MainViewModelFactory<DrivingSchoolMainViewModel>> drivingSchoolMainFactoryProvider, Provider<MainViewModelFactory<DrivingSchoolClassInfoViewModel>> drivingSchoolClassInfoFactoryProvider, Provider<MainViewModelFactory<DrivingSchoolQuestsViewModel>> drivingSchoolQuestionsFactoryProvider) {
        this.drivingSchoolFactoryProvider = drivingSchoolFactoryProvider;
        this.drivingSchoolMainFactoryProvider = drivingSchoolMainFactoryProvider;
        this.drivingSchoolClassInfoFactoryProvider = drivingSchoolClassInfoFactoryProvider;
        this.drivingSchoolQuestionsFactoryProvider = drivingSchoolQuestionsFactoryProvider;
    }

    public static MembersInjector<GUIDrivingSchool> create(Provider<MainViewModelFactory<DrivingSchoolViewModel>> drivingSchoolFactoryProvider, Provider<MainViewModelFactory<DrivingSchoolMainViewModel>> drivingSchoolMainFactoryProvider, Provider<MainViewModelFactory<DrivingSchoolClassInfoViewModel>> drivingSchoolClassInfoFactoryProvider, Provider<MainViewModelFactory<DrivingSchoolQuestsViewModel>> drivingSchoolQuestionsFactoryProvider) {
        return new GUIDrivingSchool_MembersInjector(drivingSchoolFactoryProvider, drivingSchoolMainFactoryProvider, drivingSchoolClassInfoFactoryProvider, drivingSchoolQuestionsFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GUIDrivingSchool instance) {
        injectDrivingSchoolFactory(instance, this.drivingSchoolFactoryProvider.get());
        injectDrivingSchoolMainFactory(instance, this.drivingSchoolMainFactoryProvider.get());
        injectDrivingSchoolClassInfoFactory(instance, this.drivingSchoolClassInfoFactoryProvider.get());
        injectDrivingSchoolQuestionsFactory(instance, this.drivingSchoolQuestionsFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool.drivingSchoolFactory")
    public static void injectDrivingSchoolFactory(GUIDrivingSchool instance, MainViewModelFactory<DrivingSchoolViewModel> drivingSchoolFactory) {
        instance.drivingSchoolFactory = drivingSchoolFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool.drivingSchoolMainFactory")
    public static void injectDrivingSchoolMainFactory(GUIDrivingSchool instance, MainViewModelFactory<DrivingSchoolMainViewModel> drivingSchoolMainFactory) {
        instance.drivingSchoolMainFactory = drivingSchoolMainFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool.drivingSchoolClassInfoFactory")
    public static void injectDrivingSchoolClassInfoFactory(GUIDrivingSchool instance, MainViewModelFactory<DrivingSchoolClassInfoViewModel> drivingSchoolClassInfoFactory) {
        instance.drivingSchoolClassInfoFactory = drivingSchoolClassInfoFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool.drivingSchoolQuestionsFactory")
    public static void injectDrivingSchoolQuestionsFactory(GUIDrivingSchool instance, MainViewModelFactory<DrivingSchoolQuestsViewModel> drivingSchoolQuestionsFactory) {
        instance.drivingSchoolQuestionsFactory = drivingSchoolQuestionsFactory;
    }
}
