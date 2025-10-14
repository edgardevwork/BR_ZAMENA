package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.ivy.core.cache.ArtifactOrigin;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes6.dex */
public class LibraryVersion {
    private static final GmsLogger zza = new GmsLogger("LibraryVersion", "");
    private static final LibraryVersion zzb = new LibraryVersion();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();

    @VisibleForTesting
    public LibraryVersion() {
    }

    @NonNull
    @KeepForSdk
    public static LibraryVersion getInstance() {
        return zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @NonNull
    @KeepForSdk
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getVersion(@NonNull String str) throws Throwable {
        Object obj;
        InputStream resourceAsStream;
        Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        if (this.zzc.containsKey(str)) {
            return (String) this.zzc.get(str);
        }
        Properties properties = new Properties();
        ?? r3 = 0;
        r3 = 0;
        r3 = 0;
        InputStream inputStream = null;
        try {
            try {
                resourceAsStream = LibraryVersion.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        String property = properties.getProperty("version", null);
                        zza.m1065v("LibraryVersion", str + " version is " + property);
                        r3 = property;
                    } else {
                        zza.m1067w("LibraryVersion", "Failed to get app version for libraryName: " + str);
                    }
                } catch (IOException e) {
                    e = e;
                    obj = r3;
                    inputStream = resourceAsStream;
                    zza.m1062e("LibraryVersion", "Failed to get app version for libraryName: " + str, e);
                    Object obj2 = obj;
                    resourceAsStream = inputStream;
                    r3 = obj2;
                    if (resourceAsStream != null) {
                    }
                    if (r3 == 0) {
                    }
                    this.zzc.put(str, r3);
                    return r3;
                } catch (Throwable th) {
                    th = th;
                    r3 = resourceAsStream;
                    if (r3 != 0) {
                        IOUtils.closeQuietly((Closeable) r3);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                obj = null;
            }
            if (resourceAsStream != null) {
                IOUtils.closeQuietly(resourceAsStream);
            }
            if (r3 == 0) {
                zza.m1059d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                r3 = ArtifactOrigin.UNKNOWN;
            }
            this.zzc.put(str, r3);
            return r3;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
