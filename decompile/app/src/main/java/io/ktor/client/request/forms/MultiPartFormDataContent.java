package io.ktor.client.request.forms;

import io.ktor.client.request.forms.PreparedPart;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.PartData;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteReadChannelKt;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.ByteWriteChannelKt;
import io.ktor.utils.p050io.charsets.CharsetJVMKt;
import io.ktor.utils.p050io.core.BytePacketBuilder;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.Input;
import io.ktor.utils.p050io.core.Output;
import io.ktor.utils.p050io.core.OutputKt;
import io.ktor.utils.p050io.core.StringsKt;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FormDataContent.kt */
@Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013@RX\u0096\u000e¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m7105d2 = {"Lio/ktor/client/request/forms/MultiPartFormDataContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "parts", "", "Lio/ktor/http/content/PartData;", "boundary", "", "contentType", "Lio/ktor/http/ContentType;", "(Ljava/util/List;Ljava/lang/String;Lio/ktor/http/ContentType;)V", "BODY_OVERHEAD_SIZE", "", "BOUNDARY_BYTES", "", "LAST_BOUNDARY_BYTES", "PART_OVERHEAD_SIZE", "getBoundary", "()Ljava/lang/String;", "<set-?>", "", "contentLength", "getContentLength", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getContentType", "()Lio/ktor/http/ContentType;", "rawParts", "Lio/ktor/client/request/forms/PreparedPart;", "writeTo", "", "channel", "Lio/ktor/utils/io/ByteWriteChannel;", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFormDataContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormDataContent.kt\nio/ktor/client/request/forms/MultiPartFormDataContent\n+ 2 Strings.kt\nio/ktor/utils/io/core/StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 5 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n*L\n1#1,172:1\n7#2,4:173\n7#2,4:177\n1549#3:181\n1620#3,2:182\n1622#3:195\n12#4,11:184\n8#5,4:196\n22#5,4:200\n12#5,9:204\n*S KotlinDebug\n*F\n+ 1 FormDataContent.kt\nio/ktor/client/request/forms/MultiPartFormDataContent\n*L\n46#1:173,4\n47#1:177,4\n52#1:181\n52#1:182,2\n52#1:195\n72#1:184,11\n122#1:196,4\n122#1:200,4\n122#1:204,9\n*E\n"})
/* loaded from: classes8.dex */
public final class MultiPartFormDataContent extends OutgoingContent.WriteChannelContent {
    public final int BODY_OVERHEAD_SIZE;

    @NotNull
    public final byte[] BOUNDARY_BYTES;

    @NotNull
    public final byte[] LAST_BOUNDARY_BYTES;
    public final int PART_OVERHEAD_SIZE;

    @NotNull
    public final String boundary;

    @Nullable
    public Long contentLength;

    @NotNull
    public final ContentType contentType;

    @NotNull
    public final List<PreparedPart> rawParts;

    /* compiled from: FormDataContent.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.request.forms.MultiPartFormDataContent", m7120f = "FormDataContent.kt", m7121i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 6}, m7122l = {116, 117, 118, 123, 127, 131, 134}, m7123m = "writeTo", m7124n = {"this", "channel", "part", "this", "channel", "part", "this", "channel", "part", "this", "channel", "$this$use$iv", "closed$iv", "this", "channel", "this", "channel", "channel"}, m7125s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "I$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
    /* renamed from: io.ktor.client.request.forms.MultiPartFormDataContent$writeTo$1 */
    public static final class C102801 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C102801(Continuation<? super C102801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiPartFormDataContent.this.writeTo(null, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MultiPartFormDataContent(List list, String str, ContentType contentType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 2) != 0 ? FormDataContentKt.generateBoundary() : str;
        this(list, str, (i & 4) != 0 ? ContentType.MultiPart.INSTANCE.getFormData().withParameter("boundary", str) : contentType);
    }

    @NotNull
    public final String getBoundary() {
        return this.boundary;
    }

    @Override // io.ktor.http.content.OutgoingContent
    @NotNull
    public ContentType getContentType() {
        return this.contentType;
    }

    public MultiPartFormDataContent(@NotNull List<? extends PartData> parts, @NotNull String boundary, @NotNull ContentType contentType) {
        byte[] bArrEncodeToByteArray;
        byte[] bArrEncodeToByteArray2;
        PreparedPart channelPart;
        Function0<ByteReadPacket> function0;
        Intrinsics.checkNotNullParameter(parts, "parts");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.boundary = boundary;
        this.contentType = contentType;
        String str = "--" + boundary + "\r\n";
        Charset charset = Charsets.UTF_8;
        if (Intrinsics.areEqual(charset, charset)) {
            bArrEncodeToByteArray = StringsKt__StringsJVMKt.encodeToByteArray(str);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrEncodeToByteArray = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, str, 0, str.length());
        }
        this.BOUNDARY_BYTES = bArrEncodeToByteArray;
        String str2 = "--" + boundary + "--\r\n";
        if (Intrinsics.areEqual(charset, charset)) {
            bArrEncodeToByteArray2 = StringsKt__StringsJVMKt.encodeToByteArray(str2);
        } else {
            CharsetEncoder charsetEncoderNewEncoder2 = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder2, "charset.newEncoder()");
            bArrEncodeToByteArray2 = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder2, str2, 0, str2.length());
        }
        this.LAST_BOUNDARY_BYTES = bArrEncodeToByteArray2;
        this.BODY_OVERHEAD_SIZE = bArrEncodeToByteArray2.length;
        this.PART_OVERHEAD_SIZE = (FormDataContentKt.RN_BYTES.length * 2) + bArrEncodeToByteArray.length;
        List<? extends PartData> list = parts;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.rawParts = arrayList;
                Long lValueOf = 0L;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        l = lValueOf;
                        break;
                    }
                    Long size = ((PreparedPart) it2.next()).getSize();
                    if (size == null) {
                        break;
                    } else {
                        lValueOf = lValueOf != null ? Long.valueOf(lValueOf.longValue() + size.longValue()) : null;
                    }
                }
                this.contentLength = l != null ? Long.valueOf(l.longValue() + this.BODY_OVERHEAD_SIZE) : l;
                return;
            }
            PartData partData = (PartData) it.next();
            BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
            for (Map.Entry<String, List<String>> entry : partData.getHeaders().entries()) {
                StringsKt.writeText$default(bytePacketBuilder, entry.getKey() + ": " + CollectionsKt___CollectionsKt.joinToString$default(entry.getValue(), "; ", null, null, 0, null, null, 62, null), 0, 0, (Charset) null, 14, (Object) null);
                OutputKt.writeFully$default((Output) bytePacketBuilder, FormDataContentKt.RN_BYTES, 0, 0, 6, (Object) null);
            }
            Headers headers = partData.getHeaders();
            HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
            String str3 = headers.get(httpHeaders.getContentLength());
            Long lValueOf2 = str3 != null ? Long.valueOf(Long.parseLong(str3)) : null;
            if (partData instanceof PartData.FileItem) {
                channelPart = new PreparedPart.InputPart(StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null), ((PartData.FileItem) partData).getProvider(), lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + this.PART_OVERHEAD_SIZE + r5.length) : null);
            } else if (partData instanceof PartData.BinaryItem) {
                channelPart = new PreparedPart.InputPart(StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null), ((PartData.BinaryItem) partData).getProvider(), lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + this.PART_OVERHEAD_SIZE + r5.length) : null);
            } else if (!(partData instanceof PartData.FormItem)) {
                if (partData instanceof PartData.BinaryChannelItem) {
                    channelPart = new PreparedPart.ChannelPart(StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null), ((PartData.BinaryChannelItem) partData).getProvider(), lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + this.PART_OVERHEAD_SIZE + r5.length) : null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                BytePacketBuilder bytePacketBuilder2 = new BytePacketBuilder(null, 1, null);
                try {
                    StringsKt.writeText$default(bytePacketBuilder2, ((PartData.FormItem) partData).getValue(), 0, 0, (Charset) null, 14, (Object) null);
                    final byte[] bytes$default = StringsKt.readBytes$default(bytePacketBuilder2.build(), 0, 1, null);
                    Function0<ByteReadPacket> function02 = new Function0<ByteReadPacket>() { // from class: io.ktor.client.request.forms.MultiPartFormDataContent$rawParts$1$provider$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final ByteReadPacket invoke() {
                            byte[] bArr = bytes$default;
                            BytePacketBuilder bytePacketBuilder3 = new BytePacketBuilder(null, 1, null);
                            try {
                                OutputKt.writeFully$default((Output) bytePacketBuilder3, bArr, 0, 0, 6, (Object) null);
                                return bytePacketBuilder3.build();
                            } catch (Throwable th) {
                                bytePacketBuilder3.release();
                                throw th;
                            }
                        }
                    };
                    if (lValueOf2 == null) {
                        function0 = function02;
                        StringsKt.writeText$default(bytePacketBuilder, httpHeaders.getContentLength() + ": " + bytes$default.length, 0, 0, (Charset) null, 14, (Object) null);
                        OutputKt.writeFully$default((Output) bytePacketBuilder, FormDataContentKt.RN_BYTES, 0, 0, 6, (Object) null);
                    } else {
                        function0 = function02;
                    }
                    channelPart = new PreparedPart.InputPart(StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null), function0, Long.valueOf(bytes$default.length + this.PART_OVERHEAD_SIZE + r4.length));
                } catch (Throwable th) {
                    bytePacketBuilder2.release();
                    throw th;
                }
            }
            arrayList.add(channelPart);
        }
    }

    @Override // io.ktor.http.content.OutgoingContent
    @Nullable
    public Long getContentLength() {
        return this.contentLength;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0 A[Catch: all -> 0x0035, TryCatch #2 {all -> 0x0035, blocks: (B:13:0x0030, B:44:0x00ca, B:46:0x00d0, B:50:0x00ec, B:53:0x0102, B:80:0x017e, B:84:0x0197, B:43:0x00c3), top: B:99:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011f A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #5 {all -> 0x008e, blocks: (B:57:0x011b, B:59:0x011f, B:64:0x0145, B:73:0x0156, B:75:0x015a, B:72:0x0155, B:32:0x0089, B:37:0x00a2, B:40:0x00b9, B:70:0x0153, B:69:0x0150, B:66:0x014b, B:60:0x012b, B:63:0x0143, B:27:0x0071), top: B:99:0x0021, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156 A[Catch: all -> 0x008e, TryCatch #5 {all -> 0x008e, blocks: (B:57:0x011b, B:59:0x011f, B:64:0x0145, B:73:0x0156, B:75:0x015a, B:72:0x0155, B:32:0x0089, B:37:0x00a2, B:40:0x00b9, B:70:0x0153, B:69:0x0150, B:66:0x014b, B:60:0x012b, B:63:0x0143, B:27:0x0071), top: B:99:0x0021, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0197 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #2 {all -> 0x0035, blocks: (B:13:0x0030, B:44:0x00ca, B:46:0x00d0, B:50:0x00ec, B:53:0x0102, B:80:0x017e, B:84:0x0197, B:43:0x00c3), top: B:99:0x0021 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0194 -> B:20:0x0049). Please report as a decompilation issue!!! */
    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object writeTo(@NotNull ByteWriteChannel byteWriteChannel, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C102801 c102801;
        ByteWriteChannel byteWriteChannel2;
        Iterator<PreparedPart> it;
        MultiPartFormDataContent multiPartFormDataContent;
        Iterator<PreparedPart> it2;
        MultiPartFormDataContent multiPartFormDataContent2;
        PreparedPart next;
        PreparedPart preparedPart;
        Input inputInvoke;
        Iterator<PreparedPart> it3;
        ByteWriteChannel byteWriteChannel3;
        MultiPartFormDataContent multiPartFormDataContent3;
        byte[] bArr;
        byte[] bArr2;
        byte[] headers;
        if (continuation instanceof C102801) {
            c102801 = (C102801) continuation;
            int i = c102801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c102801.label = i - Integer.MIN_VALUE;
            } else {
                c102801 = new C102801(continuation);
            }
        }
        Object obj = c102801.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = c102801.label;
        try {
            try {
                try {
                } catch (Throwable th) {
                    th = th;
                    byteWriteChannel = byteWriteChannel2;
                    try {
                        byteWriteChannel.close(th);
                        return Unit.INSTANCE;
                    } finally {
                        ByteWriteChannelKt.close(byteWriteChannel);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                byteWriteChannel = r2;
                byteWriteChannel.close(th);
                return Unit.INSTANCE;
            }
        } catch (Throwable th3) {
            th = th3;
            byteWriteChannel.close(th);
            return Unit.INSTANCE;
        }
        switch (r2) {
            case 0:
                ResultKt.throwOnFailure(obj);
                it = this.rawParts.iterator();
                multiPartFormDataContent = this;
                if (it.hasNext()) {
                    next = it.next();
                    byte[] bArr3 = multiPartFormDataContent.BOUNDARY_BYTES;
                    c102801.L$0 = multiPartFormDataContent;
                    c102801.L$1 = byteWriteChannel;
                    c102801.L$2 = it;
                    c102801.L$3 = next;
                    c102801.label = 1;
                    if (ByteWriteChannelKt.writeFully(byteWriteChannel, bArr3, c102801) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    multiPartFormDataContent2 = multiPartFormDataContent;
                    it2 = it;
                    headers = next.getHeaders();
                    c102801.L$0 = multiPartFormDataContent2;
                    c102801.L$1 = byteWriteChannel;
                    c102801.L$2 = it2;
                    c102801.L$3 = next;
                    c102801.label = 2;
                    if (ByteWriteChannelKt.writeFully(byteWriteChannel, headers, c102801) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bArr2 = FormDataContentKt.RN_BYTES;
                    c102801.L$0 = multiPartFormDataContent2;
                    c102801.L$1 = byteWriteChannel;
                    c102801.L$2 = it2;
                    c102801.L$3 = next;
                    c102801.label = 3;
                    if (ByteWriteChannelKt.writeFully(byteWriteChannel, bArr2, c102801) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    PreparedPart preparedPart2 = next;
                    byteWriteChannel2 = byteWriteChannel;
                    preparedPart = preparedPart2;
                    if (preparedPart instanceof PreparedPart.InputPart) {
                        inputInvoke = ((PreparedPart.InputPart) preparedPart).getProvider().invoke();
                        c102801.L$0 = multiPartFormDataContent2;
                        c102801.L$1 = byteWriteChannel2;
                        c102801.L$2 = it2;
                        c102801.L$3 = inputInvoke;
                        c102801.I$0 = 0;
                        c102801.label = 4;
                        if (FormDataContentKt.copyTo(inputInvoke, byteWriteChannel2, c102801) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Unit unit = Unit.INSTANCE;
                        inputInvoke.close();
                        byteWriteChannel = byteWriteChannel2;
                        multiPartFormDataContent3 = multiPartFormDataContent2;
                        bArr = FormDataContentKt.RN_BYTES;
                        c102801.L$0 = multiPartFormDataContent3;
                        c102801.L$1 = byteWriteChannel;
                        c102801.L$2 = it2;
                        c102801.L$3 = null;
                        c102801.label = 6;
                        if (ByteWriteChannelKt.writeFully(byteWriteChannel, bArr, c102801) == coroutine_suspended) {
                        }
                    } else {
                        if (preparedPart instanceof PreparedPart.ChannelPart) {
                            ByteReadChannel byteReadChannelInvoke = ((PreparedPart.ChannelPart) preparedPart).getProvider().invoke();
                            c102801.L$0 = multiPartFormDataContent2;
                            c102801.L$1 = byteWriteChannel2;
                            c102801.L$2 = it2;
                            c102801.L$3 = null;
                            c102801.label = 5;
                            if (ByteReadChannelKt.copyTo(byteReadChannelInvoke, byteWriteChannel2, c102801) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            it3 = it2;
                            byteWriteChannel3 = byteWriteChannel2;
                            multiPartFormDataContent3 = multiPartFormDataContent2;
                            ByteWriteChannel byteWriteChannel4 = byteWriteChannel3;
                            it2 = it3;
                            byteWriteChannel = byteWriteChannel4;
                            bArr = FormDataContentKt.RN_BYTES;
                            c102801.L$0 = multiPartFormDataContent3;
                            c102801.L$1 = byteWriteChannel;
                            c102801.L$2 = it2;
                            c102801.L$3 = null;
                            c102801.label = 6;
                            if (ByteWriteChannelKt.writeFully(byteWriteChannel, bArr, c102801) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            it = it2;
                            multiPartFormDataContent = multiPartFormDataContent3;
                            if (it.hasNext()) {
                                byte[] bArr4 = multiPartFormDataContent.LAST_BOUNDARY_BYTES;
                                c102801.L$0 = byteWriteChannel;
                                c102801.L$1 = null;
                                c102801.L$2 = null;
                                c102801.label = 7;
                                if (ByteWriteChannelKt.writeFully(byteWriteChannel, bArr4, c102801) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        byteWriteChannel = byteWriteChannel2;
                        multiPartFormDataContent3 = multiPartFormDataContent2;
                        bArr = FormDataContentKt.RN_BYTES;
                        c102801.L$0 = multiPartFormDataContent3;
                        c102801.L$1 = byteWriteChannel;
                        c102801.L$2 = it2;
                        c102801.L$3 = null;
                        c102801.label = 6;
                        if (ByteWriteChannelKt.writeFully(byteWriteChannel, bArr, c102801) == coroutine_suspended) {
                        }
                    }
                }
            case 1:
                PreparedPart preparedPart3 = (PreparedPart) c102801.L$3;
                it2 = (Iterator) c102801.L$2;
                ByteWriteChannel byteWriteChannel5 = (ByteWriteChannel) c102801.L$1;
                multiPartFormDataContent2 = (MultiPartFormDataContent) c102801.L$0;
                ResultKt.throwOnFailure(obj);
                next = preparedPart3;
                byteWriteChannel = byteWriteChannel5;
                headers = next.getHeaders();
                c102801.L$0 = multiPartFormDataContent2;
                c102801.L$1 = byteWriteChannel;
                c102801.L$2 = it2;
                c102801.L$3 = next;
                c102801.label = 2;
                if (ByteWriteChannelKt.writeFully(byteWriteChannel, headers, c102801) == coroutine_suspended) {
                }
                bArr2 = FormDataContentKt.RN_BYTES;
                c102801.L$0 = multiPartFormDataContent2;
                c102801.L$1 = byteWriteChannel;
                c102801.L$2 = it2;
                c102801.L$3 = next;
                c102801.label = 3;
                if (ByteWriteChannelKt.writeFully(byteWriteChannel, bArr2, c102801) == coroutine_suspended) {
                }
                break;
            case 2:
                PreparedPart preparedPart4 = (PreparedPart) c102801.L$3;
                it2 = (Iterator) c102801.L$2;
                ByteWriteChannel byteWriteChannel6 = (ByteWriteChannel) c102801.L$1;
                multiPartFormDataContent2 = (MultiPartFormDataContent) c102801.L$0;
                ResultKt.throwOnFailure(obj);
                next = preparedPart4;
                byteWriteChannel = byteWriteChannel6;
                bArr2 = FormDataContentKt.RN_BYTES;
                c102801.L$0 = multiPartFormDataContent2;
                c102801.L$1 = byteWriteChannel;
                c102801.L$2 = it2;
                c102801.L$3 = next;
                c102801.label = 3;
                if (ByteWriteChannelKt.writeFully(byteWriteChannel, bArr2, c102801) == coroutine_suspended) {
                }
                break;
            case 3:
                preparedPart = (PreparedPart) c102801.L$3;
                it2 = (Iterator) c102801.L$2;
                byteWriteChannel2 = (ByteWriteChannel) c102801.L$1;
                multiPartFormDataContent2 = (MultiPartFormDataContent) c102801.L$0;
                ResultKt.throwOnFailure(obj);
                if (preparedPart instanceof PreparedPart.InputPart) {
                }
                break;
            case 4:
                inputInvoke = (Closeable) c102801.L$3;
                it2 = (Iterator) c102801.L$2;
                byteWriteChannel2 = (ByteWriteChannel) c102801.L$1;
                multiPartFormDataContent2 = (MultiPartFormDataContent) c102801.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    Unit unit2 = Unit.INSTANCE;
                    inputInvoke.close();
                    byteWriteChannel = byteWriteChannel2;
                    multiPartFormDataContent3 = multiPartFormDataContent2;
                    bArr = FormDataContentKt.RN_BYTES;
                    c102801.L$0 = multiPartFormDataContent3;
                    c102801.L$1 = byteWriteChannel;
                    c102801.L$2 = it2;
                    c102801.L$3 = null;
                    c102801.label = 6;
                    if (ByteWriteChannelKt.writeFully(byteWriteChannel, bArr, c102801) == coroutine_suspended) {
                    }
                } finally {
                }
                break;
            case 5:
                it3 = (Iterator) c102801.L$2;
                byteWriteChannel3 = (ByteWriteChannel) c102801.L$1;
                multiPartFormDataContent3 = (MultiPartFormDataContent) c102801.L$0;
                ResultKt.throwOnFailure(obj);
                ByteWriteChannel byteWriteChannel42 = byteWriteChannel3;
                it2 = it3;
                byteWriteChannel = byteWriteChannel42;
                bArr = FormDataContentKt.RN_BYTES;
                c102801.L$0 = multiPartFormDataContent3;
                c102801.L$1 = byteWriteChannel;
                c102801.L$2 = it2;
                c102801.L$3 = null;
                c102801.label = 6;
                if (ByteWriteChannelKt.writeFully(byteWriteChannel, bArr, c102801) == coroutine_suspended) {
                }
                break;
            case 6:
                Iterator<PreparedPart> it4 = (Iterator) c102801.L$2;
                ByteWriteChannel byteWriteChannel7 = (ByteWriteChannel) c102801.L$1;
                multiPartFormDataContent3 = (MultiPartFormDataContent) c102801.L$0;
                ResultKt.throwOnFailure(obj);
                it = it4;
                byteWriteChannel = byteWriteChannel7;
                multiPartFormDataContent = multiPartFormDataContent3;
                if (it.hasNext()) {
                }
                break;
            case 7:
                byteWriteChannel = (ByteWriteChannel) c102801.L$0;
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
