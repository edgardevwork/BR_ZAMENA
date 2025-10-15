package io.ktor.client.request.forms;

import androidx.media3.extractor.p007ts.H262Reader;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.WriterSessionKt;
import io.ktor.utils.p050io.charsets.CharsetJVMKt;
import io.ktor.utils.p050io.core.Buffer;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.Input;
import io.ktor.utils.p050io.core.InputArraysKt;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FormDataContent.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m7105d2 = {"RN_BYTES", "", "generateBoundary", "", "copyTo", "", "Lio/ktor/utils/io/core/Input;", "channel", "Lio/ktor/utils/io/ByteWriteChannel;", "(Lio/ktor/utils/io/core/Input;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFormDataContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormDataContent.kt\nio/ktor/client/request/forms/FormDataContentKt\n+ 2 WriterSession.kt\nio/ktor/utils/io/WriterSessionKt\n+ 3 Strings.kt\nio/ktor/utils/io/core/StringsKt\n*L\n1#1,172:1\n18#2,12:173\n7#3,4:185\n*S KotlinDebug\n*F\n+ 1 FormDataContent.kt\nio/ktor/client/request/forms/FormDataContentKt\n*L\n167#1:173,12\n14#1:185,4\n*E\n"})
/* loaded from: classes4.dex */
public final class FormDataContentKt {

    @NotNull
    public static final byte[] RN_BYTES;

    /* compiled from: FormDataContent.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.request.forms.FormDataContentKt", m7120f = "FormDataContent.kt", m7121i = {1, 1, 1, 2, 2}, m7122l = {162, 177, H262Reader.START_GROUP, H262Reader.START_GROUP}, m7123m = "copyTo", m7124n = {"$this$copyTo", "channel", "$this$write_u24default$iv", "$this$copyTo", "channel"}, m7125s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: io.ktor.client.request.forms.FormDataContentKt$copyTo$1 */
    /* loaded from: classes8.dex */
    public static final class C102771 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C102771(Continuation<? super C102771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FormDataContentKt.copyTo(null, null, this);
        }
    }

    public static final String generateBoundary() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            String string = Integer.toString(Random.INSTANCE.nextInt(), CharsKt__CharJVMKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
            sb.append(string);
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return StringsKt___StringsKt.take(string2, 70);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00d7 -> B:28:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(Input input, ByteWriteChannel byteWriteChannel, Continuation<? super Unit> continuation) throws Throwable {
        C102771 c102771;
        ByteWriteChannel byteWriteChannel2;
        Input input2;
        Object objRequestWriteBuffer;
        ByteWriteChannel byteWriteChannel3;
        Buffer empty;
        int iM15610readAvailableUAd2zVI;
        ByteBuffer memory;
        long writePosition;
        Input input3 = input;
        if (continuation instanceof C102771) {
            c102771 = (C102771) continuation;
            int i = c102771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c102771.label = i - Integer.MIN_VALUE;
            } else {
                c102771 = new C102771(continuation);
            }
        }
        Object obj = c102771.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c102771.label;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (input3 instanceof ByteReadPacket) {
                        c102771.label = 1;
                        if (byteWriteChannel.writePacket((ByteReadPacket) input3, c102771) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    byteWriteChannel2 = byteWriteChannel;
                    if (input3.getEndOfInput()) {
                    }
                } else {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i2 == 2) {
                        ByteWriteChannel byteWriteChannel4 = (ByteWriteChannel) c102771.L$2;
                        ByteWriteChannel byteWriteChannel5 = (ByteWriteChannel) c102771.L$1;
                        Input input4 = (Input) c102771.L$0;
                        ResultKt.throwOnFailure(obj);
                        input2 = input4;
                        byteWriteChannel2 = byteWriteChannel4;
                        byteWriteChannel3 = byteWriteChannel5;
                        objRequestWriteBuffer = obj;
                    } else {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) c102771.L$0;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        ByteWriteChannel byteWriteChannel6 = (ByteWriteChannel) c102771.L$1;
                        Input input5 = (Input) c102771.L$0;
                        ResultKt.throwOnFailure(obj);
                        byteWriteChannel2 = byteWriteChannel6;
                        input3 = input5;
                        if (input3.getEndOfInput()) {
                            return Unit.INSTANCE;
                        }
                        c102771.L$0 = input3;
                        c102771.L$1 = byteWriteChannel2;
                        c102771.L$2 = byteWriteChannel2;
                        c102771.label = 2;
                        objRequestWriteBuffer = WriterSessionKt.requestWriteBuffer(byteWriteChannel2, 1, c102771);
                        if (objRequestWriteBuffer == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        input2 = input3;
                        byteWriteChannel3 = byteWriteChannel2;
                    }
                }
                empty = (Buffer) objRequestWriteBuffer;
                if (empty == null) {
                    empty = Buffer.INSTANCE.getEmpty();
                }
                memory = empty.getMemory();
                writePosition = empty.getWritePosition();
                empty.commitWritten(iM15610readAvailableUAd2zVI);
                Integer numBoxInt = Boxing.boxInt(iM15610readAvailableUAd2zVI);
                c102771.L$0 = input2;
                c102771.L$1 = byteWriteChannel3;
                c102771.L$2 = numBoxInt;
                c102771.label = 3;
                if (WriterSessionKt.completeWriting(byteWriteChannel2, empty, iM15610readAvailableUAd2zVI, c102771) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteWriteChannel2 = byteWriteChannel3;
                input3 = input2;
                if (input3.getEndOfInput()) {
                }
            } catch (Throwable th2) {
                th = th2;
                iM15610readAvailableUAd2zVI = 0;
            }
        } catch (Throwable th3) {
            th = th3;
            c102771.L$0 = th;
            c102771.L$1 = null;
            c102771.L$2 = null;
            c102771.label = 4;
            if (WriterSessionKt.completeWriting(byteWriteChannel2, empty, iM15610readAvailableUAd2zVI, c102771) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw th;
        }
        iM15610readAvailableUAd2zVI = (int) InputArraysKt.m15610readAvailableUAd2zVI(input2, memory, writePosition, empty.getLimit() - writePosition);
    }

    static {
        byte[] bArrEncodeToByteArray;
        Charset charset = Charsets.UTF_8;
        if (Intrinsics.areEqual(charset, charset)) {
            bArrEncodeToByteArray = StringsKt__StringsJVMKt.encodeToByteArray("\r\n");
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrEncodeToByteArray = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, "\r\n", 0, 2);
        }
        RN_BYTES = bArrEncodeToByteArray;
    }
}
