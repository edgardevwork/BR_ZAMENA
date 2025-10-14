package com.blackhub.bronline.launcher;

import com.blackhub.bronline.game.core.utils.lifecycleobserver.AppLifecycleObserverImpl;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class App_MembersInjector implements MembersInjector<App> {
    public final Provider<AppLifecycleObserverImpl> appLifecycleObserverProvider;

    public App_MembersInjector(Provider<AppLifecycleObserverImpl> appLifecycleObserverProvider) {
        this.appLifecycleObserverProvider = appLifecycleObserverProvider;
    }

    public static MembersInjector<App> create(Provider<AppLifecycleObserverImpl> appLifecycleObserverProvider) {
        return new App_MembersInjector(appLifecycleObserverProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(App instance) {
        injectAppLifecycleObserver(instance, this.appLifecycleObserverProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.launcher.App.appLifecycleObserver")
    public static void injectAppLifecycleObserver(App instance, AppLifecycleObserverImpl appLifecycleObserver) {
        instance.appLifecycleObserver = appLifecycleObserver;
    }
}
