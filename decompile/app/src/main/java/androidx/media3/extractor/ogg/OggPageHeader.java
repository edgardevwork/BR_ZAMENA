package androidx.media3.extractor.ogg;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorUtil;
import java.io.IOException;

/* loaded from: classes.dex */
public final class OggPageHeader {
    public static final int CAPTURE_PATTERN = 1332176723;
    public static final int CAPTURE_PATTERN_SIZE = 4;
    public static final int EMPTY_PAGE_HEADER_SIZE = 27;
    public static final int MAX_PAGE_PAYLOAD = 65025;
    public static final int MAX_PAGE_SIZE = 65307;
    public static final int MAX_SEGMENT_COUNT = 255;
    public int bodySize;
    public long granulePosition;
    public int headerSize;
    public long pageChecksum;
    public int pageSegmentCount;
    public long pageSequenceNumber;
    public int revision;
    public long streamSerialNumber;
    public int type;
    public final int[] laces = new int[255];
    public final ParsableByteArray scratch = new ParsableByteArray(255);

    public void reset() {
        this.revision = 0;
        this.type = 0;
        this.granulePosition = 0L;
        this.streamSerialNumber = 0L;
        this.pageSequenceNumber = 0L;
        this.pageChecksum = 0L;
        this.pageSegmentCount = 0;
        this.headerSize = 0;
        this.bodySize = 0;
    }

    public boolean skipToNextPage(ExtractorInput extractorInput) throws IOException {
        return skipToNextPage(extractorInput, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.getPosition() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.skip(1) == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean skipToNextPage(ExtractorInput extractorInput, long j) throws IOException {
        Assertions.checkArgument(extractorInput.getPosition() == extractorInput.getPeekPosition());
        this.scratch.reset(4);
        while (true) {
            if ((j != -1 && extractorInput.getPosition() + 4 >= j) || !ExtractorUtil.peekFullyQuietly(extractorInput, this.scratch.getData(), 0, 4, true)) {
                break;
            }
            this.scratch.setPosition(0);
            if (this.scratch.readUnsignedInt() == 1332176723) {
                extractorInput.resetPeekPosition();
                return true;
            }
            extractorInput.skipFully(1);
        }
    }

    public boolean populate(ExtractorInput extractorInput, boolean z) throws IOException {
        reset();
        this.scratch.reset(27);
        if (!ExtractorUtil.peekFullyQuietly(extractorInput, this.scratch.getData(), 0, 27, z) || this.scratch.readUnsignedInt() != 1332176723) {
            return false;
        }
        int unsignedByte = this.scratch.readUnsignedByte();
        this.revision = unsignedByte;
        if (unsignedByte != 0) {
            if (z) {
                return false;
            }
            throw ParserException.createForUnsupportedContainerFeature("unsupported bit stream revision");
        }
        this.type = this.scratch.readUnsignedByte();
        this.granulePosition = this.scratch.readLittleEndianLong();
        this.streamSerialNumber = this.scratch.readLittleEndianUnsignedInt();
        this.pageSequenceNumber = this.scratch.readLittleEndianUnsignedInt();
        this.pageChecksum = this.scratch.readLittleEndianUnsignedInt();
        int unsignedByte2 = this.scratch.readUnsignedByte();
        this.pageSegmentCount = unsignedByte2;
        this.headerSize = unsignedByte2 + 27;
        this.scratch.reset(unsignedByte2);
        if (!ExtractorUtil.peekFullyQuietly(extractorInput, this.scratch.getData(), 0, this.pageSegmentCount, z)) {
            return false;
        }
        for (int i = 0; i < this.pageSegmentCount; i++) {
            this.laces[i] = this.scratch.readUnsignedByte();
            this.bodySize += this.laces[i];
        }
        return true;
    }
}
