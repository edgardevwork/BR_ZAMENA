package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@UnstableApi
/* loaded from: classes.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHE_FRAGMENTATION = 4;
    public static final int FLAG_ALLOW_GZIP = 1;
    public static final int FLAG_DONT_CACHE_IF_LENGTH_UNKNOWN = 2;
    public static final int FLAG_MIGHT_NOT_USE_FULL_NETWORK_SPEED = 8;
    public static final int HTTP_METHOD_GET = 1;
    public static final int HTTP_METHOD_HEAD = 3;
    public static final int HTTP_METHOD_POST = 2;

    @Deprecated
    public final long absoluteStreamPosition;

    @Nullable
    public final Object customData;
    public final int flags;

    @Nullable
    public final byte[] httpBody;
    public final int httpMethod;
    public final Map<String, String> httpRequestHeaders;

    @Nullable
    public final String key;
    public final long length;
    public final long position;
    public final Uri uri;
    public final long uriPositionOffset;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    public /* synthetic */ DataSpec(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj, C27601 c27601) {
        this(uri, j, i, bArr, map, j2, j3, str, i2, obj);
    }

    static {
        MediaLibraryInfo.registerModule("media3.datasource");
    }

    public static final class Builder {

        @Nullable
        public Object customData;
        public int flags;

        @Nullable
        public byte[] httpBody;
        public int httpMethod;
        public Map<String, String> httpRequestHeaders;

        @Nullable
        public String key;
        public long length;
        public long position;

        @Nullable
        public Uri uri;
        public long uriPositionOffset;

        public /* synthetic */ Builder(DataSpec dataSpec, C27601 c27601) {
            this(dataSpec);
        }

        public Builder() {
            this.httpMethod = 1;
            this.httpRequestHeaders = Collections.emptyMap();
            this.length = -1L;
        }

        public Builder(DataSpec dataSpec) {
            this.uri = dataSpec.uri;
            this.uriPositionOffset = dataSpec.uriPositionOffset;
            this.httpMethod = dataSpec.httpMethod;
            this.httpBody = dataSpec.httpBody;
            this.httpRequestHeaders = dataSpec.httpRequestHeaders;
            this.position = dataSpec.position;
            this.length = dataSpec.length;
            this.key = dataSpec.key;
            this.flags = dataSpec.flags;
            this.customData = dataSpec.customData;
        }

        @CanIgnoreReturnValue
        public Builder setUri(String str) {
            this.uri = Uri.parse(str);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUri(Uri uri) {
            this.uri = uri;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUriPositionOffset(long j) {
            this.uriPositionOffset = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpMethod(int i) {
            this.httpMethod = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpBody(@Nullable byte[] bArr) {
            this.httpBody = bArr;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpRequestHeaders(Map<String, String> map) {
            this.httpRequestHeaders = map;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPosition(long j) {
            this.position = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLength(long j) {
            this.length = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKey(@Nullable String str) {
            this.key = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setFlags(int i) {
            this.flags = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setCustomData(@Nullable Object obj) {
            this.customData = obj;
            return this;
        }

        public DataSpec build() {
            Assertions.checkStateNotNull(this.uri, "The uri must be set.");
            return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
        }
    }

    public static String getStringForHttpMethod(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public DataSpec(Uri uri) {
        this(uri, 0L, -1L);
    }

    public DataSpec(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j, j2, null, 0, null);
    }

    @Deprecated
    public DataSpec(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    @Deprecated
    public DataSpec(Uri uri, long j, long j2, @Nullable String str) {
        this(uri, j, j, j2, str, 0);
    }

    @Deprecated
    public DataSpec(Uri uri, long j, long j2, @Nullable String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    @Deprecated
    public DataSpec(Uri uri, long j, long j2, @Nullable String str, int i, Map<String, String> map) {
        this(uri, 1, null, j, j, j2, str, i, map);
    }

    @Deprecated
    public DataSpec(Uri uri, long j, long j2, long j3, @Nullable String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    @Deprecated
    public DataSpec(Uri uri, @Nullable byte[] bArr, long j, long j2, long j3, @Nullable String str, int i) {
        this(uri, bArr != null ? 2 : 1, bArr, j, j2, j3, str, i);
    }

    @Deprecated
    public DataSpec(Uri uri, int i, @Nullable byte[] bArr, long j, long j2, long j3, @Nullable String str, int i2) {
        this(uri, i, bArr, j, j2, j3, str, i2, Collections.emptyMap());
    }

    @Deprecated
    public DataSpec(Uri uri, int i, @Nullable byte[] bArr, long j, long j2, long j3, @Nullable String str, int i2, Map<String, String> map) {
        this(uri, j - j2, i, bArr, map, j2, j3, str, i2, null);
    }

    public DataSpec(Uri uri, long j, int i, @Nullable byte[] bArr, Map<String, String> map, long j2, long j3, @Nullable String str, int i2, @Nullable Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        Assertions.checkArgument(j4 >= 0);
        Assertions.checkArgument(j2 >= 0);
        Assertions.checkArgument(j3 > 0 || j3 == -1);
        this.uri = uri;
        this.uriPositionOffset = j;
        this.httpMethod = i;
        this.httpBody = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.httpRequestHeaders = Collections.unmodifiableMap(new HashMap(map));
        this.position = j2;
        this.absoluteStreamPosition = j4;
        this.length = j3;
        this.key = str;
        this.flags = i2;
        this.customData = obj;
    }

    public boolean isFlagSet(int i) {
        return (this.flags & i) == i;
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.httpMethod);
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public DataSpec subrange(long j) {
        long j2 = this.length;
        return subrange(j, j2 != -1 ? j2 - j : -1L);
    }

    public DataSpec subrange(long j, long j2) {
        return (j == 0 && this.length == j2) ? this : new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position + j, j2, this.key, this.flags, this.customData);
    }

    public DataSpec withUri(Uri uri) {
        return new DataSpec(uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withRequestHeaders(Map<String, String> map) {
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withAdditionalHeaders(Map<String, String> map) {
        HashMap map2 = new HashMap(this.httpRequestHeaders);
        map2.putAll(map);
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map2, this.position, this.length, this.key, this.flags, this.customData);
    }

    public String toString() {
        return "DataSpec[" + getHttpMethodString() + " " + this.uri + ", " + this.position + ", " + this.length + ", " + this.key + ", " + this.flags + "]";
    }
}
