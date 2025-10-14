package com.blackhub.bronline.launcher.database;

import android.annotation.SuppressLint;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;

import com.android.billingclient.api.BillingFlowParams;
import com.blackhub.bronline.game.core.utils.payment.model.BillingPurchaseRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
@SuppressLint("RestrictedApi")
public final class PurchaseDao_Impl implements PurchaseDao {
    public final RoomDatabase __db;
    public final EntityInsertionAdapter<BillingPurchaseRequest> __insertionAdapterOfBillingPurchaseRequest;

    public PurchaseDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfBillingPurchaseRequest = new EntityInsertionAdapter<BillingPurchaseRequest>(__db) { // from class: com.blackhub.bronline.launcher.database.PurchaseDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            @NonNull
            public String createQuery() {
                return "INSERT OR IGNORE INTO `BillingPurchases` (`systemPaymentId`,`account`,`paymentMethod`,`server`,`summa`,`currency`,`bc`,`source`,`productId`,`accountId`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(@NonNull final SupportSQLiteStatement statement, @NonNull final BillingPurchaseRequest entity) {
                statement.bindString(1, entity.getSystemPaymentId());
                statement.bindString(2, entity.getAccount());
                statement.bindString(3, entity.getPaymentMethod());
                statement.bindLong(4, entity.getServer());
                statement.bindString(5, entity.getSumma());
                statement.bindString(6, entity.getCurrency());
                statement.bindLong(7, entity.getBc());
                statement.bindString(8, entity.getSource());
                statement.bindString(9, entity.getProductId());
                statement.bindLong(10, entity.getAccountId());
            }
        };
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseDao
    public void insertAll(final List<BillingPurchaseRequest> purchasesList) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfBillingPurchaseRequest.insert(purchasesList);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseDao
    public List<BillingPurchaseRequest> getAllPurchases() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM BillingPurchases", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "systemPaymentId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "account");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "paymentMethod");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "server");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "summa");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, FirebaseAnalytics.Param.CURRENCY);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bc");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "productId");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID);
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new BillingPurchaseRequest(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7), cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getString(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.blackhub.bronline.launcher.database.PurchaseDao
    public BillingPurchaseRequest getPurchaseByToken(final String systemPaymentId) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM BillingPurchases WHERE systemPaymentId LIKE ?", 1);
        roomSQLiteQueryAcquire.bindString(1, systemPaymentId);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? new BillingPurchaseRequest(cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "systemPaymentId")), cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "account")), cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "paymentMethod")), cursorQuery.getInt(CursorUtil.getColumnIndexOrThrow(cursorQuery, "server")), cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "summa")), cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, FirebaseAnalytics.Param.CURRENCY)), cursorQuery.getInt(CursorUtil.getColumnIndexOrThrow(cursorQuery, "bc")), cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "source")), cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "productId")), cursorQuery.getInt(CursorUtil.getColumnIndexOrThrow(cursorQuery, BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID))) : null;
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
