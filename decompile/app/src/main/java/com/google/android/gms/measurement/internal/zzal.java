package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzje;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.ivy.core.event.IvyEventFilter;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes8.dex */
final class zzal extends zznr {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzf = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] zzj = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final String[] zzk = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    private final zzat zzl;
    private final zznl zzm;

    @WorkerThread
    public final int zza(String str, String str2) throws IllegalStateException {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            return m1091e_().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting conditional property", zzgo.zza(str), zzi().zzc(str2), e);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    public final boolean zzc() {
        return false;
    }

    public final long zza(String str) throws IllegalStateException {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        try {
            return m1091e_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, zze().zzb(str, zzbh.zzp))))});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting over the limit events. appId", zzgo.zza(str), e);
            return 0L;
        }
    }

    /* renamed from: b_ */
    public final long m1088b_() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m1091e_().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return -1L;
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying raw events", e);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final long zza(zzfy.zzk zzkVar) throws IllegalStateException, IOException {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotEmpty(zzkVar.zzz());
        byte[] bArrZzca = zzkVar.zzca();
        long jZza = mo1095g_().zza(bArrZzca);
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, zzkVar.zzz());
        contentValues.put("metadata_fingerprint", Long.valueOf(jZza));
        contentValues.put("metadata", bArrZzca);
        try {
            m1091e_().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jZza;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing raw event metadata. appId", zzgo.zza(zzkVar.zzz()), e);
            throw e;
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final long zzb(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        SQLiteDatabase sQLiteDatabaseM1091e_ = m1091e_();
        sQLiteDatabaseM1091e_.beginTransaction();
        long j = 0;
        try {
            try {
                long jZza = zza("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (jZza == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(CommonUrlParts.APP_ID, str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseM1091e_.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzj().zzg().zza("Failed to insert column (got -1). appId", zzgo.zza(str), str2);
                        return -1L;
                    }
                    jZza = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(CommonUrlParts.APP_ID, str);
                    contentValues2.put(str2, Long.valueOf(1 + jZza));
                    if (sQLiteDatabaseM1091e_.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        zzj().zzg().zza("Failed to update column (got 0). appId", zzgo.zza(str), str2);
                        return -1L;
                    }
                    sQLiteDatabaseM1091e_.setTransactionSuccessful();
                    return jZza;
                } catch (SQLiteException e) {
                    long j2 = jZza;
                    e = e;
                    j = j2;
                    zzj().zzg().zza("Error inserting column. appId", zzgo.zza(str), str2, e);
                    sQLiteDatabaseM1091e_.endTransaction();
                    return j;
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } finally {
            sQLiteDatabaseM1091e_.endTransaction();
        }
    }

    @WorkerThread
    public final long zzb(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        return zza("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    @WorkerThread
    /* renamed from: c_ */
    public final long m1089c_() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    @WorkerThread
    /* renamed from: d_ */
    public final long m1090d_() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final long zzc(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @WorkerThread
    private final long zzb(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m1091e_().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    long j = cursorRawQuery.getLong(0);
                    cursorRawQuery.close();
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    private final long zza(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m1091e_().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    long j2 = cursorRawQuery.getLong(0);
                    cursorRawQuery.close();
                    return j2;
                }
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    @VisibleForTesting
    @WorkerThread
    /* renamed from: e_ */
    public final SQLiteDatabase m1091e_() {
        zzt();
        try {
            return this.zzl.getWritableDatabase();
        } catch (SQLiteException e) {
            zzj().zzu().zza("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:49:0x002d */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle zzd(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        zzt();
        zzal();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = m1091e_().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
            } catch (SQLiteException e) {
                e = e;
                cursorRawQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                }
                throw th;
            }
            try {
                if (!cursorRawQuery.moveToFirst()) {
                    zzj().zzp().zza("Default event parameters not found");
                    cursorRawQuery.close();
                    return null;
                }
                try {
                    zzfy.zzf zzfVar = (zzfy.zzf) ((com.google.android.gms.internal.measurement.zzjt) ((zzfy.zzf.zza) zzoo.zza(zzfy.zzf.zze(), cursorRawQuery.getBlob(0))).zzai());
                    mo1095g_();
                    Bundle bundleZza = zzoo.zza(zzfVar.zzh());
                    cursorRawQuery.close();
                    return bundleZza;
                } catch (IOException e2) {
                    zzj().zzg().zza("Failed to retrieve default event parameters. appId", zzgo.zza(str), e2);
                    cursorRawQuery.close();
                    return null;
                }
            } catch (SQLiteException e3) {
                e = e3;
                zzj().zzg().zza("Error selecting default event parameters", e);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0031: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:49:0x0031 */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<zzfy.zzf, Long> zza(String str, Long l) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        zzt();
        zzal();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = m1091e_().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l)});
            } catch (SQLiteException e) {
                e = e;
                cursorRawQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                }
                throw th;
            }
            try {
                if (!cursorRawQuery.moveToFirst()) {
                    zzj().zzp().zza("Main event not found");
                    cursorRawQuery.close();
                    return null;
                }
                try {
                    Pair<zzfy.zzf, Long> pairCreate = Pair.create((zzfy.zzf) ((com.google.android.gms.internal.measurement.zzjt) ((zzfy.zzf.zza) zzoo.zza(zzfy.zzf.zze(), cursorRawQuery.getBlob(0))).zzai()), Long.valueOf(cursorRawQuery.getLong(1)));
                    cursorRawQuery.close();
                    return pairCreate;
                } catch (IOException e2) {
                    zzj().zzg().zza("Failed to merge main event. appId, eventId", zzgo.zza(str), l, e2);
                    cursorRawQuery.close();
                    return null;
                }
            } catch (SQLiteException e3) {
                e = e3;
                zzj().zzg().zza("Error selecting main event", e);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:253:0x0383  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzg zze(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        Cursor cursor = null;
        try {
            cursorQuery = m1091e_().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info"}, "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e) {
            e = e;
            cursorQuery = null;
        } catch (Throwable th) {
            th = th;
            if (cursor != null) {
            }
            throw th;
        }
        try {
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                zzg zzgVar = new zzg(this.zzg.zzk(), str);
                if (!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zza(zzbh.zzcy) || this.zzg.zzb(str).zza(zzje.zza.ANALYTICS_STORAGE)) {
                    zzgVar.zzb(cursorQuery.getString(0));
                }
                zzgVar.zzf(cursorQuery.getString(1));
                if (!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zza(zzbh.zzcy) || this.zzg.zzb(str).zza(zzje.zza.AD_STORAGE)) {
                    zzgVar.zzh(cursorQuery.getString(2));
                }
                zzgVar.zzq(cursorQuery.getLong(3));
                zzgVar.zzr(cursorQuery.getLong(4));
                zzgVar.zzp(cursorQuery.getLong(5));
                zzgVar.zzd(cursorQuery.getString(6));
                zzgVar.zzc(cursorQuery.getString(7));
                zzgVar.zzn(cursorQuery.getLong(8));
                zzgVar.zzk(cursorQuery.getLong(9));
                zzgVar.zzb(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                zzgVar.zzj(cursorQuery.getLong(11));
                zzgVar.zzh(cursorQuery.getLong(12));
                zzgVar.zzg(cursorQuery.getLong(13));
                zzgVar.zze(cursorQuery.getLong(14));
                zzgVar.zzd(cursorQuery.getLong(15));
                zzgVar.zzm(cursorQuery.getLong(16));
                zzgVar.zzb(cursorQuery.isNull(17) ? ParserMinimalBase.MIN_INT_L : cursorQuery.getInt(17));
                zzgVar.zze(cursorQuery.getString(18));
                zzgVar.zzf(cursorQuery.getLong(19));
                zzgVar.zzi(cursorQuery.getLong(20));
                zzgVar.zzg(cursorQuery.getString(21));
                zzgVar.zza(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                zzgVar.zza(cursorQuery.getString(24));
                zzgVar.zzl(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                if (!cursorQuery.isNull(26)) {
                    zzgVar.zza(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                }
                if (!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zza(zzbh.zzcy) || this.zzg.zzb(str).zza(zzje.zza.ANALYTICS_STORAGE)) {
                    zzgVar.zzj(cursorQuery.getString(28));
                }
                if (zzpu.zza() && zze().zza(zzbh.zzbx)) {
                    zzq();
                    if (zzos.zzf(str)) {
                        zzgVar.zzc((cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true);
                        zzgVar.zzo(cursorQuery.getLong(39));
                        if (zze().zza(zzbh.zzby)) {
                            zzgVar.zzk(cursorQuery.getString(36));
                        }
                    }
                }
                zzgVar.zzt(cursorQuery.getLong(30));
                zzgVar.zzs(cursorQuery.getLong(31));
                if (zzpn.zza() && zze().zze(str, zzbh.zzch)) {
                    zzgVar.zza(cursorQuery.getInt(32));
                    zzgVar.zzc(cursorQuery.getLong(35));
                }
                zzgVar.zzd((cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true);
                if (cursorQuery.isNull(34)) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                }
                zzgVar.zza(boolValueOf);
                zzgVar.zzc(cursorQuery.getInt(37));
                zzgVar.zzb(cursorQuery.getInt(38));
                zzgVar.zzi(cursorQuery.isNull(40) ? "" : (String) Preconditions.checkNotNull(cursorQuery.getString(40)));
                if (zze().zza(zzbh.zzcw)) {
                    if (!cursorQuery.isNull(41)) {
                        zzgVar.zza(Long.valueOf(cursorQuery.getLong(41)));
                    }
                    if (!cursorQuery.isNull(42)) {
                        zzgVar.zzb(Long.valueOf(cursorQuery.getLong(42)));
                    }
                }
                if (zzov.zza() && zze().zze(str, zzbh.zzcu)) {
                    zzgVar.zza(cursorQuery.getBlob(43));
                }
                zzgVar.zzao();
                if (cursorQuery.moveToNext()) {
                    zzj().zzg().zza("Got multiple records for app, expected one. appId", zzgo.zza(str));
                }
                cursorQuery.close();
                return zzgVar;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            zzj().zzg().zza("Error querying app. appId", zzgo.zza(str), e);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0053: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:55:0x0053 */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011c  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzae zzc(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = m1091e_().query("conditional_properties", new String[]{"origin", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            } catch (SQLiteException e) {
                e = e;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                }
                throw th;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                String string = cursorQuery.getString(0);
                if (string == null) {
                    string = "";
                }
                String str3 = string;
                Object objZza = zza(cursorQuery, 1);
                boolean z = cursorQuery.getInt(2) != 0;
                String string2 = cursorQuery.getString(3);
                long j = cursorQuery.getLong(4);
                zzoo zzooVarMo1095g_ = mo1095g_();
                byte[] blob = cursorQuery.getBlob(5);
                Parcelable.Creator<zzbf> creator = zzbf.CREATOR;
                zzae zzaeVar = new zzae(str, str3, new zzon(str2, cursorQuery.getLong(8), objZza, str3), cursorQuery.getLong(6), z, string2, (zzbf) zzooVarMo1095g_.zza(blob, creator), j, (zzbf) mo1095g_().zza(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzbf) mo1095g_().zza(cursorQuery.getBlob(10), creator));
                if (cursorQuery.moveToNext()) {
                    zzj().zzg().zza("Got multiple records for conditional property, expected one", zzgo.zza(str), zzi().zzc(str2));
                }
                cursorQuery.close();
                return zzaeVar;
            } catch (SQLiteException e2) {
                e = e2;
                zzj().zzg().zza("Error querying conditional property", zzgo.zza(str), zzi().zzc(str2), e);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0059: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:52:0x0059 */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0089  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzan zzf(String str) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = m1091e_().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            } catch (SQLiteException e) {
                e = e;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                }
                throw th;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                byte[] blob = cursorQuery.getBlob(0);
                String string = cursorQuery.getString(1);
                String string2 = cursorQuery.getString(2);
                if (cursorQuery.moveToNext()) {
                    zzj().zzg().zza("Got multiple records for app config, expected one. appId", zzgo.zza(str));
                }
                if (blob == null) {
                    cursorQuery.close();
                    return null;
                }
                zzan zzanVar = new zzan(blob, string, string2);
                cursorQuery.close();
                return zzanVar;
            } catch (SQLiteException e2) {
                e = e2;
                zzj().zzg().zza("Error querying remote config. appId", zzgo.zza(str), e);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final zzaq zza(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return zza(j, str, 1L, false, false, z3, false, z5, z6, z7);
    }

    @WorkerThread
    public final zzaq zza(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        String[] strArr = {str};
        zzaq zzaqVar = new zzaq();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM1091e_ = m1091e_();
                Cursor cursorQuery = sQLiteDatabaseM1091e_.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    zzj().zzu().zza("Not updating daily counts, app is not known. appId", zzgo.zza(str));
                    cursorQuery.close();
                    return zzaqVar;
                }
                if (cursorQuery.getLong(0) == j) {
                    zzaqVar.zzb = cursorQuery.getLong(1);
                    zzaqVar.zza = cursorQuery.getLong(2);
                    zzaqVar.zzc = cursorQuery.getLong(3);
                    zzaqVar.zzd = cursorQuery.getLong(4);
                    zzaqVar.zze = cursorQuery.getLong(5);
                    zzaqVar.zzf = cursorQuery.getLong(6);
                    zzaqVar.zzg = cursorQuery.getLong(7);
                }
                if (z) {
                    zzaqVar.zzb += j2;
                }
                if (z2) {
                    zzaqVar.zza += j2;
                }
                if (z3) {
                    zzaqVar.zzc += j2;
                }
                if (z4) {
                    zzaqVar.zzd += j2;
                }
                if (z5) {
                    zzaqVar.zze += j2;
                }
                if (z6) {
                    zzaqVar.zzf += j2;
                }
                if (z7) {
                    zzaqVar.zzg += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(zzaqVar.zza));
                contentValues.put("daily_events_count", Long.valueOf(zzaqVar.zzb));
                contentValues.put("daily_conversions_count", Long.valueOf(zzaqVar.zzc));
                contentValues.put("daily_error_events_count", Long.valueOf(zzaqVar.zzd));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzaqVar.zze));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzaqVar.zzf));
                contentValues.put("daily_registered_triggers_count", Long.valueOf(zzaqVar.zzg));
                sQLiteDatabaseM1091e_.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return zzaqVar;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error updating daily counts. appId", zzgo.zza(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return zzaqVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final zzax zzg(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        return zzax.zza(zza("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    @WorkerThread
    public final zzbb zzd(String str, String str2) {
        return zzc("events", str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012c  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzbb zzc(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        zzt();
        zzal();
        AbstractWindowedCursor abstractWindowedCursor = 0;
        try {
            try {
                cursorQuery = m1091e_().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            } catch (SQLiteException e) {
                e = e;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (abstractWindowedCursor != 0) {
                }
                throw th;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                long j = cursorQuery.getLong(0);
                long j2 = cursorQuery.getLong(1);
                long j3 = cursorQuery.getLong(2);
                long j4 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                if (cursorQuery.isNull(7)) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                }
                zzbb zzbbVar = new zzbb(str2, str3, j, j2, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j3, j4, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                if (cursorQuery.moveToNext()) {
                    zzj().zzg().zza("Got multiple records for event aggregates, expected one. appId", zzgo.zza(str2));
                }
                cursorQuery.close();
                return zzbbVar;
            } catch (SQLiteException e2) {
                e = e2;
                zzj().zzg().zza("Error querying events. appId", zzgo.zza(str2), zzi().zza(str3), e);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            abstractWindowedCursor = "current_bundle_count";
            if (abstractWindowedCursor != 0) {
                abstractWindowedCursor.close();
            }
            throw th;
        }
    }

    public final zzje zzh(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        return zzje.zzb(zza("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final zzje zzi(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        zzje zzjeVar = (zzje) zza("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new zzau() { // from class: com.google.android.gms.measurement.internal.zzao
            @Override // com.google.android.gms.measurement.internal.zzau
            public final Object zza(Cursor cursor) {
                return zzje.zza(cursor.getString(0), cursor.getInt(1));
            }
        });
        return zzjeVar == null ? zzje.zza : zzjeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017f  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzoj zzj(String str) throws Throwable {
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        boolean zZza = zzpu.zza();
        Cursor cursor = null;
        ?? r0 = zZza;
        if (zZza) {
            boolean zZza2 = zze().zza(zzbh.zzcb);
            r0 = zZza2;
            if (!zZza2) {
                return null;
            }
        }
        try {
            try {
                cursorQuery = m1091e_().query("upload_queue", new String[]{"rowId", CommonUrlParts.APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count"}, "app_id=? AND NOT " + zzao(), new String[]{str}, null, null, "creation_timestamp ASC", "1");
            } catch (SQLiteException e) {
                e = e;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                }
                throw th;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                String string = cursorQuery.getString(3);
                if (TextUtils.isEmpty(string)) {
                    zzj().zzc().zza("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
                    cursorQuery.close();
                    return null;
                }
                try {
                    zzfy.zzj.zza zzaVar = (zzfy.zzj.zza) zzoo.zza(zzfy.zzj.zzb(), cursorQuery.getBlob(2));
                    zznt zzntVar = zznt.values()[cursorQuery.getInt(5)];
                    if (zzntVar == zznt.SGTM || zzntVar == zznt.GOOGLE_ANALYTICS) {
                        if (cursorQuery.getInt(6) > 0) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<zzfy.zzk> it = zzaVar.zzd().iterator();
                            while (it.hasNext()) {
                                zzfy.zzk.zza zzaVarZzcd = it.next().zzcd();
                                zzaVarZzcd.zzi(cursorQuery.getInt(6));
                                arrayList.add((zzfy.zzk) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai()));
                            }
                            zzaVar.zzb();
                            zzaVar.zza(arrayList);
                        }
                    }
                    HashMap map = new HashMap();
                    String string2 = cursorQuery.getString(4);
                    if (string2 != null) {
                        String[] strArrSplit = string2.split("\r\n");
                        int length = strArrSplit.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            String str2 = strArrSplit[i];
                            if (str2.isEmpty()) {
                                break;
                            }
                            String[] strArrSplit2 = str2.split(URLEncodedUtils.NAME_VALUE_SEPARATOR, 2);
                            if (strArrSplit2.length != 2) {
                                zzj().zzg().zza("Invalid upload header: ", str2);
                                break;
                            }
                            map.put(strArrSplit2[0], strArrSplit2[1]);
                            i++;
                        }
                    }
                    zzoj zzojVarZza = new zzom().zza(cursorQuery.getLong(0)).zza((zzfy.zzj) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai())).zza(string).zza(map).zza(zzntVar).zza();
                    cursorQuery.close();
                    return zzojVarZza;
                } catch (IOException e2) {
                    zzj().zzg().zza("Failed to queued MeasurementBatch from upload_queue. appId", str, e2);
                    cursorQuery.close();
                    return null;
                }
            } catch (SQLiteException e3) {
                e = e3;
                zzj().zzg().zza("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = r0;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:58:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0097  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzop zze(String str, String str2) {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = m1091e_().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            } catch (SQLiteException e) {
                e = e;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                }
                throw th;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                long j = cursorQuery.getLong(0);
                Object objZza = zza(cursorQuery, 1);
                if (objZza == null) {
                    cursorQuery.close();
                    return null;
                }
                zzop zzopVar = new zzop(str, cursorQuery.getString(2), str2, j, objZza);
                if (cursorQuery.moveToNext()) {
                    zzj().zzg().zza("Got multiple records for user property, expected one. appId", zzgo.zza(str));
                }
                cursorQuery.close();
                return zzopVar;
            } catch (SQLiteException e2) {
                e = e2;
                zzj().zzg().zza("Error querying user property. appId", zzgo.zza(str), zzi().zzc(str2), e);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @VisibleForTesting
    @WorkerThread
    private final Object zza(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzj().zzg().zza("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type == 4) {
            zzj().zzg().zza("Loaded invalid blob type value, ignoring it");
            return null;
        }
        zzj().zzg().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> T zza(String str, String[] strArr, zzau<T> zzauVar) throws Throwable {
        Cursor cursorRawQuery;
        ?? r0 = 0;
        try {
            try {
                cursorRawQuery = m1091e_().rawQuery(str, strArr);
            } catch (SQLiteException e) {
                e = e;
                cursorRawQuery = null;
            } catch (Throwable th) {
                th = th;
                if (r0 != 0) {
                }
                throw th;
            }
            try {
                if (!cursorRawQuery.moveToFirst()) {
                    zzj().zzp().zza("No data found");
                    cursorRawQuery.close();
                    return null;
                }
                T tZza = zzauVar.zza(cursorRawQuery);
                cursorRawQuery.close();
                return tZza;
            } catch (SQLiteException e2) {
                e = e2;
                zzj().zzg().zza("Error querying database.", e);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            r0 = str;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    private final String zzao() {
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        zznt zzntVar = zznt.GOOGLE_SIGNAL;
        return "(" + ("(upload_type = " + zzntVar.zza() + " AND (ABS(creation_timestamp - " + jCurrentTimeMillis + ") > CAST(" + zzbh.zzaf.zza(null).longValue() + " AS INTEGER)))") + IvyEventFilter.f9956OR + ("(upload_type != " + zzntVar.zza() + " AND (ABS(creation_timestamp - " + jCurrentTimeMillis + ") > CAST(" + zzag.zzm() + " AS INTEGER)))") + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zza(long j) throws Throwable {
        Cursor cursorRawQuery;
        zzt();
        zzal();
        Cursor cursor = null;
        try {
            try {
                cursorRawQuery = m1091e_().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(j)});
            } catch (SQLiteException e) {
                e = e;
                cursorRawQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                }
                throw th;
            }
            try {
                if (!cursorRawQuery.moveToFirst()) {
                    zzj().zzp().zza("No expired configs for apps with pending events");
                    cursorRawQuery.close();
                    return null;
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e2) {
                e = e2;
                zzj().zzg().zza("Error selecting expired configs", e);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = j;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    @WorkerThread
    /* renamed from: f_ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m1092f_() throws Throwable {
        Throwable th;
        Cursor cursorRawQuery;
        ?? M1091e_ = m1091e_();
        try {
            try {
                cursorRawQuery = M1091e_.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            } catch (SQLiteException e) {
                e = e;
                cursorRawQuery = null;
            } catch (Throwable th2) {
                th = th2;
                M1091e_ = 0;
                if (M1091e_ != 0) {
                }
                throw th;
            }
            try {
                if (cursorRawQuery.moveToFirst()) {
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                }
                cursorRawQuery.close();
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                zzj().zzg().zza("Database error getting next bundle app id", e);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            if (M1091e_ != 0) {
                M1091e_.close();
            }
            throw th;
        }
    }

    @WorkerThread
    private final String zza(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m1091e_().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                }
                cursorRawQuery.close();
                return str2;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final List<Pair<zzfy.zzk, Long>> zza(String str, int i, int i2) {
        byte[] bArrZzc;
        long jZzc;
        long jZzc2;
        zzt();
        zzal();
        int i3 = 1;
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m1091e_().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!cursorQuery.moveToFirst()) {
                    List<Pair<zzfy.zzk, Long>> listEmptyList = Collections.emptyList();
                    cursorQuery.close();
                    return listEmptyList;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (true) {
                    long j = cursorQuery.getLong(0);
                    try {
                        bArrZzc = mo1095g_().zzc(cursorQuery.getBlob(i3));
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to unzip queued bundle. appId", zzgo.zza(str), e);
                    }
                    if (!arrayList.isEmpty() && bArrZzc.length + length > i2) {
                        break;
                    }
                    try {
                        zzfy.zzk.zza zzaVar = (zzfy.zzk.zza) zzoo.zza(zzfy.zzk.zzw(), bArrZzc);
                        if (!arrayList.isEmpty()) {
                            zzfy.zzk zzkVar = (zzfy.zzk) ((Pair) arrayList.get(0)).first;
                            zzfy.zzk zzkVar2 = (zzfy.zzk) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai());
                            if (!zzkVar.zzae().equals(zzkVar2.zzae()) || !zzkVar.zzad().equals(zzkVar2.zzad()) || zzkVar.zzau() != zzkVar2.zzau() || !zzkVar.zzaf().equals(zzkVar2.zzaf())) {
                                break;
                            }
                            Iterator<zzfy.zzo> it = zzkVar.zzas().iterator();
                            while (true) {
                                jZzc = -1;
                                if (!it.hasNext()) {
                                    jZzc2 = -1;
                                    break;
                                }
                                zzfy.zzo next = it.next();
                                if ("_npa".equals(next.zzg())) {
                                    jZzc2 = next.zzc();
                                    break;
                                }
                            }
                            Iterator<zzfy.zzo> it2 = zzkVar2.zzas().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                zzfy.zzo next2 = it2.next();
                                if ("_npa".equals(next2.zzg())) {
                                    jZzc = next2.zzc();
                                    break;
                                }
                            }
                            if (jZzc2 != jZzc) {
                                break;
                            }
                        }
                        if (!cursorQuery.isNull(2)) {
                            zzaVar.zzi(cursorQuery.getInt(2));
                        }
                        length += bArrZzc.length;
                        arrayList.add(Pair.create((zzfy.zzk) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai()), Long.valueOf(j)));
                    } catch (IOException e2) {
                        zzj().zzg().zza("Failed to merge queued bundle. appId", zzgo.zza(str), e2);
                    }
                    if (!cursorQuery.moveToNext() || length > i2) {
                        break;
                    }
                    i3 = 1;
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Error querying bundles. appId", zzgo.zza(str), e3);
                List<Pair<zzfy.zzk, Long>> listEmptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return listEmptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final List<zzae> zza(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return zza(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0050, code lost:
    
        zzj().zzg().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zzae> zza(String str, String[] strArr) {
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m1091e_().query("conditional_properties", new String[]{CommonUrlParts.APP_ID, "origin", "name", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (true) {
                    if (arrayList.size() >= 1000) {
                        break;
                    }
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objZza = zza(cursorQuery, 3);
                    boolean z = cursorQuery.getInt(4) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j = cursorQuery.getLong(6);
                    zzoo zzooVarMo1095g_ = mo1095g_();
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<zzbf> creator = zzbf.CREATOR;
                    zzbf zzbfVar = (zzbf) zzooVarMo1095g_.zza(blob, creator);
                    arrayList.add(new zzae(string, string2, new zzon(string3, cursorQuery.getLong(10), objZza, string2), cursorQuery.getLong(8), z, string4, zzbfVar, j, (zzbf) mo1095g_().zza(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (zzbf) mo1095g_().zza(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying conditional user property value", e);
                List<zzae> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final List<zzno> zzk(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m1091e_().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new zzno(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying trigger uris. appId", zzgo.zza(str), e);
                List<zzno> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final List<zzop> zzl(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m1091e_().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = cursorQuery.getLong(2);
                    Object objZza = zza(cursorQuery, 3);
                    if (objZza == null) {
                        zzj().zzg().zza("Read invalid user property value, ignoring it. appId", zzgo.zza(str));
                    } else {
                        arrayList.add(new zzop(str, str2, string, j, objZza));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying user properties. appId", zzgo.zza(str), e);
                List<zzop> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x00a1, code lost:
    
        zzj().zzg().zza("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0126  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zzop> zzb(String str, String str2, String str3) throws Throwable {
        String str4;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb = new StringBuilder("app_id=?");
                    if (TextUtils.isEmpty(str2)) {
                        str4 = str2;
                    } else {
                        str4 = str2;
                        try {
                            arrayList2.add(str4);
                            sb.append(" and origin=?");
                        } catch (SQLiteException e) {
                            e = e;
                            zzj().zzg().zza("(2)Error querying user properties", zzgo.zza(str), str4, e);
                            List<zzop> listEmptyList = Collections.emptyList();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return listEmptyList;
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + "*");
                        sb.append(" and name glob ?");
                    }
                    cursorQuery = m1091e_().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb.toString(), (String[]) arrayList2.toArray(new String[arrayList2.size()]), null, null, "rowid", "1001");
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                    while (true) {
                        if (arrayList.size() >= 1000) {
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        long j = cursorQuery.getLong(1);
                        try {
                            try {
                                Object objZza = zza(cursorQuery, 2);
                                String string2 = cursorQuery.getString(3);
                                if (objZza == null) {
                                    try {
                                        zzj().zzg().zza("(2)Read invalid user property value, ignoring it", zzgo.zza(str), string2, str3);
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        str4 = string2;
                                        zzj().zzg().zza("(2)Error querying user properties", zzgo.zza(str), str4, e);
                                        List<zzop> listEmptyList2 = Collections.emptyList();
                                        if (cursorQuery != null) {
                                        }
                                        return listEmptyList2;
                                    }
                                } else {
                                    arrayList.add(new zzop(str, string2, string, j, objZza));
                                }
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                }
                                str4 = string2;
                            } catch (Throwable th) {
                                th = th;
                                if (cursorQuery != null) {
                                }
                                throw th;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                        }
                    }
                    cursorQuery.close();
                    return arrayList;
                } catch (SQLiteException e4) {
                    e = e4;
                    str4 = str2;
                    zzj().zzg().zza("(2)Error querying user properties", zzgo.zza(str), str4, e);
                    List<zzop> listEmptyList22 = Collections.emptyList();
                    if (cursorQuery != null) {
                    }
                    return listEmptyList22;
                }
            } catch (SQLiteException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final Map<Integer, zzfy.zzm> zzm(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m1091e_().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, zzfy.zzm> mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                ArrayMap arrayMap = new ArrayMap();
                do {
                    int i = cursorQuery.getInt(0);
                    try {
                        arrayMap.put(Integer.valueOf(i), (zzfy.zzm) ((com.google.android.gms.internal.measurement.zzjt) ((zzfy.zzm.zza) zzoo.zza(zzfy.zzm.zze(), cursorQuery.getBlob(1))).zzai()));
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter results. appId, audienceId, error", zzgo.zza(str), Integer.valueOf(i), e);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filter results. appId", zzgo.zza(str), e2);
                Map<Integer, zzfy.zzm> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final Map<Integer, List<zzfo.zzb>> zzn(String str) {
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m1091e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<zzfo.zzb>> mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        zzfo.zzb zzbVar = (zzfo.zzb) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zzb.zza) zzoo.zza(zzfo.zzb.zzc(), cursorQuery.getBlob(1))).zzai());
                        if (zzbVar.zzk()) {
                            int i = cursorQuery.getInt(0);
                            List arrayList = (List) arrayMap.get(Integer.valueOf(i));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), arrayList);
                            }
                            arrayList.add(zzbVar);
                        }
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzgo.zza(str), e);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e2);
                Map<Integer, List<zzfo.zzb>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final Map<Integer, List<zzfo.zzb>> zzf(String str, String str2) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m1091e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<zzfo.zzb>> mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        zzfo.zzb zzbVar = (zzfo.zzb) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zzb.zza) zzoo.zza(zzfo.zzb.zzc(), cursorQuery.getBlob(1))).zzai());
                        int i = cursorQuery.getInt(0);
                        List arrayList = (List) arrayMap.get(Integer.valueOf(i));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            arrayMap.put(Integer.valueOf(i), arrayList);
                        }
                        arrayList.add(zzbVar);
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzgo.zza(str), e);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e2);
                Map<Integer, List<zzfo.zzb>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final Map<Integer, List<zzfo.zze>> zzg(String str, String str2) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m1091e_().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<zzfo.zze>> mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        zzfo.zze zzeVar = (zzfo.zze) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zze.zza) zzoo.zza(zzfo.zze.zzc(), cursorQuery.getBlob(1))).zzai());
                        int i = cursorQuery.getInt(0);
                        List arrayList = (List) arrayMap.get(Integer.valueOf(i));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            arrayMap.put(Integer.valueOf(i), arrayList);
                        }
                        arrayList.add(zzeVar);
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter", zzgo.zza(str), e);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e2);
                Map<Integer, List<zzfo.zze>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final Map<Integer, List<Integer>> zzo(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m1091e_().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!cursorRawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> mapEmptyMap = Collections.emptyMap();
                    cursorRawQuery.close();
                    return mapEmptyMap;
                }
                do {
                    int i = cursorRawQuery.getInt(0);
                    List arrayList = (List) arrayMap.get(Integer.valueOf(i));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        arrayMap.put(Integer.valueOf(i), arrayList);
                    }
                    arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                } while (cursorRawQuery.moveToNext());
                cursorRawQuery.close();
                return arrayMap;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error querying scoped filters. appId", zzgo.zza(str), e);
                Map<Integer, List<Integer>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public zzal(zznv zznvVar) {
        super(zznvVar);
        this.zzm = new zznl(zzb());
        this.zzl = new zzat(this, zza(), "google_app_measurement.db");
    }

    public final void zza(String str, Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        zzt();
        zzal();
        zzar zzarVar = new zzar(this, str);
        for (List<zzap> listZza = zzarVar.zza(); !listZza.isEmpty(); listZza = zzarVar.zza()) {
            for (zzap zzapVar : listZza) {
                zzoo zzooVarMo1095g_ = mo1095g_();
                zzfy.zzf zzfVar = zzapVar.zzd;
                Bundle bundle2 = new Bundle();
                for (zzfy.zzh zzhVar : zzfVar.zzh()) {
                    if (zzhVar.zzj()) {
                        bundle2.putDouble(zzhVar.zzg(), zzhVar.zza());
                    } else if (zzhVar.zzk()) {
                        bundle2.putFloat(zzhVar.zzg(), zzhVar.zzb());
                    } else if (zzhVar.zzl()) {
                        bundle2.putLong(zzhVar.zzg(), zzhVar.zzd());
                    } else if (zzhVar.zzn()) {
                        bundle2.putString(zzhVar.zzg(), zzhVar.zzh());
                    } else if (!zzhVar.zzi().isEmpty()) {
                        bundle2.putParcelableArray(zzhVar.zzg(), zzoo.zzb(zzhVar.zzi()));
                    } else {
                        zzooVarMo1095g_.zzj().zzg().zza("Unexpected parameter type for parameter", zzhVar);
                    }
                }
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                String strZzg = zzfVar.zzg();
                if (string == null) {
                    string = "";
                }
                zzgs zzgsVar = new zzgs(strZzg, string, bundle2, zzfVar.zzd());
                zzq().zza(zzgsVar.zzc, bundle);
                zza(zzapVar.zza, new zzbc(this.zzu, zzgsVar.zzb, str, zzapVar.zzd.zzg(), zzapVar.zzd.zzd(), zzapVar.zzd.zzc(), zzgsVar.zzc), zzapVar.zzb, zzapVar.zzc);
            }
        }
    }

    @WorkerThread
    public final void zzp() {
        zzal();
        m1091e_().beginTransaction();
    }

    public final void zzp(String str) {
        zzt();
        zzal();
        try {
            m1091e_().execSQL("delete from default_event_params where app_id=?", new String[]{str});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error clearing default event params", e);
        }
    }

    private final void zzi(String str, String str2) throws IllegalStateException {
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            m1091e_().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting snapshot. appId", zzgo.zza(str2), e);
        }
    }

    public final void zzq(String str) throws IllegalStateException {
        zzbb zzbbVarZzd;
        zzi("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m1091e_().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string != null && (zzbbVarZzd = zzd(str, string)) != null) {
                        zza("events_snapshot", zzbbVarZzd);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error creating snapshot. appId", zzgo.zza(str), e);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final void zzu() {
        zzal();
        m1091e_().endTransaction();
    }

    @VisibleForTesting
    @WorkerThread
    public final void zza(List<Long> list) throws SQLException {
        zzt();
        zzal();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzaa()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (zzb("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                m1091e_().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error incrementing retry count. error", e);
            }
        }
    }

    @WorkerThread
    public final void zza(Long l) throws SQLException {
        zzt();
        zzal();
        Preconditions.checkNotNull(l);
        if ((!zzpu.zza() || zze().zza(zzbh.zzcb)) && zzaa()) {
            if (zzb("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                m1091e_().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l + " AND retry_count < 2147483647");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error incrementing retry count. error", e);
            }
        }
    }

    @WorkerThread
    public final void zzv() {
        int iDelete;
        zzt();
        zzal();
        if (zzaa()) {
            long jZza = zzn().zza.zza();
            long jElapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jZza) > zzag.zzn()) {
                zzn().zza.zza(jElapsedRealtime);
                zzt();
                zzal();
                if (!zzaa() || (iDelete = m1091e_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().currentTimeMillis()), String.valueOf(zzag.zzm())})) <= 0) {
                    return;
                }
                zzj().zzp().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
            }
        }
    }

    @WorkerThread
    public final void zzh(String str, String str2) throws IllegalStateException {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            m1091e_().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting user property. appId", zzgo.zza(str), zzi().zzc(str2), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzr(String str) throws Throwable {
        boolean z;
        zzbb zzbbVarZzc;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        zzbb zzbbVarZzd = zzd(str, "_f");
        zzbb zzbbVarZzd2 = zzd(str, "_v");
        zzi("events", str);
        boolean z2 = false;
        Cursor cursorQuery = null;
        try {
            cursorQuery = m1091e_().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                if (zzbbVarZzd != null) {
                    zza("events", zzbbVarZzd);
                } else if (zzbbVarZzd2 != null) {
                    zza("events", zzbbVarZzd2);
                }
                zzi("events_snapshot", str);
                return;
            }
            boolean z3 = false;
            z = false;
            do {
                try {
                    String string = cursorQuery.getString(0);
                    if (zze().zza(zzbh.zzda)) {
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z3 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                    } else if ("_f".equals(string)) {
                        z3 = true;
                    } else if ("_v".equals(string)) {
                        z = true;
                    }
                    if (string != null && (zzbbVarZzc = zzc("events_snapshot", str, string)) != null) {
                        zza("events", zzbbVarZzc);
                    }
                } catch (SQLiteException e) {
                    e = e;
                    z2 = z3;
                    try {
                        zzj().zzg().zza("Error querying snapshot. appId", zzgo.zza(str), e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (!z2 && zzbbVarZzd != null) {
                            zza("events", zzbbVarZzd);
                        } else if (!z && zzbbVarZzd2 != null) {
                            zza("events", zzbbVarZzd2);
                        }
                        zzi("events_snapshot", str);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z2 && zzbbVarZzd != null) {
                            zza("events", zzbbVarZzd);
                        } else if (!z && zzbbVarZzd2 != null) {
                            zza("events", zzbbVarZzd2);
                        }
                        zzi("events_snapshot", str);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z2 = z3;
                    if (cursorQuery != null) {
                    }
                    if (z2) {
                        if (!z) {
                            zza("events", zzbbVarZzd2);
                        }
                    }
                    zzi("events_snapshot", str);
                    throw th;
                }
            } while (cursorQuery.moveToNext());
            cursorQuery.close();
            if (!z3 && zzbbVarZzd != null) {
                zza("events", zzbbVarZzd);
            } else if (!z && zzbbVarZzd2 != null) {
                zza("events", zzbbVarZzd2);
            }
            zzi("events_snapshot", str);
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    @WorkerThread
    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put(str, (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @WorkerThread
    public final void zza(String str, List<zzfo.zza> list) {
        boolean z;
        boolean z2;
        Preconditions.checkNotNull(list);
        for (int i = 0; i < list.size(); i++) {
            zzfo.zza.C11896zza c11896zzaZzcd = list.get(i).zzcd();
            if (c11896zzaZzcd.zza() != 0) {
                for (int i2 = 0; i2 < c11896zzaZzcd.zza(); i2++) {
                    zzfo.zzb.zza zzaVarZzcd = c11896zzaZzcd.zza(i2).zzcd();
                    zzfo.zzb.zza zzaVar = (zzfo.zzb.zza) ((zzjt.zzb) zzaVarZzcd.clone());
                    String strZzb = zzji.zzb(zzaVarZzcd.zzb());
                    if (strZzb != null) {
                        zzaVar.zza(strZzb);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < zzaVarZzcd.zza(); i3++) {
                        zzfo.zzc zzcVarZza = zzaVarZzcd.zza(i3);
                        String strZza = zzjk.zza(zzcVarZza.zze());
                        if (strZza != null) {
                            zzaVar.zza(i3, (zzfo.zzc) ((com.google.android.gms.internal.measurement.zzjt) zzcVarZza.zzcd().zza(strZza).zzai()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        zzfo.zza.C11896zza c11896zzaZza = c11896zzaZzcd.zza(i2, zzaVar);
                        list.set(i, (zzfo.zza) ((com.google.android.gms.internal.measurement.zzjt) c11896zzaZza.zzai()));
                        c11896zzaZzcd = c11896zzaZza;
                    }
                }
            }
            if (c11896zzaZzcd.zzb() != 0) {
                for (int i4 = 0; i4 < c11896zzaZzcd.zzb(); i4++) {
                    zzfo.zze zzeVarZzb = c11896zzaZzcd.zzb(i4);
                    String strZza2 = zzjj.zza(zzeVarZzb.zze());
                    if (strZza2 != null) {
                        c11896zzaZzcd = c11896zzaZzcd.zza(i4, zzeVarZzb.zzcd().zza(strZza2));
                        list.set(i, (zzfo.zza) ((com.google.android.gms.internal.measurement.zzjt) c11896zzaZzcd.zzai()));
                    }
                }
            }
        }
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase sQLiteDatabaseM1091e_ = m1091e_();
        sQLiteDatabaseM1091e_.beginTransaction();
        try {
            zzal();
            zzt();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase sQLiteDatabaseM1091e_2 = m1091e_();
            sQLiteDatabaseM1091e_2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseM1091e_2.delete("event_filters", "app_id=?", new String[]{str});
            for (zzfo.zza zzaVar2 : list) {
                zzal();
                zzt();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzaVar2);
                if (!zzaVar2.zzg()) {
                    zzj().zzu().zza("Audience with no ID. appId", zzgo.zza(str));
                } else {
                    int iZza = zzaVar2.zza();
                    Iterator<zzfo.zzb> it = zzaVar2.zze().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zzl()) {
                                zzj().zzu().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzgo.zza(str), Integer.valueOf(iZza));
                                break;
                            }
                        } else {
                            Iterator<zzfo.zze> it2 = zzaVar2.zzf().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().zzi()) {
                                        zzj().zzu().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzgo.zza(str), Integer.valueOf(iZza));
                                        break;
                                    }
                                } else {
                                    Iterator<zzfo.zzb> it3 = zzaVar2.zze().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!zza(str, iZza, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<zzfo.zze> it4 = zzaVar2.zzf().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!zza(str, iZza, it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        zzal();
                                        zzt();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase sQLiteDatabaseM1091e_3 = m1091e_();
                                        sQLiteDatabaseM1091e_3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iZza)});
                                        sQLiteDatabaseM1091e_3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iZza)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzfo.zza zzaVar3 : list) {
                arrayList.add(zzaVar3.zzg() ? Integer.valueOf(zzaVar3.zza()) : null);
            }
            zzb(str, arrayList);
            sQLiteDatabaseM1091e_.setTransactionSuccessful();
            sQLiteDatabaseM1091e_.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabaseM1091e_.endTransaction();
            throw th;
        }
    }

    @WorkerThread
    public final void zzw() {
        zzal();
        m1091e_().setTransactionSuccessful();
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0045  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzg zzgVar, boolean z, boolean z2) {
        Preconditions.checkNotNull(zzgVar);
        zzt();
        zzal();
        String strZzac = zzgVar.zzac();
        Preconditions.checkNotNull(strZzac);
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, strZzac);
        if (!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zza(zzbh.zzcy)) {
            contentValues.put("app_instance_id", zzgVar.zzad());
        } else if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.zzg.zzb(strZzac).zza(zzje.zza.ANALYTICS_STORAGE)) {
        }
        contentValues.put("gmp_app_id", zzgVar.zzah());
        if (!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zza(zzbh.zzcy) || this.zzg.zzb(strZzac).zza(zzje.zza.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", zzgVar.zzaj());
        }
        contentValues.put("last_bundle_index", Long.valueOf(zzgVar.zzt()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzgVar.zzu()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzgVar.zzs()));
        contentValues.put("app_version", zzgVar.zzaf());
        contentValues.put("app_store", zzgVar.zzae());
        contentValues.put("gmp_version", Long.valueOf(zzgVar.zzq()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzgVar.zzn()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzgVar.zzar()));
        contentValues.put("day", Long.valueOf(zzgVar.zzm()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzgVar.zzk()));
        contentValues.put("daily_events_count", Long.valueOf(zzgVar.zzj()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzgVar.zzh()));
        contentValues.put("config_fetched_time", Long.valueOf(zzgVar.zzg()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzgVar.zzp()));
        contentValues.put("app_version_int", Long.valueOf(zzgVar.zze()));
        contentValues.put("firebase_instance_id", zzgVar.zzag());
        contentValues.put("daily_error_events_count", Long.valueOf(zzgVar.zzi()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzgVar.zzl()));
        contentValues.put("health_monitor_sample", zzgVar.zzai());
        contentValues.put("android_id", Long.valueOf(zzgVar.zzd()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzgVar.zzaq()));
        contentValues.put("admob_app_id", zzgVar.zzaa());
        contentValues.put("dynamite_version", Long.valueOf(zzgVar.zzo()));
        if (!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zza(zzbh.zzcy) || this.zzg.zzb(strZzac).zza(zzje.zza.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", zzgVar.zzal());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzgVar.zzat()));
        contentValues.put("target_os_version", Long.valueOf(zzgVar.zzw()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzgVar.zzv()));
        if (zzpn.zza() && zze().zze(strZzac, zzbh.zzch)) {
            contentValues.put("ad_services_version", Integer.valueOf(zzgVar.zza()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(zzgVar.zzf()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzgVar.zzau()));
        contentValues.put("npa_metadata_value", zzgVar.zzx());
        if (zzpu.zza() && zze().zze(strZzac, zzbh.zzbx)) {
            zzq();
            if (zzos.zzf(strZzac)) {
                contentValues.put("bundle_delivery_index", Long.valueOf(zzgVar.zzr()));
            }
        }
        if (zzpu.zza() && zze().zze(strZzac, zzbh.zzby)) {
            contentValues.put("sgtm_preview_key", zzgVar.zzam());
        }
        contentValues.put("dma_consent_state", Integer.valueOf(zzgVar.zzc()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(zzgVar.zzb()));
        contentValues.put("serialized_npa_metadata", zzgVar.zzak());
        List<String> listZzan = zzgVar.zzan();
        if (listZzan != null) {
            if (listZzan.isEmpty()) {
                zzj().zzu().zza("Safelisted events should not be an empty list. appId", strZzac);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listZzan));
            }
        }
        if (com.google.android.gms.internal.measurement.zzny.zza() && zze().zza(zzbh.zzbu) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (zze().zza(zzbh.zzcw)) {
            contentValues.put("unmatched_pfo", zzgVar.zzy());
            contentValues.put("unmatched_uwa", zzgVar.zzz());
        }
        if (zzov.zza() && zze().zze(strZzac, zzbh.zzcu)) {
            contentValues.put("ad_campaign_info", zzgVar.zzav());
        }
        try {
            SQLiteDatabase sQLiteDatabaseM1091e_ = m1091e_();
            if (sQLiteDatabaseM1091e_.update("apps", contentValues, "app_id = ?", new String[]{strZzac}) == 0 && sQLiteDatabaseM1091e_.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update app (got -1). appId", zzgo.zza(strZzac));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing app. appId", zzgo.zza(strZzac), e);
        }
    }

    public final void zza(String str, zzax zzaxVar) throws IllegalStateException {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaxVar);
        zzt();
        zzal();
        if (zze().zza(zzbh.zzcr)) {
            zzje zzjeVarZzi = zzi(str);
            zzje zzjeVar = zzje.zza;
            if (zzjeVarZzi == zzjeVar) {
                zzb(str, zzjeVar);
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("dma_consent_settings", zzaxVar.zzf());
        zza("consent_settings", CommonUrlParts.APP_ID, contentValues);
    }

    @WorkerThread
    public final void zza(zzbb zzbbVar) throws IllegalStateException {
        zza("events", zzbbVar);
    }

    @WorkerThread
    private final void zza(String str, zzbb zzbbVar) throws IllegalStateException {
        Preconditions.checkNotNull(zzbbVar);
        zzt();
        zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, zzbbVar.zza);
        contentValues.put("name", zzbbVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzbbVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzbbVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbbVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbbVar.zzg));
        contentValues.put("last_bundled_day", zzbbVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbbVar.zzi);
        contentValues.put("last_sampling_rate", zzbbVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzbbVar.zze));
        Boolean bool = zzbbVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m1091e_().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update event aggregates (got -1). appId", zzgo.zza(zzbbVar.zza));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing event aggregates. appId", zzgo.zza(zzbbVar.zza), e);
        }
    }

    @WorkerThread
    private final void zza(String str, String str2, ContentValues contentValues) throws IllegalStateException {
        try {
            SQLiteDatabase sQLiteDatabaseM1091e_ = m1091e_();
            if (contentValues.getAsString(str2) == null) {
                zzj().zzm().zza("Value of the primary key is not set.", zzgo.zza(str2));
                return;
            }
            if (sQLiteDatabaseM1091e_.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && sQLiteDatabaseM1091e_.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update table (got -1). key", zzgo.zza(str), zzgo.zza(str2));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing into table. key", zzgo.zza(str), zzgo.zza(str2), e);
        }
    }

    public final void zza(String str, zzje zzjeVar) throws IllegalStateException {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjeVar);
        zzt();
        zzal();
        zzb(str, zzi(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("storage_consent_at_bundling", zzjeVar.zzf());
        zza("consent_settings", CommonUrlParts.APP_ID, contentValues);
    }

    public final void zzb(String str, zzje zzjeVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjeVar);
        zzt();
        zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("consent_state", zzjeVar.zzf());
        contentValues.put("consent_source", Integer.valueOf(zzjeVar.zza()));
        zza("consent_settings", CommonUrlParts.APP_ID, contentValues);
    }

    private final boolean zzb(String str, List<Integer> list) throws IllegalStateException {
        Preconditions.checkNotEmpty(str);
        zzal();
        zzt();
        SQLiteDatabase sQLiteDatabaseM1091e_ = m1091e_();
        try {
            long jZzb = zzb("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, zze().zzb(str, zzbh.zzah)));
            if (jZzb <= iMax) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String str2 = "(" + TextUtils.join(",", arrayList) + ")";
            StringBuilder sb = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb.append(str2);
            sb.append(" order by rowid desc limit -1 offset ?)");
            return sQLiteDatabaseM1091e_.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(iMax)}) > 0;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e);
            return false;
        }
    }

    public final boolean zzx() {
        return zzb("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzy() {
        return zzb("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final boolean zzz() {
        return zzb("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    @WorkerThread
    public final boolean zzs(String str) {
        if (zzpu.zza() && !zze().zza(zzbh.zzcb)) {
            return false;
        }
        String strZzao = zzao();
        StringBuilder sb = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ");
        sb.append(strZzao);
        return zzb(sb.toString(), new String[]{str}) != 0;
    }

    @WorkerThread
    public final boolean zza(zzfy.zzk zzkVar, boolean z) throws IllegalStateException {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotEmpty(zzkVar.zzz());
        Preconditions.checkState(zzkVar.zzbj());
        zzv();
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        if (zzkVar.zzm() < jCurrentTimeMillis - zzag.zzm() || zzkVar.zzm() > zzag.zzm() + jCurrentTimeMillis) {
            zzj().zzu().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgo.zza(zzkVar.zzz()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzkVar.zzm()));
        }
        try {
            byte[] bArrZzb = mo1095g_().zzb(zzkVar.zzca());
            zzj().zzp().zza("Saving bundle, size", Integer.valueOf(bArrZzb.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put(CommonUrlParts.APP_ID, zzkVar.zzz());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzkVar.zzm()));
            contentValues.put("data", bArrZzb);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (zzkVar.zzbq()) {
                contentValues.put("retry_count", Integer.valueOf(zzkVar.zzg()));
            }
            try {
                if (m1091e_().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzj().zzg().zza("Failed to insert bundle (got -1). appId", zzgo.zza(zzkVar.zzz()));
                return false;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error storing bundle. appId", zzgo.zza(zzkVar.zzz()), e);
                return false;
            }
        } catch (IOException e2) {
            zzj().zzg().zza("Data loss. Failed to serialize bundle. appId", zzgo.zza(zzkVar.zzz()), e2);
            return false;
        }
    }

    @WorkerThread
    private final boolean zza(String str, int i, zzfo.zzb zzbVar) throws IllegalStateException {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().zzu().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzgo.zza(str), Integer.valueOf(i), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] bArrZzca = zzbVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzf());
        contentValues.put("session_scoped", zzbVar.zzm() ? Boolean.valueOf(zzbVar.zzj()) : null);
        contentValues.put("data", bArrZzca);
        try {
            if (m1091e_().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert event filter (got -1). appId", zzgo.zza(str));
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing event filter. appId", zzgo.zza(str), e);
            return false;
        }
    }

    @WorkerThread
    private final boolean zza(String str, int i, zzfo.zze zzeVar) throws IllegalStateException {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().zzu().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzgo.zza(str), Integer.valueOf(i), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null));
            return false;
        }
        byte[] bArrZzca = zzeVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
        contentValues.put("property_name", zzeVar.zze());
        contentValues.put("session_scoped", zzeVar.zzj() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put("data", bArrZzca);
        try {
            if (m1091e_().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert property filter (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing property filter. appId", zzgo.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zzbc zzbcVar, long j, boolean z) throws IllegalStateException {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzbcVar);
        Preconditions.checkNotEmpty(zzbcVar.zza);
        byte[] bArrZzca = mo1095g_().zza(zzbcVar).zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, zzbcVar.zza);
        contentValues.put("name", zzbcVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", bArrZzca);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (m1091e_().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert raw event (got -1). appId", zzgo.zza(zzbcVar.zza));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing raw event. appId", zzgo.zza(zzbcVar.zza), e);
            return false;
        }
    }

    @WorkerThread
    public final boolean zza(String str, zzno zznoVar) throws IllegalStateException {
        zzt();
        zzal();
        Preconditions.checkNotNull(zznoVar);
        Preconditions.checkNotEmpty(str);
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        long j = zznoVar.zzb;
        zzfz<Long> zzfzVar = zzbh.zzbh;
        if (j < jCurrentTimeMillis - zzfzVar.zza(null).longValue() || zznoVar.zzb > zzfzVar.zza(null).longValue() + jCurrentTimeMillis) {
            zzj().zzu().zza("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgo.zza(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zznoVar.zzb));
        }
        zzj().zzp().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("trigger_uri", zznoVar.zza);
        contentValues.put("source", Integer.valueOf(zznoVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(zznoVar.zzb));
        try {
            if (m1091e_().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert trigger URI (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing trigger URI. appId", zzgo.zza(str), e);
            return false;
        }
    }

    @WorkerThread
    public final boolean zza(String str, zzfy.zzj zzjVar, String str2, Map<String, String> map, zznt zzntVar) throws IllegalStateException {
        int iDelete;
        zzt();
        zzal();
        Preconditions.checkNotNull(zzjVar);
        Preconditions.checkNotEmpty(str);
        if (zzpu.zza() && !zze().zza(zzbh.zzcb)) {
            return false;
        }
        zzt();
        zzal();
        if (zzaa()) {
            long jZza = zzn().zzb.zza();
            long jElapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jZza) > zzag.zzn()) {
                zzn().zzb.zza(jElapsedRealtime);
                zzt();
                zzal();
                if (zzaa() && (iDelete = m1091e_().delete("upload_queue", zzao(), new String[0])) > 0) {
                    zzj().zzp().zza("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getKey() + URLEncodedUtils.NAME_VALUE_SEPARATOR + entry.getValue());
        }
        byte[] bArrZzca = zzjVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("measurement_batch", bArrZzca);
        contentValues.put("upload_uri", str2);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb.append((CharSequence) arrayList.get(0));
            int i = 1;
            while (i < size) {
                sb.append((CharSequence) "\r\n");
                Object obj = arrayList.get(i);
                i++;
                sb.append((CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb.toString());
        contentValues.put("upload_type", Integer.valueOf(zzntVar.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzb().currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        try {
            if (m1091e_().insert("upload_queue", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing MeasurementBatch to upload_queue. appId", str, e);
            return false;
        }
    }

    @VisibleForTesting
    public final boolean zzaa() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zza(String str, Long l, long j, zzfy.zzf zzfVar) throws IllegalStateException {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzfVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] bArrZzca = zzfVar.zzca();
        zzj().zzp().zza("Saving complex main event, appId, data size", zzi().zza(str), Integer.valueOf(bArrZzca.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrZzca);
        try {
            if (m1091e_().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert complex main event (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing complex main event. appId", zzgo.zza(str), e);
            return false;
        }
    }

    public final boolean zzt(String str) {
        boolean z;
        boolean z2;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m1091e_().rawQuery("select timestamp from raw_events where app_id=? and name = '_f' limit 1;", new String[]{str});
            } catch (SQLiteException e) {
                e = e;
                z = false;
            }
            if (!cursorRawQuery.moveToFirst()) {
                cursorRawQuery.close();
                return false;
            }
            z = zzb().currentTimeMillis() < cursorRawQuery.getLong(0) + 15000;
            try {
                z2 = zza("select count(*) from raw_events where app_id=? and name not like '!_%' escape '!' limit 1;", new String[]{str}, 0L) > 0;
                cursorRawQuery.close();
            } catch (SQLiteException e2) {
                e = e2;
                zzj().zzg().zza("Error checking backfill conditions", e);
                z2 = false;
                if (z) {
                }
            }
            return (z || z2) ? false : true;
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    @WorkerThread
    public final boolean zza(zzae zzaeVar) throws IllegalStateException {
        Preconditions.checkNotNull(zzaeVar);
        zzt();
        zzal();
        String str = zzaeVar.zza;
        Preconditions.checkNotNull(str);
        if (zze(str, zzaeVar.zzc.zza) == null && zzb("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("origin", zzaeVar.zzb);
        contentValues.put("name", zzaeVar.zzc.zza);
        zza(contentValues, "value", Preconditions.checkNotNull(zzaeVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzaeVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzaeVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzaeVar.zzh));
        zzq();
        contentValues.put("timed_out_event", zzos.zza((Parcelable) zzaeVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzaeVar.zzd));
        zzq();
        contentValues.put("triggered_event", zzos.zza((Parcelable) zzaeVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzaeVar.zzc.zzb));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzaeVar.zzj));
        zzq();
        contentValues.put("expired_event", zzos.zza((Parcelable) zzaeVar.zzk));
        try {
            if (m1091e_().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert/update conditional user property (got -1)", zzgo.zza(str));
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing conditional user property", zzgo.zza(str), e);
            return true;
        }
    }

    public final boolean zzb(String str, Bundle bundle) {
        zzt();
        zzal();
        byte[] bArrZzca = mo1095g_().zza(new zzbc(this.zzu, "", str, "dep", 0L, 0L, bundle)).zzca();
        zzj().zzp().zza("Saving default event parameters, appId, data size", zzi().zza(str), Integer.valueOf(bArrZzca.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("parameters", bArrZzca);
        try {
            if (m1091e_().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert default event parameters (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing default event parameters. appId", zzgo.zza(str), e);
            return false;
        }
    }

    private final boolean zza(long j, zzbc zzbcVar, long j2, boolean z) throws IllegalStateException {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzbcVar);
        Preconditions.checkNotEmpty(zzbcVar.zza);
        byte[] bArrZzca = mo1095g_().zza(zzbcVar).zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, zzbcVar.zza);
        contentValues.put("name", zzbcVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", bArrZzca);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            long jUpdate = m1091e_().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
            if (jUpdate == 1) {
                return true;
            }
            zzj().zzg().zza("Failed to update raw event. appId, updatedRows", zzgo.zza(zzbcVar.zza), Long.valueOf(jUpdate));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error updating raw event. appId", zzgo.zza(zzbcVar.zza), e);
            return false;
        }
    }

    @WorkerThread
    public final boolean zza(zzop zzopVar) {
        Preconditions.checkNotNull(zzopVar);
        zzt();
        zzal();
        if (zze(zzopVar.zza, zzopVar.zzc) == null) {
            if (zzos.zzh(zzopVar.zzc)) {
                if (zzb("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzopVar.zza}) >= zze().zza(zzopVar.zza, zzbh.zzai, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzopVar.zzc) && zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzopVar.zza, zzopVar.zzb}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, zzopVar.zza);
        contentValues.put("origin", zzopVar.zzb);
        contentValues.put("name", zzopVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzopVar.zzd));
        zza(contentValues, "value", zzopVar.zze);
        try {
            if (m1091e_().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert/update user property (got -1). appId", zzgo.zza(zzopVar.zza));
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing user property. appId", zzgo.zza(zzopVar.zza), e);
            return true;
        }
    }
}
