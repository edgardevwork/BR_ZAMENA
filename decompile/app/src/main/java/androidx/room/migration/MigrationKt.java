package androidx.room.migration;

import androidx.sqlite.p009db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: MigrationExt.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¨\u0006\t"}, m7105d2 = {"Migration", "Landroidx/room/migration/Migration;", "startVersion", "", "endVersion", "migrate", "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "room-ktx_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@JvmName(name = "MigrationKt")
/* loaded from: classes.dex */
public final class MigrationKt {
    @NotNull
    public static final Migration Migration(int i, int i2, @NotNull Function1<? super SupportSQLiteDatabase, Unit> function1) {
        return new MigrationImpl(i, i2, function1);
    }
}
