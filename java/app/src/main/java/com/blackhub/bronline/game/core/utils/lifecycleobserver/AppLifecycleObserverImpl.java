package com.blackhub.bronline.game.core.utils.lifecycleobserver;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentStateManager;
import com.blackhub.bronline.launcher.App;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppLifecycleObserverImpl.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAppLifecycleObserverImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppLifecycleObserverImpl.kt\ncom/blackhub/bronline/game/core/utils/lifecycleobserver/AppLifecycleObserverImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1855#2,2:107\n1855#2,2:109\n*S KotlinDebug\n*F\n+ 1 AppLifecycleObserverImpl.kt\ncom/blackhub/bronline/game/core/utils/lifecycleobserver/AppLifecycleObserverImpl\n*L\n95#1:107,2\n101#1:109,2\n*E\n"})
/* loaded from: classes3.dex */
public final class AppLifecycleObserverImpl implements Application.ActivityLifecycleCallbacks {
    public static final int $stable = 8;

    @NotNull
    public final List<AppLifecycleObserver> observers = new ArrayList();

    public final void addObserver(@NotNull AppLifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.add(observer);
    }

    public final void deleteObserver(@NotNull AppLifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.remove(observer);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        notifyObserversOnAppForegrounded();
        App.INSTANCE.setAppOpen(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        notifyObserversOnAppForegrounded();
        App.INSTANCE.setAppOpen(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        notifyObserversOnAppForegrounded();
        App.INSTANCE.setAppOpen(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        notifyObserversOnAppBackgrounded();
        App.INSTANCE.setAppOpen(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        notifyObserversOnAppBackgrounded();
        App.INSTANCE.setAppOpen(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
        notifyObserversOnAppBackgrounded();
        App.INSTANCE.setAppOpen(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        notifyObserversOnAppBackgrounded();
        App.INSTANCE.setAppOpen(false);
    }

    public final void notifyObserversOnAppForegrounded() {
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((AppLifecycleObserver) it.next()).onAppForegrounded();
        }
    }

    public final void notifyObserversOnAppBackgrounded() {
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((AppLifecycleObserver) it.next()).onAppBackgrounded();
        }
    }
}

