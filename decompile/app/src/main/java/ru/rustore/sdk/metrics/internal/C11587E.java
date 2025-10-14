package ru.rustore.sdk.metrics.internal;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: ru.rustore.sdk.metrics.internal.E */
/* loaded from: classes5.dex */
public final class C11587E extends Lambda implements Function0<SQLiteDatabase> {

    /* renamed from: a */
    public final /* synthetic */ C11591I f10618a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11587E(C11591I c11591i) {
        super(0);
        this.f10618a = c11591i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SQLiteDatabase invoke() {
        SQLiteDatabase writableDatabase = this.f10618a.f10623a.getWritableDatabase();
        writableDatabase.enableWriteAheadLogging();
        return writableDatabase;
    }
}
