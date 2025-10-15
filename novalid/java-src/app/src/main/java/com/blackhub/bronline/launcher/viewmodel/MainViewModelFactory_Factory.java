package com.blackhub.bronline.launcher.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class MainViewModelFactory_Factory<VM extends ViewModel> implements Factory<MainViewModelFactory<VM>> {
    public final Provider<VM> viewModelProvider;

    public MainViewModelFactory_Factory(Provider<VM> viewModelProvider) {
        this.viewModelProvider = viewModelProvider;
    }

    @Override // javax.inject.Provider
    public MainViewModelFactory<VM> get() {
        return newInstance(this.viewModelProvider);
    }

    public static <VM extends ViewModel> MainViewModelFactory_Factory<VM> create(Provider<VM> viewModelProvider) {
        return new MainViewModelFactory_Factory<>(viewModelProvider);
    }

    public static <VM extends ViewModel> MainViewModelFactory<VM> newInstance(Provider<VM> viewModelProvider) {
        return new MainViewModelFactory<>(viewModelProvider);
    }
}
