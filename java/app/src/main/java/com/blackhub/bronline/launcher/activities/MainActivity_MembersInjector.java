package com.blackhub.bronline.launcher.activities;

import com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
    public final Provider<MainViewModelFactory<MainActivityViewModel>> viewModelFactoryProvider;

    public MainActivity_MembersInjector(Provider<MainViewModelFactory<MainActivityViewModel>> viewModelFactoryProvider) {
        this.viewModelFactoryProvider = viewModelFactoryProvider;
    }

    public static MembersInjector<MainActivity> create(Provider<MainViewModelFactory<MainActivityViewModel>> viewModelFactoryProvider) {
        return new MainActivity_MembersInjector(viewModelFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MainActivity instance) {
        injectViewModelFactory(instance, this.viewModelFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.launcher.activities.MainActivity.viewModelFactory")
    public static void injectViewModelFactory(MainActivity instance, MainViewModelFactory<MainActivityViewModel> viewModelFactory) {
        instance.viewModelFactory = viewModelFactory;
    }
}
