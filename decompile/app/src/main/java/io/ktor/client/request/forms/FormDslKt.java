package io.ktor.client.request.forms;

import androidx.lifecycle.SavedStateHandle;
import io.ktor.http.ContentDisposition;
import io.ktor.http.ContentType;
import io.ktor.http.HeaderValueWithParametersKt;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.PartData;
import io.ktor.utils.p050io.core.BytePacketBuilder;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.ByteReadPacketExtensionsKt;
import io.ktor.utils.p050io.core.Input;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: formDsl.kt */
@Metadata(m7104d1 = {"\u0000L\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t\"\u0006\u0012\u0002\b\u00030\n¢\u0006\u0002\u0010\u000b\u001a[\u0010\f\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0019\b\u0004\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0004 \u0001¢\u0006\u0002\u0010\u0015\u001a]\u0010\f\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0005 \u0001¢\u0006\u0002\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, m7105d2 = {"formData", "", "Lio/ktor/http/content/PartData;", "block", "Lkotlin/Function1;", "Lio/ktor/client/request/forms/FormBuilder;", "", "Lkotlin/ExtensionFunctionType;", SavedStateHandle.VALUES, "", "Lio/ktor/client/request/forms/FormPart;", "([Lio/ktor/client/request/forms/FormPart;)Ljava/util/List;", "append", "key", "", "headers", "Lio/ktor/http/Headers;", "size", "", "bodyBuilder", "Lio/ktor/utils/io/core/BytePacketBuilder;", "(Lio/ktor/client/request/forms/FormBuilder;Ljava/lang/String;Lio/ktor/http/Headers;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", ContentDisposition.Parameters.FileName, "contentType", "Lio/ktor/http/ContentType;", "(Lio/ktor/client/request/forms/FormBuilder;Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/ContentType;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nformDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormDslKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,234:1\n190#1,5:240\n13579#2,2:235\n37#3,2:237\n1#4:239\n*S KotlinDebug\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormDslKt\n*L\n232#1:240,5\n32#1:235,2\n78#1:237,2\n*E\n"})
/* loaded from: classes4.dex */
public final class FormDslKt {
    @NotNull
    public static final List<PartData> formData(@NotNull FormPart<?>... values) {
        PartData binaryChannelItem;
        Intrinsics.checkNotNullParameter(values, "values");
        ArrayList arrayList = new ArrayList();
        for (FormPart<?> formPart : values) {
            String key = formPart.getKey();
            final Object objComponent2 = formPart.component2();
            Headers headers = formPart.getHeaders();
            HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
            HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
            headersBuilder.append(httpHeaders.getContentDisposition(), "form-data; name=" + HeaderValueWithParametersKt.escapeIfNeeded(key));
            headersBuilder.appendAll(headers);
            if (objComponent2 instanceof String) {
                binaryChannelItem = new PartData.FormItem((String) objComponent2, new Function0<Unit>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, headersBuilder.build());
            } else if (objComponent2 instanceof Number) {
                binaryChannelItem = new PartData.FormItem(objComponent2.toString(), new Function0<Unit>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, headersBuilder.build());
            } else if (objComponent2 instanceof Boolean) {
                binaryChannelItem = new PartData.FormItem(objComponent2.toString(), new Function0<Unit>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$3
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, headersBuilder.build());
            } else if (objComponent2 instanceof byte[]) {
                headersBuilder.append(httpHeaders.getContentLength(), String.valueOf(((byte[]) objComponent2).length));
                binaryChannelItem = new PartData.BinaryItem(new Function0<Input>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Input invoke() {
                        final byte[] bArr = (byte[]) objComponent2;
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, bArr.length);
                        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(array, offset, length)");
                        return ByteReadPacketExtensionsKt.ByteReadPacket(byteBufferWrap, new Function1<ByteBuffer, Unit>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$4$invoke$$inlined$ByteReadPacket$default$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ByteBuffer it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer) {
                                invoke2(byteBuffer);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }, new Function0<Unit>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$5
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, headersBuilder.build());
            } else if (objComponent2 instanceof ByteReadPacket) {
                headersBuilder.append(httpHeaders.getContentLength(), String.valueOf(((ByteReadPacket) objComponent2).getRemaining()));
                binaryChannelItem = new PartData.BinaryItem(new Function0<Input>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Input invoke() {
                        return ((ByteReadPacket) objComponent2).copy();
                    }
                }, new Function0<Unit>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((ByteReadPacket) objComponent2).close();
                    }
                }, headersBuilder.build());
            } else if (objComponent2 instanceof InputProvider) {
                InputProvider inputProvider = (InputProvider) objComponent2;
                Long size = inputProvider.getSize();
                if (size != null) {
                    headersBuilder.append(httpHeaders.getContentLength(), size.toString());
                }
                binaryChannelItem = new PartData.BinaryItem(inputProvider.getBlock(), new Function0<Unit>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$8
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, headersBuilder.build());
            } else {
                if (!(objComponent2 instanceof ChannelProvider)) {
                    if (!(objComponent2 instanceof Input)) {
                        throw new IllegalStateException(("Unknown form content type: " + objComponent2).toString());
                    }
                    throw new IllegalStateException(("Can't use [Input] as part of form: " + objComponent2 + ". Consider using [InputProvider] instead.").toString());
                }
                ChannelProvider channelProvider = (ChannelProvider) objComponent2;
                Long size2 = channelProvider.getSize();
                if (size2 != null) {
                    headersBuilder.append(httpHeaders.getContentLength(), size2.toString());
                }
                binaryChannelItem = new PartData.BinaryChannelItem(channelProvider.getBlock(), headersBuilder.build());
            }
            arrayList.add(binaryChannelItem);
        }
        return arrayList;
    }

    @NotNull
    public static final List<PartData> formData(@NotNull Function1<? super FormBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        FormBuilder formBuilder = new FormBuilder();
        block.invoke(formBuilder);
        FormPart[] formPartArr = (FormPart[]) formBuilder.build$ktor_client_core().toArray(new FormPart[0]);
        return formData((FormPart<?>[]) Arrays.copyOf(formPartArr, formPartArr.length));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String key, Headers headers, Long l, Function1 bodyBuilder, int i, Object obj) {
        if ((i & 2) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        if ((i & 4) != 0) {
            l = null;
        }
        Intrinsics.checkNotNullParameter(formBuilder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(bodyBuilder, "bodyBuilder");
        formBuilder.append(new FormPart(key, new InputProvider(l, new C102792(bodyBuilder)), headers));
    }

    /* compiled from: formDsl.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "Lio/ktor/utils/io/core/Input;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nformDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormDslKt$append$2\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,234:1\n12#2,11:235\n*S KotlinDebug\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormDslKt$append$2\n*L\n193#1:235,11\n*E\n"})
    /* renamed from: io.ktor.client.request.forms.FormDslKt$append$2 */
    /* loaded from: classes8.dex */
    public static final class C102792 extends Lambda implements Function0<Input> {
        public final /* synthetic */ Function1<BytePacketBuilder, Unit> $bodyBuilder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C102792(Function1<? super BytePacketBuilder, Unit> function1) {
            super(0);
            this.$bodyBuilder = function1;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Input invoke() {
            Function1<BytePacketBuilder, Unit> function1 = this.$bodyBuilder;
            BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
            try {
                function1.invoke(bytePacketBuilder);
                return bytePacketBuilder.build();
            } catch (Throwable th) {
                bytePacketBuilder.release();
                throw th;
            }
        }
    }

    public static final void append(@NotNull FormBuilder formBuilder, @NotNull String key, @NotNull Headers headers, @Nullable Long l, @NotNull Function1<? super BytePacketBuilder, Unit> bodyBuilder) {
        Intrinsics.checkNotNullParameter(formBuilder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(bodyBuilder, "bodyBuilder");
        formBuilder.append(new FormPart(key, new InputProvider(l, new C102792(bodyBuilder)), headers));
    }

    public static final void append(@NotNull FormBuilder formBuilder, @NotNull String key, @NotNull String filename, @Nullable ContentType contentType, @Nullable Long l, @NotNull Function1<? super BytePacketBuilder, Unit> bodyBuilder) {
        Intrinsics.checkNotNullParameter(formBuilder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(bodyBuilder, "bodyBuilder");
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        headersBuilder.set(httpHeaders.getContentDisposition(), "filename=" + HeaderValueWithParametersKt.escapeIfNeeded(filename));
        if (contentType != null) {
            headersBuilder.set(httpHeaders.getContentType(), contentType.toString());
        }
        formBuilder.append(new FormPart(key, new InputProvider(l, new C102792(bodyBuilder)), headersBuilder.build()));
    }
}
