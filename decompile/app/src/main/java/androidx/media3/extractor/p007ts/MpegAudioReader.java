package androidx.media3.extractor.p007ts;

import androidx.annotation.Nullable;
import androidx.media3.common.C2732C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.p007ts.TsPayloadReader;
import org.apache.ivy.osgi.p063p2.P2ArtifactParser;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@UnstableApi
/* loaded from: classes3.dex */
public final class MpegAudioReader implements ElementaryStreamReader {
    public static final int HEADER_SIZE = 4;
    public static final int STATE_FINDING_HEADER = 0;
    public static final int STATE_READING_FRAME = 2;
    public static final int STATE_READING_HEADER = 1;
    public String formatId;
    public int frameBytesRead;
    public long frameDurationUs;
    public int frameSize;
    public boolean hasOutputFormat;
    public final MpegAudioUtil.Header header;
    public final ParsableByteArray headerScratch;

    @Nullable
    public final String language;
    public boolean lastByteWasFF;
    public TrackOutput output;
    public final int roleFlags;
    public int state;
    public long timeUs;

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void packetFinished() {
    }

    public MpegAudioReader() {
        this(null, 0);
    }

    public MpegAudioReader(@Nullable String str, int i) {
        this.state = 0;
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        this.headerScratch = parsableByteArray;
        parsableByteArray.getData()[0] = -1;
        this.header = new MpegAudioUtil.Header();
        this.timeUs = C2732C.TIME_UNSET;
        this.language = str;
        this.roleFlags = i;
    }

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void seek() {
        this.state = 0;
        this.frameBytesRead = 0;
        this.lastByteWasFF = false;
        this.timeUs = C2732C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
    }

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        this.timeUs = j;
    }

    @Override // androidx.media3.extractor.p007ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        Assertions.checkStateNotNull(this.output);
        while (parsableByteArray.bytesLeft() > 0) {
            int i = this.state;
            if (i == 0) {
                findHeader(parsableByteArray);
            } else if (i == 1) {
                readHeaderRemainder(parsableByteArray);
            } else if (i == 2) {
                readFrameRemainder(parsableByteArray);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void findHeader(ParsableByteArray parsableByteArray) {
        byte[] data = parsableByteArray.getData();
        int iLimit = parsableByteArray.limit();
        for (int position = parsableByteArray.getPosition(); position < iLimit; position++) {
            byte b = data[position];
            boolean z = (b & 255) == 255;
            boolean z2 = this.lastByteWasFF && (b & 224) == 224;
            this.lastByteWasFF = z;
            if (z2) {
                parsableByteArray.setPosition(position + 1);
                this.lastByteWasFF = false;
                this.headerScratch.getData()[1] = data[position];
                this.frameBytesRead = 2;
                this.state = 1;
                return;
            }
        }
        parsableByteArray.setPosition(iLimit);
    }

    @RequiresNonNull({P2ArtifactParser.RuleHandler.OUTPUT})
    public final void readHeaderRemainder(ParsableByteArray parsableByteArray) {
        int iMin = Math.min(parsableByteArray.bytesLeft(), 4 - this.frameBytesRead);
        parsableByteArray.readBytes(this.headerScratch.getData(), this.frameBytesRead, iMin);
        int i = this.frameBytesRead + iMin;
        this.frameBytesRead = i;
        if (i < 4) {
            return;
        }
        this.headerScratch.setPosition(0);
        if (!this.header.setForHeaderData(this.headerScratch.readInt())) {
            this.frameBytesRead = 0;
            this.state = 1;
            return;
        }
        this.frameSize = this.header.frameSize;
        if (!this.hasOutputFormat) {
            this.frameDurationUs = (r8.samplesPerFrame * 1000000) / r8.sampleRate;
            this.output.format(new Format.Builder().setId(this.formatId).setSampleMimeType(this.header.mimeType).setMaxInputSize(4096).setChannelCount(this.header.channels).setSampleRate(this.header.sampleRate).setLanguage(this.language).setRoleFlags(this.roleFlags).build());
            this.hasOutputFormat = true;
        }
        this.headerScratch.setPosition(0);
        this.output.sampleData(this.headerScratch, 4);
        this.state = 2;
    }

    @RequiresNonNull({P2ArtifactParser.RuleHandler.OUTPUT})
    public final void readFrameRemainder(ParsableByteArray parsableByteArray) {
        int iMin = Math.min(parsableByteArray.bytesLeft(), this.frameSize - this.frameBytesRead);
        this.output.sampleData(parsableByteArray, iMin);
        int i = this.frameBytesRead + iMin;
        this.frameBytesRead = i;
        if (i < this.frameSize) {
            return;
        }
        Assertions.checkState(this.timeUs != C2732C.TIME_UNSET);
        this.output.sampleMetadata(this.timeUs, 1, this.frameSize, 0, null);
        this.timeUs += this.frameDurationUs;
        this.frameBytesRead = 0;
        this.state = 0;
    }
}
