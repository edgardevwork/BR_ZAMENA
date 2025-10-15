package io.ktor.http;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: LinkHeader.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0006\"\u00020\u0003¢\u0006\u0002\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lio/ktor/http/LinkHeader;", "Lio/ktor/http/HeaderValueWithParameters;", "uri", "", "rel", "(Ljava/lang/String;Ljava/lang/String;)V", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "", "type", "Lio/ktor/http/ContentType;", "(Ljava/lang/String;Ljava/util/List;Lio/ktor/http/ContentType;)V", "params", "Lio/ktor/http/HeaderValueParam;", "(Ljava/lang/String;Ljava/util/List;)V", "getUri", "()Ljava/lang/String;", "Parameters", "Rel", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class LinkHeader extends HeaderValueWithParameters {

    /* compiled from: LinkHeader.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m7105d2 = {"Lio/ktor/http/LinkHeader$Parameters;", "", "()V", "Anchor", "", "HrefLang", "Media", "Rel", Parameters.Rev, "Title", "Type", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class Parameters {

        @NotNull
        public static final String Anchor = "anchor";

        @NotNull
        public static final String HrefLang = "hreflang";

        @NotNull
        public static final Parameters INSTANCE = new Parameters();

        @NotNull
        public static final String Media = "media";

        @NotNull
        public static final String Rel = "rel";

        @NotNull
        public static final String Rev = "Rev";

        @NotNull
        public static final String Title = "title";

        @NotNull
        public static final String Type = "type";
    }

    /* compiled from: LinkHeader.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m7105d2 = {"Lio/ktor/http/LinkHeader$Rel;", "", "()V", "DnsPrefetch", "", "Next", "PreConnect", "PreLoad", "PreRender", "Prefetch", "Stylesheet", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class Rel {

        @NotNull
        public static final String DnsPrefetch = "dns-prefetch";

        @NotNull
        public static final Rel INSTANCE = new Rel();

        @NotNull
        public static final String Next = "next";

        @NotNull
        public static final String PreConnect = "preconnect";

        @NotNull
        public static final String PreLoad = "preload";

        @NotNull
        public static final String PreRender = "prerender";

        @NotNull
        public static final String Prefetch = "prefetch";

        @NotNull
        public static final String Stylesheet = "stylesheet";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkHeader(@NotNull String uri, @NotNull List<HeaderValueParam> params) {
        super('<' + uri + '>', params);
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkHeader(@NotNull String uri, @NotNull String rel) {
        this(uri, (List<HeaderValueParam>) CollectionsKt__CollectionsJVMKt.listOf(new HeaderValueParam("rel", rel)));
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(rel, "rel");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkHeader(@NotNull String uri, @NotNull String... rel) {
        this(uri, (List<HeaderValueParam>) CollectionsKt__CollectionsJVMKt.listOf(new HeaderValueParam("rel", ArraysKt___ArraysKt.joinToString$default(rel, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null))));
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(rel, "rel");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkHeader(@NotNull String uri, @NotNull List<String> rel, @NotNull ContentType type) {
        this(uri, (List<HeaderValueParam>) CollectionsKt__CollectionsKt.listOf((Object[]) new HeaderValueParam[]{new HeaderValueParam("rel", CollectionsKt___CollectionsKt.joinToString$default(rel, " ", null, null, 0, null, null, 62, null)), new HeaderValueParam("type", type.toString())}));
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(rel, "rel");
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @NotNull
    public final String getUri() {
        return StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removePrefix(getContent(), (CharSequence) "<"), (CharSequence) ">");
    }
}
