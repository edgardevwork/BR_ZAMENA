package androidx.media3.extractor.p007ts;

import androidx.media3.common.C2732C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.p007ts.TsPayloadReader;
import org.apache.ivy.osgi.p063p2.P2ArtifactParser;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@UnstableApi
/* loaded from: classes3.dex */
public final class PassthroughSectionPayloadReader implements SectionPayloadReader {
    public Format format;
    public TrackOutput output;
    public TimestampAdjuster timestampAdjuster;

    public PassthroughSectionPayloadReader(String str) {
        this.format = new Format.Builder().setSampleMimeType(str).build();
    }

    @Override // androidx.media3.extractor.p007ts.SectionPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.timestampAdjuster = timestampAdjuster;
        trackIdGenerator.generateNewId();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 5);
        this.output = trackOutputTrack;
        trackOutputTrack.format(this.format);
    }

    @Override // androidx.media3.extractor.p007ts.SectionPayloadReader
    public void consume(ParsableByteArray parsableByteArray) {
        assertInitialized();
        long lastAdjustedTimestampUs = this.timestampAdjuster.getLastAdjustedTimestampUs();
        long timestampOffsetUs = this.timestampAdjuster.getTimestampOffsetUs();
        if (lastAdjustedTimestampUs == C2732C.TIME_UNSET || timestampOffsetUs == C2732C.TIME_UNSET) {
            return;
        }
        Format format = this.format;
        if (timestampOffsetUs != format.subsampleOffsetUs) {
            Format formatBuild = format.buildUpon().setSubsampleOffsetUs(timestampOffsetUs).build();
            this.format = formatBuild;
            this.output.format(formatBuild);
        }
        int iBytesLeft = parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, iBytesLeft);
        this.output.sampleMetadata(lastAdjustedTimestampUs, 1, iBytesLeft, 0, null);
    }

    @EnsuresNonNull({"timestampAdjuster", P2ArtifactParser.RuleHandler.OUTPUT})
    public final void assertInitialized() {
        Assertions.checkStateNotNull(this.timestampAdjuster);
        Util.castNonNull(this.output);
    }
}
