package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.media3.common.C2732C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.FrameInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PreviewingVideoGraph;
import androidx.media3.common.SurfaceInfo;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.CompositingVideoSinkProvider;
import androidx.media3.exoplayer.video.VideoFrameRenderControl;
import androidx.media3.exoplayer.video.VideoSink;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UnstableApi
/* loaded from: classes.dex */
public final class CompositingVideoSinkProvider implements VideoSinkProvider, VideoGraph.Listener, VideoFrameRenderControl.FrameRenderer {
    public static final Executor NO_OP_EXECUTOR = new Executor() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda5
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            CompositingVideoSinkProvider.lambda$static$0(runnable);
        }
    };
    public static final int STATE_CREATED = 0;
    public static final int STATE_INITIALIZED = 1;
    public static final int STATE_RELEASED = 2;
    public Clock clock;
    public final Context context;

    @Nullable
    public Pair<Surface, Size> currentSurfaceAndSize;
    public HandlerWrapper handler;
    public VideoSink.Listener listener;
    public Executor listenerExecutor;
    public Format outputFormat;
    public int pendingFlushCount;
    public final PreviewingVideoGraph.Factory previewingVideoGraphFactory;
    public int state;
    public List<Effect> videoEffects;
    public VideoFrameMetadataListener videoFrameMetadataListener;
    public VideoFrameReleaseControl videoFrameReleaseControl;
    public VideoFrameRenderControl videoFrameRenderControl;
    public PreviewingVideoGraph videoGraph;
    public VideoSinkImpl videoSinkImpl;

    public static /* synthetic */ void lambda$static$0(Runnable runnable) {
    }

    public static final class Builder {
        public boolean built;
        public final Context context;
        public PreviewingVideoGraph.Factory previewingVideoGraphFactory;
        public VideoFrameProcessor.Factory videoFrameProcessorFactory;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder setVideoFrameProcessorFactory(VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
            return this;
        }

        public Builder setPreviewingVideoGraphFactory(PreviewingVideoGraph.Factory factory) {
            this.previewingVideoGraphFactory = factory;
            return this;
        }

        public CompositingVideoSinkProvider build() {
            Assertions.checkState(!this.built);
            if (this.previewingVideoGraphFactory == null) {
                if (this.videoFrameProcessorFactory == null) {
                    this.videoFrameProcessorFactory = new ReflectiveDefaultVideoFrameProcessorFactory();
                }
                this.previewingVideoGraphFactory = new ReflectivePreviewingSingleInputVideoGraphFactory(this.videoFrameProcessorFactory);
            }
            CompositingVideoSinkProvider compositingVideoSinkProvider = new CompositingVideoSinkProvider(this);
            this.built = true;
            return compositingVideoSinkProvider;
        }
    }

    public CompositingVideoSinkProvider(Builder builder) {
        this.context = builder.context;
        this.previewingVideoGraphFactory = (PreviewingVideoGraph.Factory) Assertions.checkStateNotNull(builder.previewingVideoGraphFactory);
        this.clock = Clock.DEFAULT;
        this.listener = VideoSink.Listener.NO_OP;
        this.listenerExecutor = NO_OP_EXECUTOR;
        this.state = 0;
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void initialize(Format format) throws VideoSink.VideoSinkException {
        boolean z = false;
        Assertions.checkState(this.state == 0);
        Assertions.checkStateNotNull(this.videoEffects);
        if (this.videoFrameRenderControl != null && this.videoFrameReleaseControl != null) {
            z = true;
        }
        Assertions.checkState(z);
        this.handler = this.clock.createHandler((Looper) Assertions.checkStateNotNull(Looper.myLooper()), null);
        ColorInfo adjustedInputColorInfo = getAdjustedInputColorInfo(format.colorInfo);
        ColorInfo colorInfoBuild = adjustedInputColorInfo.colorTransfer == 7 ? adjustedInputColorInfo.buildUpon().setColorTransfer(6).build() : adjustedInputColorInfo;
        try {
            PreviewingVideoGraph.Factory factory = this.previewingVideoGraphFactory;
            Context context = this.context;
            DebugViewProvider debugViewProvider = DebugViewProvider.NONE;
            final HandlerWrapper handlerWrapper = this.handler;
            Objects.requireNonNull(handlerWrapper);
            this.videoGraph = factory.create(context, adjustedInputColorInfo, colorInfoBuild, debugViewProvider, this, new Executor() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda3
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handlerWrapper.post(runnable);
                }
            }, ImmutableList.m1171of(), 0L);
            Pair<Surface, Size> pair = this.currentSurfaceAndSize;
            if (pair != null) {
                Surface surface = (Surface) pair.first;
                Size size = (Size) pair.second;
                maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
            }
            VideoSinkImpl videoSinkImpl = new VideoSinkImpl(this.context, this, this.videoGraph);
            this.videoSinkImpl = videoSinkImpl;
            videoSinkImpl.setVideoEffects((List) Assertions.checkNotNull(this.videoEffects));
            this.state = 1;
        } catch (VideoFrameProcessingException e) {
            throw new VideoSink.VideoSinkException(e, format);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public boolean isInitialized() {
        return this.state == 1;
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void release() {
        if (this.state == 2) {
            return;
        }
        HandlerWrapper handlerWrapper = this.handler;
        if (handlerWrapper != null) {
            handlerWrapper.removeCallbacksAndMessages(null);
        }
        PreviewingVideoGraph previewingVideoGraph = this.videoGraph;
        if (previewingVideoGraph != null) {
            previewingVideoGraph.release();
        }
        this.currentSurfaceAndSize = null;
        this.state = 2;
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public VideoSink getSink() {
        return (VideoSink) Assertions.checkStateNotNull(this.videoSinkImpl);
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void setVideoEffects(List<Effect> list) {
        this.videoEffects = list;
        if (isInitialized()) {
            ((VideoSinkImpl) Assertions.checkStateNotNull(this.videoSinkImpl)).setVideoEffects(list);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void setPendingVideoEffects(List<Effect> list) {
        this.videoEffects = list;
        if (isInitialized()) {
            ((VideoSinkImpl) Assertions.checkStateNotNull(this.videoSinkImpl)).setPendingVideoEffects(list);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void setStreamOffsetUs(long j) {
        ((VideoSinkImpl) Assertions.checkStateNotNull(this.videoSinkImpl)).setStreamOffsetUs(j);
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void setOutputSurfaceInfo(Surface surface, Size size) {
        Pair<Surface, Size> pair = this.currentSurfaceAndSize;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((Size) this.currentSurfaceAndSize.second).equals(size)) {
            return;
        }
        this.currentSurfaceAndSize = Pair.create(surface, size);
        maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void setVideoFrameReleaseControl(VideoFrameReleaseControl videoFrameReleaseControl) {
        Assertions.checkState(!isInitialized());
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        this.videoFrameRenderControl = new VideoFrameRenderControl(this, videoFrameReleaseControl);
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void clearOutputSurfaceInfo() {
        Size size = Size.UNKNOWN;
        maybeSetOutputSurfaceInfo(null, size.getWidth(), size.getHeight());
        this.currentSurfaceAndSize = null;
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    @Nullable
    public VideoFrameReleaseControl getVideoFrameReleaseControl() {
        return this.videoFrameReleaseControl;
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void setClock(Clock clock) {
        Assertions.checkState(!isInitialized());
        this.clock = clock;
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputSizeChanged(int i, int i2) {
        ((VideoFrameRenderControl) Assertions.checkStateNotNull(this.videoFrameRenderControl)).onOutputSizeChanged(i, i2);
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputFrameAvailableForRendering(long j) {
        if (this.pendingFlushCount > 0) {
            return;
        }
        ((VideoFrameRenderControl) Assertions.checkStateNotNull(this.videoFrameRenderControl)).onOutputFrameAvailableForRendering(j);
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onEnded(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onError(final VideoFrameProcessingException videoFrameProcessingException) {
        final VideoSink.Listener listener = this.listener;
        this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onError$1(listener, videoFrameProcessingException);
            }
        });
    }

    public final /* synthetic */ void lambda$onError$1(VideoSink.Listener listener, VideoFrameProcessingException videoFrameProcessingException) {
        VideoSinkImpl videoSinkImpl = (VideoSinkImpl) Assertions.checkStateNotNull(this.videoSinkImpl);
        listener.onError(videoSinkImpl, new VideoSink.VideoSinkException(videoFrameProcessingException, (Format) Assertions.checkStateNotNull(videoSinkImpl.inputFormat)));
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
    public void onVideoSizeChanged(final VideoSize videoSize) {
        this.outputFormat = new Format.Builder().setWidth(videoSize.width).setHeight(videoSize.height).setSampleMimeType(MimeTypes.VIDEO_RAW).build();
        final VideoSinkImpl videoSinkImpl = (VideoSinkImpl) Assertions.checkStateNotNull(this.videoSinkImpl);
        final VideoSink.Listener listener = this.listener;
        this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                listener.onVideoSizeChanged(videoSinkImpl, videoSize);
            }
        });
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
    public void renderFrame(long j, long j2, long j3, boolean z) {
        if (z && this.listenerExecutor != NO_OP_EXECUTOR) {
            final VideoSinkImpl videoSinkImpl = (VideoSinkImpl) Assertions.checkStateNotNull(this.videoSinkImpl);
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    listener.onFirstFrameRendered(videoSinkImpl);
                }
            });
        }
        if (this.videoFrameMetadataListener != null) {
            Format formatBuild = this.outputFormat;
            if (formatBuild == null) {
                formatBuild = new Format.Builder().build();
            }
            this.videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j2 - j3, this.clock.nanoTime(), formatBuild, null);
        }
        ((PreviewingVideoGraph) Assertions.checkStateNotNull(this.videoGraph)).renderOutputFrame(j);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
    public void dropFrame() {
        final VideoSink.Listener listener = this.listener;
        this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$dropFrame$4(listener);
            }
        });
        ((PreviewingVideoGraph) Assertions.checkStateNotNull(this.videoGraph)).renderOutputFrame(-2L);
    }

    public final /* synthetic */ void lambda$dropFrame$4(VideoSink.Listener listener) {
        listener.onFrameDropped((VideoSink) Assertions.checkStateNotNull(this.videoSinkImpl));
    }

    public void render(long j, long j2) throws ExoPlaybackException {
        if (this.pendingFlushCount == 0) {
            ((VideoFrameRenderControl) Assertions.checkStateNotNull(this.videoFrameRenderControl)).render(j, j2);
        }
    }

    @Nullable
    public Surface getOutputSurface() {
        Pair<Surface, Size> pair = this.currentSurfaceAndSize;
        if (pair != null) {
            return (Surface) pair.first;
        }
        return null;
    }

    public final void setListener(VideoSink.Listener listener, Executor executor) {
        if (Objects.equals(listener, this.listener)) {
            Assertions.checkState(Objects.equals(executor, this.listenerExecutor));
        } else {
            this.listener = listener;
            this.listenerExecutor = executor;
        }
    }

    public final void maybeSetOutputSurfaceInfo(@Nullable Surface surface, int i, int i2) {
        if (this.videoGraph != null) {
            this.videoGraph.setOutputSurfaceInfo(surface != null ? new SurfaceInfo(surface, i, i2) : null);
            ((VideoFrameReleaseControl) Assertions.checkNotNull(this.videoFrameReleaseControl)).setOutputSurface(surface);
        }
    }

    public final boolean isReady() {
        return this.pendingFlushCount == 0 && ((VideoFrameRenderControl) Assertions.checkStateNotNull(this.videoFrameRenderControl)).isReady();
    }

    public final boolean hasReleasedFrame(long j) {
        return this.pendingFlushCount == 0 && ((VideoFrameRenderControl) Assertions.checkStateNotNull(this.videoFrameRenderControl)).hasReleasedFrame(j);
    }

    public final void flush() {
        this.pendingFlushCount++;
        ((VideoFrameRenderControl) Assertions.checkStateNotNull(this.videoFrameRenderControl)).flush();
        ((HandlerWrapper) Assertions.checkStateNotNull(this.handler)).post(new Runnable() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.flushInternal();
            }
        });
    }

    public final void flushInternal() {
        int i = this.pendingFlushCount - 1;
        this.pendingFlushCount = i;
        if (i > 0) {
            return;
        }
        if (i < 0) {
            throw new IllegalStateException(String.valueOf(this.pendingFlushCount));
        }
        ((VideoFrameRenderControl) Assertions.checkStateNotNull(this.videoFrameRenderControl)).flush();
    }

    public final void setPlaybackSpeed(float f) {
        ((VideoFrameRenderControl) Assertions.checkStateNotNull(this.videoFrameRenderControl)).setPlaybackSpeed(f);
    }

    public final void onStreamOffsetChange(long j, long j2) {
        ((VideoFrameRenderControl) Assertions.checkStateNotNull(this.videoFrameRenderControl)).onStreamOffsetChange(j, j2);
    }

    public static ColorInfo getAdjustedInputColorInfo(@Nullable ColorInfo colorInfo) {
        return (colorInfo == null || !ColorInfo.isTransferHdr(colorInfo)) ? ColorInfo.SDR_BT709_LIMITED : colorInfo;
    }

    public static final class VideoSinkImpl implements VideoSink {
        public final CompositingVideoSinkProvider compositingVideoSinkProvider;
        public final Context context;
        public boolean hasRegisteredFirstInputStream;

        @Nullable
        public Format inputFormat;
        public long inputStreamOffsetUs;
        public int inputType;
        public long pendingInputStreamBufferPresentationTimeUs;
        public boolean pendingInputStreamOffsetChange;

        @Nullable
        public Effect rotationEffect;
        public final VideoFrameProcessor videoFrameProcessor;
        public final int videoFrameProcessorMaxPendingFrameCount;
        public final ArrayList<Effect> videoEffects = new ArrayList<>();
        public long finalBufferPresentationTimeUs = C2732C.TIME_UNSET;
        public long lastBufferPresentationTimeUs = C2732C.TIME_UNSET;

        public VideoSinkImpl(Context context, CompositingVideoSinkProvider compositingVideoSinkProvider, PreviewingVideoGraph previewingVideoGraph) throws VideoFrameProcessingException {
            this.context = context;
            this.compositingVideoSinkProvider = compositingVideoSinkProvider;
            this.videoFrameProcessorMaxPendingFrameCount = Util.getMaxPendingFramesCountForMediaCodecDecoders(context);
            this.videoFrameProcessor = previewingVideoGraph.getProcessor(previewingVideoGraph.registerInput());
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void flush() {
            this.videoFrameProcessor.flush();
            this.hasRegisteredFirstInputStream = false;
            this.finalBufferPresentationTimeUs = C2732C.TIME_UNSET;
            this.lastBufferPresentationTimeUs = C2732C.TIME_UNSET;
            this.compositingVideoSinkProvider.flush();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isReady() {
            return this.compositingVideoSinkProvider.isReady();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isEnded() {
            long j = this.finalBufferPresentationTimeUs;
            return j != C2732C.TIME_UNSET && this.compositingVideoSinkProvider.hasReleasedFrame(j);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void registerInputStream(int i, Format format) {
            int i2;
            Format format2;
            if (i != 1 && i != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i);
            }
            if (i == 1 && Util.SDK_INT < 21 && (i2 = format.rotationDegrees) != -1 && i2 != 0) {
                if (this.rotationEffect == null || (format2 = this.inputFormat) == null || format2.rotationDegrees != i2) {
                    this.rotationEffect = ScaleAndRotateAccessor.createRotationEffect(i2);
                }
            } else {
                this.rotationEffect = null;
            }
            this.inputType = i;
            this.inputFormat = format;
            if (!this.hasRegisteredFirstInputStream) {
                maybeRegisterInputStream();
                this.hasRegisteredFirstInputStream = true;
                this.pendingInputStreamBufferPresentationTimeUs = C2732C.TIME_UNSET;
            } else {
                Assertions.checkState(this.lastBufferPresentationTimeUs != C2732C.TIME_UNSET);
                this.pendingInputStreamBufferPresentationTimeUs = this.lastBufferPresentationTimeUs;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setListener(VideoSink.Listener listener, Executor executor) {
            this.compositingVideoSinkProvider.setListener(listener, executor);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isFrameDropAllowedOnInput() {
            return Util.isFrameDropAllowedOnSurfaceInput(this.context);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public Surface getInputSurface() {
            return this.videoFrameProcessor.getInputSurface();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public long registerInputFrame(long j, boolean z) {
            Assertions.checkState(this.videoFrameProcessorMaxPendingFrameCount != -1);
            long j2 = this.pendingInputStreamBufferPresentationTimeUs;
            if (j2 != C2732C.TIME_UNSET) {
                if (!this.compositingVideoSinkProvider.hasReleasedFrame(j2)) {
                    return C2732C.TIME_UNSET;
                }
                maybeRegisterInputStream();
                this.pendingInputStreamBufferPresentationTimeUs = C2732C.TIME_UNSET;
            }
            if (this.videoFrameProcessor.getPendingInputFrameCount() >= this.videoFrameProcessorMaxPendingFrameCount || !this.videoFrameProcessor.registerInputFrame()) {
                return C2732C.TIME_UNSET;
            }
            long j3 = this.inputStreamOffsetUs;
            long j4 = j + j3;
            if (this.pendingInputStreamOffsetChange) {
                this.compositingVideoSinkProvider.onStreamOffsetChange(j4, j3);
                this.pendingInputStreamOffsetChange = false;
            }
            this.lastBufferPresentationTimeUs = j4;
            if (z) {
                this.finalBufferPresentationTimeUs = j4;
            }
            return j4 * 1000;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean queueBitmap(Bitmap bitmap, TimestampIterator timestampIterator) {
            return ((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).queueInputBitmap(bitmap, timestampIterator);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void render(long j, long j2) throws VideoSink.VideoSinkException {
            try {
                this.compositingVideoSinkProvider.render(j, j2);
            } catch (ExoPlaybackException e) {
                Format formatBuild = this.inputFormat;
                if (formatBuild == null) {
                    formatBuild = new Format.Builder().build();
                }
                throw new VideoSink.VideoSinkException(e, formatBuild);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setPlaybackSpeed(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
            this.compositingVideoSinkProvider.setPlaybackSpeed(f);
        }

        public void setVideoEffects(List<Effect> list) {
            setPendingVideoEffects(list);
            maybeRegisterInputStream();
        }

        public void setPendingVideoEffects(List<Effect> list) {
            this.videoEffects.clear();
            this.videoEffects.addAll(list);
        }

        public void setStreamOffsetUs(long j) {
            this.pendingInputStreamOffsetChange = this.inputStreamOffsetUs != j;
            this.inputStreamOffsetUs = j;
        }

        public final void maybeRegisterInputStream() {
            if (this.inputFormat == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Effect effect = this.rotationEffect;
            if (effect != null) {
                arrayList.add(effect);
            }
            arrayList.addAll(this.videoEffects);
            Format format = (Format) Assertions.checkNotNull(this.inputFormat);
            this.videoFrameProcessor.registerInputStream(this.inputType, arrayList, new FrameInfo.Builder(CompositingVideoSinkProvider.getAdjustedInputColorInfo(format.colorInfo), format.width, format.height).setPixelWidthHeightRatio(format.pixelWidthHeightRatio).build());
        }

        public static final class ScaleAndRotateAccessor {
            public static Method buildScaleAndRotateTransformationMethod;
            public static Constructor<?> scaleAndRotateTransformationBuilderConstructor;
            public static Method setRotationMethod;

            public static Effect createRotationEffect(float f) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                try {
                    prepare();
                    Object objNewInstance = scaleAndRotateTransformationBuilderConstructor.newInstance(null);
                    setRotationMethod.invoke(objNewInstance, Float.valueOf(f));
                    return (Effect) Assertions.checkNotNull(buildScaleAndRotateTransformationMethod.invoke(objNewInstance, null));
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }

            @EnsuresNonNull({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod"})
            public static void prepare() throws NoSuchMethodException, ClassNotFoundException {
                if (scaleAndRotateTransformationBuilderConstructor == null || setRotationMethod == null || buildScaleAndRotateTransformationMethod == null) {
                    Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                    scaleAndRotateTransformationBuilderConstructor = cls.getConstructor(null);
                    setRotationMethod = cls.getMethod("setRotationDegrees", Float.TYPE);
                    buildScaleAndRotateTransformationMethod = cls.getMethod("build", null);
                }
            }
        }
    }

    public static final class ReflectivePreviewingSingleInputVideoGraphFactory implements PreviewingVideoGraph.Factory {
        public final VideoFrameProcessor.Factory videoFrameProcessorFactory;

        public ReflectivePreviewingSingleInputVideoGraphFactory(VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
        }

        @Override // androidx.media3.common.PreviewingVideoGraph.Factory
        public PreviewingVideoGraph create(Context context, ColorInfo colorInfo, ColorInfo colorInfo2, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, List<Effect> list, long j) throws VideoFrameProcessingException, NoSuchMethodException, SecurityException {
            try {
            } catch (Exception e) {
                e = e;
            }
            try {
                return ((PreviewingVideoGraph.Factory) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(VideoFrameProcessor.Factory.class).newInstance(this.videoFrameProcessorFactory)).create(context, colorInfo, colorInfo2, debugViewProvider, listener, executor, list, j);
            } catch (Exception e2) {
                e = e2;
                throw VideoFrameProcessingException.from(e);
            }
        }
    }

    public static final class ReflectiveDefaultVideoFrameProcessorFactory implements VideoFrameProcessor.Factory {
        public static final Supplier<VideoFrameProcessor.Factory> VIDEO_FRAME_PROCESSOR_FACTORY_SUPPLIER = Suppliers.memoize(new Supplier() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$ReflectiveDefaultVideoFrameProcessorFactory$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return CompositingVideoSinkProvider.ReflectiveDefaultVideoFrameProcessorFactory.lambda$static$0();
            }
        });

        public ReflectiveDefaultVideoFrameProcessorFactory() {
        }

        public static /* synthetic */ VideoFrameProcessor.Factory lambda$static$0() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (VideoFrameProcessor.Factory) Assertions.checkNotNull(cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null));
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Factory
        public VideoFrameProcessor create(Context context, DebugViewProvider debugViewProvider, ColorInfo colorInfo, boolean z, Executor executor, VideoFrameProcessor.Listener listener) throws VideoFrameProcessingException {
            return VIDEO_FRAME_PROCESSOR_FACTORY_SUPPLIER.get().create(context, debugViewProvider, colorInfo, z, executor, listener);
        }
    }
}
