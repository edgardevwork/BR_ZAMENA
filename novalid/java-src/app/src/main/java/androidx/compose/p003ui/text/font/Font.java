package androidx.compose.p003ui.text.font;

import androidx.compose.runtime.Immutable;
import com.google.common.net.MediaType;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

/* compiled from: Font.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eR\u001a\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m7105d2 = {"Landroidx/compose/ui/text/font/Font;", "", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "getLoadingStrategy-PKNRLFQ", "()I", "style", "Landroidx/compose/ui/text/font/FontStyle;", "getStyle-_-LCdwA", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "Companion", com.bumptech.glide.load.model.ResourceLoader.TAG, "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public interface Font {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final long MaximumAsyncTimeoutMillis = 15000;

    /* compiled from: Font.kt */
    @Deprecated(message = "Replaced with FontFamily.Resolver during the introduction of async fonts, all usages should be replaced. Custom subclasses can be converted into a FontFamily.Resolver by calling createFontFamilyResolver(myFontFamilyResolver, context)")
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m7105d2 = {"Landroidx/compose/ui/text/font/Font$ResourceLoader;", "", "load", MediaType.FONT_TYPE, "Landroidx/compose/ui/text/font/Font;", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public interface ResourceLoader {
        @Deprecated(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
        @NotNull
        Object load(@NotNull Font font);
    }

    /* renamed from: getStyle-_-LCdwA */
    int mo13229getStyle_LCdwA();

    @NotNull
    FontWeight getWeight();

    /* renamed from: getLoadingStrategy-PKNRLFQ */
    default int mo13221getLoadingStrategyPKNRLFQ() {
        return FontLoadingStrategy.INSTANCE.m13266getBlockingPKNRLFQ();
    }

    /* compiled from: Font.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m7105d2 = {"Landroidx/compose/ui/text/font/Font$Companion;", "", "()V", "MaximumAsyncTimeoutMillis", "", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long MaximumAsyncTimeoutMillis = 15000;

        private Companion() {
        }
    }
}
