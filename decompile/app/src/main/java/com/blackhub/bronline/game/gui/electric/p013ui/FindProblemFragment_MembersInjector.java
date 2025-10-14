package com.blackhub.bronline.game.gui.electric.p013ui;

import com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class FindProblemFragment_MembersInjector implements MembersInjector<FindProblemFragment> {
    public final Provider<MainViewModelFactory<FindProblemViewModel>> factoryProvider;

    public FindProblemFragment_MembersInjector(Provider<MainViewModelFactory<FindProblemViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<FindProblemFragment> create(Provider<MainViewModelFactory<FindProblemViewModel>> factoryProvider) {
        return new FindProblemFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FindProblemFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment.factory")
    public static void injectFactory(FindProblemFragment instance, MainViewModelFactory<FindProblemViewModel> factory) {
        instance.factory = factory;
    }
}
