package com.google.common.p024io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes7.dex */
public final class LineReader {
    public final char[] buf;
    public final CharBuffer cbuf;
    public final LineBuffer lineBuf;
    public final Queue<String> lines;
    public final Readable readable;

    @CheckForNull
    public final Reader reader;

    /* renamed from: com.google.common.io.LineReader$1 */
    /* loaded from: classes6.dex */
    public class C74811 extends LineBuffer {
        public C74811() {
        }

        @Override // com.google.common.p024io.LineBuffer
        public void handleLine(String line, String end) {
            LineReader.this.lines.add(line);
        }
    }

    public LineReader(Readable readable) {
        CharBuffer charBufferCreateBuffer = CharStreams.createBuffer();
        this.cbuf = charBufferCreateBuffer;
        this.buf = charBufferCreateBuffer.array();
        this.lines = new ArrayDeque();
        this.lineBuf = new LineBuffer() { // from class: com.google.common.io.LineReader.1
            public C74811() {
            }

            @Override // com.google.common.p024io.LineBuffer
            public void handleLine(String line, String end) {
                LineReader.this.lines.add(line);
            }
        };
        this.readable = (Readable) Preconditions.checkNotNull(readable);
        this.reader = readable instanceof Reader ? (Reader) readable : null;
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public String readLine() throws IOException {
        int i;
        while (true) {
            if (this.lines.peek() != null) {
                break;
            }
            Java8Compatibility.clear(this.cbuf);
            Reader reader = this.reader;
            if (reader != null) {
                char[] cArr = this.buf;
                i = reader.read(cArr, 0, cArr.length);
            } else {
                i = this.readable.read(this.cbuf);
            }
            if (i == -1) {
                this.lineBuf.finish();
                break;
            }
            this.lineBuf.add(this.buf, 0, i);
        }
        return this.lines.poll();
    }
}
