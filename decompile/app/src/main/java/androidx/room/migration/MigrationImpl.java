package androidx.room.migration;

import androidx.sqlite.p009db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: MigrationExt.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0007H\u0016R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m7105d2 = {"Landroidx/room/migration/MigrationImpl;", "Landroidx/room/migration/Migration;", "startVersion", "", "endVersion", "migrateCallback", "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "(IILkotlin/jvm/functions/Function1;)V", "getMigrateCallback", "()Lkotlin/jvm/functions/Function1;", "migrate", "db", "room-ktx_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class MigrationImpl extends Migration {

    @NotNull
    public final Function1<SupportSQLiteDatabase, Unit> migrateCallback;

    @NotNull
    public final Function1<SupportSQLiteDatabase, Unit> getMigrateCallback() {
        return this.migrateCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MigrationImpl(int i, int i2, @NotNull Function1<? super SupportSQLiteDatabase, Unit> function1) {
        super(i, i2);
        this.migrateCallback = function1;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@NotNull SupportSQLiteDatabase db) {
        this.migrateCallback.invoke(db);
    }
}
