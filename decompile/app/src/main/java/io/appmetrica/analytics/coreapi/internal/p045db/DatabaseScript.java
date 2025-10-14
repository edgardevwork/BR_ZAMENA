package io.appmetrica.analytics.coreapi.internal.p045db;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import java.sql.SQLException;
import org.json.JSONException;

/* loaded from: classes7.dex */
public abstract class DatabaseScript {
    public abstract void runScript(@NonNull SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException;
}
