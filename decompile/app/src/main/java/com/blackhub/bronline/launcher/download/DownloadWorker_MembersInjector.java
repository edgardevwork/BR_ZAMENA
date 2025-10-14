package com.blackhub.bronline.launcher.download;

import com.blackhub.bronline.launcher.database.LauncherDatabase;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class DownloadWorker_MembersInjector implements MembersInjector<DownloadWorker> {
    public final Provider<LauncherDatabase> launcherDatabaseProvider;

    public DownloadWorker_MembersInjector(Provider<LauncherDatabase> launcherDatabaseProvider) {
        this.launcherDatabaseProvider = launcherDatabaseProvider;
    }

    public static MembersInjector<DownloadWorker> create(Provider<LauncherDatabase> launcherDatabaseProvider) {
        return new DownloadWorker_MembersInjector(launcherDatabaseProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DownloadWorker instance) {
        injectLauncherDatabase(instance, this.launcherDatabaseProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.launcher.download.DownloadWorker.launcherDatabase")
    public static void injectLauncherDatabase(DownloadWorker instance, LauncherDatabase launcherDatabase) {
        instance.launcherDatabase = launcherDatabase;
    }
}
