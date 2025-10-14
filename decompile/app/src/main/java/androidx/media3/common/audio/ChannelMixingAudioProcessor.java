package androidx.media3.common.audio;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes4.dex */
public final class ChannelMixingAudioProcessor extends BaseAudioProcessor {
    public final SparseArray<ChannelMixingMatrix> matrixByInputChannelCount = new SparseArray<>();

    public void putChannelMixingMatrix(ChannelMixingMatrix channelMixingMatrix) {
        this.matrixByInputChannelCount.put(channelMixingMatrix.getInputChannelCount(), channelMixingMatrix);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        ChannelMixingMatrix channelMixingMatrix = this.matrixByInputChannelCount.get(audioFormat.channelCount);
        if (channelMixingMatrix == null) {
            throw new AudioProcessor.UnhandledAudioFormatException("No mixing matrix for input channel count", audioFormat);
        }
        if (channelMixingMatrix.isIdentity()) {
            return AudioProcessor.AudioFormat.NOT_SET;
        }
        return new AudioProcessor.AudioFormat(audioFormat.sampleRate, channelMixingMatrix.getOutputChannelCount(), 2);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        ChannelMixingMatrix channelMixingMatrix = (ChannelMixingMatrix) Assertions.checkStateNotNull(this.matrixByInputChannelCount.get(this.inputAudioFormat.channelCount));
        int iRemaining = byteBuffer.remaining() / this.inputAudioFormat.bytesPerFrame;
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(this.outputAudioFormat.bytesPerFrame * iRemaining);
        AudioMixingUtil.mix(byteBuffer, this.inputAudioFormat, byteBufferReplaceOutputBuffer, this.outputAudioFormat, channelMixingMatrix, iRemaining, false);
        byteBufferReplaceOutputBuffer.flip();
    }
}
