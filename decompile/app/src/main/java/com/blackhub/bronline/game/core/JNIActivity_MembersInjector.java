package com.blackhub.bronline.game.core;

import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class JNIActivity_MembersInjector implements MembersInjector<JNIActivity> {
    public final Provider<MainViewModelFactory<JNIActivityViewModel>> viewModelFactoryProvider;

    public JNIActivity_MembersInjector(Provider<MainViewModelFactory<JNIActivityViewModel>> viewModelFactoryProvider) {
        this.viewModelFactoryProvider = viewModelFactoryProvider;
    }

    public static MembersInjector<JNIActivity> create(Provider<MainViewModelFactory<JNIActivityViewModel>> viewModelFactoryProvider) {
        return new JNIActivity_MembersInjector(viewModelFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(JNIActivity instance) {
        injectViewModelFactory(instance, this.viewModelFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.core.JNIActivity.viewModelFactory")
    public static void injectViewModelFactory(JNIActivity instance, MainViewModelFactory<JNIActivityViewModel> viewModelFactory) {
        instance.viewModelFactory = viewModelFactory;
    }
}
