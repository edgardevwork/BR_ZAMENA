package io.ktor.serialization;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.http.HeaderValue;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaderValueParserKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.NullBody;
import io.ktor.util.InternalAPI;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.p050io.ByteReadChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.text.Charsets;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContentConverter.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u001c\u0010\f\u001a\u00060\tj\u0002`\n*\u00020\r2\f\b\u0002\u0010\u000e\u001a\u00060\tj\u0002`\n\u001a \u0010\u000f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n*\u00020\r2\f\b\u0002\u0010\u000e\u001a\u00060\tj\u0002`\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m7105d2 = {"deserialize", "", "", "Lio/ktor/serialization/ContentConverter;", "body", "Lio/ktor/utils/io/ByteReadChannel;", "typeInfo", "Lio/ktor/util/reflect/TypeInfo;", "charset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "(Ljava/util/List;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/util/reflect/TypeInfo;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suitableCharset", "Lio/ktor/http/Headers;", "defaultCharset", "suitableCharsetOrNull", "ktor-serialization"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nContentConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentConverter.kt\nio/ktor/serialization/ContentConverterKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,132:1\n53#2:133\n55#2:137\n50#3:134\n55#3:136\n106#4:135\n*S KotlinDebug\n*F\n+ 1 ContentConverter.kt\nio/ktor/serialization/ContentConverterKt\n*L\n122#1:133\n122#1:137\n122#1:134\n122#1:136\n122#1:135\n*E\n"})
/* loaded from: classes6.dex */
public final class ContentConverterKt {

    /* compiled from: ContentConverter.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.serialization.ContentConverterKt", m7120f = "ContentConverter.kt", m7121i = {0, 0}, m7122l = {123}, m7123m = "deserialize", m7124n = {"body", "typeInfo"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.serialization.ContentConverterKt$deserialize$1 */
    public static final class C103381 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C103381(Continuation<? super C103381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentConverterKt.deserialize(null, null, null, null, this);
        }
    }

    public static /* synthetic */ Charset suitableCharset$default(Headers headers, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return suitableCharset(headers, charset);
    }

    @NotNull
    public static final Charset suitableCharset(@NotNull Headers headers, @NotNull Charset defaultCharset) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter(defaultCharset, "defaultCharset");
        Charset charsetSuitableCharsetOrNull = suitableCharsetOrNull(headers, defaultCharset);
        return charsetSuitableCharsetOrNull == null ? defaultCharset : charsetSuitableCharsetOrNull;
    }

    public static /* synthetic */ Charset suitableCharsetOrNull$default(Headers headers, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return suitableCharsetOrNull(headers, charset);
    }

    @Nullable
    public static final Charset suitableCharsetOrNull(@NotNull Headers headers, @NotNull Charset defaultCharset) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter(defaultCharset, "defaultCharset");
        Iterator<HeaderValue> it = HttpHeaderValueParserKt.parseAndSortHeader(headers.get(HttpHeaders.INSTANCE.getAcceptCharset())).iterator();
        while (it.hasNext()) {
            String value = it.next().getValue();
            if (Intrinsics.areEqual(value, "*")) {
                return defaultCharset;
            }
            if (Charset.isSupported(value)) {
                return Charset.forName(value);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InternalAPI
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object deserialize(@NotNull List<? extends ContentConverter> list, @NotNull final ByteReadChannel byteReadChannel, @NotNull final TypeInfo typeInfo, @NotNull final Charset charset, @NotNull Continuation<Object> continuation) throws Throwable {
        C103381 c103381;
        if (continuation instanceof C103381) {
            c103381 = (C103381) continuation;
            int i = c103381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103381.label = i - Integer.MIN_VALUE;
            } else {
                c103381 = new C103381(continuation);
            }
        }
        Object objFirstOrNull = c103381.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c103381.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            final Flow flowAsFlow = FlowKt.asFlow(list);
            Flow<Object> flow = new Flow<Object>() { // from class: io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ContentConverter.kt\nio/ktor/serialization/ContentConverterKt\n*L\n1#1,222:1\n54#2:223\n122#3:224\n*E\n"})
                /* renamed from: io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2 */
                public static final class C103372<T> implements FlowCollector {
                    public final /* synthetic */ ByteReadChannel $body$inlined;
                    public final /* synthetic */ Charset $charset$inlined;
                    public final /* synthetic */ FlowCollector $this_unsafeFlow;
                    public final /* synthetic */ TypeInfo $typeInfo$inlined;

                    /* compiled from: Emitters.kt */
                    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                    @DebugMetadata(m7119c = "io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2", m7120f = "ContentConverter.kt", m7121i = {}, m7122l = {224, 223}, m7123m = "emit", m7124n = {}, m7125s = {})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    /* renamed from: io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2$1, reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        public Object L$0;
                        public int label;
                        public /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C103372.this.emit(null, this);
                        }
                    }

                    public C103372(FlowCollector flowCollector, Charset charset, TypeInfo typeInfo, ByteReadChannel byteReadChannel) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$charset$inlined = charset;
                        this.$typeInfo$inlined = typeInfo;
                        this.$body$inlined = byteReadChannel;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        FlowCollector flowCollector;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector2 = this.$this_unsafeFlow;
                            Charset charset = this.$charset$inlined;
                            TypeInfo typeInfo = this.$typeInfo$inlined;
                            ByteReadChannel byteReadChannel = this.$body$inlined;
                            anonymousClass1.L$0 = flowCollector2;
                            anonymousClass1.label = 1;
                            Object objDeserialize = ((ContentConverter) obj).deserialize(charset, typeInfo, byteReadChannel, anonymousClass1);
                            if (objDeserialize == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj2 = objDeserialize;
                            flowCollector = flowCollector2;
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            }
                            FlowCollector flowCollector3 = (FlowCollector) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            flowCollector = flowCollector3;
                        }
                        anonymousClass1.L$0 = null;
                        anonymousClass1.label = 2;
                        if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation continuation2) {
                    Object objCollect = flowAsFlow.collect(new C103372(flowCollector, charset, typeInfo, byteReadChannel), continuation2);
                    return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            ContentConverterKt$deserialize$result$2 contentConverterKt$deserialize$result$2 = new ContentConverterKt$deserialize$result$2(byteReadChannel, null);
            c103381.L$0 = byteReadChannel;
            c103381.L$1 = typeInfo;
            c103381.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flow, contentConverterKt$deserialize$result$2, c103381);
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            typeInfo = (TypeInfo) c103381.L$1;
            byteReadChannel = (ByteReadChannel) c103381.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
        }
        if (objFirstOrNull != null) {
            return objFirstOrNull;
        }
        if (!byteReadChannel.isClosedForRead()) {
            return byteReadChannel;
        }
        KType kotlinType = typeInfo.getKotlinType();
        if (kotlinType != null && kotlinType.isMarkedNullable()) {
            return NullBody.INSTANCE;
        }
        throw new ContentConvertException("No suitable converter found for " + typeInfo, null, 2, null);
    }
}
