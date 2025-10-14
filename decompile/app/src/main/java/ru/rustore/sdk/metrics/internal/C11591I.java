package ru.rustore.sdk.metrics.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;
import ru.rustore.sdk.metrics.MetricsException;
import ru.rustore.sdk.metrics.internal.C11605X;

/* renamed from: ru.rustore.sdk.metrics.internal.I */
/* loaded from: classes7.dex */
public final class C11591I {

    /* renamed from: a */
    public final C11628o f10623a;

    /* renamed from: b */
    public final InterfaceC11620g f10624b;

    /* renamed from: c */
    public final Lazy f10625c;

    /* renamed from: ru.rustore.sdk.metrics.internal.I$a */
    /* loaded from: classes5.dex */
    public static final class a extends Lambda implements Function0<String> {

        /* renamed from: a */
        public final /* synthetic */ String f10626a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f10626a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f10626a;
        }
    }

    /* renamed from: ru.rustore.sdk.metrics.internal.I$b */
    /* loaded from: classes5.dex */
    public static final class b extends Lambda implements Function0<String> {

        /* renamed from: a */
        public final /* synthetic */ C11592J f10627a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C11592J c11592j) {
            super(0);
            this.f10627a = c11592j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Create row in storage ");
            sb.append((Object) ("MetricsEventUuid(value=" + this.f10627a.f10628a + ')'));
            return sb.toString();
        }
    }

    public C11591I(C11628o metricsEventDataBaseHelper, C11605X.b logger) {
        Intrinsics.checkNotNullParameter(metricsEventDataBaseHelper, "metricsEventDataBaseHelper");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f10623a = metricsEventDataBaseHelper;
        this.f10624b = logger;
        this.f10625c = LazyKt__LazyJVMKt.lazy(new C11587E(this));
    }

    /* renamed from: a */
    public final void m7484a(ArrayList persistentMetricsEventsDto) throws IOException {
        Intrinsics.checkNotNullParameter(persistentMetricsEventsDto, "persistentMetricsEventsDto");
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(persistentMetricsEventsDto, null, null, null, 0, null, C11589G.f10620a, 31, null);
        String strTrimIndent = StringsKt__IndentKt.trimIndent("\n            DELETE FROM metrics_event_table\n            WHERE _id IN (\n                SELECT _id FROM metrics_event_table\n                WHERE uuid IN (" + strJoinToString$default + ")\n            )\n        ");
        try {
            ((SQLiteDatabase) this.f10625c.getValue()).beginTransactionNonExclusive();
            ((SQLiteDatabase) this.f10625c.getValue()).execSQL(strTrimIndent);
            ((SQLiteDatabase) this.f10625c.getValue()).setTransactionSuccessful();
            ((SQLiteDatabase) this.f10625c.getValue()).endTransaction();
            this.f10624b.mo7493a(new C11588F(strJoinToString$default));
        } finally {
        }
    }

    /* renamed from: a */
    public final void m7485a(C11592J persistentMetricsEventDto) throws MetricsException.SaveMetricsEventError {
        Intrinsics.checkNotNullParameter(persistentMetricsEventDto, "persistentMetricsEventDto");
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.UUID, persistentMetricsEventDto.f10628a);
        contentValues.put("metrics_event", persistentMetricsEventDto.f10629b);
        try {
            ((SQLiteDatabase) this.f10625c.getValue()).beginTransactionNonExclusive();
            long jInsert = ((SQLiteDatabase) this.f10625c.getValue()).insert("metrics_event_table", null, contentValues);
            ((SQLiteDatabase) this.f10625c.getValue()).setTransactionSuccessful();
            ((SQLiteDatabase) this.f10625c.getValue()).endTransaction();
            if (jInsert != -1) {
                this.f10624b.mo7493a(new b(persistentMetricsEventDto));
                return;
            }
            StringBuilder sb = new StringBuilder("Saving error ");
            sb.append((Object) ("MetricsEventUuid(value=" + persistentMetricsEventDto.f10628a + ')'));
            String string = sb.toString();
            this.f10624b.mo7493a(new a(string));
            throw new MetricsException.SaveMetricsEventError(string);
        } finally {
        }
    }
}
