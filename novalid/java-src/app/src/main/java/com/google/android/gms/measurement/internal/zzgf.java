package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes8.dex */
public final class zzgf extends zzh {
    private final zzgi zza;
    private boolean zzb;

    @Override // com.google.android.gms.measurement.internal.zzh
    public final boolean zzz() {
        return false;
    }

    private static long zza(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query(NotificationCompat.CarExtender.KEY_MESSAGES, new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j = cursorQuery.getLong(0);
            cursorQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @VisibleForTesting
    @WorkerThread
    private final SQLiteDatabase zzad() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgg zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgf zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzjq zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzlj zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzls zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zznb zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    /* JADX WARN: Removed duplicated region for block: B:306:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x01fc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AbstractSafeParcelable> zza(int i) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabaseZzad;
        SQLiteDatabase sQLiteDatabase2;
        String str;
        String[] strArr;
        Parcel parcelObtain;
        zzon zzonVarCreateFromParcel;
        zzae zzaeVarCreateFromParcel;
        zzt();
        Cursor cursor = null;
        if (this.zzb) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzae()) {
            return arrayList;
        }
        int i2 = 5;
        int i3 = 0;
        for (int i4 = 5; i3 < i4; i4 = 5) {
            try {
                sQLiteDatabaseZzad = zzad();
                if (sQLiteDatabaseZzad == null) {
                    try {
                        this.zzb = true;
                        if (sQLiteDatabaseZzad != null) {
                            sQLiteDatabaseZzad.close();
                        }
                        return null;
                    } catch (SQLiteFullException e) {
                        e = e;
                        cursorQuery = null;
                        zzj().zzg().zza("Error reading entries from local database", e);
                        this.zzb = true;
                        if (cursorQuery != null) {
                        }
                        if (sQLiteDatabaseZzad != null) {
                        }
                        i3++;
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursorQuery = null;
                        if (sQLiteDatabaseZzad != null) {
                        }
                        zzj().zzg().zza("Error reading entries from local database", e);
                        this.zzb = true;
                        if (cursorQuery != null) {
                        }
                        if (sQLiteDatabaseZzad != null) {
                        }
                        i3++;
                    }
                } else {
                    try {
                        try {
                            sQLiteDatabaseZzad.beginTransaction();
                            long jZza = zza(sQLiteDatabaseZzad);
                            long j = -1;
                            if (jZza != -1) {
                                str = "rowid<?";
                                strArr = new String[]{String.valueOf(jZza)};
                            } else {
                                str = null;
                                strArr = null;
                            }
                            sQLiteDatabase = sQLiteDatabaseZzad;
                            try {
                                cursorQuery = sQLiteDatabaseZzad.query(NotificationCompat.CarExtender.KEY_MESSAGES, new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        j = cursorQuery.getLong(0);
                                        int i5 = cursorQuery.getInt(1);
                                        byte[] blob = cursorQuery.getBlob(2);
                                        if (i5 == 0) {
                                            parcelObtain = Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain.unmarshall(blob, 0, blob.length);
                                                    parcelObtain.setDataPosition(0);
                                                    zzbf zzbfVarCreateFromParcel = zzbf.CREATOR.createFromParcel(parcelObtain);
                                                    if (zzbfVarCreateFromParcel != null) {
                                                        arrayList.add(zzbfVarCreateFromParcel);
                                                    }
                                                } catch (SafeParcelReader.ParseException unused) {
                                                    zzj().zzg().zza("Failed to load event from local database");
                                                    parcelObtain.recycle();
                                                }
                                            } finally {
                                            }
                                        } else if (i5 == 1) {
                                            parcelObtain = Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain.unmarshall(blob, 0, blob.length);
                                                    parcelObtain.setDataPosition(0);
                                                    zzonVarCreateFromParcel = zzon.CREATOR.createFromParcel(parcelObtain);
                                                } catch (SafeParcelReader.ParseException unused2) {
                                                    zzj().zzg().zza("Failed to load user property from local database");
                                                    parcelObtain.recycle();
                                                    zzonVarCreateFromParcel = null;
                                                }
                                                if (zzonVarCreateFromParcel != null) {
                                                    arrayList.add(zzonVarCreateFromParcel);
                                                }
                                            } finally {
                                            }
                                        } else if (i5 == 2) {
                                            parcelObtain = Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain.unmarshall(blob, 0, blob.length);
                                                    parcelObtain.setDataPosition(0);
                                                    zzaeVarCreateFromParcel = zzae.CREATOR.createFromParcel(parcelObtain);
                                                } finally {
                                                }
                                            } catch (SafeParcelReader.ParseException unused3) {
                                                zzj().zzg().zza("Failed to load conditional user property from local database");
                                                parcelObtain.recycle();
                                                zzaeVarCreateFromParcel = null;
                                            }
                                            if (zzaeVarCreateFromParcel != null) {
                                                arrayList.add(zzaeVarCreateFromParcel);
                                            }
                                        } else if (i5 == 3) {
                                            zzj().zzu().zza("Skipping app launch break");
                                        } else {
                                            zzj().zzg().zza("Unknown record type in local database");
                                        }
                                    } catch (SQLiteDatabaseLockedException unused4) {
                                        sQLiteDatabase2 = sQLiteDatabase;
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorQuery != null) {
                                        }
                                        if (sQLiteDatabase2 == null) {
                                        }
                                        i3++;
                                    } catch (SQLiteFullException e3) {
                                        e = e3;
                                        sQLiteDatabaseZzad = sQLiteDatabase;
                                        zzj().zzg().zza("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                        }
                                        if (sQLiteDatabaseZzad != null) {
                                        }
                                        i3++;
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        sQLiteDatabaseZzad = sQLiteDatabase;
                                        if (sQLiteDatabaseZzad != null) {
                                        }
                                        zzj().zzg().zza("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                        }
                                        if (sQLiteDatabaseZzad != null) {
                                        }
                                        i3++;
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = cursorQuery;
                                    }
                                }
                                if (sQLiteDatabase.delete(NotificationCompat.CarExtender.KEY_MESSAGES, "rowid <= ?", new String[]{Long.toString(j)}) < arrayList.size()) {
                                    zzj().zzg().zza("Fewer entries removed from local database than expected");
                                }
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                                cursorQuery.close();
                                sQLiteDatabase.close();
                                return arrayList;
                            } catch (SQLiteDatabaseLockedException unused5) {
                                cursorQuery = null;
                                sQLiteDatabase2 = sQLiteDatabase;
                                SystemClock.sleep(i2);
                                i2 += 20;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (sQLiteDatabase2 == null) {
                                    sQLiteDatabase2.close();
                                }
                                i3++;
                            } catch (SQLiteFullException e5) {
                                e = e5;
                                cursorQuery = null;
                            } catch (SQLiteException e6) {
                                e = e6;
                                cursorQuery = null;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (SQLiteDatabaseLockedException unused6) {
                            sQLiteDatabase = sQLiteDatabaseZzad;
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteDatabase = sQLiteDatabaseZzad;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    } catch (SQLiteFullException e7) {
                        e = e7;
                        cursorQuery = null;
                        zzj().zzg().zza("Error reading entries from local database", e);
                        this.zzb = true;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (sQLiteDatabaseZzad != null) {
                            sQLiteDatabaseZzad.close();
                        }
                        i3++;
                    } catch (SQLiteException e8) {
                        e = e8;
                        cursorQuery = null;
                        if (sQLiteDatabaseZzad != null) {
                            try {
                                if (sQLiteDatabaseZzad.inTransaction()) {
                                    sQLiteDatabaseZzad.endTransaction();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                cursor = cursorQuery;
                                sQLiteDatabase = sQLiteDatabaseZzad;
                                if (cursor != null) {
                                }
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        }
                        zzj().zzg().zza("Error reading entries from local database", e);
                        this.zzb = true;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (sQLiteDatabaseZzad != null) {
                            sQLiteDatabaseZzad.close();
                        }
                        i3++;
                    }
                }
            } catch (SQLiteDatabaseLockedException unused7) {
                cursorQuery = null;
                sQLiteDatabase2 = null;
            } catch (SQLiteFullException e9) {
                e = e9;
                cursorQuery = null;
                sQLiteDatabaseZzad = null;
            } catch (SQLiteException e10) {
                e = e10;
                cursorQuery = null;
                sQLiteDatabaseZzad = null;
            } catch (Throwable th5) {
                th = th5;
                sQLiteDatabase = null;
            }
            if (cursor != null) {
                cursor.close();
            }
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
        zzj().zzu().zza("Failed to read events from database in reasonable time");
        return null;
    }

    public zzgf(zzhy zzhyVar) {
        super(zzhyVar);
        this.zza = new zzgi(this, zza(), "google_app_measurement_local.db");
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @WorkerThread
    public final void zzaa() {
        int iDelete;
        zzt();
        try {
            SQLiteDatabase sQLiteDatabaseZzad = zzad();
            if (sQLiteDatabaseZzad == null || (iDelete = sQLiteDatabaseZzad.delete(NotificationCompat.CarExtender.KEY_MESSAGES, null, null)) <= 0) {
                return;
            }
            zzj().zzp().zza("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error resetting local analytics data. error", e);
        }
    }

    @WorkerThread
    public final boolean zzab() {
        return zza(3, new byte[0]);
    }

    @VisibleForTesting
    private final boolean zzae() {
        return zza().getDatabasePath("google_app_measurement_local.db").exists();
    }

    @WorkerThread
    public final boolean zzac() {
        zzt();
        if (this.zzb || !zzae()) {
            return false;
        }
        int i = 5;
        for (int i2 = 0; i2 < 5; i2++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase sQLiteDatabaseZzad = zzad();
                    if (sQLiteDatabaseZzad == null) {
                        this.zzb = true;
                        if (sQLiteDatabaseZzad != null) {
                            sQLiteDatabaseZzad.close();
                        }
                        return false;
                    }
                    sQLiteDatabaseZzad.beginTransaction();
                    sQLiteDatabaseZzad.delete(NotificationCompat.CarExtender.KEY_MESSAGES, "type == ?", new String[]{Integer.toString(3)});
                    sQLiteDatabaseZzad.setTransactionSuccessful();
                    sQLiteDatabaseZzad.endTransaction();
                    sQLiteDatabaseZzad.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    zzj().zzg().zza("Error deleting app launch break from local database", e);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteFullException e2) {
                zzj().zzg().zza("Error deleting app launch break from local database", e2);
                this.zzb = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        zzj().zzu().zza("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    public final boolean zza(zzae zzaeVar) {
        zzq();
        byte[] bArrZza = zzos.zza((Parcelable) zzaeVar);
        if (bArrZza.length > 131072) {
            zzj().zzn().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return zza(2, bArrZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0128  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zza(int i, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseZzad;
        ?? RawQuery;
        long j;
        zzt();
        ?? r2 = 0;
        if (this.zzb) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            Cursor cursor = null;
            cursor = null;
            cursor = null;
            Cursor cursor2 = null;
            cursor = null;
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabaseZzad = zzad();
                try {
                    if (sQLiteDatabaseZzad == null) {
                        this.zzb = true;
                        if (sQLiteDatabaseZzad != null) {
                            sQLiteDatabaseZzad.close();
                        }
                        return r2;
                    }
                    sQLiteDatabaseZzad.beginTransaction();
                    RawQuery = sQLiteDatabaseZzad.rawQuery("select count(1) from messages", null);
                    if (RawQuery != 0) {
                        try {
                            j = RawQuery.moveToFirst() ? RawQuery.getLong(r2) : 0L;
                        } catch (SQLiteDatabaseLockedException unused) {
                            cursor2 = RawQuery;
                            SystemClock.sleep(i3);
                            i3 += 20;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (sQLiteDatabaseZzad != null) {
                                sQLiteDatabaseZzad.close();
                            }
                            i2++;
                            r2 = 0;
                        } catch (SQLiteFullException e) {
                            e = e;
                            cursor = RawQuery;
                            try {
                                zzj().zzg().zza("Error writing entry; local database full", e);
                                this.zzb = true;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabaseZzad != null) {
                                    sQLiteDatabaseZzad.close();
                                }
                                i2++;
                                r2 = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (cursor != null) {
                                }
                                if (sQLiteDatabaseZzad != null) {
                                }
                                throw th;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteDatabase = sQLiteDatabaseZzad;
                            RawQuery = RawQuery;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabaseZzad = sQLiteDatabase;
                                    cursor = RawQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabaseZzad != null) {
                                        sQLiteDatabaseZzad.close();
                                    }
                                    throw th;
                                }
                            }
                            zzj().zzg().zza("Error writing entry to local database", e);
                            this.zzb = true;
                            if (RawQuery != 0) {
                                RawQuery.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i2++;
                            r2 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = RawQuery;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabaseZzad != null) {
                            }
                            throw th;
                        }
                    }
                    if (j >= 100000) {
                        zzj().zzg().zza("Data loss, local db full");
                        long j2 = 100001 - j;
                        long jDelete = sQLiteDatabaseZzad.delete(NotificationCompat.CarExtender.KEY_MESSAGES, "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                        if (jDelete != j2) {
                            zzj().zzg().zza("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                        }
                    }
                    sQLiteDatabaseZzad.insertOrThrow(NotificationCompat.CarExtender.KEY_MESSAGES, null, contentValues);
                    sQLiteDatabaseZzad.setTransactionSuccessful();
                    sQLiteDatabaseZzad.endTransaction();
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    sQLiteDatabaseZzad.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e3) {
                    e = e3;
                } catch (SQLiteException e4) {
                    e = e4;
                    RawQuery = 0;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabaseZzad = null;
            } catch (SQLiteFullException e5) {
                e = e5;
                sQLiteDatabaseZzad = null;
            } catch (SQLiteException e6) {
                e = e6;
                RawQuery = 0;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabaseZzad = null;
                if (cursor != null) {
                }
                if (sQLiteDatabaseZzad != null) {
                }
                throw th;
            }
        }
        zzj().zzp().zza("Failed to write entry to local database");
        return false;
    }

    public final boolean zza(zzbf zzbfVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzbfVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length > 131072) {
            zzj().zzn().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return zza(0, bArrMarshall);
    }

    public final boolean zza(zzon zzonVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzonVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length > 131072) {
            zzj().zzn().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return zza(1, bArrMarshall);
    }
}
