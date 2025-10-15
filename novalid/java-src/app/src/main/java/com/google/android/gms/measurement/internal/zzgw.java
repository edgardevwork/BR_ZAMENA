package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
@WorkerThread
/* loaded from: classes4.dex */
final class zzgw implements Runnable {
    private final URL zza;
    private final byte[] zzb;
    private final zzgu zzc;
    private final String zzd;
    private final Map<String, String> zze;
    private final /* synthetic */ zzgr zzf;

    public zzgw(zzgr zzgrVar, String str, URL url, byte[] bArr, Map<String, String> map, zzgu zzguVar) {
        this.zzf = zzgrVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzguVar);
        this.zza = url;
        this.zzb = bArr;
        this.zzc = zzguVar;
        this.zzd = str;
        this.zze = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        Map<String, List<String>> map2;
        int i;
        Throwable th;
        int i2;
        IOException iOException;
        URLConnection uRLConnectionZza;
        int responseCode;
        Map<String, List<String>> headerFields;
        this.zzf.zzr();
        OutputStream outputStream = null;
        try {
            uRLConnectionZza = com.google.android.gms.internal.measurement.zzcy.zza().zza(this.zza, "client-measurement");
        } catch (IOException e) {
            e = e;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
            map = null;
        }
        if (!(uRLConnectionZza instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain HTTP connection");
        }
        httpURLConnection = (HttpURLConnection) uRLConnectionZza;
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(61000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setDoInput(true);
        try {
            Map<String, String> map3 = this.zze;
            if (map3 != null) {
                for (Map.Entry<String, String> entry : map3.entrySet()) {
                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            if (this.zzb != null) {
                byte[] bArrZzb = this.zzf.mo1095g_().zzb(this.zzb);
                this.zzf.zzj().zzp().zza("Uploading data. size", Integer.valueOf(bArrZzb.length));
                httpURLConnection.setDoOutput(true);
                httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setFixedLengthStreamingMode(bArrZzb.length);
                httpURLConnection.connect();
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(bArrZzb);
                    outputStream2.close();
                    responseCode = httpURLConnection.getResponseCode();
                    try {
                        headerFields = httpURLConnection.getHeaderFields();
                        try {
                            zzgr zzgrVar = this.zzf;
                            byte[] bArrZza = zzgr.zza(httpURLConnection);
                            httpURLConnection.disconnect();
                            this.zzf.zzl().zzb(new zzgt(this.zzd, this.zzc, responseCode, null, bArrZza, headerFields));
                            return;
                        } catch (IOException e2) {
                            e = e2;
                            i2 = responseCode;
                            map2 = headerFields;
                            iOException = e;
                            if (outputStream != null) {
                            }
                            if (httpURLConnection != null) {
                            }
                            this.zzf.zzl().zzb(new zzgt(this.zzd, this.zzc, i2, iOException, null, map2));
                        } catch (Throwable th3) {
                            th = th3;
                            i = responseCode;
                            map = headerFields;
                            if (outputStream != null) {
                            }
                            if (httpURLConnection != null) {
                            }
                            this.zzf.zzl().zzb(new zzgt(this.zzd, this.zzc, i, null, null, map));
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        map2 = null;
                        i2 = responseCode;
                    } catch (Throwable th4) {
                        map = null;
                        th = th4;
                        i = responseCode;
                    }
                } catch (IOException e4) {
                    map2 = null;
                    i2 = 0;
                    outputStream = outputStream2;
                    iOException = e4;
                } catch (Throwable th5) {
                    map = null;
                    i = 0;
                    outputStream = outputStream2;
                    th = th5;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e5) {
                            this.zzf.zzj().zzg().zza("Error closing HTTP compressed POST connection output stream. appId", zzgo.zza(this.zzd), e5);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.zzf.zzl().zzb(new zzgt(this.zzd, this.zzc, i, null, null, map));
                    throw th;
                }
            } else {
                responseCode = httpURLConnection.getResponseCode();
                headerFields = httpURLConnection.getHeaderFields();
                zzgr zzgrVar2 = this.zzf;
                byte[] bArrZza2 = zzgr.zza(httpURLConnection);
                httpURLConnection.disconnect();
                this.zzf.zzl().zzb(new zzgt(this.zzd, this.zzc, responseCode, null, bArrZza2, headerFields));
                return;
            }
        } catch (IOException e6) {
            e = e6;
            map2 = null;
            i2 = 0;
            iOException = e;
            if (outputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            this.zzf.zzl().zzb(new zzgt(this.zzd, this.zzc, i2, iOException, null, map2));
        } catch (Throwable th6) {
            th = th6;
            map = null;
            i = 0;
            th = th;
            if (outputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            this.zzf.zzl().zzb(new zzgt(this.zzd, this.zzc, i, null, null, map));
            throw th;
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e7) {
                this.zzf.zzj().zzg().zza("Error closing HTTP compressed POST connection output stream. appId", zzgo.zza(this.zzd), e7);
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.zzf.zzl().zzb(new zzgt(this.zzd, this.zzc, i2, iOException, null, map2));
    }
}
