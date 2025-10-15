package com.blackhub.bronline.game.gui.youtubeplayer;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class YotubePlayerFragment_MembersInjector implements MembersInjector<YotubePlayerFragment> {
    public final Provider<MainViewModelFactory<YoutubePlayerViewModel>> mainFactoryProvider;

    public YotubePlayerFragment_MembersInjector(Provider<MainViewModelFactory<YoutubePlayerViewModel>> mainFactoryProvider) {
        this.mainFactoryProvider = mainFactoryProvider;
    }

    public static MembersInjector<YotubePlayerFragment> create(Provider<MainViewModelFactory<YoutubePlayerViewModel>> mainFactoryProvider) {
        return new YotubePlayerFragment_MembersInjector(mainFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(YotubePlayerFragment instance) {
        injectMainFactory(instance, this.mainFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.youtubeplayer.YotubePlayerFragment.mainFactory")
    public static void injectMainFactory(YotubePlayerFragment instance, MainViewModelFactory<YoutubePlayerViewModel> mainFactory) {
        instance.mainFactory = mainFactory;
    }
}
