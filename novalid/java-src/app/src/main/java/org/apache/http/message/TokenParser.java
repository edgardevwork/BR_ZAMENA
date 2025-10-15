package org.apache.http.message;

import java.util.BitSet;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes8.dex */
public class TokenParser {

    /* renamed from: CR */
    public static final char f9940CR = '\r';
    public static final char DQUOTE = '\"';
    public static final char ESCAPE = '\\';

    /* renamed from: HT */
    public static final char f9941HT = '\t';
    public static final TokenParser INSTANCE = new TokenParser();

    /* renamed from: LF */
    public static final char f9942LF = '\n';

    /* renamed from: SP */
    public static final char f9943SP = ' ';

    public static boolean isWhitespace(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n';
    }

    public static BitSet INIT_BITSET(int... iArr) {
        BitSet bitSet = new BitSet();
        for (int i : iArr) {
            bitSet.set(i);
        }
        return bitSet;
    }

    public String parseToken(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet) {
        StringBuilder sb = new StringBuilder();
        loop0: while (true) {
            boolean z = false;
            while (!parserCursor.atEnd()) {
                char cCharAt = charArrayBuffer.charAt(parserCursor.getPos());
                if (bitSet != null && bitSet.get(cCharAt)) {
                    break loop0;
                }
                if (isWhitespace(cCharAt)) {
                    skipWhiteSpace(charArrayBuffer, parserCursor);
                    z = true;
                } else {
                    if (z && sb.length() > 0) {
                        sb.append(' ');
                    }
                    copyContent(charArrayBuffer, parserCursor, bitSet, sb);
                }
            }
            break loop0;
        }
        return sb.toString();
    }

    public String parseValue(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet) {
        StringBuilder sb = new StringBuilder();
        loop0: while (true) {
            boolean z = false;
            while (!parserCursor.atEnd()) {
                char cCharAt = charArrayBuffer.charAt(parserCursor.getPos());
                if (bitSet != null && bitSet.get(cCharAt)) {
                    break loop0;
                }
                if (isWhitespace(cCharAt)) {
                    skipWhiteSpace(charArrayBuffer, parserCursor);
                    z = true;
                } else if (cCharAt == '\"') {
                    if (z && sb.length() > 0) {
                        sb.append(' ');
                    }
                    copyQuotedContent(charArrayBuffer, parserCursor, sb);
                } else {
                    if (z && sb.length() > 0) {
                        sb.append(' ');
                    }
                    copyUnquotedContent(charArrayBuffer, parserCursor, bitSet, sb);
                }
            }
            break loop0;
        }
        return sb.toString();
    }

    public void skipWhiteSpace(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound && isWhitespace(charArrayBuffer.charAt(pos2)); pos2++) {
            pos++;
        }
        parserCursor.updatePos(pos);
    }

    public void copyContent(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet, StringBuilder sb) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            char cCharAt = charArrayBuffer.charAt(pos2);
            if ((bitSet != null && bitSet.get(cCharAt)) || isWhitespace(cCharAt)) {
                break;
            }
            pos++;
            sb.append(cCharAt);
        }
        parserCursor.updatePos(pos);
    }

    public void copyUnquotedContent(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet, StringBuilder sb) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            char cCharAt = charArrayBuffer.charAt(pos2);
            if ((bitSet != null && bitSet.get(cCharAt)) || isWhitespace(cCharAt) || cCharAt == '\"') {
                break;
            }
            pos++;
            sb.append(cCharAt);
        }
        parserCursor.updatePos(pos);
    }

    public void copyQuotedContent(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, StringBuilder sb) {
        if (parserCursor.atEnd()) {
            return;
        }
        int pos = parserCursor.getPos();
        int pos2 = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        if (charArrayBuffer.charAt(pos) != '\"') {
            return;
        }
        int i = pos + 1;
        int i2 = pos2 + 1;
        boolean z = false;
        while (true) {
            if (i2 >= upperBound) {
                break;
            }
            char cCharAt = charArrayBuffer.charAt(i2);
            if (z) {
                if (cCharAt != '\"' && cCharAt != '\\') {
                    sb.append('\\');
                }
                sb.append(cCharAt);
                z = false;
            } else if (cCharAt == '\"') {
                i++;
                break;
            } else if (cCharAt == '\\') {
                z = true;
            } else if (cCharAt != '\r' && cCharAt != '\n') {
                sb.append(cCharAt);
            }
            i2++;
            i++;
        }
        parserCursor.updatePos(i);
    }
}
