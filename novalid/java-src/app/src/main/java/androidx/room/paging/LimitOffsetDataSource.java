package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.paging.PositionalDataSource;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.p009db.SupportSQLiteQuery;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class LimitOffsetDataSource<T> extends PositionalDataSource<T> {
    public final String mCountQuery;
    public final RoomDatabase mDb;
    public final boolean mInTransaction;
    public final String mLimitOffsetQuery;
    public final InvalidationTracker.Observer mObserver;
    public final AtomicBoolean mRegisteredObserver;
    public final RoomSQLiteQuery mSourceQuery;

    @NonNull
    public abstract List<T> convertRows(@NonNull Cursor cursor);

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull SupportSQLiteQuery supportSQLiteQuery, boolean z, @NonNull String... strArr) {
        this(roomDatabase, RoomSQLiteQuery.copyFrom(supportSQLiteQuery), z, strArr);
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull SupportSQLiteQuery supportSQLiteQuery, boolean z, boolean z2, @NonNull String... strArr) {
        this(roomDatabase, RoomSQLiteQuery.copyFrom(supportSQLiteQuery), z, z2, strArr);
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull RoomSQLiteQuery roomSQLiteQuery, boolean z, @NonNull String... strArr) {
        this(roomDatabase, roomSQLiteQuery, z, true, strArr);
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull RoomSQLiteQuery roomSQLiteQuery, boolean z, boolean z2, @NonNull String... strArr) {
        this.mRegisteredObserver = new AtomicBoolean(false);
        this.mDb = roomDatabase;
        this.mSourceQuery = roomSQLiteQuery;
        this.mInTransaction = z;
        this.mCountQuery = "SELECT COUNT(*) FROM ( " + roomSQLiteQuery.getQuery() + " )";
        this.mLimitOffsetQuery = "SELECT * FROM ( " + roomSQLiteQuery.getQuery() + " ) LIMIT ? OFFSET ?";
        this.mObserver = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.paging.LimitOffsetDataSource.1
            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(@NonNull Set<String> set) {
                LimitOffsetDataSource.this.invalidate();
            }
        };
        if (z2) {
            registerObserverIfNecessary();
        }
    }

    public final void registerObserverIfNecessary() {
        if (this.mRegisteredObserver.compareAndSet(false, true)) {
            this.mDb.getInvalidationTracker().addWeakObserver(this.mObserver);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int countItems() {
        registerObserverIfNecessary();
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(this.mCountQuery, this.mSourceQuery.getArgCount());
        roomSQLiteQueryAcquire.copyArgumentsFrom(this.mSourceQuery);
        Cursor cursorQuery = this.mDb.query(roomSQLiteQueryAcquire);
        try {
            if (cursorQuery.moveToFirst()) {
                return cursorQuery.getInt(0);
            }
            return 0;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    public boolean isInvalid() {
        registerObserverIfNecessary();
        this.mDb.getInvalidationTracker().refreshVersionsSync();
        return super.isInvalid();
    }

    public void loadInitial(@NonNull PositionalDataSource.LoadInitialParams loadInitialParams, @NonNull PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) throws Throwable {
        RoomSQLiteQuery sQLiteQuery;
        int i;
        RoomSQLiteQuery roomSQLiteQuery;
        registerObserverIfNecessary();
        List<T> listEmptyList = Collections.emptyList();
        this.mDb.beginTransaction();
        Cursor cursorQuery = null;
        try {
            int iCountItems = countItems();
            if (iCountItems != 0) {
                int iComputeInitialLoadPosition = computeInitialLoadPosition(loadInitialParams, iCountItems);
                sQLiteQuery = getSQLiteQuery(iComputeInitialLoadPosition, computeInitialLoadSize(loadInitialParams, iComputeInitialLoadPosition, iCountItems));
                try {
                    cursorQuery = this.mDb.query(sQLiteQuery);
                    List<T> listConvertRows = convertRows(cursorQuery);
                    this.mDb.setTransactionSuccessful();
                    roomSQLiteQuery = sQLiteQuery;
                    i = iComputeInitialLoadPosition;
                    listEmptyList = listConvertRows;
                } catch (Throwable th) {
                    th = th;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    this.mDb.endTransaction();
                    if (sQLiteQuery != null) {
                        sQLiteQuery.release();
                    }
                    throw th;
                }
            } else {
                i = 0;
                roomSQLiteQuery = null;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            this.mDb.endTransaction();
            if (roomSQLiteQuery != null) {
                roomSQLiteQuery.release();
            }
            loadInitialCallback.onResult(listEmptyList, i, iCountItems);
        } catch (Throwable th2) {
            th = th2;
            sQLiteQuery = null;
        }
    }

    public void loadRange(@NonNull PositionalDataSource.LoadRangeParams loadRangeParams, @NonNull PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        loadRangeCallback.onResult(loadRange(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<T> loadRange(int i, int i2) {
        RoomSQLiteQuery sQLiteQuery = getSQLiteQuery(i, i2);
        if (this.mInTransaction) {
            this.mDb.beginTransaction();
            Cursor cursorQuery = null;
            try {
                cursorQuery = this.mDb.query(sQLiteQuery);
                List<T> listConvertRows = convertRows(cursorQuery);
                this.mDb.setTransactionSuccessful();
                return listConvertRows;
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                this.mDb.endTransaction();
                sQLiteQuery.release();
            }
        }
        Cursor cursorQuery2 = this.mDb.query(sQLiteQuery);
        try {
            return convertRows(cursorQuery2);
        } finally {
            cursorQuery2.close();
            sQLiteQuery.release();
        }
    }

    public final RoomSQLiteQuery getSQLiteQuery(int i, int i2) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(this.mLimitOffsetQuery, this.mSourceQuery.getArgCount() + 2);
        roomSQLiteQueryAcquire.copyArgumentsFrom(this.mSourceQuery);
        roomSQLiteQueryAcquire.bindLong(roomSQLiteQueryAcquire.getArgCount() - 1, i2);
        roomSQLiteQueryAcquire.bindLong(roomSQLiteQueryAcquire.getArgCount(), i);
        return roomSQLiteQueryAcquire;
    }
}
