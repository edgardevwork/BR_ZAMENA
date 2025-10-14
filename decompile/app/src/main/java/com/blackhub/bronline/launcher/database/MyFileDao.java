package com.blackhub.bronline.launcher.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.blackhub.bronline.launcher.data.MyFile;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.List;
import kotlin.Metadata;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MyFileDao.kt */
@Dao
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H'J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H'J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H'J \u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH'J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/database/MyFileDao;", "", "deleteEntry", "", PomReader.PomProfileElement.FILE, "Lcom/blackhub/bronline/launcher/data/MyFile;", "getAll", "", "getFileByPathAndName", "path", "", "name", "getNotDownloadedFiles", "getNotDownloadedFilesSize", "", "insert", "myFile", "insertAll", IFramePlayerOptions.Builder.LIST, "", "setMyFileDownloadedByPathAndName", "isFileDownloaded", "", "updateMyFile", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface MyFileDao {
    @Delete
    void deleteEntry(@NotNull MyFile file);

    @Query("SELECT * FROM MyFiles")
    @NotNull
    List<MyFile> getAll();

    @Query("SELECT * FROM MyFiles WHERE path LIKE :path AND name LIKE :name")
    @Nullable
    MyFile getFileByPathAndName(@NotNull String path, @NotNull String name);

    @Query("SELECT * FROM MyFiles WHERE downloaded = 0")
    @NotNull
    List<MyFile> getNotDownloadedFiles();

    @Query("SELECT size FROM MyFiles WHERE downloaded = 0")
    @NotNull
    List<Long> getNotDownloadedFilesSize();

    @Insert(onConflict = 5)
    void insert(@NotNull MyFile myFile);

    @Insert(onConflict = 5)
    void insertAll(@NotNull List<MyFile> list);

    @Query("UPDATE MyFiles SET downloaded = :isFileDownloaded WHERE path LIKE :path AND name LIKE :name")
    void setMyFileDownloadedByPathAndName(boolean isFileDownloaded, @NotNull String path, @NotNull String name);

    @Update(onConflict = 1)
    void updateMyFile(@NotNull MyFile myFile);
}
