package com.google.common.p024io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes7.dex */
public abstract class LineBuffer {
    public StringBuilder line = new StringBuilder();
    public boolean sawReturn;

    public abstract void handleLine(String line, String end) throws IOException;

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void add(char[] cbuf, int off, int len) throws IOException {
        int i;
        if (!this.sawReturn || len <= 0) {
            i = off;
        } else {
            if (finishLine(cbuf[off] == '\n')) {
                i = off + 1;
            }
        }
        int i2 = off + len;
        int i3 = i;
        while (i < i2) {
            char c = cbuf[i];
            if (c == '\n') {
                this.line.append(cbuf, i3, i - i3);
                finishLine(true);
            } else if (c != '\r') {
                i++;
            } else {
                this.line.append(cbuf, i3, i - i3);
                this.sawReturn = true;
                int i4 = i + 1;
                if (i4 < i2) {
                    if (finishLine(cbuf[i4] == '\n')) {
                        i = i4;
                    }
                }
            }
            i3 = i + 1;
            i++;
        }
        this.line.append(cbuf, i3, i2 - i3);
    }

    @CanIgnoreReturnValue
    public final boolean finishLine(boolean sawNewline) throws IOException {
        handleLine(this.line.toString(), this.sawReturn ? sawNewline ? "\r\n" : "\r" : sawNewline ? StringUtils.f9903LF : "");
        this.line = new StringBuilder();
        this.sawReturn = false;
        return sawNewline;
    }

    public void finish() throws IOException {
        if (this.sawReturn || this.line.length() > 0) {
            finishLine(false);
        }
    }
}
