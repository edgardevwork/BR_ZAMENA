package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes7.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {

        /* renamed from: a */
        private final String f6164a;

        /* renamed from: b */
        private volatile long f6165b;

        /* renamed from: c */
        private volatile long f6166c;

        /* renamed from: d */
        private long f6167d = 0;

        /* renamed from: e */
        private Object f6168e = null;

        public CachedData(long j, long j2, @NonNull String str) {
            this.f6164a = String.format("[CachedData-%s]", str);
            this.f6165b = j;
            this.f6166c = j2;
        }

        @Nullable
        public T getData() {
            return (T) this.f6168e;
        }

        @VisibleForTesting
        public long getExpiryTime() {
            return this.f6166c;
        }

        @VisibleForTesting
        public long getRefreshTime() {
            return this.f6165b;
        }

        public final boolean isEmpty() {
            return this.f6168e == null;
        }

        public void setData(@Nullable T t) {
            this.f6168e = t;
            this.f6167d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j, long j2) {
            this.f6165b = j;
            this.f6166c = j2;
        }

        public final boolean shouldClearData() {
            if (this.f6167d == 0) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f6167d;
            return jCurrentTimeMillis > this.f6166c || jCurrentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f6167d;
            return jCurrentTimeMillis > this.f6165b || jCurrentTimeMillis < 0;
        }

        @NonNull
        public String toString() {
            return "CachedData{tag='" + this.f6164a + "', refreshTime=" + this.f6165b + ", expiryTime=" + this.f6166c + ", mCachedTime=" + this.f6167d + ", mCachedData=" + this.f6168e + '}';
        }
    }
}
