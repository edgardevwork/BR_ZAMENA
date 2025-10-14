package com.blackhub.bronline.launcher.database;

import android.annotation.SuppressLint;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;

import com.android.billingclient.api.BillingFlowParams;
import com.blackhub.bronline.game.core.utils.payment.rustore.model.RustoreBillingPurchaseRequest;
import com.blackhub.bronline.game.gui.fractions.Const;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
@SuppressLint("RestrictedApi")
public final class PurchaseRustoreDao_Impl implements PurchaseRustoreDao {
    public final RoomDatabase __db;
    @SuppressLint("RestrictedApi")
    public final EntityInsertionAdapter<RustoreBillingPurchaseRequest> __insertionAdapterOfRustoreBillingPurchaseRequest;
    @SuppressLint("RestrictedApi")
    public final SharedSQLiteStatement __preparedStmtOfClearTable;
    @SuppressLint("RestrictedApi")
    public final SharedSQLiteStatement __preparedStmtOfDeletePurchaseByToken;

    public PurchaseRustoreDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfRustoreBillingPurchaseRequest = new EntityInsertionAdapter<RustoreBillingPurchaseRequest>(__db) { // from class: com.blackhub.bronline.launcher.database.PurchaseRustoreDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            @NonNull
            public String createQuery() {
                return "INSERT OR IGNORE INTO `BillingRustorePurchases` (`nickname`,`accountId`,`productIdFromRustore`,`serverId`,`summa`,`invoiceId`,`appmetricaDeviceId`,`purchaseId`) VALUES (?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(@NonNull final SupportSQLiteStatement statement, @NonNull final RustoreBillingPurchaseRequest entity) {
                statement.bindString(1, entity.getNickname());
                statement.bindLong(2, entity.getAccountId());
                statement.bindString(3, entity.getProductIdFromRustore());
                statement.bindLong(4, entity.getServerId());
                statement.bindLong(5, entity.getSumma());
                statement.bindString(6, entity.getInvoiceId());
                if (entity.getAppmetricaDeviceId() == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, entity.getAppmetricaDeviceId());
                }
                statement.bindString(8, entity.getPurchaseId());
            }
        };
        this.__preparedStmtOfDeletePurchaseByToken = new SharedSQLiteStatement(__db) { // from class: com.blackhub.bronline.launcher.database.PurchaseRustoreDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            @NonNull
            public String createQuery() {
                return "DELETE FROM BillingRustorePurchases WHERE purchaseId LIKE ?";
            }
        };
        this.__preparedStmtOfClearTable = new SharedSQLiteStatement(__db) { // from class: com.blackhub.bronline.launcher.database.PurchaseRustoreDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            @NonNull
            public String createQuery() {
                return "DELETE FROM BillingRustorePurchases";
            }
        };
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseRustoreDao
    public void insertAll(final List<RustoreBillingPurchaseRequest> purchasesList) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRustoreBillingPurchaseRequest.insert(purchasesList);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseRustoreDao
    public void deletePurchaseByToken(final String purchaseId) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDeletePurchaseByToken.acquire();
        supportSQLiteStatementAcquire.bindString(1, purchaseId);
        try {
            this.__db.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfDeletePurchaseByToken.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseRustoreDao
    public void clearTable() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfClearTable.acquire();
        try {
            this.__db.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfClearTable.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseRustoreDao
    public List<RustoreBillingPurchaseRequest> getAllPurchases() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM BillingRustorePurchases", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, Const.FRACTION_CONTROL_PLAYER_NICKNAME);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "productIdFromRustore");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "serverId");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "summa");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "invoiceId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appmetricaDeviceId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "purchaseId");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new RustoreBillingPurchaseRequest(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getString(columnIndexOrThrow8)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseRustoreDao
    public RustoreBillingPurchaseRequest getPurchaseByToken(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM BillingRustorePurchases WHERE purchaseId LIKE ?", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.__db.assertNotSuspendingTransaction();
        RustoreBillingPurchaseRequest rustoreBillingPurchaseRequest = null;
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, Const.FRACTION_CONTROL_PLAYER_NICKNAME);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "productIdFromRustore");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "serverId");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "summa");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "invoiceId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appmetricaDeviceId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "purchaseId");
            if (cursorQuery.moveToFirst()) {
                rustoreBillingPurchaseRequest = new RustoreBillingPurchaseRequest(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getString(columnIndexOrThrow8));
            }
            return rustoreBillingPurchaseRequest;
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
