package androidx.media3.exoplayer.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.trackselection.BaseTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.extractor.ExtractorsFactory;
import com.google.common.collect.UnmodifiableIterator;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@UnstableApi
/* loaded from: classes3.dex */
public final class DownloadHelper {
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT = DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT.buildUpon().setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build();
    public Callback callback;
    public final Handler callbackHandler;
    public List<ExoTrackSelection>[][] immutableTrackSelectionsByPeriodAndRenderer;
    public boolean isPreparedWithMedia;
    public final MediaItem.LocalConfiguration localConfiguration;
    public MappingTrackSelector.MappedTrackInfo[] mappedTrackInfos;
    public MediaPreparer mediaPreparer;

    @Nullable
    public final MediaSource mediaSource;
    public final RendererCapabilities[] rendererCapabilities;
    public final SparseIntArray scratchSet;
    public TrackGroupArray[] trackGroupArrays;
    public List<ExoTrackSelection>[][] trackSelectionsByPeriodAndRenderer;
    public final DefaultTrackSelector trackSelector;
    public final Timeline.Window window;

    public interface Callback {
        void onPrepareError(DownloadHelper downloadHelper, IOException iOException);

        void onPrepared(DownloadHelper downloadHelper);
    }

    public static class LiveContentUnsupportedException extends IOException {
    }

    public static /* synthetic */ DrmSessionManager lambda$createMediaSourceInternal$6(DrmSessionManager drmSessionManager, MediaItem mediaItem) {
        return drmSessionManager;
    }

    public static /* synthetic */ void lambda$getRendererCapabilities$0(CueGroup cueGroup) {
    }

    public static /* synthetic */ void lambda$getRendererCapabilities$1(Metadata metadata) {
    }

    public static /* synthetic */ void lambda$new$2() {
    }

    public static DefaultTrackSelector.Parameters getDefaultTrackSelectorParameters(Context context) {
        return DefaultTrackSelector.Parameters.getDefaults(context).buildUpon().setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build();
    }

    public static RendererCapabilities[] getRendererCapabilities(RenderersFactory renderersFactory) {
        Renderer[] rendererArrCreateRenderers = renderersFactory.createRenderers(Util.createHandlerForCurrentOrMainLooper(), new VideoRendererEventListener() { // from class: androidx.media3.exoplayer.offline.DownloadHelper.1
        }, new AudioRendererEventListener() { // from class: androidx.media3.exoplayer.offline.DownloadHelper.2
        }, new TextOutput() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda2
            @Override // androidx.media3.exoplayer.text.TextOutput
            public final void onCues(CueGroup cueGroup) {
                DownloadHelper.lambda$getRendererCapabilities$0(cueGroup);
            }
        }, new MetadataOutput() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda3
            @Override // androidx.media3.exoplayer.metadata.MetadataOutput
            public final void onMetadata(Metadata metadata) {
                DownloadHelper.lambda$getRendererCapabilities$1(metadata);
            }
        });
        RendererCapabilities[] rendererCapabilitiesArr = new RendererCapabilities[rendererArrCreateRenderers.length];
        for (int i = 0; i < rendererArrCreateRenderers.length; i++) {
            rendererCapabilitiesArr[i] = rendererArrCreateRenderers[i].getCapabilities();
        }
        return rendererCapabilitiesArr;
    }

    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem) {
        Assertions.checkArgument(isProgressive((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration)));
        return forMediaItem(mediaItem, getDefaultTrackSelectorParameters(context), null, null, null);
    }

    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory factory) {
        return forMediaItem(mediaItem, getDefaultTrackSelectorParameters(context), renderersFactory, factory, null);
    }

    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory factory) {
        return forMediaItem(mediaItem, trackSelectionParameters, renderersFactory, factory, null);
    }

    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory factory, @Nullable DrmSessionManager drmSessionManager) {
        RendererCapabilities[] rendererCapabilities;
        boolean zIsProgressive = isProgressive((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration));
        Assertions.checkArgument(zIsProgressive || factory != null);
        MediaSource mediaSourceCreateMediaSourceInternal = zIsProgressive ? null : createMediaSourceInternal(mediaItem, (DataSource.Factory) Util.castNonNull(factory), drmSessionManager);
        if (renderersFactory != null) {
            rendererCapabilities = getRendererCapabilities(renderersFactory);
        } else {
            rendererCapabilities = new RendererCapabilities[0];
        }
        return new DownloadHelper(mediaItem, mediaSourceCreateMediaSourceInternal, trackSelectionParameters, rendererCapabilities);
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory factory) {
        return createMediaSource(downloadRequest, factory, null);
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory factory, @Nullable DrmSessionManager drmSessionManager) {
        return createMediaSourceInternal(downloadRequest.toMediaItem(), factory, drmSessionManager);
    }

    public DownloadHelper(MediaItem mediaItem, @Nullable MediaSource mediaSource, TrackSelectionParameters trackSelectionParameters, RendererCapabilities[] rendererCapabilitiesArr) {
        this.localConfiguration = (MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration);
        this.mediaSource = mediaSource;
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(trackSelectionParameters, new DownloadTrackSelection.Factory());
        this.trackSelector = defaultTrackSelector;
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.scratchSet = new SparseIntArray();
        defaultTrackSelector.init(new TrackSelector.InvalidationListener() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda0
            @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
            public final void onTrackSelectionsInvalidated() {
                DownloadHelper.lambda$new$2();
            }
        }, new FakeBandwidthMeter());
        this.callbackHandler = Util.createHandlerForCurrentOrMainLooper();
        this.window = new Timeline.Window();
    }

    public void prepare(final Callback callback) {
        Assertions.checkState(this.callback == null);
        this.callback = callback;
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource != null) {
            this.mediaPreparer = new MediaPreparer(mediaSource, this);
        } else {
            this.callbackHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$prepare$3(callback);
                }
            });
        }
    }

    public final /* synthetic */ void lambda$prepare$3(Callback callback) {
        callback.onPrepared(this);
    }

    public void release() {
        MediaPreparer mediaPreparer = this.mediaPreparer;
        if (mediaPreparer != null) {
            mediaPreparer.release();
        }
        this.trackSelector.release();
    }

    @Nullable
    public Object getManifest() {
        if (this.mediaSource == null) {
            return null;
        }
        assertPreparedWithMedia();
        if (this.mediaPreparer.timeline.getWindowCount() > 0) {
            return this.mediaPreparer.timeline.getWindow(0, this.window).manifest;
        }
        return null;
    }

    public int getPeriodCount() {
        if (this.mediaSource == null) {
            return 0;
        }
        assertPreparedWithMedia();
        return this.trackGroupArrays.length;
    }

    public Tracks getTracks(int i) {
        assertPreparedWithMedia();
        return TrackSelectionUtil.buildTracks(this.mappedTrackInfos[i], this.immutableTrackSelectionsByPeriodAndRenderer[i]);
    }

    public TrackGroupArray getTrackGroups(int i) {
        assertPreparedWithMedia();
        return this.trackGroupArrays[i];
    }

    public MappingTrackSelector.MappedTrackInfo getMappedTrackInfo(int i) {
        assertPreparedWithMedia();
        return this.mappedTrackInfos[i];
    }

    public List<ExoTrackSelection> getTrackSelections(int i, int i2) {
        assertPreparedWithMedia();
        return this.immutableTrackSelectionsByPeriodAndRenderer[i][i2];
    }

    public void clearTrackSelections(int i) {
        assertPreparedWithMedia();
        for (int i2 = 0; i2 < this.rendererCapabilities.length; i2++) {
            this.trackSelectionsByPeriodAndRenderer[i][i2].clear();
        }
    }

    public void replaceTrackSelections(int i, TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithMedia();
            clearTrackSelections(i);
            addTrackSelectionInternal(i, trackSelectionParameters);
        } catch (ExoPlaybackException e) {
            throw new IllegalStateException(e);
        }
    }

    public void addTrackSelection(int i, TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithMedia();
            addTrackSelectionInternal(i, trackSelectionParameters);
        } catch (ExoPlaybackException e) {
            throw new IllegalStateException(e);
        }
    }

    public void addAudioLanguagesToSelection(String... strArr) {
        try {
            assertPreparedWithMedia();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT.buildUpon();
            builderBuildUpon.setForceHighestSupportedBitrate(true);
            for (RendererCapabilities rendererCapabilities : this.rendererCapabilities) {
                int trackType = rendererCapabilities.getTrackType();
                builderBuildUpon.setTrackTypeDisabled(trackType, trackType != 1);
            }
            int periodCount = getPeriodCount();
            for (String str : strArr) {
                TrackSelectionParameters trackSelectionParametersBuild = builderBuildUpon.setPreferredAudioLanguage(str).build();
                for (int i = 0; i < periodCount; i++) {
                    addTrackSelectionInternal(i, trackSelectionParametersBuild);
                }
            }
        } catch (ExoPlaybackException e) {
            throw new IllegalStateException(e);
        }
    }

    public void addTextLanguagesToSelection(boolean z, String... strArr) {
        try {
            assertPreparedWithMedia();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT.buildUpon();
            builderBuildUpon.setSelectUndeterminedTextLanguage(z);
            builderBuildUpon.setForceHighestSupportedBitrate(true);
            for (RendererCapabilities rendererCapabilities : this.rendererCapabilities) {
                int trackType = rendererCapabilities.getTrackType();
                builderBuildUpon.setTrackTypeDisabled(trackType, trackType != 3);
            }
            int periodCount = getPeriodCount();
            for (String str : strArr) {
                TrackSelectionParameters trackSelectionParametersBuild = builderBuildUpon.setPreferredTextLanguage(str).build();
                for (int i = 0; i < periodCount; i++) {
                    addTrackSelectionInternal(i, trackSelectionParametersBuild);
                }
            }
        } catch (ExoPlaybackException e) {
            throw new IllegalStateException(e);
        }
    }

    public void addTrackSelectionForSingleRenderer(int i, int i2, DefaultTrackSelector.Parameters parameters, List<DefaultTrackSelector.SelectionOverride> list) {
        try {
            assertPreparedWithMedia();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = parameters.buildUpon();
            int i3 = 0;
            while (i3 < this.mappedTrackInfos[i].getRendererCount()) {
                builderBuildUpon.setRendererDisabled(i3, i3 != i2);
                i3++;
            }
            if (list.isEmpty()) {
                addTrackSelectionInternal(i, builderBuildUpon.build());
                return;
            }
            TrackGroupArray trackGroups = this.mappedTrackInfos[i].getTrackGroups(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                builderBuildUpon.setSelectionOverride(i2, trackGroups, list.get(i4));
                addTrackSelectionInternal(i, builderBuildUpon.build());
            }
        } catch (ExoPlaybackException e) {
            throw new IllegalStateException(e);
        }
    }

    public DownloadRequest getDownloadRequest(@Nullable byte[] bArr) {
        return getDownloadRequest(this.localConfiguration.uri.toString(), bArr);
    }

    public DownloadRequest getDownloadRequest(String str, @Nullable byte[] bArr) {
        DownloadRequest.Builder mimeType = new DownloadRequest.Builder(str, this.localConfiguration.uri).setMimeType(this.localConfiguration.mimeType);
        MediaItem.DrmConfiguration drmConfiguration = this.localConfiguration.drmConfiguration;
        DownloadRequest.Builder data = mimeType.setKeySetId(drmConfiguration != null ? drmConfiguration.getKeySetId() : null).setCustomCacheKey(this.localConfiguration.customCacheKey).setData(bArr);
        if (this.mediaSource == null) {
            return data.build();
        }
        assertPreparedWithMedia();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = this.trackSelectionsByPeriodAndRenderer.length;
        for (int i = 0; i < length; i++) {
            arrayList2.clear();
            int length2 = this.trackSelectionsByPeriodAndRenderer[i].length;
            for (int i2 = 0; i2 < length2; i2++) {
                arrayList2.addAll(this.trackSelectionsByPeriodAndRenderer[i][i2]);
            }
            arrayList.addAll(this.mediaPreparer.mediaPeriods[i].getStreamKeys(arrayList2));
        }
        return data.setStreamKeys(arrayList).build();
    }

    @RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    public final void addTrackSelectionInternal(int i, TrackSelectionParameters trackSelectionParameters) throws ExoPlaybackException {
        this.trackSelector.setParameters(trackSelectionParameters);
        runTrackSelection(i);
        UnmodifiableIterator<TrackSelectionOverride> it = trackSelectionParameters.overrides.values().iterator();
        while (it.hasNext()) {
            this.trackSelector.setParameters(trackSelectionParameters.buildUpon().setOverrideForType(it.next()).build());
            runTrackSelection(i);
        }
    }

    public final void onMediaPrepared() throws ExoPlaybackException {
        Assertions.checkNotNull(this.mediaPreparer);
        Assertions.checkNotNull(this.mediaPreparer.mediaPeriods);
        Assertions.checkNotNull(this.mediaPreparer.timeline);
        int length = this.mediaPreparer.mediaPeriods.length;
        int length2 = this.rendererCapabilities.length;
        this.trackSelectionsByPeriodAndRenderer = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        this.immutableTrackSelectionsByPeriodAndRenderer = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length2; i2++) {
                this.trackSelectionsByPeriodAndRenderer[i][i2] = new ArrayList();
                this.immutableTrackSelectionsByPeriodAndRenderer[i][i2] = Collections.unmodifiableList(this.trackSelectionsByPeriodAndRenderer[i][i2]);
            }
        }
        this.trackGroupArrays = new TrackGroupArray[length];
        this.mappedTrackInfos = new MappingTrackSelector.MappedTrackInfo[length];
        for (int i3 = 0; i3 < length; i3++) {
            this.trackGroupArrays[i3] = this.mediaPreparer.mediaPeriods[i3].getTrackGroups();
            this.trackSelector.onSelectionActivated(runTrackSelection(i3).info);
            this.mappedTrackInfos[i3] = (MappingTrackSelector.MappedTrackInfo) Assertions.checkNotNull(this.trackSelector.getCurrentMappedTrackInfo());
        }
        setPreparedWithMedia();
        ((Handler) Assertions.checkNotNull(this.callbackHandler)).post(new Runnable() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onMediaPrepared$4();
            }
        });
    }

    public final /* synthetic */ void lambda$onMediaPrepared$4() {
        ((Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    public final /* synthetic */ void lambda$onMediaPreparationFailed$5(IOException iOException) {
        ((Callback) Assertions.checkNotNull(this.callback)).onPrepareError(this, iOException);
    }

    public final void onMediaPreparationFailed(final IOException iOException) {
        ((Handler) Assertions.checkNotNull(this.callbackHandler)).post(new Runnable() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onMediaPreparationFailed$5(iOException);
            }
        });
    }

    @RequiresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    public final void setPreparedWithMedia() {
        this.isPreparedWithMedia = true;
    }

    @EnsuresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    public final void assertPreparedWithMedia() {
        Assertions.checkState(this.isPreparedWithMedia);
    }

    @RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    public final TrackSelectorResult runTrackSelection(int i) throws ExoPlaybackException {
        TrackSelectorResult trackSelectorResultSelectTracks = this.trackSelector.selectTracks(this.rendererCapabilities, this.trackGroupArrays[i], new MediaSource.MediaPeriodId(this.mediaPreparer.timeline.getUidOfPeriod(i)), this.mediaPreparer.timeline);
        for (int i2 = 0; i2 < trackSelectorResultSelectTracks.length; i2++) {
            ExoTrackSelection exoTrackSelection = trackSelectorResultSelectTracks.selections[i2];
            if (exoTrackSelection != null) {
                List<ExoTrackSelection> list = this.trackSelectionsByPeriodAndRenderer[i][i2];
                int i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        ExoTrackSelection exoTrackSelection2 = list.get(i3);
                        if (exoTrackSelection2.getTrackGroup().equals(exoTrackSelection.getTrackGroup())) {
                            this.scratchSet.clear();
                            for (int i4 = 0; i4 < exoTrackSelection2.length(); i4++) {
                                this.scratchSet.put(exoTrackSelection2.getIndexInTrackGroup(i4), 0);
                            }
                            for (int i5 = 0; i5 < exoTrackSelection.length(); i5++) {
                                this.scratchSet.put(exoTrackSelection.getIndexInTrackGroup(i5), 0);
                            }
                            int[] iArr = new int[this.scratchSet.size()];
                            for (int i6 = 0; i6 < this.scratchSet.size(); i6++) {
                                iArr[i6] = this.scratchSet.keyAt(i6);
                            }
                            list.set(i3, new DownloadTrackSelection(exoTrackSelection2.getTrackGroup(), iArr));
                        } else {
                            i3++;
                        }
                    } else {
                        list.add(exoTrackSelection);
                        break;
                    }
                }
            }
        }
        return trackSelectorResultSelectTracks;
    }

    public static MediaSource createMediaSourceInternal(MediaItem mediaItem, DataSource.Factory factory, @Nullable final DrmSessionManager drmSessionManager) {
        DefaultMediaSourceFactory defaultMediaSourceFactory = new DefaultMediaSourceFactory(factory, ExtractorsFactory.EMPTY);
        if (drmSessionManager != null) {
            defaultMediaSourceFactory.setDrmSessionManagerProvider(new DrmSessionManagerProvider() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$$ExternalSyntheticLambda1
                @Override // androidx.media3.exoplayer.drm.DrmSessionManagerProvider
                public final DrmSessionManager get(MediaItem mediaItem2) {
                    return DownloadHelper.lambda$createMediaSourceInternal$6(drmSessionManager, mediaItem2);
                }
            });
        }
        return defaultMediaSourceFactory.createMediaSource(mediaItem);
    }

    public static boolean isProgressive(MediaItem.LocalConfiguration localConfiguration) {
        return Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType) == 4;
    }

    public static final class MediaPreparer implements MediaSource.MediaSourceCaller, MediaPeriod.Callback, Handler.Callback {
        public static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_FAILED = 1;
        public static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_PREPARED = 0;
        public static final int MESSAGE_CHECK_FOR_FAILURE = 1;
        public static final int MESSAGE_CONTINUE_LOADING = 2;
        public static final int MESSAGE_PREPARE_SOURCE = 0;
        public static final int MESSAGE_RELEASE = 3;
        public final DownloadHelper downloadHelper;
        public MediaPeriod[] mediaPeriods;
        public final MediaSource mediaSource;
        public final Handler mediaSourceHandler;
        public final HandlerThread mediaSourceThread;
        public boolean released;
        public Timeline timeline;
        public final Allocator allocator = new DefaultAllocator(true, 65536);
        public final ArrayList<MediaPeriod> pendingMediaPeriods = new ArrayList<>();
        public final Handler downloadHelperHandler = Util.createHandlerForCurrentOrMainLooper(new Handler.Callback() { // from class: androidx.media3.exoplayer.offline.DownloadHelper$MediaPreparer$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f$0.handleDownloadHelperCallbackMessage(message);
            }
        });

        public MediaPreparer(MediaSource mediaSource, DownloadHelper downloadHelper) {
            this.mediaSource = mediaSource;
            this.downloadHelper = downloadHelper;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.mediaSourceThread = handlerThread;
            handlerThread.start();
            Handler handlerCreateHandler = Util.createHandler(handlerThread.getLooper(), this);
            this.mediaSourceHandler = handlerCreateHandler;
            handlerCreateHandler.sendEmptyMessage(0);
        }

        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            this.mediaSourceHandler.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.mediaSource.prepareSource(this, null, PlayerId.UNSET);
                this.mediaSourceHandler.sendEmptyMessage(1);
                return true;
            }
            int i2 = 0;
            if (i == 1) {
                try {
                    if (this.mediaPeriods == null) {
                        this.mediaSource.maybeThrowSourceInfoRefreshError();
                    } else {
                        while (i2 < this.pendingMediaPeriods.size()) {
                            this.pendingMediaPeriods.get(i2).maybeThrowPrepareError();
                            i2++;
                        }
                    }
                    this.mediaSourceHandler.sendEmptyMessageDelayed(1, 100L);
                } catch (IOException e) {
                    this.downloadHelperHandler.obtainMessage(1, e).sendToTarget();
                }
                return true;
            }
            if (i == 2) {
                MediaPeriod mediaPeriod = (MediaPeriod) message.obj;
                if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                    mediaPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(0L).build());
                }
                return true;
            }
            if (i != 3) {
                return false;
            }
            MediaPeriod[] mediaPeriodArr = this.mediaPeriods;
            if (mediaPeriodArr != null) {
                int length = mediaPeriodArr.length;
                while (i2 < length) {
                    this.mediaSource.releasePeriod(mediaPeriodArr[i2]);
                    i2++;
                }
            }
            this.mediaSource.releaseSource(this);
            this.mediaSourceHandler.removeCallbacksAndMessages(null);
            this.mediaSourceThread.quit();
            return true;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
        public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
            MediaPeriod[] mediaPeriodArr;
            if (this.timeline != null) {
                return;
            }
            if (timeline.getWindow(0, new Timeline.Window()).isLive()) {
                this.downloadHelperHandler.obtainMessage(1, new LiveContentUnsupportedException()).sendToTarget();
                return;
            }
            this.timeline = timeline;
            this.mediaPeriods = new MediaPeriod[timeline.getPeriodCount()];
            int i = 0;
            while (true) {
                mediaPeriodArr = this.mediaPeriods;
                if (i >= mediaPeriodArr.length) {
                    break;
                }
                MediaPeriod mediaPeriodCreatePeriod = this.mediaSource.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(i)), this.allocator, 0L);
                this.mediaPeriods[i] = mediaPeriodCreatePeriod;
                this.pendingMediaPeriods.add(mediaPeriodCreatePeriod);
                i++;
            }
            for (MediaPeriod mediaPeriod : mediaPeriodArr) {
                mediaPeriod.prepare(this, 0L);
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            this.pendingMediaPeriods.remove(mediaPeriod);
            if (this.pendingMediaPeriods.isEmpty()) {
                this.mediaSourceHandler.removeMessages(1);
                this.downloadHelperHandler.sendEmptyMessage(0);
            }
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                this.mediaSourceHandler.obtainMessage(2, mediaPeriod).sendToTarget();
            }
        }

        public final boolean handleDownloadHelperCallbackMessage(Message message) {
            if (this.released) {
                return false;
            }
            int i = message.what;
            if (i == 0) {
                try {
                    this.downloadHelper.onMediaPrepared();
                } catch (ExoPlaybackException e) {
                    this.downloadHelperHandler.obtainMessage(1, new IOException(e)).sendToTarget();
                }
                return true;
            }
            if (i != 1) {
                return false;
            }
            release();
            this.downloadHelper.onMediaPreparationFailed((IOException) Util.castNonNull(message.obj));
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class DownloadTrackSelection extends BaseTrackSelection {
        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        @Nullable
        public Object getSelectionData() {
            return null;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j, long j2, long j3, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        }

        public static final class Factory implements ExoTrackSelection.Factory {
            public Factory() {
            }

            @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory
            public ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
                ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
                for (int i = 0; i < definitionArr.length; i++) {
                    ExoTrackSelection.Definition definition = definitionArr[i];
                    exoTrackSelectionArr[i] = definition == null ? null : new DownloadTrackSelection(definition.group, definition.tracks);
                }
                return exoTrackSelectionArr;
            }
        }

        public DownloadTrackSelection(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class FakeBandwidthMeter implements BandwidthMeter {
        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public long getBitrateEstimate() {
            return 0L;
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        @Nullable
        public TransferListener getTransferListener() {
            return null;
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        }

        public FakeBandwidthMeter() {
        }
    }
}
