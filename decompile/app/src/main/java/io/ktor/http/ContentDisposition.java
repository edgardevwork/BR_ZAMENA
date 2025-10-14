package io.ktor.http;

import io.ktor.http.HeaderValueWithParameters;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContentDisposition.kt */
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\rJ\u0014\u0010\u0016\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u001a"}, m7105d2 = {"Lio/ktor/http/ContentDisposition;", "Lio/ktor/http/HeaderValueWithParameters;", "disposition", "", "parameters", "", "Lio/ktor/http/HeaderValueParam;", "(Ljava/lang/String;Ljava/util/List;)V", "getDisposition", "()Ljava/lang/String;", "name", "getName", "equals", "", "other", "", "hashCode", "", "withParameter", "key", "value", "encodeValue", "withParameters", "newParameters", "Companion", "Parameters", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class ContentDisposition extends HeaderValueWithParameters {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final ContentDisposition File = new ContentDisposition(PomReader.PomProfileElement.FILE, null, 2, null);

    @NotNull
    public static final ContentDisposition Mixed = new ContentDisposition("mixed", null, 2, null);

    @NotNull
    public static final ContentDisposition Attachment = new ContentDisposition("attachment", null, 2, null);

    @NotNull
    public static final ContentDisposition Inline = new ContentDisposition("inline", null, 2, null);

    /* compiled from: ContentDisposition.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m7105d2 = {"Lio/ktor/http/ContentDisposition$Parameters;", "", "()V", "CreationDate", "", "FileName", "FileNameAsterisk", "Handling", "ModificationDate", "Name", "ReadDate", "Size", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class Parameters {

        @NotNull
        public static final String CreationDate = "creation-date";

        @NotNull
        public static final String FileName = "filename";

        @NotNull
        public static final String FileNameAsterisk = "filename*";

        @NotNull
        public static final String Handling = "handling";

        @NotNull
        public static final Parameters INSTANCE = new Parameters();

        @NotNull
        public static final String ModificationDate = "modification-date";

        @NotNull
        public static final String Name = "name";

        @NotNull
        public static final String ReadDate = "read-date";

        @NotNull
        public static final String Size = "size";
    }

    public /* synthetic */ ContentDisposition(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentDisposition(@NotNull String disposition, @NotNull List<HeaderValueParam> parameters) {
        super(disposition, parameters);
        Intrinsics.checkNotNullParameter(disposition, "disposition");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @NotNull
    public final String getDisposition() {
        return getContent();
    }

    @Nullable
    public final String getName() {
        return parameter("name");
    }

    public static /* synthetic */ ContentDisposition withParameter$default(ContentDisposition contentDisposition, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return contentDisposition.withParameter(str, str2, z);
    }

    @NotNull
    public final ContentDisposition withParameter(@NotNull String key, @NotNull String value, boolean encodeValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (encodeValue) {
            value = ContentDispositionKt.encodeContentDispositionAttribute(key, value);
        }
        return new ContentDisposition(getDisposition(), CollectionsKt___CollectionsKt.plus((Collection<? extends HeaderValueParam>) getParameters(), new HeaderValueParam(key, value)));
    }

    @NotNull
    public final ContentDisposition withParameters(@NotNull List<HeaderValueParam> newParameters) {
        Intrinsics.checkNotNullParameter(newParameters, "newParameters");
        return new ContentDisposition(getDisposition(), CollectionsKt___CollectionsKt.plus((Collection) getParameters(), (Iterable) newParameters));
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof ContentDisposition) {
            ContentDisposition contentDisposition = (ContentDisposition) other;
            if (Intrinsics.areEqual(getDisposition(), contentDisposition.getDisposition()) && Intrinsics.areEqual(getParameters(), contentDisposition.getParameters())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (getDisposition().hashCode() * 31) + getParameters().hashCode();
    }

    /* compiled from: ContentDisposition.kt */
    @Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\u0010"}, m7105d2 = {"Lio/ktor/http/ContentDisposition$Companion;", "", "()V", "Attachment", "Lio/ktor/http/ContentDisposition;", "getAttachment", "()Lio/ktor/http/ContentDisposition;", "File", "getFile", "Inline", "getInline", "Mixed", "getMixed", "parse", "value", "", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nContentDisposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentDisposition.kt\nio/ktor/http/ContentDisposition$Companion\n+ 2 HeaderValueWithParameters.kt\nio/ktor/http/HeaderValueWithParameters$Companion\n*L\n1#1,103:1\n63#2,2:104\n*S KotlinDebug\n*F\n+ 1 ContentDisposition.kt\nio/ktor/http/ContentDisposition$Companion\n*L\n76#1:104,2\n*E\n"})
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ContentDisposition getFile() {
            return ContentDisposition.File;
        }

        @NotNull
        public final ContentDisposition getMixed() {
            return ContentDisposition.Mixed;
        }

        @NotNull
        public final ContentDisposition getAttachment() {
            return ContentDisposition.Attachment;
        }

        @NotNull
        public final ContentDisposition getInline() {
            return ContentDisposition.Inline;
        }

        @NotNull
        public final ContentDisposition parse(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            HeaderValueWithParameters.Companion companion = HeaderValueWithParameters.INSTANCE;
            HeaderValue headerValue = (HeaderValue) CollectionsKt___CollectionsKt.last((List) HttpHeaderValueParserKt.parseHeaderValue(value));
            return new ContentDisposition(headerValue.getValue(), headerValue.getParams());
        }
    }
}
