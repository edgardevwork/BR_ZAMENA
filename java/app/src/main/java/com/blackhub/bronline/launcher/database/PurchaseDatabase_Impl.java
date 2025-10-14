package com.blackhub.bronline.launcher.database;

import android.annotation.SuppressLint;
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
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.android.billingclient.api.BillingFlowParams;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
@SuppressLint("RestrictedApi")
public final class PurchaseDatabase_Impl extends PurchaseDatabase {
    public volatile PurchaseDao _purchaseDao;
    public volatile PurchaseRustoreDao _purchaseRustoreDao;

    @Override // androidx.room.RoomDatabase
    @NonNull
    public SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
        return config.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(new RoomOpenHelper(config, new RoomOpenHelper.Delegate(5) { // from class: com.blackhub.bronline.launcher.database.PurchaseDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(@NonNull final SupportSQLiteDatabase db) throws SQLException {
                db.execSQL("CREATE TABLE IF NOT EXISTS `BillingPurchases` (`systemPaymentId` TEXT NOT NULL, `account` TEXT NOT NULL, `paymentMethod` TEXT NOT NULL, `server` INTEGER NOT NULL, `summa` TEXT NOT NULL, `currency` TEXT NOT NULL, `bc` INTEGER NOT NULL, `source` TEXT NOT NULL, `productId` TEXT NOT NULL, `accountId` INTEGER NOT NULL, PRIMARY KEY(`systemPaymentId`))");
                db.execSQL("CREATE TABLE IF NOT EXISTS `BillingRustorePurchases` (`nickname` TEXT NOT NULL, `accountId` INTEGER NOT NULL, `productIdFromRustore` TEXT NOT NULL, `serverId` INTEGER NOT NULL, `summa` INTEGER NOT NULL, `invoiceId` TEXT NOT NULL, `appmetricaDeviceId` TEXT, `purchaseId` TEXT NOT NULL, PRIMARY KEY(`purchaseId`))");
                db.execSQL(RoomMasterTable.CREATE_QUERY);
                db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a608d246fb5433d911b278b332f51aaf')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(@NonNull final SupportSQLiteDatabase db) throws SQLException {
                db.execSQL("DROP TABLE IF EXISTS `BillingPurchases`");
                db.execSQL("DROP TABLE IF EXISTS `BillingRustorePurchases`");
                List list = PurchaseDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onDestructiveMigration(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(@NonNull final SupportSQLiteDatabase db) {
                List list = PurchaseDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onCreate(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(@NonNull final SupportSQLiteDatabase db) {
                PurchaseDatabase_Impl.this.mDatabase = db;
                PurchaseDatabase_Impl.this.internalInitInvalidationTracker(db);
                List list = PurchaseDatabase_Impl.this.mCallbacks;
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
                HashMap map = new HashMap(10);
                map.put("systemPaymentId", new TableInfo.Column("systemPaymentId", "TEXT", true, 1, null, 1));
                map.put("account", new TableInfo.Column("account", "TEXT", true, 0, null, 1));
                map.put("paymentMethod", new TableInfo.Column("paymentMethod", "TEXT", true, 0, null, 1));
                map.put("server", new TableInfo.Column("server", "INTEGER", true, 0, null, 1));
                map.put("summa", new TableInfo.Column("summa", "TEXT", true, 0, null, 1));
                map.put(FirebaseAnalytics.Param.CURRENCY, new TableInfo.Column(FirebaseAnalytics.Param.CURRENCY, "TEXT", true, 0, null, 1));
                map.put("bc", new TableInfo.Column("bc", "INTEGER", true, 0, null, 1));
                map.put("source", new TableInfo.Column("source", "TEXT", true, 0, null, 1));
                map.put("productId", new TableInfo.Column("productId", "TEXT", true, 0, null, 1));
                map.put(BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, new TableInfo.Column(BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("BillingPurchases", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(db, "BillingPurchases");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenHelper.ValidationResult(false, "BillingPurchases(com.blackhub.bronline.game.core.utils.payment.model.BillingPurchaseRequest).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                HashMap map2 = new HashMap(8);
                map2.put(Const.FRACTION_CONTROL_PLAYER_NICKNAME, new TableInfo.Column(Const.FRACTION_CONTROL_PLAYER_NICKNAME, "TEXT", true, 0, null, 1));
                map2.put(BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, new TableInfo.Column(BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, "INTEGER", true, 0, null, 1));
                map2.put("productIdFromRustore", new TableInfo.Column("productIdFromRustore", "TEXT", true, 0, null, 1));
                map2.put("serverId", new TableInfo.Column("serverId", "INTEGER", true, 0, null, 1));
                map2.put("summa", new TableInfo.Column("summa", "INTEGER", true, 0, null, 1));
                map2.put("invoiceId", new TableInfo.Column("invoiceId", "TEXT", true, 0, null, 1));
                map2.put("appmetricaDeviceId", new TableInfo.Column("appmetricaDeviceId", "TEXT", false, 0, null, 1));
                map2.put("purchaseId", new TableInfo.Column("purchaseId", "TEXT", true, 1, null, 1));
                TableInfo tableInfo3 = new TableInfo("BillingRustorePurchases", map2, new HashSet(0), new HashSet(0));
                TableInfo tableInfo4 = TableInfo.read(db, "BillingRustorePurchases");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenHelper.ValidationResult(false, "BillingRustorePurchases(com.blackhub.bronline.game.core.utils.payment.rustore.model.RustoreBillingPurchaseRequest).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "a608d246fb5433d911b278b332f51aaf", "c2dda3d12c531e1e302eb52df3737e9d")).build());
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "BillingPurchases", "BillingRustorePurchases");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() throws SQLException {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `BillingPurchases`");
            writableDatabase.execSQL("DELETE FROM `BillingRustorePurchases`");
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
        map.put(PurchaseDao.class, PurchaseDao_Impl.getRequiredConverters());
        map.put(PurchaseRustoreDao.class, PurchaseRustoreDao_Impl.getRequiredConverters());
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

    @Override // com.blackhub.bronline.launcher.database.PurchaseDatabase
    public PurchaseDao purchaseDao() {
        PurchaseDao purchaseDao;
        if (this._purchaseDao != null) {
            return this._purchaseDao;
        }
        synchronized (this) {
            try {
                if (this._purchaseDao == null) {
                    this._purchaseDao = new PurchaseDao_Impl(this);
                }
                purchaseDao = this._purchaseDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return purchaseDao;
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseDatabase
    public PurchaseRustoreDao purchaseRustoreDao() {
        PurchaseRustoreDao purchaseRustoreDao;
        if (this._purchaseRustoreDao != null) {
            return this._purchaseRustoreDao;
        }
        synchronized (this) {
            try {
                if (this._purchaseRustoreDao == null) {
                    this._purchaseRustoreDao = new PurchaseRustoreDao_Impl(this);
                }
                purchaseRustoreDao = this._purchaseRustoreDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return purchaseRustoreDao;
    }
}
