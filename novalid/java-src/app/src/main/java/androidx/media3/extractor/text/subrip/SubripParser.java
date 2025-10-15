package androidx.media3.extractor.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C2732C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
/* loaded from: classes3.dex */
public final class SubripParser implements SubtitleParser {
    public static final String ALIGN_BOTTOM_LEFT = "{\\an1}";
    public static final String ALIGN_BOTTOM_MID = "{\\an2}";
    public static final String ALIGN_BOTTOM_RIGHT = "{\\an3}";
    public static final String ALIGN_MID_LEFT = "{\\an4}";
    public static final String ALIGN_MID_MID = "{\\an5}";
    public static final String ALIGN_MID_RIGHT = "{\\an6}";
    public static final String ALIGN_TOP_LEFT = "{\\an7}";
    public static final String ALIGN_TOP_MID = "{\\an8}";
    public static final String ALIGN_TOP_RIGHT = "{\\an9}";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    public static final float END_FRACTION = 0.92f;
    public static final float MID_FRACTION = 0.5f;
    public static final float START_FRACTION = 0.08f;
    public static final String SUBRIP_ALIGNMENT_TAG = "\\{\\\\an[1-9]\\}";
    public static final String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?";
    public static final String TAG = "SubripParser";
    public static final Pattern SUBRIP_TIMING_LINE = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern SUBRIP_TAG_PATTERN = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder textBuilder = new StringBuilder();
    public final ArrayList<String> tags = new ArrayList<>();
    public final ParsableByteArray parsableByteArray = new ParsableByteArray();

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) throws NumberFormatException {
        String str;
        Consumer<CuesWithTiming> consumer2;
        String line;
        String str2;
        String str3;
        Consumer<CuesWithTiming> consumer3;
        Consumer<CuesWithTiming> consumer4 = consumer;
        String str4 = TAG;
        this.parsableByteArray.reset(bArr, i + i2);
        this.parsableByteArray.setPosition(i);
        Charset charsetDetectUtfCharset = detectUtfCharset(this.parsableByteArray);
        ArrayList arrayList = (outputOptions.startTimeUs == C2732C.TIME_UNSET || !outputOptions.outputAllCues) ? null : new ArrayList();
        while (true) {
            String line2 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
            if (line2 == null) {
                break;
            }
            if (line2.length() != 0) {
                try {
                    Integer.parseInt(line2);
                    line = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                } catch (NumberFormatException unused) {
                    str = str4;
                    consumer2 = consumer4;
                    Log.m635w(str, "Skipping invalid index: " + line2);
                }
                if (line == null) {
                    Log.m635w(str4, "Unexpected end");
                    break;
                }
                Matcher matcher = SUBRIP_TIMING_LINE.matcher(line);
                if (matcher.matches()) {
                    long timecode = parseTimecode(matcher, 1);
                    long timecode2 = parseTimecode(matcher, 6);
                    int i3 = 0;
                    this.textBuilder.setLength(0);
                    this.tags.clear();
                    String line3 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                    while (!TextUtils.isEmpty(line3)) {
                        if (this.textBuilder.length() > 0) {
                            this.textBuilder.append("<br>");
                        }
                        this.textBuilder.append(processLine(line3, this.tags));
                        line3 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                    }
                    Spanned spannedFromHtml = Html.fromHtml(this.textBuilder.toString());
                    while (true) {
                        if (i3 >= this.tags.size()) {
                            str2 = str4;
                            str3 = null;
                            break;
                        } else {
                            str3 = this.tags.get(i3);
                            if (str3.matches(SUBRIP_ALIGNMENT_TAG)) {
                                str2 = str4;
                                break;
                            }
                            i3++;
                        }
                    }
                    long j = outputOptions.startTimeUs;
                    if (j == C2732C.TIME_UNSET || timecode >= j) {
                        consumer3 = consumer;
                        consumer3.accept(new CuesWithTiming(ImmutableList.m1172of(buildCue(spannedFromHtml, str3)), timecode, timecode2 - timecode));
                    } else {
                        if (arrayList != null) {
                            arrayList.add(new CuesWithTiming(ImmutableList.m1172of(buildCue(spannedFromHtml, str3)), timecode, timecode2 - timecode));
                        }
                        consumer3 = consumer;
                    }
                    consumer4 = consumer3;
                    str4 = str2;
                } else {
                    String str5 = str4;
                    consumer2 = consumer4;
                    str = str5;
                    Log.m635w(str, "Skipping invalid timing: " + line);
                    consumer4 = consumer2;
                    str4 = str;
                }
            }
        }
        Consumer<CuesWithTiming> consumer5 = consumer4;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                consumer5.accept((CuesWithTiming) it.next());
            }
        }
    }

    private Charset detectUtfCharset(ParsableByteArray parsableByteArray) {
        Charset utfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        return utfCharsetFromBom != null ? utfCharsetFromBom : Charsets.UTF_8;
    }

    public final String processLine(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = SUBRIP_TAG_PATTERN.matcher(strTrim);
        int i = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i += length;
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Cue buildCue(Spanned spanned, @Nullable String str) {
        char c;
        char c2;
        Cue.Builder text = new Cue.Builder().setText(spanned);
        if (str == null) {
            return text.build();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals(ALIGN_BOTTOM_LEFT)) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case -685620679:
                if (str.equals(ALIGN_BOTTOM_MID)) {
                    c = 6;
                    break;
                }
                break;
            case -685620648:
                if (str.equals(ALIGN_BOTTOM_RIGHT)) {
                    c = 3;
                    break;
                }
                break;
            case -685620617:
                if (str.equals(ALIGN_MID_LEFT)) {
                    c = 1;
                    break;
                }
                break;
            case -685620586:
                if (str.equals(ALIGN_MID_MID)) {
                    c = 7;
                    break;
                }
                break;
            case -685620555:
                if (str.equals(ALIGN_MID_RIGHT)) {
                    c = 4;
                    break;
                }
                break;
            case -685620524:
                if (str.equals(ALIGN_TOP_LEFT)) {
                    c = 2;
                    break;
                }
                break;
            case -685620493:
                if (str.equals(ALIGN_TOP_MID)) {
                    c = '\b';
                    break;
                }
                break;
            case -685620462:
                if (str.equals(ALIGN_TOP_RIGHT)) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1 || c == 2) {
            text.setPositionAnchor(0);
        } else if (c == 3 || c == 4 || c == 5) {
            text.setPositionAnchor(2);
        } else {
            text.setPositionAnchor(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals(ALIGN_BOTTOM_LEFT)) {
                    c2 = 65535;
                    break;
                } else {
                    c2 = 0;
                    break;
                }
            case -685620679:
                if (str.equals(ALIGN_BOTTOM_MID)) {
                    c2 = 1;
                    break;
                }
                break;
            case -685620648:
                if (str.equals(ALIGN_BOTTOM_RIGHT)) {
                    c2 = 2;
                    break;
                }
                break;
            case -685620617:
                if (str.equals(ALIGN_MID_LEFT)) {
                    c2 = 6;
                    break;
                }
                break;
            case -685620586:
                if (str.equals(ALIGN_MID_MID)) {
                    c2 = 7;
                    break;
                }
                break;
            case -685620555:
                if (str.equals(ALIGN_MID_RIGHT)) {
                    c2 = '\b';
                    break;
                }
                break;
            case -685620524:
                if (str.equals(ALIGN_TOP_LEFT)) {
                    c2 = 3;
                    break;
                }
                break;
            case -685620493:
                if (str.equals(ALIGN_TOP_MID)) {
                    c2 = 4;
                    break;
                }
                break;
            case -685620462:
                if (str.equals(ALIGN_TOP_RIGHT)) {
                    c2 = 5;
                    break;
                }
                break;
        }
        if (c2 == 0 || c2 == 1 || c2 == 2) {
            text.setLineAnchor(2);
        } else if (c2 == 3 || c2 == 4 || c2 == 5) {
            text.setLineAnchor(0);
        } else {
            text.setLineAnchor(1);
        }
        return text.setPosition(getFractionalPositionForAnchorType(text.getPositionAnchor())).setLine(getFractionalPositionForAnchorType(text.getLineAnchor()), 0).build();
    }

    public static long parseTimecode(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(i + 2))) * 60000) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(i + 3))) * 1000);
        String strGroup2 = matcher.group(i + 4);
        if (strGroup2 != null) {
            j += Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    @VisibleForTesting(otherwise = 2)
    public static float getFractionalPositionForAnchorType(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }
}
