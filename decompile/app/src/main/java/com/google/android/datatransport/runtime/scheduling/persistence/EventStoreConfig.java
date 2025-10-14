package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes4.dex */
public abstract class EventStoreConfig {
    public static final int LOAD_BATCH_SIZE = 200;
    public static final int LOCK_TIME_OUT_MS = 10000;
    public static final long MAX_DB_STORAGE_SIZE_IN_BYTES = 10485760;
    public static final long DURATION_ONE_WEEK_MS = 604800000;
    public static final int MAX_BLOB_BYTE_SIZE_PER_ROW = 81920;
    public static final EventStoreConfig DEFAULT = builder().setMaxStorageSizeInBytes(10485760).setLoadBatchSize(200).setCriticalSectionEnterTimeoutMs(10000).setEventCleanUpAge(DURATION_ONE_WEEK_MS).setMaxBlobByteSizePerRow(MAX_BLOB_BYTE_SIZE_PER_ROW).build();

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract EventStoreConfig build();

        public abstract Builder setCriticalSectionEnterTimeoutMs(int i);

        public abstract Builder setEventCleanUpAge(long j);

        public abstract Builder setLoadBatchSize(int i);

        public abstract Builder setMaxBlobByteSizePerRow(int i);

        public abstract Builder setMaxStorageSizeInBytes(long j);
    }

    public abstract int getCriticalSectionEnterTimeoutMs();

    public abstract long getEventCleanUpAge();

    public abstract int getLoadBatchSize();

    public abstract int getMaxBlobByteSizePerRow();

    public abstract long getMaxStorageSizeInBytes();

    public static Builder builder() {
        return new AutoValue_EventStoreConfig.Builder();
    }

    public Builder toBuilder() {
        return builder().setMaxStorageSizeInBytes(getMaxStorageSizeInBytes()).setLoadBatchSize(getLoadBatchSize()).setCriticalSectionEnterTimeoutMs(getCriticalSectionEnterTimeoutMs()).setEventCleanUpAge(getEventCleanUpAge()).setMaxBlobByteSizePerRow(getMaxBlobByteSizePerRow());
    }
}
