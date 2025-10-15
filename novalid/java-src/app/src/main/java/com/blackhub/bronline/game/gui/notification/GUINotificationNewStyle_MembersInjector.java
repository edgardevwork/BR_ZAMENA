package com.blackhub.bronline.game.gui.notification;

import com.blackhub.bronline.game.gui.notification.viewmodel.NotificationViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class GUINotificationNewStyle_MembersInjector implements MembersInjector<GUINotificationNewStyle> {
    public final Provider<MainViewModelFactory<NotificationViewModel>> notificationFactoryProvider;

    public GUINotificationNewStyle_MembersInjector(Provider<MainViewModelFactory<NotificationViewModel>> notificationFactoryProvider) {
        this.notificationFactoryProvider = notificationFactoryProvider;
    }

    public static MembersInjector<GUINotificationNewStyle> create(Provider<MainViewModelFactory<NotificationViewModel>> notificationFactoryProvider) {
        return new GUINotificationNewStyle_MembersInjector(notificationFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GUINotificationNewStyle instance) {
        injectNotificationFactory(instance, this.notificationFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.notification.GUINotificationNewStyle.notificationFactory")
    public static void injectNotificationFactory(GUINotificationNewStyle instance, MainViewModelFactory<NotificationViewModel> notificationFactory) {
        instance.notificationFactory = notificationFactory;
    }
}
