package com.blackhub.bronline.launcher.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.blackhub.bronline.launcher.data.MyFile;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MyFileDao.kt */
@Dao
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

