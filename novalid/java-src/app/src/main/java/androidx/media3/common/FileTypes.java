package androidx.media3.common;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

@UnstableApi
/* loaded from: classes4.dex */
public final class FileTypes {
    public static final int AC3 = 0;
    public static final int AC4 = 1;
    public static final int ADTS = 2;
    public static final int AMR = 3;
    public static final int AVI = 16;
    public static final int BMP = 19;
    public static final String EXTENSION_AAC = ".aac";
    public static final String EXTENSION_AC3 = ".ac3";
    public static final String EXTENSION_AC4 = ".ac4";
    public static final String EXTENSION_ADTS = ".adts";
    public static final String EXTENSION_AMR = ".amr";
    public static final String EXTENSION_AVI = ".avi";
    public static final String EXTENSION_BMP = ".bmp";
    public static final String EXTENSION_DIB = ".dib";
    public static final String EXTENSION_EC3 = ".ec3";
    public static final String EXTENSION_FLAC = ".flac";
    public static final String EXTENSION_FLV = ".flv";
    public static final String EXTENSION_HEIC = ".heic";
    public static final String EXTENSION_JPEG = ".jpeg";
    public static final String EXTENSION_JPG = ".jpg";
    public static final String EXTENSION_M2P = ".m2p";
    public static final String EXTENSION_MID = ".mid";
    public static final String EXTENSION_MIDI = ".midi";
    public static final String EXTENSION_MP3 = ".mp3";
    public static final String EXTENSION_MP4 = ".mp4";
    public static final String EXTENSION_MPEG = ".mpeg";
    public static final String EXTENSION_MPG = ".mpg";
    public static final String EXTENSION_OPUS = ".opus";
    public static final String EXTENSION_PNG = ".png";
    public static final String EXTENSION_PREFIX_CMF = ".cmf";
    public static final String EXTENSION_PREFIX_M4 = ".m4";
    public static final String EXTENSION_PREFIX_MK = ".mk";
    public static final String EXTENSION_PREFIX_MP4 = ".mp4";
    public static final String EXTENSION_PREFIX_OG = ".og";
    public static final String EXTENSION_PREFIX_TS = ".ts";
    public static final String EXTENSION_PS = ".ps";
    public static final String EXTENSION_SMF = ".smf";
    public static final String EXTENSION_TS = ".ts";
    public static final String EXTENSION_VTT = ".vtt";
    public static final String EXTENSION_WAV = ".wav";
    public static final String EXTENSION_WAVE = ".wave";
    public static final String EXTENSION_WEBM = ".webm";
    public static final String EXTENSION_WEBP = ".webp";
    public static final String EXTENSION_WEBVTT = ".webvtt";
    public static final int FLAC = 4;
    public static final int FLV = 5;

    @VisibleForTesting
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final int HEIF = 20;
    public static final int JPEG = 14;
    public static final int MATROSKA = 6;
    public static final int MIDI = 15;
    public static final int MP3 = 7;
    public static final int MP4 = 8;
    public static final int OGG = 9;
    public static final int PNG = 17;

    /* renamed from: PS */
    public static final int f300PS = 10;

    /* renamed from: TS */
    public static final int f301TS = 11;
    public static final int UNKNOWN = -1;
    public static final int WAV = 12;
    public static final int WEBP = 18;
    public static final int WEBVTT = 13;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public static int inferFileTypeFromResponseHeaders(Map<String, List<String>> map) {
        List<String> list = map.get("Content-Type");
        return inferFileTypeFromMimeType((list == null || list.isEmpty()) ? null : list.get(0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int inferFileTypeFromMimeType(@Nullable String str) {
        if (str == null) {
            return -1;
        }
        String strNormalizeMimeType = MimeTypes.normalizeMimeType(str);
        strNormalizeMimeType.hashCode();
        switch (strNormalizeMimeType) {
        }
        return -1;
    }

    public static int inferFileTypeFromUri(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(EXTENSION_AC3) || lastPathSegment.endsWith(EXTENSION_EC3)) {
            return 0;
        }
        if (lastPathSegment.endsWith(EXTENSION_AC4)) {
            return 1;
        }
        if (lastPathSegment.endsWith(EXTENSION_ADTS) || lastPathSegment.endsWith(EXTENSION_AAC)) {
            return 2;
        }
        if (lastPathSegment.endsWith(EXTENSION_AMR)) {
            return 3;
        }
        if (lastPathSegment.endsWith(EXTENSION_FLAC)) {
            return 4;
        }
        if (lastPathSegment.endsWith(EXTENSION_FLV)) {
            return 5;
        }
        if (lastPathSegment.endsWith(EXTENSION_MID) || lastPathSegment.endsWith(EXTENSION_MIDI) || lastPathSegment.endsWith(EXTENSION_SMF)) {
            return 15;
        }
        if (lastPathSegment.startsWith(EXTENSION_PREFIX_MK, lastPathSegment.length() - 4) || lastPathSegment.endsWith(EXTENSION_WEBM)) {
            return 6;
        }
        if (lastPathSegment.endsWith(EXTENSION_MP3)) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(EXTENSION_PREFIX_M4, lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(EXTENSION_PREFIX_CMF, lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(EXTENSION_PREFIX_OG, lastPathSegment.length() - 4) || lastPathSegment.endsWith(EXTENSION_OPUS)) {
            return 9;
        }
        if (lastPathSegment.endsWith(EXTENSION_PS) || lastPathSegment.endsWith(EXTENSION_MPEG) || lastPathSegment.endsWith(EXTENSION_MPG) || lastPathSegment.endsWith(EXTENSION_M2P)) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(EXTENSION_WAV) || lastPathSegment.endsWith(EXTENSION_WAVE)) {
            return 12;
        }
        if (lastPathSegment.endsWith(EXTENSION_VTT) || lastPathSegment.endsWith(EXTENSION_WEBVTT)) {
            return 13;
        }
        if (lastPathSegment.endsWith(EXTENSION_JPG) || lastPathSegment.endsWith(EXTENSION_JPEG)) {
            return 14;
        }
        if (lastPathSegment.endsWith(EXTENSION_AVI)) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(EXTENSION_WEBP)) {
            return 18;
        }
        if (lastPathSegment.endsWith(EXTENSION_BMP) || lastPathSegment.endsWith(EXTENSION_DIB)) {
            return 19;
        }
        return lastPathSegment.endsWith(EXTENSION_HEIC) ? 20 : -1;
    }
}
