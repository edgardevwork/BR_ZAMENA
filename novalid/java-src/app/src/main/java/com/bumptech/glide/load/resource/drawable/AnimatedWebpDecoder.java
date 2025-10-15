package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;
import com.bumptech.glide.util.ByteBufferUtil;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

@RequiresApi(28)
@Deprecated
/* loaded from: classes4.dex */
public final class AnimatedWebpDecoder {
    public final ArrayPool arrayPool;
    public final List<ImageHeaderParser> imageHeaderParsers;

    public static ResourceDecoder<InputStream, Drawable> streamDecoder(List<ImageHeaderParser> list, ArrayPool arrayPool) {
        return new StreamAnimatedWebpDecoder(new AnimatedWebpDecoder(list, arrayPool));
    }

    public static ResourceDecoder<ByteBuffer, Drawable> byteBufferDecoder(List<ImageHeaderParser> list, ArrayPool arrayPool) {
        return new ByteBufferAnimatedWebpDecoder(new AnimatedWebpDecoder(list, arrayPool));
    }

    public AnimatedWebpDecoder(List<ImageHeaderParser> list, ArrayPool arrayPool) {
        this.imageHeaderParsers = list;
        this.arrayPool = arrayPool;
    }

    public boolean handles(ByteBuffer byteBuffer) throws IOException {
        return isHandled(ImageHeaderParserUtils.getType(this.imageHeaderParsers, byteBuffer));
    }

    public boolean handles(InputStream inputStream) throws IOException {
        return isHandled(ImageHeaderParserUtils.getType(this.imageHeaderParsers, inputStream, this.arrayPool));
    }

    public final boolean isHandled(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }

    public Resource<Drawable> decode(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull Options options) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new DefaultOnHeaderDecodedListener(i, i2, options));
        if (!AnimatedImageDecoder$$ExternalSyntheticApiModelOutline0.m1003m(drawableDecodeDrawable)) {
            throw new IOException("Received unexpected drawable type for animated webp, failing: " + drawableDecodeDrawable);
        }
        return new AnimatedImageDrawableResource(AnimatedImageDecoder$$ExternalSyntheticApiModelOutline1.m1004m(drawableDecodeDrawable));
    }

    /* loaded from: classes6.dex */
    public static final class AnimatedImageDrawableResource implements Resource<Drawable> {
        public static final int ESTIMATED_NUMBER_OF_FRAMES = 2;
        public final AnimatedImageDrawable imageDrawable;

        public AnimatedImageDrawableResource(AnimatedImageDrawable animatedImageDrawable) {
            this.imageDrawable = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        @NonNull
        public Class<Drawable> getResourceClass() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        @NonNull
        public Drawable get() {
            return this.imageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public int getSize() {
            return this.imageDrawable.getIntrinsicWidth() * this.imageDrawable.getIntrinsicHeight() * Util.getBytesPerPixel(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public void recycle() {
            this.imageDrawable.stop();
            this.imageDrawable.clearAnimationCallbacks();
        }
    }

    /* loaded from: classes6.dex */
    public static final class StreamAnimatedWebpDecoder implements ResourceDecoder<InputStream, Drawable> {
        public final AnimatedWebpDecoder delegate;

        public StreamAnimatedWebpDecoder(AnimatedWebpDecoder animatedWebpDecoder) {
            this.delegate = animatedWebpDecoder;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public boolean handles(@NonNull InputStream inputStream, @NonNull Options options) throws IOException {
            return this.delegate.handles(inputStream);
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public Resource<Drawable> decode(@NonNull InputStream inputStream, int i, int i2, @NonNull Options options) throws IOException {
            return this.delegate.decode(ImageDecoder.createSource(ByteBufferUtil.fromStream(inputStream)), i, i2, options);
        }
    }

    /* loaded from: classes6.dex */
    public static final class ByteBufferAnimatedWebpDecoder implements ResourceDecoder<ByteBuffer, Drawable> {
        public final AnimatedWebpDecoder delegate;

        public ByteBufferAnimatedWebpDecoder(AnimatedWebpDecoder animatedWebpDecoder) {
            this.delegate = animatedWebpDecoder;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public boolean handles(@NonNull ByteBuffer byteBuffer, @NonNull Options options) throws IOException {
            return this.delegate.handles(byteBuffer);
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public Resource<Drawable> decode(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull Options options) throws IOException {
            return this.delegate.decode(ImageDecoder.createSource(byteBuffer), i, i2, options);
        }
    }
}
