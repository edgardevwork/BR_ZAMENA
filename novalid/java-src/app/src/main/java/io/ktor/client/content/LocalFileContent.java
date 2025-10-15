package io.ktor.client.content;

import io.ktor.http.ContentType;
import io.ktor.http.FileContentTypeJvmKt;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.cio.FileChannelsKt;
import io.ktor.utils.p050io.ByteReadChannel;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.LongRange;
import org.apache.ivy.osgi.p063p2.P2MetadataParser;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;

/* compiled from: LocalFileContent.kt */
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m7105d2 = {"Lio/ktor/client/content/LocalFileContent;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", PomReader.PomProfileElement.FILE, "Ljava/io/File;", "contentType", "Lio/ktor/http/ContentType;", "(Ljava/io/File;Lio/ktor/http/ContentType;)V", "contentLength", "", "getContentLength", "()Ljava/lang/Long;", "getContentType", "()Lio/ktor/http/ContentType;", "getFile", "()Ljava/io/File;", "readFrom", "Lio/ktor/utils/io/ByteReadChannel;", P2MetadataParser.RequiredHandler.RANGE, "Lkotlin/ranges/LongRange;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class LocalFileContent extends OutgoingContent.ReadChannelContent {

    @NotNull
    public final ContentType contentType;

    @NotNull
    public final File file;

    @NotNull
    public final File getFile() {
        return this.file;
    }

    public /* synthetic */ LocalFileContent(File file, ContentType contentType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? FileContentTypeJvmKt.defaultForFile(ContentType.INSTANCE, file) : contentType);
    }

    @Override // io.ktor.http.content.OutgoingContent
    @NotNull
    public ContentType getContentType() {
        return this.contentType;
    }

    public LocalFileContent(@NotNull File file, @NotNull ContentType contentType) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.file = file;
        this.contentType = contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent
    @NotNull
    public Long getContentLength() {
        return Long.valueOf(this.file.length());
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    @NotNull
    public ByteReadChannel readFrom() {
        return FileChannelsKt.readChannel$default(this.file, 0L, 0L, null, 7, null);
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    @NotNull
    public ByteReadChannel readFrom(@NotNull LongRange range) {
        Intrinsics.checkNotNullParameter(range, "range");
        return FileChannelsKt.readChannel$default(this.file, range.getStart().longValue(), range.getEndInclusive().longValue(), null, 4, null);
    }
}
