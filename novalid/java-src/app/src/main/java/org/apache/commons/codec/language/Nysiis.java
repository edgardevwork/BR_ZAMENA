package org.apache.commons.codec.language;

import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import java.util.regex.Pattern;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* loaded from: classes8.dex */
public class Nysiis implements StringEncoder {
    public static final char SPACE = ' ';
    public static final int TRUE_LENGTH = 6;
    public final boolean strict;
    public static final char[] CHARS_A = {'A'};
    public static final char[] CHARS_AF = {'A', 'F'};
    public static final char[] CHARS_C = {'C'};
    public static final char[] CHARS_FF = {'F', 'F'};
    public static final char[] CHARS_G = {'G'};
    public static final char[] CHARS_N = {'N'};
    public static final char[] CHARS_NN = {'N', 'N'};
    public static final char[] CHARS_S = {'S'};
    public static final char[] CHARS_SSS = {'S', 'S', 'S'};
    public static final Pattern PAT_MAC = Pattern.compile("^MAC");
    public static final Pattern PAT_KN = Pattern.compile("^KN");
    public static final Pattern PAT_K = Pattern.compile("^K");
    public static final Pattern PAT_PH_PF = Pattern.compile("^(PH|PF)");
    public static final Pattern PAT_SCH = Pattern.compile("^SCH");
    public static final Pattern PAT_EE_IE = Pattern.compile("(EE|IE)$");
    public static final Pattern PAT_DT_ETC = Pattern.compile("(DT|RT|RD|NT|ND)$");

    private static boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static char[] transcodeRemaining(char c, char c2, char c3, char c4) {
        if (c2 == 'E' && c3 == 'V') {
            return CHARS_AF;
        }
        if (isVowel(c2)) {
            return CHARS_A;
        }
        if (c2 == 'Q') {
            return CHARS_G;
        }
        if (c2 == 'Z') {
            return CHARS_S;
        }
        if (c2 == 'M') {
            return CHARS_N;
        }
        if (c2 == 'K') {
            if (c3 == 'N') {
                return CHARS_NN;
            }
            return CHARS_C;
        }
        if (c2 == 'S' && c3 == 'C' && c4 == 'H') {
            return CHARS_SSS;
        }
        if (c2 == 'P' && c3 == 'H') {
            return CHARS_FF;
        }
        if (c2 == 'H' && (!isVowel(c) || !isVowel(c3))) {
            return new char[]{c};
        }
        if (c2 == 'W' && isVowel(c)) {
            return new char[]{c};
        }
        return new char[]{c2};
    }

    public Nysiis() {
        this(true);
    }

    public Nysiis(boolean z) {
        this.strict = z;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (!(obj instanceof String)) {
            throw new EncoderException("Parameter supplied to Nysiis encode is not of type java.lang.String");
        }
        return nysiis((String) obj);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return nysiis(str);
    }

    public boolean isStrict() {
        return this.strict;
    }

    public String nysiis(String str) {
        if (str == null) {
            return null;
        }
        String strClean = SoundexUtils.clean(str);
        if (strClean.length() == 0) {
            return strClean;
        }
        String strReplaceFirst = PAT_DT_ETC.matcher(PAT_EE_IE.matcher(PAT_SCH.matcher(PAT_PH_PF.matcher(PAT_K.matcher(PAT_KN.matcher(PAT_MAC.matcher(strClean).replaceFirst("MCC")).replaceFirst("NN")).replaceFirst("C")).replaceFirst(TuningConstants.DEFAULT_TRANSPARENCY)).replaceFirst("SSS")).replaceFirst("Y")).replaceFirst("D");
        StringBuilder sb = new StringBuilder(strReplaceFirst.length());
        sb.append(strReplaceFirst.charAt(0));
        char[] charArray = strReplaceFirst.toCharArray();
        int length = charArray.length;
        int i = 1;
        while (i < length) {
            int i2 = i - 1;
            char[] cArrTranscodeRemaining = transcodeRemaining(charArray[i2], charArray[i], i < length + (-1) ? charArray[i + 1] : ' ', i < length + (-2) ? charArray[i + 2] : ' ');
            System.arraycopy(cArrTranscodeRemaining, 0, charArray, i, cArrTranscodeRemaining.length);
            char c = charArray[i];
            if (c != charArray[i2]) {
                sb.append(c);
            }
            i++;
        }
        if (sb.length() > 1) {
            char cCharAt = sb.charAt(sb.length() - 1);
            if (cCharAt == 'S') {
                sb.deleteCharAt(sb.length() - 1);
                cCharAt = sb.charAt(sb.length() - 1);
            }
            if (sb.length() > 2 && sb.charAt(sb.length() - 2) == 'A' && cCharAt == 'Y') {
                sb.deleteCharAt(sb.length() - 2);
            }
            if (cCharAt == 'A') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        String string = sb.toString();
        return isStrict() ? string.substring(0, Math.min(6, string.length())) : string;
    }
}
