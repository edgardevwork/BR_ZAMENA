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
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u001a\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/lifecycleobserver/AppLifecycleObserverImpl;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "observers", "", "Lcom/blackhub/bronline/game/core/utils/lifecycleobserver/AppLifecycleObserver;", "addObserver", "", "observer", "deleteObserver", "notifyObserversOnAppBackgrounded", "notifyObserversOnAppForegrounded", "onActivityCreated", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
