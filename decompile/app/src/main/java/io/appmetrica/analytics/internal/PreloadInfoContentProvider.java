package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.AbstractC8941H5;
import io.appmetrica.analytics.impl.AbstractC9984xi;
import io.appmetrica.analytics.impl.C10005ye;
import io.appmetrica.analytics.impl.C10030ze;
import io.appmetrica.analytics.impl.C8939H3;
import io.appmetrica.analytics.impl.C8963I3;
import io.appmetrica.analytics.impl.C8965I5;
import io.appmetrica.analytics.impl.C9451ca;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes8.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* renamed from: a */
    private boolean f9420a = false;

    /* renamed from: b */
    private final UriMatcher f9421b = new UriMatcher(-1);

    /* renamed from: a */
    private void m7022a(C8965I5 c8965i5, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object objInvoke = c8965i5.f6765a.invoke(contentValues);
                if (objInvoke != null) {
                    c8965i5.f6767c.m5961b(applicationContext);
                    if (((Boolean) c8965i5.f6766b.invoke(objInvoke)).booleanValue()) {
                        AbstractC9984xi.m6965a("Successfully saved " + c8965i5.f6768d, new Object[0]);
                    } else {
                        AbstractC9984xi.m6965a("Did not save " + c8965i5.f6768d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Unexpected error occurred", new Object[0]) + StringUtils.f9903LF + io.appmetrica.analytics.coreutils.internal.StringUtils.throwableToString(th), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        AbstractC9984xi.m6965a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f9420a = true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f9420a) {
                    return null;
                }
                if (contentValues != null) {
                    int iMatch = this.f9421b.match(uri);
                    if (iMatch == 1) {
                        m7022a(new C8965I5(new C10005ye(), new C10030ze(), C9451ca.f7840d, "preload info"), contentValues);
                    } else if (iMatch != 2) {
                        AbstractC9984xi.m6965a("Bad content provider uri.", new Object[0]);
                    } else {
                        m7022a(new C8965I5(new C8939H3(), new C8963I3(), C9451ca.f7840d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = AbstractC8941H5.f6702a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String str = (applicationContext != null ? applicationContext.getPackageName() : "") + ".appmetrica.preloadinfo.retail";
        this.f9421b.addURI(str, "preloadinfo", 1);
        this.f9421b.addURI(str, "clids", 2);
        AbstractC8941H5.f6702a = new CountDownLatch(1);
        AbstractC8941H5.f6703b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        AbstractC9984xi.m6965a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        AbstractC9984xi.m6965a("Updating is not supported", new Object[0]);
        return -1;
    }
}
