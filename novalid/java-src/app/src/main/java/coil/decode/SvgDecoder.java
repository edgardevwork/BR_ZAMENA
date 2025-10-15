package coil.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import coil.ImageLoader;
import coil.decode.Decoder;
import coil.fetch.SourceResult;
import coil.request.Options;
import coil.request.Svgs;
import coil.size.Scale;
import coil.size.Size;
import coil.size.Sizes;
import coil.util.SvgUtils;
import com.caverock.androidsvg.RenderOptions;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.p051io.CloseableKt;
import kotlinx.coroutines.InterruptibleKt;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SvgDecoder.kt */
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m7105d2 = {"Lcoil/decode/SvgDecoder;", "Lcoil/decode/Decoder;", "source", "Lcoil/decode/ImageSource;", "options", "Lcoil/request/Options;", "useViewBoundsAsIntrinsicSize", "", "(Lcoil/decode/ImageSource;Lcoil/request/Options;Z)V", "getUseViewBoundsAsIntrinsicSize", "()Z", "decode", "Lcoil/decode/DecodeResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDstSize", "Lkotlin/Pair;", "", "srcWidth", "srcHeight", "scale", "Lcoil/size/Scale;", "Companion", "Factory", "coil-svg_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class SvgDecoder implements Decoder {

    @NotNull
    public static final String CSS_KEY = "coil#css";
    public static final float DEFAULT_SIZE = 512.0f;

    @NotNull
    public static final String MIME_TYPE_SVG = "image/svg+xml";

    @NotNull
    public final Options options;

    @NotNull
    public final ImageSource source;
    public final boolean useViewBoundsAsIntrinsicSize;

    @JvmOverloads
    public SvgDecoder(@NotNull ImageSource imageSource, @NotNull Options options) {
        this(imageSource, options, false, 4, null);
    }

    @JvmOverloads
    public SvgDecoder(@NotNull ImageSource imageSource, @NotNull Options options, boolean z) {
        this.source = imageSource;
        this.options = options;
        this.useViewBoundsAsIntrinsicSize = z;
    }

    public /* synthetic */ SvgDecoder(ImageSource imageSource, Options options, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSource, options, (i & 4) != 0 ? true : z);
    }

    public final boolean getUseViewBoundsAsIntrinsicSize() {
        return this.useViewBoundsAsIntrinsicSize;
    }

    @Override // coil.decode.Decoder
    @Nullable
    public Object decode(@NotNull Continuation<? super DecodeResult> continuation) {
        return InterruptibleKt.runInterruptible$default(null, new Function0<DecodeResult>() { // from class: coil.decode.SvgDecoder.decode.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DecodeResult invoke() throws SVGParseException {
                float documentWidth;
                float documentHeight;
                int iRoundToInt;
                int iRoundToInt2;
                BufferedSource bufferedSourceSource = SvgDecoder.this.source.source();
                try {
                    SVG fromInputStream = SVG.getFromInputStream(bufferedSourceSource.inputStream());
                    CloseableKt.closeFinally(bufferedSourceSource, null);
                    RectF documentViewBox = fromInputStream.getDocumentViewBox();
                    if (SvgDecoder.this.getUseViewBoundsAsIntrinsicSize() && documentViewBox != null) {
                        documentWidth = documentViewBox.width();
                        documentHeight = documentViewBox.height();
                    } else {
                        documentWidth = fromInputStream.getDocumentWidth();
                        documentHeight = fromInputStream.getDocumentHeight();
                    }
                    SvgDecoder svgDecoder = SvgDecoder.this;
                    Pair dstSize = svgDecoder.getDstSize(documentWidth, documentHeight, svgDecoder.options.getScale());
                    float fFloatValue = ((Number) dstSize.component1()).floatValue();
                    float fFloatValue2 = ((Number) dstSize.component2()).floatValue();
                    if (documentWidth > 0.0f && documentHeight > 0.0f) {
                        float fComputeSizeMultiplier = DecodeUtils.computeSizeMultiplier(documentWidth, documentHeight, fFloatValue, fFloatValue2, SvgDecoder.this.options.getScale());
                        iRoundToInt = (int) (fComputeSizeMultiplier * documentWidth);
                        iRoundToInt2 = (int) (fComputeSizeMultiplier * documentHeight);
                    } else {
                        iRoundToInt = MathKt__MathJVMKt.roundToInt(fFloatValue);
                        iRoundToInt2 = MathKt__MathJVMKt.roundToInt(fFloatValue2);
                    }
                    if (documentViewBox == null && documentWidth > 0.0f && documentHeight > 0.0f) {
                        fromInputStream.setDocumentViewBox(0.0f, 0.0f, documentWidth, documentHeight);
                    }
                    fromInputStream.setDocumentWidth("100%");
                    fromInputStream.setDocumentHeight("100%");
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRoundToInt, iRoundToInt2, SvgUtils.toSoftware(SvgDecoder.this.options.getConfig()));
                    String strCss = Svgs.css(SvgDecoder.this.options.getParameters());
                    fromInputStream.renderToCanvas(new Canvas(bitmapCreateBitmap), strCss != null ? new RenderOptions().css(strCss) : null);
                    return new DecodeResult(new BitmapDrawable(SvgDecoder.this.options.getContext().getResources(), bitmapCreateBitmap), true);
                } finally {
                }
            }
        }, continuation, 1, null);
    }

    public final Pair<Float, Float> getDstSize(float srcWidth, float srcHeight, Scale scale) {
        if (Sizes.isOriginal(this.options.getSize())) {
            if (srcWidth <= 0.0f) {
                srcWidth = 512.0f;
            }
            if (srcHeight <= 0.0f) {
                srcHeight = 512.0f;
            }
            return TuplesKt.m7112to(Float.valueOf(srcWidth), Float.valueOf(srcHeight));
        }
        Size size = this.options.getSize();
        return TuplesKt.m7112to(Float.valueOf(SvgUtils.toPx(size.getWidth(), scale)), Float.valueOf(SvgUtils.toPx(size.getHeight(), scale)));
    }

    /* compiled from: SvgDecoder.kt */
    @Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, m7105d2 = {"Lcoil/decode/SvgDecoder$Factory;", "Lcoil/decode/Decoder$Factory;", "useViewBoundsAsIntrinsicSize", "", "(Z)V", "getUseViewBoundsAsIntrinsicSize", "()Z", "create", "Lcoil/decode/Decoder;", "result", "Lcoil/fetch/SourceResult;", "options", "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "equals", "other", "", "hashCode", "", "isApplicable", "coil-svg_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class Factory implements Decoder.Factory {
        public final boolean useViewBoundsAsIntrinsicSize;

        @JvmOverloads
        public Factory() {
            this(false, 1, null);
        }

        @JvmOverloads
        public Factory(boolean z) {
            this.useViewBoundsAsIntrinsicSize = z;
        }

        public /* synthetic */ Factory(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public final boolean getUseViewBoundsAsIntrinsicSize() {
            return this.useViewBoundsAsIntrinsicSize;
        }

        @Override // coil.decode.Decoder.Factory
        @Nullable
        public Decoder create(@NotNull SourceResult result, @NotNull Options options, @NotNull ImageLoader imageLoader) {
            if (isApplicable(result)) {
                return new SvgDecoder(result.getSource(), options, this.useViewBoundsAsIntrinsicSize);
            }
            return null;
        }

        public final boolean isApplicable(SourceResult result) {
            return Intrinsics.areEqual(result.getMimeType(), SvgDecoder.MIME_TYPE_SVG) || SvgDecodeUtils.isSvg(DecodeUtils.INSTANCE, result.getSource().source());
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Factory) && this.useViewBoundsAsIntrinsicSize == ((Factory) other).useViewBoundsAsIntrinsicSize;
        }

        public int hashCode() {
            return Boolean.hashCode(this.useViewBoundsAsIntrinsicSize);
        }
    }
}
