package androidx.media3.extractor.text;

import androidx.media3.common.C2732C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.List;

@UnstableApi
/* loaded from: classes.dex */
public class LegacySubtitleUtil {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void toCuesWithTiming(Subtitle subtitle, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        boolean z;
        int startIndex = getStartIndex(subtitle, outputOptions);
        long j = outputOptions.startTimeUs;
        if (j != C2732C.TIME_UNSET) {
            List<Cue> cues = subtitle.getCues(j);
            long eventTime = subtitle.getEventTime(startIndex);
            if (cues.isEmpty() || startIndex >= subtitle.getEventTimeCount()) {
                z = false;
            } else {
                long j2 = outputOptions.startTimeUs;
                if (j2 < eventTime) {
                    consumer.accept(new CuesWithTiming(cues, j2, eventTime - j2));
                    z = true;
                }
            }
        }
        for (int i = startIndex; i < subtitle.getEventTimeCount(); i++) {
            outputSubtitleEvent(subtitle, i, consumer);
        }
        if (outputOptions.outputAllCues) {
            if (z) {
                startIndex--;
            }
            for (int i2 = 0; i2 < startIndex; i2++) {
                outputSubtitleEvent(subtitle, i2, consumer);
            }
            if (z) {
                consumer.accept(new CuesWithTiming(subtitle.getCues(outputOptions.startTimeUs), subtitle.getEventTime(startIndex), outputOptions.startTimeUs - subtitle.getEventTime(startIndex)));
            }
        }
    }

    public static int getStartIndex(Subtitle subtitle, SubtitleParser.OutputOptions outputOptions) {
        long j = outputOptions.startTimeUs;
        if (j == C2732C.TIME_UNSET) {
            return 0;
        }
        int nextEventTimeIndex = subtitle.getNextEventTimeIndex(j);
        if (nextEventTimeIndex == -1) {
            return subtitle.getEventTimeCount();
        }
        return (nextEventTimeIndex <= 0 || subtitle.getEventTime(nextEventTimeIndex + (-1)) != outputOptions.startTimeUs) ? nextEventTimeIndex : nextEventTimeIndex - 1;
    }

    public static void outputSubtitleEvent(Subtitle subtitle, int i, Consumer<CuesWithTiming> consumer) {
        long eventTime = subtitle.getEventTime(i);
        List<Cue> cues = subtitle.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i == subtitle.getEventTimeCount() - 1) {
            throw new IllegalStateException();
        }
        long eventTime2 = subtitle.getEventTime(i + 1) - subtitle.getEventTime(i);
        if (eventTime2 > 0) {
            consumer.accept(new CuesWithTiming(cues, eventTime, eventTime2));
        }
    }
}
