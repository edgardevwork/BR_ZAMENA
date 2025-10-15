package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import androidx.media3.exoplayer.image.ImageDecoder;
import androidx.media3.exoplayer.image.ImageRenderer;
import androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionRenderer;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public class DefaultRenderersFactory implements RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    public static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    public static final String TAG = "DefaultRenderersFactory";
    public final DefaultMediaCodecAdapterFactory codecAdapterFactory;
    public final Context context;
    public boolean enableAudioTrackPlaybackParams;
    public boolean enableDecoderFallback;
    public boolean enableFloatOutput;
    public int extensionRendererMode = 0;
    public long allowedVideoJoiningTimeMs = 5000;
    public MediaCodecSelector mediaCodecSelector = MediaCodecSelector.DEFAULT;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface ExtensionRendererMode {
    }

    public void buildMiscellaneousRenderers(Context context, Handler handler, int i, ArrayList<Renderer> arrayList) {
    }

    public DefaultRenderersFactory(Context context) {
        this.context = context;
        this.codecAdapterFactory = new DefaultMediaCodecAdapterFactory(context);
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory setExtensionRendererMode(int i) {
        this.extensionRendererMode = i;
        return this;
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory forceEnableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceEnableAsynchronous();
        return this;
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory forceDisableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceDisableAsynchronous();
        return this;
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory experimentalSetMediaCodecAsyncCryptoFlagEnabled(boolean z) {
        this.codecAdapterFactory.experimentalSetAsyncCryptoFlagEnabled(z);
        return this;
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory setEnableDecoderFallback(boolean z) {
        this.enableDecoderFallback = z;
        return this;
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory setMediaCodecSelector(MediaCodecSelector mediaCodecSelector) {
        this.mediaCodecSelector = mediaCodecSelector;
        return this;
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory setEnableAudioFloatOutput(boolean z) {
        this.enableFloatOutput = z;
        return this;
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory setEnableAudioTrackPlaybackParams(boolean z) {
        this.enableAudioTrackPlaybackParams = z;
        return this;
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory setAllowedVideoJoiningTimeMs(long j) {
        this.allowedVideoJoiningTimeMs = j;
        return this;
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) throws NoSuchMethodException, SecurityException {
        ArrayList<Renderer> arrayList = new ArrayList<>();
        buildVideoRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, videoRendererEventListener, this.allowedVideoJoiningTimeMs, arrayList);
        AudioSink audioSinkBuildAudioSink = buildAudioSink(this.context, this.enableFloatOutput, this.enableAudioTrackPlaybackParams);
        if (audioSinkBuildAudioSink != null) {
            buildAudioRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, audioSinkBuildAudioSink, handler, audioRendererEventListener, arrayList);
        }
        buildTextRenderers(this.context, textOutput, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildMetadataRenderers(this.context, metadataOutput, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildCameraMotionRenderers(this.context, this.extensionRendererMode, arrayList);
        buildImageRenderers(arrayList);
        buildMiscellaneousRenderers(this.context, handler, this.extensionRendererMode, arrayList);
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:5|(1:7)|8|56|9|10|(8:46|11|12|54|13|14|52|15)|50|26|27|48|28|58|36|41) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        r4 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void buildVideoRenderers(Context context, int i, MediaCodecSelector mediaCodecSelector, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, long j, ArrayList<Renderer> arrayList) throws NoSuchMethodException, SecurityException {
        Handler handler2;
        Class cls;
        String str;
        int i2;
        arrayList.add(new MediaCodecVideoRenderer(context, getCodecAdapterFactory(), mediaCodecSelector, j, z, handler, videoRendererEventListener, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                handler2 = handler;
                cls = Handler.class;
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating VP9 extension", e);
            }
        } catch (ClassNotFoundException unused) {
            handler2 = handler;
            cls = Handler.class;
        }
        try {
            try {
                try {
                    i2 = size + 1;
                    try {
                        arrayList.add(size, (Renderer) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, videoRendererEventListener, 50));
                        str = TAG;
                    } catch (ClassNotFoundException unused2) {
                        str = TAG;
                    }
                    try {
                        Log.m633i(str, "Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        size = i2;
                        i2 = size;
                        int i3 = i2 + 1;
                        arrayList.add(i2, (Renderer) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, cls, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, videoRendererEventListener, 50));
                        Log.m633i(str, "Loaded Libgav1VideoRenderer.");
                        arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, cls, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, videoRendererEventListener, 50));
                        Log.m633i(str, "Loaded FfmpegVideoRenderer.");
                        return;
                    }
                } catch (ClassNotFoundException unused4) {
                    str = TAG;
                    i2 = size;
                    int i32 = i2 + 1;
                    arrayList.add(i2, (Renderer) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, cls, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, videoRendererEventListener, 50));
                    Log.m633i(str, "Loaded Libgav1VideoRenderer.");
                    arrayList.add(i32, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, cls, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, videoRendererEventListener, 50));
                    Log.m633i(str, "Loaded FfmpegVideoRenderer.");
                    return;
                }
                arrayList.add(i32, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, cls, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, videoRendererEventListener, 50));
                Log.m633i(str, "Loaded FfmpegVideoRenderer.");
                return;
            } catch (ClassNotFoundException unused5) {
                return;
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e2);
            }
            int i322 = i2 + 1;
            arrayList.add(i2, (Renderer) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, cls, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, videoRendererEventListener, 50));
            Log.m633i(str, "Loaded Libgav1VideoRenderer.");
        } catch (Exception e3) {
            throw new RuntimeException("Error instantiating AV1 extension", e3);
        }
    }

    public void buildAudioRenderers(Context context, int i, MediaCodecSelector mediaCodecSelector, boolean z, AudioSink audioSink, Handler handler, AudioRendererEventListener audioRendererEventListener, ArrayList<Renderer> arrayList) throws NoSuchMethodException, SecurityException {
        int i2;
        AudioSink audioSink2;
        Handler handler2;
        String str;
        int i3;
        arrayList.add(new MediaCodecAudioRenderer(context, getCodecAdapterFactory(), mediaCodecSelector, z, handler, audioRendererEventListener, audioSink));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
            } catch (ClassNotFoundException unused) {
            }
            try {
                try {
                    arrayList.add(size, (Renderer) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class).newInstance(context));
                    Log.m633i(TAG, "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused2) {
                    size = i2;
                    i2 = size;
                    try {
                        Constructor<?> constructor = Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class);
                        audioSink2 = audioSink;
                        handler2 = handler;
                        str = TAG;
                        try {
                            i3 = i2 + 1;
                        } catch (ClassNotFoundException unused3) {
                        }
                        try {
                            arrayList.add(i2, (Renderer) constructor.newInstance(handler2, audioRendererEventListener, audioSink2));
                            Log.m633i(str, "Loaded LibopusAudioRenderer.");
                        } catch (ClassNotFoundException unused4) {
                            i2 = i3;
                            i3 = i2;
                            int i4 = i3 + 1;
                            try {
                                arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler2, audioRendererEventListener, audioSink2));
                                Log.m633i(str, "Loaded LibflacAudioRenderer.");
                            } catch (ClassNotFoundException unused5) {
                                i3 = i4;
                                i4 = i3;
                                arrayList.add(i4, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler2, audioRendererEventListener, audioSink2));
                                Log.m633i(str, "Loaded FfmpegAudioRenderer.");
                                return;
                            }
                            arrayList.add(i4, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler2, audioRendererEventListener, audioSink2));
                            Log.m633i(str, "Loaded FfmpegAudioRenderer.");
                            return;
                        }
                        try {
                            int i42 = i3 + 1;
                            arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler2, audioRendererEventListener, audioSink2));
                            Log.m633i(str, "Loaded LibflacAudioRenderer.");
                            arrayList.add(i42, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler2, audioRendererEventListener, audioSink2));
                            Log.m633i(str, "Loaded FfmpegAudioRenderer.");
                            return;
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating FLAC extension", e);
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException("Error instantiating Opus extension", e2);
                    }
                }
                arrayList.add(i42, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler2, audioRendererEventListener, audioSink2));
                Log.m633i(str, "Loaded FfmpegAudioRenderer.");
                return;
            } catch (ClassNotFoundException unused6) {
                return;
            } catch (Exception e3) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e3);
            }
            try {
                Constructor<?> constructor2 = Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class);
                audioSink2 = audioSink;
                handler2 = handler;
                str = TAG;
                i3 = i2 + 1;
                arrayList.add(i2, (Renderer) constructor2.newInstance(handler2, audioRendererEventListener, audioSink2));
                Log.m633i(str, "Loaded LibopusAudioRenderer.");
            } catch (ClassNotFoundException unused7) {
                audioSink2 = audioSink;
                handler2 = handler;
                str = TAG;
            }
            try {
                int i422 = i3 + 1;
                arrayList.add(i3, (Renderer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler2, audioRendererEventListener, audioSink2));
                Log.m633i(str, "Loaded LibflacAudioRenderer.");
            } catch (ClassNotFoundException unused8) {
            }
        } catch (Exception e4) {
            throw new RuntimeException("Error instantiating MIDI extension", e4);
        }
    }

    public void buildTextRenderers(Context context, TextOutput textOutput, Looper looper, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new TextRenderer(textOutput, looper));
    }

    public void buildMetadataRenderers(Context context, MetadataOutput metadataOutput, Looper looper, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new MetadataRenderer(metadataOutput, looper));
    }

    public void buildCameraMotionRenderers(Context context, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new CameraMotionRenderer());
    }

    public void buildImageRenderers(ArrayList<Renderer> arrayList) {
        arrayList.add(new ImageRenderer(ImageDecoder.Factory.DEFAULT, null));
    }

    @Nullable
    public AudioSink buildAudioSink(Context context, boolean z, boolean z2) {
        return new DefaultAudioSink.Builder(context).setEnableFloatOutput(z).setEnableAudioTrackPlaybackParams(z2).build();
    }

    public MediaCodecAdapter.Factory getCodecAdapterFactory() {
        return this.codecAdapterFactory;
    }
}
