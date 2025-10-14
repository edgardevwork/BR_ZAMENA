package androidx.media3.extractor.text.webvtt;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
/* loaded from: classes2.dex */
public final class WebvttParserUtil {
    public static final Pattern COMMENT = Pattern.compile("^NOTE([ \t].*)?$");
    public static final String WEBVTT_HEADER = "WEBVTT";

    public static void validateWebvttHeaderLine(ParsableByteArray parsableByteArray) throws ParserException {
        int position = parsableByteArray.getPosition();
        if (isWebvttHeaderLine(parsableByteArray)) {
            return;
        }
        parsableByteArray.setPosition(position);
        throw ParserException.createForMalformedContainer("Expected WEBVTT. Got " + parsableByteArray.readLine(), null);
    }

    public static boolean isWebvttHeaderLine(ParsableByteArray parsableByteArray) {
        String line = parsableByteArray.readLine();
        return line != null && line.startsWith(WEBVTT_HEADER);
    }

    public static long parseTimestampUs(String str) throws NumberFormatException {
        String[] strArrSplitAtFirst = Util.splitAtFirst(str, "\\.");
        long j = 0;
        for (String str2 : Util.split(strArrSplitAtFirst[0], StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplitAtFirst.length == 2) {
            j2 += Long.parseLong(strArrSplitAtFirst[1]);
        }
        return j2 * 1000;
    }

    public static float parsePercentage(String str) throws NumberFormatException {
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }

    @Nullable
    public static Matcher findNextCueHeader(ParsableByteArray parsableByteArray) {
        String line;
        while (true) {
            String line2 = parsableByteArray.readLine();
            if (line2 == null) {
                return null;
            }
            if (COMMENT.matcher(line2).matches()) {
                do {
                    line = parsableByteArray.readLine();
                    if (line != null) {
                    }
                } while (!line.isEmpty());
            } else {
                Matcher matcher = WebvttCueParser.CUE_HEADER_PATTERN.matcher(line2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}
