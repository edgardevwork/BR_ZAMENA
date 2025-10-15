package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.image.ImageDecoder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes4.dex */
public final class BitmapFactoryImageDecoder extends SimpleDecoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> implements ImageDecoder {
    public final BitmapDecoder bitmapDecoder;

    @VisibleForTesting(otherwise = 2)
    public interface BitmapDecoder {
        Bitmap decode(byte[] bArr, int i) throws ImageDecoderException;
    }

    @Override // androidx.media3.decoder.SimpleDecoder, androidx.media3.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ ImageOutputBuffer dequeueOutputBuffer() throws ImageDecoderException {
        return (ImageOutputBuffer) super.dequeueOutputBuffer();
    }

    public static /* synthetic */ Bitmap access$100(byte[] bArr, int i) throws ImageDecoderException {
        return decode(bArr, i);
    }

    /* loaded from: classes.dex */
    public static final class Factory implements ImageDecoder.Factory {
        public final BitmapDecoder bitmapDecoder;

        public Factory() {
            this.bitmapDecoder = new BitmapDecoder() { // from class: androidx.media3.exoplayer.image.BitmapFactoryImageDecoder$Factory$$ExternalSyntheticLambda0
                @Override // androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.BitmapDecoder
                public final Bitmap decode(byte[] bArr, int i) {
                    return BitmapFactoryImageDecoder.access$100(bArr, i);
                }
            };
        }

        public Factory(BitmapDecoder bitmapDecoder) {
            this.bitmapDecoder = bitmapDecoder;
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public int supportsFormat(Format format) {
            String str = format.sampleMimeType;
            if (str == null || !MimeTypes.isImage(str)) {
                return RendererCapabilities.create(0);
            }
            if (Util.isBitmapFactorySupportedMimeType(format.sampleMimeType)) {
                return RendererCapabilities.create(4);
            }
            return RendererCapabilities.create(1);
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public BitmapFactoryImageDecoder createImageDecoder() {
            return new BitmapFactoryImageDecoder(this.bitmapDecoder);
        }
    }

    public BitmapFactoryImageDecoder(BitmapDecoder bitmapDecoder) {
        super(new DecoderInputBuffer[1], new ImageOutputBuffer[1]);
        this.bitmapDecoder = bitmapDecoder;
    }

    @Override // androidx.media3.decoder.Decoder
    public String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public DecoderInputBuffer createInputBuffer() {
        return new DecoderInputBuffer(1);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public ImageOutputBuffer createOutputBuffer() {
        return new ImageOutputBuffer() { // from class: androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.1
            @Override // androidx.media3.decoder.DecoderOutputBuffer
            public void release() {
                BitmapFactoryImageDecoder.this.releaseOutputBuffer(this);
            }
        };
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public ImageDecoderException createUnexpectedDecodeException(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    @Nullable
    public ImageDecoderException decode(DecoderInputBuffer decoderInputBuffer, ImageOutputBuffer imageOutputBuffer, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.data);
            Assertions.checkState(byteBuffer.hasArray());
            Assertions.checkArgument(byteBuffer.arrayOffset() == 0);
            imageOutputBuffer.bitmap = this.bitmapDecoder.decode(byteBuffer.array(), byteBuffer.remaining());
            imageOutputBuffer.timeUs = decoderInputBuffer.timeUs;
            return null;
        } catch (ImageDecoderException e) {
            return e;
        }
    }

    public static Bitmap decode(byte[] bArr, int i) throws IOException, ImageDecoderException {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i);
        if (bitmapDecodeByteArray == null) {
            throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")");
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 0, i);
            try {
                ExifInterface exifInterface = new ExifInterface(byteArrayInputStream);
                byteArrayInputStream.close();
                int rotationDegrees = exifInterface.getRotationDegrees();
                if (rotationDegrees == 0) {
                    return bitmapDecodeByteArray;
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(rotationDegrees);
                return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
            } finally {
            }
        } catch (IOException e) {
            throw new ImageDecoderException(e);
        }
    }
}
