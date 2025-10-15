package coil.decode;

import coil.util.SvgUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* compiled from: DecodeUtils.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m7105d2 = {"LEFT_ANGLE_BRACKET", "Lokio/ByteString;", "SVG_TAG", "isSvg", "", "Lcoil/decode/DecodeUtils;", "source", "Lokio/BufferedSource;", "coil-svg_release"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@JvmName(name = "SvgDecodeUtils")
/* loaded from: classes2.dex */
public final class SvgDecodeUtils {

    @NotNull
    public static final ByteString LEFT_ANGLE_BRACKET;

    @NotNull
    public static final ByteString SVG_TAG;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        SVG_TAG = companion.encodeUtf8("<svg");
        LEFT_ANGLE_BRACKET = companion.encodeUtf8("<");
    }

    public static final boolean isSvg(@NotNull DecodeUtils decodeUtils, @NotNull BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(0L, LEFT_ANGLE_BRACKET) && SvgUtils.indexOf(bufferedSource, SVG_TAG, 0L, 1024L) != -1;
    }
}
