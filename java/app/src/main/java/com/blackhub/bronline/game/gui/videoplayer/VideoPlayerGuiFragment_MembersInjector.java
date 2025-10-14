package com.blackhub.bronline.game.gui.videoplayer;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class VideoPlayerGuiFragment_MembersInjector implements MembersInjector<VideoPlayerGuiFragment> {
    public final Provider<MainViewModelFactory<VideoPlayerViewModel>> factoryProvider;

    public VideoPlayerGuiFragment_MembersInjector(Provider<MainViewModelFactory<VideoPlayerViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<VideoPlayerGuiFragment> create(Provider<MainViewModelFactory<VideoPlayerViewModel>> factoryProvider) {
        return new VideoPlayerGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VideoPlayerGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.videoplayer.VideoPlayerGuiFragment.factory")
    public static void injectFactory(VideoPlayerGuiFragment instance, MainViewModelFactory<VideoPlayerViewModel> factory) {
        instance.factory = factory;
    }
}
