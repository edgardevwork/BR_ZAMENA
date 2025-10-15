package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@UnstableApi
/* loaded from: classes3.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new Parcelable.Creator<DownloadRequest>() { // from class: androidx.media3.exoplayer.offline.DownloadRequest.1
        @Override // android.os.Parcelable.Creator
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    };

    @Nullable
    public final String customCacheKey;
    public final byte[] data;

    /* renamed from: id */
    public final String f313id;

    @Nullable
    public final byte[] keySetId;

    @Nullable
    public final String mimeType;
    public final List<StreamKey> streamKeys;
    public final Uri uri;

    public static class UnsupportedRequestException extends IOException {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public /* synthetic */ DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, C28541 c28541) {
        this(str, uri, str2, list, bArr, str3, bArr2);
    }

    public static class Builder {

        @Nullable
        public String customCacheKey;

        @Nullable
        public byte[] data;

        /* renamed from: id */
        public final String f314id;

        @Nullable
        public byte[] keySetId;

        @Nullable
        public String mimeType;

        @Nullable
        public List<StreamKey> streamKeys;
        public final Uri uri;

        public Builder(String str, Uri uri) {
            this.f314id = str;
            this.uri = uri;
        }

        @CanIgnoreReturnValue
        public Builder setMimeType(@Nullable String str) {
            this.mimeType = MimeTypes.normalizeMimeType(str);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setStreamKeys(@Nullable List<StreamKey> list) {
            this.streamKeys = list;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKeySetId(@Nullable byte[] bArr) {
            this.keySetId = bArr;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setCustomCacheKey(@Nullable String str) {
            this.customCacheKey = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setData(@Nullable byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public DownloadRequest build() {
            String str = this.f314id;
            Uri uri = this.uri;
            String str2 = this.mimeType;
            List listM1171of = this.streamKeys;
            if (listM1171of == null) {
                listM1171of = ImmutableList.m1171of();
            }
            return new DownloadRequest(str, uri, str2, listM1171of, this.keySetId, this.customCacheKey, this.data);
        }
    }

    public DownloadRequest(String str, Uri uri, @Nullable String str2, List<StreamKey> list, @Nullable byte[] bArr, @Nullable String str3, @Nullable byte[] bArr2) {
        int iInferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(uri, str2);
        if (iInferContentTypeForUriAndMimeType == 0 || iInferContentTypeForUriAndMimeType == 2 || iInferContentTypeForUriAndMimeType == 1) {
            Assertions.checkArgument(str3 == null, "customCacheKey must be null for type: " + iInferContentTypeForUriAndMimeType);
        }
        this.f313id = str;
        this.uri = uri;
        this.mimeType = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.streamKeys = Collections.unmodifiableList(arrayList);
        this.keySetId = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.customCacheKey = str3;
        this.data = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : Util.EMPTY_BYTE_ARRAY;
    }

    public DownloadRequest(Parcel parcel) {
        this.f313id = (String) Util.castNonNull(parcel.readString());
        this.uri = Uri.parse((String) Util.castNonNull(parcel.readString()));
        this.mimeType = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.streamKeys = Collections.unmodifiableList(arrayList);
        this.keySetId = parcel.createByteArray();
        this.customCacheKey = parcel.readString();
        this.data = (byte[]) Util.castNonNull(parcel.createByteArray());
    }

    public DownloadRequest copyWithId(String str) {
        return new DownloadRequest(str, this.uri, this.mimeType, this.streamKeys, this.keySetId, this.customCacheKey, this.data);
    }

    public DownloadRequest copyWithKeySetId(@Nullable byte[] bArr) {
        return new DownloadRequest(this.f313id, this.uri, this.mimeType, this.streamKeys, bArr, this.customCacheKey, this.data);
    }

    public DownloadRequest copyWithMergedRequest(DownloadRequest downloadRequest) {
        List listEmptyList;
        Assertions.checkArgument(this.f313id.equals(downloadRequest.f313id));
        if (this.streamKeys.isEmpty() || downloadRequest.streamKeys.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            listEmptyList = new ArrayList(this.streamKeys);
            for (int i = 0; i < downloadRequest.streamKeys.size(); i++) {
                StreamKey streamKey = downloadRequest.streamKeys.get(i);
                if (!listEmptyList.contains(streamKey)) {
                    listEmptyList.add(streamKey);
                }
            }
        }
        return new DownloadRequest(this.f313id, downloadRequest.uri, downloadRequest.mimeType, listEmptyList, downloadRequest.keySetId, downloadRequest.customCacheKey, downloadRequest.data);
    }

    public MediaItem toMediaItem() {
        return new MediaItem.Builder().setMediaId(this.f313id).setUri(this.uri).setCustomCacheKey(this.customCacheKey).setMimeType(this.mimeType).setStreamKeys(this.streamKeys).build();
    }

    public String toString() {
        return this.mimeType + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f313id;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f313id.equals(downloadRequest.f313id) && this.uri.equals(downloadRequest.uri) && Util.areEqual(this.mimeType, downloadRequest.mimeType) && this.streamKeys.equals(downloadRequest.streamKeys) && Arrays.equals(this.keySetId, downloadRequest.keySetId) && Util.areEqual(this.customCacheKey, downloadRequest.customCacheKey) && Arrays.equals(this.data, downloadRequest.data);
    }

    public final int hashCode() {
        int iHashCode = ((this.f313id.hashCode() * 961) + this.uri.hashCode()) * 31;
        String str = this.mimeType;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.streamKeys.hashCode()) * 31) + Arrays.hashCode(this.keySetId)) * 31;
        String str2 = this.customCacheKey;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.data);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f313id);
        parcel.writeString(this.uri.toString());
        parcel.writeString(this.mimeType);
        parcel.writeInt(this.streamKeys.size());
        for (int i2 = 0; i2 < this.streamKeys.size(); i2++) {
            parcel.writeParcelable(this.streamKeys.get(i2), 0);
        }
        parcel.writeByteArray(this.keySetId);
        parcel.writeString(this.customCacheKey);
        parcel.writeByteArray(this.data);
    }

    /* renamed from: androidx.media3.exoplayer.offline.DownloadRequest$1 */
    public class C28541 implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    }
}
