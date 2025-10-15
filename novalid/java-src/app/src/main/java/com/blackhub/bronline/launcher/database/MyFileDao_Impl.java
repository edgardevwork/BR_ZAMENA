package com.blackhub.bronline.launcher.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p009db.SupportSQLiteStatement;
import com.blackhub.bronline.launcher.data.MyFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class MyFileDao_Impl implements MyFileDao {
    public final RoomDatabase __db;
    public final EntityDeletionOrUpdateAdapter<MyFile> __deletionAdapterOfMyFile;
    public final EntityInsertionAdapter<MyFile> __insertionAdapterOfMyFile;
    public final SharedSQLiteStatement __preparedStmtOfSetMyFileDownloadedByPathAndName;
    public final EntityDeletionOrUpdateAdapter<MyFile> __updateAdapterOfMyFile;

    public MyFileDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfMyFile = new EntityInsertionAdapter<MyFile>(__db) { // from class: com.blackhub.bronline.launcher.database.MyFileDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            @NonNull
            public String createQuery() {
                return "INSERT OR IGNORE INTO `MyFiles` (`id`,`name`,`path`,`size`,`data`,`downloaded`) VALUES (nullif(?, 0),?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(@NonNull SupportSQLiteStatement supportSQLiteStatement, @NonNull MyFile myFile) {
                supportSQLiteStatement.bindLong(1, myFile.getId());
                supportSQLiteStatement.bindString(2, myFile.getName());
                supportSQLiteStatement.bindString(3, myFile.getPath());
                supportSQLiteStatement.bindLong(4, myFile.getSize());
                supportSQLiteStatement.bindString(5, myFile.getData());
                supportSQLiteStatement.bindLong(6, myFile.getDownloaded() ? 1L : 0L);
            }
        };
        this.__deletionAdapterOfMyFile = new EntityDeletionOrUpdateAdapter<MyFile>(__db) { // from class: com.blackhub.bronline.launcher.database.MyFileDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            @NonNull
            public String createQuery() {
                return "DELETE FROM `MyFiles` WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(@NonNull final SupportSQLiteStatement statement, @NonNull final MyFile entity) {
                statement.bindLong(1, entity.getId());
            }
        };
        this.__updateAdapterOfMyFile = new EntityDeletionOrUpdateAdapter<MyFile>(__db) { // from class: com.blackhub.bronline.launcher.database.MyFileDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            @NonNull
            public String createQuery() {
                return "UPDATE OR REPLACE `MyFiles` SET `id` = ?,`name` = ?,`path` = ?,`size` = ?,`data` = ?,`downloaded` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(@NonNull SupportSQLiteStatement supportSQLiteStatement, @NonNull MyFile myFile) {
                supportSQLiteStatement.bindLong(1, myFile.getId());
                supportSQLiteStatement.bindString(2, myFile.getName());
                supportSQLiteStatement.bindString(3, myFile.getPath());
                supportSQLiteStatement.bindLong(4, myFile.getSize());
                supportSQLiteStatement.bindString(5, myFile.getData());
                supportSQLiteStatement.bindLong(6, myFile.getDownloaded() ? 1L : 0L);
                supportSQLiteStatement.bindLong(7, myFile.getId());
            }
        };
        this.__preparedStmtOfSetMyFileDownloadedByPathAndName = new SharedSQLiteStatement(__db) { // from class: com.blackhub.bronline.launcher.database.MyFileDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            @NonNull
            public String createQuery() {
                return "UPDATE MyFiles SET downloaded = ? WHERE path LIKE ? AND name LIKE ?";
            }
        };
    }

    @Override // com.blackhub.bronline.launcher.database.MyFileDao
    public void insertAll(final List<MyFile> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfMyFile.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.blackhub.bronline.launcher.database.MyFileDao
    public void insert(final MyFile myFile) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfMyFile.insert((EntityInsertionAdapter<MyFile>) myFile);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.blackhub.bronline.launcher.database.MyFileDao
    public void deleteEntry(final MyFile file) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfMyFile.handle(file);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.blackhub.bronline.launcher.database.MyFileDao
    public void updateMyFile(final MyFile myFile) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfMyFile.handle(myFile);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.blackhub.bronline.launcher.database.MyFileDao
    public void setMyFileDownloadedByPathAndName(boolean z, String str, String str2) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfSetMyFileDownloadedByPathAndName.acquire();
        supportSQLiteStatementAcquire.bindLong(1, z ? 1L : 0L);
        supportSQLiteStatementAcquire.bindString(2, str);
        supportSQLiteStatementAcquire.bindString(3, str2);
        try {
            this.__db.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfSetMyFileDownloadedByPathAndName.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.blackhub.bronline.launcher.database.MyFileDao
    public List<MyFile> getAll() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM MyFiles", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "size");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloaded");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new MyFile(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6) != 0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.blackhub.bronline.launcher.database.MyFileDao
    public MyFile getFileByPathAndName(final String path, final String name) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM MyFiles WHERE path LIKE ? AND name LIKE ?", 2);
        roomSQLiteQueryAcquire.bindString(1, path);
        roomSQLiteQueryAcquire.bindString(2, name);
        this.__db.assertNotSuspendingTransaction();
        MyFile myFile = null;
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "size");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloaded");
            if (cursorQuery.moveToFirst()) {
                myFile = new MyFile(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6) != 0);
            }
            return myFile;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.blackhub.bronline.launcher.database.MyFileDao
    public List<MyFile> getNotDownloadedFiles() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM MyFiles WHERE downloaded = 0", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "size");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloaded");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new MyFile(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6) != 0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.blackhub.bronline.launcher.database.MyFileDao
    public List<Long> getNotDownloadedFilesSize() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT size FROM MyFiles WHERE downloaded = 0", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(Long.valueOf(cursorQuery.getLong(0)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
