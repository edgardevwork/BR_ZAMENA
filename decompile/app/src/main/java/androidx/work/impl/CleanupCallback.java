package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.sqlite.p009db.SupportSQLiteDatabase;
import androidx.work.Clock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WorkDatabase.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m7105d2 = {"Landroidx/work/impl/CleanupCallback;", "Landroidx/room/RoomDatabase$Callback;", "clock", "Landroidx/work/Clock;", "(Landroidx/work/Clock;)V", "getClock", "()Landroidx/work/Clock;", "pruneDate", "", "getPruneDate", "()J", "pruneSQL", "", "getPruneSQL", "()Ljava/lang/String;", "onOpen", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "work-runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class CleanupCallback extends RoomDatabase.Callback {

    @NotNull
    public final Clock clock;

    public CleanupCallback(@NotNull Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
    }

    @NotNull
    public final Clock getClock() {
        return this.clock;
    }

    public final String getPruneSQL() {
        return WorkDatabaseKt.PRUNE_SQL_FORMAT_PREFIX + getPruneDate() + WorkDatabaseKt.PRUNE_SQL_FORMAT_SUFFIX;
    }

    public final long getPruneDate() {
        return this.clock.currentTimeMillis() - WorkDatabaseKt.PRUNE_THRESHOLD_MILLIS;
    }

    @Override // androidx.room.RoomDatabase.Callback
    public void onOpen(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.onOpen(db);
        db.beginTransaction();
        try {
            db.execSQL(getPruneSQL());
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }
}
