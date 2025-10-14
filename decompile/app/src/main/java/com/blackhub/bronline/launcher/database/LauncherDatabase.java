package com.blackhub.bronline.launcher.database;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.blackhub.bronline.launcher.data.MyFile;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LauncherDatabase.kt */
@StabilityInferred(parameters = 1)
@Database(entities = {MyFile.class}, version = 1)
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0005"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/database/LauncherDatabase;", "Landroidx/room/RoomDatabase;", "()V", "myFileDao", "Lcom/blackhub/bronline/launcher/database/MyFileDao;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public abstract class LauncherDatabase extends RoomDatabase {
    public static final int $stable = 0;

    @NotNull
    public abstract MyFileDao myFileDao();
}
