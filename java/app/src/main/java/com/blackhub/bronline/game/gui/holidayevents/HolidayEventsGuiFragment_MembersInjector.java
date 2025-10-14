package com.blackhub.bronline.game.gui.holidayevents;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata

public final class HolidayEventsGuiFragment_MembersInjector implements MembersInjector<HolidayEventsGuiFragment> {
    public final Provider<MainViewModelFactory<HolidayEventsViewModel>> factoryProvider;

    public HolidayEventsGuiFragment_MembersInjector(Provider<MainViewModelFactory<HolidayEventsViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<HolidayEventsGuiFragment> create(Provider<MainViewModelFactory<HolidayEventsViewModel>> factoryProvider) {
        return new HolidayEventsGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(HolidayEventsGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.holidayevents.HolidayEventsGuiFragment.factory")
    public static void injectFactory(HolidayEventsGuiFragment instance, MainViewModelFactory<HolidayEventsViewModel> factory) {
        instance.factory = factory;
    }
}
