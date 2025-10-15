package androidx.media3.extractor.p007ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.p007ts.TsPayloadReader;

@UnstableApi
/* loaded from: classes3.dex */
public final class SectionReader implements TsPayloadReader {
    public static final int DEFAULT_SECTION_BUFFER_LENGTH = 32;
    public static final int MAX_SECTION_LENGTH = 4098;
    public static final int SECTION_HEADER_LENGTH = 3;
    public int bytesRead;
    public final SectionPayloadReader reader;
    public final ParsableByteArray sectionData = new ParsableByteArray(32);
    public boolean sectionSyntaxIndicator;
    public int totalSectionLength;
    public boolean waitingForPayloadStart;

    public SectionReader(SectionPayloadReader sectionPayloadReader) {
        this.reader = sectionPayloadReader;
    }

    @Override // androidx.media3.extractor.p007ts.TsPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.reader.init(timestampAdjuster, extractorOutput, trackIdGenerator);
        this.waitingForPayloadStart = true;
    }

    @Override // androidx.media3.extractor.p007ts.TsPayloadReader
    public void seek() {
        this.waitingForPayloadStart = true;
    }

    @Override // androidx.media3.extractor.p007ts.TsPayloadReader
    public void consume(ParsableByteArray parsableByteArray, int i) {
        boolean z = (i & 1) != 0;
        int position = z ? parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte() : -1;
        if (this.waitingForPayloadStart) {
            if (!z) {
                return;
            }
            this.waitingForPayloadStart = false;
            parsableByteArray.setPosition(position);
            this.bytesRead = 0;
        }
        while (parsableByteArray.bytesLeft() > 0) {
            int i2 = this.bytesRead;
            if (i2 < 3) {
                if (i2 == 0) {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    parsableByteArray.setPosition(parsableByteArray.getPosition() - 1);
                    if (unsignedByte == 255) {
                        this.waitingForPayloadStart = true;
                        return;
                    }
                }
                int iMin = Math.min(parsableByteArray.bytesLeft(), 3 - this.bytesRead);
                parsableByteArray.readBytes(this.sectionData.getData(), this.bytesRead, iMin);
                int i3 = this.bytesRead + iMin;
                this.bytesRead = i3;
                if (i3 == 3) {
                    this.sectionData.setPosition(0);
                    this.sectionData.setLimit(3);
                    this.sectionData.skipBytes(1);
                    int unsignedByte2 = this.sectionData.readUnsignedByte();
                    int unsignedByte3 = this.sectionData.readUnsignedByte();
                    this.sectionSyntaxIndicator = (unsignedByte2 & 128) != 0;
                    this.totalSectionLength = (((unsignedByte2 & 15) << 8) | unsignedByte3) + 3;
                    int iCapacity = this.sectionData.capacity();
                    int i4 = this.totalSectionLength;
                    if (iCapacity < i4) {
                        this.sectionData.ensureCapacity(Math.min(4098, Math.max(i4, this.sectionData.capacity() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(parsableByteArray.bytesLeft(), this.totalSectionLength - this.bytesRead);
                parsableByteArray.readBytes(this.sectionData.getData(), this.bytesRead, iMin2);
                int i5 = this.bytesRead + iMin2;
                this.bytesRead = i5;
                int i6 = this.totalSectionLength;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.sectionSyntaxIndicator) {
                        if (Util.crc32(this.sectionData.getData(), 0, this.totalSectionLength, -1) != 0) {
                            this.waitingForPayloadStart = true;
                            return;
                        }
                        this.sectionData.setLimit(this.totalSectionLength - 4);
                    } else {
                        this.sectionData.setLimit(i6);
                    }
                    this.sectionData.setPosition(0);
                    this.reader.consume(this.sectionData);
                    this.bytesRead = 0;
                }
            }
        }
    }
}
