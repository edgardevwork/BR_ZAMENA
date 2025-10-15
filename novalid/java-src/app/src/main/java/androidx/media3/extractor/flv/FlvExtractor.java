package androidx.media3.extractor.flv;

import androidx.media3.common.C2732C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@UnstableApi
/* loaded from: classes.dex */
public final class FlvExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.flv.FlvExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return FlvExtractor.lambda$static$0();
        }
    };
    public static final int FLV_HEADER_SIZE = 9;
    public static final int FLV_TAG = 4607062;
    public static final int FLV_TAG_HEADER_SIZE = 11;
    public static final int STATE_READING_FLV_HEADER = 1;
    public static final int STATE_READING_TAG_DATA = 4;
    public static final int STATE_READING_TAG_HEADER = 3;
    public static final int STATE_SKIPPING_TO_TAG_HEADER = 2;
    public static final int TAG_TYPE_AUDIO = 8;
    public static final int TAG_TYPE_SCRIPT_DATA = 18;
    public static final int TAG_TYPE_VIDEO = 9;
    public AudioTagPayloadReader audioReader;
    public int bytesToNextTagHeader;
    public ExtractorOutput extractorOutput;
    public long mediaTagTimestampOffsetUs;
    public boolean outputFirstSample;
    public boolean outputSeekMap;
    public int tagDataSize;
    public long tagTimestampUs;
    public int tagType;
    public VideoTagPayloadReader videoReader;
    public final ParsableByteArray scratch = new ParsableByteArray(4);
    public final ParsableByteArray headerBuffer = new ParsableByteArray(9);
    public final ParsableByteArray tagHeaderBuffer = new ParsableByteArray(11);
    public final ParsableByteArray tagData = new ParsableByteArray();
    public final ScriptTagPayloadReader metadataReader = new ScriptTagPayloadReader();
    public int state = 1;

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new FlvExtractor()};
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        extractorInput.peekFully(this.scratch.getData(), 0, 3);
        this.scratch.setPosition(0);
        if (this.scratch.readUnsignedInt24() != 4607062) {
            return false;
        }
        extractorInput.peekFully(this.scratch.getData(), 0, 2);
        this.scratch.setPosition(0);
        if ((this.scratch.readUnsignedShort() & 250) != 0) {
            return false;
        }
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        this.scratch.setPosition(0);
        int i = this.scratch.readInt();
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i);
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        this.scratch.setPosition(0);
        return this.scratch.readInt() == 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        if (j == 0) {
            this.state = 1;
            this.outputFirstSample = false;
        } else {
            this.state = 3;
        }
        this.bytesToNextTagHeader = 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        Assertions.checkStateNotNull(this.extractorOutput);
        while (true) {
            int i = this.state;
            if (i != 1) {
                if (i == 2) {
                    skipToTagHeader(extractorInput);
                } else if (i != 3) {
                    if (i == 4) {
                        if (readTagData(extractorInput)) {
                            return 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (!readTagHeader(extractorInput)) {
                    return -1;
                }
            } else if (!readFlvHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @RequiresNonNull({"extractorOutput"})
    public final boolean readFlvHeader(ExtractorInput extractorInput) throws IOException {
        if (!extractorInput.readFully(this.headerBuffer.getData(), 0, 9, true)) {
            return false;
        }
        this.headerBuffer.setPosition(0);
        this.headerBuffer.skipBytes(4);
        int unsignedByte = this.headerBuffer.readUnsignedByte();
        boolean z = (unsignedByte & 4) != 0;
        boolean z2 = (unsignedByte & 1) != 0;
        if (z && this.audioReader == null) {
            this.audioReader = new AudioTagPayloadReader(this.extractorOutput.track(8, 1));
        }
        if (z2 && this.videoReader == null) {
            this.videoReader = new VideoTagPayloadReader(this.extractorOutput.track(9, 2));
        }
        this.extractorOutput.endTracks();
        this.bytesToNextTagHeader = this.headerBuffer.readInt() - 5;
        this.state = 2;
        return true;
    }

    public final void skipToTagHeader(ExtractorInput extractorInput) throws IOException {
        extractorInput.skipFully(this.bytesToNextTagHeader);
        this.bytesToNextTagHeader = 0;
        this.state = 3;
    }

    public final boolean readTagHeader(ExtractorInput extractorInput) throws IOException {
        if (!extractorInput.readFully(this.tagHeaderBuffer.getData(), 0, 11, true)) {
            return false;
        }
        this.tagHeaderBuffer.setPosition(0);
        this.tagType = this.tagHeaderBuffer.readUnsignedByte();
        this.tagDataSize = this.tagHeaderBuffer.readUnsignedInt24();
        this.tagTimestampUs = this.tagHeaderBuffer.readUnsignedInt24();
        this.tagTimestampUs = ((this.tagHeaderBuffer.readUnsignedByte() << 24) | this.tagTimestampUs) * 1000;
        this.tagHeaderBuffer.skipBytes(3);
        this.state = 4;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @RequiresNonNull({"extractorOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean readTagData(ExtractorInput extractorInput) throws IOException {
        boolean zConsume;
        boolean z;
        long currentTimestampUs = getCurrentTimestampUs();
        int i = this.tagType;
        if (i == 8 && this.audioReader != null) {
            ensureReadyForMediaOutput();
            zConsume = this.audioReader.consume(prepareTagData(extractorInput), currentTimestampUs);
        } else if (i == 9 && this.videoReader != null) {
            ensureReadyForMediaOutput();
            zConsume = this.videoReader.consume(prepareTagData(extractorInput), currentTimestampUs);
        } else if (i == 18 && !this.outputSeekMap) {
            zConsume = this.metadataReader.consume(prepareTagData(extractorInput), currentTimestampUs);
            long durationUs = this.metadataReader.getDurationUs();
            if (durationUs != C2732C.TIME_UNSET) {
                this.extractorOutput.seekMap(new IndexSeekMap(this.metadataReader.getKeyFrameTagPositions(), this.metadataReader.getKeyFrameTimesUs(), durationUs));
                this.outputSeekMap = true;
            }
        } else {
            extractorInput.skipFully(this.tagDataSize);
            zConsume = false;
            z = false;
            if (!this.outputFirstSample && zConsume) {
                this.outputFirstSample = true;
                this.mediaTagTimestampOffsetUs = this.metadataReader.getDurationUs() != C2732C.TIME_UNSET ? -this.tagTimestampUs : 0L;
            }
            this.bytesToNextTagHeader = 4;
            this.state = 2;
            return z;
        }
        z = true;
        if (!this.outputFirstSample) {
            this.outputFirstSample = true;
            this.mediaTagTimestampOffsetUs = this.metadataReader.getDurationUs() != C2732C.TIME_UNSET ? -this.tagTimestampUs : 0L;
        }
        this.bytesToNextTagHeader = 4;
        this.state = 2;
        return z;
    }

    public final ParsableByteArray prepareTagData(ExtractorInput extractorInput) throws IOException {
        if (this.tagDataSize > this.tagData.capacity()) {
            ParsableByteArray parsableByteArray = this.tagData;
            parsableByteArray.reset(new byte[Math.max(parsableByteArray.capacity() * 2, this.tagDataSize)], 0);
        } else {
            this.tagData.setPosition(0);
        }
        this.tagData.setLimit(this.tagDataSize);
        extractorInput.readFully(this.tagData.getData(), 0, this.tagDataSize);
        return this.tagData;
    }

    @RequiresNonNull({"extractorOutput"})
    public final void ensureReadyForMediaOutput() {
        if (this.outputSeekMap) {
            return;
        }
        this.extractorOutput.seekMap(new SeekMap.Unseekable(C2732C.TIME_UNSET));
        this.outputSeekMap = true;
    }

    public final long getCurrentTimestampUs() {
        if (this.outputFirstSample) {
            return this.mediaTagTimestampOffsetUs + this.tagTimestampUs;
        }
        if (this.metadataReader.getDurationUs() == C2732C.TIME_UNSET) {
            return 0L;
        }
        return this.tagTimestampUs;
    }
}
