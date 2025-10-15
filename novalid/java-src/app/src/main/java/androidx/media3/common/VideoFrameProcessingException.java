package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class VideoFrameProcessingException extends Exception {
    public final long presentationTimeUs;

    public static VideoFrameProcessingException from(Exception exc) {
        return from(exc, C2732C.TIME_UNSET);
    }

    public static VideoFrameProcessingException from(Exception exc, long j) {
        if (exc instanceof VideoFrameProcessingException) {
            return (VideoFrameProcessingException) exc;
        }
        return new VideoFrameProcessingException(exc, j);
    }

    public VideoFrameProcessingException(String str) {
        this(str, C2732C.TIME_UNSET);
    }

    public VideoFrameProcessingException(String str, long j) {
        super(str);
        this.presentationTimeUs = j;
    }

    public VideoFrameProcessingException(String str, Throwable th) {
        this(str, th, C2732C.TIME_UNSET);
    }

    public VideoFrameProcessingException(String str, Throwable th, long j) {
        super(str, th);
        this.presentationTimeUs = j;
    }

    public VideoFrameProcessingException(Throwable th) {
        this(th, C2732C.TIME_UNSET);
    }

    public VideoFrameProcessingException(Throwable th, long j) {
        super(th);
        this.presentationTimeUs = j;
    }
}
