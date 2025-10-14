package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Bundleable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class MediaItem implements Bundleable {
    public static final String DEFAULT_MEDIA_ID = "";
    public final ClippingConfiguration clippingConfiguration;

    @UnstableApi
    @Deprecated
    public final ClippingProperties clippingProperties;
    public final LiveConfiguration liveConfiguration;

    @Nullable
    public final LocalConfiguration localConfiguration;
    public final String mediaId;
    public final MediaMetadata mediaMetadata;

    @Nullable
    @UnstableApi
    @Deprecated
    public final LocalConfiguration playbackProperties;
    public final RequestMetadata requestMetadata;
    public static final MediaItem EMPTY = new Builder().build();
    public static final String FIELD_MEDIA_ID = Util.intToStringMaxRadix(0);
    public static final String FIELD_LIVE_CONFIGURATION = Util.intToStringMaxRadix(1);
    public static final String FIELD_MEDIA_METADATA = Util.intToStringMaxRadix(2);
    public static final String FIELD_CLIPPING_PROPERTIES = Util.intToStringMaxRadix(3);
    public static final String FIELD_REQUEST_METADATA = Util.intToStringMaxRadix(4);
    public static final String FIELD_LOCAL_CONFIGURATION = Util.intToStringMaxRadix(5);

    @UnstableApi
    @Deprecated
    public static final Bundleable.Creator<MediaItem> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$$ExternalSyntheticLambda0
        @Override // androidx.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return MediaItem.fromBundle(bundle);
        }
    };

    public /* synthetic */ MediaItem(String str, ClippingProperties clippingProperties, LocalConfiguration localConfiguration, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata, RequestMetadata requestMetadata, C27401 c27401) {
        this(str, clippingProperties, localConfiguration, liveConfiguration, mediaMetadata, requestMetadata);
    }

    public static MediaItem fromUri(String str) {
        return new Builder().setUri(str).build();
    }

    public static MediaItem fromUri(Uri uri) {
        return new Builder().setUri(uri).build();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {

        @Nullable
        public AdsConfiguration adsConfiguration;
        public ClippingConfiguration.Builder clippingConfiguration;

        @Nullable
        public String customCacheKey;
        public DrmConfiguration.Builder drmConfiguration;
        public long imageDurationMs;
        public LiveConfiguration.Builder liveConfiguration;

        @Nullable
        public String mediaId;

        @Nullable
        public MediaMetadata mediaMetadata;

        @Nullable
        public String mimeType;
        public RequestMetadata requestMetadata;
        public List<StreamKey> streamKeys;
        public ImmutableList<SubtitleConfiguration> subtitleConfigurations;

        @Nullable
        public Object tag;

        @Nullable
        public Uri uri;

        public /* synthetic */ Builder(MediaItem mediaItem, C27401 c27401) {
            this(mediaItem);
        }

        public Builder() {
            this.clippingConfiguration = new ClippingConfiguration.Builder();
            this.drmConfiguration = new DrmConfiguration.Builder();
            this.streamKeys = Collections.emptyList();
            this.subtitleConfigurations = ImmutableList.m1171of();
            this.liveConfiguration = new LiveConfiguration.Builder();
            this.requestMetadata = RequestMetadata.EMPTY;
            this.imageDurationMs = C2732C.TIME_UNSET;
        }

        public Builder(MediaItem mediaItem) {
            DrmConfiguration.Builder builder;
            this();
            this.clippingConfiguration = mediaItem.clippingConfiguration.buildUpon();
            this.mediaId = mediaItem.mediaId;
            this.mediaMetadata = mediaItem.mediaMetadata;
            this.liveConfiguration = mediaItem.liveConfiguration.buildUpon();
            this.requestMetadata = mediaItem.requestMetadata;
            LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                this.customCacheKey = localConfiguration.customCacheKey;
                this.mimeType = localConfiguration.mimeType;
                this.uri = localConfiguration.uri;
                this.streamKeys = localConfiguration.streamKeys;
                this.subtitleConfigurations = localConfiguration.subtitleConfigurations;
                this.tag = localConfiguration.tag;
                DrmConfiguration drmConfiguration = localConfiguration.drmConfiguration;
                if (drmConfiguration != null) {
                    builder = drmConfiguration.buildUpon();
                } else {
                    builder = new DrmConfiguration.Builder();
                }
                this.drmConfiguration = builder;
                this.adsConfiguration = localConfiguration.adsConfiguration;
                this.imageDurationMs = localConfiguration.imageDurationMs;
            }
        }

        @CanIgnoreReturnValue
        public Builder setMediaId(String str) {
            this.mediaId = (String) Assertions.checkNotNull(str);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUri(@Nullable String str) {
            return setUri(str == null ? null : Uri.parse(str));
        }

        @CanIgnoreReturnValue
        public Builder setUri(@Nullable Uri uri) {
            this.uri = uri;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMimeType(@Nullable String str) {
            this.mimeType = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClippingConfiguration(ClippingConfiguration clippingConfiguration) {
            this.clippingConfiguration = clippingConfiguration.buildUpon();
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setClipStartPositionMs(@IntRange(from = 0) long j) {
            this.clippingConfiguration.setStartPositionMs(j);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setClipEndPositionMs(long j) {
            this.clippingConfiguration.setEndPositionMs(j);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setClipRelativeToLiveWindow(boolean z) {
            this.clippingConfiguration.setRelativeToLiveWindow(z);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setClipRelativeToDefaultPosition(boolean z) {
            this.clippingConfiguration.setRelativeToDefaultPosition(z);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setClipStartsAtKeyFrame(boolean z) {
            this.clippingConfiguration.setStartsAtKeyFrame(z);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setDrmConfiguration(@Nullable DrmConfiguration drmConfiguration) {
            this.drmConfiguration = drmConfiguration != null ? drmConfiguration.buildUpon() : new DrmConfiguration.Builder();
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmLicenseUri(@Nullable Uri uri) {
            this.drmConfiguration.setLicenseUri(uri);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmLicenseUri(@Nullable String str) {
            this.drmConfiguration.setLicenseUri(str);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmLicenseRequestHeaders(@Nullable Map<String, String> map) {
            DrmConfiguration.Builder builder = this.drmConfiguration;
            if (map == null) {
                map = ImmutableMap.m1190of();
            }
            builder.setLicenseRequestHeaders(map);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmUuid(@Nullable UUID uuid) {
            this.drmConfiguration.setNullableScheme(uuid);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmMultiSession(boolean z) {
            this.drmConfiguration.setMultiSession(z);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmForceDefaultLicenseUri(boolean z) {
            this.drmConfiguration.setForceDefaultLicenseUri(z);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmPlayClearContentWithoutKey(boolean z) {
            this.drmConfiguration.setPlayClearContentWithoutKey(z);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmSessionForClearPeriods(boolean z) {
            this.drmConfiguration.setForceSessionsForAudioAndVideoTracks(z);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmSessionForClearTypes(@Nullable List<Integer> list) {
            DrmConfiguration.Builder builder = this.drmConfiguration;
            if (list == null) {
                list = ImmutableList.m1171of();
            }
            builder.setForcedSessionTrackTypes(list);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setDrmKeySetId(@Nullable byte[] bArr) {
            this.drmConfiguration.setKeySetId(bArr);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setStreamKeys(@Nullable List<StreamKey> list) {
            List<StreamKey> listEmptyList;
            if (list != null && !list.isEmpty()) {
                listEmptyList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                listEmptyList = Collections.emptyList();
            }
            this.streamKeys = listEmptyList;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setCustomCacheKey(@Nullable String str) {
            this.customCacheKey = str;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setSubtitles(@Nullable List<Subtitle> list) {
            this.subtitleConfigurations = list != null ? ImmutableList.copyOf((Collection) list) : ImmutableList.m1171of();
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSubtitleConfigurations(List<SubtitleConfiguration> list) {
            this.subtitleConfigurations = ImmutableList.copyOf((Collection) list);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAdsConfiguration(@Nullable AdsConfiguration adsConfiguration) {
            this.adsConfiguration = adsConfiguration;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setAdTagUri(@Nullable String str) {
            return setAdTagUri(str != null ? Uri.parse(str) : null);
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setAdTagUri(@Nullable Uri uri) {
            return setAdTagUri(uri, null);
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setAdTagUri(@Nullable Uri uri, @Nullable Object obj) {
            this.adsConfiguration = uri != null ? new AdsConfiguration.Builder(uri).setAdsId(obj).build() : null;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLiveConfiguration(LiveConfiguration liveConfiguration) {
            this.liveConfiguration = liveConfiguration.buildUpon();
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setLiveTargetOffsetMs(long j) {
            this.liveConfiguration.setTargetOffsetMs(j);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setLiveMinOffsetMs(long j) {
            this.liveConfiguration.setMinOffsetMs(j);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setLiveMaxOffsetMs(long j) {
            this.liveConfiguration.setMaxOffsetMs(j);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setLiveMinPlaybackSpeed(float f) {
            this.liveConfiguration.setMinPlaybackSpeed(f);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        @Deprecated
        public Builder setLiveMaxPlaybackSpeed(float f) {
            this.liveConfiguration.setMaxPlaybackSpeed(f);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTag(@Nullable Object obj) {
            this.tag = obj;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setImageDurationMs(long j) {
            Assertions.checkArgument(j > 0 || j == C2732C.TIME_UNSET);
            this.imageDurationMs = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediaMetadata(MediaMetadata mediaMetadata) {
            this.mediaMetadata = mediaMetadata;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRequestMetadata(RequestMetadata requestMetadata) {
            this.requestMetadata = requestMetadata;
            return this;
        }

        public MediaItem build() {
            LocalConfiguration localConfiguration;
            Assertions.checkState(this.drmConfiguration.licenseUri == null || this.drmConfiguration.scheme != null);
            Uri uri = this.uri;
            if (uri != null) {
                localConfiguration = new LocalConfiguration(uri, this.mimeType, this.drmConfiguration.scheme != null ? this.drmConfiguration.build() : null, this.adsConfiguration, this.streamKeys, this.customCacheKey, this.subtitleConfigurations, this.tag, this.imageDurationMs);
            } else {
                localConfiguration = null;
            }
            String str = this.mediaId;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            ClippingProperties clippingPropertiesBuildClippingProperties = this.clippingConfiguration.buildClippingProperties();
            LiveConfiguration liveConfigurationBuild = this.liveConfiguration.build();
            MediaMetadata mediaMetadata = this.mediaMetadata;
            if (mediaMetadata == null) {
                mediaMetadata = MediaMetadata.EMPTY;
            }
            return new MediaItem(str2, clippingPropertiesBuildClippingProperties, localConfiguration, liveConfigurationBuild, mediaMetadata, this.requestMetadata);
        }
    }

    /* loaded from: classes.dex */
    public static final class DrmConfiguration implements Bundleable {
        public final boolean forceDefaultLicenseUri;
        public final ImmutableList<Integer> forcedSessionTrackTypes;

        @Nullable
        public final byte[] keySetId;
        public final ImmutableMap<String, String> licenseRequestHeaders;

        @Nullable
        public final Uri licenseUri;
        public final boolean multiSession;
        public final boolean playClearContentWithoutKey;

        @UnstableApi
        @Deprecated
        public final ImmutableMap<String, String> requestHeaders;
        public final UUID scheme;

        @UnstableApi
        @Deprecated
        public final ImmutableList<Integer> sessionForClearTypes;

        @UnstableApi
        @Deprecated
        public final UUID uuid;
        public static final String FIELD_SCHEME = Util.intToStringMaxRadix(0);
        public static final String FIELD_LICENSE_URI = Util.intToStringMaxRadix(1);
        public static final String FIELD_LICENSE_REQUEST_HEADERS = Util.intToStringMaxRadix(2);
        public static final String FIELD_MULTI_SESSION = Util.intToStringMaxRadix(3);

        @VisibleForTesting
        public static final String FIELD_PLAY_CLEAR_CONTENT_WITHOUT_KEY = Util.intToStringMaxRadix(4);
        public static final String FIELD_FORCE_DEFAULT_LICENSE_URI = Util.intToStringMaxRadix(5);
        public static final String FIELD_FORCED_SESSION_TRACK_TYPES = Util.intToStringMaxRadix(6);
        public static final String FIELD_KEY_SET_ID = Util.intToStringMaxRadix(7);

        @UnstableApi
        @Deprecated
        public static final Bundleable.Creator<DrmConfiguration> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$DrmConfiguration$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.DrmConfiguration.fromBundle(bundle);
            }
        };

        public /* synthetic */ DrmConfiguration(Builder builder, C27401 c27401) {
            this(builder);
        }

        /* loaded from: classes4.dex */
        public static final class Builder {
            public boolean forceDefaultLicenseUri;
            public ImmutableList<Integer> forcedSessionTrackTypes;

            @Nullable
            public byte[] keySetId;
            public ImmutableMap<String, String> licenseRequestHeaders;

            @Nullable
            public Uri licenseUri;
            public boolean multiSession;
            public boolean playClearContentWithoutKey;

            @Nullable
            public UUID scheme;

            public /* synthetic */ Builder(C27401 c27401) {
                this();
            }

            public /* synthetic */ Builder(DrmConfiguration drmConfiguration, C27401 c27401) {
                this(drmConfiguration);
            }

            public Builder(UUID uuid) {
                this();
                this.scheme = uuid;
            }

            @Deprecated
            public Builder() {
                this.licenseRequestHeaders = ImmutableMap.m1190of();
                this.playClearContentWithoutKey = true;
                this.forcedSessionTrackTypes = ImmutableList.m1171of();
            }

            public Builder(DrmConfiguration drmConfiguration) {
                this.scheme = drmConfiguration.scheme;
                this.licenseUri = drmConfiguration.licenseUri;
                this.licenseRequestHeaders = drmConfiguration.licenseRequestHeaders;
                this.multiSession = drmConfiguration.multiSession;
                this.playClearContentWithoutKey = drmConfiguration.playClearContentWithoutKey;
                this.forceDefaultLicenseUri = drmConfiguration.forceDefaultLicenseUri;
                this.forcedSessionTrackTypes = drmConfiguration.forcedSessionTrackTypes;
                this.keySetId = drmConfiguration.keySetId;
            }

            @CanIgnoreReturnValue
            public Builder setScheme(UUID uuid) {
                this.scheme = uuid;
                return this;
            }

            @CanIgnoreReturnValue
            @Deprecated
            public final Builder setNullableScheme(@Nullable UUID uuid) {
                this.scheme = uuid;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLicenseUri(@Nullable Uri uri) {
                this.licenseUri = uri;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLicenseUri(@Nullable String str) {
                this.licenseUri = str == null ? null : Uri.parse(str);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLicenseRequestHeaders(Map<String, String> map) {
                this.licenseRequestHeaders = ImmutableMap.copyOf((Map) map);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMultiSession(boolean z) {
                this.multiSession = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setForceDefaultLicenseUri(boolean z) {
                this.forceDefaultLicenseUri = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlayClearContentWithoutKey(boolean z) {
                this.playClearContentWithoutKey = z;
                return this;
            }

            @Deprecated
            @CanIgnoreReturnValue
            @InlineMe(replacement = "this.setForceSessionsForAudioAndVideoTracks(forceSessionsForAudioAndVideoTracks)")
            @UnstableApi
            public Builder forceSessionsForAudioAndVideoTracks(boolean z) {
                return setForceSessionsForAudioAndVideoTracks(z);
            }

            @CanIgnoreReturnValue
            public Builder setForceSessionsForAudioAndVideoTracks(boolean z) {
                ImmutableList immutableListM1171of;
                if (z) {
                    immutableListM1171of = ImmutableList.m1173of(2, 1);
                } else {
                    immutableListM1171of = ImmutableList.m1171of();
                }
                setForcedSessionTrackTypes(immutableListM1171of);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setForcedSessionTrackTypes(List<Integer> list) {
                this.forcedSessionTrackTypes = ImmutableList.copyOf((Collection) list);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setKeySetId(@Nullable byte[] bArr) {
                this.keySetId = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            public DrmConfiguration build() {
                return new DrmConfiguration(this);
            }
        }

        public DrmConfiguration(Builder builder) {
            Assertions.checkState((builder.forceDefaultLicenseUri && builder.licenseUri == null) ? false : true);
            UUID uuid = (UUID) Assertions.checkNotNull(builder.scheme);
            this.scheme = uuid;
            this.uuid = uuid;
            this.licenseUri = builder.licenseUri;
            this.requestHeaders = builder.licenseRequestHeaders;
            this.licenseRequestHeaders = builder.licenseRequestHeaders;
            this.multiSession = builder.multiSession;
            this.forceDefaultLicenseUri = builder.forceDefaultLicenseUri;
            this.playClearContentWithoutKey = builder.playClearContentWithoutKey;
            this.sessionForClearTypes = builder.forcedSessionTrackTypes;
            this.forcedSessionTrackTypes = builder.forcedSessionTrackTypes;
            this.keySetId = builder.keySetId != null ? Arrays.copyOf(builder.keySetId, builder.keySetId.length) : null;
        }

        @Nullable
        public byte[] getKeySetId() {
            byte[] bArr = this.keySetId;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrmConfiguration)) {
                return false;
            }
            DrmConfiguration drmConfiguration = (DrmConfiguration) obj;
            return this.scheme.equals(drmConfiguration.scheme) && Util.areEqual(this.licenseUri, drmConfiguration.licenseUri) && Util.areEqual(this.licenseRequestHeaders, drmConfiguration.licenseRequestHeaders) && this.multiSession == drmConfiguration.multiSession && this.forceDefaultLicenseUri == drmConfiguration.forceDefaultLicenseUri && this.playClearContentWithoutKey == drmConfiguration.playClearContentWithoutKey && this.forcedSessionTrackTypes.equals(drmConfiguration.forcedSessionTrackTypes) && Arrays.equals(this.keySetId, drmConfiguration.keySetId);
        }

        public int hashCode() {
            int iHashCode = this.scheme.hashCode() * 31;
            Uri uri = this.licenseUri;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.licenseRequestHeaders.hashCode()) * 31) + (this.multiSession ? 1 : 0)) * 31) + (this.forceDefaultLicenseUri ? 1 : 0)) * 31) + (this.playClearContentWithoutKey ? 1 : 0)) * 31) + this.forcedSessionTrackTypes.hashCode()) * 31) + Arrays.hashCode(this.keySetId);
        }

        @UnstableApi
        public static DrmConfiguration fromBundle(Bundle bundle) {
            UUID uuidFromString = UUID.fromString((String) Assertions.checkNotNull(bundle.getString(FIELD_SCHEME)));
            Uri uri = (Uri) bundle.getParcelable(FIELD_LICENSE_URI);
            ImmutableMap<String, String> immutableMapBundleToStringImmutableMap = BundleCollectionUtil.bundleToStringImmutableMap(BundleCollectionUtil.getBundleWithDefault(bundle, FIELD_LICENSE_REQUEST_HEADERS, Bundle.EMPTY));
            boolean z = bundle.getBoolean(FIELD_MULTI_SESSION, false);
            boolean z2 = bundle.getBoolean(FIELD_PLAY_CLEAR_CONTENT_WITHOUT_KEY, false);
            boolean z3 = bundle.getBoolean(FIELD_FORCE_DEFAULT_LICENSE_URI, false);
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) BundleCollectionUtil.getIntegerArrayListWithDefault(bundle, FIELD_FORCED_SESSION_TRACK_TYPES, new ArrayList()));
            return new Builder(uuidFromString).setLicenseUri(uri).setLicenseRequestHeaders(immutableMapBundleToStringImmutableMap).setMultiSession(z).setForceDefaultLicenseUri(z3).setPlayClearContentWithoutKey(z2).setForcedSessionTrackTypes(immutableListCopyOf).setKeySetId(bundle.getByteArray(FIELD_KEY_SET_ID)).build();
        }

        @Override // androidx.media3.common.Bundleable
        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(FIELD_SCHEME, this.scheme.toString());
            Uri uri = this.licenseUri;
            if (uri != null) {
                bundle.putParcelable(FIELD_LICENSE_URI, uri);
            }
            if (!this.licenseRequestHeaders.isEmpty()) {
                bundle.putBundle(FIELD_LICENSE_REQUEST_HEADERS, BundleCollectionUtil.stringMapToBundle(this.licenseRequestHeaders));
            }
            boolean z = this.multiSession;
            if (z) {
                bundle.putBoolean(FIELD_MULTI_SESSION, z);
            }
            boolean z2 = this.playClearContentWithoutKey;
            if (z2) {
                bundle.putBoolean(FIELD_PLAY_CLEAR_CONTENT_WITHOUT_KEY, z2);
            }
            boolean z3 = this.forceDefaultLicenseUri;
            if (z3) {
                bundle.putBoolean(FIELD_FORCE_DEFAULT_LICENSE_URI, z3);
            }
            if (!this.forcedSessionTrackTypes.isEmpty()) {
                bundle.putIntegerArrayList(FIELD_FORCED_SESSION_TRACK_TYPES, new ArrayList<>(this.forcedSessionTrackTypes));
            }
            byte[] bArr = this.keySetId;
            if (bArr != null) {
                bundle.putByteArray(FIELD_KEY_SET_ID, bArr);
            }
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static final class AdsConfiguration implements Bundleable {
        public final Uri adTagUri;

        @Nullable
        public final Object adsId;
        public static final String FIELD_AD_TAG_URI = Util.intToStringMaxRadix(0);

        @UnstableApi
        @Deprecated
        public static final Bundleable.Creator<AdsConfiguration> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$AdsConfiguration$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.AdsConfiguration.fromBundle(bundle);
            }
        };

        public /* synthetic */ AdsConfiguration(Builder builder, C27401 c27401) {
            this(builder);
        }

        /* loaded from: classes4.dex */
        public static final class Builder {
            public Uri adTagUri;

            @Nullable
            public Object adsId;

            public Builder(Uri uri) {
                this.adTagUri = uri;
            }

            @CanIgnoreReturnValue
            public Builder setAdTagUri(Uri uri) {
                this.adTagUri = uri;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAdsId(@Nullable Object obj) {
                this.adsId = obj;
                return this;
            }

            public AdsConfiguration build() {
                return new AdsConfiguration(this);
            }
        }

        public AdsConfiguration(Builder builder) {
            this.adTagUri = builder.adTagUri;
            this.adsId = builder.adsId;
        }

        public Builder buildUpon() {
            return new Builder(this.adTagUri).setAdsId(this.adsId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdsConfiguration)) {
                return false;
            }
            AdsConfiguration adsConfiguration = (AdsConfiguration) obj;
            return this.adTagUri.equals(adsConfiguration.adTagUri) && Util.areEqual(this.adsId, adsConfiguration.adsId);
        }

        public int hashCode() {
            int iHashCode = this.adTagUri.hashCode() * 31;
            Object obj = this.adsId;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        @UnstableApi
        public static AdsConfiguration fromBundle(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(FIELD_AD_TAG_URI);
            Assertions.checkNotNull(uri);
            return new Builder(uri).build();
        }

        @Override // androidx.media3.common.Bundleable
        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(FIELD_AD_TAG_URI, this.adTagUri);
            return bundle;
        }
    }

    public static final class LocalConfiguration implements Bundleable {

        @Nullable
        public final AdsConfiguration adsConfiguration;

        @Nullable
        @UnstableApi
        public final String customCacheKey;

        @Nullable
        public final DrmConfiguration drmConfiguration;

        @UnstableApi
        public final long imageDurationMs;

        @Nullable
        public final String mimeType;

        @UnstableApi
        public final List<StreamKey> streamKeys;
        public final ImmutableList<SubtitleConfiguration> subtitleConfigurations;

        @UnstableApi
        @Deprecated
        public final List<Subtitle> subtitles;

        @Nullable
        public final Object tag;
        public final Uri uri;
        public static final String FIELD_URI = Util.intToStringMaxRadix(0);
        public static final String FIELD_MIME_TYPE = Util.intToStringMaxRadix(1);
        public static final String FIELD_DRM_CONFIGURATION = Util.intToStringMaxRadix(2);
        public static final String FIELD_ADS_CONFIGURATION = Util.intToStringMaxRadix(3);
        public static final String FIELD_STREAM_KEYS = Util.intToStringMaxRadix(4);
        public static final String FIELD_CUSTOM_CACHE_KEY = Util.intToStringMaxRadix(5);
        public static final String FIELD_SUBTITLE_CONFIGURATION = Util.intToStringMaxRadix(6);
        public static final String FIELD_IMAGE_DURATION_MS = Util.intToStringMaxRadix(7);

        @UnstableApi
        @Deprecated
        public static final Bundleable.Creator<LocalConfiguration> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$LocalConfiguration$$ExternalSyntheticLambda2
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.LocalConfiguration.fromBundle(bundle);
            }
        };

        public /* synthetic */ LocalConfiguration(Uri uri, String str, DrmConfiguration drmConfiguration, AdsConfiguration adsConfiguration, List list, String str2, ImmutableList immutableList, Object obj, long j, C27401 c27401) {
            this(uri, str, drmConfiguration, adsConfiguration, list, str2, immutableList, obj, j);
        }

        public LocalConfiguration(Uri uri, @Nullable String str, @Nullable DrmConfiguration drmConfiguration, @Nullable AdsConfiguration adsConfiguration, List<StreamKey> list, @Nullable String str2, ImmutableList<SubtitleConfiguration> immutableList, @Nullable Object obj, long j) {
            this.uri = uri;
            this.mimeType = MimeTypes.normalizeMimeType(str);
            this.drmConfiguration = drmConfiguration;
            this.adsConfiguration = adsConfiguration;
            this.streamKeys = list;
            this.customCacheKey = str2;
            this.subtitleConfigurations = immutableList;
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i = 0; i < immutableList.size(); i++) {
                builder.add((ImmutableList.Builder) immutableList.get(i).buildUpon().buildSubtitle());
            }
            this.subtitles = builder.build();
            this.tag = obj;
            this.imageDurationMs = j;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalConfiguration)) {
                return false;
            }
            LocalConfiguration localConfiguration = (LocalConfiguration) obj;
            return this.uri.equals(localConfiguration.uri) && Util.areEqual(this.mimeType, localConfiguration.mimeType) && Util.areEqual(this.drmConfiguration, localConfiguration.drmConfiguration) && Util.areEqual(this.adsConfiguration, localConfiguration.adsConfiguration) && this.streamKeys.equals(localConfiguration.streamKeys) && Util.areEqual(this.customCacheKey, localConfiguration.customCacheKey) && this.subtitleConfigurations.equals(localConfiguration.subtitleConfigurations) && Util.areEqual(this.tag, localConfiguration.tag) && Util.areEqual(Long.valueOf(this.imageDurationMs), Long.valueOf(localConfiguration.imageDurationMs));
        }

        public int hashCode() {
            int iHashCode = this.uri.hashCode() * 31;
            String str = this.mimeType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DrmConfiguration drmConfiguration = this.drmConfiguration;
            int iHashCode3 = (iHashCode2 + (drmConfiguration == null ? 0 : drmConfiguration.hashCode())) * 31;
            AdsConfiguration adsConfiguration = this.adsConfiguration;
            int iHashCode4 = (((iHashCode3 + (adsConfiguration == null ? 0 : adsConfiguration.hashCode())) * 31) + this.streamKeys.hashCode()) * 31;
            String str2 = this.customCacheKey;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.subtitleConfigurations.hashCode()) * 31;
            return (int) (((iHashCode5 + (this.tag != null ? r1.hashCode() : 0)) * 31) + this.imageDurationMs);
        }

        @Override // androidx.media3.common.Bundleable
        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(FIELD_URI, this.uri);
            String str = this.mimeType;
            if (str != null) {
                bundle.putString(FIELD_MIME_TYPE, str);
            }
            DrmConfiguration drmConfiguration = this.drmConfiguration;
            if (drmConfiguration != null) {
                bundle.putBundle(FIELD_DRM_CONFIGURATION, drmConfiguration.toBundle());
            }
            AdsConfiguration adsConfiguration = this.adsConfiguration;
            if (adsConfiguration != null) {
                bundle.putBundle(FIELD_ADS_CONFIGURATION, adsConfiguration.toBundle());
            }
            if (!this.streamKeys.isEmpty()) {
                bundle.putParcelableArrayList(FIELD_STREAM_KEYS, BundleCollectionUtil.toBundleArrayList(this.streamKeys, new Function() { // from class: androidx.media3.common.MediaItem$LocalConfiguration$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return ((StreamKey) obj).toBundle();
                    }
                }));
            }
            String str2 = this.customCacheKey;
            if (str2 != null) {
                bundle.putString(FIELD_CUSTOM_CACHE_KEY, str2);
            }
            if (!this.subtitleConfigurations.isEmpty()) {
                bundle.putParcelableArrayList(FIELD_SUBTITLE_CONFIGURATION, BundleCollectionUtil.toBundleArrayList(this.subtitleConfigurations, new Function() { // from class: androidx.media3.common.MediaItem$LocalConfiguration$$ExternalSyntheticLambda1
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return ((MediaItem.SubtitleConfiguration) obj).toBundle();
                    }
                }));
            }
            long j = this.imageDurationMs;
            if (j != C2732C.TIME_UNSET) {
                bundle.putLong(FIELD_IMAGE_DURATION_MS, j);
            }
            return bundle;
        }

        @UnstableApi
        public static LocalConfiguration fromBundle(Bundle bundle) {
            ImmutableList immutableListFromBundleList;
            ImmutableList immutableListFromBundleList2;
            Bundle bundle2 = bundle.getBundle(FIELD_DRM_CONFIGURATION);
            DrmConfiguration drmConfigurationFromBundle = bundle2 == null ? null : DrmConfiguration.fromBundle(bundle2);
            Bundle bundle3 = bundle.getBundle(FIELD_ADS_CONFIGURATION);
            AdsConfiguration adsConfigurationFromBundle = bundle3 != null ? AdsConfiguration.fromBundle(bundle3) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_STREAM_KEYS);
            if (parcelableArrayList == null) {
                immutableListFromBundleList = ImmutableList.m1171of();
            } else {
                immutableListFromBundleList = BundleCollectionUtil.fromBundleList(new Function() { // from class: androidx.media3.common.MediaItem$LocalConfiguration$$ExternalSyntheticLambda3
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return StreamKey.fromBundle((Bundle) obj);
                    }
                }, parcelableArrayList);
            }
            ImmutableList immutableList = immutableListFromBundleList;
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(FIELD_SUBTITLE_CONFIGURATION);
            if (parcelableArrayList2 == null) {
                immutableListFromBundleList2 = ImmutableList.m1171of();
            } else {
                immutableListFromBundleList2 = BundleCollectionUtil.fromBundleList(new Function() { // from class: androidx.media3.common.MediaItem$LocalConfiguration$$ExternalSyntheticLambda4
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return MediaItem.SubtitleConfiguration.fromBundle((Bundle) obj);
                    }
                }, parcelableArrayList2);
            }
            return new LocalConfiguration((Uri) Assertions.checkNotNull((Uri) bundle.getParcelable(FIELD_URI)), bundle.getString(FIELD_MIME_TYPE), drmConfigurationFromBundle, adsConfigurationFromBundle, immutableList, bundle.getString(FIELD_CUSTOM_CACHE_KEY), immutableListFromBundleList2, null, bundle.getLong(FIELD_IMAGE_DURATION_MS, C2732C.TIME_UNSET));
        }
    }

    /* loaded from: classes.dex */
    public static final class LiveConfiguration implements Bundleable {
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;
        public static final LiveConfiguration UNSET = new Builder().build();
        public static final String FIELD_TARGET_OFFSET_MS = Util.intToStringMaxRadix(0);
        public static final String FIELD_MIN_OFFSET_MS = Util.intToStringMaxRadix(1);
        public static final String FIELD_MAX_OFFSET_MS = Util.intToStringMaxRadix(2);
        public static final String FIELD_MIN_PLAYBACK_SPEED = Util.intToStringMaxRadix(3);
        public static final String FIELD_MAX_PLAYBACK_SPEED = Util.intToStringMaxRadix(4);

        @UnstableApi
        @Deprecated
        public static final Bundleable.Creator<LiveConfiguration> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$LiveConfiguration$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.LiveConfiguration.fromBundle(bundle);
            }
        };

        public /* synthetic */ LiveConfiguration(Builder builder, C27401 c27401) {
            this(builder);
        }

        /* loaded from: classes4.dex */
        public static final class Builder {
            public long maxOffsetMs;
            public float maxPlaybackSpeed;
            public long minOffsetMs;
            public float minPlaybackSpeed;
            public long targetOffsetMs;

            public /* synthetic */ Builder(LiveConfiguration liveConfiguration, C27401 c27401) {
                this(liveConfiguration);
            }

            public Builder() {
                this.targetOffsetMs = C2732C.TIME_UNSET;
                this.minOffsetMs = C2732C.TIME_UNSET;
                this.maxOffsetMs = C2732C.TIME_UNSET;
                this.minPlaybackSpeed = -3.4028235E38f;
                this.maxPlaybackSpeed = -3.4028235E38f;
            }

            public Builder(LiveConfiguration liveConfiguration) {
                this.targetOffsetMs = liveConfiguration.targetOffsetMs;
                this.minOffsetMs = liveConfiguration.minOffsetMs;
                this.maxOffsetMs = liveConfiguration.maxOffsetMs;
                this.minPlaybackSpeed = liveConfiguration.minPlaybackSpeed;
                this.maxPlaybackSpeed = liveConfiguration.maxPlaybackSpeed;
            }

            @CanIgnoreReturnValue
            public Builder setTargetOffsetMs(long j) {
                this.targetOffsetMs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMinOffsetMs(long j) {
                this.minOffsetMs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMaxOffsetMs(long j) {
                this.maxOffsetMs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMinPlaybackSpeed(float f) {
                this.minPlaybackSpeed = f;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMaxPlaybackSpeed(float f) {
                this.maxPlaybackSpeed = f;
                return this;
            }

            public LiveConfiguration build() {
                return new LiveConfiguration(this);
            }
        }

        public LiveConfiguration(Builder builder) {
            this(builder.targetOffsetMs, builder.minOffsetMs, builder.maxOffsetMs, builder.minPlaybackSpeed, builder.maxPlaybackSpeed);
        }

        @UnstableApi
        @Deprecated
        public LiveConfiguration(long j, long j2, long j3, float f, float f2) {
            this.targetOffsetMs = j;
            this.minOffsetMs = j2;
            this.maxOffsetMs = j3;
            this.minPlaybackSpeed = f;
            this.maxPlaybackSpeed = f2;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveConfiguration)) {
                return false;
            }
            LiveConfiguration liveConfiguration = (LiveConfiguration) obj;
            return this.targetOffsetMs == liveConfiguration.targetOffsetMs && this.minOffsetMs == liveConfiguration.minOffsetMs && this.maxOffsetMs == liveConfiguration.maxOffsetMs && this.minPlaybackSpeed == liveConfiguration.minPlaybackSpeed && this.maxPlaybackSpeed == liveConfiguration.maxPlaybackSpeed;
        }

        public int hashCode() {
            long j = this.targetOffsetMs;
            long j2 = this.minOffsetMs;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.maxOffsetMs;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.minPlaybackSpeed;
            int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.maxPlaybackSpeed;
            return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }

        @Override // androidx.media3.common.Bundleable
        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.targetOffsetMs;
            LiveConfiguration liveConfiguration = UNSET;
            if (j != liveConfiguration.targetOffsetMs) {
                bundle.putLong(FIELD_TARGET_OFFSET_MS, j);
            }
            long j2 = this.minOffsetMs;
            if (j2 != liveConfiguration.minOffsetMs) {
                bundle.putLong(FIELD_MIN_OFFSET_MS, j2);
            }
            long j3 = this.maxOffsetMs;
            if (j3 != liveConfiguration.maxOffsetMs) {
                bundle.putLong(FIELD_MAX_OFFSET_MS, j3);
            }
            float f = this.minPlaybackSpeed;
            if (f != liveConfiguration.minPlaybackSpeed) {
                bundle.putFloat(FIELD_MIN_PLAYBACK_SPEED, f);
            }
            float f2 = this.maxPlaybackSpeed;
            if (f2 != liveConfiguration.maxPlaybackSpeed) {
                bundle.putFloat(FIELD_MAX_PLAYBACK_SPEED, f2);
            }
            return bundle;
        }

        @UnstableApi
        public static LiveConfiguration fromBundle(Bundle bundle) {
            Builder builder = new Builder();
            String str = FIELD_TARGET_OFFSET_MS;
            LiveConfiguration liveConfiguration = UNSET;
            return builder.setTargetOffsetMs(bundle.getLong(str, liveConfiguration.targetOffsetMs)).setMinOffsetMs(bundle.getLong(FIELD_MIN_OFFSET_MS, liveConfiguration.minOffsetMs)).setMaxOffsetMs(bundle.getLong(FIELD_MAX_OFFSET_MS, liveConfiguration.maxOffsetMs)).setMinPlaybackSpeed(bundle.getFloat(FIELD_MIN_PLAYBACK_SPEED, liveConfiguration.minPlaybackSpeed)).setMaxPlaybackSpeed(bundle.getFloat(FIELD_MAX_PLAYBACK_SPEED, liveConfiguration.maxPlaybackSpeed)).build();
        }
    }

    public static class SubtitleConfiguration implements Bundleable {

        /* renamed from: id */
        @Nullable
        public final String f304id;

        @Nullable
        public final String label;

        @Nullable
        public final String language;

        @Nullable
        public final String mimeType;
        public final int roleFlags;
        public final int selectionFlags;
        public final Uri uri;
        public static final String FIELD_URI = Util.intToStringMaxRadix(0);
        public static final String FIELD_MIME_TYPE = Util.intToStringMaxRadix(1);
        public static final String FIELD_LANGUAGE = Util.intToStringMaxRadix(2);
        public static final String FIELD_SELECTION_FLAGS = Util.intToStringMaxRadix(3);
        public static final String FIELD_ROLE_FLAGS = Util.intToStringMaxRadix(4);
        public static final String FIELD_LABEL = Util.intToStringMaxRadix(5);
        public static final String FIELD_ID = Util.intToStringMaxRadix(6);

        @UnstableApi
        @Deprecated
        public static final Bundleable.Creator<SubtitleConfiguration> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$SubtitleConfiguration$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.SubtitleConfiguration.fromBundle(bundle);
            }
        };

        public /* synthetic */ SubtitleConfiguration(Uri uri, String str, String str2, int i, int i2, String str3, String str4, C27401 c27401) {
            this(uri, str, str2, i, i2, str3, str4);
        }

        public /* synthetic */ SubtitleConfiguration(Builder builder, C27401 c27401) {
            this(builder);
        }

        /* loaded from: classes4.dex */
        public static final class Builder {

            /* renamed from: id */
            @Nullable
            public String f305id;

            @Nullable
            public String label;

            @Nullable
            public String language;

            @Nullable
            public String mimeType;
            public int roleFlags;
            public int selectionFlags;
            public Uri uri;

            public /* synthetic */ Builder(SubtitleConfiguration subtitleConfiguration, C27401 c27401) {
                this(subtitleConfiguration);
            }

            public Builder(Uri uri) {
                this.uri = uri;
            }

            public Builder(SubtitleConfiguration subtitleConfiguration) {
                this.uri = subtitleConfiguration.uri;
                this.mimeType = subtitleConfiguration.mimeType;
                this.language = subtitleConfiguration.language;
                this.selectionFlags = subtitleConfiguration.selectionFlags;
                this.roleFlags = subtitleConfiguration.roleFlags;
                this.label = subtitleConfiguration.label;
                this.f305id = subtitleConfiguration.f304id;
            }

            @CanIgnoreReturnValue
            public Builder setUri(Uri uri) {
                this.uri = uri;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMimeType(@Nullable String str) {
                this.mimeType = MimeTypes.normalizeMimeType(str);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLanguage(@Nullable String str) {
                this.language = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSelectionFlags(int i) {
                this.selectionFlags = i;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRoleFlags(int i) {
                this.roleFlags = i;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLabel(@Nullable String str) {
                this.label = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setId(@Nullable String str) {
                this.f305id = str;
                return this;
            }

            public SubtitleConfiguration build() {
                return new SubtitleConfiguration(this);
            }

            public final Subtitle buildSubtitle() {
                return new Subtitle(this);
            }
        }

        public SubtitleConfiguration(Uri uri, String str, @Nullable String str2, int i, int i2, @Nullable String str3, @Nullable String str4) {
            this.uri = uri;
            this.mimeType = MimeTypes.normalizeMimeType(str);
            this.language = str2;
            this.selectionFlags = i;
            this.roleFlags = i2;
            this.label = str3;
            this.f304id = str4;
        }

        public SubtitleConfiguration(Builder builder) {
            this.uri = builder.uri;
            this.mimeType = builder.mimeType;
            this.language = builder.language;
            this.selectionFlags = builder.selectionFlags;
            this.roleFlags = builder.roleFlags;
            this.label = builder.label;
            this.f304id = builder.f305id;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubtitleConfiguration)) {
                return false;
            }
            SubtitleConfiguration subtitleConfiguration = (SubtitleConfiguration) obj;
            return this.uri.equals(subtitleConfiguration.uri) && Util.areEqual(this.mimeType, subtitleConfiguration.mimeType) && Util.areEqual(this.language, subtitleConfiguration.language) && this.selectionFlags == subtitleConfiguration.selectionFlags && this.roleFlags == subtitleConfiguration.roleFlags && Util.areEqual(this.label, subtitleConfiguration.label) && Util.areEqual(this.f304id, subtitleConfiguration.f304id);
        }

        public int hashCode() {
            int iHashCode = this.uri.hashCode() * 31;
            String str = this.mimeType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.language;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31;
            String str3 = this.label;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f304id;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @UnstableApi
        public static SubtitleConfiguration fromBundle(Bundle bundle) {
            Uri uri = (Uri) Assertions.checkNotNull((Uri) bundle.getParcelable(FIELD_URI));
            String string = bundle.getString(FIELD_MIME_TYPE);
            String string2 = bundle.getString(FIELD_LANGUAGE);
            int i = bundle.getInt(FIELD_SELECTION_FLAGS, 0);
            int i2 = bundle.getInt(FIELD_ROLE_FLAGS, 0);
            String string3 = bundle.getString(FIELD_LABEL);
            return new Builder(uri).setMimeType(string).setLanguage(string2).setSelectionFlags(i).setRoleFlags(i2).setLabel(string3).setId(bundle.getString(FIELD_ID)).build();
        }

        @Override // androidx.media3.common.Bundleable
        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(FIELD_URI, this.uri);
            String str = this.mimeType;
            if (str != null) {
                bundle.putString(FIELD_MIME_TYPE, str);
            }
            String str2 = this.language;
            if (str2 != null) {
                bundle.putString(FIELD_LANGUAGE, str2);
            }
            int i = this.selectionFlags;
            if (i != 0) {
                bundle.putInt(FIELD_SELECTION_FLAGS, i);
            }
            int i2 = this.roleFlags;
            if (i2 != 0) {
                bundle.putInt(FIELD_ROLE_FLAGS, i2);
            }
            String str3 = this.label;
            if (str3 != null) {
                bundle.putString(FIELD_LABEL, str3);
            }
            String str4 = this.f304id;
            if (str4 != null) {
                bundle.putString(FIELD_ID, str4);
            }
            return bundle;
        }
    }

    @UnstableApi
    @Deprecated
    /* loaded from: classes4.dex */
    public static final class Subtitle extends SubtitleConfiguration {
        public /* synthetic */ Subtitle(SubtitleConfiguration.Builder builder, C27401 c27401) {
            this(builder);
        }

        @UnstableApi
        @Deprecated
        public Subtitle(Uri uri, String str, @Nullable String str2) {
            this(uri, str, str2, 0);
        }

        @UnstableApi
        @Deprecated
        public Subtitle(Uri uri, String str, @Nullable String str2, int i) {
            this(uri, str, str2, i, 0, null);
        }

        @UnstableApi
        @Deprecated
        public Subtitle(Uri uri, String str, @Nullable String str2, int i, int i2, @Nullable String str3) {
            super(uri, str, str2, i, i2, str3, null);
        }

        public Subtitle(SubtitleConfiguration.Builder builder) {
            super(builder);
        }
    }

    /* loaded from: classes.dex */
    public static class ClippingConfiguration implements Bundleable {
        public final long endPositionMs;

        @UnstableApi
        public final long endPositionUs;
        public final boolean relativeToDefaultPosition;
        public final boolean relativeToLiveWindow;

        @IntRange(from = 0)
        public final long startPositionMs;

        @IntRange(from = 0)
        @UnstableApi
        public final long startPositionUs;
        public final boolean startsAtKeyFrame;
        public static final ClippingConfiguration UNSET = new Builder().build();
        public static final String FIELD_START_POSITION_MS = Util.intToStringMaxRadix(0);
        public static final String FIELD_END_POSITION_MS = Util.intToStringMaxRadix(1);
        public static final String FIELD_RELATIVE_TO_LIVE_WINDOW = Util.intToStringMaxRadix(2);
        public static final String FIELD_RELATIVE_TO_DEFAULT_POSITION = Util.intToStringMaxRadix(3);
        public static final String FIELD_STARTS_AT_KEY_FRAME = Util.intToStringMaxRadix(4);
        public static final String FIELD_START_POSITION_US = Util.intToStringMaxRadix(5);
        public static final String FIELD_END_POSITION_US = Util.intToStringMaxRadix(6);

        @UnstableApi
        @Deprecated
        public static final Bundleable.Creator<ClippingProperties> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$ClippingConfiguration$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.ClippingConfiguration.fromBundle(bundle);
            }
        };

        public /* synthetic */ ClippingConfiguration(Builder builder, C27401 c27401) {
            this(builder);
        }

        /* loaded from: classes4.dex */
        public static final class Builder {
            public long endPositionUs;
            public boolean relativeToDefaultPosition;
            public boolean relativeToLiveWindow;
            public long startPositionUs;
            public boolean startsAtKeyFrame;

            public /* synthetic */ Builder(ClippingConfiguration clippingConfiguration, C27401 c27401) {
                this(clippingConfiguration);
            }

            public Builder() {
                this.endPositionUs = Long.MIN_VALUE;
            }

            public Builder(ClippingConfiguration clippingConfiguration) {
                this.startPositionUs = clippingConfiguration.startPositionUs;
                this.endPositionUs = clippingConfiguration.endPositionUs;
                this.relativeToLiveWindow = clippingConfiguration.relativeToLiveWindow;
                this.relativeToDefaultPosition = clippingConfiguration.relativeToDefaultPosition;
                this.startsAtKeyFrame = clippingConfiguration.startsAtKeyFrame;
            }

            @CanIgnoreReturnValue
            public Builder setStartPositionMs(@IntRange(from = 0) long j) {
                return setStartPositionUs(Util.msToUs(j));
            }

            @CanIgnoreReturnValue
            @UnstableApi
            public Builder setStartPositionUs(@IntRange(from = 0) long j) {
                Assertions.checkArgument(j >= 0);
                this.startPositionUs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setEndPositionMs(long j) {
                return setEndPositionUs(Util.msToUs(j));
            }

            @CanIgnoreReturnValue
            @UnstableApi
            public Builder setEndPositionUs(long j) {
                Assertions.checkArgument(j == Long.MIN_VALUE || j >= 0);
                this.endPositionUs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRelativeToLiveWindow(boolean z) {
                this.relativeToLiveWindow = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRelativeToDefaultPosition(boolean z) {
                this.relativeToDefaultPosition = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStartsAtKeyFrame(boolean z) {
                this.startsAtKeyFrame = z;
                return this;
            }

            public ClippingConfiguration build() {
                return new ClippingConfiguration(this);
            }

            @UnstableApi
            @Deprecated
            public ClippingProperties buildClippingProperties() {
                return new ClippingProperties(this);
            }
        }

        public ClippingConfiguration(Builder builder) {
            this.startPositionMs = Util.usToMs(builder.startPositionUs);
            this.endPositionMs = Util.usToMs(builder.endPositionUs);
            this.startPositionUs = builder.startPositionUs;
            this.endPositionUs = builder.endPositionUs;
            this.relativeToLiveWindow = builder.relativeToLiveWindow;
            this.relativeToDefaultPosition = builder.relativeToDefaultPosition;
            this.startsAtKeyFrame = builder.startsAtKeyFrame;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClippingConfiguration)) {
                return false;
            }
            ClippingConfiguration clippingConfiguration = (ClippingConfiguration) obj;
            return this.startPositionUs == clippingConfiguration.startPositionUs && this.endPositionUs == clippingConfiguration.endPositionUs && this.relativeToLiveWindow == clippingConfiguration.relativeToLiveWindow && this.relativeToDefaultPosition == clippingConfiguration.relativeToDefaultPosition && this.startsAtKeyFrame == clippingConfiguration.startsAtKeyFrame;
        }

        public int hashCode() {
            long j = this.startPositionUs;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.endPositionUs;
            return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.relativeToLiveWindow ? 1 : 0)) * 31) + (this.relativeToDefaultPosition ? 1 : 0)) * 31) + (this.startsAtKeyFrame ? 1 : 0);
        }

        @Override // androidx.media3.common.Bundleable
        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.startPositionMs;
            ClippingConfiguration clippingConfiguration = UNSET;
            if (j != clippingConfiguration.startPositionMs) {
                bundle.putLong(FIELD_START_POSITION_MS, j);
            }
            long j2 = this.endPositionMs;
            if (j2 != clippingConfiguration.endPositionMs) {
                bundle.putLong(FIELD_END_POSITION_MS, j2);
            }
            long j3 = this.startPositionUs;
            if (j3 != clippingConfiguration.startPositionUs) {
                bundle.putLong(FIELD_START_POSITION_US, j3);
            }
            long j4 = this.endPositionUs;
            if (j4 != clippingConfiguration.endPositionUs) {
                bundle.putLong(FIELD_END_POSITION_US, j4);
            }
            boolean z = this.relativeToLiveWindow;
            if (z != clippingConfiguration.relativeToLiveWindow) {
                bundle.putBoolean(FIELD_RELATIVE_TO_LIVE_WINDOW, z);
            }
            boolean z2 = this.relativeToDefaultPosition;
            if (z2 != clippingConfiguration.relativeToDefaultPosition) {
                bundle.putBoolean(FIELD_RELATIVE_TO_DEFAULT_POSITION, z2);
            }
            boolean z3 = this.startsAtKeyFrame;
            if (z3 != clippingConfiguration.startsAtKeyFrame) {
                bundle.putBoolean(FIELD_STARTS_AT_KEY_FRAME, z3);
            }
            return bundle;
        }

        @UnstableApi
        public static ClippingProperties fromBundle(Bundle bundle) {
            Builder builder = new Builder();
            String str = FIELD_START_POSITION_MS;
            ClippingConfiguration clippingConfiguration = UNSET;
            Builder startsAtKeyFrame = builder.setStartPositionMs(bundle.getLong(str, clippingConfiguration.startPositionMs)).setEndPositionMs(bundle.getLong(FIELD_END_POSITION_MS, clippingConfiguration.endPositionMs)).setRelativeToLiveWindow(bundle.getBoolean(FIELD_RELATIVE_TO_LIVE_WINDOW, clippingConfiguration.relativeToLiveWindow)).setRelativeToDefaultPosition(bundle.getBoolean(FIELD_RELATIVE_TO_DEFAULT_POSITION, clippingConfiguration.relativeToDefaultPosition)).setStartsAtKeyFrame(bundle.getBoolean(FIELD_STARTS_AT_KEY_FRAME, clippingConfiguration.startsAtKeyFrame));
            long j = bundle.getLong(FIELD_START_POSITION_US, clippingConfiguration.startPositionUs);
            if (j != clippingConfiguration.startPositionUs) {
                startsAtKeyFrame.setStartPositionUs(j);
            }
            long j2 = bundle.getLong(FIELD_END_POSITION_US, clippingConfiguration.endPositionUs);
            if (j2 != clippingConfiguration.endPositionUs) {
                startsAtKeyFrame.setEndPositionUs(j2);
            }
            return startsAtKeyFrame.buildClippingProperties();
        }
    }

    @UnstableApi
    @Deprecated
    /* loaded from: classes4.dex */
    public static final class ClippingProperties extends ClippingConfiguration {
        public static final ClippingProperties UNSET = new ClippingConfiguration.Builder().buildClippingProperties();

        public /* synthetic */ ClippingProperties(ClippingConfiguration.Builder builder, C27401 c27401) {
            this(builder);
        }

        public ClippingProperties(ClippingConfiguration.Builder builder) {
            super(builder);
        }
    }

    public static final class RequestMetadata implements Bundleable {

        @Nullable
        public final Bundle extras;

        @Nullable
        public final Uri mediaUri;

        @Nullable
        public final String searchQuery;
        public static final RequestMetadata EMPTY = new Builder().build();
        public static final String FIELD_MEDIA_URI = Util.intToStringMaxRadix(0);
        public static final String FIELD_SEARCH_QUERY = Util.intToStringMaxRadix(1);
        public static final String FIELD_EXTRAS = Util.intToStringMaxRadix(2);

        @UnstableApi
        @Deprecated
        public static final Bundleable.Creator<RequestMetadata> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.MediaItem$RequestMetadata$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.RequestMetadata.fromBundle(bundle);
            }
        };

        public /* synthetic */ RequestMetadata(Builder builder, C27401 c27401) {
            this(builder);
        }

        /* loaded from: classes4.dex */
        public static final class Builder {

            @Nullable
            public Bundle extras;

            @Nullable
            public Uri mediaUri;

            @Nullable
            public String searchQuery;

            public /* synthetic */ Builder(RequestMetadata requestMetadata, C27401 c27401) {
                this(requestMetadata);
            }

            public Builder() {
            }

            public Builder(RequestMetadata requestMetadata) {
                this.mediaUri = requestMetadata.mediaUri;
                this.searchQuery = requestMetadata.searchQuery;
                this.extras = requestMetadata.extras;
            }

            @CanIgnoreReturnValue
            public Builder setMediaUri(@Nullable Uri uri) {
                this.mediaUri = uri;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSearchQuery(@Nullable String str) {
                this.searchQuery = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setExtras(@Nullable Bundle bundle) {
                this.extras = bundle;
                return this;
            }

            public RequestMetadata build() {
                return new RequestMetadata(this);
            }
        }

        public RequestMetadata(Builder builder) {
            this.mediaUri = builder.mediaUri;
            this.searchQuery = builder.searchQuery;
            this.extras = builder.extras;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestMetadata)) {
                return false;
            }
            RequestMetadata requestMetadata = (RequestMetadata) obj;
            if (Util.areEqual(this.mediaUri, requestMetadata.mediaUri) && Util.areEqual(this.searchQuery, requestMetadata.searchQuery)) {
                if ((this.extras == null) == (requestMetadata.extras == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.mediaUri;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.searchQuery;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.extras != null ? 1 : 0);
        }

        @Override // androidx.media3.common.Bundleable
        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            Uri uri = this.mediaUri;
            if (uri != null) {
                bundle.putParcelable(FIELD_MEDIA_URI, uri);
            }
            String str = this.searchQuery;
            if (str != null) {
                bundle.putString(FIELD_SEARCH_QUERY, str);
            }
            Bundle bundle2 = this.extras;
            if (bundle2 != null) {
                bundle.putBundle(FIELD_EXTRAS, bundle2);
            }
            return bundle;
        }

        @UnstableApi
        public static RequestMetadata fromBundle(Bundle bundle) {
            return new Builder().setMediaUri((Uri) bundle.getParcelable(FIELD_MEDIA_URI)).setSearchQuery(bundle.getString(FIELD_SEARCH_QUERY)).setExtras(bundle.getBundle(FIELD_EXTRAS)).build();
        }
    }

    public MediaItem(String str, ClippingProperties clippingProperties, @Nullable LocalConfiguration localConfiguration, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata, RequestMetadata requestMetadata) {
        this.mediaId = str;
        this.localConfiguration = localConfiguration;
        this.playbackProperties = localConfiguration;
        this.liveConfiguration = liveConfiguration;
        this.mediaMetadata = mediaMetadata;
        this.clippingConfiguration = clippingProperties;
        this.clippingProperties = clippingProperties;
        this.requestMetadata = requestMetadata;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        return Util.areEqual(this.mediaId, mediaItem.mediaId) && this.clippingConfiguration.equals(mediaItem.clippingConfiguration) && Util.areEqual(this.localConfiguration, mediaItem.localConfiguration) && Util.areEqual(this.liveConfiguration, mediaItem.liveConfiguration) && Util.areEqual(this.mediaMetadata, mediaItem.mediaMetadata) && Util.areEqual(this.requestMetadata, mediaItem.requestMetadata);
    }

    public int hashCode() {
        int iHashCode = this.mediaId.hashCode() * 31;
        LocalConfiguration localConfiguration = this.localConfiguration;
        return ((((((((iHashCode + (localConfiguration != null ? localConfiguration.hashCode() : 0)) * 31) + this.liveConfiguration.hashCode()) * 31) + this.clippingConfiguration.hashCode()) * 31) + this.mediaMetadata.hashCode()) * 31) + this.requestMetadata.hashCode();
    }

    @UnstableApi
    private Bundle toBundle(boolean z) {
        LocalConfiguration localConfiguration;
        Bundle bundle = new Bundle();
        if (!this.mediaId.equals("")) {
            bundle.putString(FIELD_MEDIA_ID, this.mediaId);
        }
        if (!this.liveConfiguration.equals(LiveConfiguration.UNSET)) {
            bundle.putBundle(FIELD_LIVE_CONFIGURATION, this.liveConfiguration.toBundle());
        }
        if (!this.mediaMetadata.equals(MediaMetadata.EMPTY)) {
            bundle.putBundle(FIELD_MEDIA_METADATA, this.mediaMetadata.toBundle());
        }
        if (!this.clippingConfiguration.equals(ClippingConfiguration.UNSET)) {
            bundle.putBundle(FIELD_CLIPPING_PROPERTIES, this.clippingConfiguration.toBundle());
        }
        if (!this.requestMetadata.equals(RequestMetadata.EMPTY)) {
            bundle.putBundle(FIELD_REQUEST_METADATA, this.requestMetadata.toBundle());
        }
        if (z && (localConfiguration = this.localConfiguration) != null) {
            bundle.putBundle(FIELD_LOCAL_CONFIGURATION, localConfiguration.toBundle());
        }
        return bundle;
    }

    @Override // androidx.media3.common.Bundleable
    @UnstableApi
    public Bundle toBundle() {
        return toBundle(false);
    }

    @UnstableApi
    public Bundle toBundleIncludeLocalConfiguration() {
        return toBundle(true);
    }

    @UnstableApi
    public static MediaItem fromBundle(Bundle bundle) {
        LiveConfiguration liveConfigurationFromBundle;
        MediaMetadata mediaMetadataFromBundle;
        ClippingProperties clippingPropertiesFromBundle;
        RequestMetadata requestMetadataFromBundle;
        String str = (String) Assertions.checkNotNull(bundle.getString(FIELD_MEDIA_ID, ""));
        Bundle bundle2 = bundle.getBundle(FIELD_LIVE_CONFIGURATION);
        if (bundle2 == null) {
            liveConfigurationFromBundle = LiveConfiguration.UNSET;
        } else {
            liveConfigurationFromBundle = LiveConfiguration.fromBundle(bundle2);
        }
        LiveConfiguration liveConfiguration = liveConfigurationFromBundle;
        Bundle bundle3 = bundle.getBundle(FIELD_MEDIA_METADATA);
        if (bundle3 == null) {
            mediaMetadataFromBundle = MediaMetadata.EMPTY;
        } else {
            mediaMetadataFromBundle = MediaMetadata.fromBundle(bundle3);
        }
        MediaMetadata mediaMetadata = mediaMetadataFromBundle;
        Bundle bundle4 = bundle.getBundle(FIELD_CLIPPING_PROPERTIES);
        if (bundle4 == null) {
            clippingPropertiesFromBundle = ClippingProperties.UNSET;
        } else {
            clippingPropertiesFromBundle = ClippingConfiguration.fromBundle(bundle4);
        }
        ClippingProperties clippingProperties = clippingPropertiesFromBundle;
        Bundle bundle5 = bundle.getBundle(FIELD_REQUEST_METADATA);
        if (bundle5 == null) {
            requestMetadataFromBundle = RequestMetadata.EMPTY;
        } else {
            requestMetadataFromBundle = RequestMetadata.fromBundle(bundle5);
        }
        RequestMetadata requestMetadata = requestMetadataFromBundle;
        Bundle bundle6 = bundle.getBundle(FIELD_LOCAL_CONFIGURATION);
        return new MediaItem(str, clippingProperties, bundle6 == null ? null : LocalConfiguration.fromBundle(bundle6), liveConfiguration, mediaMetadata, requestMetadata);
    }
}
