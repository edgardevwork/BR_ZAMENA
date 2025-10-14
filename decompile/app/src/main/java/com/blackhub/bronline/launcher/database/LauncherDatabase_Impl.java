package com.blackhub.bronline.launcher.database;

import android.database.SQLException;
import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.p009db.SupportSQLiteDatabase;
import androidx.sqlite.p009db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class LauncherDatabase_Impl extends LauncherDatabase {
    public volatile MyFileDao _myFileDao;

    @Override // androidx.room.RoomDatabase
    @NonNull
    public SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
        return config.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) { // from class: com.blackhub.bronline.launcher.database.LauncherDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(@NonNull final SupportSQLiteDatabase db) throws SQLException {
                db.execSQL("CREATE TABLE IF NOT EXISTS `MyFiles` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `path` TEXT NOT NULL, `size` INTEGER NOT NULL, `data` TEXT NOT NULL, `downloaded` INTEGER NOT NULL)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_MyFiles_path_name` ON `MyFiles` (`path`, `name`)");
                db.execSQL(RoomMasterTable.CREATE_QUERY);
                db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c0a0470f8b715ce05f693be5e34977bd')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(@NonNull final SupportSQLiteDatabase db) throws SQLException {
                db.execSQL("DROP TABLE IF EXISTS `MyFiles`");
                List list = LauncherDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onDestructiveMigration(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(@NonNull final SupportSQLiteDatabase db) {
                List list = LauncherDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onCreate(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(@NonNull final SupportSQLiteDatabase db) {
                LauncherDatabase_Impl.this.mDatabase = db;
                LauncherDatabase_Impl.this.internalInitInvalidationTracker(db);
                List list = LauncherDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onOpen(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) throws SQLException {
                DBUtil.dropFtsSyncTriggers(db);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            @NonNull
            public RoomOpenHelper.ValidationResult onValidateSchema(@NonNull final SupportSQLiteDatabase db) {
                HashMap map = new HashMap(6);
                map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                map.put("path", new TableInfo.Column("path", "TEXT", true, 0, null, 1));
                map.put("size", new TableInfo.Column("size", "INTEGER", true, 0, null, 1));
                map.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, 1));
                map.put("downloaded", new TableInfo.Column("downloaded", "INTEGER", true, 0, null, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new TableInfo.Index("index_MyFiles_path_name", true, Arrays.asList("path", "name"), Arrays.asList("ASC", "ASC")));
                TableInfo tableInfo = new TableInfo("MyFiles", map, hashSet, hashSet2);
                TableInfo tableInfo2 = TableInfo.read(db, "MyFiles");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenHelper.ValidationResult(false, "MyFiles(com.blackhub.bronline.launcher.data.MyFile).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "c0a0470f8b715ce05f693be5e34977bd", "6d23d833380a443e6b1c3f92fdf53e9f")).build());
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "MyFiles");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() throws SQLException {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `MyFiles`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(MyFileDao.class, MyFileDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public List<Migration> getAutoMigrations(@NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        return new ArrayList();
    }

    @Override // com.blackhub.bronline.launcher.database.LauncherDatabase
    public MyFileDao myFileDao() {
        MyFileDao myFileDao;
        if (this._myFileDao != null) {
            return this._myFileDao;
        }
        synchronized (this) {
            try {
                if (this._myFileDao == null) {
                    this._myFileDao = new MyFileDao_Impl(this);
                }
                myFileDao = this._myFileDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return myFileDao;
    }
}
