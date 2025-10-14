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
/* loaded from: classes4.dex */
public abstract class LauncherDatabase extends RoomDatabase {
    public static final int $stable = 0;

    @NotNull
    public abstract MyFileDao myFileDao();
}

