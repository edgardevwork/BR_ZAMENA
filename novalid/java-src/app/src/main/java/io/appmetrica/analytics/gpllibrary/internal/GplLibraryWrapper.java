package io.appmetrica.analytics.gpllibrary.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* renamed from: a */
    private final FusedLocationProviderClient f6263a;

    /* renamed from: b */
    private final LocationListener f6264b;

    /* renamed from: c */
    private final LocationCallback f6265c;

    /* renamed from: d */
    private final Looper f6266d;

    /* renamed from: e */
    private final Executor f6267e;

    /* renamed from: f */
    private final long f6268f;

    /* renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C87371 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6269a;

        static {
            int[] iArr = new int[Priority.values().length];
            f6269a = iArr;
            try {
                iArr[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6269a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6269a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class ClientProvider {

        /* renamed from: a */
        private final Context f6270a;

        public ClientProvider(Context context) {
            this.f6270a = context;
        }

        /* renamed from: a */
        public final FusedLocationProviderClient m4913a() {
            return new FusedLocationProviderClient(this.f6270a);
        }
    }

    /* loaded from: classes6.dex */
    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(@NonNull Context context, @NonNull LocationListener locationListener, @NonNull Looper looper, @NonNull Executor executor, long j) throws Throwable {
        this(new ClientProvider(context), locationListener, looper, executor, j);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void startLocationUpdates(@NonNull Priority priority) throws Throwable {
        FusedLocationProviderClient fusedLocationProviderClient = this.f6263a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f6268f);
        int i = C87371.f6269a[priority.ordinal()];
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(i != 1 ? i != 2 ? i != 3 ? 105 : 100 : 102 : 104), this.f6265c, this.f6266d);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() throws Throwable {
        this.f6263a.removeLocationUpdates(this.f6265c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void updateLastKnownLocation() throws Throwable {
        this.f6263a.getLastLocation().addOnSuccessListener(this.f6267e, new GplOnSuccessListener(this.f6264b));
    }

    public GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j) {
        this.f6263a = clientProvider.m4913a();
        this.f6264b = locationListener;
        this.f6266d = looper;
        this.f6267e = executor;
        this.f6268f = j;
        this.f6265c = new GplLocationCallback(locationListener);
    }
}
