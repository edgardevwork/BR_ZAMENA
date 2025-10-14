package com.blackhub.bronline.game.gui.calendar;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata

public final class CalendarGUIFragment_MembersInjector implements MembersInjector<CalendarGUIFragment> {
    public final Provider<MainViewModelFactory<CalendarViewModel>> factoryProvider;

    public CalendarGUIFragment_MembersInjector(Provider<MainViewModelFactory<CalendarViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<CalendarGUIFragment> create(Provider<MainViewModelFactory<CalendarViewModel>> factoryProvider) {
        return new CalendarGUIFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CalendarGUIFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.calendar.CalendarGUIFragment.factory")
    public static void injectFactory(CalendarGUIFragment instance, MainViewModelFactory<CalendarViewModel> factory) {
        instance.factory = factory;
    }
}
