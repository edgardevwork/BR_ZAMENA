package org.apache.commons.compress.archivers.zip;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* loaded from: classes8.dex */
public class NioZipEncoding implements ZipEncoding, CharsetAccessor {
    public static final char REPLACEMENT = '?';
    public final Charset charset;
    public final boolean useReplacement;
    public static final byte[] REPLACEMENT_BYTES = {63};
    public static final String REPLACEMENT_STRING = String.valueOf('?');
    public static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public NioZipEncoding(Charset charset, boolean z) {
        this.charset = charset;
        this.useReplacement = z;
    }

    @Override // org.apache.commons.compress.archivers.zip.CharsetAccessor
    public Charset getCharset() {
        return this.charset;
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
    public boolean canEncode(String str) {
        return newEncoder().canEncode(str);
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
    public ByteBuffer encode(String str) {
        CharsetEncoder charsetEncoderNewEncoder = newEncoder();
        CharBuffer charBufferWrap = CharBuffer.wrap(str);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(estimateInitialBufferSize(charsetEncoderNewEncoder, charBufferWrap.remaining()));
        CharBuffer charBufferAllocate = null;
        while (charBufferWrap.hasRemaining()) {
            CoderResult coderResultEncode = charsetEncoderNewEncoder.encode(charBufferWrap, byteBufferAllocate, false);
            if (coderResultEncode.isUnmappable() || coderResultEncode.isMalformed()) {
                if (estimateIncrementalEncodingSize(charsetEncoderNewEncoder, coderResultEncode.length() * 6) > byteBufferAllocate.remaining()) {
                    int i = 0;
                    for (int iPosition = charBufferWrap.position(); iPosition < charBufferWrap.limit(); iPosition++) {
                        i += !charsetEncoderNewEncoder.canEncode(charBufferWrap.get(iPosition)) ? 6 : 1;
                    }
                    byteBufferAllocate = ZipEncodingHelper.growBufferBy(byteBufferAllocate, estimateIncrementalEncodingSize(charsetEncoderNewEncoder, i) - byteBufferAllocate.remaining());
                }
                if (charBufferAllocate == null) {
                    charBufferAllocate = CharBuffer.allocate(6);
                }
                for (int i2 = 0; i2 < coderResultEncode.length(); i2++) {
                    byteBufferAllocate = encodeFully(charsetEncoderNewEncoder, encodeSurrogate(charBufferAllocate, charBufferWrap.get()), byteBufferAllocate);
                }
            } else if (coderResultEncode.isOverflow()) {
                byteBufferAllocate = ZipEncodingHelper.growBufferBy(byteBufferAllocate, estimateIncrementalEncodingSize(charsetEncoderNewEncoder, charBufferWrap.remaining()));
            } else if (coderResultEncode.isUnderflow() || coderResultEncode.isError()) {
                break;
            }
        }
        charsetEncoderNewEncoder.encode(charBufferWrap, byteBufferAllocate, true);
        byteBufferAllocate.limit(byteBufferAllocate.position());
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
    public String decode(byte[] bArr) throws IOException {
        return newDecoder().decode(ByteBuffer.wrap(bArr)).toString();
    }

    public static ByteBuffer encodeFully(CharsetEncoder charsetEncoder, CharBuffer charBuffer, ByteBuffer byteBuffer) {
        while (charBuffer.hasRemaining()) {
            if (charsetEncoder.encode(charBuffer, byteBuffer, false).isOverflow()) {
                byteBuffer = ZipEncodingHelper.growBufferBy(byteBuffer, estimateIncrementalEncodingSize(charsetEncoder, charBuffer.remaining()));
            }
        }
        return byteBuffer;
    }

    public static CharBuffer encodeSurrogate(CharBuffer charBuffer, char c) {
        charBuffer.position(0).limit(6);
        charBuffer.put('%');
        charBuffer.put('U');
        char[] cArr = HEX_CHARS;
        charBuffer.put(cArr[(c >> '\f') & 15]);
        charBuffer.put(cArr[(c >> '\b') & 15]);
        charBuffer.put(cArr[(c >> 4) & 15]);
        charBuffer.put(cArr[c & 15]);
        charBuffer.flip();
        return charBuffer;
    }

    public final CharsetEncoder newEncoder() {
        if (this.useReplacement) {
            CharsetEncoder charsetEncoderNewEncoder = this.charset.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).replaceWith(REPLACEMENT_BYTES);
        }
        CharsetEncoder charsetEncoderNewEncoder2 = this.charset.newEncoder();
        CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
        return charsetEncoderNewEncoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2);
    }

    public final CharsetDecoder newDecoder() {
        if (!this.useReplacement) {
            CharsetDecoder charsetDecoderNewDecoder = this.charset.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            return charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        }
        CharsetDecoder charsetDecoderNewDecoder2 = this.charset.newDecoder();
        CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
        return charsetDecoderNewDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2).replaceWith(REPLACEMENT_STRING);
    }

    public static int estimateInitialBufferSize(CharsetEncoder charsetEncoder, int i) {
        return (int) Math.ceil(charsetEncoder.maxBytesPerChar() + ((i - 1) * charsetEncoder.averageBytesPerChar()));
    }

    public static int estimateIncrementalEncodingSize(CharsetEncoder charsetEncoder, int i) {
        return (int) Math.ceil(i * charsetEncoder.averageBytesPerChar());
    }
}
