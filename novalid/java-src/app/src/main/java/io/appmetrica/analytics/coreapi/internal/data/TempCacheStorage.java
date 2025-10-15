package io.appmetrica.analytics.coreapi.internal.data;

import java.util.Collection;
import kotlin.Metadata;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0013J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH&J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\nH&¨\u0006\u0014"}, m7105d2 = {"Lio/appmetrica/analytics/coreapi/internal/data/TempCacheStorage;", "", "get", "Lio/appmetrica/analytics/coreapi/internal/data/TempCacheStorage$Entry;", PomReader.SCOPE, "", "", "limit", "", "put", "", "timestamp", "data", "", "remove", "", "id", "removeOlderThan", "interval", "Entry", "core-api_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface TempCacheStorage {

    @Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, m7105d2 = {"Lio/appmetrica/analytics/coreapi/internal/data/TempCacheStorage$Entry;", "", "data", "", "getData", "()[B", "id", "", "getId", "()J", PomReader.SCOPE, "", "getScope", "()Ljava/lang/String;", "timestamp", "getTimestamp", "core-api_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
    public interface Entry {
        @NotNull
        byte[] getData();

        long getId();

        @NotNull
        String getScope();

        long getTimestamp();
    }

    @Nullable
    Entry get(@NotNull String scope);

    @NotNull
    Collection<Entry> get(@NotNull String scope, int limit);

    long put(@NotNull String scope, long timestamp, @NotNull byte[] data);

    void remove(long id);

    void removeOlderThan(@NotNull String scope, long interval);
}
